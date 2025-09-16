import java.util.Scanner;

public class AssOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        int x = 10;
        System.out.println("\nAssignment Operators:");
        System.out.println("x = " + x);
        x += 5;
        System.out.println("x += 5 -> " + x);
        x -= 3;
        System.out.println("x -= 3 -> " + x);
        x *= 2;
        System.out.println("x *= 2 -> " + x);
        x /= 4;
        System.out.println("x /= 4 -> " + x);
        x %= 3;
        System.out.println("x %= 3 -> " + x);

        int y = 5;
        System.out.println("\nIncrement / Decrement:");
        System.out.println("y = " + y);
        System.out.println("y++ = " + (y++));
        System.out.println("After y++: " + y);
        System.out.println("++y = " + (++y));
        System.out.println("After ++y: " + y);
        System.out.println("y-- = " + (y--));
        System.out.println("After y--: " + y);
        System.out.println("--y = " + (--y));
        System.out.println("After --y: " + y);
    }
}
