package br.com.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OccurrenceOfEachCharacterTest {

    private OccurrenceOfEachCharacter occurrenceOfEachCharacter;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldReturn2OccurrencesOfTWhenExecute() {
        String phrase = "Is that so?";
        occurrenceOfEachCharacter = new OccurrenceOfEachCharacter(phrase);

        Map<String, Integer> charactersMap = occurrenceOfEachCharacter.execute();

        assertThat(charactersMap.get("t"), is(2));
    }

    @Test
    public void shouldReturn2OccurrencesOfTWhenExecuteOptimize() {
        String phrase = "Is this so important to you?";
        occurrenceOfEachCharacter = new OccurrenceOfEachCharacter(phrase);

        Map<String, Integer> charactersMap = occurrenceOfEachCharacter.optimizeExecute();

        assertThat(charactersMap.get("t"), is(4));
    }

    @Test
    public void shouldReturn1OccurrencesOfyWhenExecuteOptimize() {
        String phrase = "yf vxxxxx cxvxcvcvcx  ddd feffeeee wwwewwqe rer";
        occurrenceOfEachCharacter = new OccurrenceOfEachCharacter(phrase);

        Map<String, Integer> charactersMap = occurrenceOfEachCharacter.optimizeExecute();

        assertThat(charactersMap.get("y"), is(1));
    }

    @Test
    public void shouldThrowsRuntimeExceptionAtExecuteMethodWhenPhraseIsNull(){
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Unexpected behavior. Error message: null");

        occurrenceOfEachCharacter = new OccurrenceOfEachCharacter(null);
        occurrenceOfEachCharacter.optimizeExecute();
    }
}