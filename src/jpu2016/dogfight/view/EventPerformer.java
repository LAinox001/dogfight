package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer implements IOrderPerformer{
	public EventPerformer(IOrderPerformer orderPerformer) {
		
	}
	
	public void eventPerformer(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		return new UserOrder(keyCode, null);
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}
}
