class PlayerForward extends BasePlayer {
    private int jumlahGoal;
    private int jumlahAssist;
    private int jumlahShots;
    private int jumlahDribbles;

    public PlayerForward(String nama, String kebangsaan, int usia, int jumlahGoal, int jumlahAssist, int jumlahShots, int jumlahDribbles) {
        super(nama, kebangsaan, usia);
        this.jumlahGoal = jumlahGoal;
        this.jumlahAssist = jumlahAssist;
        this.jumlahShots = jumlahShots;
        this.jumlahDribbles = jumlahDribbles;
    }

    @Override
    public void ShowStats() {
        System.out.println("Nama: " + getNama());
        System.out.println("Warga Negara: " + getKebangsaan());
        System.out.println("Usia: " + getUsia());
        System.out.println("Jumlah Goal: " + jumlahGoal);
        System.out.println("Jumlah Asisst: " + jumlahAssist);
        System.out.println("Jumlah Shots: " + jumlahShots);
        System.out.println("Jumlah Dribbles: " + jumlahDribbles);
    }
}