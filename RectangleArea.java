
import javax.swing.*;
import java.awt.*;


public class RectangleArea extends JFrame{
    JLabel lbl_Length,lbl_Width,lbl_Area,lbl_Perimeter;
    JTextField txt_Length,txt_Width,txt_Area,txt_Perimeter;
    JButton btn_FindArea;
    RectangleArea(){
        setTitle("Rectangle Area");
        lbl_Length = new JLabel("Enter Length of Rectangle ");
        lbl_Width= new JLabel("Enter Width of Rectangle ");
        lbl_Area= new JLabel("Area of Rectangle ");
        lbl_Perimeter= new JLabel("Perimeter of Rectangle ");
        txt_Length = new JTextField(12);
        txt_Width = new JTextField(12);
        txt_Area = new JTextField(12);
        txt_Area.setEditable(false);
        txt_Perimeter = new JTextField(12);
        txt_Perimeter.setEditable(false);
        btn_FindArea = new JButton("Find Area and Perimeter of Rectangle");
        GridBagLayout lay_out = new GridBagLayout();
        setLayout(lay_out);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lbl_Length, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txt_Length, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lbl_Width, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txt_Width, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lbl_Area, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(txt_Area, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lbl_Perimeter, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(txt_Perimeter, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth=2;
        add(btn_FindArea, gbc);
        pack();
        setVisible(true);

        btn_FindArea.addActionListener(e -> {
            float length,width,area,perimeter;
            if(txt_Length.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"Enter Length");
            }
            else if(txt_Width.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Enter Width");
            }
            else
            {
                length=Float.parseFloat(txt_Length.getText());
                width=Float.parseFloat(txt_Width.getText());
                area=length*width;
                txt_Area.setText(""+area);
                perimeter=2*(length+width);
                txt_Perimeter.setText(""+perimeter);
            }
        });
    }

    public static void main(String[] args) {
        new RectangleArea();
    }
}
