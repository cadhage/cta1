import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class class_20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rank[]=new int[n];
	for (int i = 0; i < rank.length; i++) {
		rank[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int alice[]=new int[m];
	for (int i = 0; i < alice.length; i++) {
		alice[i]=sc.nextInt();
	}
	solver(rank,alice);
}
static void solver(int[] rank, int[] alice) {
	int c=0;
//	for (int i = 1; i < rank.length; i++) {
//		if(rank[i]<preRank) {c++;
//		preRank=rank[i];
//		}
//		//System.out.println(c);
//	}
	int n=alice.length+rank.length;
	Integer temp[]=new Integer[n];
	for (int i = 0; i <rank.length; i++) {
		temp[i]=rank[i];
		c++;
	}
	for (int i = 0; i < alice.length; i++) {
		temp[i+c]=alice[i];
	}
	Arrays.sort(temp,Collections.reverseOrder());
//	for (int i = 0; i < n; i++) {
//		System.out.print(temp[i]+" ");
//	}
	int cc=0,preRank=temp[0];
	for (int i = 0; i <n; i++) {
		if(temp[i]==alice[0]) {
		System.out.print("Yes"+" "+i);
		cc++;
		}
		//c++;
	}
}
}
