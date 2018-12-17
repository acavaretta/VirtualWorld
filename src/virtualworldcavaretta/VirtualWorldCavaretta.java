/*
 * Name:      VirtualWorldCavaretta.Java
 * Purpose:   This program demonstrates a virtual world. Tests the MyClone class
 *            shoutbox, as well as the car class. This class tests the getters, 
 *            setters, and other methods.
 * Created:   April 12th, 2015
 * Author:    A. J. Cavaretta
 * Revisions: none
 * Course:    IT-511
 */
package virtualworldcavaretta;

// Import the myclone, car, and shoutbox classes
import myclone.myclone;
import car.car;
import shoutbox.shoutbox;

/**
 * VirtualWorldCavaretta Class Header
 * See the file header for information about this class
 * @author A J Cavaretta
 */
public class VirtualWorldCavaretta {
    /* Name:      Main function Header
     * Purpose:   Tests the myclone, shoutbox, and car classes
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test the MyClone class
        myclone clone1 = new myclone();                                         // Create New MyClone Object
        System.out.println("********* Testing the myclone class *********");    // Let the user know that we're testing the myclone class
        System.out.println("First Name: " + clone1.getFirstName());             // Test Getter for First Name, and test if Contructor worked properly
        System.out.println("Last Name: " + clone1.getLastName());               // Test Getter for Last Name, and test if Contructor worked properly
        System.out.println("Email Address: " + clone1.getEmailAddress());       // Test Getter for Email Address, and test if Contructor worked properly
        clone1.introduction();                                                  // Test Introduction Method
        clone1.setFirstName("A");                                               // Test Setter for First Name
        clone1.setLastName("C");                                                // Test Setter for Last Name
        clone1.setEmailAddress("acavaretta@*****.com");                         // Test Setter for Email Address
        clone1.introduction();                                                  // Test Introduction Method
        
        // Test the car class
        System.out.println("");
        System.out.println("********* Testing the car class *********");        // Let the user know that we're testing the car class
        car car1 = new car();                                                   // Create new car object
        car1.setMake("Chevrolet");                                              // Test setter for the Make
        car1.setModel("Camaro");                                                // Test getter for the Model
        System.out.println(car1.introduction());                                // Test introduction method
        System.out.println(car1.revTheEngine());                                // Test revTheEngine method        
        
        // Test the shoutbox class
        shoutbox myshoutbox1 = new shoutbox();                                  // Create new shoutbox object
        System.out.println("");
        System.out.println("********* Testing the shoutbox class *********");   // Let the user know that we're testing the shoutbox class
        System.out.println("The canned message is: " + myshoutbox1.shoutOutCannedMessage()); // Test the shoutOutCannedMessage method
        System.out.println("The random message is: " + myshoutbox1.shoutOutRandomMessage()); // Test the shoutOutRandomMessage method
        
    }
    
}
