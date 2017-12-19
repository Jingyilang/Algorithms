package chapter1_1;

public class EX13 {
	public static void printTransposedMat(int[][] mat)
	{
		for (int i = 0; i < mat[0].length; i++)
		{
			for (int j = 0; j < mat.length; j++)
			{
				System.out.printf("%2d", mat[j][i]);
			}
		    System.out.println();
		}
		    
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {4, 5, 6}};
		printTransposedMat(a);

	}

}
