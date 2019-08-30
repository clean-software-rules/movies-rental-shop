public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    
    @Override
    public double getCharge(int daysRented) {
        return daysRented * THREE_$_EVERY_DAY;
    }
    
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > ONT_POINT ? TWO_POINT : ONT_POINT;
    }
}
