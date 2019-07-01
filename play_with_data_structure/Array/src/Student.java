package play_with_data_structure.Array.src;

public class Student{
    public String name;
    private int score;

    public Student(String studentName, int studentScore){
        name = studentName;
        score = studentScore;
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, score: %s)", name, score);
    }

    public static void main(String[] args){
        ArrayGeneric<Student> arr = new ArrayGeneric<>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 99));
        arr.addLast(new Student("Charlie", 98));

        System.out.println("All Student scores: " + arr);
    }
}

