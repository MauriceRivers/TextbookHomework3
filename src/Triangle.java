/**
 * @Class: Triangle
 * @Date: 07 February 2023
 * @Version: 1.0
 * @Author: Maurice Rivers
 * @description: Calculate the perimeter of a triangle,
 * and test if the inputs are Valid or Invalid,
 * if The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.println("Length of First edge of triangle: ");
        double Edge1 = Input.nextDouble();
        System.out.println("Length of Second edge of triangle: ");
        double Edge2 = Input.nextDouble();
        System.out.println("Length of Third edge of triangle: ");
        double Edge3 = Input.nextDouble();


        double perimeter = Edge1 + Edge2 + Edge3;
        System.out.println("The perimeter of the triangle is: " + perimeter);

        if (Edge1 + Edge2 > Edge3 && Edge1 + Edge3 > Edge2 && Edge2 + Edge3 > Edge1)
            System.out.println("The input is Valid!");
        //The input is valid if the sum of every pair of
            // two edges is greater than the remaining edge.
        else
            System.out.println("The input is invalid!");



    }
}
