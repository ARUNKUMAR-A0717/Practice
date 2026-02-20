import java.util.Scanner;
public class palindrome_string{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String str = sc.nextLine();
        String rev = "";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}