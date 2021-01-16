package do_an;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RowFilter;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLayeredPane layeredPane;
	private JPanel panel_1;
	private JPanel panel_3;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JPanel panel_4;
	private JComboBox comboBox;
	private JPanel panel_5;
	private JButton btnDiemSaveAdd;
	private JPanel panel_8;
	private JComboBox comboBox_2;

	
	private JLayeredPane layeredPane_1;
	private JTextField tfDiemMaSVAdd;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_12;
	private JLabel label;
	private JTextField tfMaSinhVien;
	private JLayeredPane layeredPane_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_18;
	private JTextField tfTenSinhVien;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_3;
	private JRadioButton rdbtnNam;
	private JRadioButton rdbtnNu;
	private JLabel lblNewLabel_4;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private JLabel lblNewLabel_5;
	private JTextField tfDiaChi;
	private JLabel lblNewLabel_6;
	private JTextField tfDienThoai;
	private JButton btnSaveAdd;
	private JButton btnResetAdd;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JButton btnNewButton_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.pack();
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
	Connection connection = null;
	DefaultTableModel model; 
	private JPanel panel_16;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	private JPanel panel_20;
	private JTable table_2;
	private JScrollPane scrollPane_2;
	private JButton btnResetEditSV;
	private JButton btnSaveEditSV;
	private JPanel panel_24;
	private JTable table_3;
	private JScrollPane scrollPane_3;
	private JLabel lblNewLabel_7;
	private JTextField tfEditMaSinhVien;
	private JLabel lblNewLabel_8;
	private JTextField tfEditTenSinhVien;
	private JLabel lblNewLabel_9;
	private JTextField tfEditMaLop;
	private JLabel lblNewLabel_10;
	private JRadioButton rdbtnEditNam;
	private JRadioButton rdbtnEditNu;
	private JLabel lblNewLabel_12;
	private JTextField tfEditDiaChi;
	private JLabel lblNewLabel_13;
	private JTextField tfEditDienThoai;
	private JLabel lblNewLabel_14;
	private JComboBox cbbtfDiemMaMHAdd;
	private JLabel lblNewLabel_15;
	private JTextField tfDiemTenMHAdd;
	private JLabel lblNewLabel_16;
	private JTextField tfDiemDiemThiAdd;
	private JTextField tfEditSearch;
	private JButton btnDelDel;
	private JComboBox comboBox_1;
	private JTextArea tfQuery;
	private JButton btnQuery;
	private JButton btnQueryReset;
	private JComboBox cbbMaLopAdd;
	private JTextField textField;
	private JTextField textField_1;
	private JScrollPane scrollPane_4;
	private JTextField tfEditDiemMaSinhVien;
	private JTextField tfEditDiemTenMH;
	private JLabel lblNewLabel_22;
	private JTextField tfEditDiemDiemThi;
	private JComboBox cbbEditDiemMaMH;
	public void switchPanel(JPanel panel_) {
		layeredPane.removeAll();
		layeredPane.add(panel_);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public void switchPanelCon(JPanel panel_) {
		layeredPane_1.removeAll();
		layeredPane_1.add(panel_);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
	}
	public void switchPanelCon_1(JLayeredPane layeredPaneOne, JPanel  panel_) {
		layeredPaneOne.removeAll();
		layeredPaneOne.add(panel_);
		layeredPaneOne.repaint();
		layeredPaneOne.revalidate();
	}
	
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?"); 
	}
	
	public MyFrame() throws SQLException {
		
		connection = connect.dbConnect();
		
		setTitle("Qu\u1EA3n l\u00FD sinh vi\u00EAn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 696);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 173, 637);
		panel.setBorder(new LineBorder(Color.PINK, 2));
		
		btnNewButton_1 = new JButton("S\u1EEFa");
		btnNewButton_1.setBounds(12, 84, 150, 60);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel_1);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(189, 11, 1067, 637);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 139, 139), 2));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(216, 191, 216), 2));
		
		btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setBounds(12, 155, 150, 60);
		btnNewButton_2.setBackground(new Color(221, 160, 221));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel_2);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnNewButton_3 = new JButton("Sql Query");
		btnNewButton_3.setToolTipText("Thực Thi Câu Truy Vấn");
		btnNewButton_3.setBounds(12, 226, 152, 60);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel_4);
			}
		});
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setBounds(11, 13, 151, 58);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel_3);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		panel.add(btnNewButton_3);
		panel.add(btnNewButton);
		contentPane.add(layeredPane);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(240, 230, 140), 2));
		panel_1.setLayout(null);
		panel_2.setLayout(null);
		panel_3.setLayout(null);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1ECDn B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel_5.setBounds(10, 11, 297, 80);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setAlignmentX(Component.RIGHT_ALIGNMENT);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Sinh Viên")) {
					switchPanelCon(panel_12);
					
					cbbMaLopAdd.removeAllItems();
					String sqlCbbMaLop = "select MaLop from Lop";
					try {
						PreparedStatement pstCbbMalop = connection.prepareStatement(sqlCbbMaLop);
						ResultSet rsCbbMaLop = pstCbbMalop.executeQuery();
						while(rsCbbMaLop.next()) {	
							String maLop = rsCbbMaLop.getString("MaLop").trim();			
							cbbMaLopAdd.addItem(maLop);
						}
						
					}catch (Exception ex) {
						System.out.println("lỗi" + ex.getMessage());
					}
					
					table = new JTable();
					table.setRowHeight(35);
					model = new DefaultTableModel();
					scrollPane.setViewportView(table);
					Object[] column2 = {"Mã Sinh Viên", "Tên Sinh Viên", "Tên Lớp", "Ma Lớp",  "Giới Tính", "Ngày Sinh", "Dia Chỉ", "Điện Thoại"};
					model.setColumnIdentifiers(column2);
					table.setModel(model);
					String MaSV = "", TenSV = "", GioiTinh = "", NgaySinh = "", DiaChi = "", DienThoai = "", MaLop = "", TenLop = "";
					try {
						String query = "select * from SinhVien";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						while(rs.next()) {
							MaSV      = rs.getString("MaSV").trim();
							TenSV     = rs.getString("TenSV");
							GioiTinh  = rs.getString("GioiTinh");
							NgaySinh  = rs.getString("NgaySinh");
							DiaChi    = rs.getString("DiaChi");
							DienThoai = rs.getString("DienThoai");
							MaLop     = rs.getString("MaLop").trim();
							if(MaLop.equals("CNTT01")) {
								TenLop = "18CT1";
							}else {
								if(MaLop.equals("CNTT02")) {
									TenLop = "18CT2";
								}else {
									if(MaLop.equals("CNTT03")) {
										TenLop = "18CT3";
									}else {
										TenLop = "18CT4";
									}
								}
							}
							model.addRow(new Object[] {MaSV, TenSV, TenLop, MaLop,  GioiTinh, NgaySinh, DiaChi, DienThoai});
						
						}			
					}catch (Exception ex) {
						System.out.println("lỗi" + ex.getMessage());
					}
				}
				else {
					if(comboBox.getSelectedItem().equals("Điểm")) {
						switchPanelCon(panel_10);
						cbbtfDiemMaMHAdd.removeAllItems();
						String sqlCbb = "select MaMH from MonHoc";
						try {
							PreparedStatement pstCbb = connection.prepareStatement(sqlCbb);
							ResultSet rsCbb = pstCbb.executeQuery();
							while(rsCbb.next()) {	
								String maMH = rsCbb.getString("MaMH").trim();			
								cbbtfDiemMaMHAdd.addItem(maMH);
							}
							
						}catch (Exception ex) {
							System.out.println("lỗi" + ex.getMessage());
						}
						tfDiemTenMHAdd.setEditable(false);
						
						
						table = new JTable();
						table.setRowHeight(35);
						model = new DefaultTableModel();
						scrollPane.setViewportView(table);
						Object[] column1 = {"Mã Sinh Viên", "Mã Môn Học", "Tên Môn Học", "Điểm Thi"};
						model.setColumnIdentifiers(column1);
						table.setModel(model);
						String MaSV = "", MaMH = "", DiemThi = "", TenMonHoc = "";
						try {
							String query = "select * from Diem";
							PreparedStatement pst = connection.prepareStatement(query);
							ResultSet rs = pst.executeQuery();
							while(rs.next()) {	
								MaSV    = rs.getString("MaSV").trim();
								MaMH    = rs.getString("MaMH").trim();							
								if( MaMH.equals("JAVABASIC") == true ){
									TenMonHoc = "Java cơ bản";
								}else {
									if(MaMH.equals("JAVAADV")) {
										TenMonHoc = "Java nâng cao";
									}else {
										if(MaMH.equals("NMC")) {
											TenMonHoc = "Nhập môn ngôn ngữ C";
										}else {
											if(MaMH.equals("KTMT")) {
												TenMonHoc = "Kiến Trúc Máy Tính";
											}else {
												if(MaMH.equals("LTHT")) {
													TenMonHoc = "Lập Trình Hệ Thống";
												}else {
													if(MaMH.equals("TA")) {
														TenMonHoc = "Tiếng Anh";
													}else {
														if(MaMH.equals("KNM")) {
															TenMonHoc = "Kỹ Năng Mềm";
														}else {
															if(MaMH.equals("TRR")) {
																TenMonHoc = "Toán Rời Rạc";
															}else {
																if(MaMH.equals("LTM")) {
																	TenMonHoc = "Lập Trình Mạng";
																}else {
																	if(MaMH.equals("LTW")) {
																		TenMonHoc = "Lập Trình Web";
																	}
																}
															}
														}
													}
												}
											}
										}
									}

								}
								DiemThi = rs.getString("DiemThi");
								model.addRow(new Object[] {MaSV, MaMH, TenMonHoc, DiemThi });
							}
							
						}catch (Exception ex) {
							System.out.println("lỗi" + ex.getMessage());
						}
					}else {
						if(comboBox.getSelectedItem().equals("Choose Table")) {
							switchPanelCon(panel_9);
							table = new JTable();
							table.setRowHeight(35);
							model = new DefaultTableModel();
							scrollPane.setViewportView(table);
						}
					}
				}
			}
		});
		layeredPane.setLayout(new CardLayout(0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Table", "Sinh Vi\u00EAn", "\u0110i\u1EC3m"}));
		comboBox.setBounds(32, 24, 237, 45);
		panel_5.add(comboBox);
		layeredPane.add(panel_3, "name_2093551521700");
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 102, 297, 524);
		panel_3.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "H\u00E3y Ch\u1ECDn B\u1EA3ng ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		layeredPane_1.add(panel_9, "name_2057262279400");
		panel_9.setLayout(null);
		
		panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00EAm \u0110i\u1EC3m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		layeredPane_1.add(panel_10, "name_2057282181900");
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sinh Viên");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 22, 117, 30);
		panel_10.add(lblNewLabel_1);
		
		tfDiemMaSVAdd = new JTextField();
		tfDiemMaSVAdd.setBounds(136, 22, 150, 30);
		panel_10.add(tfDiemMaSVAdd);
		tfDiemMaSVAdd.setColumns(10);
		
		btnDiemSaveAdd = new JButton("Save");
		btnDiemSaveAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sqlCheckMaSVDiem    = "select * from SinhVien where MaSV = " + tfDiemMaSVAdd.getText();
				try {
					PreparedStatement pst = connection.prepareStatement(sqlCheckMaSVDiem);
					ResultSet rs = pst.executeQuery();
					if(rs.next()) {}
					else {
						JOptionPane.showMessageDialog(null, "Không Có Mã Sinh Viên này");
						return;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				String sqlCheckMaSVExistDiem    = "select * from Diem where MaSV = " + tfDiemMaSVAdd.getText() + " and MaMH = " + "'" + cbbtfDiemMaMHAdd.getSelectedItem() +"'";
				try {
					PreparedStatement pst = connection.prepareStatement(sqlCheckMaSVExistDiem);
					ResultSet rs = pst.executeQuery();
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Mã Sinh Viên này đã có điểm môn " + tfDiemTenMHAdd.getText());
						return;
					}else {
//						System.out.println("sai");
//						return;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				if(tfDiemMaSVAdd.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập ô Mã Sinh Viên");
					tfDiemMaSVAdd.setBorder(new LineBorder(Color.RED, 2));
					return;
				}
				try {
					Diem diem = new Diem();
					diem.setMaSV(tfDiemMaSVAdd.getText());
					diem.setMaMH(cbbtfDiemMaMHAdd.getSelectedItem().toString());
					String diemThi = tfDiemDiemThiAdd.getText();
					
					if(isNumeric(diemThi)) {
						if(Double.parseDouble(diemThi) <=10) {
							diem.setDiemThi(Double.parseDouble(diemThi));
						}else {
							JOptionPane.showMessageDialog(null, "Vui lòng nhập nhỏ hơn hoặc bằng 10");
							return;
						}
					}else {
						JOptionPane.showMessageDialog(null, "Vui lòng nhập kiểu Number");
						return;
					}
					
					ThaoTacDB thaoTacDiem = new ThaoTacDB();
					thaoTacDiem.insertDiem(diem);
					JOptionPane.showMessageDialog(null, "Thêm Thông Tin Thành Công");	
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error: " + e2.getMessage());
				}
				
			}
		});
		btnDiemSaveAdd.setBounds(10, 414, 277, 44);
		panel_10.add(btnDiemSaveAdd);
		
		btnNewButton_5 = new JButton("Reset");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDiemMaSVAdd.setText("");
				tfDiemDiemThiAdd.setText("");
			}
		});
		btnNewButton_5.setBounds(10, 469, 277, 44);
		panel_10.add(btnNewButton_5);
		
		lblNewLabel_14 = new JLabel("Mã Môn Học");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(10, 63, 117, 30);
		panel_10.add(lblNewLabel_14);
		
		cbbtfDiemMaMHAdd = new JComboBox();
		cbbtfDiemMaMHAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(cbbtfDiemMaMHAdd.getSelectedItem().equals("JAVAADV")) {
						tfDiemTenMHAdd.setText("Java Nâng Cao");
					}else {
						if(cbbtfDiemMaMHAdd.getSelectedItem().equals("JAVABASIC")) {
							tfDiemTenMHAdd.setText("Java cơ bản");
						}else {
							if(cbbtfDiemMaMHAdd.getSelectedItem().equals("NMC")) {
								tfDiemTenMHAdd.setText("Nhập Môn C");
							}else {
								if(cbbtfDiemMaMHAdd.getSelectedItem().equals("KTMT")) {
									tfDiemTenMHAdd.setText("Kiến Trúc Máy Tính");
								}else {
									if(cbbtfDiemMaMHAdd.getSelectedItem().equals("LTHT")) {
										tfDiemTenMHAdd.setText("Lập Trình Hệ Thống");
									}else {
										if(cbbtfDiemMaMHAdd.getSelectedItem().equals("TA")) {
											tfDiemTenMHAdd.setText("Tiếng Anh");
										}else {
											if(cbbtfDiemMaMHAdd.getSelectedItem().equals("KNM")) {
												tfDiemTenMHAdd.setText("Kỹ Năng Mềm");
											}else {
												if(cbbtfDiemMaMHAdd.getSelectedItem().equals("TRR")) {
													tfDiemTenMHAdd.setText("Toán Rời Rạc");
												}else {
													if(cbbtfDiemMaMHAdd.getSelectedItem().equals("LTM")) {
														tfDiemTenMHAdd.setText("Lập Trình Mạng");
													}else {
														if(cbbtfDiemMaMHAdd.getSelectedItem().equals("LTW")) {
															tfDiemTenMHAdd.setText("Lập Trình Web");
														}
													}
												}
											}
										}
									}
								}
							}
							
						}
					}
				} catch (Exception e2) {
					System.out.println("lỗi " + e2.getMessage());
				}
			}
		});
		cbbtfDiemMaMHAdd.setBounds(136, 63, 150, 30);
		panel_10.add(cbbtfDiemMaMHAdd);
		
		lblNewLabel_15 = new JLabel("Tên Môn Học");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(10, 104, 117, 30);
		panel_10.add(lblNewLabel_15);
		
		tfDiemTenMHAdd = new JTextField();
		tfDiemTenMHAdd.setBounds(136, 104, 150, 30);
		panel_10.add(tfDiemTenMHAdd);
		tfDiemTenMHAdd.setColumns(10);
		
		lblNewLabel_16 = new JLabel("Điểm Thi");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setBounds(10, 145, 117, 30);
		panel_10.add(lblNewLabel_16);
		
		tfDiemDiemThiAdd = new JTextField();
		tfDiemDiemThiAdd.setBounds(136, 145, 150, 30);
		panel_10.add(tfDiemDiemThiAdd);
		tfDiemDiemThiAdd.setColumns(10);
		
		panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00EAm Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		layeredPane_1.add(panel_12, "name_2680237705100");
		panel_12.setLayout(null);
		
		label = new JLabel("Mã Sinh Viên");
		label.setBounds(10, 24, 117, 27);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(label);
		
		lblNewLabel = new JLabel("Tên Sinh Viên");
		lblNewLabel.setBounds(10, 62, 117, 27);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Mã Lớp");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 100, 117, 27);
		
		panel_12.add(label);
		
		lblNewLabel_18 = new JLabel("Tên Sinh Viên");
		lblNewLabel_18.setBounds(10, 62, 117, 27);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_18);
		
		lblNewLabel_2_1 = new JLabel("Mã Lớp");
		lblNewLabel_2_1.setBounds(10, 100, 117, 27);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_2_1);
		
		
		lblNewLabel_3 = new JLabel("Giới Tính");
		lblNewLabel_3.setBounds(10, 138, 117, 27);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_3);
		
		rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setBounds(137, 140, 57, 23);
		rdbtnNam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNam.isSelected()) {
					rdbtnNu.setSelected(false);
				}
			}
		});
		panel_12.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setBounds(211, 140, 76, 23);
		rdbtnNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNu.isSelected()) {
					rdbtnNam.setSelected(false);
				}
			}
		});
		panel_12.add(rdbtnNu);
		
		lblNewLabel_4 = new JLabel("Ngày Sinh");
		lblNewLabel_4.setBounds(10, 176, 117, 27);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_4);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(137, 170, 150, 33);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		panel_12.add(dateChooser);
		
		lblNewLabel_5 = new JLabel("Địa Chỉ");
		lblNewLabel_5.setBounds(10, 214, 117, 27);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_5);
		
		tfDiaChi = new JTextField();
		tfDiaChi.setBounds(137, 214, 150, 27);
		panel_12.add(tfDiaChi);
		tfDiaChi.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Điện Thoại");
		lblNewLabel_6.setBounds(10, 252, 117, 27);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_6);
		
		tfDienThoai = new JTextField();
		tfDienThoai.setBounds(137, 252, 150, 27);
		panel_12.add(tfDienThoai);
		tfDienThoai.setColumns(10);
		
		btnSaveAdd = new JButton("Save");
		btnSaveAdd.setBounds(10, 414, 277, 44);
		btnSaveAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String thongBao = "";
				if(textField.getText().equals("") || textField_1.getText().equals("")) {
					thongBao = "Vui lòng điền đầy đủ thông tin";
				}
				if(thongBao.length() > 0) {
					JOptionPane.showMessageDialog(null, thongBao);
					return;
				}
				try {
					SinhVien sv = new SinhVien();
					sv.setMaSV(textField.getText());
					sv.setTenSV(textField_1.getText());
					sv.setMaLop(cbbMaLopAdd.getSelectedItem().toString());
					String gioiTinh = rdbtnNam.isSelected() == true ? "Nam" : (rdbtnNu.isSelected() == true) ? "Nữ" : "";
					sv.setGioiTinh(gioiTinh);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String date = sdf.format(dateChooser.getDate());
					sv.setNgaySinh(date);
					sv.setDiaChi(tfDiaChi.getText());
					sv.setDienThoai(tfDienThoai.getText());
				
					String sqlCheckMaSV    = "select * from SinhVien where MaSV = " + textField.getText();
					
					PreparedStatement pst  = connection.prepareStatement(sqlCheckMaSV);
					ResultSet rs = pst.executeQuery();
					if(rs.next()) {
//						System.out.println("có tồn tại");
						JOptionPane.showMessageDialog(null, "Mã Sinh Viên Đã tồn tại");
					}else {
							ThaoTacDB thaoTac = new ThaoTacDB();
							thaoTac.insert(sv);
							JOptionPane.showMessageDialog(null, "Thêm Thông Tin Thành Công");	
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error: " + e2.getMessage());
				}
			}
		});
		panel_12.add(btnSaveAdd);
		
		btnResetAdd = new JButton("Reset");
		btnResetAdd.setBounds(10, 469, 277, 44);
		btnResetAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				tfDiaChi.setText("");
				tfDienThoai.setText("");
				rdbtnNam.setSelected(false);
				rdbtnNu.setSelected(false);
				dateChooser.setDate(null);
			}
		});
		panel_12.add(btnResetAdd);
		
		cbbMaLopAdd = new JComboBox();
		cbbMaLopAdd.setBounds(137, 102, 150, 25);
		panel_12.add(cbbMaLopAdd);
		
		textField = new JTextField();
		textField.setBounds(137, 24, 150, 23);
		panel_12.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 58, 150, 31);
		panel_12.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng Tin B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel_11.setBounds(318, 11, 739, 615);
		panel_3.add(panel_11);
		panel_11.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 719, 583);
		panel_11.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		layeredPane.add(panel_2, "name_2093572144200");
		
		panel_24 = new JPanel();
		panel_24.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng Tin B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(221, 160, 221)));
		panel_24.setBounds(10, 83, 1047, 543);
		panel_2.add(panel_24);
		panel_24.setLayout(null);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 21, 1027, 515);
		panel_24.add(scrollPane_3);
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Ch\u1ECDn B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(221, 160, 221)));
		panel_6.setBounds(10, 11, 231, 69);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem().equals("Sinh Viên")) {
//					switchPanelCon(panel_12);
//					System.out.println("Sinh Vien");
					
					table_3 = new JTable(model) {
						private static final long serialVersionUID = 1L;	
			            @Override
			            public Class<?> getColumnClass(int column) {
			                switch (column) {
			                    case 0:
			                        return String.class;
			                    case 1:
			                        return String.class;
			                    case 2:
			                        return String.class;
			                    case 3:
			                        return String.class;
			                    case 4:
			                        return String.class;
			                    case 5:
			                        return String.class;
			                    case 6:
			                        return String.class;
			                    case 7:
			                        return String.class;
			                    default :
			                        return Boolean.class;
			                    
			                }
			            }
					};
					table_3.setSelectionBackground(Color.getHSBColor(0, 128, 128));
					table_3.setRowHeight(35);
					model = new DefaultTableModel();
					scrollPane_3.setViewportView(table_3);
					Object[] column2 = {"Mã Sinh Viên", "Tên Sinh Viên", "Tên Lớp", "Ma Lớp",  "Giới Tính", "Ngày Sinh", "Dia Chỉ", "Điện Thoại", "Action"};
					model.setColumnIdentifiers(column2);
					table_3.setModel(model);
					String MaSV = "", TenSV = "", GioiTinh = "", NgaySinh = "", DiaChi = "", DienThoai = "", MaLop = "", TenLop = "";
					JCheckBox cb = null;
					try {
						String query = "select * from SinhVien";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						
						while(rs.next()) {
							MaSV      = rs.getString("MaSV").trim();
							TenSV     = rs.getString("TenSV");
							GioiTinh  = rs.getString("GioiTinh");
							NgaySinh  = rs.getString("NgaySinh");
							DiaChi    = rs.getString("DiaChi");
							DienThoai = rs.getString("DienThoai");
							MaLop     = rs.getString("MaLop").trim();
							
							if(MaLop.equals("CNTT01")) {
								TenLop = "18CT1";
							}else {
								if(MaLop.equals("CNTT02")) {
									TenLop = "18CT2";
								}else {
									if(MaLop.equals("CNTT03")) {
										TenLop = "18CT3";
									}else {
										TenLop = "18CT4";
									}
								}
							}
							model.addRow(new Object[] {MaSV, TenSV, TenLop, MaLop,  GioiTinh, NgaySinh, DiaChi, DienThoai, false});
						
						}			
					}catch (Exception ex) {
						System.out.println("lỗi" + ex.getMessage());
					}
				}
				else {
					if(comboBox_1.getSelectedItem().equals("Điểm")) {
//						switchPanelCon(panel_10);
						table_3 = new JTable(model) {
							private static final long serialVersionUID = 1L;
							
				            @Override
				            public Class<?> getColumnClass(int column) {
				                switch (column) {
				                    case 0:
				                        return String.class;
				                    case 1:
				                        return String.class;
				                    case 2:
				                        return String.class;
				                    case 3:
				                        return Double.class;
				                    default :
				                        return Boolean.class;
				                    
				                }
				            }
						};
						table_3.setSelectionBackground(Color.getHSBColor(0, 128, 128));
						table_3.setRowHeight(35);
						model = new DefaultTableModel();
						scrollPane_3.setViewportView(table_3);
						Object[] column1 = {"Mã Sinh Viên", "Mã Môn Học", "Tên Môn Học", "Điểm Thi", "Action"};
						model.setColumnIdentifiers(column1);
						table_3.setModel(model);
						String MaSV = "", MaMH = "", TenMonHoc = "";
						double DiemThi ;
						try {
							String query = "select * from Diem";
							PreparedStatement pst = connection.prepareStatement(query);
							ResultSet rs = pst.executeQuery();
							while(rs.next()) {	
								MaSV    = rs.getString("MaSV").trim();
								MaMH    = rs.getString("MaMH").trim();							
								if( MaMH.equals("JAVABASIC") == true ){
									TenMonHoc = "Java cơ bản";
								}else {
									if(MaMH.equals("JAVAADV")) {
										TenMonHoc = "Java nâng cao";
									}else {
										if(MaMH.equals("NMC")) {
											TenMonHoc = "Nhập môn ngôn ngữ C";
										}else {
											if(MaMH.equals("KTMT")) {
												TenMonHoc = "Kiến Trúc Máy Tính";
											}else {
												if(MaMH.equals("LTHT")) {
													TenMonHoc = "Lập Trình Hệ Thống";
												}else {
													if(MaMH.equals("TA")) {
														TenMonHoc = "Tiếng Anh";
													}else {
														if(MaMH.equals("KNM")) {
															TenMonHoc = "Kỹ Năng Mềm";
														}else {
															if(MaMH.equals("TRR")) {
																TenMonHoc = "Toán Rời Rạc";
															}else {
																if(MaMH.equals("LTM")) {
																	TenMonHoc = "Lập Trình Mạng";
																}else {
																	if(MaMH.equals("LTW")) {
																		TenMonHoc = "Lập Trình Web";
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
								DiemThi = rs.getDouble("DiemThi");
								model.addRow(new Object[] {MaSV, MaMH, TenMonHoc, DiemThi, false });
							}
							
						}catch (Exception ex) {
							System.out.println("lỗi" + ex.getMessage());
						}
					}else {
						
					}
				}
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose Table", "Sinh Viên", "Điểm"}));
		comboBox_1.setBounds(10, 19, 211, 39);
		panel_6.add(comboBox_1);
		
		btnDelDel = new JButton("Xóa");
		btnDelDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				comboBox_1.getSelectedItem().equals("Điểm")
				if(comboBox_1.getSelectedItem().equals("Sinh Viên")) {
					DefaultTableModel modelDel = (DefaultTableModel)table_3.getModel();
					int rowIndexDel = table_3.getSelectedRow();
					String res = "";
					for (int i = 0; i < table_3.getRowCount(); i++) {
					     try {
					    	 Boolean isChecked = Boolean.valueOf(table_3.getValueAt(i, 8).toString());
					    	 if (isChecked) {
					    		 	System.out.println("1 : " +modelDel.getValueAt(i, 1).toString());
					    		 	SinhVien sv = new SinhVien();
										sv.setMaSV(modelDel.getValueAt(i, 0).toString());
						    		 	ThaoTacDB thaoTac = new ThaoTacDB();
										thaoTac.delete(sv);
									res = "yes";
									
							 }else {
							    	 if(isChecked == null) {
							    		 System.out.println("bo qua");
							    	 }
							     }

						} catch (Exception e2) {
							System.out.println("lỗi: " + e2.getMessage());
						}
					}
					if(res.length() > 0) {
						JOptionPane.showMessageDialog(null, "Xóa Thành Công");
						return;
					}

				}
				else {
					if(comboBox_1.getSelectedItem().equals("Điểm")) {
						DefaultTableModel modelDel = (DefaultTableModel)table_3.getModel();
						int rowIndexDel = table_3.getSelectedRow();
						System.out.println("Number Row: " + rowIndexDel);
						String res = "";
						for (int i = 0; i < table_3.getRowCount(); i++) {
						     try {
						    	 Boolean isChecked = Boolean.valueOf(table_3.getValueAt(i, 4).toString());
						    	 if (isChecked) {
						    		 	System.out.println("1 : " +modelDel.getValueAt(i, 0).toString());
						    		 	System.out.println("2 : " +modelDel.getValueAt(i, 1).toString());
						    		 	Diem diem = new Diem();
										diem.setMaSV(modelDel.getValueAt(i, 0).toString());
										diem.setMaMH(modelDel.getValueAt(i, 1).toString());
						    		 	ThaoTacDB thaoTacDiem = new ThaoTacDB();
										thaoTacDiem.deleteDiem(diem);
										res = "yes";
										
								 }else {
								    	 if(isChecked == null) {
								    		 System.out.println("bo qua");
								    	 }
								     }

							} catch (Exception e2) {
								System.out.println("lỗi: " + e2.getMessage());
							}
						}
						if(res.length() > 0) {
							JOptionPane.showMessageDialog(null, "Xóa Thành Công");
							return;
						}
					}
				}
			}
		});
		btnDelDel.setBounds(269, 22, 162, 50);
		panel_2.add(btnDelDel);
		layeredPane.add(panel_4, "name_2093592273700");
		panel_4.setLayout(null);
		
		panel_20 = new JPanel();
		panel_20.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng Tin B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, Color.CYAN));
		panel_20.setBounds(10, 11, 1047, 615);
		panel_4.add(panel_20);
		panel_20.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 21, 1027, 456);
		panel_20.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Truy V\u1EA5n", TitledBorder.LEADING, TitledBorder.TOP, null, Color.CYAN));
		panel_7.setBounds(10, 488, 1027, 116);
		panel_20.add(panel_7);
		panel_7.setLayout(null);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 23, 553, 82);
		panel_7.add(scrollPane_4);
		
		tfQuery = new JTextArea();
		scrollPane_4.setViewportView(tfQuery);
		tfQuery.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		btnQuery = new JButton("Thực Thi");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table_2 = new JTable();
				table_2.setRowHeight(35);
				table_2.setSelectionBackground(Color.getHSBColor(0, 128, 128));
				model = new DefaultTableModel();
				scrollPane_2.setViewportView(table_2);
				String sql = tfQuery.getText();
				ArrayList<String> listHeader = new  ArrayList<String>();
				try {
					connection = connect.dbConnect();
					PreparedStatement pst = connection.prepareStatement(sql);
					ResultSet resultSet = pst.executeQuery();
					ResultSetMetaData metaData = resultSet.getMetaData();
					int count = metaData.getColumnCount(); //number of column
					String columnName[] = new String[count];
					for (int i = 1; i <= count; i++){
					   columnName[i-1] = metaData.getColumnLabel(i);
					   listHeader.add(metaData.getColumnLabel(i));
					}
					
					model.setColumnIdentifiers(columnName);
					table_2.setModel(model);
					Object[] ob = new Object[100009];
					while(resultSet.next()) {
						for(int i=0; i<listHeader.size(); i++) {
							ob[i] = (resultSet.getString(listHeader.get(i)).trim());
						}
						System.out.println();
						model.addRow(ob);
					}	
					pst.execute();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "lỗi: " + e2.getMessage());
				}
			}
		});
		btnQuery.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQuery.setBounds(624, 24, 129, 81);
		panel_7.add(btnQuery);
		
		btnQueryReset = new JButton("Reset");
		btnQueryReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQueryReset.setBounds(827, 24, 141, 81);
		panel_7.add(btnQueryReset);
		layeredPane.add(panel_1, "name_2093611620400");
		
		panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1ECDn B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(70, 130, 180)));
		panel_8.setBounds(10, 11, 297, 80);
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
//		------------------SUA ---------------------
		
		comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_2.getSelectedItem().equals("Choose Table")) {
					switchPanelCon_1(layeredPane_2, panel_13);
					table = new JTable();
					table.setRowHeight(35);
					model = new DefaultTableModel();
					scrollPane_1.setViewportView(table);
				}
				else {
					if(comboBox_2.getSelectedItem().equals("Sinh Viên")) {
						switchPanelCon_1(layeredPane_2, panel_14);
						
						
						
						table = new JTable();
						table.setRowHeight(35);
						table.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								DefaultTableModel modelEdit = (DefaultTableModel) table.getModel();
								
								int rowIndex = table.getSelectedRow();
								table.setSelectionBackground(Color.getHSBColor(0, 128, 128));
								tfEditMaSinhVien.setText(modelEdit.getValueAt(rowIndex, 0).toString());
								tfEditTenSinhVien.setText(modelEdit.getValueAt(rowIndex, 1).toString());
								tfEditMaLop.setText(modelEdit.getValueAt(rowIndex, 3).toString());
								String getGioiTinh = modelEdit.getValueAt(rowIndex, 4).toString();
								if(getGioiTinh.equals("Nam") || getGioiTinh.equals("nam")) {
									rdbtnEditNam.setSelected(true);
									rdbtnEditNu.setSelected(false);
								}else {
									if(getGioiTinh.equals("Nữ") || getGioiTinh.equals("nữ") || getGioiTinh.equals("nu")) {
										rdbtnEditNam.setSelected(false);
										rdbtnEditNu.setSelected(true);
									}
								}
								String tmpDate = modelEdit.getValueAt(rowIndex, 5).toString();
								DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
								Date startDate = null;
								try {
									startDate = df2.parse(tmpDate);
								} catch (ParseException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								String startDateString2 = df2.format(startDate);
//								System.out.println(startDateString2);
								try {
									dateChooser_1.setDateFormatString("yyyy-MM-dd");
									Date date = new SimpleDateFormat("yyyy-MM-dd").parse(startDateString2);
									dateChooser_1.setDate(date);
								} catch (ParseException e1) {
									e1.printStackTrace();
								}
								tfEditDiaChi.setText(modelEdit.getValueAt(rowIndex, 6).toString());
								tfEditDienThoai.setText(modelEdit.getValueAt(rowIndex, 7).toString());
								
							}
						});
						model = new DefaultTableModel();
						scrollPane_1.setViewportView(table);
						Object[] column2 = {"Mã Sinh Viên", "Tên Sinh Viên", "Tên Lớp", "Ma Lớp",  "Giới Tính", "Ngày Sinh", "Dia Chỉ", "Điện Thoại"};
						model.setColumnIdentifiers(column2);
						table.setModel(model);
						String MaSV = "", TenSV = "", GioiTinh = "", NgaySinh = "", DiaChi = "", DienThoai = "", MaLop = "", TenLop = "";
						try {
							String query = "select * from SinhVien";
							PreparedStatement pst = connection.prepareStatement(query);
							ResultSet rs = pst.executeQuery();
							while(rs.next()) {
								MaSV      = rs.getString("MaSV").trim();
								TenSV     = rs.getString("TenSV");
								GioiTinh  = rs.getString("GioiTinh");
								NgaySinh  = rs.getString("NgaySinh");
								DiaChi    = rs.getString("DiaChi");
								DienThoai = rs.getString("DienThoai");
								MaLop     = rs.getString("MaLop").trim();
								if(MaLop.equals("CNTT01")) {
									TenLop = "18CT1";
								}else {
									if(MaLop.equals("CNTT02")) {
										TenLop = "18CT2";
									}else {
										if(MaLop.equals("CNTT03")) {
											TenLop = "18CT3";
										}else {
											TenLop = "18CT4";
										}
									}
								}
								model.addRow(new Object[] {MaSV, TenSV, TenLop, MaLop,  GioiTinh, NgaySinh, DiaChi, DienThoai});
							
							}			
						}catch (Exception ex) {
							System.out.println("lỗi" + ex.getMessage());
						}
					}
					else {
						if(comboBox_2.getSelectedItem().equals("Điểm")) {
							switchPanelCon_1(layeredPane_2, panel_15);
							try {
								if(cbbEditDiemMaMH.getSelectedIndex() != -1) {
									System.out.println("cbbEditDiemMaMH rỗng");
								}else {
									cbbEditDiemMaMH.removeAllItems();
									String sqlCbbMaMH = "select MaMH from MonHoc";
									PreparedStatement pstCbbMaMH = connection.prepareStatement(sqlCbbMaMH);
									ResultSet rsCbbMaMH = pstCbbMaMH.executeQuery();
									while(rsCbbMaMH.next()) {	
										String maMH = rsCbbMaMH.getString("MaMH").trim();			
										cbbEditDiemMaMH.addItem(maMH);
									}
								}
								
							}catch (Exception ex) {
								System.out.println("lỗi: " + ex.getMessage());
							}
							
							table = new JTable();
							table.setSelectionBackground(Color.getHSBColor(0, 128, 128));
							table.setRowHeight(35);
							table.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseClicked(MouseEvent e) {
									DefaultTableModel modelEdit = (DefaultTableModel) table.getModel();
									
									int rowIndex = table.getSelectedRow();
									table.setSelectionBackground(Color.getHSBColor(0, 128, 128));
									tfEditDiemMaSinhVien.setText(modelEdit.getValueAt(rowIndex, 0).toString());
									
									String maMHEdit = modelEdit.getValueAt(rowIndex, 1).toString();
									System.out.println("ma mh: " + maMHEdit);
									cbbEditDiemMaMH.setSelectedItem(maMHEdit);
									
									tfEditDiemTenMH.setText(modelEdit.getValueAt(rowIndex, 2).toString());
									tfEditDiemDiemThi.setText(modelEdit.getValueAt(rowIndex, 3).toString());
								}
							});
							model = new DefaultTableModel();
							scrollPane_1.setViewportView(table);
							Object[] column1 = {"Mã Sinh Viên", "Mã Môn Học", "Tên Môn Học", "Điểm Thi"};
							model.setColumnIdentifiers(column1);
							table.setModel(model);
							String MaSV = "", MaMH = "", DiemThi = "", TenMonHoc = "";
							try {
								String query = "select * from Diem";
								PreparedStatement pst = connection.prepareStatement(query);
								ResultSet rs = pst.executeQuery();
								while(rs.next()) {	
									MaSV    = rs.getString("MaSV").trim();
									MaMH    = rs.getString("MaMH").trim();							
									if( MaMH.equals("JAVABASIC") == true ){
										TenMonHoc = "Java cơ bản";
									}else {
										if(MaMH.equals("JAVAADV")) {
											TenMonHoc = "Java nâng cao";
										}else {
											if(MaMH.equals("NMC")) {
												TenMonHoc = "Nhập Môn C";
											}else {
												if(MaMH.equals("KTMT")) {
													TenMonHoc = "Kiến Trúc Máy Tính";
												}else {
													if(MaMH.equals("LTHT")) {
														TenMonHoc = "Lập Trình Hệ Thống";
													}else {
														if(MaMH.equals("TA")) {
															TenMonHoc = "Tiếng Anh";
														}else {
															if(MaMH.equals("KNM")) {
																TenMonHoc = "Kỹ Năng Mềm";
															}else {
																if(MaMH.equals("TRR")) {
																	TenMonHoc = "Toán Rời Rạc";
																}else {
																	if(MaMH.equals("LTM")) {
																		TenMonHoc = "Lập Trình Mạng";
																	}else {
																		if(MaMH.equals("LTW")) {
																			TenMonHoc = "Lập Trình Web";
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
									DiemThi = rs.getString("DiemThi");
									model.addRow(new Object[] {MaSV, MaMH, TenMonHoc, DiemThi });
								}
								
							}catch (Exception ex) {
								System.out.println("lỗi" + ex.getMessage());
							}
						}
						else {
							
						}
					}
				}
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Choose Table", "Sinh Vi\u00EAn", "\u0110i\u1EC3m"}));
		comboBox_2.setBounds(31, 24, 238, 45);
		panel_8.add(comboBox_2);
		
		layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(10, 102, 297, 524);
		panel_1.add(layeredPane_2);
		layeredPane_2.setLayout(new CardLayout(0, 0));
		
		panel_13 = new JPanel();
		panel_13.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "H\u00E3y Ch\u1ECDn B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(70, 130, 180)));
		layeredPane_2.add(panel_13, "name_9940543069200");
		panel_13.setLayout(null);
		
		panel_14 = new JPanel();
		panel_14.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(70, 130, 180)));
		layeredPane_2.add(panel_14, "name_9946198814300");
		panel_14.setLayout(null);
		
		btnResetEditSV = new JButton("Reset");
		btnResetEditSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfEditMaSinhVien.setText("");
				tfEditTenSinhVien.setText("");
				tfEditDiaChi.setText("");
				tfEditDienThoai.setText("");
				tfEditMaLop.setText("");
				rdbtnEditNam.setSelected(false);
				rdbtnEditNu.setSelected(false);
				
				dateChooser_1.setDate(null);
			}
		});
		btnResetEditSV.setBounds(10, 469, 277, 44);
		panel_14.add(btnResetEditSV);
		
		btnSaveEditSV = new JButton("Save");
		btnSaveEditSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println(tfEditMaSinhVien.getText());
				
				String thongBao = "";
				if(tfEditMaSinhVien.getText().equals("") || tfEditTenSinhVien.getText().equals("") || tfEditMaLop.getText().equals("") ) {
					thongBao = "Vui lòng điền đầy đủ thông tin";
				}

				if(thongBao.length() > 0) {
					JOptionPane.showMessageDialog(null, thongBao);
					return;
				}
				System.out.println(tfEditMaSinhVien.getText() );
				SinhVien sv = new SinhVien();
				sv.setMaSV(tfEditMaSinhVien.getText());
				sv.setTenSV(tfEditTenSinhVien.getText());
				
				String gioiTinh = rdbtnEditNam.isSelected() == true ? "Nam" : (rdbtnEditNu.isSelected() == true) ? "Nữ" : "";
				System.out.println(gioiTinh);
				sv.setGioiTinh(gioiTinh);
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date = sdf.format(dateChooser_1.getDate());
					
				sv.setNgaySinh(date);
				System.out.println(date);
				
				sv.setDiaChi(tfEditDiaChi.getText());
				sv.setDienThoai(tfEditDienThoai.getText());
				sv.setMaLop(tfEditMaLop.getText());
				
				ThaoTacDB thaoTac = new ThaoTacDB();
				thaoTac.update(sv);
				JOptionPane.showMessageDialog(null, "Update Thông Tin Thành Công");
			}
		});
		btnSaveEditSV.setBounds(10, 358, 277, 44);
		panel_14.add(btnSaveEditSV);
		
		lblNewLabel_7 = new JLabel("Mã Sinh Viên");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 23, 117, 30);
		panel_14.add(lblNewLabel_7);
		
		tfEditMaSinhVien = new JTextField();
		tfEditMaSinhVien.setBounds(137, 23, 150, 30);
		panel_14.add(tfEditMaSinhVien);
		tfEditMaSinhVien.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Tên Sinh Viên");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(10, 64, 117, 30);
		panel_14.add(lblNewLabel_8);
		
		tfEditTenSinhVien = new JTextField();
		tfEditTenSinhVien.setText("");
		tfEditTenSinhVien.setBounds(137, 64, 150, 30);
		panel_14.add(tfEditTenSinhVien);
		tfEditTenSinhVien.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Mã Lớp");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(10, 105, 117, 30);
		panel_14.add(lblNewLabel_9);
		
		tfEditMaLop = new JTextField();
		tfEditMaLop.setBounds(137, 105, 150, 30);
		panel_14.add(tfEditMaLop);
		tfEditMaLop.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Giới Tính");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(10, 146, 117, 30);
		panel_14.add(lblNewLabel_10);
		
		rdbtnEditNam = new JRadioButton("Nam");
		rdbtnEditNam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnEditNam.isSelected()) {
					rdbtnEditNu.setSelected(false);
				}
			}
		});
		rdbtnEditNam.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEditNam.setBounds(137, 150, 63, 23);
		panel_14.add(rdbtnEditNam);
		
		rdbtnEditNu = new JRadioButton("Nữ");
		rdbtnEditNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnEditNu.isSelected()) {
					rdbtnEditNam.setSelected(false);
				}
			}
		});
		rdbtnEditNu.setBounds(219, 150, 68, 23);
		panel_14.add(rdbtnEditNu);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setDateFormatString("yyyy-MM-dd");
		dateChooser_1.setBounds(137, 180, 150, 30);
		panel_14.add(dateChooser_1);
		
		JLabel lblNewLabel_11 = new JLabel("Ngày Sinh");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(10, 180, 117, 30);
		panel_14.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Địa Chỉ");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(10, 221, 117, 30);
		panel_14.add(lblNewLabel_12);
		
		tfEditDiaChi = new JTextField();
		tfEditDiaChi.setBounds(137, 221, 150, 30);
		panel_14.add(tfEditDiaChi);
		tfEditDiaChi.setColumns(10);
		
		lblNewLabel_13 = new JLabel("Điện Thoại");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(10, 262, 117, 30);
		panel_14.add(lblNewLabel_13);
		
		tfEditDienThoai = new JTextField();
		tfEditDienThoai.setBounds(137, 262, 150, 30);
		panel_14.add(tfEditDienThoai);
		tfEditDienThoai.setColumns(10);
		
		JButton btnEditDelSV = new JButton("Xóa");
		btnEditDelSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String thongBao = "";
				String sqlCheckMaSV    = "select * from SinhVien where MaSV = " + tfEditMaSinhVien.getText();
				PreparedStatement pst = null;
				try {
					pst = connection.prepareStatement(sqlCheckMaSV);
					ResultSet rs = pst.executeQuery();
					if(rs.next()) {
						System.out.println("có");
//						JOptionPane.showMessageDialog(null, "Mã sinh viên Không tồn tại trong database");
					}else {
						JOptionPane.showMessageDialog(null, "Mã sinh viên Không tồn tại trong database");
						return;
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				if(tfEditMaSinhVien.getText().equals("")) {
					thongBao = "Vui lòng điền mã sinh viên cần xóa";
				}
				
				if(thongBao.length() > 0) {
					JOptionPane.showMessageDialog(null, thongBao);
					return;
				}
				SinhVien sv = new SinhVien();
				sv.setMaSV(tfEditMaSinhVien.getText());
				ThaoTacDB thaoTac = new ThaoTacDB();
				thaoTac.delete(sv);
				JOptionPane.showMessageDialog(null, "Xóa Thành Công");
			}
		});
		btnEditDelSV.setBounds(10, 413, 277, 45);
		panel_14.add(btnEditDelSV);
		
		panel_15 = new JPanel();
		panel_15.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0110i\u1EC3m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(70, 130, 180)));
		layeredPane_2.add(panel_15, "name_10002407631100");
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Mã Sinh Viên");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBounds(10, 27, 111, 30);
		panel_15.add(lblNewLabel_19);
		
		tfEditDiemMaSinhVien = new JTextField();
		tfEditDiemMaSinhVien.setBounds(131, 27, 156, 30);
		panel_15.add(tfEditDiemMaSinhVien);
		tfEditDiemMaSinhVien.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Mã Môn Học");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(10, 68, 111, 30);
		panel_15.add(lblNewLabel_20);
		
		cbbEditDiemMaMH = new JComboBox();
		cbbEditDiemMaMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbbEditDiemMaMH.getSelectedItem().equals("JAVAADV")) {
					tfEditDiemTenMH.setText("Java Nâng Cao");
				}else {
					if(cbbEditDiemMaMH.getSelectedItem().equals("JAVABASIC")) {
						tfEditDiemTenMH.setText("Java cơ bản");
					}else {
						if(cbbEditDiemMaMH.getSelectedItem().equals("NMC")) {
							tfEditDiemTenMH.setText("Nhập Môn C");
						}else {
							if(cbbEditDiemMaMH.getSelectedItem().equals("KTMT")) {
								tfEditDiemTenMH.setText("Kiến Trúc Máy Tính");
							}else {
								if(cbbEditDiemMaMH.getSelectedItem().equals("LTHT")) {
									tfEditDiemTenMH.setText("Lập Trình Hệ Thống");
								}else {
									if(cbbEditDiemMaMH.getSelectedItem().equals("TA")) {
										tfEditDiemTenMH.setText("Tiếng Anh");
									}else {
										if(cbbEditDiemMaMH.getSelectedItem().equals("KNM")) {
											tfEditDiemTenMH.setText("Kỹ Năng Mềm");
										}else {
											if(cbbEditDiemMaMH.getSelectedItem().equals("TRR")) {
												tfEditDiemTenMH.setText("Toán Rời Rạc");
											}else {
												if(cbbEditDiemMaMH.getSelectedItem().equals("LTM")) {
													tfEditDiemTenMH.setText("Lập Trình Mạng");
												}else {
													if(cbbEditDiemMaMH.getSelectedItem().equals("LTW")) {
														tfEditDiemTenMH.setText("Lập Trình Web");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
		cbbEditDiemMaMH.setBounds(131, 68, 156, 30);
		panel_15.add(cbbEditDiemMaMH);
		
		JLabel lblNewLabel_21 = new JLabel("Tên Môn Học");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(10, 109, 111, 30);
		panel_15.add(lblNewLabel_21);
		
		tfEditDiemTenMH = new JTextField();
		tfEditDiemTenMH.setEditable(false);
		tfEditDiemTenMH.setBounds(131, 109, 156, 30);
		panel_15.add(tfEditDiemTenMH);
		tfEditDiemTenMH.setColumns(10);
		
		lblNewLabel_22 = new JLabel("Điểm thi");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setBounds(10, 150, 111, 30);
		panel_15.add(lblNewLabel_22);
		
		tfEditDiemDiemThi = new JTextField();
		tfEditDiemDiemThi.setText("");
		tfEditDiemDiemThi.setBounds(131, 150, 156, 30);
		panel_15.add(tfEditDiemDiemThi);
		tfEditDiemDiemThi.setColumns(10);
		
		JButton btnEditDiemReset = new JButton("Reset");
		btnEditDiemReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfEditDiemMaSinhVien.setText("");
				tfEditDiemDiemThi.setText("");
				cbbEditDiemMaMH.setSelectedItem("JAVAADV");
				tfEditDiemTenMH.setText("Java Nâng Cao");
			}
		});
		btnEditDiemReset.setBounds(10, 469, 277, 44);
		panel_15.add(btnEditDiemReset);
		
		JButton btnEditDiemDel = new JButton("Xóa");
		btnEditDiemDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String thongBao = "";
				String sqlCheckMaSV    = "select * from SinhVien where MaSV = " + tfEditDiemMaSinhVien.getText();
				PreparedStatement pst = null;
				try {
					pst = connection.prepareStatement(sqlCheckMaSV);
					ResultSet rs = pst.executeQuery();
					if(rs.next()) {
						System.out.println("có");
//						JOptionPane.showMessageDialog(null, "Mã sinh viên Không tồn tại trong database");
					}else {
						JOptionPane.showMessageDialog(null, "Mã sinh viên Không tồn tại trong database");
						return;
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				if(tfEditDiemMaSinhVien.getText().equals("")) {
					thongBao = "Vui lòng điền mã sinh viên cần xóa";
				}
				
				if(thongBao.length() > 0) {
					JOptionPane.showMessageDialog(null, thongBao);
					return;
				}
				Diem diem = new Diem();
				diem.setMaSV(tfEditDiemMaSinhVien.getText());
				diem.setMaMH(cbbEditDiemMaMH.getSelectedItem().toString());
				ThaoTacDB thaoTacDiem = new ThaoTacDB();
				thaoTacDiem.deleteDiem(diem);
				JOptionPane.showMessageDialog(null, "Xóa Thành Công");
			}
		});
		btnEditDiemDel.setBounds(10, 414, 277, 44);
		panel_15.add(btnEditDiemDel);
		
		JButton btnEditDiemSave = new JButton("Save");
		btnEditDiemSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String thongBao = "";
				if(tfEditDiemMaSinhVien.getText().equals("") ) {
					thongBao = "Vui lòng điền đầy đủ thông tin";
				}

				if(thongBao.length() > 0) {
					JOptionPane.showMessageDialog(null, thongBao);
					return;
				}
				System.out.println(tfEditDiemMaSinhVien.getText() );
				Diem diem = new Diem();
				diem.setMaSV(tfEditDiemMaSinhVien.getText());
				diem.setMaMH(cbbEditDiemMaMH.getSelectedItem().toString());

				String dt = tfEditDiemDiemThi.getText();
				diem.setDiemThi(Double.parseDouble(dt));
			
				
				ThaoTacDB thaoTacDiem = new ThaoTacDB();
				thaoTacDiem.updateDiem(diem);
				JOptionPane.showMessageDialog(null, "Update Thông Tin Thành Công");
			}
		});
		btnEditDiemSave.setBounds(10, 359, 277, 44);
		panel_15.add(btnEditDiemSave);
		
		panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(null, "Th\u00F4ng Tin B\u1EA3ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(70, 130, 180)));
		panel_16.setBounds(317, 102, 740, 524);
		panel_1.add(panel_16);
		panel_16.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 25, 720, 488);
		panel_16.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(70, 130, 180)));
		panel_25.setBounds(317, 11, 740, 80);
		panel_1.add(panel_25);
		panel_25.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("Tìm Kiếm");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(10, 25, 142, 44);
		panel_25.add(lblNewLabel_17);
		
		tfEditSearch = new JTextField();
		tfEditSearch.setToolTipText("Có phân biệt chữ hoa và thường");
		tfEditSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel modelTb = (DefaultTableModel)table.getModel();
				String search = tfEditSearch.getText().trim();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelTb);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		tfEditSearch.setBounds(178, 25, 316, 44);
		panel_25.add(tfEditSearch);
		tfEditSearch.setColumns(10);
	}
}
