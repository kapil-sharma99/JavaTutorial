package refrenceTypesInJava;

public class WrapperClasses {

	public static void main(String[] args) {
		int i = 5;
		Integer integer = Integer.valueOf(5);
		Integer integer1 = Integer.valueOf(5);
		Integer size1 = Integer.MAX_VALUE;
		Integer size2 = Integer.MIN_VALUE;
		Integer size3 = Integer.SIZE;
		Integer size4 = Integer.BYTES;
		
		System.out.println(size1);
		System.out.println(size2);
		System.out.println(size3);
		System.out.println(size4);
		
		Character character = Character.valueOf('K');
	}

}
