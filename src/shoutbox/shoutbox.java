/*
 * Name:      shoutbox.java
 * Purpose:   This program demonstrates retrieving canned messages from an
 *              array using a method.
 * Created:   March 29th, 2015
 * Author:    A. J. Cavaretta
 * Revisions: April 5th, 2015 - added the shoutOutRandomMessage() method
 * Course:    IT-511
 */
package shoutbox;

// Imports
import java.util.Scanner;
import java.util.Random;

/**
 * ShoutBox Class Header
 * see the above header for more information about this class
 * @author A. J. Cavaretta
 */
public class shoutbox {

    /**
     * test_main Function Header
     * Tests the shoutOutCannedMessage and shoutOutRandomMessage methods
     * 
     * @param args the command line arguments
     */
    public static void test_main(String[] args) {
        
        // Call the shoutOutCannedMessage() method
        System.out.println("The canned message is: " + shoutOutCannedMessage());
        System.out.println("The random message is: " + shoutOutRandomMessage());
    }
    
    /**
     * shoutOutRandomMessage Function Header
     * This method generates a random message using data randomly selected from 
     *     five different arrays
     */
    public static String shoutOutRandomMessage()
    {
        // Declare constants
        final int MAX_WORDS = 10;      // The maximum number of words that may be stored in any of the arrays
        final String SPACE = " ";      // Space used for seperating words in sentence
        
        // Declare arrays
        String[] subjectArray = new String[MAX_WORDS];      // Array to hold the subjects to be randomly chosen
        String[] verbArray = new String[MAX_WORDS];         // Array to hold the verbs to be randomly chosen
        String[] adjectiveArray = new String[MAX_WORDS];    // Array to hold the adjectives to be randomly chosen
        String[] objectArray = new String[MAX_WORDS];       // Array to hold the objcets to be randomly chosen
        String[] adverbArray = new String[MAX_WORDS];       // Array to hold the adverbs to be randomly chosen
        
        // Put data into arrays
        adverbArray[0] = "believably";
        adverbArray[1] = "abnormally";
        adverbArray[2] = "begrudgingly";
        adverbArray[3] = "bewilderedly";
        adverbArray[4] = "absentmindedly";
        adverbArray[5] = "absolutely";
        adverbArray[6] = "abundantly";
        adverbArray[7] = "accidentally";
        adverbArray[8] = "accordingly";
        adverbArray[9] = "actively";
        verbArray[0] = "accepts";
        verbArray[1] = "aches";
        verbArray[2] = "acknowledges";
        verbArray[3] = "acts";
        verbArray[4] = "adds";
        verbArray[5] = "admires";
        verbArray[6] = "admits";
        verbArray[7] = "admonishes";
        verbArray[8] = "advises";
        verbArray[9] = "adopts";
        subjectArray[0] = "Joe";
        subjectArray[1] = "Bill";
        subjectArray[2] = "Dan";
        subjectArray[3] = "Steve";
        subjectArray[4] = "Andrew";
        subjectArray[5] = "Marcel";
        subjectArray[6] = "Greg";
        subjectArray[7] = "Rob";
        subjectArray[8] = "Justin";
        subjectArray[9] = "Craig";
        objectArray[0] = "dogs";
        objectArray[1] = "cats";
        objectArray[2] = "fish";
        objectArray[3] = "whales";
        objectArray[4] = "lions";
        objectArray[5] = "tigers";
        objectArray[6] = "bears";
        objectArray[7] = "seals";
        objectArray[8] = "stars";
        objectArray[9] = "lamps";
        adjectiveArray[0] = "abandoned";
        adjectiveArray[1] = "able";
        adjectiveArray[2] = "absolute";
        adjectiveArray[3] = "adorable";
        adjectiveArray[4] = "adventurous";
        adjectiveArray[5] = "academic";
        adjectiveArray[6] = "acceptable";
        adjectiveArray[7] = "acclaimed";
        adjectiveArray[8] = "accomplished";
        adjectiveArray[9] = "accurate";
        
        // Define new random objects
        Random randomSubject = new Random();
        Random randomVerb = new Random();
        Random randomAdjective = new Random();
        Random randomObject = new Random();
        Random randomAdverb = new Random();
        
        // Declare variables
        int lowRandom = 0;              // Lowest number that will be randomly generated
        int highRandom = MAX_WORDS;     // Highest number that will be randomly generated
        String message;                 // String to hold the message to be returned
        
        // Generate five random numbers between 0 and 10 to be used to get random words from each of the arrays
        int randomWordIndexSubject = randomSubject.nextInt(highRandom-lowRandom) + lowRandom;
        int randomWordIndexVerb = randomVerb.nextInt(highRandom-lowRandom) + lowRandom;
        int randomWordIndexAdjcetive = randomAdjective.nextInt(highRandom-lowRandom) + lowRandom;
        int randomWordIndexObject = randomObject.nextInt(highRandom-lowRandom) + lowRandom;
        int randomWordIndexAdverb = randomAdverb.nextInt(highRandom-lowRandom) + lowRandom;
        
        // Generate the random message
        message = subjectArray[randomWordIndexSubject] + SPACE + verbArray[randomWordIndexVerb] + SPACE + adjectiveArray[randomWordIndexAdjcetive] + SPACE + objectArray[randomWordIndexObject] + SPACE + adverbArray[randomWordIndexAdverb] + ".";
                   
        // Return the random message
        return message;
    }
    
    
    // shoutOutCannedMessage() Method Header
    // This method retrieves a canned messages from an
    //           array using a method.
    public static String shoutOutCannedMessage()
    {
        // Declare constants
        final int MAX_MESSAGES = 10;      // The maximum number of messages that may be stored in the array
        
        // Declare variables
        String[] messageArray = new String[MAX_MESSAGES];
        int messageCounter = 0;
        int messageChosenIndex = 0;
        
        // Scanner
        Scanner in = new Scanner(System.in);    // Scanner used to obtain string vaues from user
        
        // Put canned data into array
        messageArray[0] = "I need Java!";
        messageArray[1] = "Cats love Java the drink!";
        messageArray[2] = "Birds love Java the drink!";
        messageArray[3] = "Fish love Java the drink!";
        messageArray[4] = "Squid love Java the drink!";
        messageArray[5] = "Snakes love Java the programming language!";
        messageArray[6] = "Dolphins love Java the programming language!";
        messageArray[7] = "Spiders love Java the programming language!";
        messageArray[8] = "Wolves love Java the programming language!";
        messageArray[9] = "Owls love Java the programming language!";
        
        // Tell the user that they'll need to select one of the above messages
        System.out.println("Please choose one of the following messages: ");
        
        // Print all messages stored within the array
        while(messageCounter < MAX_MESSAGES)
        {
            System.out.println(messageCounter + ".) " + messageArray[messageCounter]);
            
            // Increment the counter
            messageCounter++;
        }
        
        // Wait for the user to choose a message to send back to the main method
        System.out.println("Please enter in the number of the message yout want to select: ");
        messageChosenIndex = in.nextInt();
        while(messageChosenIndex<=-1 || messageChosenIndex >= MAX_MESSAGES)
        {
            System.out.println("Error! Please choose a number between 0 and "+(MAX_MESSAGES-1));
            messageChosenIndex = in.nextInt();           
        }
        
        // Return the message that the user chose
        return messageArray[messageChosenIndex];
    }
    
}
