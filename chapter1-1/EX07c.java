package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX07c {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++)
			for (int j = 0; j < 1000; j++)
				sum++;
		StdOut.println(sum);

	}

}
