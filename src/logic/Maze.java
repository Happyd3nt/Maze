package logic;

public class Maze {
	char grid[][];
	
	//Constructor
	public Maze(char [][] m) {
		this.grid = m;
	}
	//Transforms grid in String
	public String toString(Dragon myDragon, Sword mySword){
		String maze="";
		if(myDragon.getX() == mySword.getX() && myDragon.getY() == mySword.getY())
			grid[myDragon.getX()][mySword.getY()] = 'F';
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				maze = maze +grid[i][j] + " ";
			}
			maze = maze +"\n";
		}	
		return maze;
	}

	
	/**
	 * Places any actor in the maze
	 * @param a Actor to place
	 */
	public void placeActor(Actor a){
		if(!a.isDead())
			grid[a.getX()][a.getY()] = a.getC();
	}
	
	public void removeActor(Actor a){
		grid[a.getX()][a.getY()]=' ';
	}
}
