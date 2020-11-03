
public class GeometricObject {
	private String color = "White";
	private Boolean filled;
	private java.util.Date dateCreated;	
	public GeometricObject() {
		dateCreated = new java.util.Date();			
	}
	public GeometricObject(String color,Boolean filled) {
		dateCreated = new java.util.Date();			
		this.color = color;
		this.filled = filled;	
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean isFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;	
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public String toString() {
		return "Created on" + dateCreated + 
				"\ncolor: " + color + " and filled: "
				+ filled;
	}
}
