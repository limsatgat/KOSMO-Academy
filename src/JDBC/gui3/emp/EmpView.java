package gui3.emp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EmpView<ActionEvenet> {

	private static final String EmpVO = null;
	// 화면 관련 멤버변수
	JFrame f;
	JTextField tfEmpno, tfEname, tfSal, tfJob;
	JButton bInsert, bUpdate, bDelete, bSelectAll;
	JTextArea ta;
	
	EmpModelImpl db;
	
	// 멤버변수 객체 생성
	EmpView() throws Exception{
		f = new JFrame("나의 연습");
		tfEmpno = new JTextField(10);
		tfEname = new JTextField(10);
		tfSal = new JTextField(10);
		tfJob = new JTextField(10);
		bInsert = new JButton("입력");
		bUpdate = new JButton("수정");
		bDelete = new JButton("삭제");
		bSelectAll = new JButton("전체검색");
		ta = new JTextArea();
		
		try {
			db = new EmpModelImpl();
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
	}
	
	// 화면 구성
	void addLayout() {
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1,2));
		
			JPanel pNorth1 = new JPanel();
			pNorth1.setLayout(new GridLayout(4,2));
			pNorth1.add(new JLabel("사번"));		pNorth1.add(tfEmpno);
			pNorth1.add(new JLabel("사원명"));		pNorth1.add(tfEname);
			pNorth1.add(new JLabel("월급"));		pNorth1.add(tfSal);
			pNorth1.add(new JLabel("업무"));		pNorth1.add(tfJob);
			
			JPanel pNorth2 = new JPanel();
			pNorth2.setLayout(new GridLayout(4,1));
			pNorth2.add(bInsert);
			pNorth2.add(bUpdate);
			pNorth2.add(bDelete);
			pNorth2.add(bSelectAll);
		
		pNorth.add(pNorth1);
		pNorth.add(pNorth2);
		
		f.add(pNorth, BorderLayout.NORTH);
		f.add(new JScrollPane(ta), BorderLayout.CENTER);

		f.setBounds(200, 200, 600, 500);
		f.setVisible(true);
	}
	
	// ******************************************************************************
	// 버튼 및 텍스트필드 이벤트 관련
	void eventProc() {
		
		// 사번 텍스트필드에서 엔터쳤을 때
		tfEmpno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchByEmpno();
			}
		});
		
		
		// 입력버튼이 눌렸을 때
		bInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				int empno = Integer.parseInt(tfEmpno.getText());
				String ename = tfEname.getText();
				String job = tfJob.getText(); 
				int sal = Integer.parseInt(tfSal.getText());;
				
				EmpVO r = new EmpVO();
				r.setEmpno(empno);
				r.setEname(ename);
				r.setJob(job);
				r.setSal(sal);
				//EmpVO r = new EmpVO(empno, ename, job, sal);
				
				try {
					db.insert(r);
					tfEmpno.setText(null);
					tfEname.setText(null);
					tfJob.setText(null);
					tfSal.setText(null);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "입력실패 :" + ex.getMessage());
				}
			}
		});
		
		// 수정 버튼이 눌렸을 때
		bUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int empno = Integer.parseInt(tfEmpno.getText());
				String ename = tfEname.getText();
				String job = tfJob.getText(); 
				int sal = Integer.parseInt(tfSal.getText());;
				
				EmpVO r = new EmpVO();
				r.setEmpno(empno);
				r.setEname(ename);
				r.setJob(job);
				r.setSal(sal);
				
				try {
					db.update(r);
					tfEmpno.setText(null);
					tfEname.setText(null);
					tfJob.setText(null);
					tfSal.setText(null);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "수정실패 :" + ex.getMessage());
				}
			}
		});
		
		// 삭제 버튼을 눌렀을 때
		bDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				int empno = Integer.parseInt(tfEmpno.getText());
				
				try {
						int result = db.delete(empno);
						if( result == 1) {
							JOptionPane.showMessageDialog(null, "삭제성공");
						}
						
				//화면 비우기
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "삭제실패 :" + ex.getMessage());
				}
			}
		});
		
		// 전체검색 버튼은 눌렀을 때
		bSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectAll();
		
			}
		});
	} // end of eventProc()
	
	void searchByEmpno() {
		int Empno = Integer.parseInt(tfEmpno.getText());
		try {
			EmpVO result = db.selectByEmpno(Empno);
			tfEmpno.setText(Integer.toString(result.getEmpno()));
			tfEname.setText(result.getEname());
			tfJob.setText(result.getJob());
			tfSal.setText(Integer.toString(result.getSal()));
		} catch(Exception ex) {
			System.out.println("검색실패:" + ex.getMessage());
		}
		}
	
	void selectAll() {
		try {
			ta.setText("-----검색결과------\n\n");
			ArrayList<EmpVO> result = db.selectAll();
			for(EmpVO vo : result) {
				ta.append(vo.toString());
			}
	
		} catch(Exception ex) {
			System.out.println("전체검색실패:" + ex.getMessage() );
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		EmpView view = new EmpView();
		view.addLayout();
		view.eventProc();

	}
}
