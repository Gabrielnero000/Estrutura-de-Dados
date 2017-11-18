/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui;

import app.nodes.SimpleNode;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javafx.scene.shape.Line;

/**
 *
 * @author gabri
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        main_menu = new javax.swing.JPanel();
        main_icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        separator_2 = new javax.swing.JLabel();
        linked_list_icon = new javax.swing.JButton();
        linked_list_title = new javax.swing.JButton();
        stack_title = new javax.swing.JButton();
        stack_icon = new javax.swing.JButton();
        queue_title = new javax.swing.JButton();
        separator_1 = new javax.swing.JLabel();
        exit_title = new javax.swing.JButton();
        exit_icon = new javax.swing.JButton();
        queue_icon = new javax.swing.JButton();
        sequential_list_icon = new javax.swing.JButton();
        sequential_list_title = new javax.swing.JButton();
        twice_linked_list_icon = new javax.swing.JButton();
        twice_linked_list = new javax.swing.JButton();
        tree_title = new javax.swing.JButton();
        tree_icon = new javax.swing.JButton();
        workspace = new javax.swing.JDesktopPane();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estruturas de Dados");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        main_menu.setBackground(new java.awt.Color(163, 73, 164));
        main_menu.setAlignmentX(0.0F);
        main_menu.setAlignmentY(0.0F);
        main_menu.setMinimumSize(new java.awt.Dimension(325, 720));

        main_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/main_icon.png"))); // NOI18N

        title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/title.png"))); // NOI18N
        title.setToolTipText("");
        title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        separator_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/separator.png"))); // NOI18N

        linked_list_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/list_icon.png"))); // NOI18N
        linked_list_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linked_list_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linked_list_iconActionPerformed(evt);
            }
        });

        linked_list_title.setBackground(new java.awt.Color(163, 73, 164));
        linked_list_title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        linked_list_title.setForeground(new java.awt.Color(255, 255, 255));
        linked_list_title.setText("Lista Encadeada");
        linked_list_title.setContentAreaFilled(false);
        linked_list_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linked_list_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linked_list_titleActionPerformed(evt);
            }
        });

        stack_title.setBackground(new java.awt.Color(163, 73, 164));
        stack_title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        stack_title.setForeground(new java.awt.Color(255, 255, 255));
        stack_title.setText("Pilha");
        stack_title.setContentAreaFilled(false);
        stack_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stack_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stack_titleActionPerformed(evt);
            }
        });

        stack_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/stack_icon.png"))); // NOI18N
        stack_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stack_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stack_iconActionPerformed(evt);
            }
        });

        queue_title.setBackground(new java.awt.Color(163, 73, 164));
        queue_title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        queue_title.setForeground(new java.awt.Color(255, 255, 255));
        queue_title.setText("Fila");
        queue_title.setContentAreaFilled(false);
        queue_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queue_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        queue_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queue_titleActionPerformed(evt);
            }
        });

        separator_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/separator.png"))); // NOI18N

        exit_title.setBackground(new java.awt.Color(163, 73, 164));
        exit_title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        exit_title.setForeground(new java.awt.Color(255, 255, 255));
        exit_title.setText("- Sair");
        exit_title.setContentAreaFilled(false);
        exit_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_titleActionPerformed(evt);
            }
        });

        exit_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/exit_icon.png"))); // NOI18N
        exit_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_iconActionPerformed(evt);
            }
        });

        queue_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/queue_icon.png"))); // NOI18N
        queue_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queue_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queue_iconActionPerformed(evt);
            }
        });

        sequential_list_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/list_icon.png"))); // NOI18N
        sequential_list_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sequential_list_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sequential_list_iconActionPerformed(evt);
            }
        });

        sequential_list_title.setBackground(new java.awt.Color(163, 73, 164));
        sequential_list_title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        sequential_list_title.setForeground(new java.awt.Color(255, 255, 255));
        sequential_list_title.setText("Lista Sequencial");
        sequential_list_title.setContentAreaFilled(false);
        sequential_list_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sequential_list_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sequential_list_titleActionPerformed(evt);
            }
        });

        twice_linked_list_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/list_icon.png"))); // NOI18N
        twice_linked_list_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twice_linked_list_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twice_linked_list_iconActionPerformed(evt);
            }
        });

        twice_linked_list.setBackground(new java.awt.Color(163, 73, 164));
        twice_linked_list.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        twice_linked_list.setForeground(new java.awt.Color(255, 255, 255));
        twice_linked_list.setText("List. Dup. Enc.");
        twice_linked_list.setContentAreaFilled(false);
        twice_linked_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twice_linked_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twice_linked_listActionPerformed(evt);
            }
        });

        tree_title.setBackground(new java.awt.Color(163, 73, 164));
        tree_title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        tree_title.setForeground(new java.awt.Color(255, 255, 255));
        tree_title.setText("Árvore");
        tree_title.setContentAreaFilled(false);
        tree_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tree_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tree_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tree_titleActionPerformed(evt);
            }
        });

        tree_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/tree_icon.png"))); // NOI18N
        tree_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tree_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tree_iconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_menuLayout = new javax.swing.GroupLayout(main_menu);
        main_menu.setLayout(main_menuLayout);
        main_menuLayout.setHorizontalGroup(
            main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_menuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_menuLayout.createSequentialGroup()
                        .addComponent(main_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_menuLayout.createSequentialGroup()
                        .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addComponent(tree_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tree_title))
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addComponent(exit_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exit_title))
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addComponent(twice_linked_list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twice_linked_list))
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addComponent(queue_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queue_title))
                            .addComponent(separator_2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addComponent(stack_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stack_title))
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addComponent(sequential_list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sequential_list_title))
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(separator_1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(main_menuLayout.createSequentialGroup()
                                .addComponent(linked_list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linked_list_title)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        main_menuLayout.setVerticalGroup(
            main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_menuLayout.createSequentialGroup()
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_menuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(main_icon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(separator_1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linked_list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(main_menuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(linked_list_title, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sequential_list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_menuLayout.createSequentialGroup()
                        .addComponent(sequential_list_title, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twice_linked_list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(main_menuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(twice_linked_list, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stack_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_menuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(stack_title, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(queue_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queue_title))
                .addGap(18, 18, 18)
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tree_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tree_title))
                .addGap(18, 18, 18)
                .addComponent(separator_2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_icon)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_menuLayout.createSequentialGroup()
                        .addComponent(exit_title)
                        .addGap(10, 10, 10)))
                .addGap(35, 35, 35))
        );

        workspace.setBackground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        workspace.setLayer(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout workspaceLayout = new javax.swing.GroupLayout(workspace);
        workspace.setLayout(workspaceLayout);
        workspaceLayout.setHorizontalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        workspaceLayout.setVerticalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workspace))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(workspace)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void open_linked_list() {
        Linked_list list = new Linked_list();
        list.setSize(898, 720);
        workspace.removeAll();
        workspace.revalidate();
        workspace.repaint();
        workspace.add(list);
        list.setVisible(true);
    }

    public void open_twice_linked_list() {
        Twice_linked_list list = new Twice_linked_list();
        list.setSize(898, 720);
        workspace.removeAll();
        workspace.revalidate();
        workspace.repaint();
        workspace.add(list);
        list.setVisible(true);
    }

    public void open_sequential_list() {
        Sequential_list list = new Sequential_list();
        list.setSize(898, 720);
        workspace.removeAll();
        workspace.revalidate();
        workspace.repaint();
        workspace.add(list);
        list.setVisible(true);
    }

    public void open_stack() {
        Stack list = new Stack();
        list.setSize(898, 720);
        workspace.removeAll();
        workspace.revalidate();
        workspace.repaint();
        workspace.add(list);
        list.setVisible(true);
    }

    public void open_queue() {
        Queue list = new Queue();
        list.setSize(898, 720);
        workspace.removeAll();
        workspace.revalidate();
        workspace.repaint();
        workspace.add(list);
        list.setVisible(true);
    }
    
    public void open_tree(){
        Tree list = new Tree();
        list.setSize(898, 720);
        workspace.removeAll();
        workspace.revalidate();
        workspace.repaint();
        workspace.add(list);
        list.setVisible(true);
    }

    private void linked_list_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linked_list_iconActionPerformed
        open_linked_list();
    }//GEN-LAST:event_linked_list_iconActionPerformed

    private void linked_list_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linked_list_titleActionPerformed
        open_linked_list();
    }//GEN-LAST:event_linked_list_titleActionPerformed

    private void stack_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stack_titleActionPerformed
        open_stack();
    }//GEN-LAST:event_stack_titleActionPerformed

    private void stack_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stack_iconActionPerformed
        open_stack();
    }//GEN-LAST:event_stack_iconActionPerformed

    private void queue_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queue_titleActionPerformed
        open_queue();
    }//GEN-LAST:event_queue_titleActionPerformed

    private void exit_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_titleActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_titleActionPerformed

    private void exit_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_iconActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_iconActionPerformed

    private void queue_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queue_iconActionPerformed
        open_queue();
    }//GEN-LAST:event_queue_iconActionPerformed

    private void sequential_list_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequential_list_iconActionPerformed
        open_sequential_list();
    }//GEN-LAST:event_sequential_list_iconActionPerformed

    private void sequential_list_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequential_list_titleActionPerformed
        open_sequential_list();
    }//GEN-LAST:event_sequential_list_titleActionPerformed

    private void twice_linked_list_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twice_linked_list_iconActionPerformed
        open_twice_linked_list();
    }//GEN-LAST:event_twice_linked_list_iconActionPerformed

    private void twice_linked_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twice_linked_listActionPerformed
        open_twice_linked_list();
    }//GEN-LAST:event_twice_linked_listActionPerformed

    private void tree_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tree_titleActionPerformed
        open_tree();
    }//GEN-LAST:event_tree_titleActionPerformed

    private void tree_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tree_iconActionPerformed
        open_tree();
    }//GEN-LAST:event_tree_iconActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_icon;
    private javax.swing.JButton exit_title;
    private javax.swing.JButton linked_list_icon;
    private javax.swing.JButton linked_list_title;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel main_menu;
    private javax.swing.JPanel panel;
    private javax.swing.JButton queue_icon;
    private javax.swing.JButton queue_title;
    private javax.swing.JLabel separator_1;
    private javax.swing.JLabel separator_2;
    private javax.swing.JButton sequential_list_icon;
    private javax.swing.JButton sequential_list_title;
    private javax.swing.JButton stack_icon;
    private javax.swing.JButton stack_title;
    private javax.swing.JLabel title;
    private javax.swing.JButton tree_icon;
    private javax.swing.JButton tree_title;
    private javax.swing.JButton twice_linked_list;
    private javax.swing.JButton twice_linked_list_icon;
    protected static javax.swing.JDesktopPane workspace;
    // End of variables declaration//GEN-END:variables
}
