import java.util.Scanner;
public class NoOfwords {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter sentence");
       String sentence=sc.nextLine();
       int count=1;
            for(int i=0;i<=sentence.length();i++){
                if(sentence.charAt(i)==' ' && sentence.charAt(i+1)!=' '){
                      count++;
                }
            }
            System.out.println("no of word :"+count);
    }
}

        
    
