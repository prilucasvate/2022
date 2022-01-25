package tt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class vocsortwb {

	private JFrame frame;
	private JTextField t1;
	private JTextArea a1;
	private JScrollBar sb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vocsortwb window = new vocsortwb();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vocsortwb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				char[] a=new char[10000];
				@SuppressWarnings("resource")
				FileReader fr;
				try {
					fr = new FileReader("C:\\test\\sortvoc.txt");
					fr.read(a);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String q=a1.getText();
				String s = String.valueOf(a);
				a1.setText(s);
				//------------------------------
				
			}
		});
		frame.getContentPane().add(b1, BorderLayout.SOUTH);
		
		t1 = new JTextField();
		frame.getContentPane().add(t1, BorderLayout.WEST);
		t1.setColumns(10);
		
		a1 = new JTextArea();
		frame.getContentPane().add(a1, BorderLayout.CENTER);
		
		sb1 = new JScrollBar();
		frame.getContentPane().add(sb1, BorderLayout.EAST);
	}

}
