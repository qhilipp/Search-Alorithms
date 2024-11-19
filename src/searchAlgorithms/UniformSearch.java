package searchAlgorithms;

import heuristic.ConstantHeuristic;
import searchStrategy.Uniform;
import stateSpace.StateSpace;

public class UniformSearch<Node> extends GeneralSearch<Node> {

	public UniformSearch(StateSpace<Node> space) {
		super(space, new Uniform<>(), new ConstantHeuristic<>());
	}

}
