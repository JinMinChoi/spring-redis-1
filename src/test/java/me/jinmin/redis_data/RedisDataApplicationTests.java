package me.jinmin.redis_data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RedisDataApplicationTests {

    @Autowired
    private PeopleRedisRepository peopleRedisRepository;

    @Test
    public void saveTest() {
        //given
        Address address = new Address("부천", "원미구");
        People people = new People(null, "진민", "최", address);

        //when
        People savePeople = peopleRedisRepository.save(people);

        //then
        Optional<People> findPeople = peopleRedisRepository.findById(savePeople.getId());

        assertThat(findPeople.isPresent()).isEqualTo(Boolean.TRUE);
        assertThat(findPeople.get().getFirstName()).isEqualTo("진민");
    }
}
