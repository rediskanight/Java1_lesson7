public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;  //сытость


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate p) {
                boolean cat_bool;
                cat_bool = p.decreaseFood(appetite);
                return cat_bool;
    }


}
