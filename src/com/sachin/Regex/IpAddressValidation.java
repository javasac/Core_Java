package com.sachin.Regex;
import java.util.regex.*;

class IPAddressValidation
{
    public static boolean isValidIPAddress(String ip)
    {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        // Regex for a digit from 0 to 255 and
        // followed by a dot, repeat 4 times.
        // this is the regex to validate an IP address.
        String regex  = zeroTo255 + "\\." + zeroTo255 + "\\."
                + zeroTo255 + "\\." + zeroTo255;

        Pattern p = Pattern.compile(regex);

        if (ip == null)
        {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given IP address
        // and regular expression.
        Matcher m = p.matcher(ip);

        // Return if the IP address
        // matched the ReGex
        return m.matches();
    }

    // Driver code
    public static void main(String args[])
    {
        System.out.println("Test Case 1:");
        String str1 = "000.12.12.034";
        System.out.println("Input: " + str1);
        System.out.println(
                "Output: "
                        + isValidIPAddress(str1));

        // Test Case: 2
        System.out.println("\nTest Case 2:");
        String str2 = "121.234.12.12";
        System.out.println("Input: " + str2);
        System.out.println(
                "Output: "
                        + isValidIPAddress(str2));

        // Checking for False case.
        // Test Case: 3
        System.out.println("\nTest Case 3:");
        String str3 = "000.12.234.23.23";
        System.out.println("Input: " + str3);
        System.out.println(
                "Output: "
                        + isValidIPAddress(str3));

        // Test Case: 4
        System.out.println("\nTest Case 4:");
        String str4 = "I.Am.not.an.ip";
        System.out.println("Input: " + str4);
        System.out.println(
                "Output: "
                        + isValidIPAddress(str4));
    }
}