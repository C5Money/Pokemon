import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class PokemonSuper {
//    Instance Variables
    private String name;
    private int level;
    private int hp;
    private int xp;
    private String food;
    private String sound;
    private int defence;
    private int attack;
    private String special;


//    Constructor
    public PokemonSuper(String name, int xp, String food, String sound, int defence, int attack, String special) {
        this.name = name;
        this.level = 1;
        this.hp = 1;
        this.xp = xp;
        this.food = food;
        this.sound = sound;
        this.defence = defence;
        this.attack = attack;
        this.special = special;
    }


//    Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        if (hp % 5 == 0 || hp >= 5) {
            this.level = level+1;
        }
        return this.level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }


//    Instance Methods
    public abstract void speaks();

    public abstract void pokeScanner();

    public abstract void ultimateMove();

    public void eat(String food){
        Scanner input = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>(Arrays.asList("Steaming hot Lava", "Cloudy rain drops", "fresh power leaves", "Thor lightning"));


        System.out.println(getName() + " eats " + food);
        System.out.println(getName() + " gets 1 hp. Totall hp is: " + (this.hp = hp +1));
        System.out.println();

        if(getHp() % 3 == 0){
            System.out.println(getName() + " can get 2 extra hp if you choose the right food. If it's the wrong food " + getName() + " will loose 1 hp.\nDo you want to try? y or n: ");
            String feedAnswerUser = input.nextLine();
            if (feedAnswerUser.equalsIgnoreCase("y")) {
                System.out.println("Choose one of these foods. Press: 0. for steaming hot Lava, 1. for Cloudy rain drops, 2. for fresh power leaves, 3. for Thor lightning");
                int foodAnswer = input.nextInt();
                input.nextLine();
                if(foodAnswer == 0){
                    this.hp = hp + 2;
                    System.out.println("You choose " + (foods.get(foodAnswer)) + ". This is " + getName() + "'s powerfood.");
                    System.out.println(getName() + "'s hp rises with 2 points !!!");
                } else {
                    this.hp = hp - 1;
                    System.out.println("That's the wrong answer! Know your Pokemon's basic needs or else you will never be a good Pokemon trainer!");
                    System.out.println(getName() + "'s Hp decreased by 1 point.");
                }
            } else {
                System.out.println("Next time take a risk with your pokemon. It will give it more courage in it's fights.");
            }
        }
    }

    public void getPokeDex(){
        System.out.println("POKEDEX - How to handle my Pokemon.");
        System.out.println("1. getAllStats(): Get all the data of your Pokemon.");
        System.out.println(" - When your Pokemon evolves, this will show in your POKESCANNER.\nGet to level 2 for a surprise.");
        System.out.println("2. eat(): Feed Pokemon");
        System.out.println(" - When fed, your Pokemon will increase 1 HP. \nFeed multiple times for surprise.");
        System.out.println("To be continued...");
    }
}