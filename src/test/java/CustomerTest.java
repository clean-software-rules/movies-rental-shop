import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    
    @Before
    public void setUp() {
        customer = new Customer("Arthur Dent");
    }
    
    @Test
    public void should_return_print_str_for_regular_movie_when_one_day() {
        customer.addRental(generateRental("Killer Klowns from Outer Space", Movie.REGULAR, 1));
        
        String expected = "Rental Record for Arthur Dent\n" +
                "\tKiller Klowns from Outer Space\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }
    
    @Test
    public void should_return_print_str_for_new_release_movie_when_one_day() {
        customer.addRental(generateRental("Awesome New Release", Movie.NEW_RELEASE, 1));
        
        String expected = "Rental Record for Arthur Dent\n" +
                "\tAwesome New Release\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }
    
    @Test
    public void should_return_print_str_for_children_movie_when_one_day() {
        customer.addRental(generateRental("Cars", Movie.CHILDRENS, 1));
        
        String expected = "Rental Record for Arthur Dent\n" +
                "\tCars\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }
    
    @Test
    public void should_return_print_str_for_children_movie_when_four_days() {
        customer.addRental(generateRental("Cars", Movie.CHILDRENS, 4));
        
        String expected = "Rental Record for Arthur Dent\n" +
                "\tCars\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }
    
    @Test
    public void should_return_print_str_for_regular_movie_when_three_days() {
        customer.addRental(generateRental("Killer Klowns from Outer Space", Movie.REGULAR, 3));
        
        String expected = "Rental Record for Arthur Dent\n" +
                "\tKiller Klowns from Outer Space\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }
    
    @Test
    public void should_return_print_str_for_new_release_movie_when_two_days() {
        customer.addRental(generateRental("Awesome New Release", Movie.NEW_RELEASE, 2));
        
        String expected = "Rental Record for Arthur Dent\n" +
                "\tAwesome New Release\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";
        assertEquals(expected, customer.statement());
    }
    
    @Test
    public void should_return_print_str_for_rent_one_of_each_type_when_four_days() {
        int daysRented = 4;
        customer.addRental(generateRental("Killer Klowns from Outer Space", Movie.REGULAR, daysRented));
        customer.addRental(generateRental("Awesome New Release", Movie.NEW_RELEASE, daysRented));
        customer.addRental(generateRental("Cars", Movie.CHILDRENS, daysRented));
        
        String expected = "Rental Record for Arthur Dent\n" +
                "\tKiller Klowns from Outer Space\t5.0\n" +
                "\tAwesome New Release\t12.0\n" +
                "\tCars\t3.0\n" +
                "Amount owed is 20.0\n" +
                "You earned 4 frequent renter points";
        assertEquals(expected, customer.statement());
    }
    
    private Rental generateRental(String title, int priceCode, int daysRented) {
        Movie movie = new Movie(title, priceCode);
        return new Rental(movie, daysRented);
    }
    
}