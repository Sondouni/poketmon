package poketmonWorld;

public class Ggobugi extends Poketmon implements Ability {
    @Override
    public void skills() {
        SkillName.bodyAttack();
        SkillName.waterAttack();
        SkillName.hpUp();
        SkillName.noMoreAttack();
    }

    @Override
    public void doYouLoveMe() {
        //method 사진찍기,밥먹기,미용하기
        System.out.println(this.love);
    }

    public Ggobugi() {
        super("Pikachu", "쥐포켓몬", "삐카삐까", 0);
    }

}