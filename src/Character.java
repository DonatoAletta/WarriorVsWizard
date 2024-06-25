public abstract class Character {
    protected String name;
    protected int lifePoints;
    protected int manaPoints;
    protected Skill[] skills;

    public Character(String name, int lifePoints, int manaPoints, Skill[] skills){
        this.name = name;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.skills = skills;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void addSkill(Skill s){
        try{
            for(Skill element: skills){
                if(element == null){
                    element = s;
                }
            }
            System.out.println("Aggiunta nuova skill " + s);
        } catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("La barra skill è piena! Impossibile aggiungere nuove skill");
        }

    }

    public void getSkill(int i ){
        try{
            System.out.println(skills[i].name);
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Le skill sono massimo 4");
        }

    }

    public boolean isAlive(){
        return lifePoints >= 0;
    }

    public abstract void attack(Character pg, Skill s);

}

