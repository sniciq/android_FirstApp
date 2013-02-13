package test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(133333333);
			return;
		}
		finally {
			System.out.println(111111);
		}

	}

}
