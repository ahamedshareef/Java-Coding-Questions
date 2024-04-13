import java.util.PriorityQueue;

public class MinNumberGame2974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MinNumberGame2974().numberGame(new int[] {5,4,2,3});

	}
	
	public int[] numberGame(int[] nums) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<nums.length;i++) {
			pq.add(nums[i]);
		}
		int res[] = new int[nums.length];
		int i=0;
		while(!pq.isEmpty()) {
			int a = pq.poll();
			int b =pq.poll();
			res[i++] =b;
			res[i++] =a;
		}
		
		return res;
		
	}

}
