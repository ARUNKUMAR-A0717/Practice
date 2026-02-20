import java.util.Scanner;
public class sumOfDigit{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int sum =0;
        while(n!=0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println(sum);
    }
}