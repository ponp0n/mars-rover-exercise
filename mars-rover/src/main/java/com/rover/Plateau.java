package com.rover;

public class Plateau {
	
	private final int xLimit;
	private final int yLimit;

	public Plateau( int xLimit, int yLimit ) {
		if( xLimit < 0 || yLimit < 0 )
			throw new IllegalArgumentException( "Plateau coordinates cannot be negative" );
		
		this.xLimit = xLimit;
		this.yLimit = yLimit;
	}
	
	public boolean isXInsideBoundaries( int x ) {
		return x <= xLimit && x >= 0;
	}
	
	public boolean isYInsideBoundaries( int y ) {
		return y <= yLimit && y >= 0;
	}

}
