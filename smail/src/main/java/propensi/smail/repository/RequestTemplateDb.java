package propensi.smail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import propensi.smail.model.RequestTemplate;
import java.util.*;

@Repository
public interface RequestTemplateDb extends JpaRepository<RequestTemplate, String> {
    List<RequestTemplate> findByStatus(int status);
}
