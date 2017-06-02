package issou_dogfight.dogfight.model;

public class Cloud extends Mobile {

private static int SPEED = 1;
private static int WIGTH = 300;
private static int HEIGHT = 150;
private static String IMAGE = "cloud";
private static Position position;

public Cloud(Direction direction, Dimension dimension){
	super(direction, position, dimension, SPEED, IMAGE);
	
	}
}
