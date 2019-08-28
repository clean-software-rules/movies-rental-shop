public class Rental {
    private Movie _movie;
    private int _daysRented;
    
    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public int getFrequentRenterPoints() {
        return getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1 ? 2 : 1;
    }
    
    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }
}