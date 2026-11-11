package com.example;

public class Triangle {

    /**
     * Checks if three given side lengths form an equilateral triangle.
     * All three sides must be positive and equal in length.
     */
    public static boolean isEquilateral(double side1, double side2, double side3) {
        // Validation: side lengths must be strictly greater than 0
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        // An equilateral triangle has all three sides equal
        return (side1 == side2) && (side2 == side3);
    }

    public static void main(String[] args) {
        double side1 = 5.0;
        double side2 = 5.0;
        double side3 = 5.0;

        // Accept sides from command line arguments if passed
        if (args.length == 3) {
            try {
                side1 = Double.parseDouble(args[0]);
                side2 = Double.parseDouble(args[1]);
                side3 = Double.parseDouble(args[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid numeric input. Using default values (5.0, 5.0, 5.0).");
            }
        }

        System.out.println("Testing sides: " + side1 + ", " + side2 + ", " + side3);

        if (isEquilateral(side1, side2, side3)) {
            System.out.println("Result: It IS an Equilateral Triangle.");
        } else {
            System.out.println("Result: It is NOT an Equilateral Triangle.");
        }
    }
}