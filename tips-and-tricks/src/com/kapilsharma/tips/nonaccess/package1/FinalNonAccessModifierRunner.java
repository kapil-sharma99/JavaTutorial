package com.kapilsharma.tips.nonaccess.package1;

final class FinalClass {}; //final class cannot be extended further

class SomeClass {
	final public void doSomething() {}
	public void doSomethingElse(final int arg) {
		//arg = 10; [Final arguments value cannot be changed]
	}
}

class ExtendingClass extends SomeClass {
	//public void doSomething() {}; [connot be modified because final keyword added]
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		//final int i = 5; [This syntax is allowed]
		final int i;
		i = 5; //first time initialization in allowed
		//i = 7; [Final variable cannot be changed].
	}

}
