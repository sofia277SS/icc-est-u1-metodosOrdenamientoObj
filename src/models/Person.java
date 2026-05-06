package models;

public class Person {

    private String name;
    private int age;
    private int[] grades;

    public Person(String name, int age, int [] grades) {
        this.name = name;
        this.age = age;
        this.grades=grades;
    }
    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public int getAge() {
         return age;
    }
    public void setAge(int age) {
         this.age = age;
    }
    
    public int[] getGrades() {
        return grades;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double getAverage(){
        double sum =0;
        for(double nota: grades){
            sum = sum + nota;
        }
        double promedio = sum/(grades.length);
        return promedio;
    }

    @Override
    public String toString() {
        return "Person " + name + " " + age + " promedio = "+getAverage();
    }
    
}