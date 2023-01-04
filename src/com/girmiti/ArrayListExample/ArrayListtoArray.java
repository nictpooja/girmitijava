/**
 * 
 */
package com.girmiti.ArrayListExample;

import java.util.ArrayList;

/**
 * @author pooja
 *
 */
public class ArrayListtoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Verifone");
		al.add("Terrapay Issuance");
		al.add("Bluebird TMS");
		System.out.println(al);
		String[] item=al.toArray(new String[al.size()]);
		for(String s:item) {
			System.out.println(s);
		}

	}

}
