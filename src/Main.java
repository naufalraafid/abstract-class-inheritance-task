public class Main {
    public static void main(String[] args) {
        System.out.println("===== STATISTIK LIGA 2023/2024 =====");
        System.out.println();

        PlayerForward playerForward = new PlayerForward("Kylian Mbappe", "Perancis", 24, 13, 1, 55, 24);
        playerForward.ShowStats();
        System.out.println();

        PlayerMidfielder playerMidfielder = new PlayerMidfielder("Jamal Musiala", "Jerman", 20, 2, 2, 20, 143, 10);
        playerMidfielder.ShowStats();
        System.out.println();

        PlayerDefender playerDefender = new PlayerDefender("Levi Colwill", "Inggris", 21, 1, 0, 14, 2, 57, 12);
        playerDefender.ShowStats();
        System.out.println();
    }
}