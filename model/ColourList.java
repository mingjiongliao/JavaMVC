package application.model;

import java.util.ArrayList;

public class ColourList {
	private ArrayList<Colour> cl;

	public ArrayList<Colour> getCl() {
		return cl;
	}

//	public void sort() {
//		Collections.sort(cl);
//	}

	public ColourList() {
		cl = new ArrayList<Colour>();
		for (int i = 0; i < 10; i++) {
			cl.add(new Colour());
		}
	}

	public static void main(String[] args) {
		ColourList cl = new ColourList();
		for (Colour c : cl.getCl()) {
			System.out.println(c);
		}
	}
}
