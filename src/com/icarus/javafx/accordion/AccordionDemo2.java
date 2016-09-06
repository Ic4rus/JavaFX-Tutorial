package com.icarus.javafx.accordion;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionDemo2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Tao TitledPane thu 1
		TitledPane firstTitledPane = new TitledPane();
		firstTitledPane.setText("Java");

		VBox content1 = new VBox();
		content1.getChildren().add(new Label("Java Swing Tutorial"));
		content1.getChildren().add(new Label("JavaFX Tutorial"));
		content1.getChildren().add(new Label("Java IO Tutorial"));

		firstTitledPane.setContent(content1);

		// Tao TitledPane thu 2
		TitledPane secondTitledPane = new TitledPane();
		secondTitledPane.setText("C Sharp");

		VBox content2 = new VBox();
		content2.getChildren().add(new Label("C Sharp Tutorial for Beginners"));
		content2.getChildren().add(new Label("C Sharp Enums Tutorial"));

		secondTitledPane.setContent(content2);

		// Tao pane goc
		VBox root = new VBox();
		root.setPadding(new Insets(10, 10, 10, 10));
		root.getChildren().addAll(firstTitledPane, secondTitledPane);

		Scene scene = new Scene(root, 550, 250);
		primaryStage.setTitle("Accordion Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
