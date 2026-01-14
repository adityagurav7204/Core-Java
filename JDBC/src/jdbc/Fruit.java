package jdbc;

public class Fruit {
	
	private int Id;
	private String Name;
	private String Colour;
	private String Taste;
	
	@Override
	public String toString() {
		return "Fruit [id=" + Id + ", name=" + Name + ", colour=" + Colour + ", taste=" + Taste + "]";
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		this.Colour = colour;
	}
	public String getTaste() {
		return Taste;
	}
	public void setTaste(String taste) {
		this.Taste = taste;
	}
	
	

}
