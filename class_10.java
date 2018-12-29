import java.util.Scanner;

public class class_10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long b=sc.nextLong();
	int k=sc.nextInt();
	int u=sc.nextInt();
	int key[]=new int[k];
	for (int i = 0; i < key.length; i++) {
		key[i]=sc.nextInt();
	}
	int usb[]=new int[u];
	for (int i = 0; i < usb.length; i++) {
		usb[i]=sc.nextInt();
	}
	
	solver(b,key,usb);
}

static void solver(long b, int[] key, int[] usb) {
	int max=0,c=0,d=0,counter=0;
	for (int i = 0; i < key.length; i++) {
		for (int j = 0; j < usb.length; j++) {
			if((key[i]+usb[j])<=b && max<(key[i]+usb[j])) {
				max=(key[i]+usb[j]);
				c=i;d=j;
				counter++;
			}
		}
		
	}
	if(counter==0) System.out.println(-1);
	else System.out.println(key[c]+usb[d]);
}
}
