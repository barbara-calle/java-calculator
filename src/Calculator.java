import java.util.Random;

public class Calculator {
<<<<<<< HEAD
    public static void sum(int number1, int number2){
        System.out.println(number1 + number2);
    }

    public static void subtract(int number1, int number2){
        System.out.println(number1 - number2);
    }

    public static void main(String[] args){
        Random number = new Random();

        int number1 = number.nextInt(100);
        int number2 = number.nextInt(100);

        sum(number1, number2);
        subtract(number1, number2);
=======
    public static void multiplication(int number1, int number2){
        System.out.println(number1 * number2);
    }

    public static void division(int number1, int number2){
        System.out.println(number1 / number2);
    }

    public static void main(String[ ] args){
        Random number = new Random();

        int random_number1 = number.nextInt(100);
        int random_number2 = number.nextInt(100);

        multiplication(random_number1, random_number2);
        division(random_number1, random_number2);
>>>>>>> a2d4ec2 (Methods for multipication and division)
    }
}
