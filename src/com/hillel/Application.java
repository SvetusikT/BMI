package com.hillel;

//import com.hillel.calculator.CalculatorBMI;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        Float weight = ReadWeight(0f, 300f);
        Float height = ReadHeight(1f, 300f);
        CalculatorBMI calculator = new CalculatorBMI();
        Double BMI = calculator.BMI(weight, height);
        System.out.println("Your BMI is " + BMI);
        calculator.printResult (BMI);

    }


    public static float ReadWeight(float minWeight, float maxWeight)
    {
        if (minWeight < 0 || minWeight > maxWeight) {
            throw new NumberFormatException("minWeight or maxWeight is not valid");
        }
        Float weight = 0.0f;
        do {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a string value for weight: ");
                String str = sc.next();
                weight = new Float(str);
                if(weight < minWeight || weight > maxWeight){
                    System.out.println("Value is not valid");
                    weight = 0f;
                    throw new NumberFormatException("Value must be greater than zero");
                }

                System.out.println("Value of the variable: " + weight);
            }
            catch (NumberFormatException ex) {
                System.out.println("Given String is not parsable to double");
            }}
        while(weight <= 0);

        return weight;
    }

    public static float ReadHeight(float minHeight, float maxHeight)
    {
        if (minHeight < 0 || minHeight > maxHeight) {
            throw new NumberFormatException("minHeight or maxHeight is not valid");
        }
        Float height = 0.0f;
        do {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a string value for height: ");
                String str = sc.next();
                height = new Float(str);
                if(height < minHeight || height > maxHeight){
                    System.out.println("Value is not valid");
                    height = 0f;
                    throw new NumberFormatException("Value must be greater than zero");
                }

                System.out.println("Value of the variable: " + height);
            }
            catch (NumberFormatException ex) {
                System.out.println("Given String is not parsable to double");
            }}
        while(height <= 0);

        return height;
    }


}
class CalculatorBMI {
    public double BMI(double weight, double height) {
        double BMI = (weight/Math.pow(height, 2))*10000.0;
        return Math.round (BMI*100.0)/100.0;
    }
    public void printResult(double BMI) {
        if (BMI >= 0 && BMI < 18.5) {
            System.out.println("Underweight");
        }
        if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal");
        }
        if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight");
        }
        if (BMI >= 30) {
            System.out.println("Obesity");
        }
    }
}
