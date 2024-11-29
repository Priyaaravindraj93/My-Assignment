package week2.day1;

public class Library {

	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}

	public void issuebook() 
	{System.out.println("Book issued successfully");
	
	}
	public static void main(String[] args) {
		Library obj1 =new Library();
		obj1.addBook("bookTitle");
		obj1.issuebook();
	}
}
