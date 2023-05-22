package ru.practicum.shareit.user.dto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@JsonTest
class UserDtoTest {
    @Autowired
    private JacksonTester<UserDto> json;

    @Test
    void testJsonUserDto() throws IOException {
        String jsonString = "{\"name\":\"Name\", \"email\":\"name@mail.ru\"}";
        UserDto userDto = this.json.parse(jsonString).getObject();

        assertThat(userDto.getName(), equalTo("Name"));
        assertThat(userDto.getEmail(), equalTo("name@mail.ru"));
    }
}
