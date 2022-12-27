package Main.Services;

import Main.DAO.IDAO;
import Main.Models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articleService")
public class ArticleService {

    @Autowired
    private IDAO articleDAO;

    public void setDao(IDAO dao) {
        articleDAO = dao;
    }


    public void addArticle(Article a) {
        articleDAO.save(a);
    }


    public List<Article> listArticles() {
        return articleDAO.getAll();
    }


    public Article getArticle(int id) {
        return articleDAO.getOne(id);
    }


    public void updateArticle(Article a) {
        articleDAO.update(a);
    }


    public void deleteArticle(int id) {
        articleDAO.delete(id);
    }
}
