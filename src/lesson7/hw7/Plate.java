package lesson7.hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean ChangeFood(int changeFood) {
        if (changeFood < 0 || changeFood > food ) {

            return false;
        }

         else {
            food -= changeFood;
            return true;
        }
    }
    public boolean addFood(int changeFood){
        if(changeFood < 0){
            return false;
        }else {
            food+=changeFood;
            return true;
        }

    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
