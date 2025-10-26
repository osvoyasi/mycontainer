# MyContainer

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
[![Tests](https://img.shields.io/badge/tests-passing-brightgreen)]()
[![JavaDoc](https://img.shields.io/badge/javadoc-generated-brightgreen)]()

## Описание

`MyContainer` — универсальный контейнер для хранения произвольного количества объектов, реализованный **без использования стандартных коллекций Java** (`ArrayList`, `LinkedList` и др.).  

Особенности:
- Добавление, получение и удаление элементов
- Автоматическое расширение внутреннего массива при переполнении
- Простая и наглядная реализация через массив `Object[]`
- Unit-тесты для проверки всех методов
- JavaDoc документация
  
- ## Требования

- Java 11+  
- Maven 3+

## Сборка и запуск тестов

В корне проекта:

```bash
mvn clean test

