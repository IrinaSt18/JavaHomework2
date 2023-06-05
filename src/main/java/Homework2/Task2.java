package Homework2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2 {
    public static void parseJsonString(String jsonString) {
        JSONParser parser = new JSONParser();

        try {
            JSONArray jsonArray = (JSONArray) parser.parse(jsonString);

            StringBuilder stringBuilder = new StringBuilder();
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                String surname = (String) jsonObject.get("surname");
                String grade = (String) jsonObject.get("grade");
                String subject = (String) jsonObject.get("subject");

                stringBuilder.append("Student ")
                        .append(surname)
                        .append(" get ")
                        .append(grade)
                        .append(" subject ")
                        .append(subject)
                        .append(".\n");
            }

            System.out.println(stringBuilder.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

