/*
 * ScalePanel.java
 *
 * Created on February 19, 2006, 3:35 PM
 */

package ika.gui;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

/**
 *
 * @author  Bernhard Jenny, Institute of Cartography, ETH Zurich
 */
public class DeformPanel extends javax.swing.JPanel {
    
    private Rectangle2D objBounds;
    
    public boolean showDeformDialog(Frame frame) {
        // fill GUI with values
        this.wNumberField.setDoubleValue(getObjBounds().getMinX());
        this.eNumberField.setDoubleValue(getObjBounds().getMaxX());
        this.sNumberField.setDoubleValue(getObjBounds().getMinY());
        this.nNumberField.setDoubleValue(getObjBounds().getMaxY());
                
        String title = "Deform Selected Features to New Bounds";
        Icon icon = ika.app.ApplicationInfo.getApplicationIcon();
        Object[] options = { "OK", "Cancel" };
        int resID = JOptionPane.showOptionDialog(frame,
                                   this,
                                   title,
                                   JOptionPane.YES_NO_OPTION,
                                   JOptionPane.PLAIN_MESSAGE,
                                   icon,
                                   options,
                                   options[0]);
        if (resID == JOptionPane.CANCEL_OPTION
                || resID == JOptionPane.CLOSED_OPTION
                || resID == 1)
            return false;
        
        // read settings from dialog
        double w = this.wNumberField.getDoubleValue();
        double e = this.eNumberField.getDoubleValue();
        double s = this.sNumberField.getDoubleValue();
        double n = this.nNumberField.getDoubleValue();
        if (e < w) {
            double temp = e;
            e = w;
            w = temp;
        }
        if (n < s) {
            double temp = n;
            n = s;
            s = temp;
        }
        getObjBounds().setRect(w, s, e - w, n - s);
        return true;
    }
    
    /** Creates new form MovePanel */
    public DeformPanel() {
        initComponents();
    }

    public Rectangle2D getObjBounds() {
        return objBounds;
    }

    public void setObjBounds(Rectangle2D objBounds) {
        this.objBounds = objBounds;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        wNumberField = new ika.gui.NumberField();
        eNumberField = new ika.gui.NumberField();
        jLabel2 = new javax.swing.JLabel();
        nNumberField = new ika.gui.NumberField();
        jLabel3 = new javax.swing.JLabel();
        sNumberField = new ika.gui.NumberField();
        s = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        setNextFocusableComponent(wNumberField);
        jLabel1.setText("W");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel1, gridBagConstraints);

        wNumberField.setMinimumSize(new java.awt.Dimension(50, 22));
        wNumberField.setNextFocusableComponent(eNumberField);
        wNumberField.setPattern("#,##0.######");
        wNumberField.setPreferredSize(new java.awt.Dimension(200, 22));
        wNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wNumberFieldActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 10);
        add(wNumberField, gridBagConstraints);

        eNumberField.setMinimumSize(new java.awt.Dimension(50, 22));
        eNumberField.setNextFocusableComponent(sNumberField);
        eNumberField.setPattern("#,##0.######");
        eNumberField.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        add(eNumberField, gridBagConstraints);

        jLabel2.setText("E");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jLabel2, gridBagConstraints);

        nNumberField.setMinimumSize(new java.awt.Dimension(50, 22));
        nNumberField.setNextFocusableComponent(wNumberField);
        nNumberField.setPattern("#,##0.######");
        nNumberField.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        add(nNumberField, gridBagConstraints);

        jLabel3.setText("N");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel3, gridBagConstraints);

        sNumberField.setMinimumSize(new java.awt.Dimension(50, 22));
        sNumberField.setNextFocusableComponent(nNumberField);
        sNumberField.setPattern("#,##0.######");
        sNumberField.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        add(sNumberField, gridBagConstraints);

        s.setText("S");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(s, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents

    private void wNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wNumberFieldActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_wNumberFieldActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private ika.gui.NumberField eNumberField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private ika.gui.NumberField nNumberField;
    private javax.swing.JLabel s;
    private ika.gui.NumberField sNumberField;
    private ika.gui.NumberField wNumberField;
    // End of variables declaration//GEN-END:variables
    
}
