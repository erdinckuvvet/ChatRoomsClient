package Screens;

import Messages.*;
import FileOperations.FileOperations;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ChatRoomsScreen extends javax.swing.JPanel {

    /**
     * Creates new form ChatRoomsScreen
     */
    ChatRoomsApp mainFrame;
    DefaultListModel messageList;
    //this panel represents in room menu. When a user enters a menu this menu opens to chat with others
    public ChatRoomsScreen(ChatRoomsApp mainFrame) throws IOException {
        initComponents();
        this.btn_send.setIcon(Utils.makeImageIcon("icons\\send.png", 30, 30));
        this.btn_attach.setIcon(Utils.makeImageIcon("icons\\attach.png", 30, 30));
        this.btn_leave.setIcon(Utils.makeImageIcon("icons\\back.png", 30, 30));
        this.mainFrame = mainFrame;
        this.messageList = new DefaultListModel();
        this.inRoomChatPanelJL.setModel(messageList);
    }
    //add a text message to chat formatted.
    public void AddMessageToChat(String senderName, String content)
    {
        String message = senderName + ": "+content;
        messageList.addElement(message);
    }
    // add any message to chat directly
    public void AddMessageToChat(String message)
    {
        messageList.addElement(message);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inRoomNameLBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inRoomChatPanelJL = new javax.swing.JList<>();
        txtfield_chat = new javax.swing.JTextField();
        btn_send = new javax.swing.JButton();
        btn_leave = new javax.swing.JButton();
        btn_attach = new javax.swing.JButton();
        try{
            lbl_angry = new JLabel(Utils.makeImageIcon("icons\\angry.png", 30, 30));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            lbl_sad = new JLabel(Utils.makeImageIcon("icons\\sad.png", 30, 30));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            lbl_smile = new JLabel(Utils.makeImageIcon("icons\\smile.png", 30, 30));
        }catch(Exception e){
            e.printStackTrace();
        }

        setBackground(new java.awt.Color(255, 255, 204));
        setMaximumSize(new java.awt.Dimension(465, 495));
        setMinimumSize(new java.awt.Dimension(465, 495));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inRoomNameLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inRoomNameLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inRoomNameLBL.setText("Room Name");
        add(inRoomNameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 223, 50));

        inRoomChatPanelJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inRoomChatPanelJLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inRoomChatPanelJL);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 414, 254));
        add(txtfield_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 241, 35));

        btn_send.setBackground(new java.awt.Color(0, 153, 51));
        btn_send.setForeground(new java.awt.Color(51, 51, 51));
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });
        add(btn_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 81, 35));

        btn_leave.setBackground(new java.awt.Color(204, 255, 255));
        btn_leave.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leaveActionPerformed(evt);
            }
        });
        add(btn_leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 40));

        btn_attach.setForeground(new java.awt.Color(51, 51, 51));
        btn_attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attachActionPerformed(evt);
            }
        });
        add(btn_attach, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 50, 35));

        lbl_angry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_angry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_angryMouseClicked(evt);
            }
        });
        add(lbl_angry, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 30, 30));

        lbl_sad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_sad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sadMouseClicked(evt);
            }
        });
        add(lbl_sad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 30, 30));

        lbl_smile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_smile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_smileMouseClicked(evt);
            }
        });
        add(lbl_smile, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leaveActionPerformed
        // when leave room button clicked, new room message will be creaeted with type of LEAVE and send to the server
        // then because of the returning allrooms menu, also send server a message for all updated rooms list in server.
        
        RoomMessage leaveRoomMsg = new RoomMessage(this.inRoomNameLBL.getText().toString(),this.mainFrame.client.userName,RoomMessage.RoomMessageType.LEAVE,null);
        Message leaveMsg  = new Message(Message.MessageTypes.IN_ROOM_MESSAGE);
        leaveMsg.content = leaveRoomMsg;
        this.mainFrame.client.Send(leaveMsg);
        
        this.mainFrame.changeMenu(this.mainFrame.inRoomMenu, this.mainFrame.roomsMenu);
        Message msg = new Message(Message.MessageTypes.ALL_ROOMS);
        this.mainFrame.client.Send(msg);
        
     
    }//GEN-LAST:event_btn_leaveActionPerformed
    public void clearInRoom()
    {
        this.messageList.removeAllElements();
       txtfield_chat.setText("");
    }
    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        // This is for sending text message to the room.
        // When you click this button, a in room message sending to server and server sends this message every clients in room
        
        String textMessage = txtfield_chat.getText().toString();
        String roomName = inRoomNameLBL.getText().toString();
        if(textMessage.isBlank())
        {
            return;
        }
        RoomMessage roomMsg = new RoomMessage(roomName,
                this.mainFrame.client.userName,RoomMessage.RoomMessageType.TEXT,textMessage);
        Message msg = new Message(Message.MessageTypes.IN_ROOM_MESSAGE);
        msg.content = roomMsg;
        this.mainFrame.client.Send(msg);
       txtfield_chat.setText("");
    }//GEN-LAST:event_btn_sendActionPerformed

    private void btn_attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attachActionPerformed
        // When this button clicked, user chooses a file from jfilechooser and send upload request to the server.
        String chosenFilePath = FileOperations.chooseFileAndGetPath();

        String nameOfChosenFile = FileOperations.getFileName(chosenFilePath);

        byte[] contentOfChosenFile = FileOperations.getContent(chosenFilePath);

        FileMessage fileMessage = new FileMessage(nameOfChosenFile, contentOfChosenFile);

        RoomMessage roomMessage = new RoomMessage(inRoomNameLBL.getText().toString(), this.mainFrame.client.userName, RoomMessage.RoomMessageType.FILE, fileMessage);

        Message message = new Message(Message.MessageTypes.UPLOAD_FILE_REQUEST);
        message.content = roomMessage;

        this.mainFrame.client.Send(message);
    }//GEN-LAST:event_btn_attachActionPerformed

    //this is for control is it a download message. If it contains the bottom string, it is a download message.
     public boolean isMessageDownloadsFile(String message) {
        if (message.contains("Click to see download button!")) {
            return true;
        }
        return false;
    }
     // the file name every time stands on 2 index when the message splitted by whitespace
    public String getFileNameFromMessageByGivenType(String userMessage) {
        return userMessage.split(" ")[2];
    }
    
    private void inRoomChatPanelJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inRoomChatPanelJLMouseClicked
        // if the clicked message on list is a downloadable message then show a input dialog to download or not.
        // if it is yes , then download request goes to server.
         String userMessage = inRoomChatPanelJL.getSelectedValue();
        if (userMessage == null) {
            return;
        }
        if (isMessageDownloadsFile(userMessage)) {

            int inputDialogue = JOptionPane.showConfirmDialog(null, "Do you want to download the file " + "?",
                    "Download File", JOptionPane.YES_NO_OPTION);

            if (inputDialogue == 0) {
                //yes
                String fileName = getFileNameFromMessageByGivenType(userMessage);
                Message message = new Message(Message.MessageTypes.DOWNLOAD_FILE_REQUEST);
                message.content = fileName;
                this.mainFrame.client.Send(message);
            } else {
                inRoomChatPanelJL.setSelectedIndex(-1);
            }
        }
    }//GEN-LAST:event_inRoomChatPanelJLMouseClicked

    private void lbl_angryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_angryMouseClicked
        // TODO add your handling code here:
        txtfield_chat.setText(txtfield_chat.getText()+"😡");
    }//GEN-LAST:event_lbl_angryMouseClicked

    private void lbl_sadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sadMouseClicked
        // TODO add your handling code here:
        txtfield_chat.setText(txtfield_chat.getText()+"☹️");
    }//GEN-LAST:event_lbl_sadMouseClicked

    private void lbl_smileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_smileMouseClicked
        // TODO add your handling code here:
        txtfield_chat.setText(txtfield_chat.getText()+"😀");
    }//GEN-LAST:event_lbl_smileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_attach;
    private javax.swing.JButton btn_leave;
    private javax.swing.JButton btn_send;
    private javax.swing.JList<String> inRoomChatPanelJL;
    public javax.swing.JLabel inRoomNameLBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_angry;
    private javax.swing.JLabel lbl_sad;
    private javax.swing.JLabel lbl_smile;
    private javax.swing.JTextField txtfield_chat;
    // End of variables declaration//GEN-END:variables
}
