package poketmonWorld;

public class Pairi extends Poketmon implements Ability {
    @Override
    public void skills() {
        SkillName.bodyAttack();
        SkillName.fireAttack();
        SkillName.attackUp();
        SkillName.headAttack();
    }

    @Override
    public void doYouLoveMe() {
        //method 사진찍기,밥먹기,미용하기
        System.out.println(this.love);
    }

    public Pairi() {
        super("Pikachu", "쥐포켓몬", "삐카삐까", 0);
    }

}