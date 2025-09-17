import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int og = num;
        int digitz = String.valueOf(num).length();
        int sum = 0;
        while (num >0){
            int digit = num % 10;
            sum += Math.pow(digit,digitz);
            num/=10;
        }
        if (sum==og){
            System.out.println(og + " is an Armstrong number");
        } else {
            System.out.println(og + " is not an Armstrong number");
        }
        sc.close();

    }
}
