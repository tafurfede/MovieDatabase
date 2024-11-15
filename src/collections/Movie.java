package collections;
// -------------------------------------------------------------------------
/**
 *  This class is where the creation of the movies will be passed on, this will
 *  be done with a constructor method passing on the parameter of title.
 * 
 *  @author federicotafur
 *  @version Jan 30, 2024
 */
public class Movie
    extends MovieADT
{
    //~ Fields ................................................................

    //~ Constructors ..........................................................
    /**
     * This method serves as the constructor for the Movie Class, passing on the
     * title parameter using in the class.
     * 
     * @param title is the parameter used throughout the class
     */
    public Movie(String title)
    {
        super(title);
    }
    
    //~Public  Methods ........................................................
}
