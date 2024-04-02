package com.ohgiraffers.section01.object.book;

public class Book {

    private int no;
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(int no, String title, String author, int price) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        Book other = (Book) obj;

        if (this.no != other.no) {
            return false;
        }
        if (this.title == null) {

            if (other.title != null) {

                return false;
            }
        } else if (!this.title.equals(other.title)) {
            return false;
        }
        if(this.price != other.price){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        int result = 1;

        final int PRIME = 31;

        result = PRIME * result + this.no;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;

    }
}

