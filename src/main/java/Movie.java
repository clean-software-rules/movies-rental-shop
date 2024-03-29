public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
    private Price _price;
    
    public Movie(String title, int priceCode) {
        _title = title;
        setPrice(priceCode);
    }
    
    public void setPrice(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
                default:
                    throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    
    public Price getPrice() {
        return _price;
    }
    
    public String getTitle() {
        return _title;
    }
    
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    
    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }
}