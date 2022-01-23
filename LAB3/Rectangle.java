<<<<<<< HEAD
//package LAB3;
=======

>>>>>>> 15027dae4fe64d3d3b727c7a0a28969d98390638

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
