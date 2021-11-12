package demo;

import com.google.gson.Gson;

class User {
    public String name;

    public User(String name) {
        this.name = name;
    }
}

public class Hello {

    public static void main(String[] args) {
        var json = """
                {"name": "Hello"}
                """;
        var user = new Gson().fromJson(json, User.class);
        System.out.println(user);
    }

}


