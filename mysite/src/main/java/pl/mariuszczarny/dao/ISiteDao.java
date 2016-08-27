package pl.mariuszczarny.dao;

import java.util.List;

import pl.mariuszczarny.model.Post;

public interface ISiteDao {
	List<Post> Posts(int pageNo, int pageSize);
    int TotalPosts();
}
