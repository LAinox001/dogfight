package jpu2016.dogfight.modele;

public interface IMobile {
	
	public Direction getDirection();
	
	public void setDirection(Direction direction);
	
	public Point getPosition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public int getSpeed();
	
	public Image getImage();
	
	public void move();
	
	public void placeineArea(IArea area);
	
	public boolean isPlayer(int playuer);
	
	public void setDogfightModel(DogfightModel dogfightModel);
	
	public boolean hit();
	
	public boolean isWeapon();
}