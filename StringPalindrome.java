import java.util.ArrayList;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String str=sc.nextLine();
       boolean result =true;
        int i = 0, j = str.length() - 1;
        while (i < j) {

            
            if (str.charAt(i) != str.charAt(j))
                 result =false;

            i++;
            j--;
        }
    }
 System.out.println(result);

    
}
}