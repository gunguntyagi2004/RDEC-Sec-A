import java.util.Scanner;
public class power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter base value");
         int base=sc.nextInt();
         System.out.println("enter exponent value");
         int exp=sc.nextInt();
         int r=1;
         if(exp==0)
            System.out.println(1);
         else{
            for(int i=1;i<=exp;i++){
                  r*=base;
            }
            System.out.println(r);
         }
    }
}
