package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class NumbersSubPanel extends JLabel {
	private boolean active;
	private final String number;
	private Color activeColor = Color.RED;
	private Color unactiveColor = new Color(0,178,238);
	private Border border = BorderFactory.createRaisedBevelBorder();
	private Font font = new Font("Impact",Font.PLAIN,16);
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
		if (active) 
			this.setBackground(activeColor);
		else
			this.setBackground(unactiveColor);
	}

	public NumbersSubPanel(int corrNumber) {
		super(String.valueOf(corrNumber));
		this.setFont(this.font);
		this.setBorder(this.border);
		this.number = new Integer(corrNumber).toString();
		active = false;
		setHorizontalAlignment(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		setBackground(this.unactiveColor);
		setOpaque(true);
	}
}
