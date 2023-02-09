/**
 * @Class: BMI
 * @Date: 07 February 2023
 * @Version: 1.0
 * @Author: Maurice Rivers
 * @description: calculate BMI based on weight and height
 */


import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("How much do you weigh in LBS: ");
        double WeightLBS = Input.nextDouble();
        System.out.println("How tall are you in inches: ");
        double HeightInches = Input.nextDouble();

        double WeightKGS = WeightLBS * 0.4536;
        double HeightMeters = HeightInches * 0.0254;

        double BMI = (WeightKGS / HeightMeters) * (WeightKGS / HeightMeters);
        //BMI = Weight(kilograms)/(height(meters))2

        System.out.println("Your BMI is " + BMI);
    }
}
