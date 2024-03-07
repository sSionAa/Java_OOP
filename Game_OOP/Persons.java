package Game_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.*;

public abstract class Persons implements Step {


    protected String name;
    protected String race;
    public int health;
    protected int maxHealth;
    protected int strength;
    protected int magic;
    protected int defense;
    protected int speed;
    protected int level;
    protected String weapon;
    protected String nameTeam;
    public Place place;

    //
    public Persons(String name, Place place, String nameTeam, String race, int health, int maxHealth, int strength, int magic, int defense, int speed, int level, String weapon) {
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
        this.place=place;
        this.nameTeam = nameTeam;
    }
    public String getRace() {
        return this.race;
    }
    public String getName() {
        return this.name;
    }
    public String getWeapon() {
        return this.weapon;
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

    private int setDefense(int defense) {
        this.defense = defense;
        return this.defense;
    }

    public void toAttack(Persons persons) {
        int damage = persons.getHealth() + persons.getDefense() - this.strength;
        persons.setHealth(persons.getHealth() - damage);
        if (persons.getHealth() <= 0) {
            persons.setHealth(0);
        } else {
            toUpLevel();
        }
    }

    public int toHeal(Persons persons) {
        if (this.health + persons.magic > this.maxHealth) {
            this.health = this.maxHealth;
        } else this.health = this.health + this.magic;
        return this.health;
    }

    private int toUpLevel() {
        this.level = this.level + 1;

        return this.level;
    }

    public static String getNewName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    public Persons getMinDistance(List<Persons> team) {
        // написать метод по поиску рядом находящегося противника
        double minDistance = sqrt(200);
        Persons nearEnemy = null;
        for (Persons persons : team) {
            if ((Place.getDistance(this.place,persons.place) <= minDistance && persons.getHealth()>0) ){
                nearEnemy = persons;
                minDistance = Place.getDistance(this.place,persons.place);
            }
        }

        return nearEnemy;
    }

    @Override
    public String toString() {
        return "Имя героя: " + this.nameTeam + ", класс: " + getClass().getSimpleName() + "; \u2665: " + this.health
                + " ⚔" + this.strength
                + "\uD83D\uDEE1\uFE0F" + this.defense;
//
    }

    public String getNameTeam() {
        return this.nameTeam;
    }


    public  String getInfo(){
        return "";
    }
}
