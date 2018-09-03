public class Alphabets{
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		char d=sc.next().charAt(0);
		if(d>='a'&& d<='z'|| d>='A'&& d<='Z') {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("No");
		}
	}

}
