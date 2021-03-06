package vm.memory.simulator.gc;

import java.util.Set;

import vm.memory.simulator.ObjectNode;

public class PostRunner implements IGCAction {

	Set<ObjectNode> _workings;
	
	public PostRunner(Set<ObjectNode> workings){
		_workings = workings;
	}
	
	@Override
	public void run() {
		_workings.clear();
	}

}
