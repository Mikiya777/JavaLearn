package Practice.Other;

import Practice.Book;

public class text {
    public static void main(String[] args) {
//        Example one=new Example();
//        Increamtable one1=one.getIN();
//        one1.text();
        Book<String> book1=new Book("字符串");
        Book<Integer> book2=new Book(2);
        Book<Double> book3=new Book(3.14);
        Book<Boolean> book4=new Book(true);
        Book<String> Book = new Book<>("wdnmd");
        System.out.println(book1.getMyBook());
        System.out.println(book2.getMyBook());
        System.out.println(book3.getMyBook());
        System.out.println(book4.getMyBook());

        System.out.println(book1.getI());
    }
}
