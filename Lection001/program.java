package Lection001;

// public class program{
//     public static void main(String[] args) {

//     }
// }

// /**
//  * program
//  */
// public class program {
//     public static void main(String[] args) {
//         System.out.println("bue world");
//         System.out.println("world");
//         String s = "0075  ";
//         System.out.println(s);
//     }

// }

// ЯВНАЯ ТИПИЗАЦИЯ

// /**
//  * типы данных - целочисленные
//  */
// public class program {

//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age);
//         System.out.println(salary);
//     }
// }

// /**
//  * типы данных - натуральные
//  */
// public class program {

//     public static void main(String[] args) {
//         float e = 2.7f;
//         double pi = 3.1415;
//         System.out.println(e);
//         System.out.println(pi);
//     }
// }

// /**
//  * типы данных - символ
//  */
// public class program {
//     public static void main(String[] args) {
//         char ch = '1';
//         System.out.println(Character.isDigit(ch));
//         ch = 'a';
//         System.out.println(Character.isDigit(ch));
//     }

// }

// /**
//  * Явный перевод типа данных
//  */
// public class program {
//     public static void main(String[] args) {
//         int a = 18;
//         double d = a;

//     }

// }

// /**
//  * Истинность
//  */
// public class program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1);
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2);
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3);
//     }

// }

// /**
//  * Строки
//  */
// public class program {
//     public static void main(String[] args) {
//         String msg = "Hello World";
//         System.out.println(msg);
//     }

// }

// НЕЯВНАЯ ТИПИЗАЦИЯ

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         var i = 123;                                // При компеляции подставит сам наиболее  подходящий тип

//         var a = 123;
//         var b = 123.456;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(getType(a));
//         System.out.println(getType(b));
//     }
//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
//     }
// }

// КЛАССЫ ОБЁРТКИ

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         int i = 123;
//         System.out.println(Integer.MAX_VALUE);  // Integer - класс обёртка, даёт поалный функционал класса
//         System.out.println(Integer.MIN_VALUE);
//         String s = "qwer";
//         System.out.println(s.charAt(1));  // Берем символ 1, нумерация с 0
//     }
// }

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         int a = 123;
//         a++;
//         System.out.println(a);
//         System.out.println(a++); // Приоретет вывода на консоль выше присвоения инкремента - постфиксный
//         System.out.println(a);
//         System.out.println(++a); // Приоретет становится прифексны, первочерёдным
//         int b = 6;
//         int c = b-- - b--;
//         int d = --b - b--;
//         int e = --b - --b;
//         int f = b-- - --b;
//         System.out.println(c);
//         System.out.println(d);
//         System.out.println(e);
//         System.out.println(f);
//     }
// }

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         boolean a = 123 > 234;
//         System.out.println(a);
//         boolean b = 123<=234;
//         System.out.println(b);
//         boolean c = 123 != 234;
//         System.out.println(c);
//     }
// }

// /**
//  * Побитовый сдвиг, побитовые операции
//  */
// public class program {

//     public static void main(String[] args) {
//         int a = 8;
//         // 1000 on bit
//         // a = a << 1; побитовый сдвиг на 1 влево
//         System.out.println(a << 1);
//         // 10000 в битах
//         int b = 18;
//         // 10010
//         System.out.println(b >> 1);
//         // 1001

//         int c = 5;
//         // 101 bit
//         int d = 2;
//         // 10 bit == 010 bit
//         System.out.println(c | d);
//         // 101
//         // 010
//         // 111
//         System.out.println(c & d);
//         // 101
//         // 010
//         // 000
//         System.out.println(c ^ d);
//         // 101
//         // 010
//         // 111

//         boolean q = true;
//         boolean w = true;
//         System.out.println(q & w);
//         System.out.println(q && w);

//         String s = "qwer1"; // 5, 0...4
//         boolean f = s.length() >= 5 && s.charAt(4) == '1'; // в данном случае если первая операция не выполняется,
//                                                            // программа останавливается
//         System.out.println(f);

