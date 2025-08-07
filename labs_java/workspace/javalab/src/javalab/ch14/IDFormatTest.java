package javalab.ch14;

public class IDFormatTest {

	public static void main(String[] args) {
		IDFormat user = new IDFormat();
		
		try { 
//			user.setUserID(null);
			user.setUserID("12345");
		}
		catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
