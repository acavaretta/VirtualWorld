/*
 * Name:      myclone.java
 * Course:    IT-511
 * Created:   March 29, 2015
 * Author:    A. J. Cavaretta
 * Purpose:   MyClone is a virtual world Java application, complete with an object that 
 * acts as a human clone.
 * Revisions: March 29th, 2015 - added in constructor, introduction, and made other changes.
 */
package myclone;

/**
 * @author A. Cavaretta
 */

// MyClone Class
public class myclone {
    
    // Declare Instance Variables
    private String firstName = "";                          // Stores the clone's first name
    private String lastName = "";                           // Stores the clone's last name
    private String emailAddress = "";                       // The clone's email address
    
    // Default constructor used to initialize class with default values
    public myclone()
    {
        this.setFirstName ("A.");
        this.setLastName ("Cavaretta");
        this.setEmailAddress("acavaretta@*****.edu");
    }
    
    // Overloaded constructor used to initialize class with non-default values
    public myclone(String myFirstName, String myLastName, String myEmail)
    {
        this.setFirstName (myFirstName);
        this.setLastName (myLastName);
        this.setEmailAddress(myEmail);
    }
    
    // Introduction Method Header
    // Outputs the introduction message to the screen
    public void introduction()
    {
        System.out.println("Hello, my name is "+this.getFirstName()+" "+this.getLastName()+". You can contact me via email at "+this.getEmailAddress()+".");
    }
    
    // getLastName Method Header
    // Returns the clone's last name
    public String getLastName()
    {
        return this.lastName;
    }
    
    // getFirstName Method Header
    // Returns the clone's first name
    public String getFirstName()
    {
        return this.firstName;
    }
    
    // getEmailAddress Method Header
    // Returns the clone's email address
    public String getEmailAddress()
    {
        return this.emailAddress;
    }
    
    // setLastName Method Header
    // Sets the clone's last name
    public void setLastName(String lastNameChg)
    {
        // Set the regular expression
        String regex = "[0-9]+";
        
        // Input validation: If the passed in string is not a number, allow the change. Otherwise, ignore it.
        if (lastNameChg.matches(regex)==false)
        {
            this.lastName = lastNameChg;
        }
    }
    
    // setFirstName Method Header
    // Sets the clone's first name
    public void setFirstName(String firstNameChg)
    {
        // Set the regular expression
        String regex = "[0-9]+";
        
        // Input validation: If the passed in string is not a number, allow the change. Otherwise, ignore it.
        if (firstNameChg.matches(regex)==false)
        {
            this.firstName = firstNameChg;
        }
    }
    
    // setEmailAddress Method Header
    // Sets the clone's email address
    public void setEmailAddress(String emailAddressChg)
    {
        // Declare variables
        boolean hasTheAtSymbol = false;
        
        // Input validation: See if the email address contains the at symbol
        if(emailAddressChg.indexOf("@")!=0)
        {
            hasTheAtSymbol = true;  
        }
        
        // Input validation: If the passed in string is a valid string and contains the at symbol, allow the change. Otherwise, ignore it.
        if (emailAddressChg == emailAddressChg.toString() && hasTheAtSymbol == true)
        {
            this.emailAddress = emailAddressChg;
        }
    }    
   
    
}
