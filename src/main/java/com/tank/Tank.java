package com.tank;

import java.awt.*;

/**
 * 这个是一个封装了坦克信息的类
 *
 * @author liyiruo
 */
public class Tank {
    private int x, y;
    private Dir dir = Dir.DOWN;
    private static final int SPEED=5;

    public Tank(int x, int y, Dir dir) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 50, 50);
        //x+=10;
        //y += 10;
        // System.out.println("this is my word");

        switch (dir) {

            case DOWN:
                y += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case LEFT:
                x -= SPEED;
                break;
            default:
                break;
        }
    }
}
