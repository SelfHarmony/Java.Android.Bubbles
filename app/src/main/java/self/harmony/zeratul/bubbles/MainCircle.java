package self.harmony.zeratul.bubbles;

import android.graphics.Color;

public class MainCircle extends  SimpleCircle{
    public static final int INIT_RADIUS = 50;
    public static final int MAIN_SPEED = 30;
    public static final int OUR_COLOR = Color.BLUE;

    public MainCircle(int y, int x) {
        super(y, x, INIT_RADIUS);
        setColor(OUR_COLOR);
    }


    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x1 - x) * MAIN_SPEED / GameManager.getWidth();
        int dy = (y1 - y) * MAIN_SPEED / GameManager.getHeight();
        x += dx;
        y += dy;
    }


    public void initRadius() {
        radius = INIT_RADIUS;
    }

    public void grow(SimpleCircle circle) {
        // pi * newR ^ 2 = pi * R^2 + pi * Reaten^2
        radius = (int) Math.sqrt(Math.pow(radius, 2) + Math.pow(circle.radius, 2));
    }
}


//just testing git (creating branch)2