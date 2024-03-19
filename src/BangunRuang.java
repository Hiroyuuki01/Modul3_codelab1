public class BangunRuang {
    private String name;

    BangunRuang(String name){

        this.name = name;
    }

    public void inputNilai(){

        System.out.println("\nInput nilai" + name);
    }

    public void luasPermukaan(){

        System.out.println("\nMenghitung luas permukaan bangun"  + name);
    }

    public void volume(){

        System.out.println("\nMenghitung volume bangun" + name);
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public static void main(String[] args) {
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");
        Balok balok = new Balok("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

    }

}

