package CodingNinjas;

/*
 * GIven fishes in a river {4,2,3,1,5} we have to return how many fishes will survey at end of the day.
example below
1. As fish 4 is faster and bigger than fish 2, so fish 4 will eat fish 2.
    Remaining fishes: { 4, 3, 1, 5 }

2. As fish 3 is faster and bigger than fish 1, so fish 3 will eat fish 1.
    Remaining fishes: { 4, 3, 5 }

3. As fish 4 is faster and bigger than fish 3, so fish 4 will eat fish 3.
    Remaining fishes: { 4, 5 }

Now fish 5 cannot eat fish 4, as fish 5 is faster than fish 4 and they swim from left to right. Thus, fish 4 will never reach fish 5.

Finally, we are left with only 2 fishes.

there-is-a-river-which-flows-in-one-direction-one-day-the-river-has-n-number-of-fishes-you-are-given-an-array-fishes-of-integers-representing-the-size-of-n-fishes-the-fishes-are-present-in-the-river-from-left-to-right-0th-index-represents-the-size-of-the-leftmost-fish-as-the-river-flows-from-left-to-right-so-the-fishes-also-swim-from-left-to-right-the-fishes-are-of-different-sizes-and-have-different-speeds-the-larger-fishes-are-faster-than-the-smaller-fishes-also-larger-fishes-can-eat-smaller-fishes-but-can-t-eat-fishes-of-the-same-size
 */

public class FishesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] fishes = {4,2,3,1,5}; //4 4 2 4 -> 3
		System.out.println(fishEater2(fishes));
		
		

	}
	
	private static int fishEater2(int[] fishes) {
		  int ans = 0;

	        // Variable to store the largest fish till the current fish.
	        int maxSize = 0;

	        // Iterating each fish.
	        for(int fish: fishes) {
	            // If the current fish is greater than or equal to largest, then it will survive.
	            if(fish >= maxSize) {
	                ans++;
	                maxSize = fish;
	            }
	        }
	        // Return the total number of surviving fishes.
	        return ans;
	}
	
	//mysolution is below:

	public static int fishEater(int[] fishes) {
		
		int eaten =0;
		
		
		for(int i=0;i<fishes.length-1;i++) 
		{
			if(fishes[i]>fishes[i+1])
			{eaten++;
			int temp= fishes[i+1];
			fishes[i+1] = fishes[i];
			fishes[i] = temp;
			}
			
		}
		
		return fishes.length-eaten;
	}
	

}
