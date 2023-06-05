package Homework2;

public class Task1 {

    public void runProgram() {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        StringBuilder whereClause = new StringBuilder();

        boolean isFirstCondition = true;

        if (!getValueFromJson(json, "name").equals("null")) {
            appendCondition(whereClause, isFirstCondition, "name", getValueFromJson(json, "name"));
            isFirstCondition = false;
        }

        if (!getValueFromJson(json, "country").equals("null")) {
            appendCondition(whereClause, isFirstCondition, "country", getValueFromJson(json, "country"));
            isFirstCondition = false;
        }

        if (!getValueFromJson(json, "city").equals("null")) {
            appendCondition(whereClause, isFirstCondition, "city", getValueFromJson(json, "city"));
            isFirstCondition = false;
        }

        if (!getValueFromJson(json, "age").equals("null")) {
            appendCondition(whereClause, isFirstCondition, "age", getValueFromJson(json, "age"));
        }

        String sqlQuery = "SELECT * FROM students";
        if (whereClause.length() > 0) {
            sqlQuery += " WHERE " + whereClause.toString();
        }

        System.out.println(sqlQuery);
    }

    private String getValueFromJson(String json, String key) {
        int startIndex = json.indexOf(key) + key.length() + 3;
        int endIndex = json.indexOf("\"", startIndex);
        return json.substring(startIndex, endIndex);
    }

    private void appendCondition(StringBuilder whereClause, boolean isFirstCondition, String key, String value) {
        if (!isFirstCondition) {
            whereClause.append(" AND ");
        }
        whereClause.append(key).append(" = '").append(value).append("'");
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.runProgram();
    }
}

