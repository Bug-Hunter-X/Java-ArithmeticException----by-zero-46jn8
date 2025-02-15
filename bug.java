public class MyClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = x / y; // This will cause an ArithmeticException
        System.out.println(z);
    }
}