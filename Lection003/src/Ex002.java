package Lection003.src;
// package Lesson_03;
import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(); // Если только один тип
    //    ArrayList list = new ArrayList(); // Усли микс
       list.add(2809);
       list.add(34);
    //    list.add("list");


       for (Object o : list) {
           System.out.println(o);
       }
   }
}
