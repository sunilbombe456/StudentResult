package entity;

public class Student {
	private int id;
	
	private String name;
	
	private float result;
	
	private String address;

	public Student() {
	}

	public Student(int id, String name, float result, String address) {
		this.id = id;
		this.name = name;
		this.result = result;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", result=" + result + ", address=" + address + "]";
	}
	
	

}
