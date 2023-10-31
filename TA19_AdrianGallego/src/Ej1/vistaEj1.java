package Ej1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEj1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSaludar;
	private JButton btnSaludar;
	private JLabel lblNewLabel;


	public vistaEj1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Saludar");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(125, 69, 176, 20);
		contentPane.add(lblNewLabel);
		
		tfSaludar = new JTextField();
		tfSaludar.setBounds(112, 117, 200, 20);
		contentPane.add(tfSaludar);
		tfSaludar.setColumns(10);
		
		btnSaludar = new JButton("Saludar!");
		btnSaludar.addActionListener(al);
		btnSaludar.setBounds(167, 170, 89, 23);
		contentPane.add(btnSaludar);
		setLocationRelativeTo(null);


	}
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String nombre = tfSaludar.getText();
			if (!nombre.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Hola "+nombre);
			} else {
				JOptionPane.showMessageDialog(null, "Introduce un nombre!!");

			}
		}
	};
}
