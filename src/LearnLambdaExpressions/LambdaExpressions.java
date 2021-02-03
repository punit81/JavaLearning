package LearnLambdaExpressions;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
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
		public Book(String bookname,String authorname) throws InterruptedException {   //deep copy
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
			System.out.println("\nBook ID:"+id+"\nBook Name:"+bookName+"\nAuthor Name:"+authorName);
		}
	}
public class LambdaExpressions {

	public static void main(String[] args) throws InterruptedException{
		List<Book>booklist = new ArrayList<Book>();
		booklist.add(new Book("Harry Potter","J.K. Rowlings"));
		booklist.add(new Book("Wings Of Fire","APJ Abdul Kalam"));
		booklist.add(new Book("The Discovery Of India","Pt. J.L. Nehru"));
		booklist.add(new Book("Communist Manifesto","Karl Marks"));
		booklist.add(new Book("The Problem of Indian Rupee","B.R.Ambedkar"));
		booklist.add(new Book("Poverty And UnBritish Rule of India","DadaBhai Naroji"));
		booklist.add(new Book("A Brief History Of Time","Stephen Hawkins"));
		booklist.add(new Book("Harijan","M.K.Gandhi"));
		System.out.println("\nBook List Before Sorting:");
		booklist.forEach(b->b.display()); //lambda expression
		booklist.sort((b1,b2)->(b1.getBookName().compareTo(b2.getBookName()))); //used lambdaExpression for Comparator
		System.out.println("\nBook List After Sorting:");
		booklist.forEach(b->b.display());
	}

}



/*
 Output

Book List Before Sorting:

Book ID:24631248
Book Name:Harry Potter
Author Name:J.K. Rowlings

Book ID:24631686
Book Name:Wings Of Fire
Author Name:APJ Abdul Kalam

Book ID:24620748
Book Name:The Discovery Of India
Author Name:Pt. J.L. Nehru

Book ID:24628191
Book Name:Communist Manifesto
Author Name:Karl Marks

Book ID:24628628
Book Name:The Problem of Indian Rupee
Author Name:B.R.Ambedkar

Book ID:24629065
Book Name:Poverty And UnBritish Rule of India
Author Name:DadaBhai Naroji

Book ID:24629502
Book Name:A Brief History Of Time
Author Name:Stephen Hawkins

Book ID:24629939
Book Name:Harijan
Author Name:M.K.Gandhi

Book List After Sorting:

Book ID:24629502
Book Name:A Brief History Of Time
Author Name:Stephen Hawkins

Book ID:24628191
Book Name:Communist Manifesto
Author Name:Karl Marks

Book ID:24629939
Book Name:Harijan
Author Name:M.K.Gandhi

Book ID:24631248
Book Name:Harry Potter
Author Name:J.K. Rowlings

Book ID:24629065
Book Name:Poverty And UnBritish Rule of India
Author Name:DadaBhai Naroji

Book ID:24620748
Book Name:The Discovery Of India
Author Name:Pt. J.L. Nehru

Book ID:24628628
Book Name:The Problem of Indian Rupee
Author Name:B.R.Ambedkar

Book ID:24631686
Book Name:Wings Of Fire
Author Name:APJ Abdul Kalam
*/