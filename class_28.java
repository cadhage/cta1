import java.util.Scanner;

public class class_28 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int h=sc.nextInt();
	int m=sc.nextInt();
	solver(h,m);
}

static void solver(int h, int m) {
	String hr[]= {"one","two","three","four","five","six","seven","eight",
			"nine","ten","eleven","twelve"};
	String min[]={"one","two","three","four","five","six","seven","eight",
			"nine","ten",
			"eleven",
			"twelve",
			"thirteen",//	14
			"fourteen",	//15
			"fifteen",	//16
			"sixteen",	//17
			"seventeen",	//18
			"eighteen",//	19
			"nineteen",//	20
			"twenty"};
	String minten[]={"twenty","thirty","forty","fifty","sixty"};
	if(m==0) System.out.println(hr[h-1]+" o' clock");
	if(m>0 && m<=20) System.out.println(min[m-1]+" past "+hr[h-1]);
	if(m>20 && m<30) System.out.println("twenty "+min[m%10-1]+" past "+hr[h-1]);
	if(m==15) System.out.println("quarter past "+hr[h-1]);
	if(m>0 && m<=20) System.out.println(min[m-1]+" to "+hr[h-1]);
	if(m>20 && m<30) System.out.println("twenty "+min[m%10-1]+" to "+hr[h-1]);
	if(m==30) System.out.println("half past "+hr[h-1]);
	if(m==45) System.out.println("quarter to "+hr[h]);
	
}
}
