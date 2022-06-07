package com.zjut.circleRefrence;

/**
 * @author zoujiayang
 * @date 2022年06月06日
 */
public class B {
	private A a;


	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B{" +
				"a=" + a +
				'}';
	}
}
