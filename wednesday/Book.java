public class Book{

public String bookname;
public int price;
public String publisher;
public short pubyear;
public float weight;


public Book(){
	
	System.out.println("Book Details shown below");
}

public Book(String bookname[],int price,String publisher,short pubyear,float weight){

this.price = price;
this.publisher = publisher;
this.pubyear = pubyear;
this.weight = weight;

System.out.println("Book price is:"+price);
System.out.println("Publisher Name is:"+publisher);
System.out.println("Published year :"+pubyear);
System.out.println("Book weight is:"+weight);

for(int index=0;index<bookname.length;index++){
System.out.println("Book Name was:"+bookname[index]);
}
}

}