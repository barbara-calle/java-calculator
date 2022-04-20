import java.util.Random;

public class Calculator {
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
    }
}
