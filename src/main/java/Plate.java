public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        boolean cat_satiety = false; //коты при каждой новой кормежке снова голодные
        if (food >= n) { //Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
            food -= n;
            cat_satiety = true;
            System.out.print(" поел ");
        } else {
            System.out.print(" коту не хватило еды");

        }
        return cat_satiety; // этот метод не только уменьшает еду и кормит котов но и сообщает о сытости  кота
    }

    public void info() {
        System.out.println("в тарелке: " + food);
    }

    public void addFood(int z) {
        food += z;
    }
}
