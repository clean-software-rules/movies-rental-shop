import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleasePriceTest {
    NewReleasePrice newReleasePrice = new NewReleasePrice();
    
    @Test
    public void should_return_6_when_rental_days_2() {
        double result = newReleasePrice.getCharge(2);
    
        assertEquals(6, result, 0);
    }
    
    @Test
    public void should_return_2_points_when_rental_days_2() {
        int result = newReleasePrice.getFrequentRenterPoints(2);
        
        assertEquals(result, 2);
    }
    
}