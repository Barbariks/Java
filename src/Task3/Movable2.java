package Task3;

public interface Movable2 {
}
class MovableRectangle implements Movable2{
    private MovablePoint2 topLeft;
    private MovablePoint2 buttomRight;
}
class MovablePoint2 extends MovableRectangle implements Movable2{}