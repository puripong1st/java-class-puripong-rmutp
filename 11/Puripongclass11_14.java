// สร้าง enum Continent ที่เก็บชื่อทวีปต่างๆ
enum Continent_1 {
    Europe(747636028), Asia(460126382), Africa(1275920970), NorthAmerica(579024000),
    SouthAmerica(423581078), Antarctica(1000), Oceania(42939146);

    private int population;

    // กำหนดจำนวนประชากรในทวีป
    Continent_1(int population) {
        this.population = population;
    }

    // เมธอดส่งคืนจำนวนประชากรในทวีป
    public int getPopulation() {
        return population;
    }

    // เมธอดเพิ่มจำนวนประชากรในทวีป
    public void addPopulation(int amount) {
        population += amount;
    }
}

public class Puripongclass11_14 {
    public static void main(String[] args) {
        Continent_1 con;
        con = Continent_1.Europe;
        con.addPopulation(10);
        con = Continent_1.Asia;
        con.addPopulation(30);

        for (Continent_1 c : Continent_1.values()) {
            System.out.println(c + " has " + c.getPopulation() + " people");
        }
    }
}
