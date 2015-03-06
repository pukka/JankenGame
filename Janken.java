import java.io.*;
import java.util.Random;

class Janken {
  public static void main(String[] args) throws IOException {

    String com, user;
    int com_num, user_num;

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.println("あなたは何を出しますか？？");
    System.out.println("1:グー, 2:チョキ, 3:パー");
    user = br.readLine();
    user_num = Integer.parseInt(user);

    Random rnd = new Random();
    com_num = rnd.nextInt(3) + 1;

    switch(com_num) {
      case 1:
        com = "グー";
        break;
      case 2:
        com = "チョキ";
        break;
      case 3:
        com = "パー";
        break;
      default:
        com = "ERROR";
    }

    System.out.println("コンピュータは" + com + "です。");

    if( com_num == user_num ){
      System.out.println("あいこです。");
    } else if( com_num == 1 && user_num == 2 ) {
      System.out.println("コンピュータの勝ちです");
    } else if( com_num == 2 && user_num == 3 ) {
      System.out.println("コンピュータの勝ちです");
    } else if( com_num == 3 && user_num == 1) {
      System.out.println("コンピュータの勝ちです");
    } else {
      System.out.println("プレイヤーの勝ちです");
    }
  }
}
