package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		System.out.println("X was " + x);
		int y = ap.nextInt("Value for y?");
		System.out.println("Y was " + y);
		int z = ap.nextInt("Value for z?");
		System.out.println("Z was " + z);

		boolean isOrdered;
isOrdered = x<y && y<z || x>y && y>z;
		System.out.println(isOrdered);

	}

}
