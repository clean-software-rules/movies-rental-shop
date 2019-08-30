import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleasePriceTest {
    NewReleasePrice newReleasePrice = new NewReleasePrice();
    
    @Test
    public void should_return_6_when_rental_days_2() {
        double result = newReleasePrice.getCharge(2);
    
        assertEquals(6, result, 0);
    }
    
}