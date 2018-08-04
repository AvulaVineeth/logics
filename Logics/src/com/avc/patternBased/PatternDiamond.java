package com.avc.patternBased;

import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), noOfColumn = 1, noOfSpaces = n , i, j, start=0, a;
		for(i=1;i<=n;i++) {
			for(int k=0;k<=noOfSpaces;k++) {
				System.out.print(" ");
			}
			if(i<=n/2) {
				start=i;
			}else {
				start=(n+1)-i;
			}
			for(j=0,a=0;j<noOfColumn;j++,a++) {
				int middleColumn=noOfColumn/2;
				if(j<middleColumn) {
				System.out.print(start--);
				}else {
					System.out.print(start++);
				}
				
			}
			System.out.println();
			if(i<=n/2) {
			noOfColumn+=2;
			noOfSpaces-=1;
			}else {
				noOfColumn-=2;
				noOfSpaces+=1;
			}
			
		}
		
		
		sc.close();
	}
}
