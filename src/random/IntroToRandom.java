//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {

		int r = 0;

		Random gen = new Random();

		r = gen.nextInt(200);

		r = gen.nextInt(50) + 25;

		r = gen.nextInt(310) + -222;

		// 6. Challenge: Limit the random number between -222 and 88

		System.out.println(r);

		// 2. Run the program. What number appears in the console?
		// Run it again. Is the number the same?
	}
}