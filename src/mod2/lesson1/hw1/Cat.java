package mod2.lesson1.hw1;

public class Cat  implements ParticipantsSkills {
    private int rLim;
    private float jLim;
    private String name;
    private Enum type;
    private boolean play;


    public Cat(Enum type, String name,int rLim,float jLim) {
        this.type=type;
        this.name=name;
        this.rLim=rLim;
        this.jLim=jLim;
        this.play=true;


    }

    @Override
    public void run(Treadmill treadmill) {
        if (!play){
            return;
        }
        if (rLim>=treadmill.distance){
            System.out.println("Участник: "+type+" "+name+" успешно преодолел дистанцию длинной "+treadmill.distance+" метров");
            return;
        }else {
            play = false;
            System.out.println("При преодолении дистанции длинной "+treadmill.distance+" метров, участник: "+type+" "+name+" сошёл с дистанции");
        }
    }


    @Override
    public void jump(Wall wall) {
        if (!play){
            return;
        }
        if (jLim>=wall.height){
            System.out.println("Участник: "+type+" "+name+" успешно преодолел стену  высотой "+wall.height+" метров");
            return;
        }else {
            play = false;
            System.out.println("При преодолении стены высотой "+wall.height+" метров, участник: "+type+" "+name+" сошёл с дистанции");
        }
    }

    @Override
    public boolean isPlay() {
        return play;

    }
    @Override
    public String toString() {
        return type +" "+ name;
    }
}

