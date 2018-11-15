package com.voychris

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.util.function.*

// Mono

fun <T1, T2, T : Tuple2<T1, T2>, R> Mono<T>.flatMapTuple(f: (t1: T1, t2: T2) -> Mono<R>): Mono<R> {
    return this.flatMap { f(it.t1, it.t2) }
}

fun <T1, T2, T3, T : Tuple3<T1, T2, T3>, R> Mono<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3) -> Mono<R>): Mono<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3) }
}

fun <T1, T2, T3, T4, T : Tuple4<T1, T2, T3, T4>, R> Mono<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4) -> Mono<R>): Mono<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4) }
}

fun <T1, T2, T3, T4, T5, T : Tuple5<T1, T2, T3, T4, T5>, R> Mono<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5) -> Mono<R>): Mono<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5) }
}

fun <T1, T2, T3, T4, T5, T6, T : Tuple6<T1, T2, T3, T4, T5, T6>, R> Mono<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6) -> Mono<R>): Mono<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5, it.t6) }
}

fun <T1, T2, T3, T4, T5, T6, T7, T : Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> Mono<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7) -> Mono<R>): Mono<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5, it.t6, it.t7) }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T : Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> Mono<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8) -> Mono<R>): Mono<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5, it.t6, it.t7, it.t8) }
}


// Flux

fun <T1, T2, T : Tuple2<T1, T2>, R> Flux<T>.flatMapTuple(f: (t1: T1, t2: T2) -> Flux<R>): Flux<R> {
    return this.flatMap { f(it.t1, it.t2) }
}

fun <T1, T2, T3, T : Tuple3<T1, T2, T3>, R> Flux<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3) -> Flux<R>): Flux<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3) }
}

fun <T1, T2, T3, T4, T : Tuple4<T1, T2, T3, T4>, R> Flux<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4) -> Flux<R>): Flux<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4) }
}

fun <T1, T2, T3, T4, T5, T : Tuple5<T1, T2, T3, T4, T5>, R> Flux<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5) -> Flux<R>): Flux<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5) }
}

fun <T1, T2, T3, T4, T5, T6, T : Tuple6<T1, T2, T3, T4, T5, T6>, R> Flux<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6) -> Flux<R>): Flux<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5, it.t6) }
}

fun <T1, T2, T3, T4, T5, T6, T7, T : Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> Flux<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7) -> Flux<R>): Flux<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5, it.t6, it.t7) }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T : Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> Flux<T>.flatMapTuple(f: (t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8) -> Flux<R>): Flux<R> {
    return this.flatMap { f(it.t1, it.t2, it.t3, it.t4, it.t5, it.t6, it.t7, it.t8) }
}
