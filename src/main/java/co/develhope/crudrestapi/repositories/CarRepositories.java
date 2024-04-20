package co.develhope.crudrestapi.repositories;
import co.develhope.crudrestapi.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface CarRepositories extends JpaRepository<Car, Long> {
}

