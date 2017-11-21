package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1,"user01", 'M', LocalDate.parse("1975-11-30"), 23));
        forumUsers.add(new ForumUser(2,"user02", 'F', LocalDate.parse("1985-01-30"), 2));
        forumUsers.add(new ForumUser(3,"user03", 'F', LocalDate.parse("1995-02-20"), 0));
        forumUsers.add(new ForumUser(4,"user04", 'F', LocalDate.parse("1999-12-30"), 5));
        forumUsers.add(new ForumUser(5,"user05", 'M', LocalDate.parse("2001-01-30"), 0));
        forumUsers.add(new ForumUser(6,"user06", 'M', LocalDate.parse("1965-09-30"), 1));
        forumUsers.add(new ForumUser(7,"user07", 'F', LocalDate.parse("2010-08-30"), 9));
        forumUsers.add(new ForumUser(8,"user08", 'M', LocalDate.parse("2000-10-30"), 102));
        forumUsers.add(new ForumUser(9,"user09", 'M', LocalDate.parse("1997-11-20"), 11));
        forumUsers.add(new ForumUser(10,"user10", 'M', LocalDate.parse("1980-05-30"), 0));
    }

    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(forumUsers);
    }
}
