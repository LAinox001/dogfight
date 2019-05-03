package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

import jpu2016.dogfight.modele.Dimension;
import jpu2016.dogfight.modele.IArea;
import jpu2016.dogfight.modele.IDogfightModel;
import jpu2016.dogfight.modele.IMobile;

public class GraphicsBuilder implements IDogfightModel{
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	
	public int getGlobalWidth() {
		return 1;
	}
	
	public int getGlobalHeight() {
		return 1;
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
