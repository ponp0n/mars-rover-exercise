package com.rover;

import java.util.ArrayList;
import java.util.List;

public class InstructionsParser {
	
	private static int NB_OF_PLATEAU_INSTRUCTIONS = 2;
	private static int NB_OF_POSITION_INSTRUCTIONS = 3;
	
	public static Plateau plateauInstructionsParser( String coordinatesToParse ) {
		String coordinates[] = coordinatesToParse.split(" ");
		
		if( coordinates.length != NB_OF_PLATEAU_INSTRUCTIONS ) {
			throw new IllegalArgumentException( "The plateau should have " 
					+ NB_OF_PLATEAU_INSTRUCTIONS + " coordinates." );
		}
		
		return new Plateau( Integer.parseInt( coordinates[0] ),
					Integer.parseInt( coordinates[1] ) );
	}
	
	public static Position positionInstructionsParser( String positionInstructions, Plateau plateau ) {
		String positionParts[] = positionInstructions.split(" ");
		
		if( positionParts.length != NB_OF_POSITION_INSTRUCTIONS ) {
			throw new IllegalArgumentException( "The rover should have " 
					+ NB_OF_POSITION_INSTRUCTIONS + " different instructions to be correctly initialized." );
		}
		
		return new Position(  Integer.parseInt( positionParts[0] ), 
				Integer.parseInt( positionParts[1] ), 
				Direction.valueOf( positionParts[2] ),
				plateau );	
	}
	
	public static List<Orders> roverInstructionsParser( String instructions ) {
		String parsedInstructions[] = instructions.split("");
		List<Orders> orders = new ArrayList<Orders>() ;
		
		for( int i = 0; i < parsedInstructions.length; i++ ) {
			orders.add( Orders.valueOf( parsedInstructions[i] ) );
		}
		
		return orders;
	}

}
