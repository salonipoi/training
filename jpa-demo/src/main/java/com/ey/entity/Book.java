package com.ey.entity;//record in dB table

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//mapping to SQL

@Entity 								// mandatory annotation to make a java class /object into an entity
@Table(name = "books")
@NamedQueries(
		@NamedQuery(name="byauthor",query="FROM Book WHERE author =:auth")
		)

public class Book {
	@Id 								// mandatory annotation to make a java class /object into an entity
	private int isbn;
	@Column(length = 30)
	private String title;
	@Column(length = 30)
	private String author;
	private double price;

	public Book() {
	}

	public Book(int isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
//bean in spring
//java bean in java