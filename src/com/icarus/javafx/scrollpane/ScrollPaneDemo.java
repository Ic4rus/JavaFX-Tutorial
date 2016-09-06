package com.icarus.javafx.scrollpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.stage.Stage;

public class ScrollPaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Tao mot ScrollPane
		ScrollPane root = new ScrollPane();

		Button button = new Button("My Button");
		button.setPrefSize(400, 300);

		// Set noi dung vao ScrollPane
		root.setContent(button);

		// Luon hien thi thanh keo dung
		root.setVbarPolicy(ScrollBarPolicy.ALWAYS);

		// Thanh keo ngang chi hien thi khi can
		root.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);

		Scene scene = new Scene(root, 550, 250);

		primaryStage.setTitle("ScrollPane Layout Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
