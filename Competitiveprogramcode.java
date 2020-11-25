//This package com.company line is only for Intellij Idea Users
package com.company;
// imported packages required for user input:-
import java.util.*;
import java.io.*;

//basic code for competitive programming:-

public class Competitiveprogramcode {
    public static void main (String[]args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));   //configuring Scanner for user input
        int t = in.nextInt();     // user will enter the input for the number of test cases
        for (int i = 1; i <= t; ++i){    // loop for test cases, each test case contains two numbers, i is used to count the number of test cases, i will stop the code after the designated number of test cases the user enters
           int n1 = in.nextInt(); // user will enter number 1 of a test case
            int n2 = in.nextInt(); // user will enter number 2 of a test case
            System.out.println("Case #" + i + ": " + (n1 + n2) + " " + (n1 * n2)); // this line will print the output of a test case, here the output of test cases is number 1 + number 2 and number 1 * number 2
        }
    }
}
