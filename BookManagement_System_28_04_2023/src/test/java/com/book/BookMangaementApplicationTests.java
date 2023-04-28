package com.book;

import static org.hamcrest.CoreMatchers.theInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.book.bookservice.BookService;
import com.book.entity.Book;
import com.book.repository.BookRepository;

@SpringBootTest
class BookMangaementApplicationTests {

//	@Autowired
//	BookService bs;
//	@MockBean
//	BookRepository brepo;
//	
//	@Test
//	void contextLoads() {
//		Book b1 = new Book(1,"JAVA","java",200);
//		Mockito.when(brepo.save(b1)).thenReturn(b1);
//		assertEquals(b1, bs.addBook(b1));
//	}
//	@Test
//	void testgetBook() {
//		Optional<Book> book = Optional.of(new Book(13,"JAVA","java",200));
//		Mockito.when(brepo.findById((long) 13)).thenReturn(book);
//		assertEquals("JAVA", bs.getBookById(13).getName());
//	}
//	
//	@Test
//	void testgetName() {
////		Optional<Book> book = Optional.of(new Book(14,"C++","java",200));
//		Mockito.when(brepo.findBookByname("C++")).thenReturn(new Book(14,"C++","java",200));
//		assertEquals(200, bs.findBookByName("C++").getPrice());
//		}
//	
//	@Test
//	void testgetPrice() {
////		/Optional <Book> book = Optional.of(new Book(115,"C++ Programming", "John Doe",200));
//		Mockito.when(brepo.findBookByprice((long) 200)).thenReturn(new Book(115,"C++ Programming", "John Doe",200));
//		assertEquals(115, bs.findBookByPrice(200).getId());
//		}
//	
////	@Test
////	void getAll() {
////		List<Book>book = Stream.of(new Book(101,"food","j",120), new Book(11,"food","j",1020))
////				.collect(Collectors.toList());
////		Mockito.when(brepo.findAll()).thenReturn(book);
////		assertEquals(2, bs.getBook());
////	}

}
