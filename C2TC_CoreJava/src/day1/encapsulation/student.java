package day1.encapsulation;

public class student {

	 private int id;

	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; // used to access the own class variable
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
