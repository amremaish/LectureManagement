package Server.controllers;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;

public class QuizCreator extends BorderPane {

    VBox content;
    Button add;
    TextField question_data, numberofchoices;
    RadioButton[] choices;
    Button create;
    ScrollPane scroller ;

    public QuizCreator() {

        setPadding(new Insets(10, 20, 20, 10));

        create = new Button("Create & Send");
        content = new VBox();
        add = new Button("+");
        scroller = new ScrollPane();

        scroller.setPadding(new Insets(10,10,10,10));

        content.setPadding(new Insets(20, 20, 20, 20));
        content.setSpacing(10);
        content.setAlignment(Pos.CENTER);
        
        setAlignment(scroller , Pos.CENTER);

        create.setPrefSize(150, 30);
        create.setAlignment(Pos.CENTER);
        setAlignment(create, Pos.BOTTOM_LEFT);
        setBottom(create);

        content.getChildren().add(add);
        add.setOnAction(e -> {
            numberofchoices = new TextField();
            numberofchoices.setPromptText("choices!");

            question_data = new TextField();
            question_data.setPromptText("enter question!");

            numberofchoices.setPrefSize(70, 30);
            question_data.setPrefSize(150, 30);

            HBox hb = new HBox();
            hb.setSpacing(30);
            hb.setAlignment(Pos.CENTER);
            hb.getChildren().addAll(question_data, numberofchoices);

            content.getChildren().addAll(hb);

            numberofchoices.setOnAction(a -> {
                numberofchoices.setVisible(false);

                ToggleGroup group = new ToggleGroup();

                VBox choicesButtons = new VBox();
                choicesButtons.setAlignment(Pos.CENTER_LEFT);

                int x = Integer.parseInt(numberofchoices.getText());
                choices = new RadioButton[x];

                VBox vb = new VBox();
                vb.setPadding(new Insets(10, 0, 0, 10));
                vb.setSpacing(10);
                vb.setAlignment(Pos.CENTER);
                vb.getChildren().add(question_data);

                for (int i = 0; i <= x; i++) {
                    if (i == x) {
                        String str = JOptionPane.showInputDialog("Enter the right answer");
                        System.out.println("right answer! "+str);
                        break;
                    }
                    String str = JOptionPane.showInputDialog("Enter answer" + (i + 1) + " option");
                    choices[i] = new RadioButton(str);
                    choices[i].setToggleGroup(group);
                    choicesButtons.getChildren().add(choices[i]);
                    choicesButtons.setSpacing(5);
                }
                vb.getChildren().add(choicesButtons);
                content.getChildren().add(vb);
            });
        });
        StackPane stackp = new StackPane();
        stackp.getChildren().add(content);

        stackp.minWidthProperty().bind(Bindings.createDoubleBinding(() -> 
        scroller.getViewportBounds().getWidth(), scroller.viewportBoundsProperty()));

        scroller.setContent(stackp);
        setCenter(scroller);
    }
}
