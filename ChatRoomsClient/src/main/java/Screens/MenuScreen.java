package Screens;
import Messages.Message;

public class MenuScreen extends javax.swing.JPanel {

    /**
     * Creates new form MenuScreen
     */
    ChatRoomsApp mainFrame;
    public MenuScreen(ChatRoomsApp mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        roomsBTN = new javax.swing.JButton();
        usersBTN = new javax.swing.JButton();

        setForeground(new java.awt.Color(0, 153, 0));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        mainMenuHeader.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        mainMenuHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuHeader.setText("CHAT ROOMS APP");

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        roomsBTN.setBackground(new java.awt.Color(255, 255, 204));
        roomsBTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        roomsBTN.setText("Chat Rooms");
        roomsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsBTNActionPerformed(evt);
            }
        });
        jPanel1.add(roomsBTN);

        usersBTN.setBackground(new java.awt.Color(204, 255, 204));
        usersBTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usersBTN.setText("Online Members");
        usersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersBTNActionPerformed(evt);
            }
        });
        jPanel1.add(usersBTN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainMenuHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenuHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roomsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsBTNActionPerformed
        // when rooms button clicked, 
        //send all rooms message to server to take all rooms in server and list them in roomsMenu
        //then opens the room menu
        Message msg = new Message(Message.MessageTypes.ALL_ROOMS);
        
        this.mainFrame.client.Send(msg);
        this.mainFrame.changeMenu(this.mainFrame.mainMenu, this.mainFrame.roomsMenu);
        
    }//GEN-LAST:event_roomsBTNActionPerformed

    private void usersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersBTNActionPerformed
        // when users button clicked,
        //send all user message to server to take all users on server and list them in usersMenu
        // then open the users menu.
        Message message = new Message(Message.MessageTypes.ALL_USERS);
        this.mainFrame.client.Send(message);
        this.mainFrame.changeMenu(this.mainFrame.mainMenu, this.mainFrame.allUsersMenu);
    }//GEN-LAST:event_usersBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel mainMenuHeader;
    private javax.swing.JButton roomsBTN;
    private javax.swing.JButton usersBTN;
    // End of variables declaration//GEN-END:variables
}