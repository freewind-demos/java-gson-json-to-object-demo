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
        String json = new Gson().toJson(new User("java"));
        System.out.println(json);
    }

}


