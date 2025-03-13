package curriculum_13;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		   // 1. 変数の宣言
		byte byteVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;
        char charVal;
        String stringVal;
        boolean booleanVal;
        // 2. 初期化
        byte byteVal = 0;         // バイト型（初期値: 0）
        short shortVal = 0;       // 短整数型（初期値: 0）
        int intVal = 0;           // 整数型（初期値: 0）
        long longVal = 0L;        // 長整数型（初期値: 0L）
        float floatVal = 0.0f;    // 単精度浮動小数点数型（初期値: 0.0f）
        double doubleVal = 0.0;   // 倍精度浮動小数点数型（初期値: 0.0）
        char charVal = '\u0000';  // 文字型（初期値: 空文字 '\u0000'）
        String stringVal = "";    // 文字列型（初期値: 空文字列 ""）
        boolean booleanVal = false; // ブーリアン型（初期値: false）
        //3.初期値を代入した変数に問題の値を代入
        byteVal = 10;
        shortVal = 100;
        intVal = 1000;
        longVal = 10000L;
        floatVal = 9.5f;
        doubleVal = 10.5;
        charVal = 'a';
        stringVal = "ハロー";
        booleanVal = true;
        // 4. コンソールに出力する
        //整数の合計
        System.out.println((byteVal + shortVal + intVal + longVal) + "\t" + (byteVal + shortVal + intVal + longVal));
        //整数の2倍
        System.out.println((byteVal * 2) + "\t" + (byteVal * 2));
        //文字型・文字列・真偽値の出力
        System.out.println(charVal + " " + stringVal + " " + booleanVal + "\t" + charVal + " " + stringVal + " " + booleanVal);
        //すべての数字を足す
        System.out.println((byteVal + shortVal + intVal + longVal + (int) floatVal + (int) doubleVal) + "\t" + (byteVal + shortVal + intVal + longVal + (int) floatVal + (int) doubleVal));
        //小数点以外の数字を掛ける
        System.out.println((long) (byteVal * shortVal * intVal * longVal) + "\t" + (long) (byteVal * shortVal * intVal * longVal));
        //10.5 を 100 で割る
        System.out.println((doubleVal / 100) + "\t" + (doubleVal / 100));
        //10 から 100 を引く
        System.out.println((byteVal - shortVal) + "\t" + (byteVal - shortVal));
        // 5. 文字列連結の修正 Integer.parseInt(num) を使い、String 型の "20" を int 型の 20 に変換
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
        // 6. 自己紹介
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        // 7. BMI 計算
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        // 8. 再代入
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";
        bmi = weight / ((height / 100) * (height / 100));
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
        // 9. 自己代入
        age += age;
        height += height;
        weight += weight;
        bmi = weight / ((height / 100) * (height / 100));
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        // 10. 年齢が25以上ならtrueを出力（if文を使わない）
        System.out.println(age >= 25);
        // 11. 文字列型に変換して連結
        String ageStr = String.valueOf(age);
        String heightStr = String.valueOf(height);
        String weightStr = String.valueOf(weight);
        System.out.println(ageStr + heightStr + weightStr);
        // 12. 年齢・身長を整数型に変換
        int ageInt = Integer.parseInt(ageStr);
        int heightInt = (int) Double.parseDouble(heightStr);
        System.out.println(ageInt);
        System.out.println(heightInt);
        // 13. 年齢が25もしくは身長が160以上ならtrueを出力（if文なし）
        System.out.println((ageInt == 25) || (heightInt >= 160));
	}

}
