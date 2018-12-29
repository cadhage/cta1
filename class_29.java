import java.util.Scanner;

public class class_29 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	solver(s);
}
static void solver(String s) {
	String sos="SOS";
	int c=0;
	for (int i = 0; i <s.length(); i++) {
		if(sos.charAt(i%3)!=s.charAt(i)) c++;
	}
	System.out.println(c);
}

}
