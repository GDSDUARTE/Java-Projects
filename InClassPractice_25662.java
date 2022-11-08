/*
* CA1: Object-Oriented Programming
* Name: Guilherme Duarte da Silva
* Email: 25662@student.dorset-college.ie
* ID: 25662
*
* Task: 
* Create a calculator, include function +, -, /, *, and mod.
* Dynamic initializes a two-dimension array, and print out all value
* Using example to show the concept of inheritance
* Using example to show the concept of override or overload
*/

package Year2;

import java.util.Scanner;

class Calculator {
    void result(Double numbers, Double numbers2) {
        System.out.println("\nThe result is: ");
    }
}

class Sum extends Calculator {
    void result(Double numbers, Double numbers2) {
        Double sum = numbers + numbers2;
        System.out.println("Sum of two numbers is: " + sum);
    }
}

class Sub extends Calculator {
    void result(Double numbers, Double numbers2) {
        Double sub = numbers - numbers2;
        System.out.println("Subtraction of two numbers is: " + sub);
    }
}

class Mul extends Calculator {
    void result(Double numbers, Double numbers2) {
        Double mul = numbers * numbers2;
        System.out.println("Multiplication of two numbers is: " + mul);
    }
}

class Div extends Calculator {
    void result(Double numbers, Double numbers2) {
        Double div = numbers / numbers2;
        System.out.println("Division of two numbers is: " + div);
    }
}

class Mod extends Calculator {
    void result(Double numbers, Double numbers2) {
        Double mod = numbers % numbers2;
        System.out.println("Modulus of two numbers is: " + mod);
    }
}

public class InClassPractice_25662 {
    public static void main(String[] args) {

        // Calling the classes and methods from the classes above to use in the main
        Calculator calculator = new Calculator();
        Sum sum = new Sum();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        Mod mod = new Mod();

        // calculator using two-dimentional array
        Double[][] numbers = new Double[2][2];
        Scanner input = new Scanner(System.in);

        // First calculation set of numbers (numbers[0][0] and numbers[0][1]) 
        
        // Input of the first set of numbers
        System.out.print("Enter the first number: ");
        numbers[0][0] = input.nextDouble();

        System.out.print("Choose an operator (+, -, *, / or %): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        numbers[0][1] = input.nextDouble();

        // Switch statement to call the methods from the classes
        calculator.result(numbers[0][0], numbers[0][1]);

        switch (operator) {
            case '+':
                sum.result(numbers[0][0], numbers[0][1]);
                break;
            case '-':
                sub.result(numbers[0][0], numbers[0][1]);
                break;
            case '*':
                mul.result(numbers[0][0], numbers[0][1]);
                break;
            case '/':
                div.result(numbers[0][0], numbers[0][1]);
                break;
            case '%':
                mod.result(numbers[0][0], numbers[0][1]);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        System.out.println();

        // Second calculation set of numbers (numbers[1][0] and numbers[1][1])

        // Input of the second set of numbers
        System.out.print("Enter the first number: ");
        numbers[1][0] = input.nextDouble();

        System.out.print("Choose an operator (+, -, *, / or %): ");
        char operator2 = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        numbers[1][1] = input.nextDouble();

        // Switch statement to call the methods from the classes
        calculator.result(numbers[1][0], numbers[1][1]);

        switch (operator2) {
            case '+':
                sum.result(numbers[1][0], numbers[1][1]);
                break;
            case '-':
                sub.result(numbers[1][0], numbers[1][1]);
                break;
            case '*':
                mul.result(numbers[1][0], numbers[1][1]);
                break;
            case '/':
                div.result(numbers[1][0], numbers[1][1]);
                break;
            case '%':
                mod.result(numbers[1][0], numbers[1][1]);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();

        // Print the array
        System.out.println("\nThe array is: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}