package jm.task.core.jdbc.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name", nullable = false, length = 50)
        private String name;

        @Column(name = "lastName", nullable = false, length = 50)
        private String lastName;

        @Column(name = "age", nullable = false)
        private Byte age;

        public User() {
        }

        public User(String name, String lastName, Byte age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
        public User(Long id, String name, String lastName, Byte age) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
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

        public Byte getAge() {
            return age;
        }

        public void setAge(Byte age) {
            this.age = age;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "User{" +
                    "age=" + age +
                    ", lastName='" + lastName + '\'' +
                    ", name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
}
