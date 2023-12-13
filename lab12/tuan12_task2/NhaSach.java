package tuan12_task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NhaSach {
	private List<AnPham> danhSachAnPham = new ArrayList<>();
	
	public void add(AnPham ap) {
		this.danhSachAnPham.add(ap);
	}
	public String toString() {
		return danhSachAnPham.toString();
	}
	//cau 6. Tinh tong tien tat ca an oham co trong Nha Sach
	public long tongTien() {
		return danhSachAnPham.stream().collect(Collectors.summarizingLong(AnPham::getGia)).getSum();	}

	//cau7. Timquyen sach tham khao co chuong sach nhieu trang nhat
	public AnPham timSachThamKhaoNhieuTrangNhat() {
		Comparator<AnPham> comp=(ap1,ap2)->{
			SachThamKhao tk1=(SachThamKhao) ap1;
			SachThamKhao tk2= (SachThamKhao) ap2;
			return Long.compare(tk1.getMaxChuongSach().getSoTrang(), tk2.getMaxChuongSach().getSoTrang());
		};
		return danhSachAnPham.stream().filter(x -> x.loaiAnPham().equals("Sach tham khao")).max(comp).get();
	}
	
	//cau 8. tim trong danh sach an pham co ten tap chi cho truoc hay khong
	public boolean coChuaTapChi(String tenTapChi) {
		return danhSachAnPham.stream().filter(x->x.loaiAnPham().equals("Tap Chi")).filter(x->((TapChi) x).getTenTapChi().equals(tenTapChi)).count()!=0;
	}
	
	//cau9. lay danh sach casc tap chi duoc xuat ban vao 1 nam cho truoc
	public List<AnPham> danhSachTapChi(int namXuatBan){
		return danhSachAnPham.stream().filter(x->x.loaiAnPham().equals("Tap Chi")).filter(x->(x.getNamXuatBan()==namXuatBan)).toList();
	}
	
	//cau 10 sap xep an pham tang dna theo tieu de va giam dan theo nam xuat ban
	public void sapXepTheoTieuDeVaNamXuatBan() {
		Comparator<AnPham> comp= Comparator.comparing(AnPham::getTieuDe).thenComparing(AnPham::getNamXuatBan,Comparator.reverseOrder());
		danhSachAnPham.sort(comp);
	}
	
	//cau11. Thong ke so luong an pham theo nam xuat ban
	public Map<Integer,Long> thongKeSoLuongAnPhamTheoNamXuatBan(){
		return danhSachAnPham.stream().collect(Collectors.groupingBy(AnPham::getNamXuatBan,Collectors.counting()));
	}

}
