package com.kooki.practice.collection.list.library.model.vo;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String category;
    private int price;

    public Book(){}

    public Book(String title, String author, String category, int price){
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(category, book.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, category, price);
    }
}
