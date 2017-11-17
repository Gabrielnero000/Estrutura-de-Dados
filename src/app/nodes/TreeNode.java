/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.nodes;

import javax.swing.JLabel;

/**
 *
 * @author gabri
 */
public class TreeNode extends javax.swing.JPanel {

    public TreeNode(String value) {
        initComponents();
        content.setText(value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public JLabel getContent() {
        return content;
    }

    public void setContent(JLabel content) {
        this.content = content;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JLabel();

        setBackground(new java.awt.Color(163, 73, 164));
        setPreferredSize(new java.awt.Dimension(50, 40));

        content.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        content.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private String value;
    private TreeNode right;
    private TreeNode left;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel content;
    // End of variables declaration//GEN-END:variables
}
