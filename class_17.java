import java.util.Scanner;

public class class_17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for (int i = 0; i < n; i++) {
		int h=0;
		int nn=sc.nextInt();
		solver(h,nn);
	}
}

static void solver(int h, int n) {
	for (int i = 0; i <=n; i++) {
		if(i%2==0) h=h+1;
		else h=h*2;
		System.out.println(h);
	}
	//System.out.println(h);
	
}
}
