package app.labs.project.model;

public class House implements IHouse {
    private int houseIdx;
    private String houseName;
    private int housePrice;
    private int houseEffect;
	
    public House(int houseIdx, String houseName, int housePrice, int houseEffect) {
        this.houseIdx = houseIdx;
        this.houseName = houseName;
        this.housePrice = housePrice;
        this.houseEffect = houseEffect;
    }
    
    
	@Override
	public int getHouseIdx() {
		return houseIdx;
	}

	@Override
	public String getHouseName() {
		return houseName;
	}

	@Override
	public int getHousePrice() {
		return housePrice;
	}

	@Override
	public int getHouseEffect() {
		return houseEffect;
	}


	@Override
	public String toString() {
		return "House [houseIdx=" + houseIdx + ", houseName=" + houseName + ", housePrice=" + housePrice
				+ ", houseEffect=" + houseEffect + "]";
	}
	
	// Method
	public void cellingHouse() {
		System.out.println("집이 팔렸습니다!");
		System.out.println(houseName + "(LEVEL: " + houseIdx + ")");
	}
	
	

}
