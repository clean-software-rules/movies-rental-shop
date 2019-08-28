import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    
    public Customer(String name) {
        _name = name;
    }
    
    public String statement() {
        return headerPrintStr() + moviesPrintStr() + footerPrintStr();
    }
    
    public String getName() {
        return _name;
    }
    
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    
    private String moviesPrintStr() {
        String result = "";
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
    
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        return result;
    }
    
    private String headerPrintStr() {
        return "Rental Record for " + getName() + "\n";
    }
    
    private String footerPrintStr() {
        return "Amount owed is " + String.valueOf(getTotalCharge()) + "\n" + "You earned " +
                String.valueOf(getTotalFrequentEnterPoints()) +
                " frequent renter points";
    }
    
    
    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += rental.getCharge();
        }
        return result;
    }
    
    private int getTotalFrequentEnterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }
}