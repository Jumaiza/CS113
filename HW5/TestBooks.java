//Zaid Abu Jumaiza - CS113004

import java.util.Scanner;
import java.util.ArrayList;

public class TestBooks {

	public static void main(String[] args) {
		
		Scanner bot = new Scanner(System.in);
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		System.out.println("Enter books you read during the summer!");
		System.out.println("Type -1 to close the program!");
		System.out.println("Press Enter to start!");

		String title;
		while(!(title = bot.nextLine()).equals("-1")) {
			System.out.println("Title: ");
			title = bot.nextLine();
			System.out.println("Number of pages: ");
			int pages = Integer.parseInt(bot.nextLine());
			books.add(new Book(pages,title));
			System.out.println("Press Enter to add another book or -1 to close the program");
		}
		
		Book smallestBook = new Book(0,"");

		for (int i = 0; i<books.size();i++) {
			Book smallest = books.get(0);
			if (books.get(i).compareTo(smallest)==-1) {
				smallest = books.get(i);
			}
			
			smallestBook.setPages(smallest.getPages());
			smallestBook.setTitle(smallest.getTitle());
		}
		
		System.out.println();
		System.out.println("\"Smallest\" Book: "+smallestBook.toString());
		
		int total = 0;
		for (int i = 0; i<books.size();i++) {
			total += books.get(i).getPages();
		}
		
		double average = ((double)total)/books.size();
		System.out.println("The average number of pages per book is "+average+" pages.");
	}

}
