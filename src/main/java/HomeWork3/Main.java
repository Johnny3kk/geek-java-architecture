package HomeWork3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        User user = new UserBuilder()
                .id(111)
                .name("Max")
                .password("qwerty")
                .email("maxim55@mail.com")
                .age(55)
                .roles(new HashSet<Role>())
                .build();

        System.out.println(user.getId().equals(111));
        System.out.println(user.getName().equals("Max"));
        System.out.println(user.getEmail().equals("maxim55@mail.com"));
    }

}
