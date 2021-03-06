package com;

import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.listIterator();
		
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator ;
			
			if(iterator.hasNext())
				separator = "-->";
			
			else
				separator = "\n";
			
			System.out.print(e+separator);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("스타워즈");
		myList.add("메트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList); //정렬
		printList(myList);
		
		System.out.println();
	
		Collections.reverse(myList); //reverse 정렬
		printList(myList);
		
		System.out.println();
		
		int index = Collections.binarySearch(myList,"아바타")+1;
		System.out.println("아바타는 "+ index+"번째 요소입니다.");		

	}
}
