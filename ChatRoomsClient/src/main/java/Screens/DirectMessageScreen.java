package Screens;

import Messages.FileMessage;
import Messages.Message;
import Messages.RoomMessage;
import FileOperations.FileOperations;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DirectMessageScreen extends javax.swing.JPanel {

    /**
     * Creates new form DirectMessageScreen
     */
    ChatRoomsApp mainFrame;
    DefaultListModel chatPanelModel;

    public DirectMessageScreen(ChatRoomsApp mainFrame) throws IOException {
        initComponents();
        this.btn_send.setIcon(Utils.makeImageIcon("icons\\send.png", 30, 30));
        this.btn_attach.setIcon(Utils.makeImageIcon("icons\\attach.png", 30, 30));
        this.btn_leave.setIcon(Utils.makeImageIcon("icons\\back.png", 30, 30));
        this.mainFrame = mainFrame;
        chatPanelModel = new DefaultListModel();
        this.personelRoomChatJL.setModel(chatPanelModel);
        
    }
    //add text message formatted to the chat.
    public void AddTextMessageToChat(String senderName, String content) {
        String message = senderName + ": " + content;
        chatPanelModel.addElement(message);
    }
    //add message directly to the chat
    public void AddTextMessageToChat(String message) {
        chatPanelModel.addElement(message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personelRoomHeaderLBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personelRoomChatJL = new javax.swing.JList<>();
        txtfield_chat = new javax.swing.JTextField();
        btn_send = new javax.swing.JButton();
        btn_attach = new javax.swing.JButton();
        btn_leave = new javax.swing.JButton();
        try{
            lbl_smile = new JLabel(Utils.makeImageIcon("icons\\smile.png", 30, 30));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            lbl_sad = new JLabel(Utils.makeImageIcon("icons\\sad.png", 30, 30));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            lbl_angry = new JLabel(Utils.makeImageIcon("icons\\angry.png", 30, 30));
        }catch(Exception e){
            e.printStackTrace();
        }

        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(465, 495));
        setMinimumSize(new java.awt.Dimension(465, 495));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personelRoomHeaderLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        personelRoomHeaderLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personelRoomHeaderLBL.setText("Direct Message");
        add(personelRoomHeaderLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 235, 48));

        personelRoomChatJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personelRoomChatJLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personelRoomChatJL);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 399, 263));
        add(txtfield_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 246, 35));

        btn_send.setBackground(new java.awt.Color(0, 153, 51));
        btn_send.setForeground(new java.awt.Color(51, 51, 51));
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });
        add(btn_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 81, 35));

        btn_attach.setForeground(new java.awt.Color(51, 51, 51));
        btn_attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attachActionPerformed(evt);
            }
        });
        add(btn_attach, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 52, 35));

        btn_leave.setBackground(new java.awt.Color(255, 255, 255));
        btn_leave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leaveActionPerformed(evt);
            }
        });
        add(btn_leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        lbl_smile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_smile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_smileMouseClicked(evt);
            }
        });
        add(lbl_smile, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 30, 30));

        lbl_sad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_sad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sadMouseClicked(evt);
            }
        });
        add(lbl_sad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 30, 30));

        lbl_angry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_angry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_angryMouseClicked(evt);
            }
        });
        add(lbl_angry, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        // this buttons sends given inp text to the personel room chat.
        //control input
        //...
        String textMessageINP = txtfield_chat.getText().toString();
        if (textMessageINP.isBlank()) {
            return;
        }
        //...
        //finish control input
        // then create a personel room message and send to server.
        RoomMessage roomMsg = new RoomMessage("personel",
                this.mainFrame.client.userName, RoomMessage.RoomMessageType.TEXT, textMessageINP);
        Message msg = new Message(Message.MessageTypes.PERSONEL_ROOM_MESSAGE);
        msg.content = roomMsg;
        this.mainFrame.client.Send(msg);
        this.txtfield_chat.setText("");
    }//GEN-LAST:event_btn_sendActionPerformed
    
    // if a message contains text below , it is a downloadable text.
    public boolean isMessageDownloadsFile(String message) {
        if (message.contains("Click to see download button!")) {
            return true;
        }
        return false;
    }

    public String getFileNameFromMessageByGivenType(String userMessage) {
        return userMessage.split(" ")[2];
    }
    private void personelRoomChatJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personelRoomChatJLMouseClicked
        // if a downloadable message is clicked on list, then shows a input dialogue
        //if user wants to download the file or not.
        //if it is yes, send a download file request to server.
        String userMessage = personelRoomChatJL.getSelectedValue();
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
                personelRoomChatJL.setSelectedIndex(-1);
            }
        }
    }//GEN-LAST:event_personelRoomChatJLMouseClicked


    private void btn_attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attachActionPerformed

        String chosenFilePath = FileOperations.chooseFileAndGetPath();

        String nameOfChosenFile = FileOperations.getFileName(chosenFilePath);

        byte[] contentOfChosenFile = FileOperations.getContent(chosenFilePath);

        FileMessage fileMessage = new FileMessage(nameOfChosenFile, contentOfChosenFile);

        RoomMessage roomMessage = new RoomMessage("personel", this.mainFrame.client.userName, RoomMessage.RoomMessageType.FILE, fileMessage);

        Message message = new Message(Message.MessageTypes.UPLOAD_FILE_REQUEST);
        message.content = roomMessage;

        this.mainFrame.client.Send(message);

        
    }//GEN-LAST:event_btn_attachActionPerformed
    public void clearPersonelRoom()
    {
        this.chatPanelModel.removeAllElements();
        this.txtfield_chat.setText("");
    }
    
    
    private void btn_leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leaveActionPerformed
        // TODO add your handling code here:
        Message leavePersonelRoomMsg = new Message(Message.MessageTypes.PERSONEL_ROOM_MESSAGE);
        RoomMessage leaveRoomMsg = new RoomMessage("personel",this.mainFrame.client.userName,RoomMessage.RoomMessageType.LEAVE,null);
        leavePersonelRoomMsg.content = leaveRoomMsg;
        this.mainFrame.client.Send(leavePersonelRoomMsg);
        
        Message allUserListMsg = new Message(Message.MessageTypes.ALL_USERS);
        this.mainFrame.changeMenu(this.mainFrame.personelRoomMenu,this.mainFrame.allUsersMenu);
        this.mainFrame.client.Send(allUserListMsg);
    }//GEN-LAST:event_btn_leaveActionPerformed

    private void lbl_smileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_smileMouseClicked
        // TODO add your handling code here:
        txtfield_chat.setText(txtfield_chat.getText()+"😀");
    }//GEN-LAST:event_lbl_smileMouseClicked

    private void lbl_sadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sadMouseClicked
        // TODO add your handling code here:
        txtfield_chat.setText(txtfield_chat.getText()+"☹️");
    }//GEN-LAST:event_lbl_sadMouseClicked

    private void lbl_angryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_angryMouseClicked
        // TODO add your handling code here:
        txtfield_chat.setText(txtfield_chat.getText()+"😡");
    }//GEN-LAST:event_lbl_angryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_attach;
    private javax.swing.JButton btn_leave;
    private javax.swing.JButton btn_send;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_angry;
    private javax.swing.JLabel lbl_sad;
    private javax.swing.JLabel lbl_smile;
    private javax.swing.JList<String> personelRoomChatJL;
    public javax.swing.JLabel personelRoomHeaderLBL;
    private javax.swing.JTextField txtfield_chat;
    // End of variables declaration//GEN-END:variables
}
