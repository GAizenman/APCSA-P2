//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;

	public Ship() {
		this(40, 40, 40, 40, 1);
	}

	public Ship(int x, int y) {
		this(x, y, 40, 40, 1);
	}

	public Ship(int x, int y, int s) {
		this(x, y, 40, 40, s);
	}

	public Ship(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			image = ImageIO.read(new File("ship.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {

		// remember that 0,0 is in top left of screen
		if (direction.equals("LEFT") && getX() > 0) {
			setX(getX() - speed);
		} else if (direction.equals("RIGHT") && getX() < 800) {
			setX(getX() + speed);
		} else if (direction.equals("UP") && getY() > 0) {
			setY(getY() - speed);
		} else if (direction.equals("DOWN") && getY() < 500) {
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