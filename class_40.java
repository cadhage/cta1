import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class class_40 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=sc.nextInt();
	solver(s,n);
	
}
static void solver(String s, int n) {
	TreeMap<String, Integer> tm=new TreeMap<>();
	for (int i = 0; i <s.length(); i++) {
		for (int j = i; j <=s.length(); j++) {
		String ss=s.substring(i,j);
		//int a=0;
		if(ss.length()>0) tm.put(ss,tm.getOrDefault(ss,0)+1);
		}
	}
	int c=0;
	for(Map.Entry<String,Integer> entry : tm.entrySet()) {
		  String key = entry.getKey();
		  Integer value = entry.getValue();
		  if(value>=n) c++;
		}
	System.out.println(c);
}
}
