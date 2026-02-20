import java.util.Scanner;
public class String_Builder{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}