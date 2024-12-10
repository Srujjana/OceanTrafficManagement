import java.util.List;

public class Route {
    private String vesselId;
    private List<String> waypoints;

    public Route(String vesselId, List<String> waypoints) {
        this.vesselId = vesselId;
        this.waypoints = waypoints;
    }

    public String getVesselId() {
        return vesselId;
    }

    public List<String> getWaypoints() {
        return waypoints;
    }
}
