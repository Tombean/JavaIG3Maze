package maze;

public class Cell {
	boolean visited;
	boolean depart;
	boolean arrival;
	boolean accesible;
	
	public Cell( boolean visited, boolean depart, boolean arrival,boolean accesible){
		this.visited=visited;
		this.depart=depart;
		this.arrival=arrival;
		this.accesible=accesible;
		
	}

}
