package opgave03;

public class Dnd {
    public static void main(String[] args) {
        Hero victor = new Hero(1000,13,32,"victor","Dragon","Double sided axe");
        Monster troll = new Monster(100,10,50,"Troll","Double Drop kick","Fists");
        fight(victor, troll);
    }

    public static void fight(Hero hero, Monster monster) {
        while (hero.lifePoints > 0 && monster.lifePoints > 0) {
            int roll = rollD100();
            hero.heroAttacks(roll, hero, monster);
            if (monster.lifePoints > 0) {
                roll = rollD100();
                monster.monsterAttacks(roll, hero, monster);
            }
        }
    }

    public static int rollD100() {
        return (int) (Math.random() * 100 + 1);
    }
}

