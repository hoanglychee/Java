/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author Hoang
 */
public class Th1 extends Frame{

    public Th1()
    {
        setTitle("Các phép toán a và b");
        setSize(300,300);
        setLayout(new GridLayout(4,2));        
        lblA = new Label("a=");
        add(lblA);        
        txtA = new TextField(20);
        add(txtA);        
        lblB = new Label("b=");
        add(lblB);        
        txtB = new TextField(20);
        add(txtB);
        lbnull = new Label("");
        add(lbnull);
        p = new Panel();
        p.setLayout(new FlowLayout());
        btnTong = new Button ("+");
        btnTong.addActionListener(new TinhTong());
        p.add(btnTong);
        btnHieu = new Button ("-");
        btnHieu.addActionListener(new TinhHieu());
        p.add(btnHieu);
        btnTich = new Button ("*");
        btnTich.addActionListener(new TinhTich());
        p.add(btnTich);
        btnThuong = new Button ("/");
        btnThuong.addActionListener(new TinhThuong());
        p.add(btnThuong);
        add(p);
        lblKQ = new Label ("KQ=");
        add(lblKQ);
        txtKQ = new TextField(20);
        add(txtKQ);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });   
        setVisible(true); 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Th1();
    }
    class TinhTong implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Tong = a+b;      
            txtKQ.setText(String.valueOf(Tong));
        }
    }
    class TinhHieu implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Hieu = a-b;      
            txtKQ.setText(String.valueOf(Hieu));
        }    
    }   
    class TinhTich implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Tich = a*b;      
            txtKQ.setText(String.valueOf(Tich));
        }
    }
    class TinhThuong implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            int a= Integer.parseInt(txtA.getText());
            int b= Integer.parseInt(txtB.getText());
            Thuong = a/b;      
            txtKQ.setText(String.valueOf(Thuong));
        }
    }  
    Label lblA, lblB,lblKQ,lbnull;
    TextField txtA, txtB, txtKQ;
    Button btnTong,btnHieu,btnTich,btnThuong;
    float Tong,Tich,Hieu,Thuong;
    Panel p;
}

