package do_an;

public class Diem {
	private String MaSV, MaMH;
	private double DiemThi;
	
	public Diem() {
	}

	public Diem(String maSV, String maMH, double diemThi) {
		this.MaSV = maSV;
		this.MaMH = maMH;
		this.DiemThi = diemThi;
	}

	public String getMaSV() {
		return MaSV;
	}

	public void setMaSV(String maSV) {
		MaSV = maSV;
	}

	public String getMaMH() {
		return MaMH;
	}

	public void setMaMH(String maMH) {
		MaMH = maMH;
	}

	public double getDiemThi() {
		return DiemThi;
	}

	public void setDiemThi(double diemThi) {
		DiemThi = diemThi;
	}

	
}
