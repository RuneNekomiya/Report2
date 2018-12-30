package jp.ac.uryukyu.ie.tnal;

/**
 * ChatBotの応答用データベース。
 * 下記3件は必須項目。
 *  1. 挨拶パターン: pattern = "greeting"
 *  2. 終了パターン: pattern = "bye."
 *  3. デフォルトパターン: pattern = "other"
 */
public class ReplyPattern {
    String pattern; //botへの想定入力
    String reply; //想定入力に対応する応答文

    //コンストラクタ
    public ReplyPattern(String pattern, String reply){
        this.pattern = pattern;
        this.reply = reply;
    }

    /**
     * 保存した入力＋応答文を標準出力するメソッド。
     */
    public void print(){
        System.out.println("pattern: " + pattern);
        System.out.println("reply: " + reply);
    }

    /**
     * 引数と合致するかを確認するメソッド。
     *  case 1: 合致するなら true を返す。
     *  case 2: 上記以外なら false を返す。
     */
    public boolean equals(String pattern){ return this.pattern.equals(pattern); }
}
