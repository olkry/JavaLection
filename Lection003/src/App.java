import java.util.ArrayList;
import java.util.List;

public class App {

    // // узнать класс обьекта - метод

    // public static void main(String[] args) {
    // Object o = 1;
    // GetType(o); // java.lang.Integer
    // o = 1.2;
    // GetType(o); // java.lang.Double
    // }

    // static void GetType(Object obj) {
    // System.out.println(obj.getClass().getName());
    // }

    // // Метод сложения с неизвестным типом

    // public static void main(String[] args) {
    // System.out.println(Sum(1, 2));
    // System.out.println(Sum(1.0, 2));
    // System.out.println(Sum(1, 2.0));
    // System.out.println(Sum(1.2, 2.1));
    // }

    // static Object Sum(Object a, Object b) {
    // if (a instanceof Double && b instanceof Double) {
    // return (Object) ((Double) a + (Double) b);
    // } else if (a instanceof Integer && b instanceof Integer) {
    // return (Object) ((Integer) a + (Integer) b);
    // }
    // // else if (a instanceof Integer && b instanceof Double) {
    // // return (Object) ((Double) a + (Double) b);
    // // } else if (a instanceof Double && b instanceof Integer) {
    // // return (Object) ((Double) a + (Double) b);
    // // }
    // else
    // return 0;
    // }

    // // Добовляем в массив новый элемент

    // public static void main(String[] args) {
    // int[] a = new int[] { 1, 9 };
    // int[] b = new int[3];
    // System.arraycopy(a, 0, b, 0, a.length);
    // for (int i : a) {
    // System.out.printf("%d ", i);
    // } // 1 9
    // for (int j : b) {
    // System.out.printf("%d ", j);
    // }
    // // 0 9 0 0 0 0 0 0 0 0
    // }

    // // Через метод
    // static int[] AddItem(int[] array, int item) {
    // int length = array.length;
    // int[] temp = new int[length + 1];
    // System.arraycopy(array, 0, temp, 0, length);
    // temp[length] = item;
    // return temp;
    // }

    // public static void main(String[] args) {
    // int[] a = new int[] { 0, 9 };
    // for (int i : a) {
    // System.out.printf("%d ", i);
    // }
    // a = AddItem(a, 2);
    // a = AddItem(a, 3);
    // for (int j : a) {
    // System.out.printf("%d ", j);
    // }
    // }

    // // как можно записать коллекцию
    // ArrayList<Integer> list1 = new ArrayList<Integer>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // ArrayList<Integer> list3 = new ArrayList<>(10);
    // ArrayList<Integer> list4 = new ArrayList<>(list3);

    // public static void main(String[] args) {
    // List list = new ArrayList();
    // list.add(2809);
    // list.add("string line");
    // for (Object o : list) {
    // System.out.println(o);
    // // Проблема извлечения данных, но данные будут выведены.
    // }
    // }

    // public static void main(String[] args) {
    //     List<Integer> list = new ArrayList<Integer>();
    //     list.add(1);
    //     list.add(123);
    //     // list.add("string line");
    //     for (Object o : list) {
    //         System.out.println(o);
    //         // Проблема извлечения данных
    //     }
    // }

    // Для работы колекций
    // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
    // get(pos) – возвращает элемент из списка по указанной позиции
    // indexOf(item) – первое вхождение или -1
    // lastIndexOf(item) – последнее вхождение или -1
    // remove(pos) – удаление элемента на указанной позиции и его возвращение
    // set(int pos, T item) – gjvtoftn значение item элементу, который находится
    // на позиции pos
    // void sort(Comparator) – сортирует набор данных по правилу
    // subList(int start, int end) – получение набора данных от позиции start до end

    // clear() – очистка списка
    // toString() – «конвертация» списка в строку
    // Arrays.asList – преобразует массив в список
    // containsAll(col) – проверяет включение всех элементов из col
    // removeAll(col) – удаляет элементы, имеющиеся в col
    // retainAll(col) – оставляет элементы, имеющиеся в col
    // toArray() – конвертация списка в массив Object’ов
    // toArray(type array) – конвертация списка в массив type
    // List.copyOf(col) – возвращает копию списка на основе имеющегося
    // List.of(item1, item2,...) – возвращает неизменяемый список


}
