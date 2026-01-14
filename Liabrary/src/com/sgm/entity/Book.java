package com.sgm.entity;

public class Book {
  private int bookId;
  private String bookName;
  private String author;
  private int price;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Book(int bookId, String bookName, String author, int price) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.author = author;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
}
public Book(String bookName, String author, int price) {
	super();
	this.bookName = bookName;
	this.author = author;
	this.price = price;
}
  
	

}
