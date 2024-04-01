package org.example.builder;

public class Student {
    private String name;
    private String email;
    private String phone_number;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", batch=" + batch +
                ", rank=" + rank +
                '}';
    }

    private int batch;
    private int rank;
    private Student(String name,String email, String phone_number, int batch, int rank){
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.batch = batch;
        this.rank = rank;
    }
    private void validate() throws InvalidGradYearException, InvalidPhoneNumberException {
        if(this.batch>=2023)
            throw new InvalidGradYearException("Grad Year cannot more than 2023");
        if(this.phone_number==null)
            throw new InvalidPhoneNumberException();
    }

    //builder method to return the builder class object
    public static class Builder{
        private String name;
        private String email;
        private String phone_number;
        private int batch;
        private int rank;
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder phone_number(String phone_number){
            this.phone_number=phone_number;
            return this;
        }
        public Builder batch(int batch){
            this.batch = batch;
            return this;
        }
        public Builder rank(int rank){
            this.rank = rank;
            return this;
        }

        public Student build() {
            return new Student(this.name, this.email, this.phone_number, this.batch, this.rank);
        }
    }
    //methods which return builder object
    public static Builder create(){
        return new Builder();
    }

}
