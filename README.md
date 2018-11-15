# Reactor Kotlin Tuple Extensions

A set of handy Mono and Flux extensions that improve code readability.

## Usage

Traditionally, if you need to `zip` two or more `Publisher`s you would do something like:

```kotlin
Mono
    .zip(one.toMono(), two.toMono())
    .flatMap { tup2 ->
        val one = tup2.t1
        val two = tup2.t2

        // do something
    }
```

Instead, you can do this:

```kotlin
Mono
    .zip(one.toMono(), two.toMono())
    .flatMapTuple { one, two ->
        // do something
    }
```