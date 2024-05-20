module com.example.musicplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.musicplayer to javafx.fxml;
    exports com.example.musicplayer;
}