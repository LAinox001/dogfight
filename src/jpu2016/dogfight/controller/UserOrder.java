/**
 * 
 */
package jpu2016.dogfight.controller;

/**
 * @author lanto
 *
 */
public class UserOrder implements IUserOrder {
	private int player;
	private Order order;
	
	public UserOrder(int player, Order order) {
		
	}
	
	public Order getOrder() {
		return new Order;
	}
	
	public int getPlayer() {
		return 1;
	}
}