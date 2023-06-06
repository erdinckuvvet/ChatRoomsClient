package Screens;

import Messages.CreateRoomMessage;
import Messages.JoinRoomMessage;
import Messages.Message;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class RoomsOverlayScreen extends javax.swing.JPanel {

    /**
     * Creates new form RoomChatPanel
     */
    DefaultListModel roomsModel;
    ChatRoomsApp mainFrame;
    
    public RoomsOverlayScreen(ChatRoomsApp mainFrame) throws IOException {
        initComponents();
        this.btn_back.setIcon(Utils.makeImageIcon("icons\\back.png", 30, 30));
        this.mainFrame = mainFrame;
        roomsModel = new DefaultListModel();
        roomList.setModel(roomsModel);
    }
    
    public void UpdateRoomListWithGivenList(ArrayList<String> roomNames)
    {
        roomsModel.removeAllElements();
        if(roomNames.isEmpty())
        {
            return;
        }
        for (String name : roomNames) {
            roomsModel.addElement(name);
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

        roomsMenuLBL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        createNewRoomBTN = new javax.swing.JButton();
        createRoomNameLBL = new javax.swing.JLabel();
        newRoomNameINP = new javax.swing.JTextField();
        createNewRoomHeaderLBL = new javax.swing.JLabel();
        refreshRoomListBTN = new javax.swing.JButton();
        joinRoomBTN = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        roomsMenuLBL.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        roomsMenuLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomsMenuLBL.setText("CHAT ROOMS");

        jScrollPane2.setViewportView(roomList);

        createNewRoomBTN.setBackground(new java.awt.Color(204, 255, 255));
        createNewRoomBTN.setForeground(new java.awt.Color(51, 51, 51));
        createNewRoomBTN.setText("CREATE");
        createNewRoomBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewRoomBTNActionPerformed(evt);
            }
        });

        createRoomNameLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createRoomNameLBL.setText("Room Name");

        newRoomNameINP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRoomNameINPActionPerformed(evt);
            }
        });

        createNewRoomHeaderLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createNewRoomHeaderLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createNewRoomHeaderLBL.setText("Create New Room");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newRoomNameINP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewRoomHeaderLBL)
                    .addComponent(createNewRoomBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createRoomNameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createNewRoomHeaderLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(createRoomNameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newRoomNameINP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createNewRoomBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        refreshRoomListBTN.setBackground(new java.awt.Color(204, 255, 255));
        refreshRoomListBTN.setForeground(new java.awt.Color(51, 51, 51));
        refreshRoomListBTN.setText("REFRESH");
        refreshRoomListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshRoomListBTNActionPerformed(evt);
            }
        });

        joinRoomBTN.setBackground(new java.awt.Color(204, 255, 255));
        joinRoomBTN.setForeground(new java.awt.Color(51, 51, 51));
        joinRoomBTN.setText("JOIN");
        joinRoomBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinRoomBTNActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(204, 255, 255));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(joinRoomBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(refreshRoomListBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(roomsMenuLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roomsMenuLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joinRoomBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshRoomListBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createNewRoomBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewRoomBTNActionPerformed
        // when this button is clicked, a new room will be created on server.
        //control input
        //...
        if(newRoomNameINP.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "you must enter a room name!");
            return;
        }
        //...
        //finish control input
        //create message for create rooom and send to the server.
        CreateRoomMessage crm = new CreateRoomMessage(this.mainFrame.client.userName,newRoomNameINP.getText().toString());
        Message message = new Message(Message.MessageTypes.CREATE_ROOM);
        message.content = crm;
        this.mainFrame.client.Send(message);
    }//GEN-LAST:event_createNewRoomBTNActionPerformed

    private void refreshRoomListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshRoomListBTNActionPerformed
        // when this buton is clicked all rooms message send to server to refresh list
        //with new rooms.
        Message message = new Message(Message.MessageTypes.ALL_ROOMS);
        this.mainFrame.client.Send(message);
    }//GEN-LAST:event_refreshRoomListBTNActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        //if return button is clicked then go backto main menu.
        newRoomNameINP.setText("");
        roomsModel.removeAllElements();
        this.mainFrame.changeMenu(this.mainFrame.roomsMenu,this.mainFrame.mainMenu);
    }//GEN-LAST:event_btn_backActionPerformed

    private void joinRoomBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinRoomBTNActionPerformed
        // if this button is clicked, then a join room request sends to server .
        if(roomList.getSelectedValue() == null)return;
        System.out.println("Selected Value is not empty");
        String chosenRoom = roomList.getSelectedValue();
        Message message = new Message(Message.MessageTypes.JOIN_ROOM);
        JoinRoomMessage jrm = new JoinRoomMessage(this.mainFrame.client.userName,chosenRoom);
        message.content = jrm;
        this.mainFrame.client.Send(message);
        System.out.println("Join Room Message Sended");
    }//GEN-LAST:event_joinRoomBTNActionPerformed

    private void newRoomNameINPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRoomNameINPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newRoomNameINPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton createNewRoomBTN;
    private javax.swing.JLabel createNewRoomHeaderLBL;
    private javax.swing.JLabel createRoomNameLBL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton joinRoomBTN;
    private javax.swing.JTextField newRoomNameINP;
    private javax.swing.JButton refreshRoomListBTN;
    private javax.swing.JList<String> roomList;
    private javax.swing.JLabel roomsMenuLBL;
    // End of variables declaration//GEN-END:variables
}