package cn.itcast.day11.demo07;

public class Hero {
    private String name;
    private Skill skill;

    public String getName() {
        return name;
    }


    public void attack(){
        System.out.println(name +"施放");
        skill.use();
    }
    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero() {
    }
}
