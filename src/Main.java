public class Main {
    public static void main(String[] args) {
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        +++++++++++++         Welcome to PokeWorld!!!         ++++++++++++++
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        ++++++++                                                    ++++++++
//        ++++++++                 Make your own Pokemon.             ++++++++
//        ++++++++        Level up through Feeding and Fighting.      ++++++++
//        ++++++++       Be the best Pokemon trainer in the WORLD.    ++++++++
//        ++++++++                                                    ++++++++
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        ++++++++    !! READ Manual after making your own Pokemon:   ++++++++
//        ++++++++                   getPokeDex()                      ++++++++
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        FirePokemon charizard = new FirePokemon("Charizard", 0, "Lava", "BallllBall", 0, 0, "fireball Jutsu", true, false);
        charizard.getPokeDex();
        System.out.println();
        charizard.pokeScanner();
        System.out.println();
        charizard.eat(charizard.getFood());
        charizard.eat(charizard.getFood());
        charizard.pokeScanner();
        System.out.println();
        FirePokemon uchihazard = new FirePokemon("Itachi", 0, "charcole", "Katonkaton", 3, 5, "Susanoo", true,true);
        uchihazard.powerSoul();
        uchihazard.ultimateMove();
        System.out.println();
        uchihazard.speaks();
        System.out.println();
        uchihazard.pokeScanner();

        WaterPokemon suitonNin = new WaterPokemon("Tobirama", 0, "Soup", "Slurpie", 2,0, "rainDance", 86);
        suitonNin.pokeScanner();
        System.out.println();
        suitonNin.rainDance();
        suitonNin.speaks();
        System.out.println();
        suitonNin.ultimateMove();

        GrassPokemon konoha = new GrassPokemon("Konoha", 4, "Grass", "Konoha Sempuh", 5, 8, "Rasengan", 112);
        konoha.eat(konoha.getFood());
        konoha.eat(konoha.getFood());
        konoha.eat(konoha.getFood());
        konoha.speaks();
        System.out.println();
        konoha.ultimateMove();
        konoha.pokeScanner();

        ElectricPokemon pikachu = new ElectricPokemon("Sasuke", 5, "Thunderbolts", "dzzdzzz", 3, 7, "Chidori", 35);
        pikachu.pokeScanner();
        System.out.println();
        pikachu.eat(pikachu.getFood());
        pikachu.electricShockwave();
        pikachu.ultimateMove();
        System.out.println();
        pikachu.pokeScanner();
    }
}
