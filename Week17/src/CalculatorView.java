import java.awt.*;
import javax.swing.*;

public class CalculatorView extends JFrame{

private JLabel lbl1 = new JLabel("Number 1");
private JTextField txtf1 = new JTextField(10);
private JLabel lbl2 = new JLabel("Number 2");
private JTextField txtf2 = new JTextField(10);
private JLabel lblRes = new JLabel("Result");
private JTextField txtf3 = new JTextField(10);
private JButton btnAdd = new JButton("ADD");
private JButton btnSub = new JButton("SUB");

	public static void main(String[] args) {
	
	CalculatorView frame = new CalculatorView();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(200,200);
	frame.setTitle("Calculator");
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.prepareGUI();

	}
	private void prepareGUI() {
		
		Container area = getContentPane();
		area.setLayout(new FlowLayout());
		
		area.add(lbl1);
		area.add(txtf1);
		area.add(lbl2);
		area.add(txtf2);
		area.add(lblRes);
		area.add(txtf3);
		area.add(btnAdd);
		area.add(btnSub);
		
	}
	
		public JButton getAddBtn(){
			return btnAdd;
		}
		public JTextField getNum1(){
			return txtf1;
		}
		public JButton getSubBtn(){
			return btnSub;
		}
		public JTextField getNum2(){
			return txtf2;
		}
		public int getNumber1(){
			return Integer.parseInt(txtf1.getText());
		}
		public int getNumber2(){
			return Integer.parseInt(txtf2.getText());
		}
		
	
}


	


