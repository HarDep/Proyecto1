package x.y.z.models;

import x.y.z.pojos.User;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.util.ArrayList;
import java.util.List;

public class ManagerUsers {
    private List<User> users;

    public ManagerUsers() {
        users = new ArrayList<>();
    }

    private void readUsers(){

        JSONParser jsonParser = new JSONParser();
        try(FileReader = new FileReader("Users.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray Users = (JSONArray) obj;

        for (Object User: Users){
            showUsers((JSONObject)user);
        }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }


}
