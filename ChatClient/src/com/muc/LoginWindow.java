package com.muc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoginWindow extends JFrame {
    public static String currentUser;
    private final ChatClient client;
    private final JPanel mainPanel = new JPanel();
    private final JTextField loginField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();
    private final JButton loginButton = new JButton("Login");

    public LoginWindow() {
        super("Login");
        this.client = new ChatClient("127.0.0.1", 8818);
        client.connect();



        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(loginField);
        inputPanel.add(passwordField);
        inputPanel.add(loginButton);
        inputPanel.setSize(inputPanel.getPreferredSize());
        loginButton.addActionListener(e -> doLogin());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(inputPanel, BorderLayout.EAST);
        setSize(new Dimension(600, 400));
        setVisible(true);
    }

    public static String getCurrentUser() {
        return currentUser;
    }

    public static void main(String[] args) {
        LoginWindow loginWin = new LoginWindow();
        loginWin.setVisible(true);
    }

    private void doLogin() {
        currentUser = loginField.getText();
        String password = passwordField.getText();
        try {
            if (client.login(currentUser, password)) {
                UserListPane onlineListPanel = new UserListPane(client, currentUser);
                MessageGrpPane groupChatPanel = new MessageGrpPane(client, currentUser);
                UserPaneOffLine offlineListPanel = new UserPaneOffLine(client, currentUser);

                JFrame frame = new JFrame("BreadCost - " + currentUser);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(mainPanel);
                frame.setSize(new Dimension(600, 400));
                frame.setVisible(true);
                frame.setResizable(false);

                frame.add(onlineListPanel, BorderLayout.WEST);
                frame.add(groupChatPanel, BorderLayout.CENTER);
                frame.add(offlineListPanel, BorderLayout.EAST);

                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid login/password.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
