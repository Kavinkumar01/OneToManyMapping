package hibernatefetch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestEmpInterface extends JpaRepository<TestEmp, Long> {

}
