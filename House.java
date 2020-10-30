class House implements Comparable<House>{

private String adress;
private int price_house;
private int size_house;
private static int numHouses = 0;

public House(String hadress, int price, int size){
  adress = hadress;
  price_house = price;
  size_house = size;
  numHouses ++;
}

public String getAdress(){
  return adress;
}

public int getPrice(){
  return price_house;
}

public int getSize(){
  return size_house;
}

public String toString(){
  return "The adress of the house is " + getAdress() + ". It is  amagnificent house at a price of " + getPrice() + ". The square footage of the house is " + getSize() + " square feet";
}

public static int getNumHouses(){
  return numHouses;
}



public boolean compareToHouse(House h1){

  if(this.getAdress() == h1.getAdress()){
return true; 
  }
  else {
    return false;
  }

  }

  public int compareTo(House h1){
    
    if(this.getPrice() > h1.getPrice()){
      return 1;
    }
    else if (this.getPrice()<h1.getPrice()){
      return -1;
    }

    else{
      return 0;
    }
    // if this' price is less than that price return -1
    //if the opposite return 1
    //same return 0
  }




//create a compare to method. Take in house, compares the house called in the method to the house that gets passed into as an argument.
//make two houses in the main and call the method from House class.

}