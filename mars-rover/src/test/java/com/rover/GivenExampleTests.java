package com.rover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GivenExampleTests {
	
	@Test
	void givenExampleShouldWork() {
		
		Plateau plateau = InstructionsParser.plateauInstructionsParser( "5 5" );
		Rover rover1 = new Rover( InstructionsParser.positionInstructionsParser( "1 2 N", plateau ), plateau );
		Rover rover2 = new Rover( InstructionsParser.positionInstructionsParser( "3 3 E", plateau ), plateau );
		
		rover1.followInstructions( InstructionsParser.roverInstructionsParser( "LMLMLMLMM" ) );
		rover2.followInstructions( InstructionsParser.roverInstructionsParser( "MMRMMRMRRM" ) );
		
		assertEquals( "1 3 N", rover1.givePosition() );
		assertEquals( "5 1 E", rover2.givePosition() );
	}

}
