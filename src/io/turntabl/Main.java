package io.turntabl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

       /* // original shop
        BookShop bookShop1 = new BookShop();
        bookShop1.setShopName("Kingdom Bookshop");
        bookShop1.loadData();
        System.out.println(bookShop1.getShopName());
        System.out.println(bookShop1.getBooks());
*/
        BookShop bs = new BookShop();
        bs.loadDataFromFile();

        /*// instead of fetching from db..can we ask data from bookshop1?
        BookShop bookShop2 = new BookShop();
        bookShop2.setShopName("York Bookshop");
        bookShop2.loadData();
        System.out.println(bookShop2);*/

        // shallow cloned shop
        /*BookShop bookShop2 = (BookShop)bookShop1.clone();
        bookShop1.getBooks().remove(1);
        bookShop2.setShopName("York Bookshop");
        System.out.println(bookShop2.getShopName());
        System.out.println(bookShop2.getBooks());*/

       /* // deep cloned shop
        BookShop bookShop2 = bookShop1.clone();
        bookShop1.getBooks().remove(1);
        bookShop2.setShopName("One-Stop Bookshop");
        System.out.println(bookShop2.getShopName());
        System.out.println(bookShop2.getBooks());
*/
    }

}
