import java.awt.*;
import java.applet.*;

public class gui extends Applet {
    Label l1 = new Label("NU LAS PINAS");
    Label l2 = new Label("GRADING SYSTEM");
    Label l3 = new Label("Student Name:");
    TextField t1 = new TextField(10);
    Label l4 = new Label("Course/Year:");
    TextField t2 = new TextField(10);
    Label l5 = new Label("Prelim");
    Label l6 = new Label("Midterm");
    Label l7 = new Label("Finals");
    Label l8 = new Label("Quiz 1");
    TextField t3 = new TextField(10);
    TextField t4 = new TextField(10);
    TextField t5 = new TextField(10);
    Label l9 = new Label("Quiz 2");
    TextField t6 = new TextField(10);
    TextField t7 = new TextField(10);
    TextField t8 = new TextField(10);
    Label l10 = new Label("Attendance");
    TextField t9 = new TextField(10);
    TextField t10 = new TextField(10);
    TextField t11 = new TextField(10);
    Label l11 = new Label("Assignment");
    TextField t12 = new TextField(10);
    TextField t13 = new TextField(10);
    TextField t14 = new TextField(10);
    Label l12 = new Label("Project");
    TextField t15 = new TextField(10);
    TextField t16 = new TextField(10);
    TextField t17 = new TextField(10);
    Label l13 = new Label("Seatwork");
    TextField t18 = new TextField(10);
    TextField t19 = new TextField(10);
    TextField t20 = new TextField(10);
    Label l14 = new Label("Major Exam");
    TextField t21 = new TextField(10);
    TextField t22 = new TextField(10);
    TextField t23 = new TextField(10);
    Font f = new Font("Times New Roman", Font.BOLD, 25);
    public void init() {
        setLayout(null);
        setSize(750, 600);

        add(l1);
        l1.setBounds(250, 30, 200, 30);
        l1.setFont(f);
        add(l2);
        l2.setBounds(250, 65, 250, 30);
        l2.setFont(f);

        add(l3);
        l3.setBounds(50, 120, 100, 25);
        add(t1);
        t1.setBounds(160, 120, 180, 25);
        add(l4);
        l4.setBounds(50, 155, 100, 25);
        add(t2);
        t2.setBounds(160, 155, 180, 25);

        add(l5);
        l5.setBounds(250, 210, 100, 25);
        add(l6);
        l6.setBounds(400, 210, 100, 25);
        add(l7);
        l7.setBounds(550, 210, 100, 25);

        add(l8);
        l8.setBounds(50, 250, 100, 25);
        add(t3);
        t3.setBounds(220, 250, 100, 25);
        add(t4);
        t4.setBounds(370, 250, 100, 25);
        add(t5);
        t5.setBounds(520, 250, 100, 25);

        add(l9);
        l9.setBounds(50, 290, 100, 25);
        add(t6);
        t6.setBounds(220, 290, 100, 25);
        add(t7);
        t7.setBounds(370, 290, 100, 25);
        add(t8);
        t8.setBounds(520, 290, 100, 25);

        add(l10);
        l10.setBounds(50, 330, 100, 25);
        add(t9);
        t9.setBounds(220, 330, 100, 25);
        add(t10);
        t10.setBounds(370, 330, 100, 25);
        add(t11);
        t11.setBounds(520, 330, 100, 25);

        add(l11);
        l11.setBounds(50, 370, 100, 25);
        add(t12);
        t12.setBounds(220, 370, 100, 25);
        add(t13);
        t13.setBounds(370, 370, 100, 25);
        add(t14);
        t14.setBounds(520, 370, 100, 25);

        add(l12);
        l12.setBounds(50, 410, 100, 25);
        add(t15);
        t15.setBounds(220, 410, 100, 25);
        add(t16);
        t16.setBounds(370, 410, 100, 25);
        add(t17);
        t17.setBounds(520, 410, 100, 25);

        add(l13);
        l13.setBounds(50, 450, 100, 25);
        add(t18);
        t18.setBounds(220, 450, 100, 25);
        add(t19);
        t19.setBounds(370, 450, 100, 25);
        add(t20);
        t20.setBounds(520, 450, 100, 25);

        add(l14);
        l14.setBounds(50, 490, 100, 25);
        add(t21);
        t21.setBounds(220, 490, 100, 25);
        add(t22);
        t22.setBounds(370, 490, 100, 25);
        add(t23);
        t23.setBounds(520, 490, 100, 25);
    }
}