import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=1;
        for(int i=a;i>0;i--){
           sum=sum*i;
        }
        System.out.println(sum);
    }
}
