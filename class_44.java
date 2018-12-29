import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class class_44 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		solver(a);
	}

	static void solver(a) {
		int count[] = new int[100];
		for (int i = 0; i < a.length; i++) {
			++count[a[i]];
		}
		printArray(count);
	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
