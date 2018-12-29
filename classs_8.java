import java.util.Scanner;

public class classs_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i <n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			solver(a,b,c);
		}
	}

	static void solver(int a, int b, int c) {
		int d1=Math.abs(c-a);
		int d2=Math.abs(c-b);
		if(d1>d2) System.out.println("Cat B");
		else if(d1<d2) System.out.println("Cat A");
		else  System.out.println("Mouse C");
		
	}

}
