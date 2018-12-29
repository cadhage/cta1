import java.util.Scanner;

public class class_16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		solver(a,b,x);
	}

	static void solver(int a, int b, int x) {
		int c=0;
		for (int i = a; i <=b; i++) {
			if((i-rev(i))%x==0) c++;
		}
		System.out.println(c);
	}

	static int rev(int num) {
		int reversed=0;
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		return reversed;
	}

}
