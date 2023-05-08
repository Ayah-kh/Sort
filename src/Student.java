public class Student implements Comparable<Student>{
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.equalsIgnoreCase(o.name))
            return this.id-o.id;
        else
            return this.name.compareTo(o.name);
    }
}
