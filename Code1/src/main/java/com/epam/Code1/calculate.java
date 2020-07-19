package com.epam.Code1;

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculate extends Applet implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton a;
	JTextField tf1,tf2,tf3,tf4;
	JLabel l1,l2,l3;
	JPanel p;
	public void init()
	{
	// TODO start asynchronous download of heavy resources

	l1=new JLabel("material standard");
	l2=new JLabel("total area");
	l3=new JLabel("fully automated");
	a=new JButton("calculate cost");
	tf1=new JTextField();
	tf2=new JTextField();
	tf3=new JTextField();
	tf4=new JTextField();
	this.setLayout(new GridLayout(4,2));
	this.add(l1);
	this.add(tf1);
	this.add(l2);
	this.add(tf2);
	this.add(l3);
	this.add(tf3);
	this.add(a);
	this.add(tf4);
	a.addActionListener(this);


	}
	public void actionPerformed(ActionEvent ae)
	{

	String materialstandard;
	double totalarea,totalcost=0.0;
	int constructioncost;
	String automated;
	materialstandard=tf1.getText();
	totalarea=Double.parseDouble(tf2.getText());
	automated=tf3.getText().toLowerCase();
	if (ae.getSource()==a)
	{
	if(materialstandard.equals("standard")) {
	constructioncost=1200;
	totalcost=constructioncost*totalarea;
	}
	else if(materialstandard.equals("above standard")) {
	constructioncost=1500;
	totalcost=constructioncost*totalarea;
	}
	else if(materialstandard.equals("high standard")) {
	constructioncost=1800;
	totalcost=constructioncost*totalarea;
	}
	else if(materialstandard.equals("high standard") && (automated.equals("yes") || automated.equals("true"))) {
	constructioncost=2500;
	totalcost=constructioncost*totalarea;
	}
	tf4.setText(Double.toString(totalcost));
	}
}
}