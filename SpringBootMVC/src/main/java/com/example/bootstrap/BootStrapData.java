package com.example.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Author;
import com.example.model.Book;
import com.example.model.Publisher;
import com.example.repositories.AuthorRepository;
import com.example.repositories.BookRepository;
import com.example.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Started BootStrap");

		Publisher publisher = new Publisher();
		publisher.setName("WTC Publisher");
		publisher.setAddress("Colombo");
		publisher.setEmail("wtc@gamil.com");

		publisherRepository.save(publisher);

		System.out.println("Publisher Count " + publisherRepository.count());

		Author eric = new Author("Eric", "eric@gmail.com");
		Book nun = new Book("nun", "horrer", 2434);
		eric.getBook().add(nun);
		nun.getAuthor().add(eric);
		
		nun.setPublisher(publisher);
		publisher.getBooks().add(nun);

		authorRepository.save(eric);
		bookRepository.save(nun);
		publisherRepository.save(publisher);

		Author devid = new Author("Devid", "devid@gmail.com");
		Book love = new Book("love", "drama", 3425);
		devid.getBook().add(love);
		love.getAuthor().add(devid);
		
		love.setPublisher(publisher);
		publisher.getBooks().add(love);
		authorRepository.save(devid);
		bookRepository.save(love);
		publisherRepository.save(publisher);

		System.out.println("Number of Books : " + bookRepository.count());
		System.out.println("Publisher Number of Books "+ publisher.getBooks().size());
	}

}
