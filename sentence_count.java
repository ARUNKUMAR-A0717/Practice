import java.util.Scanner;
public class sentence_count{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String sen = sc.nextLine();
        sen = sen.trim();     // for remove the extra space in front and back
        String[] words = sen.split("\\s+");
        int count = words.length;
        System.out.println(count);

    }
}