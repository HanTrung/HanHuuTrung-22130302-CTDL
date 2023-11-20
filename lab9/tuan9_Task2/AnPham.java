package tuan9_Task2;

import java.util.List;

public abstract class AnPham implements Comparable<AnPham>  {
	protected String tieuDe;
	protected int soTrang;
	protected int namXuatBan;
	protected String tacGia;
	protected double giaTien;

	public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien) {
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.giaTien = giaTien;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public String getTacGia() {
		return tacGia;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public abstract String getLoaiAnPham();

	// Phương thức kiểm tra hai ấn phẩm có cùng loại và cùng tác giả hay không
	public boolean cungLoaiVaTacGia(AnPham anPhamKhac) {
		return this.getLoaiAnPham().equals(anPhamKhac.getLoaiAnPham()) && this.tacGia.equals(anPhamKhac.tacGia);
	}
	@Override
    public int compareTo(AnPham anPham) {
        // Sắp xếp tăng dần theo tiêu đề
        int result = this.tieuDe.compareTo(anPham.tieuDe);

        // Nếu tiêu đề giống nhau, sắp xếp giảm dần theo năm xuất bản
        if (result == 0) {
            result = Integer.compare(anPham.namXuatBan, this.namXuatBan);
        }

        return result;
    }

	@Override
	public String toString() {
		return "tieu de: " + tieuDe + " so trang: " + soTrang + " nam xuat ban: " + namXuatBan + " tac gia: " + tacGia
				+ " gia tien: " + giaTien + "\n";
	}

	public abstract int soTrangChuongNhieuNhat();

}