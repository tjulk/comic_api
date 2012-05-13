package com.nodejs.comicapi.model;

import java.util.ArrayList;
import java.util.List;


public class Classify {
	public String type;
	public List<String> names = new ArrayList<String>();
	@Override
	public String toString() {
		return "Classify [name=" + names + ", type=" + type + "]";
	}
}
