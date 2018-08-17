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
public class ShapeFactory {

	public Shape getShape(ShapeEnum shapeEnum) {

		Shape shape = null;

		if (shapeEnum.name().equals("CIRCLE")) {
			return new Circle();

		}
		if (shapeEnum.name().equals("SQUARE")) {
			return new Square();

		}
		if (shapeEnum.name().equals("TRIANGLE")) {
			return new Triangle();
		}

		return shape;

	}

}
