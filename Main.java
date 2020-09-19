/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPrime;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author killermike
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long startTime = System.nanoTime(); //initialise a variable called startTime and store the current time
        long endTime;                       //initialise a variable called endTime to store the time when we've finished
        final int numberLimit = 10000;        //the highest number to be tests
        List arrayResults = new ArrayList();    //create an arraylist to store all of the primes

        boolean prime = false;  //set a boolean variable to false

        for (int i = 1; i < numberLimit; i++) {     //Begin outer for loop that will repeat numberLimit number of times
            prime = true;                           //set variable prime to true
            for (int j = 2; j < (i - 1); j++) {     //Begin outer loop
                if (i % j == 0) {           //test to see if i divided by j has no remainder
                    prime = false;          //if so, set variable prime to false;
                    break;                  //break out of loop as there is no point in continuing to test this number
                }
            }
            if (prime == true) {            //did previous test find out that the number is a prime?
                arrayResults.add(i);        //if so, add the number to the list arrayResults
                System.out.println("Number " + i + " is a prime");  //print out that the current number is prime
            }
        }
        endTime = System.nanoTime();        //set the variable endTime to the current time
        System.out.println("Total time: " + ((endTime - startTime) / 100)); //calculate and print out the difference between the start and end times
        System.out.println("List of prime numbers between 1 and "+numberLimit); //print out range that has been examined
        for (int i = 0; i < arrayResults.size(); i++) {     //begin a for loop
            System.out.print(arrayResults.get(i) + " ");    //print out current prime
        }

    }

}
