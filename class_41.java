import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class class_41 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String a[]=new String[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.next();
	}
	Arrays.sort(a, (x,y)->{
		if(x.length()!=y.length()) return x.length()-y.length();
		return x.compareTo(y);
	});
	System.out.println(Arrays.toString(a));
}
}
