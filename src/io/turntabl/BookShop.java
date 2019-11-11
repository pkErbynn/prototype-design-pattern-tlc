package io.turntabl;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getShopName() {
        return shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void loadData() {
        for (int i = 0; i < 20; i++) {
            Book book = new Book();
            book.setBookID(i);
            book.setBookName("Book " + i);
            books.add(book);
        }
    }

    public void loadDataFromFile() {
        try (BufferedReader buffReader = new BufferedReader(new FileReader("bookWarehouse.txt"))) {
            while (true) {
                String line = buffReader.readLine();
                if(line==null) break;
                String[] attributes = line.split(",");
                System.out.println(attributes[0]);
//                System.out.println(line);

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Done reading file.");

    }

/*    @Override
    // shallow clone
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    @Override
    // deep clone
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for (Book b : getBooks()) {
            bookShop.getBooks().add(b);
        }
        return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
