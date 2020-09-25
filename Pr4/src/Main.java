import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Practice extends JFrame
{
    int a = 0, b = 0;
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lscorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Practice()
    {
        super("Practice №4");
        setLayout(null);
        setSize(500,300);
        result.setBounds(200, 0, 200, 100);
        result.setFont(fnt);
        button1.setBounds(50, 100,110,50);
        button2.setBounds(330, 100,110,50);
        lscorer.setBounds(60, 200,200,50);
        winner.setBounds(320, 200,200,50);
        add(result);
        add(lscorer);
        add(winner);
        add(button1);
        add(button2);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                result.setText("Result: " + a + " X " + b);
                lscorer.setText("Last Scorer: AC Milan");
                if(a > b) winner.setText("Winner: AC Milan");
                if(a < b) winner.setText("Winner: Real Madrid");
                if(a == b) winner.setText("Winner: DRAW");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b++;
                result.setText("Result: " + a + " X " + b);
                lscorer.setText("Last Scorer: Real Madrid");
                if(a > b) winner.setText("Winner: AC Milan");
                if(a < b) winner.setText("Winner: Real Madrid");
                if(a == b) winner.setText("Winner: DRAW");
            }
        });

        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Practice();
    }
}