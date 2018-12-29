import java.util.Scanner;

public class class_3 {
	public static void main(String[] args) {
		//System.out.println("Hello_girl");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int v1=sc.nextInt();
		int x2=sc.nextInt();
		int v2=sc.nextInt();
		kangaroos(x1,v1,x2,v2);
	}

	static void kangaroos(int x1, int v1, int x2, int v2) {
		if (v1>v2&&(x2-x1)%(v1-v2)==0)
            System.out.println("YES");
        else
            System.out.println("NO");

}
}