package gr.aueb.cf.ch1;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int result = 0;

        result = add(num1, num2);

        System.out.println("Sum: " + result);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int div (int a, int b) {
       try {
           if(b == 0);
           System.out.println("Error.");


       } catch (ArithmeticException e) {
           System.err.println(e.getMessage());
           throw e;
       }


        return a / b;
    }
}
