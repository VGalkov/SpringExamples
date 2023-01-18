package com.example.demo.dbAccess;

import jakarta.persistence.*;


@Entity
public class ExampleEntity {

    public ExampleEntity() {
        new ExampleEntity("");
    }

    public ExampleEntity(String name) {
        //id == ? Integer.hashCode((int) Calendar.getInstance().getTimeInMillis());
        this.name = name;
    }

    @Id
    @SequenceGenerator(name = "example_entity_seq", sequenceName = "example_entity_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "example_entity_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) return true;
        if (obj == null) return false;
        return obj instanceof ExampleEntity && ((ExampleEntity) obj).id == this.id;
    }

    @Override
    public String toString() {
        return this.id.toString() + ":" + this.name;
    }
}
