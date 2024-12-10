import java.util.List;

public class OceanManagement {
    public static void main(String[] args) {
        
        trackVessels tracking = new trackVessels(); 
        optimizeRoutes optimization = new optimizeRoutes(); 
        alerts alerts = new alerts();

        List<Vessel> vesselData = tracking.trackVessels();
        List<Route> optimizedRoutes = optimization.optimizeRoutes(vesselData);
        alerts.generateAlerts(optimizedRoutes);
    }
}
