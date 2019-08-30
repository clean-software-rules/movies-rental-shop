public abstract class Price {
    protected static int ONE_DAY = 1;
    protected static int TWO_DAYS = 2;
    protected static int THREE_DAYS = 3;
    protected static int ONT_POINT = 1;
    protected static int TWO_POINT = 2;
    protected static double ONE_POINT_FIVE_$ = 1.5;
    protected static double TWO_$ = 2;
    protected static double THREE_$_EVERY_DAY = 3;
    protected static double ONE_POINT_FIVE_$_EVERT_DAY = 1.5;
    
    public abstract int getPriceCode();
    
    public abstract double getCharge(int daysRented);
    
    public int getFrequentRenterPoints(int daysRented) {
        return ONT_POINT;
    }
}
