package mum.edu.mstore.repository;

import mum.edu.mstore.domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	public Category findByName(String catName);
}
