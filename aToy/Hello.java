package aToy;

import java.text.ParseException;

enum Direction {
	EAST, SOUTH, WEST, NORTH
}

public class Hello {

	public static void main(String[] args) throws ParseException {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Direction.EAST;
		System.out.println(d1);
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d3));
	}
}
