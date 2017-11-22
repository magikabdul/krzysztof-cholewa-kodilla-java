package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String userName;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(String userName, String realName, String location) {
        this.userName = userName;
        this.realName = realName;
        this.location = location;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        return userName.equals(forumUser.userName);
    }

    @Override
    public int hashCode() {
        return userName.hashCode();
    }

    public void addFriend(ForumUser forumUser){
        friends.add(forumUser);
    }

    public boolean removeFriend(ForumUser forumUser){
        return friends.remove(forumUser);
    }

    public Set<String> getLocationOfFriends(){
        return friends.stream()
                .map(friend -> friend.getLocation())
                .collect(Collectors.toSet());
    }

    public Set<String> getLocationOfFriendsOfFriends(){
        return friends.stream()
                .flatMap(forumUser -> forumUser.getFriends().stream())
                .filter(forumUser -> forumUser != this)
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }
}
