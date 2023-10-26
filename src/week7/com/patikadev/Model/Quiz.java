package Week7.com.PatikaDev.Model;

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
}