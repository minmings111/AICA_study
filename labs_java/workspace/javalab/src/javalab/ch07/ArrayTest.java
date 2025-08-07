package javalab.ch07;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] nums = new int [] {1,2,3,4,5,6,7,8,9,10};
		
		for(int idx = 0, len=nums.length; idx < len; idx++) {
			System.out.println("index of nums: "+ idx + ", status: " + nums[idx]);
		}

		// object array
		
		Book[] books = new Book[5];
		
		books[0] = new Book("태백산맥", "조정래");
		books[1] = new Book("데미안", "헤르만 헤세");
		books[2] = new Book("어떻게 살 것인가", "유시민");
		books[3] = new Book("토지", "박경리");
		books[4] = new Book("어린왕자", "생텍쥐페리");
		
		for(int i = 0, len=books.length; i < len; i ++) {
			books[i].showBookInfo();
		}
		
		
		//
		int [][] arr = {{1,2,3},{4,5,6}}; 
		
		for(int i = 0; i<arr.length;i++) {
			for (int j= 0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			} // end j
			System.out.println(); // new line for easy read
		} //end i
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		

		
		
	}

}


