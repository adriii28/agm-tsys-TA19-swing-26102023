package Ej2;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEj2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfPelicula;
	private JComboBox<String> cbPelicula;
	private JLabel lblPeliculas;
	private JButton bntAddPeli;
	

	public vistaEj2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 250);
		setTitle("Peliculas");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(55, 56, 173, 20);
		contentPane.add(lblNewLabel);
		
		tfPelicula = new JTextField();
		tfPelicula.setBounds(65, 95, 150, 20);
		contentPane.add(tfPelicula);
		tfPelicula.setColumns(10);
		
		bntAddPeli = new JButton("Añadir");
		bntAddPeli.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bntAddPeli.addActionListener(al);
		bntAddPeli.setBounds(97, 130, 89, 30);
		contentPane.add(bntAddPeli);
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPeliculas.setBounds(353, 56, 61, 20);
		contentPane.add(lblPeliculas);
		
		cbPelicula = new JComboBox<>();
		cbPelicula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbPelicula.setBounds(300, 95, 150, 22);
		contentPane.add(cbPelicula);
		setLocationRelativeTo(null);

	}
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String peli = tfPelicula.getText();
			if (!peli.isEmpty()) {
				cbPelicula.addItem(peli);
				tfPelicula.setText("");;
			} else {
				JOptionPane.showMessageDialog(null, "Introduce una pelicula valida!!");
			}
		}
	};
}
