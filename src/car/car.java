/*
 * Name:      car.java
 * Course:    IT-511
 * Created:   March 29th, 2015
 * Author:    A. J. Cavaretta
 * Purpose:   The additional class for Milestone Three.
 * Revisions: none
 */
package car;

/* Car Class Header
 * See the file header above for more information
 * @author A. Cavaretta
 */
public class car {

    // Declare Instance Variables
    private String make = "";         // Stores the car's make
    private String model = "";        // Stores the car's model
    
    // Default Contructor Method Header
    // creates the object with default values
    public void car()
    {
        this.setMake ("Chevy");
        this.setModel ("Corvette");
    }   
    
    // Overloaded Contructor Method Header
    // creates the object with non-default values  
    public void car(String[] args, String myMake, String myModel)
    {
        this.setMake (myMake);
        this.setModel (myModel);
    }   
    
    // revTheEngine Method Header
    // Returns a string that sounds like revving the car's engine
    public String revTheEngine()
    {
        return "Vroom!! Vroom!!!!";
    }   
    
    // introduction Method Header
    // Returns a string that contains the car's make and model
    public String introduction()
    {
        return "My clone's car is a " + this.getMake() + " " + this.getModel() + ".";
    }   
    
    // getMake Method Header 
    // Gets the car's make
    public String getMake()
    {
        return this.make;
    }
    
    // getModel Method header
    // Gets the car's model
    public String getModel()
    {
        return this.model;
    }
    
    // setMake Method Header
    // Sets the car's make
    public void setMake(String newMake)
    {
        // Set the regular expression
        String regex = "[0-9]+";
        
        // Input validation: If the passed in string is not a number, allow the change. Otherwise, ignore it.
        if (newMake.matches(regex)==false)
        {
            this.make = newMake;
        }
    }
 
    // setModel Method Header
    // Sets the car's model
    public void setModel(String newModel)
    {
        // Set the regular expression
        String regex = "[0-9]+";
        
        // Input validation: If the passed in string is not a number, allow the change. Otherwise, ignore it.
        if (newModel.matches(regex)==false)
        {
            this.model = newModel;
        }
    }
    
    
    
}
