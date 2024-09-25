package aufgaben.horses;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Roberto");
        horse.setBreed("Irish Sport Horse");
        horse.setColor("Pink");
        horse.setPersonality("Vengeful, occasionally shoots lasers from it's eyes.");
        horse.setAge(8);
        horse.setSex("Gelding");
        horse.setHeight(167);
        horse.setPrice(9000.99);

        Saddle saddle = new Saddle();
        saddle.setColor("Purple");
        saddle.setMaterial("Faux leather but it's shiny");
        saddle.setWeight(3.7);
        saddle.setPrice(250.0);

        horse.setSaddle(saddle);

        Bridle bridle = new Bridle();
        bridle.setColor("white");
        bridle.setMaterial("leather");
        bridle.setSize('F');
        bridle.setPrice(220.0);

        horse.setBridle(bridle);

        System.out.println("Horse\n--------------------------------------\n");
        System.out.println(horse.asString());
    }
}
