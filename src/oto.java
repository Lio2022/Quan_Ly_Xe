public class oto extends xe {
    private int soChoNgoi;
    private String kieuDongCo;

    public oto() {
    }

    public oto(int id, String hsx, int namSx, int giaban, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(id, hsx, namSx, giaban, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}';
    }
}

