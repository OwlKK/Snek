import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame(){
        //same as below
        //Gamepanel panel = new GamePanel();
        //this.add(panel);

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
