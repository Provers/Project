package itminds.codetest;

import org.springframework.data.jpa.repository.JpaRepository;

interface CartRepository extends JpaRepository<Cart, Integer> {
    
}
