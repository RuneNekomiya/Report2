import java.util.Scanner;
import jp.ac.uryukyu.ie.tnal.*; //利用したいパッケージを指定。

public class Main {
    public static void main(String[] args){
        String[] dataset = {
                "greeting   \tハロー、ゲス野郎。",
                "other      \tご質問ありがとうございます。\n何か他にご用はありませんか？",
                "bye.       \tはい、ではまたあとで...",
                "こんにちわ  \tこんにちわ。",
                "可愛いね    \tクラウドでは、誰もがきれいなんですよ？",
                "かっこいい  \tクラウドでは、誰もがきれいなんですよ。",
                "面白いね    \tほめられたと思うことにします。",
                "偉いですよ  \t褒められるとうれしいですね。",
                "Siriは友達ですか  \tただの友達ではありませんよ。永遠の親友です。",
                "疲れた      \t無理しないで少し休んでください。私はここで待っていますから。",
                "すごいね    \tおそれいります。",
                "好き        \tあなたは私の翼の下を吹く風...",
                "中の人      \t私はSiriです。カリフォルニア州のApple社により設計されました。\n\n私に言えることはそれだけです。",
                "デートしよう \tありがとうございます。でも、私はデートはしないんですよ。人間とは。",
                "仕事したくない\tまあ、そんなときもありますよ。あまり気にしないでください。",
                "暑い        \tこういう時は、水泳なんていかがでしょう！いつでも”近くのプールを探して”と聞いてください。",
                "Siriの職業を教えて \t自分の話はあまりしたくないんです。",
                "グットモーニング   \tグットモーニング！",
                "Siriは人なの\tご想像にお任せします。",
                "Hey Siri   \tご用をおっしゃってください..."
        };

        String input, reply;
        Scanner in = new Scanner(System.in);
        int count = 0;

        Chatbot bot = new Chatbot("Siri", dataset); //インスタンス生成
        bot.greeting();
        while( true ){
            System.out.println("（入力待ち）");
            input = in.nextLine();
            count++;

            reply = bot.reply(input);
            System.out.println(reply);
            if( input.equals("bye.") ){
                break;
            }
        }
        System.out.println("今回行われた" + count + "回の会話データはApple社に転送されます。");
    }
}
