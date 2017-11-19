/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui;

import app.nodes.TreeNode;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gabri
 */
public class Tree extends javax.swing.JPanel {

    /**
     * Creates new form tree
     */
    public Tree() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workspace = new javax.swing.JDesktopPane();
        main_panel = new javax.swing.JPanel();
        add_button = new javax.swing.JButton();
        value_area = new javax.swing.JTextField();
        value_text = new javax.swing.JLabel();
        separator_1 = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();
        preorder = new javax.swing.JLabel();
        inorder_text = new javax.swing.JLabel();
        preorder_text = new javax.swing.JLabel();
        posorder_text = new javax.swing.JLabel();
        inorder = new javax.swing.JLabel();
        posorder = new javax.swing.JLabel();

        workspace.setPreferredSize(new java.awt.Dimension(898, 720));

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        add_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/add_icon.png"))); // NOI18N
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        value_area.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        value_area.setForeground(new java.awt.Color(163, 73, 164));

        value_text.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        value_text.setForeground(new java.awt.Color(163, 73, 164));
        value_text.setText("Valor:");

        separator_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/vertical_bar.png"))); // NOI18N

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/bar.png"))); // NOI18N

        preorder.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        preorder.setForeground(new java.awt.Color(163, 73, 164));
        preorder.setText("N");

        inorder_text.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        inorder_text.setForeground(new java.awt.Color(163, 73, 164));
        inorder_text.setText("In-Ordem:");

        preorder_text.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        preorder_text.setForeground(new java.awt.Color(163, 73, 164));
        preorder_text.setText("Pré_Ordem:");

        posorder_text.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        posorder_text.setForeground(new java.awt.Color(163, 73, 164));
        posorder_text.setText("Pós_Ordem:");

        inorder.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        inorder.setForeground(new java.awt.Color(163, 73, 164));
        inorder.setText("N");

