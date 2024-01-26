package repositories;


import entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {


    Event findByTitle(String title);

    Event findByLocation(String location);
}
