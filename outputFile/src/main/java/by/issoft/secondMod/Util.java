package by.issoft.secondMod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {

    private static final Logger logger = LoggerFactory.getLogger(Util.class);

    public static int binarySearch(int searchNumber, int[] array, int start, int end) {
        logger.debug("Find the middle element.");
        int middle = (start + end) / 2;
        logger.debug("Checking an array.");
        if (end < start) {
            logger.error("Array boundaries are specified incorrectly.");
            return -1;
        }
        logger.debug("Checking whether the element on the left side of the array is from the middle or not.");
        if (searchNumber < array[middle]) {
            logger.debug("The element on the left side of the array from the middle.");
                return binarySearch(searchNumber, array, start, middle - 1);
            }
        logger.debug("Checking whether the element on the right side of the array is from the middle or not.");
        if (searchNumber > array[middle]) {
            logger.debug("The element on the right side of the array from the middle.");
            return binarySearch(searchNumber, array, middle + 1, end);
        }
        logger.debug("Checking if a search element is equal to a found element.");
        if (searchNumber == array[middle]) {
            logger.debug("The search element is equal to a found element.");
            return middle;
        }
        return -1;
    }

}
