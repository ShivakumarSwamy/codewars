package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WhatAClassySongTest {

    private Song song;
    @BeforeEach
    void setUp() {
        song = new Song("Mount Moose", "The Snazzy Moose");
    }

    @Test
    void TestForTitleAndArtist() {
        assertThat(song.getTitle()).isEqualTo("Mount Moose");
        assertThat(song.getArtist()).isEqualTo("The Snazzy Moose");
    }

    @Test
    void TestForDataEncapsulation() {
        assertThat(song.getClass().getFields()).isEmpty();
    }

    @Test
    void TestHowManyMethod() {
        assertThat(song.howMany(new ArrayList<>(Arrays.asList("John", "Fred", "Bob", "Carl", "RyAn"))))
                .isEqualTo(5);

        assertThat(song.howMany(new ArrayList<>(Arrays.asList("John", "LuKe", "AmaNda"))))
                .isEqualTo(2);

    }
}
