package com.ey.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.dao.BookDao;
import com.ey.entity.Book;

public class TestBookDao {
	private static BookDao dao;

	@BeforeAll
	public static void init() {
		dao = new BookDao();
	}

	@Test
	public void testSave() {
		Book b = new Book(12345, "THe Alchemist", "Paulo Coelho", 266);
		dao.save(b);
	}

	@Test
	public void testList() {
		List<Book> books = dao.list();

		assertNotNull(books);
		books.forEach(System.out::println);

	}

	@Test
	public void testFindByIsbn() {
		Book b = dao.findByIsbn(12345);
		assertNotNull(b);
		System.out.println(b);
	}

	@Test
	public void testUpdate() {

	}

	@Test
	public void testDelete() {
		dao.delete(1234);
	}

	@Test
	public void testFindByAuthor() {
		List<Book> books = dao.findByAuthor("Paulo Coelho");
		assertNotNull(books);
		books.forEach(System.out::println);
	}
}
