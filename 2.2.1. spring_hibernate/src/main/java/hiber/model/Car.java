package hiber.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @JoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
