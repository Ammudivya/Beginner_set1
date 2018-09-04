public class AddingInputs{
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	
	 System.out.println("N");
	 int n=sc.nextInt();
	 System.out.println("K");
	 int k=sc.nextInt();
	 int a[]=new int[n];
	 int sum=0;
	 
	
	 for(int i=0;i<a.length;i++) {
		 a[i]=sc.nextInt();
	 }
	 
            for(int i=0;i<k;i++) {
		      sum=a[i]+sum;
		        
            }
	 
	 System.out.println(sum);
	 sc.close();
	 
 }

}
