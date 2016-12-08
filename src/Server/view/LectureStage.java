package Server.view;

import Server.controllers.QuizCreator;
import Server.controllers.ShowTables;
import java.io.File;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LectureStage extends VBox {

    Stage stage;

    public LectureStage(VBox layout, Stage primaryStage) {

        Button uploadSlide = new Button("Upload Slide");
        Button makeQuiz = new Button("Make Quiz");
        Button takeAbsence = new Button("Take Absence");
        Button tables = new Button("Tables");
        Pane slidecontainer = new Pane();
        FileChooser filechooser = new FileChooser();

        uploadSlide.setPrefSize(180, 40);
        makeQuiz.setPrefSize(180, 40);
        takeAbsence.setPrefSize(180, 40);
        tables.setPrefSize(180, 40);
        slidecontainer.setPrefSize(700, 700);
        slidecontainer.setStyle("-fx-background-color: #8fbc8f;-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);-fx-padding: 10;");

        HBox hb = new HBox();
        hb.setSpacing(30);

        hb.getChildren().addAll(uploadSlide, makeQuiz, takeAbsence, tables);
        hb.setAlignment(Pos.CENTER);

        setPadding(new Insets(30, 30, 30, 30));
        setSpacing(50);
        setAlignment(Pos.CENTER);

        getChildren().addAll(slidecontainer, hb);

        uploadSlide.setOnAction(e -> {
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("PPT files (*.ppt,*.pptx)", new String[]{"*.ppt", "*.pptx"});
            filechooser.getExtensionFilters().add(extFilter);
            File file = filechooser.showOpenDialog(primaryStage);
            System.out.println(file);
        });
        tables.setOnAction(e -> {
            layout.getChildren().clear();
            layout.getChildren().add(new ShowTables(layout));
        });

        makeQuiz.setOnAction(e -> {
            stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            Scene scene = new Scene(new QuizCreator(), 500, 600);
            stage.setScene(scene);
            stage.setTitle("Quiz Creator");
            stage.showAndWait();
        });

    }

}
