package pl.slowacki.sklepZCzesciami3.D.dto;

import java.util.Objects;

public class RamMemory {

    private String name;
    private String producer;

    public RamMemory(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    public RamMemory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDrive hardDrive = (HardDrive) o;
        return Objects.equals(name, hardDrive.name) && Objects.equals(producer, hardDrive.producer);
    }

    @Override
    public int hashCode() {return Objects.hash(name, producer);}
}
