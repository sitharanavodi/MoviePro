/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmbooking;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Acer
 */
public class AddMovie extends javax.swing.JFrame {

    String s;
    /**
     * Creates new form AddMovie
     */
    public AddMovie() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Insert Movie Details");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 40, 540, 100);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Language");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 340, 150, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Movie price");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 420, 150, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Description");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 600, 150, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Movie ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 200, 150, 40);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(520, 420, 570, 40);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(520, 500, 570, 40);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(520, 200, 570, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hall Number");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 510, 150, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(520, 590, 570, 150);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1170, 300, 200, 230);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 570, 120, 40);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Cancel");
        jPanel1.add(jButton2);
        jButton2.setBounds(880, 820, 120, 40);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1210, 570, 120, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Movie Title");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 270, 150, 40);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(520, 270, 570, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Childrens Movie", "Marvel Movie", "Sinhala Movie", "Tamil Movie", "English Movie" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(520, 340, 570, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pexels-romka-21.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 2000, 1000);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2000, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
         
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            //JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
//            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
             
            jLabel9.setIcon(new ImageIcon(image));
            s=selectedImagePath;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                String MovieID = jTextField5.getText();
                String Title = jTextField7.getText();
                String Language =jComboBox1.getSelectedItem().toString();
                //String TimeofShow = time1.getSelectedTime();
                String MoviePrice = jTextField3.getText();
                String HallNumber = jTextField4.getText();
                String Description = jTextArea1.getText();
                //String Image = jLabel9.getText();
                
                if(MovieID.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter the MovieID","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(Title.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter Movie Title","Error",JOptionPane.ERROR_MESSAGE);
                }
//                else if(DateofShow.equals(""))
//                {
//                    JOptionPane.showMessageDialog(null,"Please enter date of movie","Error",JOptionPane.ERROR_MESSAGE);
//                }
//                else if(TimeofShow.equals(""))
//                {
//                    JOptionPane.showMessageDialog(null,"Please enter date of time","Error",JOptionPane.ERROR_MESSAGE);
//                }
                
                else if(MoviePrice.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter the Price","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(HallNumber.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter the Hall number","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(Description.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter the Descrption","Error",JOptionPane.ERROR_MESSAGE);
                }
                
               else
                {
                    String selectedValue=jComboBox1.getSelectedItem().toString();
                    
                    try
                    {
                    String user="root";
                    String password="";
                    String url="jdbc:mysql://localhost:3306/movie";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=(Connection) DriverManager.getConnection(url,user,password);
                    PreparedStatement ps = con.prepareStatement("insert into sinhalamovie(MovieID,Title,Language,MoviePrice,HallNumber,Description,Image) values(?,?,?,?,?,?,?)");
                    InputStream is=new FileInputStream(new File(s));
                    ps.setString(1, MovieID);
                    ps.setString(2,  Title);
                    ps.setString(3, Language);
                    ps.setString(4, MoviePrice );
                    ps.setString(5, HallNumber  );
                    ps.setString(6, Description );
                    ps.setBlob(7,is);
//                    String query="INSERT INTO moviedetails (MovieID,Title,Language,MoviePrice,HallNumber,Description,Image) values('" + MovieID + "','" + Title + "','" + Language + "','" + MoviePrice + "','"
//                         +HallNumber + "','" + Description + "','" + Image + "')";
                    
                    
                    //Statement sta = con.createStatement();

                    ps.executeUpdate();
            
            
                        if(con!=null)
                          {
                          JOptionPane.showMessageDialog(null,"Insert Succesfully!");
                          this.setVisible(false);
                          new Login().setVisible(true);
                          }
                         else
                          {
                    
                          JOptionPane.showMessageDialog(null,"Registration Failed!!!","Error",JOptionPane.ERROR_MESSAGE);
                          this.setVisible(false);
                          new AccCreation().setVisible(true);
                          }
                    }
                    catch(Exception e)
                    {
                           System.out.println("failed" +e);
                         // JOptionPane.showMessageDialog(null,"Registration Failed!" +e,"Error",JOptionPane.ERROR_MESSAGE);
                          this.setVisible(false);
                          new AccCreation().setVisible(true);
                       
                    }
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
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
