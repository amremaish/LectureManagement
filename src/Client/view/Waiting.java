package Client.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Waiting extends VBox {

    public Waiting(VBox layout) {
        Label welcome = new Label("Welcome!");
        welcome.setPrefSize(300, 150);

        setAlignment(Pos.CENTER);

        getChildren().addAll(welcome);
        
    }
}
