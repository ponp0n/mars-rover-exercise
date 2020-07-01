package com.rover;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RoverSpecsTest {

	Plateau plateau = InstructionsParser.plateauInstructionsParser( "12 15" );
	Position position = new Position( 1, 2, Direction.N, plateau );
	Rover rover = new Rover( position, plateau );
	
	
	@Test
	void givenPositionShouldBeRoverPosition() {
		assertEquals( "1 2 N", rover.givePosition() );
	}
	
	@Test
	void movingNorthShouldIncrementYAndNothingElse() {
		rover.followInstructions( Arrays.asList( Orders.M ) );
		assertEquals( "1 3 N", rover.givePosition() );
	}
	
	@Test
	void movingSouthShouldDecrementYAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.S, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.M ) );
		
		assertEquals( "1 1 S", rover.givePosition() );
	}
	
	@Test
	void movingEastShouldIncrementXAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.E, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.M ) );
		
		assertEquals( "2 2 E", rover.givePosition() );
	}
	
	@Test
	void movingWestShouldDecrementXAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.W, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.M ) );
		
		assertEquals( "0 2 W", rover.givePosition() );
	}
	
	@Test
	void turningLeftShouldTurnNorthIntoWestAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.N, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.L ) );
		
		assertEquals( "1 2 W", rover.givePosition() );
	}
	
	@Test
	void turningLeftShouldTurnWestIntoSouthAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.W, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.L ) );
		
		assertEquals( "1 2 S", rover.givePosition() );
	}
	
	@Test
	void turningLeftShouldTurnSouthIntoEastAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.S, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.L ) );
		
		assertEquals( "1 2 E", rover.givePosition() );
	}
	
	@Test
	void turningLeftShouldTurnEastIntoNorthAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.E, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.L ) );
		
		assertEquals( "1 2 N", rover.givePosition() );
	}
	
	@Test
	void turningRightShouldTurnNorthIntoEastAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.N, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.R ) );
		
		assertEquals( "1 2 E", rover.givePosition() );
	}
	
	@Test
	void turningRightShouldTurnEastIntoSouthAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.E, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.R ) );
		
		assertEquals( "1 2 S", rover.givePosition() );
	}
	
	@Test
	void turningRightShouldTurnSouthIntoWestAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.S, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.R ) );
		
		assertEquals( "1 2 W", rover.givePosition() );
	}
	
	@Test
	void turningRightShouldTurnWestIntoNorthAndNothingElse() {
		rover = new Rover( new Position( 1, 2, Direction.W, plateau ), plateau );
		rover.followInstructions( Arrays.asList( Orders.R ) );
		
		assertEquals( "1 2 N", rover.givePosition() );
	}

}
