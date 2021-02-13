package MisysRemainingProblems;

class Single{
	private static Single single;
	private int data;
	private Single() {
	}
	public static Single getInstance() {
		if(single==null) {
			single=new Single();
			single.data=5;
		}
		return single;
	}
	public static int showData(){
		return single.data;
	}
	public static void changeData(int data){
		single.data=data;
	}
}
public class SingletonPattern {

	public static void main(String[] args) {
	
		//Single s=new Single(); gives compiletimeError
		Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		System.out.println("Before changing s2:\ns1:"+s1.showData()+"\ts2:"+s2.showData());
		s2.changeData(50);
		System.out.println("After changing s2:\ns1:"+s1.showData()+"\ts2:"+s2.showData());
	}

}
