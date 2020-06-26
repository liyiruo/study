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
    private int x=200;
    private int y=200;

    TankFrame() {
        setResizable(false);
        setTitle("tank war");
        setSize(800, 600);
        setVisible(true);
        this.addKeyListener(new MyKeyLisener());
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
        g.fillRect(x,y,50,50);
        //x+=10;
        y+=10;
        System.out.println("this is my word");
    }


    private class MyKeyLisener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
           // x+=10;
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            repaint();
        }
    }

}
