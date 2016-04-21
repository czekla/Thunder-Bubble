package org.sufnidev.thunderbubble.service;

import org.sufnidev.thunderbubble.api.Day;
import org.sufnidev.thunderbubble.api.SeriesModelMarshaller;
import org.sufnidev.thunderbubble.model.Series;
import org.sufnidev.thunderbubble.model.xml.SeriesModel;

public class SeriesMarshaller implements SeriesModelMarshaller {

    @Override
    public SeriesModel marshall(Series series) {
        SeriesModel seriesModel = new SeriesModel();
        seriesModel.setTitle(series.getTitle());
        seriesModel.setDay(series.getDay().name());
        seriesModel.setActive(series.isActive());
        return seriesModel;
    }

    @Override
    public Series unmarshall(SeriesModel seriesModel) {
        Series series = new Series();
        series.setTitle(seriesModel.getTitle());
        series.setDay(Day.getDay(seriesModel.getDay()));
        series.setActive(seriesModel.isActive());
        return series;
    }

}
