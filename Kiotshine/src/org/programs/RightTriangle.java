package org.programs;

public class RightTriangle {
	public static void StarRightTriangle(int n) {
		int a,b;
		for(a=0; a<n; a++) {
			for(b=0; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	public static void main(String args []) {
		int s=5;
		StarRightTriangle(s);
	}
}