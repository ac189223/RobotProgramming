package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class View {

	private JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel panel01;
	private JPanel panel02;
	private JPanel panel03;
	private JPanel panel04;

	private JLabel lblLogo01;
	private JLabel lblTitle;
	private JLabel lblLogo02;
	private JLabel lblSetSize;
	private JLabel lblSetWidth;
	private JLabel lblSetHeight;
	private JLabel lblSetPosition;
	private JLabel lblSetPositionX;
	private JLabel lblSetPositionY;
	private JLabel lblSetDirection;
	private JLabel lblSetType;
	private JLabel lblSetProgram;
	private JLabel lblRoomToDie;
	private JLabel lblRoomWithWalls;
	private JLabel lblRoomGoesRound;
	private JLabel lblRoomOfMagic;
	private JLabel lblLogo03;
	private JLabel lblResultDesc01;
	private JLabel lblResultDesc02;
	private JLabel lblResultDesc03;
	private JLabel lblResultNumber01;
	private JLabel lblResultStep01;
	private JLabel lblResultResult01;
	private JLabel lblResultNumber02;
	private JLabel lblResultStep02;
	private JLabel lblResultResult02;
	private JLabel lblResultNumber03;
	private JLabel lblResultStep03;
	private JLabel lblResultResult03;
	private JTextArea txtarDescr01;
	private JTextArea txtarResultNumber01;
	private JTextArea txtarResultStep01;
	private JTextArea txtarResultResult01;
	private JTextArea txtarResultLine01;
	private JTextArea txtarResultNumber02;
	private JTextArea txtarResultStep02;
	private JTextArea txtarResultResult02;
	private JTextArea txtarResultLine02;
	private JTextArea txtarResultNumber03;
	private JTextArea txtarResultStep03;
	private JTextArea txtarResultResult03;
	private JComboBox cmbSetWidth;
	private JComboBox cmbSetHeight;
	private JComboBox cmbSetPositionX;
	private JComboBox cmbSetPositionY;
	private JComboBox cmbSetDirection;
	private JTextField txtSetProgram;
	private JRadioButton rdbtnRoomToDie;
	private JRadioButton rdbtnRoomWithWalls;
	private JRadioButton rdbtnRoomGoesRound;
	private JRadioButton rdbtnRoomOfMagic;
	private final ButtonGroup buttonGroupRooms = new ButtonGroup();
	private JButton btnLeft;
	private JButton btnForward;
	private JButton btnRight;

	private Controller controller;

	/**
	 * Getters for this class
	 */
	public JFrame getFrame() { return frame; }
	public JTabbedPane getTabbedPane() { return tabbedPane; }
	public JPanel getPanel01() { return panel01; }
	public JPanel getPanel02() { return panel02; }
	public JPanel getPanel03() { return panel03; }
	public JPanel getPanel04() { return panel04; }
	public JLabel getLblLogo01() { return lblLogo01; }
	public JLabel getLblTitle() { return lblTitle; }
	public JLabel getLblLogo02() { return lblLogo02; }
	public JLabel getLblSetSize() { return lblSetSize; }
	public JLabel getLblSetWidth() { return lblSetWidth; }
	public JLabel getLblSetHeight() { return lblSetHeight; }
	public JLabel getLblSetPosition() { return lblSetPosition; }
	public JLabel getLblSetPositionX() { return lblSetPositionX; }
	public JLabel getLblSetPositionY() { return lblSetPositionY; }
	public JLabel getLblSetDirection() { return lblSetDirection; }
	public JLabel getLblSetType() { return lblSetType; }
	public JLabel getLblSetProgram() { return lblSetProgram; }
	public JLabel getLblRoomToDie() { return lblRoomToDie; }
	public JLabel getLblRoomWithWalls() { return lblRoomWithWalls; }
	public JLabel getLblRoomGoesRound() { return lblRoomGoesRound; }
	public JLabel getLblRoomOfMagic() { return lblRoomOfMagic; }
	public JLabel getLblLogo03() { return lblLogo03; }
	public JLabel getLblResultDesc01() { return lblResultDesc01; }
	public JLabel getLblResultDesc02() { return lblResultDesc02; }
	public JLabel getLblResultDesc03() { return lblResultDesc03; }
	public JLabel getLblResultNumber01() { return lblResultNumber01; }
	public JLabel getLblResultStep01() { return lblResultStep01; }
	public JLabel getLblResultResult01() { return lblResultResult01; }
	public JLabel getLblResultNumber02() { return lblResultNumber02; }
	public JLabel getLblResultStep02() { return lblResultStep02; }
	public JLabel getLblResultResult02() { return lblResultResult02; }
	public JLabel getLblResultNumber03() { return lblResultNumber03; }
	public JLabel getLblResultStep03() { return lblResultStep03; }
	public JLabel getLblResultResult03() { return lblResultResult03; }
	public JTextArea getTxtarDescr01() { return txtarDescr01; }
	public JTextArea getTxtarResultNumber01() { return txtarResultNumber01; }
	public JTextArea getTxtarResultStep01() { return txtarResultStep01; }
	public JTextArea getTxtarResultResult01() { return txtarResultResult01; }
	public JTextArea getTxtarResultLine01() { return txtarResultLine01; }
	public JTextArea getTxtarResultNumber02() { return txtarResultNumber02; }
	public JTextArea getTxtarResultStep02() { return txtarResultStep02; }
	public JTextArea getTxtarResultResult02() { return txtarResultResult02; }
	public JTextArea getTxtarResultLine02() { return txtarResultLine02; }
	public JTextArea getTxtarResultNumber03() { return txtarResultNumber03; }
	public JTextArea getTxtarResultStep03() { return txtarResultStep03; }
	public JTextArea getTxtarResultResult03() { return txtarResultResult03; }
	public JComboBox getCmbSetWidth() { return cmbSetWidth; }
	public JComboBox getCmbSetHeight() { return cmbSetHeight; }
	public JComboBox getCmbSetPositionX() { return cmbSetPositionX; }
	public JComboBox getCmbSetPositionY() { return cmbSetPositionY; }
	public JComboBox getCmbSetDirection() { return cmbSetDirection; }
	public JTextField getTxtSetProgram() { return txtSetProgram; }
	public JRadioButton getRdbtnRoomToDie() { return rdbtnRoomToDie; }
	public JRadioButton getRdbtnRoomWithWalls() { return rdbtnRoomWithWalls; }
	public JRadioButton getRdbtnRoomGoesRound() { return rdbtnRoomGoesRound; }
	public JRadioButton getRdbtnRoomOfMagic() { return rdbtnRoomOfMagic; }
	public ButtonGroup getButtonGroupRooms() { return buttonGroupRooms; }
	public JButton getBtnLeft() { return btnLeft; }
	public JButton getBtnForward() { return btnForward; }
	public JButton getBtnRight() { return btnRight; }
	public Controller getController() { return controller; }

	/**
	 * Setters for this class
	 */
	public void setFrame(JFrame frame) { this.frame = frame; }
	public void setTabbedPane(JTabbedPane tabbedPane) { this.tabbedPane = tabbedPane; }
	public void setPanel01(JPanel panel01) { this.panel01 = panel01; }
	public void setPanel02(JPanel panel02) { this.panel02 = panel02; }
	public void setPanel03(JPanel panel03) { this.panel03 = panel03; }
	public void setPanel04(JPanel panel04) { this.panel04 = panel04; }
	public void setLblLogo01(JLabel lblLogo01) { this.lblLogo01 = lblLogo01; }
	public void setLblTitle(JLabel lblTitle) { this.lblTitle = lblTitle; }
	public void setLblLogo02(JLabel lblLogo02) { this.lblLogo02 = lblLogo02; }
	public void setLblSetSize(JLabel lblSetSize) { this.lblSetSize = lblSetSize; }
	public void setLblSetWidth(JLabel lblSetWidth) { this.lblSetWidth = lblSetWidth; }
	public void setLblSetHeight(JLabel lblSetHeight) { this.lblSetHeight = lblSetHeight; }
	public void setLblSetPosition(JLabel lblSetPosition) { this.lblSetPosition = lblSetPosition; }
	public void setLblSetPositionX(JLabel lblSetPositionX) { this.lblSetPositionX = lblSetPositionX; }
	public void setLblSetPositionY(JLabel lblSetPositionY) { this.lblSetPositionY = lblSetPositionY; }
	public void setLblSetDirection(JLabel lblSetDirection) { this.lblSetDirection = lblSetDirection; }
	public void setLblSetType(JLabel lblSetType) { this.lblSetType = lblSetType; }
	public void setLblSetProgram(JLabel lblSetProgram) { this.lblSetProgram = lblSetProgram; }
	public void setLblRoomToDie(JLabel lblRoomToDie) { this.lblRoomToDie = lblRoomToDie; }
	public void setLblRoomWithWalls(JLabel lblRoomWithWalls) { this.lblRoomWithWalls = lblRoomWithWalls; }
	public void setLblRoomGoesRound(JLabel lblRoomGoesRound) { this.lblRoomGoesRound = lblRoomGoesRound; }
	public void setLblRoomOfMagic(JLabel lblRoomOfMagic) { this.lblRoomOfMagic = lblRoomOfMagic; }
	public void setLblLogo03(JLabel lblLogo03) { this.lblLogo03 = lblLogo03; }
	public void setLblResultDesc01(JLabel lblResultDesc01) { this.lblResultDesc01 = lblResultDesc01; }
	public void setLblResultDesc02(JLabel lblResultDesc02) { this.lblResultDesc02 = lblResultDesc02; }
	public void setLblResultDesc03(JLabel lblResultDesc03) { this.lblResultDesc03 = lblResultDesc03; }
	public void setLblResultNumber01(JLabel lblResultNumber01) { this.lblResultNumber01 = lblResultNumber01; }
	public void setLblResultStep01(JLabel lblResultStep01) { this.lblResultStep01 = lblResultStep01; }
	public void setLblResultResult01(JLabel lblResultResult01) { this.lblResultResult01 = lblResultResult01; }
	public void setLblResultNumber02(JLabel lblResultNumber02) { this.lblResultNumber02 = lblResultNumber02; }
	public void setLblResultStep02(JLabel lblResultStep02) { this.lblResultStep02 = lblResultStep02; }
	public void setLblResultResult02(JLabel lblResultResult02) { this.lblResultResult02 = lblResultResult02; }
	public void setLblResultNumber03(JLabel lblResultNumber03) { this.lblResultNumber03 = lblResultNumber03; }
	public void setLblResultStep03(JLabel lblResultStep03) { this.lblResultStep03 = lblResultStep03; }
	public void setLblResultResult03(JLabel lblResultResult03) { this.lblResultResult03 = lblResultResult03; }
	public void setTxtarDescr01(JTextArea txtarDescr01) { this.txtarDescr01 = txtarDescr01; }
	public void setTxtarResultNumber01(JTextArea txtarResultNumber01) { this.txtarResultNumber01 = txtarResultNumber01; }
	public void setTxtarResultStep01(JTextArea txtarResultStep01) { this.txtarResultStep01 = txtarResultStep01; }
	public void setTxtarResultResult01(JTextArea txtarResultResult01) { this.txtarResultResult01 = txtarResultResult01; }
	public void setTxtarResultLine01(JTextArea txtarResultLine01) { this.txtarResultLine01 = txtarResultLine01; }
	public void setTxtarResultNumber02(JTextArea txtarResultNumber02) { this.txtarResultNumber02 = txtarResultNumber02; }
	public void setTxtarResultStep02(JTextArea txtarResultStep02) { this.txtarResultStep02 = txtarResultStep02; }
	public void setTxtarResultResult02(JTextArea txtarResultResult02) { this.txtarResultResult02 = txtarResultResult02; }
	public void setTxtarResultLine02(JTextArea txtarResultLine02) { this.txtarResultLine02 = txtarResultLine02; }
	public void setTxtarResultNumber03(JTextArea txtarResultNumber03) { this.txtarResultNumber03 = txtarResultNumber03; }
	public void setTxtarResultStep03(JTextArea txtarResultStep03) { this.txtarResultStep03 = txtarResultStep03; }
	public void setTxtarResultResult03(JTextArea txtarResultResult03) { this.txtarResultResult03 = txtarResultResult03; }
	public void setCmbSetWidth(JComboBox cmbSetWidth) { this.cmbSetWidth = cmbSetWidth; }
	public void setCmbSetHeight(JComboBox cmbSetHeight) { this.cmbSetHeight = cmbSetHeight; }
	public void setCmbSetPositionX(JComboBox cmbSetPositionX) { this.cmbSetPositionX = cmbSetPositionX; }
	public void setCmbSetPositionY(JComboBox cmbSetPositionY) { this.cmbSetPositionY = cmbSetPositionY; }
	public void setCmbSetDirection(JComboBox cmbSetDirection) { this.cmbSetDirection = cmbSetDirection; }
	public void setTxtSetProgram(JTextField txtSetProgram) { this.txtSetProgram = txtSetProgram; }
	public void setRdbtnRoomToDie(JRadioButton rdbtnRoomToDie) { this.rdbtnRoomToDie = rdbtnRoomToDie; }
	public void setRdbtnRoomWithWalls(JRadioButton rdbtnRoomWithWalls) { this.rdbtnRoomWithWalls = rdbtnRoomWithWalls; }
	public void setRdbtnRoomGoesRound(JRadioButton rdbtnRoomGoesRound) { this.rdbtnRoomGoesRound = rdbtnRoomGoesRound; }
	public void setRdbtnRoomOfMagic(JRadioButton rdbtnRoomOfMagic) { this.rdbtnRoomOfMagic = rdbtnRoomOfMagic; }
	public void setBtnLeft(JButton btnLeft) { this.btnLeft = btnLeft; }
	public void setBtnForward(JButton btnForward) { this.btnForward = btnForward; }
	public void setBtnRight(JButton btnRight) { this.btnRight = btnRight; }
	public void setController(Controller controller) { this.controller = controller; }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		frame.setBackground(new Color(0, 0, 0));
		frame.setTitle("   Robot Programming");
		frame.setBounds(100, 50, 600, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		controller = new Controller(frame, this);

		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setBackground(new Color(0, 0, 0));
		tabbedPane.setBounds(5, 5, 575, 635);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
				
		panel01 = new JPanel();
		panel01.setBorder(new LineBorder(new Color(255,255,255), 1, false));
		panel01.setBackground(new Color(0,0,0));
		tabbedPane.addTab("Intro", null, panel01, null);
		tabbedPane.setForegroundAt(0, new Color(90,90,90));
		tabbedPane.setBackgroundAt(0, new Color(0,0,0));
		panel01.setLayout(null);

		panel02 = new JPanel();
		panel02.setBorder(new LineBorder(new Color(255,255,255), 1, false));
		panel02.setBackground(new Color(0,0,0));
		tabbedPane.addTab("Set & Run", null, panel02, null);
		tabbedPane.setForegroundAt(1, new Color(90,90,90));
		tabbedPane.setBackgroundAt(1, new Color(0,0,0));
		panel02.setLayout(null);

		panel03 = new JPanel();
		panel03.setBorder(new LineBorder(new Color(255,255,255), 1, false));
		panel03.setBackground(new Color(0,0,0));
		tabbedPane.addTab("Results", null, panel03, null);
		tabbedPane.setForegroundAt(2, new Color(90,90,90));
		tabbedPane.setBackgroundAt(2, new Color(0,0,0));
		panel03.setLayout(null);

// panel01 ==================    Intro    =========================== panel01

		lblLogo01 = new JLabel("R");
		lblLogo01.setEnabled(false);
		lblLogo01.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogo01.setFont(new Font("Algerian", Font.PLAIN, 110));
		lblLogo01.setBounds(420, 20, 120, 120);
		panel01.add(lblLogo01);

		lblTitle = new JLabel("Robot programming");
		lblTitle.setEnabled(false);
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblTitle.setBounds(20, 20, 500, 27);
		panel01.add(lblTitle);

		txtarDescr01 = new JTextArea("");
		txtarDescr01.setEnabled(false);
		txtarDescr01.setBackground(new Color(0,0,0));
		txtarDescr01.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		txtarDescr01.setBounds(20, 100, 450, 500);
		panel01.add(txtarDescr01);

// panel02 ==================    Set & Run    =========================== panel02

		lblLogo02 = new JLabel("R");
		lblLogo02.setEnabled(false);
		lblLogo02.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogo02.setFont(new Font("Algerian", Font.PLAIN, 110));
		lblLogo02.setBounds(420, 20, 120, 120);
		panel02.add(lblLogo02);

		lblSetSize = new JLabel("Set the size of the room:");
		lblSetSize.setEnabled(false);
		lblSetSize.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetSize.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblSetSize.setBounds(20, 20, 500, 27);
		panel02.add(lblSetSize);

		lblSetWidth = new JLabel("width");
		lblSetWidth.setEnabled(false);
		lblSetWidth.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetWidth.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSetWidth.setBounds(70, 50, 50, 22);
		panel02.add(lblSetWidth);

		cmbSetWidth = new JComboBox(controller.listWidthHeight());
		cmbSetWidth.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.setListPositionX();
			}
		});
		cmbSetWidth.setForeground(new Color(0,0,0));
		cmbSetWidth.setBounds(120, 50, 50, 20);
		cmbSetWidth.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		cmbSetWidth.setVisible(true);
		cmbSetWidth.setEnabled(true);
		panel02.add(cmbSetWidth);

		lblSetHeight = new JLabel("height");
		lblSetHeight.setEnabled(false);
		lblSetHeight.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetHeight.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSetHeight.setBounds(220, 50, 50, 22);
		panel02.add(lblSetHeight);

		cmbSetHeight = new JComboBox(controller.listWidthHeight());
		cmbSetHeight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.setListPositionY();
			}
		});
		cmbSetHeight.setForeground(new Color(0,0,0));
		cmbSetHeight.setBounds(270, 50, 50, 20);
		cmbSetHeight.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		cmbSetHeight.setVisible(true);
		cmbSetHeight.setEnabled(true);
		panel02.add(cmbSetHeight);


		lblSetPosition = new JLabel("Set starting position of the robot:");
		lblSetPosition.setEnabled(false);
		lblSetPosition.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPosition.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblSetPosition.setBounds(20, 120, 500, 27);
		panel02.add(lblSetPosition);

		lblSetPositionX = new JLabel("x");
		lblSetPositionX.setEnabled(false);
		lblSetPositionX.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPositionX.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSetPositionX.setBounds(70, 150, 50, 22);
		panel02.add(lblSetPositionX);

		cmbSetPositionX = new JComboBox(new String[]{"1"});
		cmbSetPositionX.setForeground(new Color(0,0,0));
		cmbSetPositionX.setBounds(120, 150, 50, 20);
		cmbSetPositionX.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		cmbSetPositionX.setVisible(true);
		cmbSetPositionX.setEnabled(true);
		panel02.add(cmbSetPositionX);

		lblSetPositionY = new JLabel("y");
		lblSetPositionY.setEnabled(false);
		lblSetPositionY.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPositionY.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSetPositionY.setBounds(220, 150, 50, 22);
		panel02.add(lblSetPositionY);

		cmbSetPositionY = new JComboBox(new String[]{"1"});
		cmbSetPositionY.setForeground(new Color(0,0,0));
		cmbSetPositionY.setBounds(270, 150, 50, 20);
		cmbSetPositionY.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		cmbSetPositionY.setVisible(true);
		cmbSetPositionY.setEnabled(true);
		panel02.add(cmbSetPositionY);

		lblSetDirection = new JLabel("direction");
		lblSetDirection.setEnabled(false);
		lblSetDirection.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetDirection.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSetDirection.setBounds(370, 150, 80, 22);
		panel02.add(lblSetDirection);

		cmbSetDirection = new JComboBox(controller.listDirections());
		cmbSetDirection.setForeground(new Color(0,0,0));
		cmbSetDirection.setBounds(450, 150, 50, 20);
		cmbSetDirection.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		cmbSetDirection.setVisible(true);
		cmbSetDirection.setEnabled(true);
		panel02.add(cmbSetDirection);


		lblSetType = new JLabel("Set the type of the room:");
		lblSetType.setEnabled(false);
		lblSetType.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetType.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblSetType.setBounds(20, 220, 500, 27);
		panel02.add(lblSetType);

		rdbtnRoomToDie = new JRadioButton();
		buttonGroupRooms.add(rdbtnRoomToDie);
		rdbtnRoomToDie.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		rdbtnRoomToDie.setBounds(70, 250, 20, 20);
		rdbtnRoomToDie.setBackground(new Color(0,0,0));
		panel02.add(rdbtnRoomToDie);
		rdbtnRoomToDie.setSelected(true);

		lblRoomToDie = new JLabel("the room to die in 3x");
		lblRoomToDie.setEnabled(false);
		lblRoomToDie.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomToDie.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblRoomToDie.setBounds(120, 250, 200, 22);
		panel02.add(lblRoomToDie);

		rdbtnRoomWithWalls = new JRadioButton();
		buttonGroupRooms.add(rdbtnRoomWithWalls);
		rdbtnRoomWithWalls.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		rdbtnRoomWithWalls.setBounds(320, 250, 20, 20);
		rdbtnRoomWithWalls.setBackground(new Color(0,0,0));
		panel02.add(rdbtnRoomWithWalls);

		lblRoomWithWalls = new JLabel("the room with walls");
		lblRoomWithWalls.setEnabled(false);
		lblRoomWithWalls.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomWithWalls.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblRoomWithWalls.setBounds(370, 250, 200, 22);
		panel02.add(lblRoomWithWalls);

		rdbtnRoomGoesRound = new JRadioButton();
		buttonGroupRooms.add(rdbtnRoomGoesRound);
		rdbtnRoomGoesRound.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		rdbtnRoomGoesRound.setBounds(70, 280, 20, 20);
		rdbtnRoomGoesRound.setBackground(new Color(0,0,0));
		panel02.add(rdbtnRoomGoesRound);

		lblRoomGoesRound = new JLabel("the room goes round");
		lblRoomGoesRound.setEnabled(false);
		lblRoomGoesRound.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomGoesRound.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblRoomGoesRound.setBounds(120, 280, 200, 22);
		panel02.add(lblRoomGoesRound);

		rdbtnRoomOfMagic = new JRadioButton();
		buttonGroupRooms.add(rdbtnRoomOfMagic);
		rdbtnRoomOfMagic.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		rdbtnRoomOfMagic.setBounds(320, 280, 20, 20);
		rdbtnRoomOfMagic.setBackground(new Color(0,0,0));
		panel02.add(rdbtnRoomOfMagic);

		lblRoomOfMagic = new JLabel("the room of magic");
		lblRoomOfMagic.setEnabled(false);
		lblRoomOfMagic.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomOfMagic.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblRoomOfMagic.setBounds(370, 280, 200, 22);
		panel02.add(lblRoomOfMagic);


		lblSetProgram = new JLabel("Type program for the robot:");
		lblSetProgram.setEnabled(false);
		lblSetProgram.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetProgram.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblSetProgram.setBounds(20, 350, 500, 27);
		panel02.add(lblSetProgram);

		btnLeft = new JButton("L(eft)");
		btnLeft.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.addToProgramL();
			}
		});
		btnLeft.setBounds(70, 380, 140, 25);
		btnLeft.setEnabled(true);
		panel02.add(btnLeft);

		btnForward = new JButton("F(orward)");
		btnForward.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnForward.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.addToProgramF();
			}
		});
		btnForward.setBounds(220, 380, 140, 25);
		btnForward.setEnabled(true);
		panel02.add(btnForward);

		btnRight = new JButton("R(ight)");
		btnRight.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.addToProgramR();
			}
		});
		btnRight.setBounds(370, 380, 140, 25);
		btnRight.setEnabled(true);
		panel02.add(btnRight);

		txtSetProgram = new JTextField();
		txtSetProgram.setHorizontalAlignment(SwingConstants.CENTER);
		txtSetProgram.setColumns(10);
		txtSetProgram.setForeground(new Color(0,0,0));
		txtSetProgram.setBounds(70, 420, 440, 25);
		txtSetProgram.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		txtSetProgram.setVisible(true);
		txtSetProgram.setEnabled(false);
		panel02.add(txtSetProgram);

		btnLeft = new JButton("Delete last");
		btnLeft.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.cleanOneFromProgram();
			}
		});
		btnLeft.setBounds(70, 460, 140, 25);
		btnLeft.setEnabled(true);
		panel02.add(btnLeft);

		btnRight = new JButton("Delete all");
		btnRight.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.cleanAllFromProgram();
			}
		});
		btnRight.setBounds(370, 460, 140, 25);
		btnRight.setEnabled(true);
		panel02.add(btnRight);

		lblSetProgram = new JLabel("Execute program when it is ready:");
		lblSetProgram.setEnabled(false);
		lblSetProgram.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetProgram.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblSetProgram.setBounds(20, 510, 500, 27);
		panel02.add(lblSetProgram);

		btnLeft = new JButton("Run");
		btnLeft.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.executeProgram();
			}
		});
		btnLeft.setBounds(70, 540, 440, 35);
		btnLeft.setEnabled(true);
		panel02.add(btnLeft);

