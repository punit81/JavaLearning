package JavaTypesOfReferences;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Date;
class Book{
	final String id;
	String authorName;
	String bookName;
	private static int numbooks;
	public Book() throws InterruptedException {
		numbooks++;
		id=generateId();
		authorName=new String();
		bookName=new String();
	}
	public Book(Book b) throws InterruptedException {   //deep copy
		numbooks++;
		id=generateId();
		authorName=new String(b.authorName);
		bookName=new String(b.bookName);
	}
	public Book(String authorname,String bookname) throws InterruptedException {   //deep copy
		numbooks++;
		id=generateId();
		authorName=authorname;
		bookName=bookname;
	}
	private String generateId() throws InterruptedException {
		Thread.sleep(100);
		return String.valueOf(System.currentTimeMillis()+(new SimpleDateFormat("DD:MM:YYYY HH:MM:SS:ss")).format(new Date()).hashCode()>>>16);
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getId() {
		return id;
	}
	public void display() {
		System.out.println("\nBook ID:"+id+"\nAuthor Name:"+authorName+"\nBook Name:"+bookName);
	}
}
public class TypeOfReference {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Book b=new Book("APJ ABDUL KALAM","Wings Of Fire");
		b.display();
		WeakReference<Book>b1=new WeakReference<Book>(new Book("HHH","bbb"));
		b1.get().display();
		
		SoftReference<Book>b2=new SoftReference<Book>(new Book("yyy","zzz"));
		b2.get().display();
		
		System.gc(); //requested garbage collector
		
		b.display();
		try {
		b1.get().display(); //will throw null pointer exception as weak reference are destroyed after gc
		}
		catch(NullPointerException err) {
			System.out.println(err+" For weak Reference");
		}
		try {
			System.out.println("Before consuming heap:");
		b2.get().display(); //will not throw null pointer exception until heap is full
		}
		catch(NullPointerException ne) {
			System.out.println(ne + "for SoftReference");
		}
		ArrayList<Book> bg=new ArrayList<Book>(); //created an object in order to consume heap space so that softreference is collected by gc 
		for(int i=0;i<1000;i++) {
			bg.add(new Book("ghgh","yyyy"));
		}
		try {
			System.out.println("After consuming heap:");
			b2.get().display(); //will not throw null pointer exception until heap is full
			}
			catch(NullPointerException ne) {
				System.out.println(ne + " for Soft Reference");
			}
			
	}

}
/*
 Output when Java max heap size is allocated 1MB of space i.e. in VM argument -Xmx1M is passed
 
Book ID:24570977
Author Name:APJ ABDUL KALAM
Book Name:Wings Of Fire

Book ID:24571415
Author Name:HHH
Book Name:bbb

Book ID:24571852
Author Name:yyy
Book Name:zzz

Book ID:24570977
Author Name:APJ ABDUL KALAM
Book Name:Wings Of Fire
java.lang.NullPointerException For weak Reference
Before consuming heap:

Book ID:24571852
Author Name:yyy
Book Name:zzz
After consuming heap:
java.lang.NullPointerException for Soft Reference


Output when default size of java heap is used i.e. 256 MB


Book ID:24571775
Author Name:APJ ABDUL KALAM
Book Name:Wings Of Fire

Book ID:24572226
Author Name:HHH
Book Name:bbb

Book ID:24572664
Author Name:yyy
Book Name:zzz

Book ID:24571775
Author Name:APJ ABDUL KALAM
Book Name:Wings Of Fire
java.lang.NullPointerException For weak Reference
Before consuming heap:

Book ID:24572664
Author Name:yyy
Book Name:zzz
After consuming heap:

Book ID:24572664
Author Name:yyy
Book Name:zzz


 */
 