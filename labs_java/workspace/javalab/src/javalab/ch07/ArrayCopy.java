package javalab.ch07;

public class ArrayCopy {

	public static void main(String[] args) {
		
		Book[] books = new Book[3];
		
		books[0] = new Book("태백산맥", "조정래");
		books[1] = new Book("데미안", "헤르만 헤세");
		books[2] = new Book("어떻게 살 것인가", "유시민");
		
		// shallow copy
		Book[] books1 = new Book[3];		
		
		System.arraycopy(books, 0, books1, 0, 3);
		
		books1[0].setBookName("나목");
		books1[0].setAuthor("박완서");
		
		books[0].showBookInfo();
		books1[0].showBookInfo();
		

		// deep copy. holy........... too many hands...
		Book[] books2 = new Book[3];
		books2[0] = new Book(); // input a new address
		books2[1] = new Book();
		books2[2] = new Book();
		
		// The object you want to copy 
		// to the conditional expression.
		
		
		for (int i=0, len=books.length; i<len; i++) {
			books2[i].setBookName(books[i].getBookName());
			books2[i].setAuthor(books[i].getAuthor());
		}
		
		books2[0].setBookName("태백산맥");
		books2[0].setAuthor("조정래");
		
		books[0].showBookInfo();
		books2[0].showBookInfo();
		
		// enhanced for loop
		for(Book el : books2) {
			el.showBookInfo();
		}
		
		
		
		
		
		
		
	}

}
