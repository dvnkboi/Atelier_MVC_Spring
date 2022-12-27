package Main.DAO;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import Main.Models.Article;

@Repository("articleDAO")
public class ArticleDAO implements IDAO {
    @PersistenceContext
    private EntityManager em;

    public void save(Article a) {
        em.persist(a);
    }

    public List<Article> getAll() {
        Query query = em.createQuery("from Article");
        return query.getResultList();
    }

    public Article getOne(Article a) {
        return getOne(a.getId());
    }

    public Article getOne(int id) {
        return em.find(Article.class, id);
    }

    public void update(Article a) {
        em.merge(a);
    }

    public void delete(Article a) {
        delete(a.getId());
    }

    public void delete(int id) {
        em.remove(getOne(id));
    }
}
