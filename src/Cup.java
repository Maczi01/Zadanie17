import java.util.Objects;

public class Cup {
    private String name;
    private int volumeInml;

    public Cup(String name, int volumeInml) {
        this.name = name;
        this.volumeInml = volumeInml;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolumeInml() {
        return volumeInml;
    }

    public void setVolumeInml(int volumeInml) {
        this.volumeInml = volumeInml;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "name='" + name + '\'' +
                ", volumeInml=" + volumeInml +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cup cup = (Cup) o;
        return volumeInml == cup.volumeInml &&
                name.equals(cup.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volumeInml);
    }
}
