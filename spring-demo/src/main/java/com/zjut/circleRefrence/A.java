package com.zjut.circleRefrence;

/**
 * @author zoujiayang
 * @date 2022年06月06日
 */
public class A {
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				'}';
	}
}
