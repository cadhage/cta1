import java.util.Scanner;

public class class_2 {
public static void main(String[] args) {
	System.out.println("Helloo");
	int s,t,a,o;
	int m,n;
	Scanner sc=new Scanner(System.in);
	s=sc.nextInt();
	t=sc.nextInt();
	a=sc.nextInt();
	o=sc.nextInt();
	m=sc.nextInt();
	n=sc.nextInt();
	
	int apples[]=new int[n];
	for (int i = 0; i < apples.length; i++) {
		apples[i]=sc.nextInt();
	}
	int oranges[]=new int[m];
	for (int i = 0; i < oranges.length; i++) {
		oranges[i]=sc.nextInt();
	}
	countAppleOranges(s,t,a,o,apples, oranges);
}

 static void countAppleOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
	// TODO Auto-generated method stub
	 int app=0,or=0;
	 System.out.println(a+" "+b);
	 for (int i = 0; i < apples.length; i++) {
	  System.out.print(apples[i]+" ");
	 if((a+apples[i])>=s && (a+apples[i])<=t) app++;
	 
	 }
	 for (int i = 0; i < oranges.length; i++) {
		 System.out.print(oranges[i]+" ");
		 if((b+oranges[i])>=s && (b+oranges[i])<=t) or++;}
	System.out.println(app+" "+or);
}
}
