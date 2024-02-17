package Java_OOP;
/*
 *   Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
 *   Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
 *   Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
 *   В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
 *   Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
 */

/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
Создать абстрактный класс и иерархию наследников.
 */

 /*Крестьянин:
  - Здоровье
  - Сила
  - Ловкость
  - Выносливость
  - Вид оружия
  - Уровень
  - ID
  - Имя

  Разбойник:
  - ID
  - Имя
  - Здоровье
  - Сила
  - Ловкость
  - Выносливость
  - Вид оружиня

  Снайпер
  - ID
  - Имя
  - Здоровье
  - Сила
  - Ловкость
  - Выносливость
  - Вид оружия
  - Меткость
  - Маскировка

  Колдун:
  - ID
  - Имя
  - Здоровье
  - Интеллект
  - Выносливость
  - Вид оружия
  - Мана

  Копейщик:
  - ID
  - Имя
  - Здоровье
  - Сила
  - Выносливость
  - Вид оружия
  - Защита

  Арбалетчик:
  - ID
  - Имя
  - Здоровье
  - Выносливость
  - Вид оружия
  - Меткость
  - Количество стрел
  - Скорость стрельбы

  Монах:
  - ID
  - Имя
  - Здоровье
  -Выносливость
  - Вид оружия
  - Интеллект
  - Вера
  - Чакра

*/


import java.util.HashSet;
import java.util.Set;

public class Main_Code {
    public static void main(String[] args) {


        Persons magician = new Magician("Lilia");
        Persons peasant = new Peasant("Petr");
        Persons spearman = new Spearman("Goban");
        Persons sniper = new Sniper("Fortuna");
        Persons rogue = new Rogue("Trop");
        Persons monk = new Monk("Anatol");
        Persons crossbowman = new Crossbowman("Trifani");

        Set<Persons> heroes = new HashSet<>();
        heroes.add(magician);
        heroes.add(peasant);
        heroes.add(spearman);
        heroes.add(sniper);
        heroes.add(rogue);
        heroes.add(monk);
        heroes.add(crossbowman);

        for (Persons persons : heroes) {

            System.out.println(persons.toString());
            System.out.println();

        }


//        System.out.println();
//        persons1.toHeal(persons3);
//        System.out.println(persons1);
//        System.out.println(persons3.toAttack(persons1));
//        System.out.println(persons1);
//        System.out.println(persons4.getName());

    }

}
