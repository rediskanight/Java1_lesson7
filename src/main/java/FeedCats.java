import java.util.Arrays;

public class FeedCats {

    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3]; //массив котов
        catsArray[0] = new Cat("Barsik", 10);
        catsArray[1] = new Cat("Pushok", 100);
        catsArray[2] = new Cat("Murzik", 10);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < catsArray.length; i++) {  //кормим
            System.out.print(catsArray[i].name + " ");
            catsArray[i].satiety = catsArray[i].eat(plate);
            plate.info();
        }
        for (int i = 0; i < catsArray.length; i++) {  //смотрим
            System.out.println(catsArray[i].name + " сытость: " + catsArray[i].satiety);
        }
        plate.addFood(100);  //добавляем еду в тарелку
        plate.info();


    }
}


