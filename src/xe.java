import java.util.Scanner;

public abstract class xe {
    private int id;
    private String hsx;
    private int namSx;
    private int giaban;
    private String mauXe;

    public xe() {
    }

    Scanner sc = new Scanner(System.in);

    public xe(int id, String hsx, int namSx, int giaban, String mauXe) {
        this.id = id;
        this.hsx = hsx;
        this.namSx = namSx;
        this.giaban = giaban;
        this.mauXe = mauXe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHsx() {
        return hsx;
    }

    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    @Override
    public String toString() {
        return "xe{" +
                "id=" + id +
                ", hsx='" + hsx + '\'' +
                ", namSx=" + namSx +
                ", giaban=" + giaban +
                ", mauXe='" + mauXe + '\'';
    }
}

