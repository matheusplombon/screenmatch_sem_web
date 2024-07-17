package br.com.screematch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
