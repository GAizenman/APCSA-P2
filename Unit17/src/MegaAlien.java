//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class MegaAlien extends MovingThing {
	private int speed;
	private Image image;

	public MegaAlien() {
		this(0, 0, 30, 30, 0);
	}

	public MegaAlien(int x, int y) {
		this(x, y, 30, 30, 0);
	}

	public MegaAlien(int x, int y, int s) {
		this(x, y, 30, 30, s);
	}

	public MegaAlien(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		setSpeed(s);
		try {
			image = ImageIO.read(new File("alien.JPG"));
		} catch (Exception e) {
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {
		if (direction.equals("LEFT")) {
			setX(getX() - speed);
		} else if (direction.equals("RIGHT")) {
			setX(getX() + speed);
		} else if (direction.equals("UP")) {
			setY(getY() - speed);
		} else if (direction.equals("DOWN")) {
			setY(getY() + speed);
		}
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}