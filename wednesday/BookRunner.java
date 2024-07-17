public class BookRunner{

public static void main(String args[]){

Book books = new Book();

books.bookname="Karvalo";
books.price = 350;
books.publisher = "Poornachandra Tejaswi";
books.pubyear = 2020;
books.weight = 30f;
System.out.println("Book Name is:"+books.bookname);
System.out.println("Book price is:"+books.price);
System.out.println("Publisher Name is:"+books.publisher);
System.out.println("Published year :"+books.pubyear);
System.out.println("Book weight is:"+books.weight);
String bookname[] = {"Yanna","Mandra","Nayi Neralu","Sartha"};
Book newbook = new Book(bookname,4500,"Byrappa",(short)1995,450);


}




}