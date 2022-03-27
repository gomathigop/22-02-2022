package com.arraytypes;

public class Eg4 {

	public static void main(String[] args) {
		int matrix[][]= new int[3][3];
		matrix[0][0]=1;
		matrix[0][1]=6;
		matrix[0][2]=7;
		
		matrix[1][0]=8;
		matrix[1][1]=9;
		matrix[1][2]=1;
		
		matrix[2][0]=6;
		matrix[2][1]=7;
		matrix[2][2]=8;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
				
			}
			System.out.println("\n\n\n");
		}
		
		

	}

}
