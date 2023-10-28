package Ej3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEj3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ButtonGroup rb;
	private JRadioButton rbWindows, rbLinux, rbMac;
	private JCheckBox chckProgramacion,chckDisenoG ,chckAdministracion;
	private JSlider slider;

	
	public vistaEj3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 520);
		setTitle("Encuesta");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Encuesta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(30, 30, 83, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo");
		lblElijeUnSistema.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElijeUnSistema.setBounds(30, 61, 183, 20);
		contentPane.add(lblElijeUnSistema);
		
		JLabel lblElijeTuEspecialidad = new JLabel("Elije tu especialidad");
		lblElijeTuEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElijeTuEspecialidad.setBounds(30, 185, 183, 20);
		contentPane.add(lblElijeTuEspecialidad);
		
		rbWindows = new JRadioButton("Windows");
		rbWindows.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbWindows.setBounds(30, 93, 109, 23);
		contentPane.add(rbWindows);
		
		rbLinux = new JRadioButton("Linux");
		rbLinux.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbLinux.setBounds(30, 119, 109, 23);
		contentPane.add(rbLinux);
		
		rbMac = new JRadioButton("Mac");
		rbMac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbMac.setBounds(30, 145, 109, 23);
		contentPane.add(rbMac);
		
		rb = new ButtonGroup();
		rb.add(rbWindows);
		rb.add(rbLinux);
		rb.add(rbMac);

		chckProgramacion = new JCheckBox("Programacion");
		chckProgramacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckProgramacion.setBounds(30, 212, 109, 23);
		contentPane.add(chckProgramacion);
		
		chckDisenoG = new JCheckBox("Diseño Grafico");
		chckDisenoG.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckDisenoG.setBounds(30, 238, 97, 23);
		contentPane.add(chckDisenoG);
		
		chckAdministracion = new JCheckBox("Administracion");
		chckAdministracion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckAdministracion.setBounds(30, 264, 109, 23);
		contentPane.add(chckAdministracion);
		
		JLabel lblHorasDedicadas = new JLabel("Horas dedicadas");
		lblHorasDedicadas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHorasDedicadas.setBounds(30, 300, 183, 20);
		contentPane.add(lblHorasDedicadas);
		
		slider = new JSlider();
		slider.setFont(new Font("Tahoma", Font.PLAIN, 12));
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(1);
		slider.setMaximum(10);
		slider.setMajorTickSpacing(1);
		slider.setBounds(30, 335, 200, 40);
		contentPane.add(slider);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(al);
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEnviar.setBounds(159, 420, 109, 30);
		contentPane.add(btnEnviar);
		
		setLocationRelativeTo(null);

	}
	
	ActionListener al = new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {
			
			String so = rbSelecion();
			
			String especialidad = cbEspecialidad();

			int horas = slider.getValue();
			
			if (so!= null && especialidad!= null && horas!= 0) {
				JOptionPane.showMessageDialog(null, "Sistema operativo : "+so
						+"\nEspecialidad : "+especialidad
						+"\nHoras : "+ horas);
			} else {
				JOptionPane.showMessageDialog(null, "Rellena la encuesta");
			}
		}

		
	};
	
	private String cbEspecialidad() {
		
		String especialidad = "";
		if (chckProgramacion.isSelected()) {
			especialidad += "Programacion ";
		} 
		if (chckDisenoG.isSelected()) {
			especialidad += "Diseño Grafico ";
		} 
		if (chckAdministracion.isSelected()) {
			especialidad += "Administracion ";
		}
		
		return especialidad;
	}
	
	private String rbSelecion() {
		String selection = null;
		if (rbWindows.isSelected()) {
			selection = "Windows";
		} else if (rbLinux.isSelected()) {
			selection = "Linux";
		} else if (rbMac.isSelected()) {
			selection = "Mac";
		}			
		
		return selection;
	}
}
