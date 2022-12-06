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
    
    
}


