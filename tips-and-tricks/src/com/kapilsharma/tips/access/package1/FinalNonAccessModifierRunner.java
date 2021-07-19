package com.kapilsharma.tips.access.package1;

final class FinalClass {}; //final class cannot be extended further

class SomeClass {
	final public void doSomething() {
		
	}
}

class ExtendingClass extends SomeClass {
	//public void doSomething() {}; [connot be modified because final keyword added]
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
