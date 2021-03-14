package countries;

import java.util.Optional;
import java.util.stream.Stream;

public enum Continent {
    EUROPE(true, 123421421),
    ASIA(true, 483290483290L),
    AFRICA(false, 34278910),
    AMERICA(true, 321312321),
    AUSTRALIA(false, 328190);

    private final boolean isNorthHemisphere;
    private final long area;

    Continent(boolean isNorthHemisphere, long area) {
        this.isNorthHemisphere = isNorthHemisphere;
        this.area = area;
    }

    public static Optional<Continent> of(String continentName) {
        return Stream.of(values())
                .filter(val -> val.name().equalsIgnoreCase(continentName))
                .findFirst();
    }

    public boolean isNorthHemisphere() {
        return isNorthHemisphere;
    }

    public long getArea() {
        return area;
    }
}
