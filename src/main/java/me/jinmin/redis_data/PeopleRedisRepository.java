package me.jinmin.redis_data;

import org.springframework.data.repository.CrudRepository;

public interface PeopleRedisRepository extends CrudRepository<People, String> {
}
