import java.util.Scanner;

public class class_34 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	for (int i = 0; i <n; i++) {
		String s=sc.nextLine();
		solver(s);
	}
}

static void solver(String s) {
	int sum=0;
	for (int i = 0; i < s.length()/2; i++) {
		int temp=Math.abs(s.charAt(i)-s.charAt(s.length()-1-i));
		sum=sum+temp;
	}
	System.out.println(sum);	
}
}
