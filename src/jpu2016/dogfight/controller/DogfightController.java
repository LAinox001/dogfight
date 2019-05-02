/**
 * 
 */
package jpu2016.dogfight.controller;

/**
 * @author lanto
 *
 */
public class DogfightController implements IOrderPerformer {

	int TIME_SLEEP = 30;
	
	public DogfightController(IDogfightModel dogfightModel) {
		
	}
	
	public void play() {
		
	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		
	}
	
	private void lauchMissile(int player) {
		int xPlane;
		int yPlane;
		xPlane = player.getPosition().getX();
		yPlane = player.getPosition().getY();
		Position position = new Position(xPlane + 10, yPlane, 10000, 10000);
		Dimension dimension = new Dimension(30, 10);
		Mobile missile = new Missile(player.getDirection(), position, dimension, 4, "missile");
	}
	
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() /
				weapon.getWidth()))
				&& ((weapon.getPosition().getX() / weapon.getWidth()) <=
				((mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()))) {
			if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY() / weapon.getHeight()))
					&& ((weapon.getPosition().getY() / weapon.getHeight()) <=
					((mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()))) {
				return true;
			}
		}
		return false;
	} 
	
	private void manageCollision(){
		if (isWeaponOnMobile(null, null) == true) {
			
		}
	}
	
	private void gameLoop() {
		
	}
	
	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}

}