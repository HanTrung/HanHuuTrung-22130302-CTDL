package tuan9_Task2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SachThamKhao extends AnPham {
	private String linhVuc;
	private List<ChuongSach> chuongSachList;

	public SachThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien, String linhVuc,
			List<ChuongSach> chuongSachList) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.linhVuc = linhVuc;
		this.chuongSachList = chuongSachList;
	}

	@Override
	public String getLoaiAnPham() {
		// TODO Auto-generated method stub
		return "Sách tham khảo";
	}

	public List<ChuongSach> getChuongSachList() {
		return chuongSachList;
	}

	public int soTrangChuongNhieuNhat() {
		int soTrangMax = Integer.MIN_VALUE;
		for (ChuongSach chuong : chuongSachList) {
			if (chuong.getSoTrang() > soTrangMax) {
				soTrangMax = chuong.getSoTrang();
			}
		}
		return soTrangMax;
	}

	@Override
	public String toString() {
		return "tieu de: " + tieuDe + " so trang: " + soTrang + " nam xuat ban: " + namXuatBan + " tac gia: " + tacGia
				+ " gia tien: " + giaTien + " linh vuc: " + linhVuc + " chuong sach :" + chuongSachList + "\n";

	}

	@Override
	public double getGiaTien() {
		// TODO Auto-generated method stub
		return super.getGiaTien();
	}
}