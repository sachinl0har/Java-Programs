import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class InvalidPasswordException extends Exception
{}
class loginChances extends JFrame implements ActionListener
{
    JLabel name, pass;
    JTextField nameText;
    JPasswordField passText;
    JButton login, end;
    static int cnt=0;
    loginChances()
    {
         name = new JLabel("Name : ");
         pass = new JLabel("Password : ");
         nameText = new JTextField(20);
         passText = new JPasswordField(20);
         login = new JButton("Login");
         end = new JButton("End");
         login.addActionListener(this);
          end.addActionListener(this);              
                              setLayout(new GridLayout(3,2));
          add(name);
          add(nameText);
          add(pass);
          add(passText);
          add(login);
          add(end);
          setTitle("Login Check");
          setSize(300,300);                              
                                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
               if(e.getSource()==end)
          {
                        System.exit(0);
   
          }
          if(e.getSource()==login)
          {
             try
             {
                 String user = nameText.getText();
                 String pass = new String(passText.getPassword());
                                   if(user.compareTo(pass)==0)
                 {  JOptionPane.showMessageDialog(null,"Login Successful","Login",JOptionPane.INFORMATION_MESSAGE);
                     System.exit(0);
                  }
                  else
                  {
                      throw new InvalidPasswordException();
                  }
                }
                catch(Exception e1)
                {
                    cnt++;
                    JOptionPane.showMessageDialog(null,"Login Failed","Login",JOptionPane.ERROR_MESSAGE);
                     nameText.setText("");
                     passText.setText("");
                     nameText.requestFocus();
                     if(cnt == 3)
                    {
           JOptionPane.showMessageDialog(null,"3 Attempts Over","Login",JOptionPane.ERROR_MESSAGE);
                        System.exit(0);           
                                                             }
                }       
         }               
   }
  public static void main(String args[])
 {
                new loginChances();
 }
}