package spring;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String args[]) {
		Set s = new HashSet();
		s.add(new Employee("Saurabh"));
		s.add(new String("Amit"));
		s.add(new Employee("Saurabh"));
		s.add(new String("Amit"));
		
		System.out.println(s);
		
	}

}
