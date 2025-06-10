package iPoutputs;

public class BookTest {

	public static void main(String[] args) {
		Author author1 = new Author("Marcus Laurence", "marcus@pogi.com");
		Author author2 = new Author("Marcus Laurence", "marcuslaurence@pogi.com");
		System.out.println("Author " + author1.toString());
		System.out.println("Author " + author2.toString());
		
		Book book1 = new Book("0061964360", "Intermediate Programming using Java", author1, 3200.25, 120);
		Book book2 = new Book("0061964360", "Intermediate Programming using Java", author2, 4675.75, 180);
		System.out.println("\nBook " + book1.toString());
		System.out.println("Book " + book2.toString());
		
		System.out.println("\nISBN:           " + book1.getIsbn());
		System.out.println("Title:          " + book1.getTitle());
		System.out.println("Price:          " + book1.getPrice());
		System.out.println("Quantity:       " + book1.getQty() + " pcs");
		System.out.println("Author:         " + book1.getAuthor());
		System.out.println("Author's Name:  " + author1.getName());
		System.out.println("Author's Email: " + author1.getEmail());
		
		System.out.println("\nISBN:           " + book2.getIsbn());
		System.out.println("Title:          " + book2.getTitle());
		System.out.println("Price:          " + book2.getPrice());
		System.out.println("Quantity:       " + book2.getQty() + " pcs");
		System.out.println("Author:         " + book2.getAuthor());
		System.out.println("Author's Name:  " + author2.getName());
		System.out.println("Author's Email: " + author2.getEmail());
	}

}