// panel03 ==================    Results    =========================== panel03

		// logo
		lblLogo03 = new JLabel("R");
		lblLogo03.setEnabled(false);
		lblLogo03.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogo03.setFont(new Font("Algerian", Font.PLAIN, 110));
		lblLogo03.setBounds(420, 20, 120, 120);
		panel03.add(lblLogo03);

		// description
		lblResultDesc01 = new JLabel("");
		lblResultDesc01.setEnabled(false);
		lblResultDesc01.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultDesc01.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblResultDesc01.setBounds(20, 30, 350, 20);
		panel03.add(lblResultDesc01);

		lblResultDesc02 = new JLabel("");
		lblResultDesc02.setEnabled(false);
		lblResultDesc02.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultDesc02.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblResultDesc02.setBounds(20, 60, 350, 20);
		panel03.add(lblResultDesc02);

		lblResultDesc03 = new JLabel("");
		lblResultDesc03.setEnabled(false);
		lblResultDesc03.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultDesc03.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblResultDesc03.setBounds(20, 90, 350, 20);
		panel03.add(lblResultDesc03);

		// steps01
		lblResultNumber01 = new JLabel("No.");
		lblResultNumber01.setEnabled(false);
		lblResultNumber01.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultNumber01.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultNumber01.setBounds(20, 130, 40, 20);
		panel03.add(lblResultNumber01);

		txtarResultNumber01 = new JTextArea("");
		txtarResultNumber01.setEnabled(false);
		txtarResultNumber01.setBackground(new Color(0,0,0));
		txtarResultNumber01.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultNumber01.setBounds(20, 150, 40, 455);
		panel03.add(txtarResultNumber01);

		lblResultStep01 = new JLabel("Step");
		lblResultStep01.setEnabled(false);
		lblResultStep01.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultStep01.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultStep01.setBounds(60, 130, 60, 20);
		panel03.add(lblResultStep01);

		txtarResultStep01 = new JTextArea("");
		txtarResultStep01.setEnabled(false);
		txtarResultStep01.setBackground(new Color(0,0,0));
		txtarResultStep01.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultStep01.setBounds(60, 150, 60, 455);
		panel03.add(txtarResultStep01);

		lblResultResult01 = new JLabel("Result");
		lblResultResult01.setEnabled(false);
		lblResultResult01.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultResult01.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultResult01.setBounds(120, 130, 70, 20);
		panel03.add(lblResultResult01);

		txtarResultResult01 = new JTextArea("");
		txtarResultResult01.setEnabled(false);
		txtarResultResult01.setBackground(new Color(0,0,0));
		txtarResultResult01.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultResult01.setBounds(120, 150, 70, 455);
		panel03.add(txtarResultResult01);

		txtarResultLine01 = new JTextArea("");
		txtarResultLine01.setEnabled(false);
		txtarResultLine01.setBackground(new Color(0,0,0));
		txtarResultLine01.setBounds(192, 130, 1, 475);
		txtarResultLine01.setBorder(new LineBorder(new Color(255,255,255), 1, false));
		panel03.add(txtarResultLine01);

		// steps02
		lblResultNumber02 = new JLabel("No.");
		lblResultNumber02.setEnabled(false);
		lblResultNumber02.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultNumber02.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultNumber02.setBounds(200, 130, 40, 20);
		panel03.add(lblResultNumber02);

		txtarResultNumber02 = new JTextArea("");
		txtarResultNumber02.setEnabled(false);
		txtarResultNumber02.setBackground(new Color(0,0,0));
		txtarResultNumber02.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultNumber02.setBounds(200, 150, 40, 455);
		panel03.add(txtarResultNumber02);

		lblResultStep02 = new JLabel("Step");
		lblResultStep02.setEnabled(false);
		lblResultStep02.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultStep02.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultStep02.setBounds(240, 130, 60, 20);
		panel03.add(lblResultStep02);

		txtarResultStep02 = new JTextArea("");
		txtarResultStep02.setEnabled(false);
		txtarResultStep02.setBackground(new Color(0,0,0));
		txtarResultStep02.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultStep02.setBounds(240, 150, 60, 455);
		panel03.add(txtarResultStep02);

		lblResultResult02 = new JLabel("Result");
		lblResultResult02.setEnabled(false);
		lblResultResult02.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultResult02.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultResult02.setBounds(300, 130, 70, 20);
		panel03.add(lblResultResult02);

		txtarResultResult02 = new JTextArea("");
		txtarResultResult02.setEnabled(false);
		txtarResultResult02.setBackground(new Color(0,0,0));
		txtarResultResult02.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultResult02.setBounds(300, 150, 70, 455);
		panel03.add(txtarResultResult02);

		txtarResultLine02 = new JTextArea("");
		txtarResultLine02.setEnabled(false);
		txtarResultLine02.setBackground(new Color(0,0,0));
		txtarResultLine02.setBounds(372, 130, 1, 475);
		txtarResultLine02.setBorder(new LineBorder(new Color(255,255,255), 1, false));
		panel03.add(txtarResultLine02);

		// steps03
		lblResultNumber03 = new JLabel("No.");
		lblResultNumber03.setEnabled(false);
		lblResultNumber03.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultNumber03.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultNumber03.setBounds(380, 130, 40, 20);
		panel03.add(lblResultNumber03);

		txtarResultNumber03 = new JTextArea("");
		txtarResultNumber03.setEnabled(false);
		txtarResultNumber03.setBackground(new Color(0,0,0));
		txtarResultNumber03.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultNumber03.setBounds(380, 150, 40, 455);
		panel03.add(txtarResultNumber03);

		lblResultStep03 = new JLabel("Step");
		lblResultStep03.setEnabled(false);
		lblResultStep03.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultStep03.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultStep03.setBounds(420, 130, 60, 20);
		panel03.add(lblResultStep03);

		txtarResultStep03 = new JTextArea("");
		txtarResultStep03.setEnabled(false);
		txtarResultStep03.setBackground(new Color(0,0,0));
		txtarResultStep03.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultStep03.setBounds(420, 150, 60, 455);
		panel03.add(txtarResultStep03);

		lblResultResult03 = new JLabel("Result");
		lblResultResult03.setEnabled(false);
		lblResultResult03.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultResult03.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblResultResult03.setBounds(480, 130, 70, 20);
		panel03.add(lblResultResult03);

		txtarResultResult03 = new JTextArea("");
		txtarResultResult03.setEnabled(false);
		txtarResultResult03.setBackground(new Color(0,0,0));
		txtarResultResult03.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		txtarResultResult03.setBounds(480, 150, 70, 455);
		panel03.add(txtarResultResult03);

		controller.createDescriptionInView();
	}
}
