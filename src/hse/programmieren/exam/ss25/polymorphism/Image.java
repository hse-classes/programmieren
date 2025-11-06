package hse.programmieren.exam.ss25.polymorphism;

import java.util.ArrayList;
import java.util.List;

class Image extends Post {
    private final boolean isEdited;
    private final List<User> linkedUsers = new ArrayList<>();

    public Image(User creator, boolean isEdited) {
        super(creator);
        this.isEdited = isEdited;
    }

    public boolean isEdited() {
        return isEdited;
    }

    public void linkUser(User user) {
        if (!linkedUsers.contains(user)) {
            linkedUsers.add(user);
        }
    }

    public List<User> getLinkedUsers() {
        return linkedUsers;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | edited: " + isEdited
                + " | linked: " + linkedUsers;
    }
}