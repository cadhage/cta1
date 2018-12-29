import java.util.Scanner;

public class class_38 {
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
	int temp[]=new int[26];
	int c=0;
	for (int i = 0; i < s.length()-1; i++) {
		if((s.charAt(i)-s.charAt(i+1))==0) c++;
	}
	System.out.println(c);
}
}
