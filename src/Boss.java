public class Boss {
    private int bossHealth, bossDamage;
    private String bossDefence;

    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setBossHealth(int bossHealth) {
        if (bossHealth >= 700) {
            this.bossHealth = bossHealth;
        }else{
            System.out.println("Too small value");
        }
    }

    public void setBossDamage(int bossDamage) {
        if (bossDamage > 30) {
            this.bossDamage = bossDamage;
        }else{
            System.out.println("Too small value");
        }
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }

    public String toString(){
        return "Health: " + this.bossHealth + " Damage: " + this.bossDamage + " Defence: " + this.bossDefence;
    }
}
