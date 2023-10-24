package Week7.com.PatikaDev.Model;

import Week7.com.PatikaDev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Content {
    private int id;
    private String name;
    private int course_id;
    private String description;
    private String youtubelink;
    private int quizId;
    private Course course;

    public Content(int id, String name, int course_id, String description, String youtubelink, int quizId) {
        this.course = Course.getFetch(course_id);
        this.id = id;
        this.name = name;
        this.course_id = course_id;
        this.description = description;
        this.youtubelink = youtubelink;
        this.quizId = quizId;
    }
    public static Content getFetch(int id) {
        Content obj = null;
        String query = "SELECT * FROM course WHERE id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Content();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
            }
            pr.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public Content() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYoutubelink() {
        return youtubelink;
    }

    public void setYoutubelink(String youtubelink) {
        this.youtubelink = youtubelink;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}


