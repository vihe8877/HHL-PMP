/*
 * V. He
 * Dec 6th, 2022
 * Class for Quiz Questions
 */
package hhlprojectmanagement;

public class QuizQ {
    private String que, ans, feedback, opA, opB, opC, opD;
    private int value;

    public QuizQ(String que, int value, String ans) {
        this.que = que;
        this.value = value;
        this.ans = ans;
    }

    public QuizQ(String que, int value, String ans, String feedback) {
        this.que = que;
        this.value = value;
        this.ans = ans;
        this.feedback = feedback;
    }

    public QuizQ(String que, String ans, String feedback, String opA, String opB, String opC, String opD, int value) {
        this.que = que;
        this.ans = ans;
        this.feedback = feedback;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = opD;
        this.value = value;
    }

    public QuizQ(String que, String ans, String opA, String opB, String opC, String opD, int value) {
        this.que = que;
        this.ans = ans;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = opD;
        this.value = value;
    }
    

    public String getQue() {
        return que;
    }

    public int getValue() {
        return value;
    }

    public String getAns() {
        return ans;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getOpA() {
        return opA;
    }

    public String getOpB() {
        return opB;
    }

    public String getOpC() {
        return opC;
    }

    public String getOpD() {
        return opD;
    }
    
    public void setValue(int value) {
        this.value = value;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public void setOpA(String opA) {
        this.opA = opA;
    }

    public void setOpB(String opB) {
        this.opB = opB;
    }

    public void setOpC(String opC) {
        this.opC = opC;
    }

    public void setOpD(String opD) {
        this.opD = opD;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String toString() {
        return "QuizQ{" + "que=" + que + ", value=" + value + ", ans=" + ans + ", feedback=" + feedback + '}';
    }
}