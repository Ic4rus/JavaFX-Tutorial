package com.icarus.javafx.stackpane;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StackPaneDemo2 extends Application {

	private StackPane stackPane;

	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox root = new VBox();

		// StackPane
		stackPane = new StackPane();

		// Them Label vao StackPane
		Label label = new Label("I'm a Label");
		label.setStyle("-fx-background-color:yellow");
		label.setPadding(new Insets(5));
		label.setVisible(false);
		stackPane.getChildren().add(label);

		// Them Button vao StackPane
		Button button = new Button("I'm a Button");
		button.setStyle("-fx-background-color:cyan");
		button.setPadding(new Insets(5));
		button.setVisible(false);
		stackPane.getChildren().add(button);

		// Them CheckBox vao StackPane
		CheckBox checkBox = new CheckBox("I'm a CheckBox");
		checkBox.setOpacity(1);
		checkBox.setStyle("-fx-background-color:olive");
		checkBox.setPadding(new Insets(5));
		checkBox.setVisible(true);
		stackPane.getChildren().add(checkBox);

		stackPane.setPrefSize(300, 150);
		stackPane.setStyle("-fx-background-color:Gainsboro; -fx-border-color:blue");
		root.getChildren().add(stackPane);

		Button controlButton = new Button("Change Top");
		root.getChildren().add(controlButton);

		root.setAlignment(Pos.CENTER);
		VBox.setMargin(stackPane, new Insets(10));
		VBox.setMargin(controlButton, new Insets(10));

		Scene scene = new Scene(root, 550, 250);
		primaryStage.setTitle("StackPane Layou Demo 2");
		primaryStage.setScene(scene);

		controlButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				changeTop();
			}
		});
		primaryStage.show();
	}

	private void changeTop() {

		ObservableList<Node> children = this.stackPane.getChildren();
		if (children.size() > 1) {
			Node topNode = children.get(children.size() - 1);
			Node newTopNode = children.get(children.size() - 2);

			topNode.setVisible(false);
			topNode.toBack();

			newTopNode.setVisible(true);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
