package ObjectOrientedProgramming.Features.EnumeratedType;


public enum Continents {
    ASIA(44614000, 4700000000L),
    AFRICA(30365000, 1400000000L),
    NORTH_AMERICA(24230000, 600000000L),
    SOUTH_AMERICA(17814000, 430000000L),
    ANTARCTICA(14200000, 0L),
    EUROPE(10000000, 750000000L),
    OCEANIA(8511000, 40000000L);

    private final int area;
    private final long population;

    Continents(int area, long population) {
        this.area = area;
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }


    public static Continents getLargestContinent() {
        Continents result = null;
        for (Continents continent : values()) {
            if (result == null || result.area < continent.getArea()) {
                result = continent;
            }
        }
        return result;
    }

    public static Continents getSmallestContinent() {
        Continents result = null;
        for (Continents continent : values()) {
            if (result == null || result.area > continent.getArea()) {
                result = continent;
            }
        }
        return result;
    }

    public static void getAllContinents() {
        for (Continents continents : Continents.values()) {
            System.out.println(continents.toString());
        }
    }

    @Override
    public String toString() {
        return this.name() + " continent description {" +
                "area=" + area +
                ", population=" + population +
                '}';
    }
}
