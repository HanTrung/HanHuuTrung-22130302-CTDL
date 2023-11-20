package tuan9_Task2;


public class TapChi extends AnPham {
	private String tenTapChi;

    public TapChi(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien, String tenTapChi) {
        super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
        this.tenTapChi = tenTapChi;
    }
public String getTenTapChi() {
	return tenTapChi;
}
	@Override
	public String getLoaiAnPham() {
		// TODO Auto-generated method stub
		return "Tạp chí";
	}
	
	public boolean isTapChi() {
		if(this.getLoaiAnPham() == "Tạp chí" &&  (this.getNamXuatBan() >= 2011 && this.getNamXuatBan() <= 2021) ) {
			return true;
		}
		return false;
	}
@Override
public double getGiaTien() {
	// TODO Auto-generated method stub
	return super.getGiaTien();
}
	@Override
	public String toString() {
		return "tieu de: " + tieuDe + " so trang: " + soTrang + " nam xuat ban: " + namXuatBan + " tac gia: " + tacGia
				+ " gia tien: " + giaTien +" ten tap chi: "+ tenTapChi + "\n";
	}

	@Override
	public int soTrangChuongNhieuNhat() {
		// TODO Auto-generated method stub
		return 0;
	}

}