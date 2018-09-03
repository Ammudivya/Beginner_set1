public class SumOfNaturalNumbers {
	public static void main(String args[]) {
		int sum=0;
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum=i+sum;
			
		}
		System.out.println(sum);
		
	}

}
