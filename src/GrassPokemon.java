public class GrassPokemon extends PokemonSuper{
//    Instance Variables
    private int leaves;


//    Constructor
    public GrassPokemon(String name, int xp, String food, String sound, int defence, int attack, String special, int leaves) {
        super(name, xp, food, sound, defence, attack, special);
        this.leaves = leaves;
    }


//    Getters & Setters
    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }


//    Instance Methods
    @Override
    public void speaks() {
        System.out.println(getSound());
    }

    @Override
    public void pokeScanner() {
        System.out.println("POKESCANNER:");
        System.out.println("Name: " + getName() + "\nLevel: " + getLevel() + "\nHp: " + getHp() + "\nXp: " + getXp() + "\nDefence: " + getDefence() + "\nAttack: " + getAttack() + "\nSpecial: " + getSpecial() + "\nHow many leaves: " + getLeaves());
    }

    @Override
    public void ultimateMove() {
        System.out.println(getName() + " uses it's ULTIMATE MOVE: " + getSpecial() + ". This will depleed " + getName() + "'s Hp by 1 point.\"");
        System.out.println(getName() + " has " + (getHp()-1) + " Hp left.");
        System.out.println();
    }
}
