package me.jinmin.redis_data;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
@Getter
public class People {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Address address;

    @Builder
    public People(String id, String firstName, String lastName, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
