package aufgaben.horses;

public class Saddle {
    private String color;
    private String material;
    private double weight;
    private double price;

    public Saddle() {
    }

    // SETTER
    public void setColor(String color) { this.color = color; }
    public void setMaterial(String material) { this.material = material; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setPrice(double price) { this.price = price; }

    // Getter
    public String getColor() { return color; }
    public String getMaterial() { return material; }
    public double getWeight() { return weight; }
    public double getPrice() { return price; }

    // METHODS
    public String asString() {
        return "\nSaddle" + "\n--------------------------------------\n" +
                "Color: " + color + "\n" +
                "Material: " + material + "\n" +
                "Weight: " + weight + "\n" +
                "\nPRICE: " + price + "\n";
    }
}
