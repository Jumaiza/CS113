//Zaid Abu Jumaiza - CS113004

public class Book {

	private int pages;
	private String title;
	
	public Book(int p, String t) {
		pages = p;
		title = t;
	}
	
	public void setPages(int p) {
		pages = p;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public int getPages() {
		return pages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return "The book "+title+" has "+pages+" pages.";
	}
	
	public boolean equals(Book book1, Book book2) {
		if (book1.getTitle()==book2.getTitle()) {
			if (book1.getPages()==book2.getPages()) {
				return true;
			}
	}
		return false;
	}
	
	public int compareTo(Book book2) {
		if(pages<book2.getPages()) {
			return -1;
		}
		else if (pages>book2.getPages()){
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	
}
	
	
