package Client.view;

import Server.controllers.QuizCreator;
import Server.controllers.ShowTables;
import java.io.File;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class LectureStage extends VBox {

    Stage stage;

    public LectureStage(VBox layout) {

        Button downloadSlide = new Button("Download Slide");
        Button askQuestion = new Button("Ask Question");
        Button addNote = new Button("Add Note");
        Pane slidecontainer = new Pane();

        downloadSlide.setPrefSize(200, 40);
        askQuestion.setPrefSize(200, 40);
        addNote.setPrefSize(200, 40);
        slidecontainer.setPrefSize(700, 700);
        slidecontainer.setStyle("-fx-background-color: #8fbc8f;-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);-fx-padding: 10;");

        HBox hb = new HBox();
        hb.setSpacing(40);

        hb.getChildren().addAll(downloadSlide, askQuestion,addNote);
        hb.setAlignment(Pos.CENTER);

        setPadding(new Insets(30, 30, 30, 30));
        setSpacing(50);
        setAlignment(Pos.CENTER);

        getChildren().addAll(slidecontainer, hb);

    }

}
