package chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX09 {
	public static String toBinaryString(int N)
	{
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		return s;
	}

	public static void main(String[] args) {
		int N = StdIn.readInt();
		StdOut.println(toBinaryString(N));

	}

}
