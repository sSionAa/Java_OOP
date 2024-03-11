package Java_OOP;

import Java_OOP.*;
import Java_OOP.Persons;
import Personss.ArrowsUnits.*;
import Personss.Healers.*;
import Personss.Helpers.*;
import Personss.Infantry.*;
import Game_OOP.Persons;
import Game_OOP.*;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

    

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
/*
*    Добавить в файл интерфейса метод void step() это будет основной метод взаимодействыия с объектами. 
*    Добавить интерфейс в базовый абстрактный класс. Реализовать этот метод во всех классах наследниках. 
*    Для начала просто заглушкой. Доработать классы лучников. 
*    Лучник должен во первых проверить жив ли он и есть ли у него стрелы, если нет то завершить метод. 
*    Есль всё да, то найти ближайшего противника и выстрелить по немы и, соответственно потратить одну стрелу. 
*    Реализовать весь функционал лучников в методе step().
*    Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле. 
*    Крестьянин = 0, маги=1, пехота=2, лучники=3. В мэйне сделать так, чтобы сначала делали ход персонажи 
*    с наивысшей инициативой из обеих комманд а с наименьшей в конце.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main_Code {
    public static ArrayList<Persons> holyTeam = createTeam(10, 10, "holyTeam");
    public static ArrayList<Persons> darkTeam = createTeam(10, 1, "darkTeam");
    public static ArrayList<Persons> allTeam = new ArrayList<>();
 
 
    public static void main(String[] args) {
            // allTeam.addAll(holyTeam);
            // allTeam.addAll(darkTeam);
           // сортируем всех игроков по скорости (приоритету)
            //allTeam.sort((o1, o2) -> o2.getSpeeed() - o1.getSpeeed());
            // проверяем сортировку
    
    
    
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort((o1, o2) -> o2.getSpeeed() - o1.getSpeeed());
        Scanner scanner = new Scanner(System.in);
        while (true) {

            View.view();
            scanner.nextLine();
            int count1 = 0;
            int count2 = 0;
            for (Persons holy : holyTeam) {
                count1 += holy.getHealth();
            }
            for (Persons dark : holyTeam) {
                count2 += dark.getHealth();
            }
            if (count2 <= 0) {
                System.out.println("Победила команда holy!");
                break;
            }
            if (count1 <= 0) {
                System.out.println("Победила команда dark!");

                break;
            }
            for (Persons unit : allTeam) {
                if (holyTeam.contains(unit)) unit.getStep(darkTeam, holyTeam);
                else unit.getStep(holyTeam, darkTeam);
            }
        }
    }

    static ArrayList<Persons> createTeam(int quantityHeroes, int y, String nameTeam) {
        ArrayList<Persons> team = new ArrayList<>();
        for (int i = 1; i < quantityHeroes + 1; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team.add(new Magician(Persons.getNewName(), i, y, nameTeam));
                    break;
                case 2:
                    team.add(new Rogue(Persons.getNewName(), i, y, nameTeam));
                    break;
                case 3:
                    team.add(new Crossbowman(Persons.getNewName(), i, y, nameTeam, 30));
                    break;
                case 4:
                    team.add(new Peasant(Persons.getNewName(), i, y, nameTeam));
                    break;
                case 5:
                    team.add(new Sniper(Persons.getNewName(), i, y, nameTeam, 30));
                    break;
                case 6:
                    team.add(new Spear(Persons.getNewName(), i, y, nameTeam));
                    break;
                case 7:
                    team.add(new Monk(Persons.getNewName(), i, y, nameTeam));
                    break;
            }
        }
        return team;
    }
}
