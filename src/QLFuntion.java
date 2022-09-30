import java.util.*;

public class QLFuntion {
    ArrayList<xe> array = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int id, namSx, giaban, congsuat, trongtai, chongoi;
    String hsx, mauXe, kieudongco;

    public void nhapxe() {
        System.out.println(" Enter id :");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter hang san xuat: ");
        hsx = sc.nextLine();
        System.out.println("Enter nam san xuat:  ");
        namSx = Integer.parseInt(sc.nextLine());
        System.out.println(" Enter gia ban:");
        giaban = Integer.parseInt(sc.nextLine());
        System.out.println(" Enter mau xe:");
        mauXe = sc.nextLine();
    }

    public void nhapxemay() {
        nhapxe();
        System.out.println("Enter cong suat:");
        congsuat = Integer.parseInt(sc.nextLine());
    }

    public void nhapxetai() {
        nhapxe();
        System.out.println("Enter trong tai:");
        trongtai = Integer.parseInt(sc.nextLine());
    }

    public void nhapxeoto() {
        nhapxe();
        System.out.println("Enter so cho ngoi:");
        chongoi = Integer.parseInt(sc.nextLine());
        System.out.println("Enter kieu dong co:");
        kieudongco = sc.nextLine();
    }

    public ArrayList<xe> add() {
        System.out.println("Ban muon them 1. xe may  2. xe tai   3. oto");
        int number = Integer.parseInt(sc.nextLine());
        if (number == 1) {
            nhapxemay();
            xemay xemay = new xemay(id, hsx, namSx, giaban, mauXe, congsuat);
            array.add(xemay);
        } else if (number == 2) {
            nhapxetai();
            xetai xetai = new xetai(id, hsx, namSx, giaban, mauXe, trongtai);
            array.add(xetai);
        } else if (number == 3) {
            nhapxeoto();
            oto oto = new oto(id, hsx, namSx, giaban, mauXe, chongoi, kieudongco);
            array.add(oto);
        } else {
            System.out.println("Vui long nhap lai lua chon");
        }
        return array;
    }

    public void show() {
        for (Object x : array) {
            System.out.println(x);
        }
    }

    public void delete() {
        System.out.println("Ban muon xoa loai nao hay nhap vao ID :");
        int idXoa = Integer.parseInt(sc.nextLine());
        for (int i =0; i<array.size();i++) {
            if (array.get(i).getId() == idXoa) {
                array.remove(array.get(i));
            } else {
                System.out.println("khong co id nao trung voi id can xoa ");
            }
        }
    }

    public void edit() {
        int nhapID;
        int i = 0;
        System.out.println("Nhap id can sua.");
        nhapID = Integer.parseInt(sc.nextLine());
        while (i < array.size()) {
            if (array.get(i).getId() == nhapID) {
                if (array.get(i) instanceof xemay) {
                    nhapxemay();
                    xemay xemay = new xemay(id, hsx, namSx, giaban, mauXe, congsuat);
                    array.set(i, xemay);
                    break;
                } else if (array.get(i) instanceof xetai) {
                    nhapxemay();
                    xetai xetai = new xetai(id, hsx, namSx, giaban, mauXe, trongtai);
                    array.set(i, xetai);
                    break;
                } else if (array.get(i) instanceof oto) {
                    nhapxeoto();
                    oto oto = new oto(id, hsx, namSx, giaban, mauXe, chongoi, kieudongco);
                    array.set(i, oto);
                    break;
                } else {
                    System.out.println("Khong ton tai.");
                    break;
                }
            }
            i++;
        }
    }

    public void sapxep() {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).getId() > array.get(j).getId()) {
                    xe tmp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, tmp);
                }
            }
        }
    }

    public void timkiem() {
        System.out.println("Nhap hsx can tim kiem");
        String hsx = sc.nextLine();
        System.out.println("Nhap mau can tim kiem");
        String mauxe = sc.nextLine();
        ArrayList<xe> kq = new ArrayList<>();
        for (xe x : array) {
            if (x.getHsx().equals(hsx) && x.getMauXe().equals(mauxe)) {
                kq.add(x);
            }
        }
        for (xe y : kq) {
            System.out.println(y);
        }
    }
}


