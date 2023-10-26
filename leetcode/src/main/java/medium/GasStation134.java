package medium;
/*
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. 
You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, 
return the starting gas station's index if you can travel around the circuit 
once in the clockwise direction, otherwise return -1. 
If there exists a solution, it is guaranteed to be unique


 */

public class GasStation134 {

	public static void main(String[] args) {
				
		int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
		
		canCompleteCircuit(gas,cost);
	}
	
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	//first see if total gas is enough to cover the circle cost
    	int totalGas =0;
    	int totalCost =0;
    	for(int i=0;i<gas.length;i++) {
    		totalGas += gas[i];
    		totalCost += cost[i];
    	}
    	
    	if(totalGas < totalCost) 
    		return -1;
    	
    	int remainsGas = 0, start = 0;
    	 for(int i = 0 ; i < gas.length; i++){
    		 remainsGas += (gas[i] - cost[i]);
    		 
    		 if(remainsGas <0) {
    			 start = i+1;
    			 remainsGas =0;
    		 }
    	 }
    	return start;
    }

}
