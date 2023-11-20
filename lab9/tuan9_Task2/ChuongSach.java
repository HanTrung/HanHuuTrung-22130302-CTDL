package tuan9_Task2;

public class ChuongSach {
	private String tieuDe;
    private int soTrang;

    public ChuongSach(String tieuDe, int soTrang) {
        this.tieuDe = tieuDe;
        this.soTrang = soTrang;
    }
    
    
    public int getSoTrang() {
		return soTrang;
	}
    
@Override
public String toString() {
	return "tieu de: "+ tieuDe+" so trang: "+soTrang + "\n";
}


}