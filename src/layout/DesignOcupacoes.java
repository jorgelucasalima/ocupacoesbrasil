package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DesignOcupacoes extends JFrame {

	private JPanel contentPane;
	private JTable tableOcupantes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignOcupacoes frame = new DesignOcupacoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DesignOcupacoes() {
		setTitle("Ocupa\u00E7\u00F5es Brasil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 985, 504);
		contentPane.add(tabbedPane);
		
		JPanel panelOcupante = new JPanel();
		panelOcupante.setToolTipText("");
		tabbedPane.addTab("Ocupantes", null, panelOcupante, null);
		panelOcupante.setLayout(null);
		
		
		// botão incluir ocupante
		
		JButton btnIncluir_Ocupante = new JButton("Incluir");
		btnIncluir_Ocupante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				incluirOcupante();
			}

			private void incluirOcupante() {
				JOptionPane.showInputDialog("teste");
				
			}
		});
		btnIncluir_Ocupante.setBounds(775, 11, 61, 23);
		panelOcupante.add(btnIncluir_Ocupante);
		
		
		
		JButton btnEditar_Ocupante = new JButton("Editar");
		btnEditar_Ocupante.setBounds(841, 11, 61, 23);
		panelOcupante.add(btnEditar_Ocupante);
		
		JButton btnExcluir_Ocupante = new JButton("Excluir");
		btnExcluir_Ocupante.setBounds(907, 11, 63, 23);
		panelOcupante.add(btnExcluir_Ocupante);
		
		tableOcupantes = new JTable();
		tableOcupantes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CPF", "Nome", "Ocupa\u00E7\u00E3o", "Data Nascimento", "CTPS Assinada", "Chefe Fam\u00EDlia", "Fam\u00EDlia", "Profiss\u00E3o", "Forma\u00E7\u00E3o", "Genero"
			}
		));
		tableOcupantes.getColumnModel().getColumn(4).setPreferredWidth(92);
		tableOcupantes.setBackground(Color.LIGHT_GRAY);
		tableOcupantes.setBounds(968, 459, -960, -397);
		panelOcupante.add(tableOcupantes);
		
		JPanel panelFamilia = new JPanel();
		tabbedPane.addTab("Fam\u00EDlia", null, panelFamilia, null);
		panelFamilia.setLayout(null);
		
		JButton btnIncluir_Familia = new JButton("Incluir");
		btnIncluir_Familia.setBounds(775, 11, 61, 23);
		panelFamilia.add(btnIncluir_Familia);
		
		JButton btnEditar_Familia = new JButton("Editar");
		btnEditar_Familia.setBounds(841, 11, 61, 23);
		panelFamilia.add(btnEditar_Familia);
		
		JButton btnExcluir_Familia = new JButton("Excluir");
		btnExcluir_Familia.setBounds(907, 11, 63, 23);
		panelFamilia.add(btnExcluir_Familia);
		
		JPanel panelOcupacoes = new JPanel();
		tabbedPane.addTab("Ocupa\u00E7\u00F5es", null, panelOcupacoes, null);
		panelOcupacoes.setLayout(null);
		
		JButton btnIncluir_Ocupacoes = new JButton("Incluir");
		btnIncluir_Ocupacoes.setBounds(775, 11, 61, 23);
		panelOcupacoes.add(btnIncluir_Ocupacoes);
		
		JButton btnEditar_Ocupacoes = new JButton("Editar");
		btnEditar_Ocupacoes.setBounds(841, 11, 61, 23);
		panelOcupacoes.add(btnEditar_Ocupacoes);
		
		JButton btnExcluir_Ocupacoes = new JButton("Excluir");
		btnExcluir_Ocupacoes.setBounds(907, 11, 63, 23);
		panelOcupacoes.add(btnExcluir_Ocupacoes);
		
		JPanel panelRelatorio = new JPanel();
		tabbedPane.addTab("Relat\u00F3rios", null, panelRelatorio, null);
		panelRelatorio.setLayout(null);
	}
}
