
public class TestCircle {
private double radius=1.0;
private String color= "red";
public TestCircle() {
	
}
public TestCircle(double radius) {
	this.radius=radius;
}
public TestCircle(double radius, String color){
	this.radius=radius;
	this.color=color;
}
public double getRadius() {
	return radius;
}
public String getColor() {
	return color;
}

public void setRadius(double radius){
	this.radius=radius;
}

public void setCOlor(String color) {
	this.color=color;
}
 
public String toString() {
	return "The color is :" +color;
}

public double getArea() {
	return 3.14*radius*radius;
}
}