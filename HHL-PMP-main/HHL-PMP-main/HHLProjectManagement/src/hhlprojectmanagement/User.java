/*
 * V. He
 * Dec 6th, 2022
 * Class for user
 */
package hhlprojectmanagement;

public class User {
    private String name;
    private int score;

    public User(String name) {
        this.name = name;
    }

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "User{" + "name=" + name + ", score=" + score + '}';
    }
    
    public User clone() {
        User clonedUser = new User(name, score);
        return clonedUser;
    }
}