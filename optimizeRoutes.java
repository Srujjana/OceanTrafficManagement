import java.util.List; 
import java.util.ArrayList; 

public class optimizeRoutes{ 
    public List<Route> optimizeRoutes(List<Vessel> vesselData){ 
        List<Route> optimizedRoutes = new ArrayList<>(); 
        for (Vessel vessel : vesselData) { 
            optimizedRoutes.add(new Route(vessel.getId(), new ArrayList<>())); 
        } 
        return optimizedRoutes;
    }
}
