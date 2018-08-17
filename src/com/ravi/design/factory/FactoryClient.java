/**
 * 
 */
package com.ravi.design.factory;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * @Aug 16, 2018
 * 
 */
public class FactoryClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape(ShapeEnum.SQUARE);
		shape.draw();

	}

}
