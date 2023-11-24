abstract class BasePlayer {
    private String nama;
    private String kebangsaan;
    private int usia;

    public BasePlayer(String nama, String kebangsaan, int usia) {
        this.nama = nama;
        this.kebangsaan = kebangsaan;
        this.usia = usia;
    }

    public abstract void ShowStats();

    public String getNama() {
        return nama;
    }

    public String getKebangsaan() {
        return kebangsaan;
    }

    public int getUsia() {
        return usia;
    }
}