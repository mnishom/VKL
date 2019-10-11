package contoh;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


public class Robot extends javax.swing.JFrame {
    java.awt.Robot robot;
    
    public Robot() {
        initComponents();
        try {
            robot = new java.awt.Robot();
        } catch (AWTException e) {
        }
        doSomething();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new Robot().setVisible(true);
        });
    }

    private void doSomething() {
        File f;
        try {
            f = new File("Text.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            
            Desktop lock = Desktop.getDesktop();           
            synchronized(lock){
                lock.open(f); 
            }
            Timer t1 = new Timer();
            t1.schedule(new TimerTask() {
                int i = 0;
                @Override
                public void run() {
                    robot.keyPress(0x41);
                    robot.keyRelease(0x41); 
                    i++;
                    if(i==10){
                        robot.keyPress(KeyEvent.VK_ALT);
                        robot.keyRelease(KeyEvent.VK_ALT);
                        robot.keyPress(KeyEvent.VK_F);
                        robot.keyRelease(KeyEvent.VK_F); 
                    }
                    if(i == 11){
                        robot.keyPress(KeyEvent.VK_S);
                        robot.keyRelease(KeyEvent.VK_S);
                        t1.cancel();
                    }
                    
                }
            }, 1000, 1000); 
        } catch (IOException e) {
        }       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