        posorder.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        posorder.setForeground(new java.awt.Color(163, 73, 164));
        posorder.setText("N");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 807, Short.MAX_VALUE)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(value_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(value_area, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(separator_1)
                        .addGap(18, 18, 18)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(preorder_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preorder))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(inorder_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inorder))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(posorder_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posorder)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(value_text)
                            .addComponent(value_area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(separator_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(preorder_text)
                                    .addComponent(preorder))
                                .addGap(11, 11, 11)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inorder_text)
                                    .addComponent(inorder))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(posorder_text)
                                    .addComponent(posorder))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
        );

        workspace.setLayer(main_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout workspaceLayout = new javax.swing.GroupLayout(workspace);
        workspace.setLayout(workspaceLayout);
        workspaceLayout.setHorizontalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        workspaceLayout.setVerticalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        if (value_area.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Valor em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        insert(value_area.getText());
        update_orders();
    }//GEN-LAST:event_add_buttonActionPerformed

    public void update_orders() {
        String s = "";
        preorder.setText(preorder(s, root));
        inorder.setText(inorder(s, root));
        posorder.setText(posorder(s, root));
    }

    public String preorder(String string, TreeNode node) {
        if (node == null) {
            return "";
        }
        return preorder(string, node.getLeft()) + " " + preorder(string, node.getRight()) + " " + node.getValue();
    }
    
    public String inorder(String string, TreeNode node) {
        if (node == null) {
            return "";
        }
        return inorder(string, node.getLeft()) + " " + node.getValue() + " " + inorder(string, node.getRight());
    }
    
    public String posorder(String string, TreeNode node) {
        if (node == null) {
            return "";
        }
        return node.getValue() + " " + posorder(string, node.getLeft()) + " " + posorder(string, node.getRight());
    }

    public void restore() {
        X = 435;
        Y = 170;
        scale = 1.0;
        deep = 0;
    }

    public boolean verify_limits() {
        return (X > 850 || X < 10 || Y > 700);
    }

    public void link_nodes() {
        JPanel arrow_panel = new JPanel();
        JLabel arrow = new JLabel();

        switch (deep) {
            case 1:
                arrow.setSize(150, 50);
                arrow.setLocation(0, 0);
                arrow_panel.setSize(150, 60);
                arrow_panel.setBackground(Color.white);
                if (side) {
                    arrow.setIcon(new ImageIcon(getClass().getResource(ARROW_1)));
                    arrow_panel.setLocation(X + 50, Y - 50);
                } else {
                    arrow.setIcon(new ImageIcon(getClass().getResource(ARROW_1_BACK)));
                    arrow_panel.setLocation(X - 150, Y - 50);
                }
                arrow_panel.add(arrow);
                workspace.add(arrow_panel);
                arrow_panel.setVisible(true);
                break;
            case 2:
                arrow.setSize(50, 105);
                arrow.setLocation(0, 0);
                arrow_panel.setSize(50, 110);
                arrow_panel.setBackground(Color.white);
                if (side) {
                    arrow.setIcon(new ImageIcon(getClass().getResource(ARROW_2)));
                    arrow_panel.setLocation(X + 50, Y - 105);
                } else {
                    arrow.setIcon(new ImageIcon(getClass().getResource(ARROW_2_BACK)));
                    arrow_panel.setLocation(X - 50, Y - 105);
                }
                arrow_panel.add(arrow);
                workspace.add(arrow_panel);
                arrow_panel.setVisible(true);
                break;
            case 3:
                arrow.setSize(25, 160);
                arrow.setLocation(0, 0);
                arrow_panel.setSize(25, 165);
                arrow_panel.setBackground(Color.white);
                if (side) {
                    arrow.setIcon(new ImageIcon(getClass().getResource(ARROW_3)));
                    arrow_panel.setLocation(X + 45, Y - 165);
                } else {
                    arrow.setIcon(new ImageIcon(getClass().getResource(ARROW_3_BACK)));
                    arrow_panel.setLocation(X - 20, Y - 165);
                }
                arrow_panel.add(arrow);
                workspace.add(arrow_panel);
                arrow_panel.setVisible(true);
                break;
        }

    }

    public void insert(String value) {
        if (root == null) {
            if (!verify_limits()) {
                root = new TreeNode(value);
                root.setSize(50, 40);
                root.setLocation(X, Y);
                root.setVisible(true);
                workspace.add(root);
                restore();
            } else {
                JOptionPane.showMessageDialog(null, "Limite da tela atingido!", "Erro", JOptionPane.ERROR_MESSAGE);
                restore();
            }
        } else {
            if (Integer.parseInt(value) < Integer.parseInt(root.getValue())) {
                X -= 200 / scale;
                Y += 80;
                scale += 0.75;
                side = true;
                deep++;
                root.setLeft(insert_recursive(root.getLeft(), value));
            } else if (Integer.parseInt(value) > Integer.parseInt(root.getValue())) {
                X += 200 / scale;
                Y += 80;
                scale += 0.75;
                side = false;
                deep++;
                root.setRight(insert_recursive(root.getRight(), value));
            } else if (Integer.parseInt(value) == Integer.parseInt(root.getValue())) {
                JOptionPane.showMessageDialog(null, "Valor já adicionado!", "Erro", JOptionPane.ERROR_MESSAGE);
                restore();
            }
        }
    }

    public TreeNode insert_recursive(TreeNode node, String value) {
        if (node == null) {
            if (!verify_limits()) {
                node = new TreeNode(value);
                node.setSize(50, 40);
                node.setLocation(X, Y);
                node.setVisible(true);
                workspace.add(node);
                link_nodes();
                restore();
                return node;
            } else {
                JOptionPane.showMessageDialog(null, "Limite da tela atingido!", "Erro", JOptionPane.ERROR_MESSAGE);
                restore();
            }
        } else {
            if (Integer.parseInt(value) < Integer.parseInt(node.getValue())) {
                X -= 175 / scale;
                Y += 80 * scale;
                scale += 0.75;
                deep++;
                side = true;
                node.setLeft(insert_recursive(node.getLeft(), value));
            } else if (Integer.parseInt(value) > Integer.parseInt(node.getValue())) {
                X += 175 / scale;
                Y += 80 * scale;
                scale += 0.75;
                deep++;
                side = false;
                node.setRight(insert_recursive(node.getRight(), value));
            } else if (Integer.parseInt(value) == Integer.parseInt(node.getValue())) {
                JOptionPane.showMessageDialog(null, "Valor já adicionado!", "Erro", JOptionPane.ERROR_MESSAGE);
                restore();
            }
        }
        return node;
    }

    private double scale = 1.0;
    private int X = 435;
    private int Y = 170;
    private int deep = 0;
    private boolean side;
    private TreeNode root;

    private static final String ARROW_1 = "/app/images/tree_arrow_1.png";
    private static final String ARROW_1_BACK = "/app/images/tree_arrow_1_back.png";
    private static final String ARROW_2 = "/app/images/tree_arrow_2.png";
    private static final String ARROW_2_BACK = "/app/images/tree_arrow_2_back.png";
    private static final String ARROW_3 = "/app/images/tree_arrow_3.png";
    private static final String ARROW_3_BACK = "/app/images/tree_arrow_3_back.png";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JLabel bar;
    private javax.swing.JLabel inorder;
    private javax.swing.JLabel inorder_text;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel posorder;
    private javax.swing.JLabel posorder_text;
    private javax.swing.JLabel preorder;
    private javax.swing.JLabel preorder_text;
    private javax.swing.JLabel separator_1;
    private javax.swing.JTextField value_area;
    private javax.swing.JLabel value_text;
    private javax.swing.JDesktopPane workspace;
    // End of variables declaration//GEN-END:variables
}
