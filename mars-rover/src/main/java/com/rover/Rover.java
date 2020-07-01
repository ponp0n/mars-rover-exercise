package com.rover;

import java.util.List;

public class Rover {

	private Position position;
	private Plateau plateau;
	
	public Rover( Position position, Plateau plateau ) {
		this.position = position;
		this.plateau = plateau;
	}


	public void followInstructions( List<Orders> orders ) {	
		for( int i = 0; i < orders.size(); i++) {
				 orders.get(i).obey( position );
				 
				 if( !position.isInsidePlateau( plateau ) )
					 throw new IllegalArgumentException( "The rover tried to go beyound the boundaries of the plateau" );
		}
	}
	

	public String givePosition() {
		return position.toString();
	}
	
}
