package Java_OOP;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import static java.lang.Math.sqrt;

abstract class Persons {

    protected Place pos;
    protected String name;
    protected String race;
    protected int health;
    protected int maxHealth;
    protected int strength;
    protected int magic;
    protected int defense;
    protected int speed;
    protected int level;
    protected String weapon;
    protected String nameTeam;

    //..//
    public Persons(int x, int y, String name, String race, String nameTeam, int health, int maxHealth, int strength, int magic, int defense, int speed, int level, String weapon) {
        this.defense = defense;
        this.health = health;
        this.maxHealth = maxHealth;
        this.name = name;
        this.race = race;
        this.strength = strength;
        this.magic = magic;
        this.speed = speed;
        this.level = level;
        this.weapon = weapon;
        pos = new Place(x, y);
        this.nameTeam = nameTeam;


    }

    public String getRace() {
        return this.race;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int setHealth(int health) {
        this.health = health;
        return this.health;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getSpeeed() {
        return this.speed;
    }

    public int getDefense() {
        return this.defense;
    }

    public int setDefense(int defense) {
        this.defense = defense;
        return this.defense;
    }

    public void toAttack(Persons persons) {
        int damage = persons.getHealth() + persons.getDefense() - this.getStrength();
        persons.setHealth(persons.getHealth() - damage);
        if (persons.getHealth() <= 0) {
            persons.setHealth(0);
            System.out.println("Герой умер :(");
        } else {
            toUpLevel();

            System.out.println("Состояние " + persons.getName() + " после атаки: " + persons.getHealth());
        }

    }

    public int toHeal(Persons persons) {
        if (this.health + persons.magic > this.maxHealth) {
            this.health = this.maxHealth;
        } else this.health = this.health + this.magic;
        return this.health;
    }

    public int toUpLevel() {
        this.level = this.level + 1;
        this.strength = this.strength + 5;
        this.magic = this.magic + 5;
        this.defense = this.defense + 5;
        this.speed = this.speed + 5;
        return this.level;
    }

    public static String getNewName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    public Persons getMinDistance(List<Persons> team) {
        // написать метод по поиску рядом находящегося противника
        double minDistance = sqrt(200);
        Persons nearEnemy = team.getFirst();
        for (Persons persons : team) {
            if (Place.getDistance(pos.getX(), pos.getY(), persons.pos.getX(), persons.pos.getY()) <= minDistance) {
                nearEnemy = persons;
                minDistance = Place.getDistance(pos.getX(), pos.getY(), persons.pos.getX(), persons.pos.getY());
            }
        }

        return nearEnemy;
    }

    @Override
    public String toString() {
        return "Имя героя: " + this.name + ", класс: " + getClass().getSimpleName() + "; Команда: " + Persons.this.getNameTeam()
                + "\nПринадлежность героя: " + this.race + "; Текущее состояние здоровья: " + this.health
                + "; Координаты (" + pos.X + " : " + pos.Y + ")" + "; Приоритет: " + getSpeeed()
                + "\n" + "-".repeat(20);
    }

    public String getNameTeam() {
        return this.nameTeam;
    }

//    @Override
//    public String toString() {
//        return "Имя героя: " + this.name + ", класс: " + getClass().getSimpleName() + "\nПринадлежность героя: " + this.race + "\nТекущее состояние здоровья: " + this.health;
//    }

}
