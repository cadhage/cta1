import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class class_26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for (int i = 0; i <n; i++) {
		long a=sc.nextLong();
		solver(a);
	}
	
}

static void solver(long a) {
	long last=0;
	long n=a;
	ArrayList<Long> ts=new ArrayList();
	while(a>0) {
		last=a%10;
		ts.add(last);
		a=a/10;
	}
	int c=0;
	for (int i = 0; i < ts.size(); i++) {
	 if(ts.get(i)!=0 && n%ts.get(i)==0) c++;	
	}
	System.out.println(c);
}
}
