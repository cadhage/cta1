import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class class_7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println(bird(a));
}

static int bird(int[] a) {
	int count[]=new int[1000];
	for (int j = 0; j < a.length; j++) {
		++count[a[j]];
	}
	int max=0,c=0;
	for (int i = 0; i <1000; i++) {
		 if(max<count[i]) { max=count[i];
		 c=i;}
	}
	return c;
}
}
