package do_an;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ThaoTacDB {
	Connection connection = null;
	
	public boolean insert(SinhVien sv) throws SQLException {
		String sql = "insert into SinhVien(MaSV, TenSV, GioiTinh, NgaySinh, DiaChi, DienThoai, MaLop) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			connection = connect.dbConnect();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, sv.getMaSV());
			pst.setString(2, sv.getTenSV());
			pst.setString(3, sv.getGioiTinh());
			pst.setString(4, sv.getNgaySinh());
			pst.setString(5, sv.getDiaChi());
			pst.setString(6, sv.getDienThoai());
			pst.setString(7, sv.getMaLop());
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	
	public void update(SinhVien sv) {
		String sql = "Update SinhVien SET MaSV = ?, TenSV = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, DienThoai = ?, MaLop = ? WHERE MaSV = ?";
		try {
			connection = connect.dbConnect();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, sv.getMaSV());
			pst.setString(2, sv.getTenSV());
			pst.setString(3, sv.getGioiTinh());
			pst.setString(4, sv.getNgaySinh());
			pst.setString(5, sv.getDiaChi());
			pst.setString(6, sv.getDienThoai());
			pst.setString(7, sv.getMaLop());
			pst.setString(8, sv.getMaSV());
			pst.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void delete(SinhVien sv) {
		String sql = "Delete from SinhVien WHERE MaSV = ?";
		try {
			connection = connect.dbConnect();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, sv.getMaSV());
			pst.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//   ----------------------- Diem -----------------------
	public boolean insertDiem(Diem diem) throws SQLException {
		String sql = "insert into Diem(MaSV, MaMH, DiemThi) values(?, ?, ?)";
		try {
			connection = connect.dbConnect();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, diem.getMaSV());
			pst.setString(2, diem.getMaMH());
			pst.setDouble(3, diem.getDiemThi());
			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	public void updateDiem(Diem diem) {
		String sql = "Update Diem SET MaSV = ?, MaMH = ?, DiemThi = ? WHERE MaSV = ? and MaMH = ?";
		try {
			connection = connect.dbConnect();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, diem.getMaSV());
			pst.setString(2, diem.getMaMH());
			pst.setDouble(3, diem.getDiemThi());
			pst.setString(4, diem.getMaSV());
			pst.setString(5, diem.getMaMH());
			pst.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void deleteDiem(Diem diem) {
		String sql = "Delete from Diem WHERE MaSV = ? and MaMH = ?";
		try {
			connection = connect.dbConnect();
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, diem.getMaSV());
			pst.setString(2, diem.getMaMH());
			pst.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
