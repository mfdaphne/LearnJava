package com.zoo;

import com.zoo.StaticOuter.StaticInner;

public class LocalOuter {

	public int age;

	public void processOuter() {
		int count = 0;

		class Inner {
			public int length;

			public void calculateLength() {
				System.out.println(length + 10);
			}
		}

		Inner inner = new Inner();
		inner.calculateLength();

	}

	public void processStaticOuter() {
		StaticOuter stOuter = new StaticOuter();
		StaticInner stInner = new StaticInner();
	}
}
