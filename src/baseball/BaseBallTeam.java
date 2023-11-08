package baseball;

public class BaseBallTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;

    //引数なしコンストラクタ
    public BaseBallTeam() {
    }

    // コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率計算メソッド
    public double getRate() {
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    // 結果出力メソッド(メソッド内で勝率計算メソッドを実行)
    public void report() {
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + getRate() + "です。");
    }

    //ゲッター
    public String getName() {
        return name;
    }
    // セッター
    public void setName(String name) {
        this.name = name;
    }
    //ゲッター
    public int getWin() {
        return win;
    }
    // セッター
    public void setWin(int win) {
        this.win = win;
    }
    //ゲッター
    public int getLose() {
        return lose;
    }
    // セッター
    public void setLose(int lose) {
        this.lose = lose;
    }
    //ゲッター
    public int getDraw() {
        return draw;
    }
    // セッター
    public void setDraw(int draw) {
        this.draw = draw;
    }

}
