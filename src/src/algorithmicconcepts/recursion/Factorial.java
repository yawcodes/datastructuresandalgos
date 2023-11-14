package algorithmicconcepts.recursion;

public class Factorial {

    public static int calcFactorial(int number) {
        if (number > 0) {
            System.out.println(number);
            return number * calcFactorial(number - 1);
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(calcFactorial(10));
    }
}
