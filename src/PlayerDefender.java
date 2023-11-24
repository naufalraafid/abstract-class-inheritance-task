class PlayerDefender extends BasePlayer {
    private int jumlahYellowCard;
    private int jumlahRedCard;
    private int jumlahTackles;
    private int jumlahBlocks;
    private int jumlahDuels;
    private int jumlahInterception;

    public PlayerDefender(String nama, String kebangsaan, int usia,int jumlahYellowCard, int jumlahRedCard,  int jumlahTackles, int jumlahBlocks, int jumlahDuels, int jumlahInterception) {
        super(nama, kebangsaan, usia);
        this.jumlahYellowCard = jumlahYellowCard;
        this.jumlahRedCard = jumlahRedCard;
        this.jumlahTackles = jumlahTackles;
        this.jumlahBlocks = jumlahBlocks;
        this.jumlahDuels = jumlahDuels;
        this.jumlahInterception = jumlahInterception;
    }

    @Override
    public void ShowStats() {
        System.out.println("Nama: " + getNama());
        System.out.println("Warga Negara: " + getKebangsaan());
        System.out.println("Usia: " + getUsia());
        System.out.println("Jumlah Kartu Kuning: " + jumlahYellowCard);
        System.out.println("Jumlah Kartu Merah: " + jumlahRedCard);
        System.out.println("Jumlah Tackles: " + jumlahTackles);
        System.out.println("Jumlah Blocks: " + jumlahBlocks);
        System.out.println("Jumlah Duels: " + jumlahDuels);
        System.out.println("Jumlah Interception: " + jumlahInterception);
    }
}