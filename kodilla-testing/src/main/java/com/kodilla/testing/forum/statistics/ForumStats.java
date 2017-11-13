package com.kodilla.testing.forum.statistics;

public class ForumStats {
    private int usersQuantity = 0;
    private int postsQuantity = 0;
    private int commentsQuantity = 0;
    private double averageValuePostsPerUser = 0;
    private double averageValueCommentsPerUser = 0;
    private double averageValueCommentsPerPost = 0;

    public int getUsersQuantity(Statistics statistics){
        return statistics.userNames().size();
    }

    public int getPostQuantity(Statistics statistics){
        return statistics.postsCount();
    }

    public int getCommentsQuantity(Statistics statistics){
        return statistics.commentsCount();
    }

    public double countAvaregePostsPerUser(Statistics statistics){
        return getPostQuantity(statistics) / getUsersQuantity(statistics);
    }

    public double countAvaregeCommentsPerUser(Statistics statistics){
        return getCommentsQuantity(statistics) / getUsersQuantity(statistics);
    }

    public double countAvaregeCommertsPerPost(Statistics statistics){
        return getCommentsQuantity(statistics) / getPostQuantity(statistics);
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = getUsersQuantity(statistics);
        postsQuantity = getPostQuantity(statistics);
        commentsQuantity = getCommentsQuantity(statistics);
        averageValuePostsPerUser = countAvaregePostsPerUser(statistics);
        averageValueCommentsPerUser = countAvaregeCommentsPerUser(statistics);
        averageValueCommentsPerPost = countAvaregeCommertsPerPost(statistics);
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
}
