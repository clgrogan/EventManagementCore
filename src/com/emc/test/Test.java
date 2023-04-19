package com.emc.test;

import com.emc.entities.*;
import com.emc.managers.EventManagerImpl;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl02;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer(null, null);
		organizer.setId(1231l);
		organizer.setName("Apple Inc.");
		System.out.println("organizer: " + organizer);
		System.out.println("\tid: \t" + organizer.getId());
		System.out.println("\tname: \t" + organizer.getName());
		
		Event event = new Event(4351l, "iPhone Product Launch", "iPhone 77 Launch" );
		System.out.println("event: " + event);
		System.out.println("\tid: \t" + event.getId());
		System.out.println("\tname: \t" + event.getName());
		System.out.println("\tdescription: \t" + event.getDescription());
		
		EventManager em = new EventManagerImpl02();
		em = new EventManagerImpl02();
		Event event2 = em.create(9999L);
		System.out.println(event2 + " ID: "+ event2.getId());
		
	}

}
