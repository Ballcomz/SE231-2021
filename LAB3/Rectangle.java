package LAB3;

public class Rectangle {
    private float cWidth;
	private float cHeight;
	
	public Rectangle( float height, float width) {
		cHeight = height;
		cWidth = width;
	}
	
	public float getArea(){
		return cHeight * cWidth;
	}
	
	public float getPerimeter(){
		return 2*(cHeight+cWidth);
	}

}
