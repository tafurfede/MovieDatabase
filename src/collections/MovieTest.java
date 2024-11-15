package collections;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author federicotafur
 *  @version Jan 30, 2024
 */
public class MovieTest
    extends TestCase
{
    //~ Fields ................................................................
    private Movie movie;
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    /**
     * this method serves as the setup for all the testing method that will be
     * conducted throughout the class
     */
    public void setUp()
    {
        movie = new Movie("Transformers");
        movie.setGenre("Action");
        movie.setYear(2002);
        movie.setRating(4);
    }
    
    /**
     * this method tests the getTitle() method
     */
    public void testGetTitle()
    {
        // 1. Set up initial conditions

        // 2. Call the method(s) you are testing

        // 3. Make assertions capturing your expected outcomes
        assertEquals("Transformers", movie.getTitle());

    }
    
    /**
     * this method tests the getGenre() method
     */
    public void testGetGenre()
    {
        // 1. Set up initial conditions
        
        // 2. Call the method(s) you are testing

        // 3. Make assertions capturing your expected outcomes
        assertEquals("Action", movie.getGenre());

        // 1. Set up initial conditions
        movie.setGenre("Romance");

        // 2. Call the method(s) you are testing

        // 3. Make assertions capturing your expected outcomes
        assertEquals("Romance", movie.getGenre());
    }
    
    /**
     * this method tests the getRating() method
     */
    public void getRating()
    {
        // 1. Set up initial conditions
        
        // 2. Call the method(s) you are testing

        // 3. Make assertions capturing your expected outcomes
        assertEquals(4, movie.getRating());

        // 1. Set up initial conditions
        
        // 2. Call the method(s) you are testing
        movie.setRating(5);

        // 3. Make assertions capturing your expected outcomes
        assertEquals(5, movie.getRating());

    }
    
    /**
     * this method tests the getYear() method
     */
    public void testGetYear()
    {
        // 1. Set up initial conditions
        
        // 2. Call the method(s) you are testing

        // 3. Make assertions capturing your expected outcomes
        assertEquals(2002, movie.getYear());

        // 1. Set up initial conditions

        // 2. Call the method(s) you are testing
        movie.setYear(2016);

        // 3. Make assertions capturing your expected outcomes
        assertEquals(2016, movie.getYear());

    }
    
    /**
     * this method tests the equals() method
     */
    @SuppressWarnings("unlikely-arg-type")
    public void testEquals()
    {
        // 1. Set up initial conditions
        Movie movie2 = new Movie("Transformers");
        
        // 2. Call the method(s) you are testing

        // 3. Make assertions capturing your expected outcomes
        assertTrue(movie.equals(movie2));
        movie2.setTitle("Ironman");
        assertFalse(movie.getTitle().equals(movie2.getTitle()));
        movie.setTitle("Transformers");
        assertTrue(movie.equals(movie));
        assertTrue(movie2.equals(movie2));
        assertFalse(movie.equals(null));
        String otherObject = "not a movie";
        assertFalse(movie.equals(otherObject));


    }
}
