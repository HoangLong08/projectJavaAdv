package do_an;

public class SinhVien {
	private String MaSV, TenSV, GioiTinh, NgaySinh, DiaChi, DienThoai, MaLop;
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	
	public SinhVien(String maSV, String tenSV, String gioiTinh, String ngaySinh, String diaChi, String dienThoai, String maLop) {	
		this.MaSV = maSV;
		this.TenSV = tenSV;
		this.GioiTinh = gioiTinh;
		this.NgaySinh = ngaySinh;
		this.DiaChi = diaChi;
		this.DienThoai = dienThoai;
		this.MaLop = maLop;
	}

	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String maSV) {
		MaSV = maSV;
	}
	public String getTenSV() {
		return TenSV;
	}
	public void setTenSV(String tenSV) {
		TenSV = tenSV;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getDienThoai() {
		return DienThoai;
	}
	public void setDienThoai(String dienThoai) {
		DienThoai = dienThoai;
	}
	public String getMaLop() {
		return MaLop;
	}
	public void setMaLop(String maLop) {
		MaLop = maLop;
	}
	
}
