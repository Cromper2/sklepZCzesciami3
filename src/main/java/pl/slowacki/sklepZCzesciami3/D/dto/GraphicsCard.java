package pl.slowacki.sklepZCzesciami3.D.dto;

import java.util.Objects;

public class GraphicsCard {

    private String name;
    private String producer;

    public GraphicsCard(String name, String producer, String series)
    {
        this.name = name;
        this.producer = producer;
    }

    public GraphicsCard(){

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
        GraphicsCard graphicsCard = (GraphicsCard) o;
        return Objects.equals(name, graphicsCard.name) && Objects.equals(producer, graphicsCard.producer);
    }

    @Override
    public int hashCode() {return Objects.hash(name, producer);}
}
