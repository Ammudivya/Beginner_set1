import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        while(a>0){
            int r=a%10;
             sum=(sum*10)+r;
             a=a/10;
        }
        if(temp==sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

       
    }
}
