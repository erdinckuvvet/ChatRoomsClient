package Screens;

import Messages.CreatePersonelRoomMessage;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import Messages.Message;
import java.io.IOException;


public class UsersScreen extends javax.swing.JPanel {

    /**
     * Creates new form UsersScreen
     */
    ChatRoomsApp mainFrame;
    DefaultListModel userListModel;

    //this panel is represents all user menu . Which list the users on server and , services to start messaging with hem
    public UsersScreen(ChatRoomsApp mainFrame) throws IOException {
        initComponents();
        this.btn_back.setIcon(Utils.makeImageIcon("icons\\back.png", 30, 30));
        this.mainFrame = mainFrame;
        this.userListModel = new DefaultListModel();
        this.allUsersJL.setModel(userListModel);
    }
    
    //updates the all users list with given list.
    public void UpdateUserListWithGivenList(ArrayList<String> userNames) {
        userListModel.removeAllElements();
        for (String name : userNames) {
            if (name.isBlank() || name.equals(this.mainFrame.client.userName)) {
                continue;
            }
            userListModel.addElement(name);
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

        lbl_header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allUsersJL = new javax.swing.JList<>();
        startPersonalMessagingBTN = new javax.swing.JButton();
        refreshBTN = new javax.swing.JButton();
        returnMenuBTN = new javax.swing.JButton();
        startMessageBTN = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        lbl_header.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        lbl_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header.setText("USERS");

        jScrollPane1.setViewportView(allUsersJL);

        startPersonalMessagingBTN.setBackground(new java.awt.Color(204, 255, 255));
        startPersonalMessagingBTN.setText("Start Message");
        startPersonalMessagingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPersonalMessagingBTNActionPerformed(evt);
            }
        });

        refreshBTN.setBackground(new java.awt.Color(255, 255, 204));
        refreshBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        refreshBTN.setText("Refresh");
        refreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBTNActionPerformed(evt);
            }
        });

        returnMenuBTN.setText("Return Menu");

        startMessageBTN.setBackground(new java.awt.Color(255, 255, 204));
        startMessageBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startMessageBTN.setText("Chat");
        startMessageBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMessageBTNActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(255, 255, 204));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(returnMenuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(startPersonalMessagingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(lbl_header, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(startMessageBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbl_header, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startMessageBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(926, 926, 926)
                .addComponent(startPersonalMessagingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnMenuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBTNActionPerformed
        // when refresh button is clicked, send server to request for all users.
        Message message = new Message(Message.MessageTypes.ALL_USERS);
        this.mainFrame.client.Send(message);
    }//GEN-LAST:event_refreshBTNActionPerformed

    private void startPersonalMessagingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPersonalMessagingBTNActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_startPersonalMessagingBTNActionPerformed

    private void startMessageBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMessageBTNActionPerformed
        // when start messagin clicked. Send server a create personel room request.
        if (allUsersJL.getSelectedValue() == null) {
            return;
        }
        CreatePersonelRoomMessage cprm = new CreatePersonelRoomMessage();
        cprm.creator = this.mainFrame.client.userName;
        cprm.joiner = allUsersJL.getSelectedValue().toString();
        Message message = new Message(Message.MessageTypes.CREATE_PERSONEL_ROOM);
        message.content = cprm;
        this.mainFrame.client.Send(message);
    }//GEN-LAST:event_startMessageBTNActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.mainFrame.changeMenu(this.mainFrame.allUsersMenu, this.mainFrame.mainMenu);
    }//GEN-LAST:event_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> allUsersJL;
    private javax.swing.JButton btn_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JButton returnMenuBTN;
    private javax.swing.JButton startMessageBTN;
    private javax.swing.JButton startPersonalMessagingBTN;
    // End of variables declaration//GEN-END:variables
}