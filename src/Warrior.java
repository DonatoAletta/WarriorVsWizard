public class Warrior extends Character{

    private int strenght;

    public Warrior(String name, int lifePoints, int manaPoints, Skill[] skills, int strenght) {
        super(name, lifePoints, manaPoints, skills);
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    @Override
    public void attack(Character pg, Skill s) {
        pg.lifePoints = pg.lifePoints - (strenght + s.damage);

        System.out.println(name + " ha attaccato: " + pg.name + " ed è rimasto con " + pg.lifePoints +"HP");
    }
}
