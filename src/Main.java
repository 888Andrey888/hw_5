import java.util.Random;

public class Main {
    public static String[] attackType = {"Physical", "Magical", "Kinetic", "Medic", "Golem", "Lucky", "Berserk", "Thor"};
    public static Random random = new Random();

    public static Hero[] heroes = new Hero[4];//неизменная длинна массива связывает руки... тут конечно лучше использовать коллекции... но уж таковы условия))))

    public static void main(String[] args) {
        Boss boss = new Boss();
        createBoss(boss, 800, 50);
        System.out.println(boss.toString());

        //ДЗ на сообразительность
        int quantityHeroes = 3;
        for (int i = 0; i < quantityHeroes; i++) {
            createHeroes(i, 200, 300, 20, 40);
        }
        createHeroes(3,200, 300, 20, 50, "Berserk");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].toString());
        }
    }

    public static String chooseAttackType() {
        int randomIndex = random.nextInt(attackType.length);
        return attackType[randomIndex];
    }

    //ДЗ на сообразительность

    //Метод для создания героя со случайным типом атаки
    public static void createHeroes(int i, int minRandomValueForHealth, int maxRandomValueForHeals,
                                    int minRandomValueForDamage, int maxRandomValueForDamage) {
        heroes[i] = new Hero((random.nextInt(minRandomValueForHealth, maxRandomValueForHeals)),
                (random.nextInt(minRandomValueForDamage, maxRandomValueForDamage)), chooseAttackType());
    }

    //Перегрузка метода создания героя с явным указанием типа атаки
    public static void createHeroes(int i, int minRandomValueForHealth, int maxRandomValueForHeals,
                                    int minRandomValueForDamage, int maxRandomValueForDamage, String attackType) {
        heroes[i] = new Hero((random.nextInt(minRandomValueForHealth, maxRandomValueForHeals)),
                (random.nextInt(minRandomValueForDamage, maxRandomValueForDamage)), attackType);
    }

    //Так же решил создать метод createBoss, вдруг нужно будет создавать еще боссов
    public static void createBoss(Boss boss, int bossHeals, int bossDamage){
        boss.setBossHealth(bossHeals);
        boss.setBossDamage(bossDamage);
        boss.setBossDefence(chooseAttackType());
    }
}