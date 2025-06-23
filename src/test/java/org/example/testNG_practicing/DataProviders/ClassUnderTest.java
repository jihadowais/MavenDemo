package org.example.testNG_practicing.DataProviders;

public class ClassUnderTest {
    /**
     * Takes three INTEGER numbers, ADD them, and return the summation of them.
     * @param a the first integer number
     * @param b the second integer number
     * @param c the Third integer number
     * @return the INTEGER summation of three INTEGER numbers.
     */
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    /**
     * Takes two INTEGER numbers ex. a & b, Subtract them, and return the positive result of the subtraction (|a-b|).
     * @param a the first integer number
     * @param b the second integer number
     * @return the positive INTEGER absolute of subtraction of the two INTEGER numbers.
     */
    public static int absolute(int a, int b) {
        return Math.abs(a-b);
    }

    /**
     * Takes two STRING values of first and last names for a person, and return his/hers full-name string.
     * @param firstName String person's first-name.
     * @param lastName String person's last-name.
     * @return a STRING of the person's full-name.
     */
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
