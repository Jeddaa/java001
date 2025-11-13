package menu;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    static public  void main(String[] args) {
        MenuItem menu = new menu.Drink("Latte", 12, false);
        System.out.println(menu.getMenu());
    }
}
