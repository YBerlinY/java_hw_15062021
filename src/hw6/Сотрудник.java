package hw6;

public class Сотрудник {
    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private int зарплата;
    private int возраст;

    public Сотрудник() {
    }

    public Сотрудник(String ФИО, String должность, String email, String телефон, int зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }


    @Override
    public String toString() {
        return " Сотрудник {" +
                "ФИО='" + ФИО + '\'' +
                ", должность='" + должность + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + телефон + '\'' +
                ", зарплата=" + зарплата +
                ", возраст=" + возраст +
                '}' + '\n';
    }

    public String getФИО() {
        return ФИО;
    }

    public String getДолжность() {
        return должность;
    }

    public String getEmail() {
        return email;
    }

    public String getТелефон() {
        return телефон;
    }

    public int getЗарплата() {
        return зарплата;
    }

    public int getВозраст() {
        return возраст;
    }
}