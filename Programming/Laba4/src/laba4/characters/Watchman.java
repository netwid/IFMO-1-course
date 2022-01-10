package laba4.characters;

public class Watchman extends Character {
    public Watchman(String name) {
        super(name);
    }

    private boolean checkYourself(Character ch) {
        return ch != this;
    }

    public void capture(Character ch) {
        System.out.println(this.getName() + " схватил " + ch.getName());
        if (checkYourself(ch)) {
            ch.alertness += 10;
        }
    }

    @Override
    public String toString() {
        return "laba4.characters.Watchman{" +
                "name='" + name + '\'' +
                ", place=" + place +
                ", alertness=" + alertness +
                '}';
    }
}
