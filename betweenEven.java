import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
             if (i==a) i=i+1;
             if(i==b) break;
             if(i%2==0)
        {
            System.out.print(i+" ");
            
        }
        
        } 

        
    }
}
