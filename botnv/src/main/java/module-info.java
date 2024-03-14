module com.rubllc.botnv {
    requires javafx.controls;
    requires javafx.fxml;
    requires langchain4j.open.ai;
    requires langchain4j.core;
    requires langchain4j.hugging.face;
    requires javafx.media;


    opens com.rubllc.botnv to javafx.fxml;
    exports com.rubllc.botnv;
}