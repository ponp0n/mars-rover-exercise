package com.rover;

public enum Orders {
	
	M { //MOVE FORWARD ORDER
		@Override
		public void obey( Position pos ) {
			pos.moveForward();
		}
	},
	L { //TURN LEFT ORDER
		@Override
		public void obey( Position pos ) {
			pos.turnLeft();
		}
	},
	R { //TURN RIGHT ORDER
		@Override
		public void obey( Position pos ) {
			pos.turnRight();
		}
	};
	
	public abstract void obey( Position pos );	
	
}
