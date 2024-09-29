package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelClienteSugar extends JPanel
{

	private JPanel panel1S,panel2S, panelContenedorS;
	private JLabel lblIngreParejaS, lblActuaParejaS, lblListaParejasS;
	private JTextArea txtListaParejasS;
	private JButton btnIngreParejaS, btnActuaParejaS;
	
	public PanelClienteSugar()
	{
		setLayout(new GridLayout(2,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		
		inicializarPanel1();
		inicializarPanel2();
		
		add(panel1S);
		add(panel2S);
		
		setVisible(false);
		
	}
	
	public void inicializarPanel1()
	{
		panel1S  = new JPanel();
		panel1S.setLayout(new GridLayout(2, 2));
		panel1S.setBackground(Color.green);
		
		
		lblIngreParejaS = new JLabel("Agregar pareja: ");
		lblIngreParejaS.setOpaque(true);
		lblIngreParejaS.setBackground(Color.green);
		panel1S.add(lblIngreParejaS);
		
		btnIngreParejaS = new  JButton("Crea");
		panel1S.add(btnIngreParejaS);
		
		lblActuaParejaS = new JLabel("Actualizar el cupo de una pareja: ");
		lblActuaParejaS.setOpaque(true);
		lblActuaParejaS.setBackground(Color.green);
		panel1S.add(lblActuaParejaS);
		
		btnActuaParejaS = new JButton("Actualiza");
		panel1S.add(btnActuaParejaS);
		
	}
	
	public void inicializarPanel2()
	{
		panel2S = new JPanel();
		panel2S.setLayout(new GridLayout(2,1));
		panel2S.setBackground(Color.green);
		
		lblListaParejasS = new JLabel("Estas son tus parejas actuales");
		lblListaParejasS.setOpaque(true);
		lblListaParejasS.setBackground(Color.green);
		panel2S.add(lblListaParejasS);
		
		txtListaParejasS = new JTextArea();
		txtListaParejasS.setEditable(false);
		txtListaParejasS.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(txtListaParejasS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panel2S.add(scrollPane);
        

	}
	
	
	
}
