import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;int temp=0;
        temp=n;
        while(temp>0){
            int last=temp%10;
            sum=sum+(last*last*last);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("yes");
        }
    else{
        System.out.println("no");
    }
    }
}
