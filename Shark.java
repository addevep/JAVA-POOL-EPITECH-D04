public class Shark extends Animal {

    private boolean frenzy = false;
    protected Shark(String name) {
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
    }
    public void smellBlood(boolean frenzy) {
        this.frenzy = frenzy;
    }
    public void status(){
        if(frenzy == true) {
            System.out.println(this.getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(this.getName() + " is swimming peacefully.");
        }
    }
    public boolean canEat(Animal animal) {
        if(animal.getType() == "mammal" || animal.getType() == "bird" || animal.getType() == "fish"
                && animal != this) {
            return true;
        }
        return false;
    }
    public void eat(Animal animal) {
        if (this.canEat(animal) == true  && frenzy == true) {
            System.out.println(this.getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
            this.frenzy = false;
        } else {
            System.out.println(this.getName() + ": It's not worth my time.");
        }
    }
}
