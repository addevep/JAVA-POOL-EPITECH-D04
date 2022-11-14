public class Cat extends Animal {
    private String color = "grey";
    protected Cat(String name, String color) {
        super(name, 4, Type.MAMMAL);
        this.color = color;
        System.out.println(name + ": MEEEOOWWWW");
    }
    protected Cat(String name) {
        super(name, 4, Type.MAMMAL);
        System.out.println(name + ": MEEEOOWWWW");
    }
    public void meow() {
        System.out.println(this.getName() + " the " + color + " kitty is meowing.");
    }
    public String getColor() {
        return color;
    }
}
