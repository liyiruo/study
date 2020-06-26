package com.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liyiruo
 */
public class TankFrame extends Frame {
    private int x = 200;
    private int y = 200;
    private Dir dir = Dir.DOWN;
    private static final int SPEED = 10;

    TankFrame() {
        setResizable(false);
        setTitle("tank war");
        setSize(800, 600);
        setVisible(true);
        this.addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
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

    private class MyKeyListener extends KeyAdapter {

        boolean bL = false;
        boolean bR = false;
        boolean bU = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            // x+=10;

            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    // x-=10;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    // x += 10;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    // y -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    //  y+=10;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }

        @Override
        public void keyReleased(KeyEvent e) {

            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    // x-=10;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    // x += 10;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    // y -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    //  y+=10;
                    break;
                default:
                    break;
            }
            setMainTankDir();

        }

        private void setMainTankDir() {
            if (bL) {
                dir = Dir.LEFT;
            }
            if (bR) {
                dir = Dir.RIGHT;
            }
            if (bU) {
                dir = Dir.UP;
            }
            if (bD) {
                dir = Dir.DOWN;
            }
        }
    }


}
