import java.util.Scanner;

public class class_13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for (int i = 0; i <q; i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int s=sc.nextInt();
			solver(n,m,s);
		}
	}

static void solver(int n, int m, int s) {
	System.out.println((m+s-2)%n+1);
		
	}

}
