public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        System.out.println(ball);
        ball.setXY(1, 5);
        System.out.println(ball);
        ball.move(3, 2);
        System.out.println(ball.getX() + " " + ball.getY());
    }
}
