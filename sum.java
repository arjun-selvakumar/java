import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sum {
  static int solvemefirst(int a,int b){
    int sum = a + b;
    return sum;
  }
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int sum = solvemefirst(a,b);
    System.out.println(sum);
    input.close()
      }
}
