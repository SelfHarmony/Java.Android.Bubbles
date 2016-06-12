package com.example.zeratul.bubbles;

import android.graphics.Color;

import java.util.Random;

public class EnemyCircle extends SimpleCircle {

    public static final int FROM_RADIUS = 10;
    public static final int TO_RADIUS = 110;
    public static final int ENEMY_COLOR = Color.RED;

    public EnemyCircle(int y, int x, int radius) {
        super(y, x, radius);
    }


    public static EnemyCircle getRandomCircle() {
        Random random = new Random();
        int x = random.nextInt(GameManager.getWidth());
        int y = random.nextInt(GameManager.getHeight());
        int radius = FROM_RADIUS + random.nextInt(TO_RADIUS - FROM_RADIUS);
        EnemyCircle enemyCircle = new EnemyCircle(x, y, radius);
        return enemyCircle;


    }

    public void setEnemyOrFoodColorDependsOn(MainCircle mainCircle) {
        if (IsSmallerThan(mainCircle)) {
            setColor(Color.rgb(0, 200, 0));
        }
        else {
            setColor(ENEMY_COLOR);
        }

    }

    private boolean IsSmallerThan(SimpleCircle circle) {
    if (radius < circle.radius) {
        return true;
        }
        return false;
    }

    public boolean isIntersecting(SimpleCircle circle) {
        return radius + circle.radius >= Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2));
    }
}
