package Java_OOP;

import java.util.Random;

abstract class Persons {

    protected String name;
    protected String race;
    protected int health;
    protected int maxHealth;
    protected int strength;
    protected int magic;
    protected int defense;
    protected int speed;
    protected int level;
    protected  String weapon;

    //
    public Persons(String name, String race, int health, int maxHealth, int strength, int magic, int defense, int speed, int level, String weapon){
        this.defense=defense;
        this.health=health;
        this.maxHealth =maxHealth;
        this.name=name;
        this.race=race;
        this.strength=strength;
        this.magic=magic;
        this.speed=speed;
        this.level=level;
        this.weapon=weapon;


    }

    public String getRace(){
        return this.race;
    }
    public String getWeapon(){
        return this.weapon;
    }
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
    public int setHealth(int health){
        this.health=health;
        return this.health;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getMagic(){
        return this.magic;
    }
    public int getSpeeed(){
        return this.speed;
    }

    public int getDefense(){
        return this.defense;
    }
    public int setDefense(int defense){
        this.defense=defense;
        return this.defense;
    }

    public String toAttack(Persons persons){
        int damage=persons.getStrength()-this.defense;
        if (damage<=0){
            persons.setHealth(0);
            return ("Состояние " + persons.getName() + " после атаки: герой умер");
        }
        toUpLevel();
        this.health=this.health-damage;
        return ("Состояние " + this.name + " после атаки: " + this.health);

    }

    public int toHeal(Persons persons){
        if (this.health + persons.magic > this.maxHealth){
            this.health=this.maxHealth;
        }
        else this.health = this.health + this.magic;
        return this.health;
    }

    public int toUpLevel(){
        this.level=this.level+1;
        this.strength=this.strength+5;
        this.magic=this.magic+5;
        this.defense=this.defense+5;
        this.speed=this.speed+5;
        return this.level;
    }




    @Override
    public String toString(){
        return "Имя героя: " + this.name + ", класс: "+ getClass().getSimpleName() + "\nПринадлежность героя: " + this.race + "\nТекущее состояние здоровья: " + this.health;
    }

}
