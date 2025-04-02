package arrayListPrograms;

import java.util.ArrayList;

public class ArrayListExample {



	public static void main(String[] args) {
		//Syntax
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		//Check the element is present in the list
		System.out.println(list.contains(50));//return true
		System.out.println(list.contains(51));//return false
		
		//update the element is present in the list
		list.set(0, 21);
		System.out.println(list);
		
		//remove the element is present in the list
		list.remove(0);
		System.out.println(""+ list);
	}

}
