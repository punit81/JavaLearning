package IOStreams;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
class Student implements Serializable{
	 String name;
	 int age;
	 int id;
	public Student() {
		super();
		this.name =null;
		this.age = 0;
		this.id = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void display() {
		System.out.println("\nName:"+this.getName()+"\nAge:"+this.getAge()+"\nID:"+this.getId());
	}
}
public class ReadingAndWritingInFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s[]=new Student[2];
		s[0]=new Student();
		s[0].setName("Punit");
		s[0].setAge(11);
		s[0].setId(1);
		s[1]=s[0];
		ObjectOutputStream outobj=new ObjectOutputStream(new FileOutputStream("Testing.txt")); 
		outobj.writeObject(s);
		//outobj.writeChar('\n');
		outobj.flush();
		outobj.close();
		ObjectInputStream inobj=new ObjectInputStream(new FileInputStream("Testing.txt"));
		try {
			while(true) {
			Student s1[]=(Student[])inobj.readObject();
			s1[0].display();
			s1[1].display();
			}
		}
		catch(EOFException eof) {
			//System.out.println(eof);
		}
		finally {
		inobj.close();
		}
	}

}
