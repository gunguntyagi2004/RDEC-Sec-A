import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("number of digits in number");
        int n=sc.nextInt();
        int tem=num;
        int r=1;// power result
        int result=0;
        while(num!=0){
            int d=num%10;
            if(n!=0){
                for(int i=1;i<=n;i++){
                    r*=d;  
              }
              System.out.println(r);
               result+=r;
               r=1;
              num=num/10;
        }
        }
if(tem==result)
System.out.println("armstrong");
else
System.out.println("not armstrong");
    }
}
