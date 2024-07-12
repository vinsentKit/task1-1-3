package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        // Создание таблицы User(ов)
        userService.createUsersTable();

        // Добавление 4 User(ов) в таблицу с данными на свой выбор
        userService.saveUser("John", "Doe", (byte) 30);
        System.out.println("User с именем – John добавлен в базу данных");

        userService.saveUser("Jane", "Doe", (byte) 25);
        System.out.println("User с именем – Jane добавлен в базу данных");

        userService.saveUser("Alice", "Smith", (byte) 35);
        System.out.println("User с именем – Alice добавлен в базу данных");

        userService.saveUser("Bob", "Johnson", (byte) 28);
        System.out.println("User с именем – Bob добавлен в базу данных");

        // Получение всех User из базы и вывод в консоль
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        // Очистка таблицы User(ов)
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();

    }
}
