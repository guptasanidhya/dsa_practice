public class Main {
    public static void main(String[] args) {

      int money =20;
        int children =3;
      if(money<children){
          System.out.println(-1);
      }
      if (money%8==0 && money%children==0){
          int remainder= money/8;
          if(remainder==children){
              System.out.println(remainder);
              System.exit(0);
          }
      }

          int count=0;
          int children_count=children;
          while(money>8   && count<children-1) {
              if (money-8!=4) {
                  money = money - 8;
                  count++;
                  children_count--;
              } else if (money != 4 && count<children_count) {
                  money = money - 8;
                  count++;
                  children_count--;
              }
          }
          if(money<children_count){
              count--;
          }
          System.out.println(count);

//      }
    }
}