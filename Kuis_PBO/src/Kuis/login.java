//Nurul Ainia Septiana (123180042)

package Kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class login extends JFrame
{
    JLabel judul,user,pass;
    JTextField isiuser;
    JPasswordField isipass;
    JButton login;
    
    public login()
    {
        setTitle("LOGIN");
        
        judul = new JLabel("LOGIN ADMIN");
        user = new JLabel("Username");
        pass = new JLabel("Password");
        
        isiuser = new JTextField();
        isipass = new JPasswordField();
        
        login = new JButton("Login");
        
        setLayout(null);
        add(judul);
        add(user);
        add(pass);
        add(isiuser);
        add(isipass);
        add(login);
        
        judul.setBounds(110, 25, 100, 30);
        user.setBounds(25, 70, 100, 30);
        pass.setBounds(25, 110, 100, 30);
        isiuser.setBounds(100, 70, 150, 30);
        isipass.setBounds(100, 110, 150, 30);
        login.setBounds(100, 150, 70, 30);
        
        setSize(300,300); 
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        login.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String username = "admin";
                String password = "123";
                
                if(username.equalsIgnoreCase(isiuser.getText()) && password.equalsIgnoreCase(isipass.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Selamat Login Anda Berhasil");
                    MVC mvc = new MVC();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Maaf Login Anda Gagal");
                }
            }
            
        });
    }
}
