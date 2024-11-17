package DataStructures;

import java.util.ArrayList;

public interface StateSpace<Node> {
	public Node getStart();
	public ArrayList<Node> getNeighbors();
	public boolean isGoal(Node node);
	public double getCost(Node from, Node to);
}
