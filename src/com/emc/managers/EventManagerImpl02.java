package com.emc.managers;

import com.emc.entities.Event;

public class EventManagerImpl02 implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, "Mac Book Launch", "New Generation Launch");
	}

}
