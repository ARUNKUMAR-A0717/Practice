import java.util.Scanner;
public class Reverse_string{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String str = scan.nextLine();
        String rev = " ";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}