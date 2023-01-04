/**
 * 
 */
package com.girmiti.ArrayListExample;
import java.util.*;
/**
 * @author pooja
 *
 */
public class ArrayListEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Ali");
		al.add(1,"Irshad");
		al.add("Ramesh");
		al.add("Gowtham");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Mumbai");
		al2.add("Chennai");
		al2.add("Pune");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		al.removeAll(al2);
		System.out.println(al);
		System.out.println("Containing particular element:"+al.contains("Ali"));
		System.out.println("Size of the arraylist:"+al.size());
		

	}

}
