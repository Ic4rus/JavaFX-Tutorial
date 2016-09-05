package com.icarus.javafx.gridpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane root = new GridPane();
		root.setPadding(new Insets(20));
		root.setHgap(25);
		root.setVgap(15);

		Label labelTitle = new Label("Enter you user name and password!");
		root.add(labelTitle, 0, 0, 2, 1);

		// Nhan user name
		Label labelUserName = new Label("User name");
		// Can le phai
		GridPane.setHalignment(labelUserName, HPos.RIGHT);
		// Dat vao o luoi (0, 1)
		root.add(labelUserName, 0, 1);

		// O nhap user name
		TextField fieldUserName = new TextField();
		// Can le trai
		GridPane.setHalignment(fieldUserName, HPos.LEFT);
		// Dat vao o luoi (1, 1)
		root.add(fieldUserName, 1, 1);

		// Nhan password
		Label labelPassword = new Label("Password");
		// Can le phai
		GridPane.setHalignment(labelPassword, HPos.RIGHT);
		// Dat vao o luoi (0, 2)
		root.add(labelPassword, 0, 2);

		// O nhap password
		PasswordField fieldPassword = new PasswordField();
		// Can le trai
		GridPane.setHalignment(fieldPassword, HPos.LEFT);
		// Dat vao o luoi (1, 2)
		root.add(fieldPassword, 1, 2);

		// Nut dang nhap
		Button btnLogin = new Button("Login");
		// Can le phai
		GridPane.setHalignment(btnLogin, HPos.RIGHT);
		// Dat vao o luoi (1, 3)
		root.add(btnLogin, 1, 3);

		Scene scene = new Scene(root, 550, 250);
		primaryStage.setTitle("GridPane Layout Demo");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
