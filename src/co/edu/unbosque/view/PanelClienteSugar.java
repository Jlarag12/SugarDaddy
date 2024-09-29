package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelClienteSugar extends JPanel
{

	private JPanel panel1S,panel2S;
	private JLabel lblIngreParejaS, lblActuaParejaS, lblListaParejasS;
	private JTextArea txtListaParejasS;
	private JButton btnIngreParejaS, btnActuaParejaS;
	
	public PanelClienteSugar()
	{
		inicializarPanel1();
		inicializarPanel2();
		
		setVisible(true);
	}
	
	public void inicializarPanel1()
	{
		panel1S  = new JPanel();
		panel1S.setLayout(new GridLayout(2, 2));
		setBackground(Color.green);
		
		
		lblIngreParejaS = new JLabel("Agregar pareja: ");
		lblIngreParejaS.setOpaque(true);
		lblIngreParejaS.setBackground(Color.green);
		add(lblIngreParejaS);
		
		btnIngreParejaS = new  JButton("Crea");
		add(btnIngreParejaS);
		
		lblActuaParejaS = new JLabel("Actualizar el cupo de una pareja: ");
		lblActuaParejaS.setOpaque(true);
		lblIngreParejaS.setBackground(Color.green);
		add(lblActuaParejaS);
		
		btnActuaParejaS = new JButton("Actualiza");
		add(btnActuaParejaS);
	}
	
	public void inicializarPanel2()
	{
		panel2S = new JPanel(new BorderLayout());
		setBackground(Color.green);
		
		txtListaParejasS = new JTextArea();
		txtListaParejasS.setEditable(false);
	}
	
}
