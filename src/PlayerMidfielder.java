class PlayerMidfielder extends BasePlayer {
    private int jumlahGoal;
    private int jumlahAssist;
    private int jumlahDribbles;
    private int jumlahUmpan;
    private int jumlahPeluangKunci;

    public PlayerMidfielder(String nama, String kebangsaan, int usia, int jumlahGoal, int jumlahAssist, int jumlahDribbles, int jumlahUmpan, int jumlahPeluangKunci) {
        super(nama, kebangsaan, usia);
        this.jumlahGoal = jumlahGoal;
        this.jumlahAssist = jumlahAssist;
        this.jumlahDribbles = jumlahDribbles;
        this.jumlahUmpan = jumlahUmpan;
        this.jumlahPeluangKunci = jumlahPeluangKunci;
    }

    @Override
    public void ShowStats() {
        System.out.println("Nama: " + getNama());
        System.out.println("Warga Negara: " + getKebangsaan());
        System.out.println("Usia: " + getUsia());
        System.out.println("Jumlah Goal: " + jumlahGoal);
        System.out.println("Jumlah Asisst: " + jumlahAssist);
        System.out.println("Jumlah Dribbles: " + jumlahDribbles);
        System.out.println("Jumlah Umpan: " + jumlahUmpan);
        System.out.println("Jumlah Peluang Tercipta: " + jumlahPeluangKunci);
    }
}