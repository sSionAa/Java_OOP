package Java_OOP;
/*
 *   Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
 *   Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
 *   Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
 *   В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
 *   Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
 */

 /*
  Крестьянин:            Разбойник:                 Снайпер                     Колдун:                 Копейщик:
  - Здоровье             - ID                       - ID                        - ID                    - ID
  - Сила                 - Имя                      - Имя                       - Имя                   - Имя
  - Ловкость             - Здоровье                 - Здоровье                  - Здоровье              - Здоровье
  - Выносливость         - Сила                     - Сила                      - Интеллект             - Сила
  - Вид оружия           - Ловкость                 - Ловкость                  - Выносливость          - Выносливость
  - Уровень              - Выносливость             - Выносливость              - Вид оружия            - Вид оружия
  - ID                   - Вид оружия               - Вид оружия                - Мана                  - Защита
  - Имя                                             - Меткость
                                                    - Маскировка
  Арбалетчик:           Монах:
  - ID                  - ID
  - Имя                 - Имя
  - Здоровье            - Здоровье
  - Выносливость        - Выносливость
  - Вид оружия          - Вид оружия
  - Меткость            - Интеллект
  - Количество стрел    - Вера
  - Скорость стрельбы   - Чакра
*/
/*
 *   Добавить в проект класс, предназначенный для хранения координат.
 *   Добавить в абстрактный класс поле, экземпляр класс координат.
 *   Пробросить координаты через конструкторы наследников так,чтобы создавая
 *   объекты вы передавали в параметрах имя и координаты.
 *   Написать алгоритм заполнения команд. Кроме имён каждый персонаж должен иметь координаты.
 *   Одна команда находится с левой стороны другая с правой(у=0 и у=9).
 *   В класс лучников добавить метод поиск ближайшего противника.
 *   Алгоритм расчёта расстояний реализовать в классе координат.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main_Code {
    public static void main(String[] args) {

        List<Persons> team1 = createTeam(10, 0);
        List<Persons> team2 = createTeam(10, 9);

//

        for (Persons persons : team1) {
            System.out.println("team1");
            System.out.println(persons.toString());
            System.out.println();
        }
        for (Persons persons : team2) {
            System.out.println("team2");
            System.out.println(persons.toString());
            System.out.println();
        }
// ищем в команде лучника (crossbowman) и находим к нему ближайшего противника
        int count = 0;
        for (Persons cbm : team1) {
            if (cbm.getClass().getSimpleName().equals("Crossbowman") || cbm.getClass().getSimpleName().equals("Sniper")) {
                System.out.println("Ближайший к " + cbm.getName() + ", класс " + cbm.getClass().getSimpleName() + " противник: =>\n" + cbm.getMinDistance(team2));
                System.out.println();
                count++;
            }
        }
        if (count == 0) System.out.println("В команде нет лучников и снайперов");

    }

    static List<Persons> createTeam(int quantityHeroes, int y) {
        List<Persons> team = new ArrayList<>();
        for (int i = 0; i < quantityHeroes; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team.add(new Magician(Persons.getNewName(), i, y));
                    break;
                case 2:
                    team.add(new Rogue(Persons.getNewName(), i, y));
                    break;
                case 3:
                    team.add(new Crossbowman(Persons.getNewName(), i, y));
                    break;
                case 4:
                    team.add(new Peasant(Persons.getNewName(), i, y));
                    break;
                case 5:
                    team.add(new Sniper(Persons.getNewName(), i, y));
                    break;
                case 6:
                    team.add(new Spearman(Persons.getNewName(), i, y));
                    break;
                case 7:
                    team.add(new Monk(Persons.getNewName(), i, y));
                    break;
            }
        }
        return team;


//        Persons magician = new Magician("Lilia");
//        Persons peasant = new Peasant("Petr");
//        Persons spearman = new Spearman("Goban");
//        Persons sniper = new Sniper("Fortuna");
//        Persons rogue = new Rogue("Trop");
//        Persons monk = new Monk("Anatol");
//        Persons crossbowman = new Crossbowman("Trifani");
//
//        Set<Persons> heroes = new HashSet<>();
//        heroes.add(magician);
//        heroes.add(peasant);
//        heroes.add(spearman);
//        heroes.add(sniper);
//        heroes.add(rogue);
//        heroes.add(monk);
//        heroes.add(crossbowman);
//
//        for (Persons persons : heroes) {
//
//            System.out.println(persons.toString());
//            System.out.println();
//
//        }


    }

}
