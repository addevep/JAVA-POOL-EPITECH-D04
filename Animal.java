public class Animal {
    private String name;
    private int legs;
    private String type;
    protected enum Type {
        MAMMAL, FISH, BIRD;
    }
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected Animal(String name, int legs, Animal.Type type) {
    this.name = name;
    this.legs = legs;
    this.numberOfAnimals++;

        switch(type) {
            case MAMMAL:
                this.type = "mammal";
                this.numberOfMammals++;
                break;
            case FISH:
                this.type = "fish";
                this.numberOfFish++;
                break;
            case BIRD:
                this.type = "bird";
                this.numberOfBirds++;
                break;
            default:
                break;
        }
        System.out.println("My name is " + name + " and I am a " + this.type + "!");
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLegs() {
        return legs;
    }
    public static int getNumberOfAnimals() {
        if (numberOfAnimals > 1 || numberOfAnimals == 0) {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        } else {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        if (numberOfMammals > 1 || numberOfMammals == 0) {
            System.out.println("There are currently " + numberOfMammals + " " + Type.MAMMAL.toString().toLowerCase() +"s in our world.");
        } else {
            System.out.println("There is currently " + numberOfMammals + " " + Type.MAMMAL.toString().toLowerCase() +" in our world.");
        }
        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        if (numberOfFish > 1 || numberOfFish == 0) {
            System.out.println("There are currently " + numberOfFish + " " + Type.FISH.toString().toLowerCase() +" in our world.");
        } else {
            System.out.println("There is currently " + numberOfFish + " " + Type.FISH.toString().toLowerCase() +" in our world.");
        }
        return numberOfFish;
    }
    public static int getNumberOfBirds() {
        if (numberOfBirds > 1 || numberOfBirds == 0) {
            System.out.println("There are currently " + numberOfBirds + " " + Type.BIRD.toString().toLowerCase() +"s in our world.");
        } else {
            System.out.println("There is currently " + numberOfBirds + " " + Type.BIRD.toString().toLowerCase() +" in our world.");
        }
        return numberOfBirds;
    }
}


