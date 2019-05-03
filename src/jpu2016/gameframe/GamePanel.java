package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5123288060403239869L;

	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics graphic) {
		
	}
}
