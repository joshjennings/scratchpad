import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.lang.System.*;

/**
 * Created by manufacturing9 on 12/2/2015.
 */
public class WindowMaker extends Application {

    public static void main(String[] args) { launch(args); }

    @Override public void start(Stage primaryStage) {
        out.println("Window creation beginning.");

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

        //create bottom pane
        HBox bottomPane = new HBox(10,dropdownBox,spacer,buttonOK,buttonCancel);
        bottomPane.setPadding(new Insets(10));
        bottomPane.setHgrow(spacer, Priority.ALWAYS);

        //create scene
        Scene scene = new Scene(bottomPane);

        //create stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Window Tester");
        primaryStage.show();
    }
}
