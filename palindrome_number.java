import java.util.Scanner;
public class palindrome_number{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while(num!=0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num/10;
        }
        if(org == rev){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
    }
}