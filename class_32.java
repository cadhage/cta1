import java.util.Scanner;

public class class_32 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int q=sc.nextInt();
	sc.nextLine();
	for (int i = 0; i <q; i++) {
		String s=sc.nextLine();
		solver(s);
	}
	
}
static void solver(String s) {
	boolean r=false;
//	for (int i = s.length()-1; i>= 0; i--) {
//		r=r+s.charAt(i);
//	}
//	System.out.println(r);
	int a[]=new int[s.length()-1];
	int temp=0;
	for (int i = 0; i < s.length()-1; i++) {
		temp=Math.abs(s.charAt(i)-s.charAt(i+1))-Math.abs(s.charAt(s.length()-1-i)-s.charAt(s.length()-2-i));
		if(temp!=0) {
			r=true;
			break;
		}
	}
	if(r) System.out.println("Not Funny");
	else System.out.println("Funny");
	
}
}
