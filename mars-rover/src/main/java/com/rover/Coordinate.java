package com.rover;

public class Coordinate {
	
	private int x;
	private int y;
	
	public Coordinate( int x, int y )
	{		
		this.x = x;
		this.y = y;
	}

	public void incrementX() {
		x++;
	}

	public void decrementX() {
		x--;
	}

	public void incrementY() {
		y++;
	}

	public void decrementY() {
		y--;
	}
	

	@Override
	public String toString() {
		return x + " " + y;
	}

	
	public boolean isInsidePlateau( Plateau plateau ) {
		return plateau.isXInsideBoundaries(x) && plateau.isYInsideBoundaries(y);
	}
}
