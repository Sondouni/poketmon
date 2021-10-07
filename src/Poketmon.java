package poketmonWorld;

public class Poketmon {
    protected String name;
    protected String kind;
    protected String sex;
    protected String crying;
    protected int love;
    public Poketmon(){}
    public Poketmon(String name, String kind,  String crying, int love){
        this.name = name;
        this.kind = kind;
        this.crying = crying;
        this.love = love;
    }
    public String getName() {
        return name;
    }
    public String getKind() {
        return kind;
    }
    public String getSex() {
        return sex;
    }
    public String getCrying() {
        return crying;
    }
    public int getLove() {
        return love;
    }
    private void yourSex(){
        int x = (int)(Math.random()*2);
        if(x==0){
            this.sex = "수컷";
        }else
            this.sex = "암컷";
    }
}
