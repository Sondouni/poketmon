package poketmonWorld;

public class Pikachu extends Poketmon implements Ability {
    @Override
    public void skills() {
        SkillName.bodyAttack();
        SkillName.eAttack();
        SkillName.speedUp();
        SkillName.cutPlant();
    }
    @Override
    public void doYouLoveMe() {
        //method 사진찍기,밥먹기,미용하기
        System.out.println(this.love);
    }

    public Pikachu() {
        super("Pikachu", "쥐포켓몬", "삐카삐까", 0);
    }

}

