import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tttUI {
    private JPanel panel1;
    private JButton b00;
    private JButton b10;
    private JButton b20;
    private JButton b01;
    private JButton b11;
    private JButton b21;
    private JButton b02;
    private JButton b12;
    private JButton b22;
    private JLabel round;
    private JButton breset;




    private int[][] victory_array = new int[3][3];

    private boolean flag_round;
    private boolean flag_winner;

    private void check_winner()
    {
        String check_who;
        if(flag_round)
            check_who="X";
        else
            check_who="Y";

        if(b00.getText()==check_who)
        {
            if(b01.getText()==check_who)
            {
                if(b02.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                    flag_winner=true;
                }
            }
            if(b10.getText()==check_who)
            {
                if(b20.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                    flag_winner=true;
                }
            }
            if(b11.getText()==check_who)
            {
                if(b22.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                    flag_winner=true;
                }
            }
        }
        if(b10.getText()==check_who)
        {
            if(b11.getText()==check_who)
            {
                if(b12.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                      flag_winner=true;
                }
            }
        }
        if(b20.getText()==check_who)
        {
            if(b21.getText()==check_who)
            {
                if(b22.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                        flag_winner=true;
                }
            }
        }
        if(b01.getText()==check_who)
        {
            if(b11.getText()==check_who)
            {
                if(b21.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                        flag_winner=true;
                }
            }
        }
        if(b02.getText()==check_who)
        {
            if(b12.getText()==check_who)
            {
                if(b22.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                    flag_winner=true;
                }
            }
        }
        if(b02.getText()==check_who)
        {
            if(b11.getText()==check_who)
            {
                if(b20.getText()==check_who)
                {
                    if(flag_round)
                        round.setText("wygrał X");
                    else
                        round.setText("wygrał Y");
                    flag_winner=true;
                }
            }
        }
    }



    private ActionListener button_action(JButton bxx) {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(!flag_winner)
                {
                    if(!((bxx.getText()=="X")||(bxx.getText()=="Y")))
                    {
                        if(flag_round)
                        {
                            bxx.setText("X");
                        }
                        else
                        {
                            bxx.setText("Y");
                        }
                        bxx.setEnabled(false);
                    }
                    check_winner();
                    flag_round=!flag_round;
                }


                if(!flag_winner)
                {
                    if (flag_round)
                        round.setText("Kolejka X");
                    else
                        round.setText("Kolejka Y");
                }

            }
        };
    }


    public tttUI()
    {
        b00.addActionListener(button_action(b00));
        b01.addActionListener(button_action(b01));
        b02.addActionListener(button_action(b02));
        b10.addActionListener(button_action(b10));
        b11.addActionListener(button_action(b11));
        b12.addActionListener(button_action(b12));
        b20.addActionListener(button_action(b20));
        b21.addActionListener(button_action(b21));
        b22.addActionListener(button_action(b22));


        flag_round=true;
        flag_winner=false;
        round.setText("Kolejka X");

        breset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                b00.setEnabled(true);
                b01.setEnabled(true);
                b02.setEnabled(true);
                b10.setEnabled(true);
                b11.setEnabled(true);
                b12.setEnabled(true);
                b20.setEnabled(true);
                b21.setEnabled(true);
                b22.setEnabled(true);
                b00.setText("");
                b01.setText("");
                b02.setText("");
                b10.setText("");
                b11.setText("");
                b12.setText("");
                b20.setText("");
                b21.setText("");
                b22.setText("");
                flag_winner = false;
            }
        });



    }

    public static void main(String[] args)
    {
        JFrame  frame = new JFrame ("App");
        frame.setContentPane(new tttUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }



}
