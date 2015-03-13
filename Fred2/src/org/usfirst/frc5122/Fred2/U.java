package org.usfirst.frc5122.Fred2;

public class U {

	public static double constrain(double min, double value, double max) {
		if (value > max)
			return max;
		else if (value < min)
			return min;
		else 
			return value;
	}
	public static int constrain(int min, int value, int max) {
		if (value > max)
			return max;
		else if (value < min)
			return min;
		else 
			return value;
	}
	public static String className(Object c) {
		Class<?> enclosingClass = c.getClass().getEnclosingClass();
		if (enclosingClass != null) {
			return enclosingClass.getName();
		} else {
			return c.getClass().getName();
		}
	}
	
}
