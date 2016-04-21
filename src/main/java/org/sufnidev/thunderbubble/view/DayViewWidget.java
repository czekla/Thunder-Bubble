package org.sufnidev.thunderbubble.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class DayViewWidget extends AnchorPane {

    public DayViewWidget() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DayViewWidget.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
