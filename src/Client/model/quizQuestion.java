package Client.model;

import java.util.ArrayList;

public class quizQuestion {

    int question_id , numberofchoices ;
    String question_data , student_ans , doctor_ans ;
    ArrayList<String> choicedata ;

    public quizQuestion(int question_id, int numberofchoices, String question_data, ArrayList<String> choicedata) {
        this.question_id = question_id;
        this.numberofchoices = numberofchoices;
        this.question_data = question_data;
        this.choicedata = choicedata;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getNumberofchoices() {
        return numberofchoices;
    }

    public void setNumberofchoices(int numberofchoices) {
        this.numberofchoices = numberofchoices;
    }

    public String getQuestion_data() {
        return question_data;
    }

    public void setQuestion_data(String question_data) {
        this.question_data = question_data;
    }

    public String getStudent_ans() {
        return student_ans;
    }

    public void setStudent_ans(String student_ans) {
        this.student_ans = student_ans;
    }

    public String getDoctor_ans() {
        return doctor_ans;
    }

    public void setDoctor_ans(String doctor_ans) {
        this.doctor_ans = doctor_ans;
    }

    public ArrayList<String> getChoicedata() {
        return choicedata;
    }

    public void setChoicedata(ArrayList<String> choicedata) {
        this.choicedata = choicedata;
    }

}
