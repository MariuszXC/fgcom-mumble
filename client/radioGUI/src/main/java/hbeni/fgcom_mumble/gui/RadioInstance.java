/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbeni.fgcom_mumble.gui;

import hbeni.fgcom_mumble.Radio;
import hbeni.fgcom_mumble.radioGUI;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author beni
 */
public class RadioInstance extends javax.swing.JInternalFrame {

    protected Radio radioBackend;
    
    /**
     * Creates new form RadioInstance
     */
    public RadioInstance(Radio r) {
        radioBackend = r;
        initComponents();
        jTextField_frqActive.setForeground(Color.black); // make the font black
        jTextField_frqActive.setText(r.getFrequency());
        if (r.getFrequency() == "") {
            jTextField_frqSpare.setText("<Enter Frequency>");
        } else {
            jTextField_frqSpare.setText(r.getFrequency());
        }
        jSlider_txPWR.setValue(Math.round(r.getPower()));
        jSlider_volume.setValue(Math.round(r.getVolume()*100));
        jSlider_squelch.setValue(Math.round(r.getSquelch()*100));
        jToggleButton_ONOFF.setSelected(r.getPwrBtn());
        updateLabels();
        updateONOFFTooltip();
        
        
        
        
        // Add a listener to detect closing
        addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent e) {
                radioGUI.deregisterRadio(r);
            }
        });
        
        this.setVisible(true);
    }
    
    /**
     * Update labels
     */
    public void updateLabels() {
        jLabel_squelch.setText(Float.toString(jSlider_squelch.getValue())+"%");
        jLabel_PWRVal.setText(Float.toString(jSlider_txPWR.getValue())+"W");
        jLabel_VolVal.setText(Float.toString(jSlider_volume.getValue())+"%");
    }
    
    public void updateONOFFTooltip() {
        String genericTooltipText = "Switch on (pressed) or off (depressed)."+System.lineSeparator();
        if (jToggleButton_ONOFF.isSelected()) {
            jToggleButton_ONOFF.setToolTipText(genericTooltipText+"(Radio is currently turned ON)");
        } else {
            jToggleButton_ONOFF.setToolTipText(genericTooltipText+"(Radio is currently turned OFF)");
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_frqActive = new javax.swing.JTextField();
        jTextField_frqSpare = new javax.swing.JTextField();
        jButton_swapFRQ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSlider_volume = new javax.swing.JSlider();
        jSlider_txPWR = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel_VolVal = new javax.swing.JLabel();
        jLabel_PWRVal = new javax.swing.JLabel();
        jButton_PTT = new javax.swing.JButton();
        jSlider_squelch = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel_squelch = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton_ONOFF = new javax.swing.JToggleButton();
        jComboBox_Templates = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(620, 200));
        setMinimumSize(new java.awt.Dimension(620, 200));
        setPreferredSize(new java.awt.Dimension(600, 200));

        jTextField_frqActive.setEditable(false);
        jTextField_frqActive.setBackground(new java.awt.Color(224, 224, 224));
        jTextField_frqActive.setText("FRQ_active");
        jTextField_frqActive.setToolTipText("The radio is currently tuned to this frequency");

        jTextField_frqSpare.setText("FRQ_spare");
        jTextField_frqSpare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_frqSpareActionPerformed(evt);
            }
        });

        jButton_swapFRQ.setText("<->");
        jButton_swapFRQ.setToolTipText("Swap Frequencies: Make the standby one active");
        jButton_swapFRQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_swapFRQActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setText("Volume");

        jSlider_volume.setMajorTickSpacing(25);
        jSlider_volume.setMinorTickSpacing(5);
        jSlider_volume.setPaintTicks(true);
        jSlider_volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_volumeStateChanged(evt);
            }
        });

        jSlider_txPWR.setMajorTickSpacing(25);
        jSlider_txPWR.setMaximum(500);
        jSlider_txPWR.setMinorTickSpacing(10);
        jSlider_txPWR.setPaintTicks(true);
        jSlider_txPWR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_txPWRStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setText("TX-PWR");

        jLabel_VolVal.setText("100");

        jLabel_PWRVal.setText("100");

        jButton_PTT.setText("PTT");
        jButton_PTT.setToolTipText("Press and hold to transmit");
        jButton_PTT.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton_PTTStateChanged(evt);
            }
        });

        jSlider_squelch.setMajorTickSpacing(10);
        jSlider_squelch.setMinorTickSpacing(5);
        jSlider_squelch.setPaintTicks(true);
        jSlider_squelch.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_squelchStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setText("Squelch");

        jLabel_squelch.setText("100");

        jLabel4.setText("FRQ active");

        jLabel5.setText("FRQ standby");

        jToggleButton_ONOFF.setText("ON/OFF");
        jToggleButton_ONOFF.setToolTipText("tooltip set in code");
        jToggleButton_ONOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_ONOFFActionPerformed(evt);
            }
        });

        jComboBox_Templates.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jComboBox_Templates.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FRQ-Templates", "RECORD_<tgt-frq-here>", "PHONE:<ICAO>:<POS>:<LINE>", "910.00 Echotest" }));
        jComboBox_Templates.setToolTipText("You can select frequency presets here");
        jComboBox_Templates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TemplatesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_squelch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_VolVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_PWRVal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider_txPWR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider_squelch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox_Templates, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton_ONOFF))
                            .addComponent(jButton_PTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_frqActive, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_swapFRQ))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_frqSpare))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_frqActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_frqSpare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_swapFRQ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel_VolVal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton_ONOFF)
                        .addComponent(jComboBox_Templates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel_PWRVal))
                            .addComponent(jSlider_txPWR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider_squelch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_squelch)
                                .addComponent(jLabel3))))
                    .addComponent(jButton_PTT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_frqSpareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_frqSpareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_frqSpareActionPerformed

    private void jButton_swapFRQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_swapFRQActionPerformed
        String swp = jTextField_frqSpare.getText();
        radioBackend.setFrequency(swp);
        
        jTextField_frqSpare.setText(jTextField_frqActive.getText());
        jTextField_frqActive.setText(swp);
        
    }//GEN-LAST:event_jButton_swapFRQActionPerformed

    private void jSlider_volumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_volumeStateChanged
        float v = (float)jSlider_volume.getValue();
        radioBackend.setVolume(v / 100);
        updateLabels();
    }//GEN-LAST:event_jSlider_volumeStateChanged

    private void jSlider_txPWRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_txPWRStateChanged
        float v = (float)jSlider_txPWR.getValue();
        radioBackend.setPower(v);
        updateLabels();
    }//GEN-LAST:event_jSlider_txPWRStateChanged

    private void jSlider_squelchStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_squelchStateChanged
        float v = (float)jSlider_squelch.getValue();
        radioBackend.setSquelch(v / 100);
        updateLabels();
    }//GEN-LAST:event_jSlider_squelchStateChanged

    
    private void jButton_PTTStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton_PTTStateChanged
        JButton src = (JButton) evt.getSource();
        radioBackend.setPTT(src.getModel().isPressed());
    }//GEN-LAST:event_jButton_PTTStateChanged

    private void jToggleButton_ONOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_ONOFFActionPerformed
        radioBackend.setPwrBtn(jToggleButton_ONOFF.isSelected());
        updateONOFFTooltip();
    }//GEN-LAST:event_jToggleButton_ONOFFActionPerformed

    private void jComboBox_TemplatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TemplatesActionPerformed
        String selection = (String) jComboBox_Templates.getSelectedItem();
        if (selection != "FRQ-Templates") {
            if (selection == "910.00 Echotest") selection = "910.00";
            jTextField_frqSpare.setText(selection);
        }
        jComboBox_Templates.setSelectedIndex(0);
    }//GEN-LAST:event_jComboBox_TemplatesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_PTT;
    private javax.swing.JButton jButton_swapFRQ;
    private javax.swing.JComboBox<String> jComboBox_Templates;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_PWRVal;
    private javax.swing.JLabel jLabel_VolVal;
    private javax.swing.JLabel jLabel_squelch;
    private javax.swing.JSlider jSlider_squelch;
    private javax.swing.JSlider jSlider_txPWR;
    private javax.swing.JSlider jSlider_volume;
    private javax.swing.JTextField jTextField_frqActive;
    private javax.swing.JTextField jTextField_frqSpare;
    private javax.swing.JToggleButton jToggleButton_ONOFF;
    // End of variables declaration//GEN-END:variables
}
