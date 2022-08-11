//import
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//start
public class dreamjavasqlGUI{
    int id=1;
//GUI
    //全局变量初始化
    TextField text=new TextField("",20);
    public void gui(){
    //初始化
        Panel panel=new Panel();
        Frame frame=new Frame();
        MenuBar menu=new MenuBar();
        Button button1=new Button("log in data");


    //gui创建
        frame=new Frame("dreamjavasqlGUI shellos");
        frame.setBounds(200,200,200,200);

    //面板
        //menu
        frame.setMenuBar(menu);
        Menu m1=new Menu("set");
        menu.add(m1);
        MenuItem exit=new MenuItem("exit");
        m1.add(exit);
        //button
        panel.setLayout(new FlowLayout());
        panel.add(button1);
        frame.add(panel);
        //TextField
        panel.setLayout(new FlowLayout());
        panel.add(text);
        frame.add(panel);

    //显示
        frame.setVisible(true);

    //控制器
        exit.addActionListener(new menulistens());
        button1.addActionListener(new buttonlistens());
    //exit
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });
    }

    //menu监听器
    class menulistens implements ActionListener{
        public void actionPerformed(ActionEvent event){
            MenuItem item=(MenuItem) event.getSource();
            if ("exit".equals(item.getLabel())){
                System.exit(1);
            }
        }
    }

    //button监听器
    class buttonlistens implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String sqlsj=text.getText();
            System.out.println(id+"|"+sqlsj);
            id=id+1;
        }
    }

    public static void main(String[] args){
        System.out.println("dreamjavasqlGUI\n");
        dreamjavasqlGUI open=new dreamjavasqlGUI();
        open.gui();
    }
}