package baseball;

public class Review03 {

    public static void main(String[] args) {
        // インスタンス生成
        BaseBallTeam yakult = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam dena = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam jiants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        // 各インスタンスの結果を表示させる
        yakult.report();
        dena.report();
        tigers.report();
        jiants.report();
        carp.report();
        dragons.report();
    }

}
