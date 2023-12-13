package tuan12_task2;

public abstract class AnPham {
	protected String tieuDe;
	protected int soTrang;
	protected int namXuatBan;
	protected String tacGia;
	protected int gia;
	public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, int gia) {
		super();
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.gia = gia;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	
	//cau3. xac dinh loai an pham(Tap chi hay Sach tham khao)
	public abstract String loaiAnPham();
	
	//cau4 phuong thuc kiem tra an pham la tap tri va co thoi gian xuat ban cach day 10 nam hay khong
	public abstract boolean laTapChiXuatBan10Nam(int namHienTai);
	
	//cau5. phuong thuc kiem tra hai an pham co cung loai cung tac gia hay khong
	public boolean coCungTacGia(AnPham ap) {
		return this.loaiAnPham().equals(ap.loaiAnPham())&&this.tacGia.equals(ap.tacGia);
	}

}
