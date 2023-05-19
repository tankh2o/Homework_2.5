public class Main {
    public static void main(String[] args) {
        String login = "g0stFace_561";
        String password = "ltlbycfql561";
        String confirmPassword = "ltlbycfql561";

        try {
            Registration.registration(login, password, confirmPassword);
        } catch (WrongLoginException eLogin) {
            System.out.println("В логине что-то не так...");
        } catch (WrongPasswordException ePassword) {
            System.out.println("В пароле что-то не так...");
            ePassword.printStackTrace();
            // если добавить метод .printStackTrace(),
            // использующий поток вывода не .out., а error, он будет иметь красный формат
        } finally {
            System.out.println("Посмотри наверх. Ошибок нет? Значит работа окончена.");
        }
    }
}