package com.gkatzioura.design.behavioural.cor;

public interface RoadIncidentHandler {

    void handle(RoadIncident roadIncident);

    boolean withinBounds(double lat, double lng);

}
