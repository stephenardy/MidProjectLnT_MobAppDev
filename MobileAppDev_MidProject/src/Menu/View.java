package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import item.Motorcycle;

public class View {
	
	Scanner input = new Scanner(System.in);
	
	Motorcycle motor = new Motorcycle(null, null, null, null, null, null, null, null, null, 0);
	
	ArrayList<String> typeList = Input.getTypeList();
	ArrayList<String> brandList = Input.getBrandList();
	ArrayList<String> nameList = Input.getNameList();
	ArrayList<String> licenseList = Input.getLicenseList();
	ArrayList<String> jenisTypeList = Input.getJenisTypeList();
	
	ArrayList<Integer> topSpeedList = Input.getTopSpeedList();
	ArrayList<Integer> gasCapacityList= Input.getGasCapacityList();
	ArrayList<Integer> wheelList = Input.getWheelList();
	ArrayList<Integer> dataKhususList = Input.getDataKhususList();
	
	
	public static void printTable(ArrayList<String> typeList, ArrayList<String> nameList){
		System.out.printf("|-----|---------------|---------------|%n");
		System.out.printf("|%-4s | %-13s | %-14s|\n", "No", "Type", "Name");
		System.out.printf("|-----|---------------|---------------|%n");
			
		for (int i = 0; i < typeList.size(); i++) {
			System.out.printf("|%-4s | %-13s | %-14s|\n", i+1, typeList.get(i) , nameList.get(i));
			System.out.printf("|-----|---------------|---------------|%n");
		}			
			
		System.out.printf("|-----|---------------|---------------|%n");		
		System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
	}

	private void printVehicleData(int index) {
		String type = typeList.get(index);
		
		System.out.println("Brand: " + brandList.get(index));					
		System.out.println("Name: " + nameList.get(index));			
		System.out.println("Name: " + licenseList.get(index));		
		System.out.println("Type: " + jenisTypeList.get(index));
		System.out.println("Gas capacity: " + gasCapacityList.get(index));		
		System.out.println("Top Speed: " + topSpeedList.get(index));	
		System.out.println("Wheel(s): " + wheelList.get(index));
		if(typeList.get(index).equals("Car")) {
			System.out.println("Entertainment System: " + dataKhususList.get(index));
			System.out.println("Turning on entertainment system...");
			if (jenisTypeList.get(index).equals("Supercar")) {
				System.out.println("Boosting!");					
			}
		} else if (typeList.get(index).equals("Motorcycle")) {
			System.out.println("Helm: " + dataKhususList.get(index));
			System.out.println("Turning on entertainment system...");
			System.out.println(nameList.get(index) + " is standing!");

			int helmPrice;
			
			System.out.println("Input Helm Price: ");
			helmPrice = input.nextInt();
			
			int totalPrice = dataKhususList.get(index) * helmPrice;
			System.out.println("Price : " + totalPrice);
		}
		
	
	}
	
	public View() {
		// TODO Auto-generated constructor stub
		printTable(typeList, nameList);
		
		Integer Choose;
		
		do {
			Choose = input.nextInt();
			if (Choose == 0) {
				System.out.println("Exit");
				break;
			} else if (Choose >= 1 && Choose <= typeList.size()) {
				int index = Choose - 1;
				printVehicleData(index);
			}
		} while (Choose < 0 || Choose > typeList.size());
		
		
		
	}
	
		
	
		
		
	

}
