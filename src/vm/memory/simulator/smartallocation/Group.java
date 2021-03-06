package vm.memory.simulator.smartallocation;

import java.util.LinkedHashSet;
import java.util.Set;

import vm.memory.simulator.ObjectNode;

public class Group {
	private Set<Model> _nodes = new LinkedHashSet<Model>();

	private int _buff;
	
	public Group(){
		_buff = 0;
	}
	
	public void addNode(ObjectNode node){
		_nodes.add(new Model(node));
	}
	
	public int estimateSize(){
		int size =0 ;
		for(Model model: _nodes){
			size+=model._size;
		}
		return size+_buff;
	}
	
}
