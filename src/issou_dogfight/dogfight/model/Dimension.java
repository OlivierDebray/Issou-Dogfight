package issou_dogfight.dogfight.model;

public class Dimension {

private int width;
private int height;

public Dimension (int width, int height){
	
}

public Dimension (Dimension dimension){
	dimension = new Dimension(dimension);
	
}

public int getWidth() {
	return width;
}

public void setWidht(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}



}
