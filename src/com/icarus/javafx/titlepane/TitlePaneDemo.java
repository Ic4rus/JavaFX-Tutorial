package com.icarus.javafx.titlepane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitlePaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Tao TitlePane
		TitledPane titlePane = new TitledPane();
		titlePane.setText("Java");

		// Noi dung cua TitlePane
		VBox content = new VBox();
		content.getChildren().add(new Label("Java Swing Tutorial"));
		content.getChildren().add(new Label("JavaFX Tutorial"));
		content.getChildren().add(new Label("Java IO Tutorial"));
		titlePane.setContent(content);

		// Set TitlPane dang mo
		titlePane.setExpanded(true);

		VBox root = new VBox();
		root.setPadding(new Insets(5));
		root.getChildren().add(titlePane);

		Scene scene = new Scene(root, 250, 200);

		primaryStage.setTitle("TitlePane Layout Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
