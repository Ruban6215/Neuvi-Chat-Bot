package com.rubllc.botnv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.*;
import javafx.scene.media.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainWindow extends Application {
    private ImageView bgimg;



    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("ui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1000);
        stage.setTitle("Neuvillette Bot");
        music();
        interact("hello.mp3");
        stage.setScene(scene);
        stage.show();


    }
    MediaPlayer mediaPlayer;
    MediaPlayer vline;
    public void music(){
        String lmusic = "LoadingMusic.mp3";
        Media loadmusic = new Media(Paths.get(lmusic).toUri().toString());
        mediaPlayer = new MediaPlayer(loadmusic);
        mediaPlayer.play();
    }
    public void interact(String voiceline){
        Media vc = new Media(Paths.get(voiceline).toUri().toString());
        vline = new MediaPlayer(vc);
        vline.play();


    }

    public static void main(String[] args) {
        launch();
    }
}