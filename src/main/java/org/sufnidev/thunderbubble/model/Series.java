package org.sufnidev.thunderbubble.model;

import org.sufnidev.thunderbubble.api.Day;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Series {

    private StringProperty title;
    private ObjectProperty<Day> day;
    private BooleanProperty active;

    public Series() {
        this(null, null, false);
    }

    public Series(String title, Day day) {
        this(title, day, true);
    }

    public Series(String title, Day day, boolean active) {
        this.title = new SimpleStringProperty(title);
        this.day = new SimpleObjectProperty<Day>(day);
        this.active = new SimpleBooleanProperty(active);
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public StringProperty titleProperty() {
        return this.title;
    }

    public Day getDay() {
        return day.get();
    }

    public void setDay(Day day) {
        this.day.set(day);
    }

    public ObjectProperty<Day> dayProperty() {
        return this.day;
    }

    public boolean isActive() {
        return active.get();
    }

    public void setActive(boolean active) {
        this.active.set(active);
    }

    public BooleanProperty activeProperty() {
        return this.active;
    }

}
