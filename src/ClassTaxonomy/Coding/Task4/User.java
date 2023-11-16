package ClassTaxonomy.Coding.Task4;


public class User {
    private String name;
    private String lastName;
    private int age;
    private String login;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name, Validator validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName, Validator validator) {
        if (validator.validate(lastName)){
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, Validator validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }
    Validator nameValidator = new Validator() {
        @Override
        public <T> boolean validate(T input) {
            if (input == null) {
                return false;
            }
            String aux = (String)input;
            return !aux.isEmpty() && Character.isUpperCase(aux.charAt(0));
        }
    };
    Validator lastNameValidator = new Validator() {
        @Override
        public <T> boolean validate(T input) {
            if (input == null) {
                return false;
            }
            String aux = (String)input;
            return !aux.isEmpty() && Character.isUpperCase(aux.charAt(0));
        }
    };
    Validator ageValidator = new Validator() {
        @Override
        public <T> boolean validate(T input) {
            return (int)input >= 0 && (int)input <= 150;
        }
    };
    Validator loginValidator = new Validator() {
        @Override
        public <T> boolean validate(T input) {
            if (input == null) {
                return false;
            }
            return ((String)input).length() == 10;
        }
    };

    Validator passwordValidator = new Validator() {
        @Override
        public <T> boolean validate(T input) {
            if (input == null) {
                return false;
            }
            return ((String)input).contains("!");
        }
    };

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

