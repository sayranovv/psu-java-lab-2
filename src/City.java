import java.util.Map;
import java.util.HashMap;

public class City {

    private final String name;
    private final Map<City, Integer> paths;

    public City(String name) {
        this.name = name;
        this.paths = new HashMap<>();
    }

    public void addPath(City city, int cost) {
        paths.put(city, cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" -> ");

        for (Map.Entry<City, Integer> entry : paths.entrySet()) {
            sb.append(entry.getKey().name).append(":").append(entry.getValue()).append(" ");
        }

        return sb.toString();
    }
}
