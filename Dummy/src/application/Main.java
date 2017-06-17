package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Login");
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			HBox hb = new HBox();
			hb.setPadding(new Insets(20,20,20,30));
			
			GridPane gridPane = new GridPane();
			gridPane.setPadding(new Insets(20,20,20,20));

			Label lblUserName = new Label("Username");
			final TextField txtUserName = new TextField();
			Label lblPassword = new Label("Password");
			final PasswordField pf = new PasswordField();
			Button btnLogin = new Button("Login");
			final Label lblMessage = new Label();
			
			 //Adding Nodes to GridPane layout
			gridPane.add(lblUserName, 0, 0);
			gridPane.add(txtUserName, 1, 0);
			gridPane.add(lblPassword, 0, 1);
			gridPane.add(pf, 1, 1);
			gridPane.add(btnLogin, 2, 1);
			gridPane.add(lblMessage, 1, 2);
			root.setTop(hb);
			root.setCenter(gridPane);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
