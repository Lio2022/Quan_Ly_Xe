public class xemay extends xe {
    private int congsuat;

    public xemay() {
    }

    public xemay(int id, String hsx, int namSx, int giaban, String mauXe, int congsuat) {
        super(id, hsx, namSx, giaban, mauXe);
        this.congsuat = congsuat;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", congsuat=" + congsuat +
                '}';
    }
}
