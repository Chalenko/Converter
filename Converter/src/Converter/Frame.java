package Converter;

import java.awt.*;
import javax.swing.*;

public class Frame {
	public static void Create(){
		JFrame jf = new JFrame("Converter");
		jf.setBounds(312, 234, 400, 300);
		jf.setLayout(new FlowLayout());
		Container cp = jf.getContentPane();
		JRadioButton jRadioButtonFromCelsium = new JRadioButton("Celsium",false);
		JRadioButton jRadioButtonFromKelvin = new JRadioButton("Kelvin",false);
		JRadioButton jRadioButtonToCelsium = new JRadioButton("Celsium",false);
		JRadioButton jRadioButtonToKelvin = new JRadioButton("Kelvin",false);
		
		ButtonGroup buttonGroupFrom = new ButtonGroup();
		ButtonGroup buttonGroupTo = new ButtonGroup();
		
		buttonGroupFrom.add(jRadioButtonFromCelsium); buttonGroupFrom.add(jRadioButtonFromKelvin);
		buttonGroupTo.add(jRadioButtonToCelsium); buttonGroupTo.add(jRadioButtonToKelvin);
		
		cp.add(jRadioButtonFromCelsium); cp.add(jRadioButtonFromKelvin); cp.add(jRadioButtonToCelsium); cp.add(jRadioButtonToKelvin);
		jf.setVisible(true);
	}
}

