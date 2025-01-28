package countingWord;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCount extends JFrame {

	private JPanel contentPane;
	private JTextField totalWordsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCount frame = new WordCount();
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
	public WordCount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel typeWordsLabel = new JLabel("Type Your Words");
		typeWordsLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		typeWordsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		typeWordsLabel.setBounds(10, 45, 162, 28);
		contentPane.add(typeWordsLabel);
		
		JTextArea wordsTextArea = new JTextArea();
		wordsTextArea.setFont(new Font("Verdana", Font.PLAIN, 13));
		wordsTextArea.setBounds(182, 40, 362, 123);
		contentPane.add(wordsTextArea);
		
		JButton countWordsBtn = new JButton("Count Your Words");
		countWordsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sentence = wordsTextArea.getText();
				int i = 0, words = 1;
				for(i = 0; i < sentence.length(); i++) {
					if(sentence.charAt(i) == ' ') {
						words++;
					}
					totalWordsTextField.setText(" " + words);
				}
			}
		});
		countWordsBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		countWordsBtn.setBounds(263, 173, 214, 37);
		contentPane.add(countWordsBtn);
		
		JLabel totalWordsLabel = new JLabel("Total Words");
		totalWordsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalWordsLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		totalWordsLabel.setBounds(27, 227, 128, 28);
		contentPane.add(totalWordsLabel);
		
		totalWordsTextField = new JTextField();
		totalWordsTextField.setFont(new Font("Verdana", Font.BOLD, 13));
		totalWordsTextField.setBounds(183, 226, 118, 37);
		contentPane.add(totalWordsTextField);
		totalWordsTextField.setColumns(10);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordsTextArea.setText("");
				totalWordsTextField.setText(" ");
				
			}
		});
		clearBtn.setFont(new Font("Verdana", Font.BOLD, 14));
		clearBtn.setBounds(182, 280, 85, 44);
		contentPane.add(clearBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Verdana", Font.BOLD, 14));
		exitBtn.setBounds(421, 280, 85, 44);
		contentPane.add(exitBtn);
		
		JLabel titleLabel = new JLabel("Word Count Tool");
		titleLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(263, 10, 188, 21);
		contentPane.add(titleLabel);
	}
}
