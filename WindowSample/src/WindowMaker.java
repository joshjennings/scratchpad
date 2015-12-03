import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import static java.lang.System.*;

/**
 * Created by Josh on 12/2/2015.
 */
public class WindowMaker extends Application {

    public static void main(String[] args) { launch(args); }

    @Override public void start(Stage primaryStage) {
        out.println("Window creation beginning.");

        //create person textfield
	    TextField salesPerson = new TextField();
	    salesPerson.setEditable(true);
	    salesPerson.setMaxWidth(400);
	    salesPerson.setMinWidth(100);
	    salesPerson.setPrefWidth(200);
	    salesPerson.setPromptText("Sales Engineer");

	    //TODO: add main pane controls

        //create control buttons and horizontal spacer
        Button buttonOK = new Button("OK");
        Button buttonCancel = new Button("Cancel");
        Region spacer = new Region();

        //create radio button drop down
        RadioButton rbOne = new RadioButton("One");
        RadioButton rbTwo = new RadioButton("Two");
        RadioButton rbThree = new RadioButton("Three");
        ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(rbOne,rbTwo,rbThree);

        VBox selectionBox = new VBox(10);
        selectionBox.setPadding(new Insets(10));
        selectionBox.getChildren().addAll(rbOne,rbTwo,rbThree);

        TitledPane dropdownBox = new TitledPane("Numbers",selectionBox);
        dropdownBox.setCollapsible(true);

	    //create top pane
	    HBox topPane = new HBox(10,spacer,salesPerson);
	    topPane.setPadding(new Insets(10));
	    HBox.setHgrow(spacer, Priority.ALWAYS);

	    //create center pane
	    //TODO: add main pane for primary data

        //create bottom pane
        HBox bottomPane = new HBox(10,dropdownBox,spacer,buttonOK,buttonCancel);
        bottomPane.setPadding(new Insets(10));
        HBox.setHgrow(spacer, Priority.ALWAYS);

	    //create BorderPane (root)
	    BorderPane rootPane = new BorderPane();
	    rootPane.setTop(topPane);
	    //TODO:rootPane.setCenter(primaryPane);
	    rootPane.setBottom(bottomPane);

        //create scene
        Scene scene = new Scene(rootPane);

        //create stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Window Tester");
	    out.println("Showing window");
        primaryStage.show();
	    out.println("Window displayed");
    }
}
