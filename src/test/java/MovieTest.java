import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    
    @Test
    public void should_return_regular_price_when_price_code_is_0 () {
        Movie movie = new Movie("Test", 0);
        
        Price price = movie.getPrice();
        assertEquals(true, price instanceof RegularPrice);
    }
    
    @Test
    public void should_return_children_price_when_price_code_is_2 () {
        Movie movie = new Movie("Test", 2);
        
        Price price = movie.getPrice();
        assertEquals(true, price instanceof ChildrenPrice);
    }
    
    @Test
    public void should_return_new_release_price_when_price_code_is_1 () {
        Movie movie = new Movie("Test", 1);
        
        Price price = movie.getPrice();
        assertEquals(true, price instanceof NewReleasePrice);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void should_return_new_illegal_argument_exception_when_price_code_is_3 () {
        Movie movie = new Movie("Test", 3);
    }
}