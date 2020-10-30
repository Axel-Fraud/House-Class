import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    
   House house1 = new House("pickle rd", 7654, 5000);

   House house2 = new House("pickle rd", 427, 5000);

   House house3 = new House("rice rd", 934, 5000);

   House house4 = new House("rice rd", 198, 5000);

   
System.out.println(house1.compareTo(house2));
System.out.println(house1.compareTo(house3));

System.out.println(House.getNumHouses());

House[] array = new House[4];
array[0] = house1;
array[1] = house2;
array[2] = house3;
array[3] = house4;

Arrays.sort(array);
System.out.println(Arrays.toString(array));


  }

  public static int addUp(int x, int y){
    return x+y;
  }


}