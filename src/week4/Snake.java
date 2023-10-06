package week4;
import java.util.Random;

public class Snake extends Monster{
    public Snake() {
        super(4, "Snake", snakeDamage(), 12,0);
    }

    private static int snakeDamage() {
        Random r = new Random();
        return r.nextInt(4) + 3;
    }

    static Random random = new Random();
    public int dropType() {
        int dropTypeChance = random.nextInt(1, 101);

        if (dropTypeChance <= 15) {
            return 1;
        } else if (dropTypeChance <= 30) {
            return 2;
        } else if (dropTypeChance <= 55) {
            return 3;
        } else {
            return 4;
        }
    }

    public Weapon dropWeapon() {
        int dropWeaponChance = random.nextInt(1, 101);

        if (dropWeaponChance <= 50) {
            return Weapon.getWeaponByID(1);
        } else if (dropWeaponChance <= 80) {
            return Weapon.getWeaponByID(2);
        } else {
            return Weapon.getWeaponByID(3);
        }
    }

    public Armor dropArmor() {
        int dropArmorChance = random.nextInt(1, 101);

        if (dropArmorChance <= 50) {
            return Armor.getArmorByID(1);
        } else if (dropArmorChance <= 80) {
            return Armor.getArmorByID(2);
        } else {
            return Armor.getArmorByID(3);
        }
    }

    public int dropMoney() {
        int dropMoneyChance = random.nextInt(1, 101);

        if (dropMoneyChance <= 50) {
            return 1;
        } else if (dropMoneyChance <= 80) {
            return 5;
        } else {
            return 10;
        }
    }
}