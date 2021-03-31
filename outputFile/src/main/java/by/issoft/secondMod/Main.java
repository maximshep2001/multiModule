/*
package by.issoft.secondMod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.debug("The program starts.");

        logger.debug("Creating an array.");
        int[] array = { 2, 3, 4, 10, 40, 50 };
        logger.debug("Array is created.");
        int amountElements = array.length;
        int searchNumber = 10;

        logger.debug("Start recursive binary search.");
        int result = Util.binarySearch(searchNumber, array, 0, amountElements-1);
        logger.debug("Recursive binary search is over.");
        if (result == -1)
            logger.debug("Element not present.");
        else
            logger.debug("Result: element found at index " + result+".");
        logger.debug("The end of the program.");

    }

}*/
