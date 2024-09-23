public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        int number = 5;
        int doubled = doubleNumber(number);
        System.out.println("The doubled number is: " + doubled);
    }

    private static int doubleNumber(int input) {
        return input * 2;
    }
}