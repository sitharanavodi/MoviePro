/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmbooking;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import javafx.scene.layout.Background;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;


/**
 *
 * @author Acer
 */
public class NowShowing extends javax.swing.JFrame {
Statement statement;
TheModel model;
 //DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form NowShowing
     */
    public NowShowing() {
        initComponents();
         populateJTable();
    }
    ViewSelectedMovie viewSelectedRow = new ViewSelectedMovie();
    //Show_Jtable_row_data jtRowData = new Show_Jtable_row_data();
    //DefaultTableModel model;
    
    public void populateJTable(){
        MyQuery mq = new MyQuery();
        ArrayList<Product2> list = mq.BindTable();
        String[] columnName = {"MovieId","Title","Language","MoviePrice","HallNumber","Description","Image"};
        Object[][] rows = new Object[list.size()][7];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).getMovieID();
            rows[i][1] = list.get(i).getTitle();
            rows[i][2] = list.get(i).getLanguage();
            rows[i][3] = list.get(i).getMoviePrice();
            rows[i][4] = list.get(i).getHallNumber();
            rows[i][5] = list.get(i).getDescription();
            
            
            if(list.get(i).getMyImage() != null){
                
           ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH) );   
           rows[i][6] = image;
           }
          else{
              rows[i][6] = null;
          }
           //rows[i][5] = list.get(i).getCatID();
           
                    
        }
        
        TheModel Model = new TheModel(rows, columnName);
        jTable1.setModel( Model);
        jTable1.setRowHeight(250);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
        jTable1.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,22));
       // jTable1.getTableHeader().setBackground(new Background("red"));
               // setFont(new Font("Times New Roman",Font.BOLD,22));
         
    }      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOW SHOWING");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(740, 40, 520, 100);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(2000, 1000));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MovieID", "Title", "Language", "MoviePrice", "HallNumber", "Description", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 130, 1750, 790);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Movie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1190, 50, 210, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2000, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int selectedRowForNewJframe = jTable1.getSelectedRow();
         

        if (selectedRowForNewJframe == -1) {
           
            viewSelectedRow.jLabel8.setText("No Row Selected !!..");
        } 
        else {
            viewSelectedRow.jLabel8.setText(null);
            System.out.println("selected row value  " + selectedRowForNewJframe);
             
            
             int index = jTable1.getSelectedRow();
        
        TableModel model = jTable1.getModel();
        
        String newMovieID = model.getValueAt(index, 0).toString();
        String newTitle = model.getValueAt(index, 1).toString();
        String newLanguage = model.getValueAt(index, 2).toString();
        String newMoviePrice = model.getValueAt(index, 3).toString();
        String newHallNumber = model.getValueAt(index, 4).toString();
        String newDescription = model.getValueAt(index, 5).toString();
        ImageIcon image1=(ImageIcon) jTable1.getValueAt(index,6);
        Image image2 = image1.getImage().getScaledInstance(1500, 1000
                 , Image.SCALE_SMOOTH);
        ImageIcon image3 = new ImageIcon(image2);
        
       
        
        viewSelectedRow.setVisible(true);
        viewSelectedRow.pack();
        viewSelectedRow.setLocationRelativeTo(null);
        viewSelectedRow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        viewSelectedRow.jLabel13.setText(newMovieID);
        viewSelectedRow.jLabel2.setText(newTitle);
        viewSelectedRow.jLabel10.setText(newLanguage);
        viewSelectedRow.jLabel12.setText(newMoviePrice);
        viewSelectedRow.jLabel11.setText(newHallNumber);
        viewSelectedRow.jLabel9.setText(newDescription);
        viewSelectedRow.jLabel8ImageNewJframe.setIcon(image3);
        
 


        
             
        }  
        
   
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NowShowing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NowShowing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NowShowing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NowShowing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NowShowing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
