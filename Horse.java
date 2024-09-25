package aufgaben.horses;

public class Horse {
    private String name;
    private String breed;
    private String color;
    private String personality;
    private String sex;
    private int height;
    private int age;
    private double price;

    private Saddle saddle;
    private Bridle bridle;

    public Horse(String name) {
        this.name = name;
    }

    // SETTER
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }
    public void setColor(String color) { this.color = color; }
    public void setPersonality(String personality) { this.personality = personality; }
    public void setSex(String sex) { this.sex = sex; }
    public void setHeight(int height) { this.height = height;}
    public void setAge(int age) { this.age = age; }
    public void setPrice(double price) { this.price = price;}

    public void setSaddle(Saddle saddle) { this.saddle = saddle;}
    public void setBridle(Bridle bridle) { this.bridle = bridle; }

    // GETTER
//    public String getName() { return name; }
//    public String getBreed() { return breed; }
//    public String getColor() { return color; }
//    public String getPersonality() { return personality; }
//    public String getSex() { return sex; }
//    public int getHeight() { return height; }
//    public int getAge() { return age; }
//    public double getPrice() { return price; }

    // METHODS
    public String asString() {
        return "Name: " + name +  "\n" +
                "Personality: " + personality + "\n" +
                "Breed: " + breed + "\n" +
                "Color: " + color + "\n" +
                "Sex: " + sex + "\n" +
                "Height: " + height + " kg" + "\n" +
                "Age: " + age + "\n" +
                "\nPRICE: " + price + " Euro" + "\n" +
                saddle.asString() + bridle.asString();
    }

}
