/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewComponent;

import chart.ModelChart_1;
import java.awt.Color;

/**
 *
 * @author Lenovo
 */
public class Report extends javax.swing.JPanel {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        chart.addLegend("Income", new Color(245, 189, 135));
        chart.addLegend("Expense", new Color(135, 189, 245));
        chart.addLegend("Profit", new Color(189, 135, 245));
        chart.addLegend("Cost", new Color(139, 229, 222));
        chart.addData(new ModelChart_1("January", new double[]{500, 200, 80,89}));
        chart.addData(new ModelChart_1("February", new double[]{600, 750, 90,150}));
        chart.addData(new ModelChart_1("March", new double[]{200, 350, 460,900}));
        chart.addData(new ModelChart_1("April", new double[]{480, 150, 750,700}));
        chart.addData(new ModelChart_1("May", new double[]{350, 540, 300,150}));
        chart.addData(new ModelChart_1("June", new double[]{190, 280, 81,200}));
        start();
    }
    private void start(){
         chart.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart = new chart.Chart();

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chart.Chart chart;
    // End of variables declaration//GEN-END:variables
}
