package com.epam.Code1;

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class interest  extends Applet implements ActionListener{

	private static final long serialVersionUID = 1L;
	JButton B1,B2;
	JTextField T1,T2,T3,T5,T6;
	JLabel L1,L2,L3;
	JPanel p;
	public void init()
	{
	// TODO start asynchronous download of heavy resources

	L1=new JLabel("Principle ");
	L2=new JLabel("Time period");
	L3=new JLabel("Rate of interest");
	B1=new JButton("SI");
	B2=new JButton("CI");

	T1=new JTextField();
	T2=new JTextField();
	T3=new JTextField();
	T5=new JTextField();
	T6=new JTextField();
	this.setLayout(new GridLayout(5,2));
	this.add(L1);
	this.add(T1);
	this.add(L1);
	this.add(T2);
	this.add(L3);
	this.add(T3);
	this.add(B1);
	this.add(T5);
	this.add(B2);
	this.add(T6);
	B1.addActionListener(this);
	B2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
	double principleamount,timeperiod,rateofinterest,simpleinterest,compoundinterest;
	principleamount=Double.parseDouble(T1.getText());
	timeperiod=Double.parseDouble(T2.getText());
	rateofinterest=Double.parseDouble(T3.getText());

	if (ae.getSource()==B1)
	{
	simpleinterest=(principleamount*timeperiod*rateofinterest)/100.0;
	T5.setText(String.valueOf(simpleinterest));
	}
	else if(ae.getSource()==B2)
	{
	compoundinterest=(principleamount*(Math.pow((1+(rateofinterest/100.0)),timeperiod)));
	T6.setText(String.valueOf(compoundinterest));
	}
	}
}
