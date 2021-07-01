package com.kapilsharma.oops.level2;

public class Rectangle {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return length*width;
	}
	
	public int perimeter() {
		return 2 * (length + width);
	}
	
	public String toString() {
		return String.format("Length: %d, Width: %d, Area: %d, Perimeter: %d", length, width, area(), perimeter());
	}
}
