public class Wizard extends Character{
    private int abilityPower;

    public Wizard(String name, int lifePoints, int manaPoints, Skill[] skills, int abilityPower) {
        super(name, lifePoints, manaPoints, skills);
        this.abilityPower = abilityPower;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    @Override
    public void attack(Character pg, Skill s) {
        if(manaPoints >= s.mana){
            pg.lifePoints = pg.lifePoints - (s.damage * abilityPower) /2;
            manaPoints -= s.mana;
            System.out.println(name + " ha attaccato: " + pg.name + " ed è rimasto con " + pg.lifePoints +"HP");
            System.out.println(name + " ha " + manaPoints + " MP rimanenti.");

        }
    }
}
