public class ElectricPokemon extends PokemonSuper{
//    Instance Variables
    private int batteryEnergy;


//    Constructor
    public ElectricPokemon(String name, int xp, String food, String sound, int defence, int attack, String special, int batteryEnergy) {
        super(name, xp, food, sound, defence, attack, special);
        this.batteryEnergy = batteryEnergy;
    }


//    Getters & Setters
    public int getBatteryEnergy() {
        return batteryEnergy;
    }

    public void setBatteryEnergy(int batteryEnergy) {
        this.batteryEnergy = batteryEnergy;
    }


//    Instance Methods
    public void electricShockwave(){
        System.out.println(getName() + " used a lot of electricity to create a huge electric shockwave.\nThe energy that erupted, loaded the batteries! ");
        System.out.println(getName() + " now has " + (getBatteryEnergy()+40) + " % more energy in it's batteries.");
        System.out.println();
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " yells out: " + getSound());
    }

    @Override
    public void pokeScanner() {
        System.out.println("POKESCANNER:");
        System.out.println("Name: Super " + getName() + "\nLevel: " + (getLevel() +1) + "\nHp: " + (getHp() + 1) + "\nXp: " + (getXp() + 1) + "\nDefence: " + (getDefence() + 1) + "\nAttack: " + (getAttack() + 1) + "\nSpecial: " + getSpecial() + "\nBatteries: " + getBatteryEnergy()+ " %");
    }

    @Override
    public void ultimateMove() {
        System.out.println(getName() + " uses it's ULTIMATE MOVE: " + getSpecial() + ". This will depleed " + getName() + "'s Hp by 1 point.\"");
        System.out.println(getName() + " has " + (getHp()-2) + " Hp left.");
        System.out.println();
    }

}
