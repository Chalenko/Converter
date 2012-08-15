package Converter;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

public class Frame {
	private static Logger LOGINFRAME = Logger.getLogger(Frame.class);
	private static JFrame jf = new JFrame("Converter");
	private static Container cp = jf.getContentPane();
	private static JLabel jFrom;
	private static JLabel jTo;
	private static JButton jSwap;
	private static JTextField jValueFrom;
	private static JButton jConvert;
	private static JTextField jValueTo;
	
	private static void Create(){
		jf.setBounds(312, 234, 400, 300);
		jf.setLayout(new FlowLayout());
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(2, 3));
		
		jFrom = new JLabel();
		jSwap = new JButton("Swap");
		jTo = new JLabel();
		jValueFrom = new JTextField();
		jConvert = new JButton("Convert");
		jValueTo = new JTextField();
		jValueTo.setEnabled(false);
		
		p3.add(jFrom);
		p3.add(jSwap);
		p3.add(jTo);
		p3.add(jValueFrom);
		p3.add(jConvert);
		p3.add(jValueTo);
		
		jf.setLayout(new BorderLayout());
		
		cp.add(p3, BorderLayout.CENTER);
		jf.setVisible(true);
	}

	public static void CreateTemperatureFrame(TemperatureConverter conv) {
		Create();
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();

		p1.setLayout(new GridLayout(8, 1));
		p2.setLayout(new GridLayout(8, 1));

		JRadioButton jRadioButtonFromCelsium = new JRadioButton("Celsium", true);
		JRadioButton jRadioButtonFromKelvin = new JRadioButton("Kelvin", false);
		JRadioButton jRadioButtonFromFahrenheit = new JRadioButton("Fahrenheit", false);
		JRadioButton jRadioButtonFromRankine = new JRadioButton("Rankine", false);
		JRadioButton jRadioButtonFromDelisle = new JRadioButton("Delisle", false);
		JRadioButton jRadioButtonFromNewton = new JRadioButton("Newton", false);
		JRadioButton jRadioButtonFromReamur = new JRadioButton("Reamur", false);
		JRadioButton jRadioButtonFromRomer = new JRadioButton("Romer", false);

		JRadioButton jRadioButtonToCelsium = new JRadioButton("Celsium", false);
		JRadioButton jRadioButtonToKelvin = new JRadioButton("Kelvin", true);
		JRadioButton jRadioButtonToFahrenheit = new JRadioButton("Fahrenheit", false);
		JRadioButton jRadioButtonToRankine = new JRadioButton("Rankine", false);
		JRadioButton jRadioButtonToDelisle = new JRadioButton("Delisle", false);
		JRadioButton jRadioButtonToNewton = new JRadioButton("Newton", false);
		JRadioButton jRadioButtonToReamur = new JRadioButton("Reamur", false);
		JRadioButton jRadioButtonToRomer = new JRadioButton("Romer", false);

		ButtonGroup buttonGroupFrom = new ButtonGroup();
		ButtonGroup buttonGroupTo = new ButtonGroup();

		buttonGroupFrom.add(jRadioButtonFromCelsium);
		buttonGroupFrom.add(jRadioButtonFromKelvin);
		buttonGroupFrom.add(jRadioButtonFromFahrenheit);
		buttonGroupFrom.add(jRadioButtonFromRankine);
		buttonGroupFrom.add(jRadioButtonFromDelisle);
		buttonGroupFrom.add(jRadioButtonFromNewton);
		buttonGroupFrom.add(jRadioButtonFromReamur);
		buttonGroupFrom.add(jRadioButtonFromRomer);
		
		buttonGroupTo.add(jRadioButtonToCelsium);
		buttonGroupTo.add(jRadioButtonToKelvin);
		buttonGroupTo.add(jRadioButtonToFahrenheit);
		buttonGroupTo.add(jRadioButtonToRankine);
		buttonGroupTo.add(jRadioButtonToDelisle);
		buttonGroupTo.add(jRadioButtonToNewton);
		buttonGroupTo.add(jRadioButtonToReamur);
		buttonGroupTo.add(jRadioButtonToRomer);

		p1.add(jRadioButtonFromCelsium);
		p1.add(jRadioButtonFromKelvin);
		p1.add(jRadioButtonFromFahrenheit);
		p1.add(jRadioButtonFromRankine);
		p1.add(jRadioButtonFromDelisle);
		p1.add(jRadioButtonFromNewton);
		p1.add(jRadioButtonFromReamur);
		p1.add(jRadioButtonFromRomer);
		
		
		p2.add(jRadioButtonToCelsium);
		p2.add(jRadioButtonToKelvin);
		p2.add(jRadioButtonToFahrenheit);
		p2.add(jRadioButtonToRankine);
		p2.add(jRadioButtonToDelisle);
		p2.add(jRadioButtonToNewton);
		p2.add(jRadioButtonToReamur);
		p2.add(jRadioButtonToRomer);
		
		jFrom.setText(conv.getFrom().getName());
		jTo.setText(conv.getTo().getName());
		
		cp.add(p1, BorderLayout.WEST);
		cp.add(p2, BorderLayout.EAST);
		LOGINFRAME.info("Frame opened succes");
	}
}
