package com.rubllc.botnv;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public String input;
    @FXML
    private Label Hel;

    @FXML
    private Button sendbutton;

    @FXML
    private TextField tf;

    @FXML
    private AnchorPane ap;



@FXML
private Label lbl;

public String img;
@FXML
public ImageView imgview;


AIresponse airesponse = new AIresponse();
MainWindow set = new MainWindow();
   public void send(ActionEvent event){

    {
        String result;
        input = tf.getText();
        lbl.setText(" . . . ");
        tf.clear();
        result=airesponse.run(input);
        lbl.setText(result);



    }
}
}