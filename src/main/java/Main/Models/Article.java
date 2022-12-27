package Main.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "articles")
public class Article {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 60)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = 60)
    private String description;
    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    private Double price;
    @Basic
    @Column(name = "count", nullable = true)
    private Integer count;
    @Basic
    @Column(name = "code", nullable = false)
    private int code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article articles = (Article) o;

        if (id != articles.id) return false;
        if (code != articles.code) return false;
        if (!Objects.equals(name, articles.name)) return false;
        if (!Objects.equals(description, articles.description))
            return false;
        if (!Objects.equals(price, articles.price)) return false;
        return Objects.equals(count, articles.count);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + code;
        return result;
    }
}
