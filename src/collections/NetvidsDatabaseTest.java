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
public class NetvidsDatabaseTest
    extends TestCase
{
    //~ Fields ................................................................
    private NetvidsDatabase db;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    /**
     * Sets up the each of the test methods.
     */
    public void setUp()
    {
        db = new NetvidsDatabase();
        movie1 = new Movie("Spiderman");
        movie2 = new Movie("Lion King");
        movie3 = new Movie(null);
    }
    
    /**
     * tests the addMoive method
     */
    public void testAddMovie()
    {
        // 1. Set up initial conditions
        
        // 2. Call the method(s) you are testing

        // 3. Make assertions capturing your expected outcomes
        assertTrue(db.addMovie(movie1));
        assertEquals(1, db.size());
        assertFalse(db.addMovie(movie1));
        assertTrue(db.addMovie(movie2));
        assertFalse(db.addMovie(movie2));
        assertFalse(db.addMovie(movie1));
    }
    
    /**
     * tests the remove() method
     */
    public void testRemove()
    {
        // 1. Set up initial conditions
        
        // 2. Call the method(s) you are testing
        db.addMovie(movie1);
        db.addMovie(movie2);
        assertEquals(2, db.size());

        // 3. Make assertions capturing your expected outcomes
        assertEquals(movie1, db.remove(movie1));
        assertFalse(db.contains(movie1));
        assertEquals(1, db.size());
        db.addMovie(movie3);
        db.remove(movie3);
    }
    
    /**
     * tests the capacity() method
     */
    public void testIsEmpty()
    {
        // 1. Set up initial conditions
        
        // 2. Call the method(s) you are testing
        
        // 3. Make assertions capturing your expected outcomes
        assertTrue(db.isEmpty());
        assertEquals(0, db.size());
    }
    
    /**
     * tests the capacity() method
     */
    public void testCapacity()
    {
        // 1. Set up initial conditions
        assertEquals(10, db.capacity());
        
        // 2. Call the method(s) you are testing
        for (int i = 0; i < 20; i++)
        {
            db.addMovie(new Movie("Movie " + i));
        }
        // 3. Make assertions capturing your expected outcomes
        assertEquals(20, db.size());
        assertTrue(db.capacity() >= 20);
    }
}
