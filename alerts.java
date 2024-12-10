import java.util.List;

public class alerts {
    public void generateAlerts(List<Route> optimizedRoutes) {
        // Example function to generate alerts
        for (Route route : optimizedRoutes) {
            // Check for any alerts and generate them
            System.out.println("Alert generated for vessel: " + route.getVesselId());
        }
    }
}
