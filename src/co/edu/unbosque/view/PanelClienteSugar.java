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

	private JPanel panel1S;
	private JPanel panel2S;
	private JLabel lblIngreParejaS;
	private JLabel lblActuaParejaS;
	private JLabel lblListaParejasS;
	private JTextArea txtListaParejasS;
	private JButton btnIngreParejaS;
	private JButton btnActuaParejaS;
	private JButton btnVolverS;
	
	public PanelClienteSugar()
	{
		setLayout(new GridLayout(2,1));
		setBackground(Color.white);
		setBounds(30, 60, 500, 470);
		
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
		panel2S.setLayout(new GridLayout(3,1));
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
        
        btnVolverS = new JButton("Volver");
        btnVolverS.setOpaque(true);
        btnVolverS.setBackground(Color.LIGHT_GRAY);
        panel2S.add(btnVolverS);
        

	}

	public JPanel getPanel1S() {
		return panel1S;
	}

	public void setPanel1S(JPanel panel1s) {
		panel1S = panel1s;
	}

	public JPanel getPanel2S() {
		return panel2S;
	}

	public void setPanel2S(JPanel panel2s) {
		panel2S = panel2s;
	}

	public JLabel getLblIngreParejaS() {
		return lblIngreParejaS;
	}

	public void setLblIngreParejaS(JLabel lblIngreParejaS) {
		this.lblIngreParejaS = lblIngreParejaS;
	}

	public JLabel getLblActuaParejaS() {
		return lblActuaParejaS;
	}

	public void setLblActuaParejaS(JLabel lblActuaParejaS) {
		this.lblActuaParejaS = lblActuaParejaS;
	}

	public JLabel getLblListaParejasS() {
		return lblListaParejasS;
	}

	public void setLblListaParejasS(JLabel lblListaParejasS) {
		this.lblListaParejasS = lblListaParejasS;
	}

	public JTextArea getTxtListaParejasS() {
		return txtListaParejasS;
	}

	public void setTxtListaParejasS(JTextArea txtListaParejasS) {
		this.txtListaParejasS = txtListaParejasS;
	}

	public JButton getBtnIngreParejaS() {
		return btnIngreParejaS;
	}

	public void setBtnIngreParejaS(JButton btnIngreParejaS) {
		this.btnIngreParejaS = btnIngreParejaS;
	}

	public JButton getBtnActuaParejaS() {
		return btnActuaParejaS;
	}

	public void setBtnActuaParejaS(JButton btnActuaParejaS) {
		this.btnActuaParejaS = btnActuaParejaS;
	}

	public JButton getBtnVolverS() {
		return btnVolverS;
	}

	public void setBtnVolverS(JButton btnVolverS) {
		this.btnVolverS = btnVolverS;
	}
	
	
}
