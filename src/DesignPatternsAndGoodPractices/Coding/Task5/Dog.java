package DesignPatternsAndGoodPractices.Coding.Task5;

import java.util.ArrayList;
import java.util.List;

public class Dog {

    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    protected Dog(String name, String type, Integer age, List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getToys() {
        return toys;
    }

    public void setToys(List<String> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", age=").append(age);
        sb.append(", toys=").append(toys);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withName(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withToys(final List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(name, type, age, toys = new ArrayList<>());
        }
    }
}