//         // String p = "qwe1"; // 4, 0...3
//         // boolean o = p.length() >= 5 & p.charAt(4) == '1'; // не останавливается, если не выполнено первое, и при
//         //                                                   // проверки второго утверждение выходит за рамки, краша
//         //                                                   // программу.
//         // System.out.println(o);

//         // Также и работает операция ИЛИ (  || ;  |  )
//     }
// }

// МАССИВЫ

// /**
//  * Одномерные массивы
//  */
// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[10]; // По умолчанию присвоются 0
//         System.out.println(arr.length);
//         System.out.println(arr[3]);
//         arr = new int[] {1,2,3,4,5}; // Присваиваем символы напрямую
//         System.out.println(arr.length);
//         System.out.println(arr[3]);
//         arr[3] = 18;
//         System.out.println(arr[3]);

//     }

// }

// /**
//  * Многомерные массивы
//  */
// public class program {
//     public static void main(String[] args) {
//         // int[] arr[] = new int[3][5];
//         // for (int[] line : arr) {
//         //     for (int item : line) {
//         //         System.out.printf("?", item);
//         //     }
//         //     System.out.println();
//         // }

//         int[][] arr = new int[3][5];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("?", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }

// }

// ПРЕОБРАЗОВАНИЯ

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         int i = 123;
//         double d = i;
//         System.out.println(i);
//         System.out.println(d);
//         d = 3.1415;
//         i = (int) d;
//         System.out.println(d);
//         System.out.println(i);
//         byte b = Byte.parseByte("123");
//         System.out.println(b);
//         // b = Byte.parseByte("1234"); // Тип Byte может хранить от 0...255
//         // System.out.println(b);

//     }
// }

// ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА

// import java.util.Scanner;
// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

// ФОРМАТИРОВАННЫЙ ВЫВОД

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         // String res = a + " + " + b + " = " + c; // Медленно и опасно
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//     }
// }

// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

// /**
//  * Виды спецификаторов
//  */
// public class program {
//     public static void main(String[] args) {

//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi); // 3,141500
//         System.out.printf("%.2f\n", pi); // 3,14
//         System.out.printf("%.3f\n", pi); // 3,141
//         System.out.printf("%e\n", pi); // 3,141500e+00
//         System.out.printf("%.2e\n", pi); // 3,14e+00
//         System.out.printf("%.3e\n", pi); // 3,141e+00
//         }

// }

// ВНЕШНИИ ФУНКЦИИ И МЕТОДЫ - СОЗДАЛИ LIB

// /**
//  *  добовляем функции
//  */
// public class program {

//     public static void main(String[] args) {
//         lib.sayHi();
//         System.out.println(lib.sum(8, 10));
//         System.out.println(lib.factor(5));
//     }
// }

// Управляющие конструкции

// /**
//  * условный оператор
//  */
// public class program {

//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b)
//             c = a;
//         if (b > a)
//             c = b;
//         System.out.println(c);
//     }

// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }

// Оператор выбора

// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         // int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             // ...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         // iScanner.close();
//     }
// }

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {

//         int a = 123;

//         switch (a) {
//             case 1:
//             case 2:
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("a");
//                 break;
//             case 6:
//             case 7:
//             case 8:
//             case 9:
//             case 10:
//                 System.out.println('b');
//                 break;
//             default:
//                 break;
//         }

//     }
// }

// ЦИКЛЫ

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             if (i % 2 != 0) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int i : arr) {
//             System.out.printf("%d ", i);
//         }
//         System.out.println();
//     }
// }

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         int[] arr = new int[] {1,2,3,4,5,6,77,99};
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//     }
// }

// РАБОТА С ФАЙЛАМИ

// import java.io.FileWriter;
// import java.io.IOException;

// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", true)) { // Если аргумент false - создаст или перезапишет файл,
//                                                                  // удалит всё из старого. Если True - допишет в новый.
//             fw.append('\n');
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

// import java.io.*;
// // Вариант посимвольно
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     }
// }

// import java.io.*;

// public class program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }