package application.model;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Colour implements Comparable<Colour> {

	Color val;

	public Colour() {
		val = Color.rgb(getRandomInt(0, 255), getRandomInt(0, 255), getRandomInt(0, 255));
	}

	private static int getRandomInt(int min, int max) {
		return (int) (Math.random() * ((max - min) + 1) + min);
	}

	public Node getNode() {
		// get random shape: retangle or circle
		Node t = getShape(20, 20, val);
		// get random stroke color
		((Shape) t).setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		((Shape) t).setStrokeWidth(3);

//		Rectangle t = new Rectangle(30, 30, val);
		t.setOnMouseClicked(e -> {
			Alert msgDialog = new Alert(AlertType.INFORMATION);
			msgDialog.setGraphic(t);
			msgDialog.setHeaderText(null);
			msgDialog.setContentText(this.toString());
			msgDialog.setTitle("Colour");
			msgDialog.showAndWait();
		});

		return t;
	}

	public Node getShape(int a, int b, Color val) {
		Node t = null;
		int id = getRandomInt(1, 2);
		if (id == 1) {
			t = new Rectangle(a, b, val);

		}
		if (id == 2) {
			t = new Circle(a / 2, val);
		}
		return t;

	}

	@Override
	public String toString() {
		return "R: " + Math.round(val.getRed() * 255) + " G: " + Math.round(val.getGreen() * 255) + " B:"
				+ Math.round(val.getBlue() * 255);
	}

	public int compareTo(Colour arg) {
		if (this.val.getBrightness() > arg.val.getBrightness()) {
			return 1;
		}
		if (this.val.getBrightness() < arg.val.getBrightness()) {
			return -1;
		}
		return 0;
	}

}
