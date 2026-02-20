import java.util.Scanner;
public class check_prime{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
       int num = sc.nextInt();
       boolean isPrime = true;
       if(num <=1){
        isPrime = false;
       }
       else{
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
       }
       if(isPrime){
        System.out.println("The number is Prime");
       }
       else{
        System.out.println("The number is not prime");
       }
    }
}