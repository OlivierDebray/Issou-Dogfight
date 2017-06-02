package issou_dogfight.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {
	
	

public IArea getArea();
	

public void buildArea(Dimension dimension);

public void addMobile(IMobile Mobile);

public void removeMobile(IMobile Mobile);

public ArrayList<IMobile> getMobile();

public IMobile getMobileByPlayer(int palyer);


public void setMobilesHavesMoved(int MobilesHavesMoved); 
}
