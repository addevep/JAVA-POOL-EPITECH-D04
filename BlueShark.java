public class BlueShark extends Shark{

    protected BlueShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        if(animal.getType() == "fish" && animal != this) {
            return true;
        }
        return false;
    }
}