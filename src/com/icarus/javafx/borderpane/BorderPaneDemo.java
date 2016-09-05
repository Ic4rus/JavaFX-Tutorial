package com.icarus.javafx.borderpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root = new BorderPane();
		root.setPadding(new Insets(15, 20, 10, 10));

		// TOP
		Button btnTop = new Button("Top");
		btnTop.setPadding(new Insets(10, 10, 10, 10));
		root.setTop(btnTop);
		BorderPane.setMargin(btnTop, new Insets(10, 10, 10, 10));

		// LEFT
		Button btnLeft = new Button("Left");
		btnLeft.setPadding(new Insets(5, 5, 5, 5));
		root.setLeft(btnLeft);
		BorderPane.setMargin(btnLeft, new Insets(10, 10, 10, 10));

		// CENTER
		Button btnCenter = new Button("Center");
		btnCenter.setPadding(new Insets(5, 5, 5, 5));
		root.setCenter(btnCenter);
		BorderPane.setAlignment(btnCenter, Pos.BOTTOM_CENTER);

		// RIGHT
		Button btnRight = new Button("Right");
		btnRight.setPadding(new Insets(5, 5, 5, 5));
		root.setRight(btnRight);
		BorderPane.setMargin(btnRight, new Insets(10, 10, 10, 10));

		// BOTTOM
		Button btnBottom = new Button("Bottom");
		btnBottom.setPadding(new Insets(5, 5, 5, 5));
		root.setBottom(btnBottom);
		BorderPane.setAlignment(btnBottom, Pos.TOP_RIGHT);
		BorderPane.setMargin(btnBottom, new Insets(10, 10, 10, 10));

		Scene scene = new Scene(root, 550, 250);
		primaryStage.setTitle("BorderPane Layout Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
