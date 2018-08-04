package com.avc.patternBased;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),width,length,i;
		String[] a= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(width=n,length=1,i=0;i<n;width+=2,length++,i++) {
			System.out.printf("%*.*s",width,length,a[(i*i)]);
		}
		sc.close();
	}
}
