package com.example.model;

public class Book {
	
	private int id;
	private String name;
	private String category;
	private Double Price;
	private Author author;
	private int ISBN_Number;
	private String publisher;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getISBN_Number() {
		return ISBN_Number;
	}
	public void setISBN_Number(int iSBN_Number) {
		ISBN_Number = iSBN_Number;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	

}
