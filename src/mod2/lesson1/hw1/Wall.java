package mod2.lesson1.hw1;

public class Wall implements Trials {
    public   float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public void Win(ParticipantsSkills participantsSkills) {
        participantsSkills.jump(this);
    }
}

