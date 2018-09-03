
public class Input{
public static void main(String args[]) {	

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	 if(n<1) {
		 System.out.println("negative");
	 }
	 else if(n>1) {
		 System.out.println("Positive");
	 }
	 else {
		 System.out.println("Zero");
	 }

}
}
