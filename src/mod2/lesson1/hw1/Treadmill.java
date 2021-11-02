package mod2.lesson1.hw1;

public class Treadmill implements Trials{
    public int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void Win(ParticipantsSkills participantsSkills) {
        participantsSkills.run(this);
    }
}
