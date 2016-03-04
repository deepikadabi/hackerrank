package com.savzorous.hackerrank.java.intro;

import java.util.Scanner;
/*

"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
Input Format

Two strings, the first being A and the second being B. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically larger than B or No if it is not.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input

 hello
 java
Sample Output

9
No
Hello Java
Explanation

String A is "hello" and B is "java".
A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore, A is not larger than B and the answer is NO.
When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".
*/

public class StringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sumOfStrings = A.length() + B.length();
        System.out.println(sumOfStrings);
        if (A.compareTo(B) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
                B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
