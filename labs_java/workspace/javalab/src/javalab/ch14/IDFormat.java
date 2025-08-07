package javalab.ch14;

public class IDFormat {
	private String userID;

	
	//get, set
	public String getUserID() {
		return userID;
	}

	
	// A method can throw a specified exception.
	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("ID can't null");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("ID's length is over 8 and under 20");
		}
		
		
		
		
		this.userID = userID;
		
	}

	@Override
	public String toString() {
		return "IDFormat [userID=" + userID + "]";
	}
	
	
	
}
