package org.sufnidev.thunderbubble.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class CalendarLayout extends AnchorPane {

    public CalendarLayout() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CalendarLayout.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
