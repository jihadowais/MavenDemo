package org.example.testNG_practicing.Assertions;

/**
 * <b>Dummy Testing Class</b> just used in practicing Testing...
 * <br><b>NOTE:</b> The methods are <b>static</b> to easily use them in testing without the need of creating an object.
 */
public class ClassUnderTest {

    /**
     * Takes two INTEGER numbers, ADD them, and return the summation of them.
     * @param a the first integer number
     * @param b the second integer number
     * @return the INTEGER summation of two INTEGER numbers.
     */
    public static int sum(int a, int b) {
        return a+b;
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

    /**
     * @return a fixed array of INTEGER numbers.
     */
    public static int[] getSampleArray() {
        return new int[]{1, 2, 3, 4};
    }
}
