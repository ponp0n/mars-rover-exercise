package com.rover;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PlateauSpecsTest {

	Plateau plateau = InstructionsParser.plateauInstructionsParser( "12 15" );
	Position position = new Position( 12, 2, Direction.E, plateau );
	Rover rover = new Rover( position, plateau );
	
	@Test
	void zeroCoordinatesShouldBePlateauLowerLeftCoordinates() {
		assertTrue( plateau.isXInsideBoundaries(0) );
		assertTrue( plateau.isYInsideBoundaries(0) );
		assertFalse( plateau.isXInsideBoundaries(-1) );
		assertFalse( plateau.isYInsideBoundaries(-1) );
	}
	
	@Test
	void givenCoordinatesShouldBePlateauUpperRightCoordinates() {
		assertTrue( plateau.isXInsideBoundaries(12) );
		assertTrue( plateau.isYInsideBoundaries(15) );
		assertFalse( plateau.isXInsideBoundaries(13) );
		assertFalse( plateau.isYInsideBoundaries(16) );
	}
	
	@Test
	void plateauCoordinatesShouldNotBeNegative() {
		assertThrows( IllegalArgumentException.class, () -> new Plateau(-2, 0) );
		assertThrows( IllegalArgumentException.class, () -> new Plateau(2, -1) );
		assertThrows( IllegalArgumentException.class, () -> new Plateau(-2, -5) );
	}
	
	@Test
	void aRoverShouldNotBeAllowedToGoOutsideOfThePlateau() {
		List<Orders> orders = new ArrayList<Orders>();
		orders.add( Orders.M );
		
		assertThrows( IllegalArgumentException.class, () -> rover.followInstructions( orders ) );
	}
}
