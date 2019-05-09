import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;int temp=0;
       
        for(int i=a;i<b;i++){
            if(i==a) i=i+1;
            if(i==b)break;
        temp=i;
        while(temp>0){
            int last=temp%10;
            sum=sum+(last*last*last);
            temp=temp/10;
        }
        if(sum==i){
            System.out.println(i);
            break;
        }
    else{
        
    }
        }
    }
}
