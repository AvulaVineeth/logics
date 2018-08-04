package com.avc.patternBased;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i,j,h,noOfColumns=0,k=n+3;
		String[] a= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(i=0;i<n;i++) {
			h=i*i;
			for(int f=0;f<k;f++)
			{
				System.out.print(" ");
			}
		for(j=0;j<=noOfColumns;j++) {
			System.out.print(a[h]+" ");
			h+=1;
		}
		System.out.println();
		noOfColumns+=2;
		k-=2;
		
		}
		sc.close();
	}
}
