package item;

public class Motorcycle extends Vehicle {
	
	int price;

	public Motorcycle(String type, String brand, String name, String license, String jenisType, Integer topSpeed,
			Integer gasCapacity, Integer wheel, Integer dataKhusus, int price) {
		super(type, brand, name, license, jenisType, topSpeed, gasCapacity, wheel, dataKhusus);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	public int getHelmPrice() {
//		return getDataKhusus()*this.price;		
//	}
	

	


	
}
