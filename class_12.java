import java.util.Scanner;

public class class_12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int d=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		solver(p,d,m,a);
	}
 static void solver(int p, int d, int m, int s) {
	 int count = 0;
     while(s>=p){
         count++;
         s -=p;
         p = Math.max(p-d,m);
     }
     System.out.println(count);
		
	}

}
