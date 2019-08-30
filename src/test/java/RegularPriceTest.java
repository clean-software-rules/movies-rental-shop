import org.junit.Test;

import static org.junit.Assert.*;

public class RegularPriceTest {
    RegularPrice regularPrice = new RegularPrice();
    
    @Test
    public void should_return_2_when_rental_days_2() {
        double result = regularPrice.getCharge(2);
        
        assertEquals(result, 2, 0);
    }
    
    @Test
    public void should_return_5_when_rental_days_4() {
        double result = regularPrice.getCharge(4);
        
        assertEquals(result, 5, 0);
    }
    
    
}