import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtractLambda extends Application {
	
	Button btnAdd;
	Button btnSub;
	Label lbl;
	int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		// Create Add button
		btnAdd = new Button("Add");
		btnAdd.setOnAction(e -> btnAdd_Click() );
		
		// Create Subtract button
		btnSub = new Button("Subtract");
		btnSub.setOnAction( e -> btnSub_Click() );
		
		// Create Label
		lbl = new Label(Integer.toString(counter));
		
		// Add buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(lbl, btnAdd, btnSub);
		
		// Add layout pane to scene
		Scene scene = new Scene(pane, 200, 75);
		
		// Add scene to the stage, set the title, and show stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Subtract");
		primaryStage.show();
		
	}
	
	private void btnAdd_Click() {
		counter++;
		lbl.setText(Integer.toString(counter));
	}
	
	private void btnSub_Click() {
		counter--;
		lbl.setText(Integer.toString(counter));
	}

}
