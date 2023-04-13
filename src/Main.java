import java.util.Random;

public class Main {
    public static String[] attackType = {"Physical", "Magical", "Kinetic", "Medic", "Golem", "Lucky", "Berserk", "Thor"};
    public static Random random = new Random();

    public static Hero[] heroes = new Hero[3];

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(800);
        boss.setBossDamage(50);
        boss.setBossDefence(chooseAttackType());

        System.out.println(boss.toString());

        //ДЗ на сообразительность
        createHeroes(200, 300, 20, 50, 3);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].toString());
        }
    }

    public static String chooseAttackType() {
        int randomIndex = random.nextInt(attackType.length);
        return attackType[randomIndex];
    }

    //ДЗ на сообразительность
    public static void createHeroes(int minRandomValueForHealth, int maxRandomValueForHeals,
                                    int minRandomValueForDamage, int maxRandomValueForDamage, int quantityHeroes) {
        for (int i = 0; i < quantityHeroes; i++) {
            heroes[i] = new Hero((random.nextInt(minRandomValueForHealth, maxRandomValueForHeals)),
                    (random.nextInt(minRandomValueForDamage, maxRandomValueForDamage)), chooseAttackType());
        }
    }
}