public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
    
    @Override
    public double getCharge(int daysRented) {
        double result = TWO_$;
        if (daysRented > TWO_DAYS) {
            result += (daysRented - TWO_DAYS) * ONE_POINT_FIVE_$_EVERT_DAY;
        }
        return result;
    }
}
