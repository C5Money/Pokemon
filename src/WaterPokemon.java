public class WaterPokemon extends PokemonSuper{
//    Instance Variables
    private int hydrationLevel;


//    Constructor
    public WaterPokemon(String name, int xp, String food, String sound, int defence, int attack, String special, int hydrationLevel) {
        super(name, xp, food, sound, defence, attack, special);
        this.hydrationLevel = hydrationLevel;
    }


//    Getters & Setters
    public int getHydrationLevel() {
        return hydrationLevel;
    }

    public void setHydrationLevel(int hydrationLevel) {
        this.hydrationLevel = hydrationLevel;
    }


//    Instance Methods
    public void rainDance(){
        System.out.println(getName() + " hydrates every living entity in it's vicinity. " + getName() + " get's life-energy back and it's Hp rises by 2 points.");
        System.out.println(getName() + "'s Hp is now: " + (getHp() +2));
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " yells out: " + getSound());
    }

    @Override
    public void pokeScanner() {
        if(getHydrationLevel() % 3 == 0){
            System.out.println(getName() + " has evolved into: Super " + getName() + " !!!");
            System.out.println();
            System.out.println("Super " + getName() + "'s Level, Hp, Xp, Defence, and Attack all increased by 1 point !!!");
            System.out.println("Super " + getName() + " now has a: Special Attack.");

        } else {
            System.out.println("POKESCANNER:");
            System.out.println("Name: " + getName() + "\nLevel: " + getLevel() + "\nHp: " + getHp() + "\nXp: " + getXp() + "\nDefence: " + getDefence() + "\nAttack: " + getAttack() + "\nHydration level: " + getHydrationLevel() + " %");
        }
    }

    @Override
    public void ultimateMove() {
        System.out.println(getName() + " doesn't have an ultimate move. \nIt focusses on life.");
        System.out.println();
    }
}
