package Task3;

public interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable{
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){

    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
}

class MovableCircle implements Movable{
    private MovablePoint MovablePoint;
    private int radius;
    private MovablePoint centre;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){}
    public String toString(){
        return super.toString();
    }
    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
}