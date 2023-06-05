package Homework2;

public class Main {
    public static void main(String[] args) {
        String jsonString = "[{\"surname\":\"IVANOV\",\"grade\":\"5\",\"subject\":\"Math\"},{\"surname\":\"Petrova\",\"grade\":\"4\",\"subject\":\"Inform\"},{\"surname\":\"Krasnov\",\"grade\":\"5\",\"subject\":\"Fizika\"}]";
        Task2.parseJsonString(jsonString);
    }
}
