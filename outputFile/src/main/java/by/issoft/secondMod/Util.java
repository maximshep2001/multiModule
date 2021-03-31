package by.issoft.secondMod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    static int binarySearch(int searchNumber, int[] array, int start, int end){

        int middle = (start + end)/2;

        if(end < start){
            return -1;
        }

        try {
            if (searchNumber < array[middle]) {
                return binarySearch(searchNumber, array, start, middle - 1);
            }

            if (searchNumber > array[middle]) {
                return binarySearch(searchNumber, array, middle + 1, end);
            }

            if (searchNumber == array[middle]) {
                return middle;
            }
        } catch (IllegalArgumentException e){
            logger.error("Incorrect number.");
        }

        return -1;
    }

}
