package com.ABC.Encaps;

class Book
{
	private String title;
	
	public Book(String title)
	{
		this.title=title;
	}
	public void ShowBook()
	{
		System.out.println("Book: "+title);
	}
}
class Library{
	private Book book;//Cyomposition : Library HAS-A Book
	
	public Library(Book book)
	{
		this.book=book;
	}

    public void ShowLibraryBooks()
    {
	  System.out.println("Library contains:");
	  book.ShowBook();
    }
}

public class CompositionExample {

	public static void main(String[] args) {
		Book myBook = new Book("Harry Potter"); // create a book
		Library mylibrary = new Library(myBook);//Inject Book into Library
        mylibrary.ShowLibraryBooks();
	}

}
