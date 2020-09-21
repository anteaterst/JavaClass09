import java.util.scanner;

class Main {
  public static void main(String[] args) {
    // Car k3 = new Car("k3", "서울999-999",1660,1500,3640,40,0,35,0,12,0)
    // Car k5 = new Car("k5", "서울888-888",1660,1525,3695,41,0,35,0,12,0)

    // k3.putSpec();
    // System.out.println();
    // k5.putSpec;

    //대화형으로 객체 생성

    Scanner dtdIn = new Scanner(Sytem.in);

    System.out.print("차량의 데이터를 입력하세요.");
    System.out.print("이름 :");String name = stdIn.next();
    System.out.print("번호 :");String number = stdIn.next();
    System.out.print("전폭 :");int widght = stdIn.next();
    System.out.print("전고 :");int height = stdIn.next();
    System.out.print("전장 :");int length = stdIn.next();
    System.out.print("x :");double x = stdIn.Double();
    System.out.print("y :");double y = stdIn.Double();
    System.out.print("탱크 :");double tank = stdIn.Double();
    System.out.print("연료 :");double fuel = stdIn.Double();
    System.out.print("연비 :");double sfc = stdIn.Double();

    Car myCar = new Car(name,number,width,height,length,x,y,tank,fuel,sfc);

    while (true) {
      System.out.printf("현재 위치:(%.2f, %.2f)\n",myCar.getX(),myCar.getY());
      System.out.printf("남은 연료: %.2f\n",myCar.getFuel());
      System.out.print("이동하시겠습니까?[0__No / 1__Yes] : ");
      if(stdIn.nextInt)

    }


  }
}