package aufgaben.horses;

public class Bridle {
    private String color;
    private String material;
    private char size;
    private double price;

    public Bridle() {
    }

    // SETTER
    public void setColor(String color) { this.color = color; }
    public void setMaterial(String material) { this.material = material; }
    public void setSize(char size) { this.size = size; }
    public void setPrice(double price) { this.price = price; }

    // GETTER
    public String getColor() { return color; }
    public String getMaterial() { return material; }
    public char getSize() { return size; }
    public double getPrice() { return price; }

    // METHODS
    public String asString() {
        return "\nBridle" + "\n--------------------------------------\n" +
                "Color: " + color + "\n" +
                "Material: " + material + "\n" +
                "Size: " + size + "\n" +
                "\nPRICE: " + price + "\n";
    }
}
