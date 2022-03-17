package com.company;

public class BookListing {
    private Book book1;
    private double price;

    public BookListing(Book b, double p){
        book1=b;
        price=p;
    }
    public void printDescription(){
        book1.printBookInfo();
        System.out.println(", $"+price);
    }
}
