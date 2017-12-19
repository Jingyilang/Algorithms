package chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX11 {
	public static void printBooleanMat(boolean[][] mat)
	{
		StdOut.print(' ');
		for (int i = 0; i < mat[0].length; i++)
		{
			StdOut.print(i);
		}
		StdOut.println();
		for (int i =0; i < mat.length; i++)
		{
			StdOut.print(i);
			for (int j = 0; j < mat[i].length; j++)
			{
				StdOut.print(mat[i][j] ? '*' : ' ');
			}
			StdOut.println();
		}
	}

	public static void main(String[] args) {
		boolean[][] a = {{true, false, false}, {false, true, true}};
		printBooleanMat(a);

	}

}
