package client_interface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame{

    private JTextArea debugTextArea;
    private JTextField inputField;
    private JButton start;


    public Client(){
        debugTextArea = new JTextArea();
        debugTextArea.setEditable(false);
        inputField = new JTextField();

        start = new JButton("Disconnect"); // Initialize the disconnect button
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(start, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);
        add(new JScrollPane(debugTextArea), BorderLayout.CENTER);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        debugTextArea.append("Connected\n");
        //visualization part

    }

    public static void main(String[] args) {

        Client s = new Client();



    }

}
