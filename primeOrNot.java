import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        int num, i, count=0;
        Scanner scan = new Scanner(System.in);
		
      
        num = scan.nextInt();
		if(num==0 || num==1){
		    System.out.println("no");
		 
		}
		else{
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
}
       
    }
}
