/*
 * V. He
 * Dec 6th, 2022
 * Class for Quiz Questions
 */
package hhlprojectmanagement;

public class QuizQ {
    private String que;
    private int value;
    int ans;
    private String feedback;

    public QuizQ(String que, int value, int ans) {
        this.que = que;
        this.value = value;
        this.ans = ans;
    }

    public QuizQ(String que, int value, int ans, String feedback) {
        this.que = que;
        this.value = value;
        this.ans = ans;
        this.feedback = feedback;
    }

    public String getQue() {
        return que;
    }

    public int getValue() {
        return value;
    }

    public int getAns() {
        return ans;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String toString() {
        return "QuizQ{" + "que=" + que + ", value=" + value + ", ans=" + ans + ", feedback=" + feedback + '}';
    }
}