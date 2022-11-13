package pl.slowacki.sklepZCzesciami3.D.dto;

import java.util.Objects;

public class Processor {

    private String name;
    private String producer;

    public Processor() {
    }

    public Processor(String name, String producer)
    {
        this.name = name;
        this.producer = producer;
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
        Processor processor = (Processor) o;
        return Objects.equals(name, processor.name) && Objects.equals(producer, processor.producer);
    }

    @Override
    public int hashCode() {return Objects.hash(name, producer);}
}
