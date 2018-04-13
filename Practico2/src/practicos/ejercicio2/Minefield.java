package practicos.ejercicio2;


public class Minefield {

	private Mine[][] field;
	
	public Minefield() {
		field = new Mine[8][8];
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				field[i][j] = new Mine();
			}
		}	
	}
	
	public void open(int x, int y) {
		field[x][y].setOpened(true);
	}

	public void close(int x, int y) {
		field[x][y].setOpened(false);
	}

	public void mark(int x, int y) {
		field[x][y].setMarked(true);
	}

	public void unmark(int x, int y) {
		field[x][y].setMarked(false);
	}

	public void putMine(int x, int y) {
		field[x][y].setMined(true);
	}

	public void removeMine(int x, int y) {
		field[x][y].setMined(false);
	}

	
	public int minedNeighbours(int x, int y) {
		// TODO: Method must return the number of neighbors of position
		// (x,y) with mines.
    	if (!isValidCoordinate(x,y)){
    		throw new IllegalArgumentException("Invalid coordenate.");
    	}
        int mine = 0;
        //neighbors look limiting
        if (isValidCoordinate(x, y+1) ){
        	if ( field[x][y+1].isMined())
        		mine++;
        }        	
        if (isValidCoordinate(x+1, y+1)){
        	if ( field[x+1][y+1].isMined())
        		mine++;
        }        
        if (isValidCoordinate(x+1, y)){
        	if( field[x+1][y].isMined())
        		mine++;
        }            
        if (isValidCoordinate(x+1, y-1)){
        	if ( field[x+1][y-1].isMined())
        		mine++;
        }
        if (isValidCoordinate(x, y-1)){
        	if (field[x][y-1].isMined())
        		mine++;
        }
        if (isValidCoordinate(x-1, y-1)){
        	if(field[x-1][y-1].isMined())
        		mine++;        		
        }
        if (isValidCoordinate(x-1, y)){
        	if(field[x-1][y].isMined())
        		mine++;
        }
        if (isValidCoordinate(x-1, y+1)){
        	if (field[x-1][y+1].isMined())
        		mine++;
        }
        return mine;
    }
    
    /**
	 * @param row - number of row of the board
     * @param col - number of column of the board
	 * @return true when coordinate is valid rangethat takes
	 */
	public boolean isValidCoordinate(int x, int y) {
		return ( x>=0 && x<8 && y>=0 && y<8);	
	}
	
	
}
