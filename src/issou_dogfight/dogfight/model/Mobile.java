package issou_dogfight.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile {
	
private int speed;
private Dimension dimension;
private Direction direction;
private Position position;
private String Image;
private Image notreImage;


public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
	
	}

public Direction getDirection(){
	return this.direction;
	}

public void setDirection(Direction direction) {
	this.direction = direction;
	}

public Position getPosition() {
	return position;
	}

public Dimension getDimension() {
	return dimension;
	}

public int getSpeed(){
	return speed;
	}

public int getWidth(){
	return dimension.getWidth();
	}

public int getHeight(){
	return dimension.getHeight();
	}

public void move(){
	
	}

public void placeInArea(IArea Area){
	
	}

public boolean isPlayer(int player){
	return false;
	}

private void moveUp(){
	
	}

private void moveDown(){
	
	}

private void moveRight(){
	
	}

private void moveLeft(){
	
	}

public Color getColor(){
	return null;
	}

public IDogfightModel getDogfightModel(){
	return null;
	}

public void setDogfightModel(DogfightModel dogfightModel) {
		}

public boolean hit(){
	return false;
	}

public boolean isWeapon(){
	return false;
	}

public Image getImage(){
	return notreImage;
	}




}
