package com.kitfox.svg.example;

import com.kitfox.svg.app.beans.SVGPanel;
import java.awt.BorderLayout;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SimpleIconFrame.java
 *
 * Created on Mar 10, 2010, 11:25:47 AM
 */

/**
 *
 * @author kitfox
 */
public class SimpleIconFrame extends javax.swing.JFrame
{
    SVGPanel panel = new SVGPanel();

    /** Creates new form SimpleIconFrame */
    public SimpleIconFrame()
    {
        initComponents();

        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setAntiAlias(true);
        try {
            panel.setSvgURI(SimpleIconFrame.class.getResource("tree.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("casing2.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("casing2-opt.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("PseudoColor.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("degrade.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("Z.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("test-brd.svg").toURI());
//              panel.setSvgURI(SimpleIconFrame.class.getResource("nonScalingStroke.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("areaCrash.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("use.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("data-uri-scheme-test-image.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("marker.svg").toURI());
//            panel.setSvgURI(SimpleIconFrame.class.getResource("markerTest.svg").toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(SimpleIconFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        setSize(640, 480);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleIconFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
