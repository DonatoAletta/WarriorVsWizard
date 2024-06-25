import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Skill[] skills = new Skill[4];

        Random random = new Random();
        skills[0] = new Skill("Slash", 10, 10);
        skills[1] = new Skill("Magic Bolt", 50, 150);
        skills[2] = new Skill("Blade Spinner", 25, 50);
        skills[3] = new Skill("Lightning Bolt", 100, 200);

        Skill[] warriorSkills = {skills[0],skills[2]};
        Skill[] mageSkills = {skills[1],skills[3]};
        Warrior warrior = new Warrior("Giacomo", 1500, 25, warriorSkills, 10);
        Wizard wizard = new Wizard("Mario", 800, 550, mageSkills, 5);

       // warrior.getSkill(1);

        while(warrior.isAlive() && wizard.isAlive()){
            warrior.attack(wizard,skills[random.nextInt(mageSkills.length)]);
            System.out.println("------------------------------");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            wizard.attack(warrior, skills[random.nextInt(warriorSkills.length)]);
            System.out.println("------------------------------");
            wizard.manaPoints += ( 20 * wizard.getAbilityPower() / 2);

            if(!warrior.isAlive()){
                System.out.println(warrior.name + " è morto.");
            }
            else if(!wizard.isAlive()){
                System.out.println(wizard.name + " è morto.");
            }
        }




    }
}