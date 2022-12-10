

    import java.util.Scanner;

    public class Praktikum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год:");
            int year = scanner.nextInt();
             // Если высокосный правда, то выводим соответствующее сообщение:
            if (isLeapYear(year) == true) {
             System.out.println("12.09." + year + ".");
            } else {
             System.out.println("13.09." + year + ".");
            }
            return;                                         //Просто завершение программы
        }
          //Определеяем высокосный год. Если кратен 4, не кратен 100 и кратен 400, то правда:
        public static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            if (year % 100 != 0) {
                if(year % 400 == 0 ){

           return true;
         } else {return true;
         }
         } else {return true;
         }

        } else {return false;
            }
        }
    }


