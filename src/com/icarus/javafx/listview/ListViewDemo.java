package com.icarus.javafx.listview;

import com.icarus.javafx.model.Book;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Book book1 = new Book(1L, "J01", "Java IO Tutorial");
		Book book2 = new Book(2L, "J02", "Java Enums Tutorial");
		Book book3 = new Book(3L, "C01", "C# Tutorial for Beginners");

		// Tao mot danh sach
		ObservableList<Book> books = FXCollections.observableArrayList(book1, book2, book3);

		// Tao mot ListView
		ListView<Book> listView = new ListView<Book>(books);

		// Cho phep chon nhieu dong tren danh sach
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		// Lua chon phan tu index = 1, 2
		listView.getSelectionModel().selectIndices(1, 2);

		// Focus
		listView.getFocusModel().focus(1);

		StackPane root = new StackPane();
		root.getChildren().add(listView);

		Scene scene = new Scene(root, 350, 200);

		primaryStage.setTitle("ListView Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
