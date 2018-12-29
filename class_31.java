import java.util.Scanner;

public class class_31 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String s=sc.nextLine();
	solver(s);
	
}

static void solver(String s) {
	String oo="010";
	int c=0,cc=0;
	for (int i = 0; i < s.length()-3;i++) {
		for (int k = 0; k < oo.length(); k++) {
		if(oo.charAt(k)==s.charAt(i+k)) {c++;
	//System.out.println(oo.charAt(k));
		}
		else break;
	}}
	System.out.println(c/3);
}
}
