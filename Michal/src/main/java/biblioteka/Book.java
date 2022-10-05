package biblioteka;

import java.util.ArrayList;

public class Book {
    private int index;
    private String author;
    private String title;
    private int publishYear;
    private double price;
    private Reader bookReader; // available book = null, rented book will have user here.


    public Book(int index, String author, String title, int publishYear, double price, Reader bookReader) {
        this.index = index;
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
        this.bookReader = bookReader;

    }
    public Book(){
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Reader getBookReader() {
        return bookReader;
    }

    public void setBookReader(Reader bookReader) {
        this.bookReader = bookReader;
    }





    @Override
    public String toString() {
        return  index +
                ". " + author +
                ", " + title +
                ", Rok Wydania: " + publishYear +
                ", Cena : " + price +
                ", STATUS: " + ((bookReader == null)? "Książka dostępna" : bookReader);
        }
                }



