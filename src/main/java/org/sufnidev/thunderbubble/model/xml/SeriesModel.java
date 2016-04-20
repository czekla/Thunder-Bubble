package org.sufnidev.thunderbubble.model.xml;

public class SeriesModel {

	private String title;
	private String day;
	private boolean active;

	public SeriesModel() {
		this(null, null, false);
	}

	public SeriesModel(String title, String day, boolean active) {
		this.title = title;
		this.day = day;
		this.active = active;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
