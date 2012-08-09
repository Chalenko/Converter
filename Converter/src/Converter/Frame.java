package Converter;

import java.awt.*;
import javax.swing.*;

public class Frame {
	public static void Create() {
		JFrame jf = new JFrame("Converter");
		jf.setBounds(312, 234, 400, 300);
		jf.setLayout(new FlowLayout());
		Container cp = jf.getContentPane();

		Panel p1 = new Panel();
		Panel p2 = new Panel();

		p1.setLayout(new GridLayout(3, 1));
		p2.setLayout(new GridLayout(3, 1));

		JRadioButton jRadioButtonFromCelsium = new JRadioButton("Celsium",
				false);
		JRadioButton jRadioButtonFromKelvin = new JRadioButton("Kelvin", false);
		JRadioButton jRadioButtonFromFahrenheit = new JRadioButton(
				"Fahrenheit", false);

		JRadioButton jRadioButtonToCelsium = new JRadioButton("Celsium", false);
		JRadioButton jRadioButtonToKelvin = new JRadioButton("Kelvin", false);
		JRadioButton jRadioButtonToFahrenheit = new JRadioButton("Fahrenheit",
				false);

		ButtonGroup buttonGroupFrom = new ButtonGroup();
		ButtonGroup buttonGroupTo = new ButtonGroup();

		buttonGroupFrom.add(jRadioButtonFromCelsium);
		buttonGroupFrom.add(jRadioButtonFromKelvin);
		buttonGroupFrom.add(jRadioButtonFromFahrenheit);
		buttonGroupTo.add(jRadioButtonToCelsium);
		buttonGroupTo.add(jRadioButtonToKelvin);
		buttonGroupTo.add(jRadioButtonToFahrenheit);

		p1.add(jRadioButtonFromCelsium);
		p1.add(jRadioButtonFromKelvin);
		p1.add(jRadioButtonFromFahrenheit);
		p2.add(jRadioButtonToCelsium);
		p2.add(jRadioButtonToKelvin);
		p2.add(jRadioButtonToFahrenheit);

		jf.setLayout(new BorderLayout());
		cp.add(p1, BorderLayout.WEST);
		cp.add(p2, BorderLayout.EAST);
		jf.setVisible(true);
	}
}
