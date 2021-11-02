package mod2.lesson1.hw1;

public class AppHw1 {
    public static void main(String[] args) {
//        Практическое задание
//
//        1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь
//        бегать и прыгать (методы просто выводят информацию о действии в консоль).
//
//        2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны
//        выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
//        (успешно пробежал, не смог пробежать и т.д.).
//
//        3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий.
//        * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
//        на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.


        ParticipantsSkills[] participants = {
                new Human(Type.HUMAN, "Rob", 1050, 1.2f),
                new Human(Type.HUMAN, "Lisa", 750, 1.5f),
                new Cat(Type.CAT, "Barsik", 751, 2.1f),
                new Cat(Type.CAT, "Chernish", 450, 2.3f),
                new Robot(Type.ROBOT, "r579", 7960, 0f),
                new Robot(Type.ROBOT, "l679", 10500, 1.3f)
        };
        Trials[] trials = {
                new Treadmill(500),
                new Wall(1.2f),
                new Treadmill(700),
                new Treadmill(500),
                new Wall(1.6f),
        };


        for (Trials trial : trials) {
            for (ParticipantsSkills participant : participants) {
                trial.Win(participant);
            }
        }
        for (ParticipantsSkills participant : participants) {
            if (participant.isPlay()){
                System.out.println("Участник: "+participant+" победил!");
            }


        }
    }
}

