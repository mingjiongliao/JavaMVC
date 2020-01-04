package application.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import application.model.Colour;
import application.model.ColourList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;

public class Controller {

	@FXML
	private TilePane tilePane;
	private ArrayList<Colour> cl;

	public Controller() {
		// TODO Auto-generated constructor stub
		cl = new ArrayList<Colour>();
	}

	@FXML
	void onAdd(ActionEvent event) {
		tilePane.getChildren().clear();
		cl.addAll(new ColourList().getCl());
		Collections.sort(cl);
		for (Colour c : cl) {
			HBox vl = new HBox();
			LinkedList<Node> node = new LinkedList<Node>();
			node.add(c.getNode());
			vl.getChildren().addAll(node);
			tilePane.getChildren().add(vl);
		}

	}

	@FXML
	void onClear(ActionEvent event) {
		tilePane.getChildren().clear();
		cl.clear();
	}

}
