package Heap;

import java.util.ArrayList;
import java.util.List;

// heap is just like tree but complete and can have duplicate.
// when max value is on the top is called max-heap
// when top is minimum than bottom is called min heap
// Implement using arraylist,

public class Heap {
	
	private List<Integer> heap;
	
	public Heap(){
	this.heap = new ArrayList<>();
	}
	
	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}
	
	private int leftChild(int index) {
		return 2*index +1;
	}
	
	private int rightChild(int index) {
		return 2*index +2;
	}
	
	private int parent(int index) {
		return (index-1)/2;
	}
	private void swap(int index1, int index2) {
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}
	
	public void insert(int value) {
		heap.add(value);
		int current = heap.size()-1;
		
		
		while(current >0 && heap.get(current)>heap.get(parent(current))) {
			swap(current,parent(current));
			current = parent(current);
		}
		
	}
	
	public Integer remove() {
		
		if(heap.size()==0) return null;
		
		if(heap.size()==1) return heap.remove(0);
		
		int maxValue = heap.get(0);
		heap.set(0, heap.remove(heap.size()-1));
		sinkDown(0);
		
		return maxValue;
	}

	private void sinkDown(int index) {
	    // Start at the provided index (this is typically the root)
	    int maxIndex = index;
	    
	    // Continue sinking down until the element at maxIndex is correctly positioned
	    while (true) {
	        // Get indices of left and right children
	        int leftIndex = leftChild(index);
	        int rightIndex = rightChild(index);
	 
	        // If left child exists and is greater than the current max,
	        // then update maxIndex to left child's index
	        if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
	            maxIndex = leftIndex;
	        }
	 
	        // If right child exists and is greater than the current max,
	        // then update maxIndex to right child's index
	        if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
	            maxIndex = rightIndex;
	        }
	 
	        // If maxIndex has changed (i.e., one of the children was greater),
	        // then swap the current element with the larger child and continue sinking down
	        if (maxIndex != index) {
	            swap(index, maxIndex);
	            index = maxIndex;
	        } else {
	            // If the element has not been swapped, this means it's in the correct position,
	            // so we break the loop and end the method
	            return;
	        }
	    }
	}
	
	
	}

