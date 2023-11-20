package tuan9_Task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List<ChuongSach> chuongSachList = new ArrayList<>();
		chuongSachList.add(new ChuongSach("Chương 1: Giới thiệu", 10));
		chuongSachList.add(new ChuongSach("Chương 2: Pp nghiên cứu", 15));
		// Tạo sách tham khảo
		SachThamKhao sachThamKhao1 = new SachThamKhao("Sách Y", 200, 2022, "Le Thi D", 70.0, "Y học", chuongSachList);

		List<ChuongSach> chuongSachList2 = new ArrayList<>();
		chuongSachList2.add(new ChuongSach("Chương 1: Thể thao hiện đại", 12));
		chuongSachList2.add(new ChuongSach("Chương 2: Các kỹ thuật mới", 18));
		chuongSachList2.add(new ChuongSach("Chương 3: Các kỹ thuật cũ", 119));

		SachThamKhao sachThamKhao2 = new SachThamKhao("Sách Thể thao", 150, 2021, "Le Thi D", 60.0, "Thể thao",
				chuongSachList2);

		TapChi tapChi = new TapChi("Tạp chí ABC", 50, 2022, "Nguyen Van A", 25.0, "Tạp chí Khoa học");
		TapChi tapChi1 = new TapChi("Tạp chí 123", 50, 2022, "Nguyen Van A", 25.0, "Tạp chí Khoa CNTT ");

		DanhMucAnPham danhMucAnPham = new DanhMucAnPham();
		danhMucAnPham.themAnPham(sachThamKhao1);
		danhMucAnPham.themAnPham(tapChi);
		danhMucAnPham.themAnPham(sachThamKhao2);

		System.out.println("Loại ấn phẩm: ");
		System.out.println(sachThamKhao1.getLoaiAnPham());
		System.out.println(tapChi.getLoaiAnPham());

		System.out.print(tapChi.isTapChi());
		System.out.println(sachThamKhao1.cungLoaiVaTacGia(sachThamKhao2));
		System.out.println(danhMucAnPham.tongTienAnPham());

		System.out.println(danhMucAnPham.timSachThamKhaoNhieuTrangNhat());

		System.out.println(danhMucAnPham.isChuaTapChi(tapChi1));
		System.out.println(danhMucAnPham.tapChiXuatBanTrongNam(2021));
		danhMucAnPham.sapXepAnPham();

		danhMucAnPham.thongKeSoLuongTheoNam();

	}
}