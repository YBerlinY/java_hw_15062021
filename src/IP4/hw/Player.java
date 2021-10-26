package IP4.hw;

public class Player {
    private String name;
    VARIANTS variants;
    public int random;

    private int random() {
        return (int) (Math.random() * 3);
    }

    public Player() {
        this.name = "Bot";
        random = random();
        switch (random) {
            case 0:
                this.variants = VARIANTS.PAPER;
                break;
            case 1:
                this.variants = VARIANTS.ROCK;
                break;
            case 2:
                this.variants = VARIANTS.SCISSORS;
                break;
        }
    }

    public Player(VARIANTS variants, String name) {
        this.name = name;
        this.variants = variants;
    }


    public String whoWins(Player bot, Player alex) {
        if (bot.variants == VARIANTS.SCISSORS) {
            return "Ничья";
        } else if (bot.variants == VARIANTS.ROCK) {
            return "Игрок " + bot.name + " победил!";
        } else  {
            return "Игрок " + alex.name + " победил!";
        }

    }
}