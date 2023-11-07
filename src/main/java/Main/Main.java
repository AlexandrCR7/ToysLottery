package Main;

import Objects.Toys;
import Servise.Constructor;
import Servise.Lottery;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Toys toys = new Toys(1, "Car", 60);
        Toys toys1 = new Toys(2, "Bear", 20);
        Toys toys2 = new Toys(3, "Lego", 20);

        Constructor constructor = new Constructor();
        constructor.arrayCreator(toys);
        constructor.arrayCreator(toys1);
        List<Toys> arr = constructor.arrayCreator(toys2);
        Lottery lottery = new Lottery();

        List<Toys> newList = new ArrayList<>(lottery.SizeArrayForLottery(arr));
        View view = new View();
        for (int i = 0; i < lottery.listOfHuman().size(); i++) {
            int number = lottery.randomNumber(lottery.SizeArrayForLottery(arr));
            view.loggi("Пользователь " + lottery.listOfHuman().get(i) + " получает " +
                    lottery.fillArray(newList, arr)[number]);
            System.out.println("Пользователь " + lottery.listOfHuman().get(i) + " получает " +
                    lottery.fillArray(newList, arr)[number]);
        }
    }
}
