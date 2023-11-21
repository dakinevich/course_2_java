public class TestBall {
    public static void test(){
        Ball ball = new Ball(12.0, 13.0);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.setXY(12,4.0);
        System.out.println(ball.toString());
    }
}
