package by.epam.tr.start;
import java.util.Scanner;

import static by.epam.tr.start.CreatingANumbers.countSumOfLargestAndSmallestNumbers;
import static by.epam.tr.start.CreatingANumbers.creatingArrayOfNumber;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countSumOfLargestAndSmallestNumbers(creatingArrayOfNumber(scanner));
    }

}
