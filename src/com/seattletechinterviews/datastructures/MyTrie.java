package com.seattletechinterviews.datastructures;

import java.util.List;

public interface MyTrie {
	public interface Trie {
	    public void add(String key, int value);
	    public int find(String key);
	    public MyLinkedList search(String prefix);
	    public boolean contains(String key);
	    public List<String> getAllKeys();
	    public int size();
	}
}
