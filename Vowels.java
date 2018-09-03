public class Vowels {
	public static void main(String args[]) {
		Scanner r=new Scanner (System.in);
		char a=r.next().charAt(0);
		if(a>='a'&& a<='z'|| a>='A'&& a<='Z') {
		if((a=='a'|| a=='e'|| a=='i' || a=='o'|| a=='u') || (a=='A'|| a=='E'|| a=='I' || a=='O'|| a=='U') ) {
			System.out.println("Vowels");
		}
		else{
			System.out.println("Consonant");
		}
		}
		else {
		System.out.println("invalid");
		}
			
		
	}

}
