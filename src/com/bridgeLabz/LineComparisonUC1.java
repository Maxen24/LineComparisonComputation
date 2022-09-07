/**
 * 
 */
package com.bridgeLabz;

/**
 * @author mshub
 *
 */
public class LineComparisonUC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x1=4;
		double x2=5;
		double y1=4;
		double y2=5;
		double distance;
		distance=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		System.out.println("Length of Line is"+" "+distance);

	}

}
