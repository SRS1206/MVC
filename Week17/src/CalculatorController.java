
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorController implements ActionListener {

	private CalculatorView  cv;
	private CalculatorModel  cm;
	
	
	 CalculatorController(CalculatorView cv,CalculatorModel cm) {
		// TODO Auto-generated constructor stub
		this.cv = cv;
		this.cm = cm;
		cv.getAddBtn().addActionListener(this);
		cv.getSubBtn().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Integercv.getNum1();
		
	}

}
