package io.turntabl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        // original shop
        BookShop bookShop1 = new BookShop();
        bookShop1.setShopName("Kingdom Bookshop");
        bookShop1.loadDataFromFile();
        System.out.println(bookShop1.getShopName());
        System.out.println(bookShop1.getBooks());

        // instead of fetching from db..can we ask data from bookshop1?
//        BookShop bookShop2 = new BookShop();
//        bookShop2.setShopName("York Bookshop");
//        bookShop2.loadDataFromFile();
//        System.out.println(bookShop2.getShopName());
//        System.out.println(bookShop2.getBooks());

        // shallow cloned shop
  /*      BookShop bookShop2 = (BookShop)bookShop1.clone();
        bookShop1.getBooks().remove(1);
        bookShop2.setShopName("York Bookshop");
        System.out.println(bookShop2.getShopName());
        System.out.println(bookShop2.getBooks());*/

        // deep cloned shop
        BookShop bookShop2 = bookShop1.clone();
        bookShop1.getBooks().remove(1);
        bookShop2.setShopName("One-Stop Bookshop");
        System.out.println(bookShop2.getShopName());
        System.out.println(bookShop2.getBooks());

        // deep cloned shop 2
        BookShop bookShop3 = bookShop1.clone();
        bookShop1.getBooks().remove(1);
        bookShop3.setShopName("Second-Stop Bookshop");
        System.out.println(bookShop3.getShopName());
        System.out.println(bookShop3.getBooks());


    }

}
