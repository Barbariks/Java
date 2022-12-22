package Task1;

public class Ball {
    private int range;
    private String tolshina;

    public Ball(String n,int a){
        tolshina = n;
        range = a;
    }
    public Ball(String n){
        tolshina = n;
        range = 0;
    }
    public Ball(){
        tolshina = "Small";
        range = 10;
    }
    public void setRange(int range){
        this.range = range;
    }
    public void setTolshina(String tolshina){
        this.tolshina = tolshina;
    }
    public String getTolshina(String tolshina){
        return tolshina; }
    public int getRange() {
        return range; }
    public String toString(){
        return this.tolshina+", range "+this.range; }
    public void intoBall(){
        System.out.println(tolshina+" and "+range+" ball");}
}
class BallTest {
    public static void main(String[] args) {
        Ball d1 = new Ball();
        Ball d2 = new Ball("football","white");
        Ball d3 = new Ball("football");
        Ball d4 = new Ball("football","white","15");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}

