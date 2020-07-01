package com.rover;

public enum Direction {
	
	N { //NORTH
		@Override
		public void moveForward( Coordinate coord ) {
			coord.incrementY();
		}

		@Override
		public Direction turnLeft() {
			return Direction.W;
			
		}

		@Override
		public Direction turnRight() {
			return Direction.E;
		}
	},
	
	S { //SOUTH
		@Override
		public void moveForward( Coordinate coord ) {
			coord.decrementY();			
		}

		@Override
		public Direction turnLeft() {
			return Direction.E;			
		}

		@Override
		public Direction turnRight() {
			return Direction.W;
		}
	},
	
	W { //WEST
		@Override
		public void moveForward( Coordinate coord ) {
			coord.decrementX();
		}

		@Override
		public Direction turnLeft() {
			return Direction.S;
		}

		@Override
		public Direction turnRight() {
			return Direction.N;
			
		}
	},
	
	E { //EAST
		@Override
		public void moveForward( Coordinate coord ) {
			coord.incrementX();
		}

		@Override
		public Direction turnLeft() {
			return Direction.N;
		}

		@Override
		public Direction turnRight() {
			return Direction.S;
		}
	};
	
	public abstract void moveForward( Coordinate coord );
	public abstract Direction turnLeft();
	public abstract Direction turnRight();
}
