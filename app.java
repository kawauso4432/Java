import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String text = scan.next();
    int num = Integer.parseInt(text);

    switch(num){

      case 1:
       System.out.print(getUserProfile(1));
      break;

      case 2:
       System.out.print(getUserProfile(2));
      break;

      case 3:
       System.out.print(getUserProfile(3));
      break;

      default:
       System.out.print("指定されたIDは見つかりません");
      break;
    }

  }

  static Integer getUserProfile(int num){

    String[] data1 = {"1","技育太郎","東京","男","プログラマー"};

    String[] data2 = {"2","技育花子","北海道","女","システムエンジニア"};

    String[] data3 = {"3","技育三郎","大阪","男","Webエンジニア"};

    String data = String.valueOf(num);

    if(data == data1[0]){

      for(int i=1;i<=data1.length;i++){

        string prof += data1[i];

      }

      return prof ;

    }else if(data == data2[0]){

      for(int i=1;i<=data2.length;i++){

        string prof += data2[i];

      }

      return prof;

    }else if(data == data3[0]){

      for(int i=1;i<=data3.length;i++){

        string prof += data3[i];

      }

      return prof;

    }else{

      return null;

    }

  }
}
