package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(80);
        for(int i = 0; i < 350; i++){
            if(!(i >= 30 && i < 300)) ints.add(i);  //можно выводить и тут как элемент списка
        }
        for(int i : ints) System.out.println(i);
    }
}
