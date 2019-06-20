package com.app.ll;

public class AppLaunch {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.insert("bala");
		ll.insert("murugan");
		ll.insert("renault");
		ll.insert("nissan");
		ll.insert("zoho");
		ll.remove("nissan");
		
		System.out.println(ll);
		
		ll.traverseList();
		
	}

}
 