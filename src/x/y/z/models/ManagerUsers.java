package x.y.z.models;

import x.y.z.pojos.User;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class ManagerUsers {
    private List<User> users;

    public ManagerUsers() {
        users = new ArrayList<>();
    }

    private void updateUsers(){
        try {
            String json = new Gson().toJson(users);
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/users.json"));
            writer.write(json);
            writer.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }

}
