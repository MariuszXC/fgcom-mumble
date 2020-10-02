/* 
 * This file is part of the FGCom-mumble distribution (https://github.com/hbeni/fgcom-mumble).
 * Copyright (c) 2020 Benedikt Hallinger
 * 
 * This program is free software: you can redistribute it and/or modify  
 * it under the terms of the GNU General Public License as published by  
 * the Free Software Foundation, version 3.
 *
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License 
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package hbeni.fgcom_mumble.gui;

/**
 *
 * @author beni
 */
public class LicenseWindow extends javax.swing.JFrame {

    /**
     * Creates new form LicenseWindow
     */
    public LicenseWindow() {
        initComponents();
        final String nl = System.lineSeparator();
        this.jTextArea1.setText(
            "This program is free software: you can redistribute it and/or modify "
           +"it under the terms of the GNU General Public License as published by "
           +"the Free Software Foundation, version 3."+nl+nl
           +"This program is distributed in the hope that it will be useful, but "
           +"WITHOUT ANY WARRANTY; without even the implied warranty of "
           +"MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU "
           +"General Public License for more details."+nl+nl
           +"You should have received a copy of the GNU General Public License "
           +"along with this program. If not, see <http://www.gnu.org/licenses>."+nl+nl
           +"This project uses the FlatLaf Look&Feel, which is distributed "
           +"under the Apache License 2.0. (<https://github.com/JFormDesigner/FlatLaf>)."+nl+nl
           +"The location picker uses JMapViewer from the OpenStreetMap project (GPLv2)."
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setTitle("License");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
