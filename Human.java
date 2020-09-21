class Human {

  private String name;
  private int height;
  private int weight;

  // 생성자 // constructor
  //1. 이름이 클래스와 같다
  //2. 반환형이 없다.

  Human(String n, int h, int w){
    name = n; 
    height = h;
    weight=w;
  }

  String getName() { return name;}
  int getHeight() { return height;}
  int getWeight() { return weight;}

  void gainWeight(int w) { weight += w;} //몸무게 증가
  void reduceWeight(int w) {weight -= w ;} // 몸무게 감소

}
