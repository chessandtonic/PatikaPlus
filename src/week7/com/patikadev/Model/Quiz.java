package Week7.com.PatikaDev.Model;

import Week7.com.PatikaDev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Quiz {
    private int id;
    private int content_id;
    private String quiz_name;
    private String quiz_text;
    private static Content content;

    public Quiz(int id, int content_id, String quiz_name, String quiz_text) {
        this.content=Content.getFetch(content_id);
        this.id = id;
        this.content_id = content_id;
        this.quiz_name = quiz_name;
        this.quiz_text = quiz_text;
    }

    public Quiz(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public String getQuiz_name() {
        return quiz_name;
    }

    public void setQuiz_name(String quiz_name) {
        this.quiz_name = quiz_name;
    }

    public String getQuiz_text() {
        return quiz_text;
    }

    public void setQuiz_text(String quiz_text) {
        this.quiz_text = quiz_text;
    }

    public static Content getContent() {
        return content;
    }

    public static void setContent(Content content) {
        Quiz.content = content;
    }

    public static boolean add(String quiz_name, String quiz_text, int id) {
        String query = "INSERT INTO quiz (content_id, quiz_name, quiz_text) VALUES (?,?,?)";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            pr.setString(2, quiz_name);
            pr.setString(3, quiz_text);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<Quiz> getList(){
        ArrayList<Quiz> quizList= new ArrayList<>();
        Quiz obj;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM quiz");
            while(rs.next()){
                obj=new Quiz(rs.getInt("id"),rs.getInt("content_id"),rs.getString("quiz_name"),rs.getString("quiz_text"));
                quizList.add(obj);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quizList;
    }
}