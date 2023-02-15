package item;

import java.util.ArrayList;

public class Vehicle {
	private String type, brand, name, license, jenisType;
	private Integer topSpeed, gasCapacity, wheel, dataKhusus;
	
	public Vehicle(String type, String brand, String name, String license, String jenisType, Integer topSpeed,
			Integer gasCapacity, Integer wheel, Integer dataKhusus) {
		super();
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.jenisType = jenisType;
		this.topSpeed = topSpeed;
		this.gasCapacity = gasCapacity;
		this.wheel = wheel;
		this.dataKhusus = dataKhusus;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getJenisType() {
		return jenisType;
	}
	public void setJenisType(String jenisType) {
		this.jenisType = jenisType;
	}
	public Integer getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
	public Integer getGasCapacity() {
		return gasCapacity;
	}
	public void setGasCapacity(Integer gasCapacity) {
		this.gasCapacity = gasCapacity;
	}
	public Integer getWheel() {
		return wheel;
	}
	public void setWheel(Integer wheel) {
		this.wheel = wheel;
	}
	public Integer getDataKhusus() {
		return dataKhusus;
	}
	public void setDataKhusus(Integer dataKhusus) {
		this.dataKhusus = dataKhusus;
	}
	
	
}
