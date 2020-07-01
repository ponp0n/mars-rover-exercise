package com.rover;

public class Position {

	private Coordinate coord;
	private Direction dir;
	
	public Position( int x, int y, Direction dir, Plateau plateau ) {
		if( !plateau.isXInsideBoundaries(x) || !plateau.isYInsideBoundaries(y) )
			throw new IllegalArgumentException("Rover coordinates cannot be negative or outside the plateau");
		
		this.coord = new Coordinate( x, y );
		this.dir = dir;		
	}	

	
	@Override
	public String toString() {
		return coord.toString() + " " + dir;
	}


	public void moveForward() {
		dir.moveForward( coord );
	}


	public void turnLeft() {
		dir = dir.turnLeft();
	}


	public void turnRight() {
		dir = dir.turnRight();
	}
	
	
	public boolean isInsidePlateau( Plateau plateau ) {
		return coord.isInsidePlateau( plateau );
	}
	

}
