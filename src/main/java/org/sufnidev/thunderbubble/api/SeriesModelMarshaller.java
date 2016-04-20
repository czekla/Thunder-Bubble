package org.sufnidev.thunderbubble.api;

import org.sufnidev.thunderbubble.model.Series;
import org.sufnidev.thunderbubble.model.xml.SeriesModel;

public interface SeriesModelMarshaller {

	SeriesModel marshall(Series series);

	Series unmarshall(SeriesModel seriesModel);

}
