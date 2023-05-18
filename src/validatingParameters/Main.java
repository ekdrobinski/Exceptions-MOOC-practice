package validatingParameters;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 5; // test factorial of 5
        int result1 = calculator.factorial(num1); //calculate factorial
        int num2 = 3; // test factorial of 3
        int result2 = calculator.factorial(num2);

        System.out.println("factorial of " + num1 + " is: " + result1);
        System.out.println("factorial of " + num2 + " is: " + result2);

    }
}