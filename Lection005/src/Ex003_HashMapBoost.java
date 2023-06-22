

import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);  //Вместительность коллекции
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);  // Вмест и процент до увеличения коллекции - 80%
    }
}