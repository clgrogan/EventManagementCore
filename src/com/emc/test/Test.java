package com.emc.test;

import com.emc.entities.*;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.id = 123l;
		organizer.name = "Apple Inc.";
		System.out.println("organizer: " + organizer);
		System.out.println("\tid: \t" + organizer.id);
		System.out.println("\tname: \t" + organizer.name);
		
		Event event = new Event();
		event.id = 456L;
		event.name = "iPhone 69 Launch";
		event.description = "Grand launch of first iPhone implant";
		System.out.println("event: " + event);
		System.out.println("\tid: \t" + event.id);
		System.out.println("\tname: \t" + event.name);
		System.out.println("\tdescription: \t" + event.description);
		
	}

}
