import java.util.Scanner;

public class class_21 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for (int i = 0; i <n; i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		solver(a,b);
	}
}

static void solver(int a, int b) {
	int c=0;
	for (int i = a; i <=b; i++) {
		if(check(i)) c++;
	}
	System.out.println(c);
}

static boolean check(int n) {
	  
    // Find floating point value of 
    // square root of x. 
    double sr = Math.sqrt(n); 
  
    // If square root is an integer 
    return ((sr - Math.floor(sr)) == 0); 
}
}
