//package org.example;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class testForm
//{
//
//
//    private JPanel pane1;
//    private JButton addButtonButton;
//    private JButton minusButtonButton;
//    private JTextField input1;
//    private JTextField input2;
//    private JPanel result;
//
//    public testForm() {
//        addButtonButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                addButtonButton.setBackground(Color.CYAN);
//                pane1.setBackground(Color.blue);
//               int int1= Integer.parseInt(input1.getText());
//               int int2= Integer.parseInt(input2.getText());
//               result.setText("result="+(int1+int2));
//
//            }
//        });
//        minusButtonButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                minusButtonButton.setBackground(Color.GREEN);
//
//                pane1.setBackground(Color.RED);
//
//                int int1= Integer.parseInt(input1.getText());
//                int int2= Integer.parseInt(input2.getText());
//                result.setText("result="+(int1+int2));
//
//
//
//            }
//        });
//        input1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                pane1.setBackground(Color.gray);
//
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("testForm");
//
//        frame.setLocation(320,320);
//        frame.setSize(500,500);
//
//
//
//        frame.setContentPane(new testForm().pane1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
//}
