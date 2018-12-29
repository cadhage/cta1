import java.util.Scanner;

public class class_30 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	for (int i = 0; i <n; i++) {
		solver(sc.nextLine());
	}
}

static void solver(String s) {
	String hk="hackerrank";
	int i=0;
	int j=0;
	boolean flag=true;
	while (i<s.length() && j<hk.length()) {
		if(s.charAt(i)==hk.charAt(j)) {
			//System.out.println(s.charAt(i));
			i++;
			j++;
		}
		else i++;
		if(j==hk.length()) {System.out.println("YES");flag=false;
	}
}
	if(flag) System.out.println("NO");
}
}