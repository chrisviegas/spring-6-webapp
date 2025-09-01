package dev.viegas.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tb_publishers")
@NoArgsConstructor
@Getter
@Setter
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String publisherName;

    private String address;

    private String city;

    private String state;

    private String zip;

    public Publisher(Long id, String publisherName, String address, String city, String state, String zip) {
        this.id = id;
        this.publisherName = publisherName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;
        return Objects.equals(getId(), publisher.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
