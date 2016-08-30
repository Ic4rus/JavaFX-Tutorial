package com.icarus.javafx.hello;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

	@FXML
	private Button myButton;

	@FXML
	private TextField myTextField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// TODO (don't really need to do anything here)
	}

	/**
	 * When user click myButton, this method will be called.
	 *
	 */
	public void showDateTime() {

		System.out.println("Button Clicked!");

		Date now = new Date();

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

		String strDateTime = df.format(now);

		myTextField.setText(strDateTime);

	}

}
