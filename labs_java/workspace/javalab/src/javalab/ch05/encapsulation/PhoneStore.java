package javalab.ch05.encapsulation;

public class PhoneStore {
	//member field(= status)
	private String storeName ;
	private Phone phone ;
	private Customer customer ;
	
	//constructor
	public PhoneStore(String storeName, Phone phone) {
		this.storeName = storeName;
		this.phone = phone;
	}

	//get or set
	public String getStoreName() {
		return storeName;
	}

	//number of cases in store
	private void registerPayment() {
		System.out.println("store: Register your rate plan "
				+ "and contract. ");
	}
	
	private void discountPromotion() {
		System.out.println("store: We offer a discount "
				+ "for promotions.");
	}
	
	
	private void saveData() {
		System.out.println("store: save the data and "
				+ "move it to your new phone.");
	}
	
	//
	public Phone sellPhone(String model, double budget) {
		String phoneModel = phone.getModel();
		if (model.equals(phoneModel) && budget >= phone.getPrice() ) {
			registerPayment();
			discountPromotion();
			saveData();
			
			return phone;
		
		}
		else return null;
		
	} // buplic Phone......
	
	
	
	
	
	
}
