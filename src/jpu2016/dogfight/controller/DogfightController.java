/**
 * 
 */
package jpu2016.dogfight.controller;

import java.util.ArrayList;

import jpu2016.dogfight.modele.Dimension;
import jpu2016.dogfight.modele.DogfightModel;
import jpu2016.dogfight.modele.IArea;
import jpu2016.dogfight.modele.IDogfightModel;
import jpu2016.dogfight.modele.IMobile;
import jpu2016.dogfight.view.IViewSystem;

/**
 * @author lanto
 *
 */
public class DogfightController implements IOrderPerformer, IDogfightModel, IViewSystem {

	int TIME_SLEEP = 30;
	
	public DogfightController(DogfightModel dogfightModel) {
		
	}
	
	public void play() {
		/*gameLoop();
		*/
	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		
	}
	
	private void lauchMissile(int player) {
		/*int xPlane;
		int yPlane;
		xPlane = player.getPosition().getX();
		yPlane = player.getPosition().getY();
		Position position = new Position(xPlane + 10, yPlane, 10000, 10000);
		Dimension dimension = new Dimension(30, 10);
		Mobile missile = new Missile(player.getDirection(), position, dimension, 4, "missile");*/
	}
	
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		/*if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() /
				weapon.getWidth()))
				&& ((weapon.getPosition().getX() / weapon.getWidth()) <=
				((mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()))) {
			if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY() / weapon.getHeight()))
					&& ((weapon.getPosition().getY() / weapon.getHeight()) <=
					((mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()))) {
				return true;
			}
		}
		return false;*/
		return true;
	} 
	
	private void manageCollision(){
		/*if (isWeaponOnMobile(null, null) == true) {
			
		}*/
	}
	
	private void gameLoop() {
		/*boolean bool = true;
		while(bool) {
			getMobile().move();
		}*/
	}
	
	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMoblie(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
	}

}