package com.epam.izh.rd.online.entity;

import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Класс содержащий информацию об авторе.
 * <p>
 * Необходимо:
 * 1) Создать список полей с указанными типами ровно в этом порядке:
 * - name с типом String и приватным модификатором доступа
 * - lastName с типом String и приватным модификатором доступа
 * - birthdate с типом LocalDate и приватным модификатором доступа
 * - country с типом String и приватным модификатором доступа
 * 2) Создать дефолтный конструктор (без параметров) (не забывайте alt+inset)
 * 3) Создать конструктор со всеми параметрами (в том порядке в котором перечислены) (не забывайте alt+inset)
 * 4) Создать геттеры и сеттеры (не забывайте alt+inset)
 * 5) Переопределить методы equals и hashCode - используйте генерацию (не забывайте alt+inset)
 * 6) Переопределить метод toString с выводом всех полей (не забывайте alt+inset)
 */
public class Author {
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private String country;

    public Author() {
    }

    public Author(Author author) {
        this.name = author.name;
        this.lastName = author.lastName;
        this.birthdate = author.birthdate;
        this.country = author.country;
    }

    public Author(String name, String lastName, LocalDate birthdate, String country) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (name != null ? !name.equals(author.name) : author.name != null) return false;
        if (lastName != null ? !lastName.equals(author.lastName) : author.lastName != null) return false;
        if (birthdate != null ? !birthdate.equals(author.birthdate) : author.birthdate != null) return false;
        return country != null ? country.equals(author.country) : author.country == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Author.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("lastName='" + lastName + "'")
                .add("birthdate=" + birthdate)
                .add("country='" + country + "'")
                .toString();
    }
}
