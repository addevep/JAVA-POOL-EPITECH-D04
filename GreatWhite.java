public class GreatWhite extends Shark {

    protected GreatWhite(String name) {
        super(name);
    }


    @Override
    public boolean canEat(Animal animal) {
        if (animal instanceof Canary) {
            System.out.println(this.getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            return false;
        } else if (animal instanceof Shark) {
            System.out.println(this.getName() + ": The best meal one could wish for.");
            return true;
        } else {
            return false;
        }
    }
}
