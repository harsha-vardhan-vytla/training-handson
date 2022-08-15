package com.org.tav.day2;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ja[][]= { {2,4,6,8},{1,3,5},{2,3,5,7} };
		
		System.out.println("Jagged Array :");
		for(int i=0;i<ja.length;i++) {
			for(int j=0;j<ja[i].length;j++) {
				System.out.print(ja[i][j]+" ");
			}
			System.out.println();
		}
	}

}
