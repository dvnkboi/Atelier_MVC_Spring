package Main.DAO;

import Main.Models.Article;

import java.util.List;

public interface IDAO {
    public void save(Article p);
    public List<Article> getAll();
    public Article getOne(Article a);
    public Article getOne(int id);
    public void update(Article p);
    public void delete(Article p);
    public void delete(int id);
}
