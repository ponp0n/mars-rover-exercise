package com.rover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main( String[] args ) {
		List<Rover> rovers = new ArrayList<>();
		Scanner sc = new Scanner( System.in );
		Plateau plateau = InstructionsParser.plateauInstructionsParser( sc.nextLine() );
		
		while( sc.hasNext() ) {
			String instructions = sc.nextLine();
			
			if( instructions.equals("exit") ) //Added to make Eclipse testing easier
				break;
			
			Position pos = InstructionsParser.positionInstructionsParser( instructions, plateau );

			Rover rover = new Rover( pos, plateau );
				
			rover.followInstructions( InstructionsParser.roverInstructionsParser( sc.nextLine() ) );
			rovers.add( rover );
		}
		
		rovers.forEach( rover -> System.out.println( rover.givePosition() ) );
		sc.close();
	}

}
