package Model;

import java.util.List;

public class Person {
    private String nif;
    private String name;
    private Integer age;
    List<Job> jobs;

    public Person(String nif, String name, Integer age, List<Job> jobs) {
        this.nif = nif;
        this.name = name;
        this.age = age;
        this.jobs = jobs;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", jobs=" + jobs +
                '}';
    }
}

