package com.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liyiruo
 */
public class Main {

    public static void main(String[] args) {
        TankFrame f = new TankFrame();
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f.repaint();
        }
        /*f.setVisible(true);
        f.setResizable(false);
        f.setTitle("tank war");
        f.setSize(800,600);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });*/
    }
}
