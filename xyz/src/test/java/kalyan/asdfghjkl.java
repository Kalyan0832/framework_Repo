class Building {
    String name;
    String country;
    String city;
    int height;
    int builtYear;
    int rank;

    public Building(String name, String country, String city, int height, int builtYear, int rank) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.height = height;
        this.builtYear = builtYear;
        this.rank = rank;
    }

    public int getHeight() {
        return height;
    }

    public int getRank() {
        return rank;
    }
}

public class HeightDifference {
    public static void main(String[] args) {
        Building[] buildings = {
                new Building("Burj Khalifa", "UAE", "Dubai", 8219, 2010, 1),
                new Building("Clock Tower Hotel", "Saudi Arabia", "Mecca", 601, 2012, 2),
                new Building("Taipei 101", "Taiwan", "Taipei", 509, 2004, 3),
                new Building("Shanghai World Financial Center", "China", "Shanghai", 492, 2008, 4)
        };

        int firstRankHeight = buildings[0].getHeight();
        int fourthRankHeight = buildings[3].getHeight();

        int heightDifference = Math.abs(firstRankHeight - fourthRankHeight);
        
        System.out.println("Height difference between 1st and 4th rank: " + heightDifference + "m");
    }
}