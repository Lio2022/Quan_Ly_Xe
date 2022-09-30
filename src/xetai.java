public class xetai extends xe {
    private int trongTai;

    public xetai(int trongTai) {
        this.trongTai = trongTai;
    }

    public xetai(int id, String hsx, int namSx, int giaban, String mauXe, int trongTai) {
        super(id, hsx, namSx, giaban, mauXe);
        this.trongTai = trongTai;
    }

    public xetai() {

    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trongTai=" + trongTai +
                '}';
    }
}
