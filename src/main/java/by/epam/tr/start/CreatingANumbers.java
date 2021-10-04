package by.epam.tr.start;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingANumbers {

    public static double countSumOfLargestAndSmallestNumbers(double[] array) {
        if (array.length < 1) {
            System.out.println("0, because you didn't enter numbers.");
            return 0;
        } else {
            Arrays.sort(array);
            double max = array[array.length - 1];
            double min = array[0];
            double sum = min + max;
            System.out.println(min + " + " + max + " = " + sum);
            return sum;
        }
    }

    public static double[] creatingArrayOfNumber(Scanner scanner) {
        System.out.println("How many numbers will you enter? ");
        int number = scanner.nextInt();
        boolean status = true;
        while (status) {
            if (number < 0) {
                System.out.println("Number cannot be negative, try again, please.");
                number = scanner.nextInt();
            } else {
                status = false;
            }
        }

        System.out.println("Ok, now enter numbers");
        double[] arrayOfNumbers = new double[number];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            while (!scanner.hasNextDouble()) {
                scanner.nextLine();
                System.out.print("It's not a number, try again, please.");
            }
            arrayOfNumbers[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
        return arrayOfNumbers;
    }
}
