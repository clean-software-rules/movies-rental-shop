public class ChildrenPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
    
    @Override
    public double getCharge(int daysRented) {
        double result = ONE_POINT_FIVE_$;
        if (daysRented > THREE_DAYS) {
            result += (daysRented - THREE_DAYS) * ONE_POINT_FIVE_$_EVERT_DAY;
        }
        return result;
    }
}
