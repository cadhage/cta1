import java.util.Scanner;

public class class_15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String s=sc.nextLine();
	solver(s);
}
 static void solver(String s) {
	 int c = 0, cc = 0;
     boolean neg=false;
     for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == 'U') {
             c++;
         } 
         else
             c--;
         if (c<0)
             neg=true;
         else if(c>=0 && neg) {cc++;
         neg=false;
         } 
     }
     System.out.println(cc);
	
}
}
