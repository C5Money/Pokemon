public class FirePokemon extends PokemonSuper {
    //    Instance Variables
    private boolean hasPrimeFlame;
    private boolean hasBlackFlame;


    //    Constructor
    public FirePokemon(String name, int xp, String food, String sound, int defence, int attack, String special, boolean hasPrimeFlame, boolean hasBlackFlame) {
        super(name, xp, food, sound, defence, attack, special);
        this.hasPrimeFlame = hasPrimeFlame;
        this.hasBlackFlame = hasBlackFlame;
    }


    //    Getters & Setters
    public boolean isHasPrimeFlame() {
        return hasPrimeFlame;
    }

    public void setHasPrimeFlame(boolean hasPrimeFlame) {
        this.hasPrimeFlame = hasPrimeFlame;
    }

    public boolean isHasBlackFlame() {
        return hasBlackFlame;
    }

    public void setHasBlackFlame(boolean hasBlackFlame) {
        this.hasBlackFlame = hasBlackFlame;
    }


    //    Instance Methods
    public void powerSoul(){
        if(hasPrimeFlame) {
            System.out.println(getName() + " has a Prime Flame and has the ability to evolve into his pure soul.");
            System.out.println("!!! S U S A N O O !!!");
        } else if(hasBlackFlame) {
            System.out.println(getName() + " has a Black Flame and has the ability to evolve into his dark soul.");
            System.out.println("!!! A M A T A R A S U !!!");
        } else {
            System.out.println(getName() + " has no Flame and doesn't have the ability to evolve and will have a balanced soul.");
        }
    }

    @Override
    public void speaks() {
        String voice = getName().substring(0, 4);
        System.out.println(voice + " " + voice);
    }

    @Override
    public void pokeScanner() {
        System.out.println("POKESCANNER:");
        System.out.println("Name: Super " + getName() + "\nLevel: " + (getLevel() +1) + "\nHp: " + (getHp() + 1) + "\nXp: " + (getXp() + 1) + "\nDefence: " + (getDefence() + 1) + "\nAttack: " + (getAttack() + 1) + "\nSpecial: " + getSpecial());
    }

    @Override
    public void ultimateMove() {
        System.out.println(getName() + " uses it's ULTIMATE MOVE: " + getSpecial() + ". This will depleed " + getName() + "'s Hp by 1 point.\"");
        System.out.println(getName() + " has " + (getHp()-1) + " Hp left.");
        System.out.println();
    }
}