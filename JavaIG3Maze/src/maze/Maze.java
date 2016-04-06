package maze;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import graphImpl.AdjMatric;

public class Maze extends AdjMatric {
	private Cell[][] labyrinth;
	private int width;
	private int height;

	public Maze(int numCell, boolean directed) {
		super(numCell, directed);
		labyrinth= new Cell[numCell][numCell];
		// TODO Auto-generated constructor stub
		
	}

	

}
