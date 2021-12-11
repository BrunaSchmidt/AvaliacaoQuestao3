package br.com.avaliacaoteste;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*
import org.junit.Assert;
import org.junit.Test;

public class ValidacaoThat {

    @Test
    public void validarThat(){

        assertThat("Joao", is("Joao"));
        assertThat(100, isA(Integer.class));
        assertThat("Teste", isA(String.class));
        assertThat(60, is(equalTo(60)));
    }
}
