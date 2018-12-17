package ru.danila_baranov.OOPlesson5;

public class Person {

    private String Name;
    private String Position;
    private String Email;
    private String Phone;
    private int Salary;
    public int Age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.Name = name;
        this.Position = position;
        this.Email = email;
        this.Phone = phone;
        this.Salary = salary;
        this.Age = age;
    }
    public Person InfoPerson(Person person){
        System.out.println("Фамилия: " + person.Name + " Должность: " + person.Position + " email: " + person.Email
        + " Телефон: " + person.Phone + " Зарплата: " + person.Salary + " Возраст: " + person.Age);
        return person;
    }
}
