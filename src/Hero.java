public class Hero {
    private int heroesHealth, heroesDamage;
    private String heroesAttackType;

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public Hero(int heroesHealth, int heroesDamage, String heroesAttackType) {
        this(heroesHealth, heroesDamage);
        this.heroesAttackType = heroesAttackType;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public String toString(){
        return heroesAttackType + " health: " + this.heroesHealth + " damage: " + this.heroesDamage;
    }
}
