package hse.programmieren.exam.ss25.polymorphism;

public class Exercise4 {
    static void main() {
        User lisa = new User("Amina");
        User max = new User("Noah");
        User peer = new User("Kenji");

        Reel p1 = new Reel(lisa, 12);
        Image p2 = new Image(max, true);
        Reel p3 = new Reel(peer, 45);

        p2.linkUser(lisa);
        p2.linkUser(peer);

        p1.like(max);
        p1.like(peer);

        p2.like(lisa);
        p2.like(peer);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Linked User in image: " + p2.getLinkedUsers());

    }
}
