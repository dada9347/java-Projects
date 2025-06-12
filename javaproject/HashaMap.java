package javaproject;
import java.util.HashMap;
public class HashaMap {
	public static void main (String[] args) {
		HashMap<Integer, String>studentlist=new HashMap<Integer ,String>();
		studentlist.put(1, "hari");
		studentlist.put(2, "hurday");
		studentlist.put(3, "tousfee");
		studentlist.put(4, "teja");
		studentlist.put(5, "dileep");
		studentlist.remove(2);
		studentlist.put(3,"lauda");
		System.out.println(studentlist);
	}
	

}
