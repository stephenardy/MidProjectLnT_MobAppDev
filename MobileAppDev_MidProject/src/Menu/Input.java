package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import item.Vehicle;

public class Input {
	
	private static ArrayList<String> typeList = new ArrayList<>();
	private static ArrayList<String> brandList = new ArrayList<>();
	private static ArrayList<String> nameList = new ArrayList<>();
	private static ArrayList<String> licenseList = new ArrayList<>();
	private static ArrayList<String> jenisTypeList = new ArrayList<>();
	private static ArrayList<Integer> topSpeedList = new ArrayList<>();
	private static ArrayList<Integer> gasCapacityList = new ArrayList<>();
	private static ArrayList<Integer> wheelList = new ArrayList<>();
	private static ArrayList<Integer> dataKhususList = new ArrayList<>();
	
	
	public Input() {
		// TODO Auto-generated constructor stub

		
			Scanner input = new Scanner(System.in);
			
			Vehicle vehicle = new Vehicle(null, null, null, null, null, null, null, null, null);
			String type = vehicle.getType();
			String brand = vehicle.getBrand();
			String name = vehicle.getName();
			String license = vehicle.getLicense();
			String jenisType = vehicle.getJenisType();
			
			Integer topSpeed = vehicle.getTopSpeed();
			Integer gasCapacity = vehicle.getGasCapacity();
			Integer wheel = vehicle.getWheel();
			Integer dataKhusus = vehicle.getDataKhusus();
			
			
			
			do {
				System.out.print("Input type [Car | Motorcycle]: ");
				type = input.nextLine();
			} while (!type.equals("Car") && !type.equals("Motorcycle"));
			typeList.add(type);
			
			do {
				System.out.print("Input brand [>= 5]: ");
				brand = input.nextLine();	
			} while (brand.length() < 5);
			brandList.add(brand);
			
			do {
				System.out.print("Input name[>= 5]: ");
				name = input.nextLine();	
			} while (name.length() < 5);
			nameList.add(name);
			
			do {
				System.out.print("Input license: ");
				license = input.nextLine();	
			} while (!license.matches("[A-Z]\s?\\d{1,4}\s?[A-Z]{1,3}"));
			licenseList.add(license);
			
			do {
				System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
				topSpeed = input.nextInt(); input.nextLine();
			} while (topSpeed < 100 || topSpeed > 250);
			topSpeedList.add(topSpeed);
			
			do {
				System.out.print("Input gas capacity [30<= gasCap <= 60]:");
				gasCapacity = input.nextInt(); input.nextLine();
			} while (gasCapacity < 30 || gasCapacity > 60);
			gasCapacityList.add(gasCapacity);
			
			if (type.equals("Car")) {
				do {
					System.out.print("Input wheel [4 <= wheel <= 6]: ");
					wheel = input.nextInt(); input.nextLine();
				} while (wheel < 4 || wheel > 6);
			} else {
				do {
					System.out.print("Input wheel [2 <= wheel <= 3]: ");
					wheel = input.nextInt(); input.nextLine();
				} while (wheel < 2 || wheel > 3);
			}
			wheelList.add(wheel);
			
			if (type.equals("Car")) {
				do {
					System.out.print("Input type [SUV | Supercar | Minivan]: ");
					jenisType = input.nextLine();
				} while (!jenisType.equals("SUV") && !jenisType.equals("Supercar") && !jenisType.equals("Minivan"));
			} else {
				do {
					System.out.print("Input type [Automatic | Manual]: ");
					jenisType = input.nextLine();
				} while (!jenisType.equals("Automatic") && !jenisType.equals("Manual"));
			}
			jenisTypeList.add(jenisType);
			
			if (type.equals("Car")) {
				do {
					System.out.print("Input entertainment system amount [>= 1]: ");
					dataKhusus = input.nextInt(); input.nextLine();
				} while (dataKhusus < 1);
			} else {
				do {
					System.out.print("Input helm amount [>= 1]: ");
					dataKhusus = input.nextInt(); input.nextLine();
				} while (dataKhusus < 1);
			}
			dataKhususList.add(dataKhusus);
			
			
		System.out.print("ENTER to return");

			
		
		
	}
		
	public static ArrayList<String> getTypeList(){
		return typeList;
	}
	public static ArrayList<String> getBrandList(){
		return brandList;
	}
	public static ArrayList<String> getNameList(){
		return nameList;
	}
	public static ArrayList<String> getLicenseList(){
		return licenseList;
	}
	public static ArrayList<String> getJenisTypeList(){
		return jenisTypeList;
	}
	public static ArrayList<Integer> getTopSpeedList(){
		return topSpeedList;
	}
	public static ArrayList<Integer> getGasCapacityList(){
		return gasCapacityList;
	}
	public static ArrayList<Integer> getWheelList(){
		return wheelList;
	}
	public static ArrayList<Integer> getDataKhususList(){
		return dataKhususList;
	}

	

}
