package org.sufnidev.thunderbubble.api;

public enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	public static Day nextDay(Day day) {
		switch (day) {
		case MONDAY:
			return TUESDAY;
		case TUESDAY:
			return WEDNESDAY;
		case WEDNESDAY:
			return THURSDAY;
		case THURSDAY:
			return FRIDAY;
		case FRIDAY:
			return SATURDAY;
		case SATURDAY:
			return SUNDAY;
		default:
			return MONDAY;
		}
	}

	public static Day getDay(String name) {
		for (Day day : Day.values()) {
			if (day.name().equals(name))
				return day;
		}
		return null;
	}
}
