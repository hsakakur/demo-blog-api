package com.example.blog.entry.event;

import am.ik.blog.entry.Entry;

public class EntryCreateEvent {
    private final Entry entry;

    public EntryCreateEvent(Entry entry) {
        this.entry = entry;
    }

    public Entry getEntry() {
		return entry;
    }
}
