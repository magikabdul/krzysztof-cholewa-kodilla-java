package com.kodilla.testing.forum.statistics;

public class ForumStats {
    private int usersQuantity = 0;
    private int postsQuantity = 0;
    private int commentsQuantity = 0;
    private double averageValuePostsPerUser = 0;
    private double averageValueCommentsPerUser = 0;
    private double averageValueCommentsPerPost = 0;

    private int countUsersQuantity(Statistics statistics){
        return statistics.userNames().size();
    }

    private int countPostQuantity(Statistics statistics){
        return statistics.postsCount();
    }

    private int countCommentsQuantity(Statistics statistics){
        return statistics.commentsCount();
    }

    private double countAveragePostsPerUser(){

        if (usersQuantity > 0){
            return (double)postsQuantity / usersQuantity;
        }   else {
            return -1;
        }
    }

    private double countAverageCommentsPerUser(){

        if (usersQuantity > 0) {
            return (double)commentsQuantity / usersQuantity;
        }   else {
            return -1;
        }
    }

    private double countAverageCommentsPerPost(){

        if (postsQuantity > 0){
            return (double) commentsQuantity / postsQuantity;
        }   else {
            return -1;
        }
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = countUsersQuantity(statistics);
        postsQuantity = countPostQuantity(statistics);
        commentsQuantity = countCommentsQuantity(statistics);
        averageValuePostsPerUser = countAveragePostsPerUser();
        averageValueCommentsPerUser = countAverageCommentsPerUser();
        averageValueCommentsPerPost = countAverageCommentsPerPost();
    }

    public void showStatistics(Statistics statistics){
        calculateAdvStatistics(statistics);
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Average value posts per user: " + averageValuePostsPerUser);
        System.out.println("Average value comments per user: " + averageValueCommentsPerUser);
        System.out.println("Average value comments per post: " + averageValueCommentsPerPost);
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAverageValuePostsPerUser() {
        return averageValuePostsPerUser;
    }

    public double getAverageValueCommentsPerUser() {
        return averageValueCommentsPerUser;
    }

    public double getAverageValueCommentsPerPost() {
        return averageValueCommentsPerPost;
    }
}
