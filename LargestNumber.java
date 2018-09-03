public class LargestNumber {
	public static void main(String args[]) {
		Scanner r=new Scanner(System.in);
		int x=r.nextInt();
		int y=r.nextInt();
		int z=r.nextInt();
		
        if(x>y) {
        	System.out.println(x);
        	
        }
        else if(y>z) {
        	System.out.println(y);
        }
        else{
        	System.out.println(z);
        	
        }
		
	}

}
