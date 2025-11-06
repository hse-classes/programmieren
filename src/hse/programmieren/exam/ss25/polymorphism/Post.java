package hse.programmieren.exam.ss25.polymorphism;

import java.util.ArrayList;
import java.util.List;

abstract class Post {
    private final User creator;
    private final List<User> likes = new ArrayList<>();

    public Post(User creator) {
        this.creator = creator;
    }

    public User getCreator() {
        return creator;
    }

    public void like(User user) {
        if (!likes.contains(user)) {
            likes.add(user);
        }
    }

    public int getNumberOfLikes() {
        return likes.size();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " from " + creator + " | Likes: " + getNumberOfLikes();
    }
}