import java.util.Scanner;

public class class_18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		solver(n);
	}

	static void solver(int n) {
		int s=5,l=0;
		for (int i = 0; i <n; i++) {
			l=l+(s/2);
			
			s=s/2*3;
			
		}
		
	}

}
