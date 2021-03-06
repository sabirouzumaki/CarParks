package addmembers;

import adminSystemView.AdminView;
import database.DatabaseManagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddMemberView extends javax.swing.JFrame{
    
    public AddMemberView() {
        initComponents();
    }
    
    DatabaseManagement database = new DatabaseManagement();

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewMember = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        CarNameLabel = new javax.swing.JLabel();
        CarModelLabel = new javax.swing.JLabel();
        CarIDLabel = new javax.swing.JLabel();
        CarColourLabel = new javax.swing.JLabel();
        MemberName = new javax.swing.JTextField();
        MemberID = new javax.swing.JTextField();
        MemberCarName = new javax.swing.JTextField();
        MemberCarModel = new javax.swing.JTextField();
        MemberCarID = new javax.swing.JTextField();
        MemberCarColour = new javax.swing.JTextField();
        AddMemberLabel = new javax.swing.JLabel();
        SaveMember = new javax.swing.JButton();
        EmailAdressLabel = new javax.swing.JLabel();
        MemberEmailAddress = new javax.swing.JTextField();
        ResetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Member");
        setResizable(false);

        NewMember.setBackground(new java.awt.Color(86, 101, 115));

        IDLabel.setBackground(new java.awt.Color(255, 255, 255));
        IDLabel.setForeground(new java.awt.Color(255, 255, 255));
        IDLabel.setText("ID:");

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name:");

        CarNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        CarNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        CarNameLabel.setText("Vehicle Name:");

        CarModelLabel.setBackground(new java.awt.Color(255, 255, 255));
        CarModelLabel.setForeground(new java.awt.Color(255, 255, 255));
        CarModelLabel.setText("Vehicle Model:");

        CarIDLabel.setBackground(new java.awt.Color(255, 255, 255));
        CarIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        CarIDLabel.setText("Vehicle ID:");

        CarColourLabel.setBackground(new java.awt.Color(255, 255, 255));
        CarColourLabel.setForeground(new java.awt.Color(255, 255, 255));
        CarColourLabel.setText("Vehicle Colour:");

        MemberName.setBackground(new java.awt.Color(128, 139, 150));
        MemberName.setForeground(new java.awt.Color(255, 255, 255));
        MemberName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        MemberID.setBackground(new java.awt.Color(128, 139, 150));
        MemberID.setForeground(new java.awt.Color(255, 255, 255));
        MemberID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        MemberCarName.setBackground(new java.awt.Color(128, 139, 150));
        MemberCarName.setForeground(new java.awt.Color(255, 255, 255));
        MemberCarName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        MemberCarModel.setBackground(new java.awt.Color(128, 139, 150));
        MemberCarModel.setForeground(new java.awt.Color(255, 255, 255));
        MemberCarModel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        MemberCarID.setBackground(new java.awt.Color(128, 139, 150));
        MemberCarID.setForeground(new java.awt.Color(255, 255, 255));
        MemberCarID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        MemberCarColour.setBackground(new java.awt.Color(128, 139, 150));
        MemberCarColour.setForeground(new java.awt.Color(255, 255, 255));
        MemberCarColour.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        AddMemberLabel.setBackground(new java.awt.Color(255, 255, 255));
        AddMemberLabel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        AddMemberLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddMemberLabel.setText("New Member");

        SaveMember.setBackground(new java.awt.Color(204, 255, 204));
        SaveMember.setForeground(new java.awt.Color(255, 255, 255));
        SaveMember.setText("Save");
        SaveMember.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SaveMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMemberActionPerformed(evt);
            }
        });

        EmailAdressLabel.setBackground(new java.awt.Color(255, 255, 255));
        EmailAdressLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailAdressLabel.setText("Email Adress:");

        MemberEmailAddress.setBackground(new java.awt.Color(128, 139, 150));
        MemberEmailAddress.setForeground(new java.awt.Color(255, 255, 255));
        MemberEmailAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        ResetButton.setBackground(new java.awt.Color(86, 101, 115));
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restart-icon-18-16.png"))); // NOI18N
        ResetButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewMemberLayout = new javax.swing.GroupLayout(NewMember);
        NewMember.setLayout(NewMemberLayout);
        NewMemberLayout.setHorizontalGroup(
            NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewMemberLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewMemberLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(AddMemberLabel))
                    .addGroup(NewMemberLayout.createSequentialGroup()
                        .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(NewMemberLayout.createSequentialGroup()
                                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EmailAdressLabel)
                                    .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewMemberLayout.createSequentialGroup()
                                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CarIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CarNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CarModelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CarColourLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewMemberLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SaveMember, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberCarID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberCarName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberCarColour, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        NewMemberLayout.setVerticalGroup(
            NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewMemberLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AddMemberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(MemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel))
                .addGap(18, 18, 18)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailAdressLabel)
                    .addComponent(MemberEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarIDLabel)
                    .addComponent(MemberCarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarNameLabel))
                .addGap(18, 18, 18)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarModelLabel))
                .addGap(18, 18, 18)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberCarColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarColourLabel))
                .addGap(22, 22, 22)
                .addGroup(NewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaveMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(331, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMemberActionPerformed
        String Membername = this.MemberName.getText();
    	String MemberiD = this.MemberID.getText();
        String MemberemailAddress = this.MemberEmailAddress.getText();
    	String MembercarID = this.MemberCarID.getText();
    	String MembercarName = this.MemberCarName.getText();
        String MembercarModel = this.MemberCarModel.getText();
        String MembercarColour = this.MemberCarColour.getText();
        
        Boolean flag = false;
        Boolean flag1 = false;        
        ArrayList member = new ArrayList();

    	Boolean empty =  Membername.isEmpty() || MemberiD.isEmpty() || MembercarID.isEmpty() || MembercarName.isEmpty()|| MembercarModel.isEmpty()|| MembercarColour.isEmpty();
        String query = "select ID from member where ID = '" + MemberiD + "';";
        ResultSet result = database.execQuery(query);
        
        String query1 = "select ID from unmember where ID = '" + MemberiD + "';";
        ResultSet result1 = database.execQuery(query1);
        
        try{
            while(result.next()){
                String id = result.getString("ID");
                flag = true;

            }
        }catch(SQLException e){
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
        
        try{
            while(result1.next()){
                String id = result1.getString("ID");
                flag1 = true;

            }
        }catch(SQLException e){
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
        
        if(empty){ 
                JOptionPane.showMessageDialog(rootPane,"Plase fill all the feilds"," Error !",JOptionPane . ERROR_MESSAGE);
    		}
        else if(flag){  
                JOptionPane.showMessageDialog(rootPane,"ID not  available"," Error !",JOptionPane . ERROR_MESSAGE);  
        }else if(flag1){  
                JOptionPane.showMessageDialog(rootPane,"ID not  available"," Error !",JOptionPane . ERROR_MESSAGE);  
        }else{
                    member.add(Membername);
                    member.add(MemberiD);
                    member.add(MemberemailAddress);
                    member.add(MembercarID);
                    member.add(MembercarName);
                    member.add(MembercarModel);
                    member.add(MembercarColour);

                    database.InsertIntoUNMember(member);
               } 
               AdminView a = new AdminView();
               a.showMembers();
               a.showUNMembers();
    }//GEN-LAST:event_SaveMemberActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        MemberName.setText("");
        MemberID.setText("");
        MemberEmailAddress.setText("");
        MemberCarName.setText("");
        MemberCarModel.setText("");
        MemberCarID.setText("");
        MemberCarColour.setText("");   
    }//GEN-LAST:event_ResetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMemberView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddMemberLabel;
    private javax.swing.JLabel CarColourLabel;
    private javax.swing.JLabel CarIDLabel;
    private javax.swing.JLabel CarModelLabel;
    private javax.swing.JLabel CarNameLabel;
    private javax.swing.JLabel EmailAdressLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField MemberCarColour;
    private javax.swing.JTextField MemberCarID;
    private javax.swing.JTextField MemberCarModel;
    private javax.swing.JTextField MemberCarName;
    private javax.swing.JTextField MemberEmailAddress;
    private javax.swing.JTextField MemberID;
    private javax.swing.JTextField MemberName;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel NewMember;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveMember;
    // End of variables declaration//GEN-END:variables
}
