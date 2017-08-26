'Generator' @ [38:13] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<B>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> B

'invoke' @ [38:25] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<A> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [38:34] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.Generator.map.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [38:38] ==> public final inline fun <B> map(function: (A) -> B): Try<B> defined in net.corda.core.utilities.Try[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> B

'function' @ [38:42] ==> value-parameter function: (A) -> B defined in net.corda.client.mock.Generator.map[ValueParameterDescriptorImpl]

'Generator' @ [42:13] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<B>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> B

'invoke' @ [42:25] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<A> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [42:34] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.Generator.product.<anonymous>[ValueParameterDescriptorImpl]

'combine' @ [42:38] ==> public final inline fun <B, C> combine(other: Try<(A) -> B>, function: (A, (A) -> B) -> B): Try<B> defined in net.corda.core.utilities.Try[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> Function1<A, B>
    <C> -> B

'other' @ [42:46] ==> value-parameter other: Generator<(A) -> B> defined in net.corda.client.mock.Generator.product[ValueParameterDescriptorImpl]

'invoke' @ [42:52] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<(A) -> B> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [42:61] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.Generator.product.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [42:76] ==> public abstract operator fun invoke(p1: A): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'a' @ [42:78] ==> value-parameter a: A defined in net.corda.client.mock.Generator.product.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'product' @ [45:13] ==> public final fun <B> product(other: Generator<(A) -> R>): Generator<R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> R

'other1' @ [45:24] ==> value-parameter other1: Generator<B> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [45:31] ==> public final fun <B> product(other: Generator<(B) -> (A) -> R>): Generator<(A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<A, R>

'pure' @ [45:39] ==> public final fun <A> pure(value: (B) -> (A) -> R): Generator<(B) -> (A) -> R> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Function1<B, Function1<A, R>>

'invoke' @ [45:58] ==> public abstract operator fun invoke(p1: A, p2: B): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'a' @ [45:67] ==> value-parameter a: A defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [45:70] ==> value-parameter b: B defined in net.corda.client.mock.Generator.combine.<anonymous>[ValueParameterDescriptorImpl]

'product' @ [48:13] ==> public final fun <B> product(other: Generator<(A) -> R>): Generator<R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> R

'other1' @ [48:24] ==> value-parameter other1: Generator<B> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [48:31] ==> public final fun <B> product(other: Generator<(B) -> (A) -> R>): Generator<(A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<A, R>

'other2' @ [48:39] ==> value-parameter other2: Generator<C> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [48:46] ==> public final fun <B> product(other: Generator<(C) -> (B) -> (A) -> R>): Generator<(B) -> (A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<B, Function1<A, R>>

'pure' @ [48:54] ==> public final fun <A> pure(value: (C) -> (B) -> (A) -> R): Generator<(C) -> (B) -> (A) -> R> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Function1<C, Function1<B, Function1<A, R>>>

'invoke' @ [48:80] ==> public abstract operator fun invoke(p1: A, p2: B, p3: C): R defined in kotlin.Function3[FunctionInvokeDescriptor]

'a' @ [48:89] ==> value-parameter a: A defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [48:92] ==> value-parameter b: B defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [48:95] ==> value-parameter c: C defined in net.corda.client.mock.Generator.combine.<anonymous>[ValueParameterDescriptorImpl]

'product' @ [51:13] ==> public final fun <B> product(other: Generator<(A) -> R>): Generator<R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> R

'other1' @ [51:24] ==> value-parameter other1: Generator<B> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [51:31] ==> public final fun <B> product(other: Generator<(B) -> (A) -> R>): Generator<(A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<A, R>

'other2' @ [51:39] ==> value-parameter other2: Generator<C> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [51:46] ==> public final fun <B> product(other: Generator<(C) -> (B) -> (A) -> R>): Generator<(B) -> (A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<B, Function1<A, R>>

'other3' @ [51:54] ==> value-parameter other3: Generator<D> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [51:61] ==> public final fun <B> product(other: Generator<(D) -> (C) -> (B) -> (A) -> R>): Generator<(C) -> (B) -> (A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<C, Function1<B, Function1<A, R>>>

'pure' @ [51:69] ==> public final fun <A> pure(value: (D) -> (C) -> (B) -> (A) -> R): Generator<(D) -> (C) -> (B) -> (A) -> R> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Function1<D, Function1<C, Function1<B, Function1<A, R>>>>

'invoke' @ [51:102] ==> public abstract operator fun invoke(p1: A, p2: B, p3: C, p4: D): R defined in kotlin.Function4[FunctionInvokeDescriptor]

'a' @ [51:111] ==> value-parameter a: A defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [51:114] ==> value-parameter b: B defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [51:117] ==> value-parameter c: C defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'd' @ [51:120] ==> value-parameter d: D defined in net.corda.client.mock.Generator.combine.<anonymous>[ValueParameterDescriptorImpl]

'product' @ [54:13] ==> public final fun <B> product(other: Generator<(A) -> R>): Generator<R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> R

'other1' @ [54:24] ==> value-parameter other1: Generator<B> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [54:31] ==> public final fun <B> product(other: Generator<(B) -> (A) -> R>): Generator<(A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<A, R>

'other2' @ [54:39] ==> value-parameter other2: Generator<C> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [54:46] ==> public final fun <B> product(other: Generator<(C) -> (B) -> (A) -> R>): Generator<(B) -> (A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<B, Function1<A, R>>

'other3' @ [54:54] ==> value-parameter other3: Generator<D> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [54:61] ==> public final fun <B> product(other: Generator<(D) -> (C) -> (B) -> (A) -> R>): Generator<(C) -> (B) -> (A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<C, Function1<B, Function1<A, R>>>

'other4' @ [54:69] ==> value-parameter other4: Generator<E> defined in net.corda.client.mock.Generator.combine[ValueParameterDescriptorImpl]

'product' @ [54:76] ==> public final fun <B> product(other: Generator<(E) -> (D) -> (C) -> (B) -> (A) -> R>): Generator<(D) -> (C) -> (B) -> (A) -> R> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Function1<D, Function1<C, Function1<B, Function1<A, R>>>>

'pure' @ [54:84] ==> public final fun <A> pure(value: (E) -> (D) -> (C) -> (B) -> (A) -> R): Generator<(E) -> (D) -> (C) -> (B) -> (A) -> R> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Function1<E, Function1<D, Function1<C, Function1<B, Function1<A, R>>>>>

'invoke' @ [54:124] ==> public abstract operator fun invoke(p1: A, p2: B, p3: C, p4: D, p5: E): R defined in kotlin.Function5[FunctionInvokeDescriptor]

'a' @ [54:133] ==> value-parameter a: A defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [54:136] ==> value-parameter b: B defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [54:139] ==> value-parameter c: C defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'd' @ [54:142] ==> value-parameter d: D defined in net.corda.client.mock.Generator.combine.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [54:145] ==> value-parameter e: E defined in net.corda.client.mock.Generator.combine.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [58:16] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<B>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> B

'invoke' @ [58:38] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<A> defined in kotlin.Function1[FunctionInvokeDescriptor]

'random' @ [58:47] ==> value-parameter random: SplittableRandom defined in net.corda.client.mock.Generator.flatMap.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [58:55] ==> public final inline fun <B> flatMap(function: (A) -> Try<B>): Try<B> defined in net.corda.core.utilities.Try[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> B

'invoke' @ [58:65] ==> public abstract operator fun invoke(p1: A): Generator<B> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [58:74] ==> value-parameter it: A defined in net.corda.client.mock.Generator.flatMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [58:78] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<B> defined in kotlin.Function1[FunctionInvokeDescriptor]

'random' @ [58:87] ==> value-parameter random: SplittableRandom defined in net.corda.client.mock.Generator.flatMap.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [62:34] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<A>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> A

'Try' @ [62:46] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Success' @ [62:50] ==> public constructor Success<out A>(value: A) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> A

'value' @ [62:58] ==> value-parameter value: A defined in net.corda.client.mock.Generator.Companion.pure[ValueParameterDescriptorImpl]

'Generator' @ [63:49] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<A>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> A

'Try' @ [63:61] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Success' @ [63:65] ==> public constructor Success<out A>(value: A) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> A

'invoke' @ [63:73] ==> public abstract operator fun invoke(): A defined in kotlin.Function0[FunctionInvokeDescriptor]

'Generator' @ [64:42] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<A>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> A

'Try' @ [64:57] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Failure' @ [64:61] ==> public constructor Failure(exception: Throwable) defined in net.corda.core.utilities.Try.Failure[DeserializedClassConstructorDescriptor]

'error' @ [64:69] ==> value-parameter error: Exception /* = Exception */ defined in net.corda.client.mock.Generator.Companion.fail[ValueParameterDescriptorImpl]

'intRange' @ [67:58] ==> public fun Generator.Companion.intRange(from: Int, to: Int): Generator<Int> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'generators' @ [67:70] ==> value-parameter generators: List<Generator<A>> defined in net.corda.client.mock.Generator.Companion.choice[ValueParameterDescriptorImpl]

'size' @ [67:81] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'flatMap' @ [67:91] ==> public final fun <B> flatMap(function: (Int) -> Generator<A>): Generator<A> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> A

'generators' @ [67:101] ==> value-parameter generators: List<Generator<A>> defined in net.corda.client.mock.Generator.Companion.choice[ValueParameterDescriptorImpl]

'it' @ [67:112] ==> value-parameter it: Int defined in net.corda.client.mock.Generator.Companion.choice.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [69:62] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<A>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> A

'Try' @ [69:74] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Success' @ [69:78] ==> public constructor Success<out A>(value: A) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> A

'invoke' @ [69:86] ==> public abstract operator fun invoke(p1: SplittableRandom): A defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [69:95] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.Generator.Companion.success.<anonymous>[ValueParameterDescriptorImpl]

'mutableListOf' @ [71:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Pair<Double, Double>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Double>

'generators' @ [73:13] ==> value-parameter generators: List<Pair<Double, Generator<A>>> defined in net.corda.client.mock.Generator.Companion.frequency[ValueParameterDescriptorImpl]

'forEach' @ [73:24] ==> @HidesMembers public inline fun <T> Iterable<Pair<Double, Generator<A>>>.forEach(action: (Pair<Double, Generator<A>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Generator<A>>

'current' @ [74:28] ==> var current: Double defined in net.corda.client.mock.Generator.Companion.frequency[LocalVariableDescriptor]

'it' @ [74:38] ==> value-parameter it: Pair<Double, Generator<A>> defined in net.corda.client.mock.Generator.Companion.frequency.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [74:41] ==> public final val first: Double defined in kotlin.Pair[DeserializedPropertyDescriptor]

'ranges' @ [75:17] ==> val ranges: MutableList<Pair<Double, Double>> defined in net.corda.client.mock.Generator.Companion.frequency[LocalVariableDescriptor]

'add' @ [75:24] ==> public abstract fun add(element: Pair<Double, Double>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Pair' @ [75:28] ==> public constructor Pair<out A, out B>(first: Double, second: Double) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Double
    <out B> -> Double

'current' @ [75:33] ==> var current: Double defined in net.corda.client.mock.Generator.Companion.frequency[LocalVariableDescriptor]

'next' @ [75:42] ==> val next: Double defined in net.corda.client.mock.Generator.Companion.frequency.<anonymous>[LocalVariableDescriptor]

'current' @ [76:17] ==> var current: Double defined in net.corda.client.mock.Generator.Companion.frequency[LocalVariableDescriptor]

'next' @ [76:27] ==> val next: Double defined in net.corda.client.mock.Generator.Companion.frequency.<anonymous>[LocalVariableDescriptor]

'doubleRange' @ [78:20] ==> public fun Generator.Companion.doubleRange(from: Double, to: Double): Generator<Double> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'current' @ [78:37] ==> var current: Double defined in net.corda.client.mock.Generator.Companion.frequency[LocalVariableDescriptor]

'flatMap' @ [78:46] ==> public final fun <B> flatMap(function: (Double) -> Generator<A>): Generator<A> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> A

'generators' @ [79:17] ==> value-parameter generators: List<Pair<Double, Generator<A>>> defined in net.corda.client.mock.Generator.Companion.frequency[ValueParameterDescriptorImpl]

'ranges' @ [79:28] ==> val ranges: MutableList<Pair<Double, Double>> defined in net.corda.client.mock.Generator.Companion.frequency[LocalVariableDescriptor]

'binarySearch' @ [79:35] ==> public fun <T> List<Pair<Double, Double>>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: (Pair<Double, Double>) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Double>

'component1' @ [79:51] ==> public final operator fun component1(): Double defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [79:58] ==> public final operator fun component2(): Double defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (value < first) {
                        1
                    } else if (value < second) {
                        0
                    } else {
                        -1
                    }' @ [80:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'value' @ [80:25] ==> value-parameter value: Double defined in net.corda.client.mock.Generator.Companion.frequency.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [80:33] ==> val first: Double defined in net.corda.client.mock.Generator.Companion.frequency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (value < second) {
                        0
                    } else {
                        -1
                    }' @ [82:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'value' @ [82:32] ==> value-parameter value: Double defined in net.corda.client.mock.Generator.Companion.frequency.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [82:40] ==> val second: Double defined in net.corda.client.mock.Generator.Companion.frequency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'-' @ [85:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'second' @ [87:20] ==> public final val second: Generator<A> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Generator' @ [91:60] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<List<A>>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> List<A>

'mutableListOf' @ [92:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'generators' @ [93:31] ==> value-parameter generators: List<Generator<A>> defined in net.corda.client.mock.Generator.Companion.sequence[ValueParameterDescriptorImpl]

'generator' @ [94:31] ==> val generator: Generator<A> defined in net.corda.client.mock.Generator.Companion.sequence.<anonymous>[LocalVariableDescriptor]

'invoke' @ [94:41] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<A> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [94:50] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.Generator.Companion.sequence.<anonymous>[ValueParameterDescriptorImpl]

'when (element) {
                    is Try.Success -> result.add(element.value)
                    is Try.Failure -> return@Generator element
                }' @ [95:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [95:23] ==> val element: Try<A> defined in net.corda.client.mock.Generator.Companion.sequence.<anonymous>[LocalVariableDescriptor]

'result' @ [96:39] ==> val result: MutableList<A> defined in net.corda.client.mock.Generator.Companion.sequence.<anonymous>[LocalVariableDescriptor]

'add' @ [96:46] ==> public abstract fun add(element: A): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [96:50] ==> val element: Try<A> defined in net.corda.client.mock.Generator.Companion.sequence.<anonymous>[LocalVariableDescriptor]

'value' @ [96:58] ==> public final val value: A defined in net.corda.core.utilities.Try.Success[DeserializedPropertyDescriptor]

'element' @ [97:56] ==> val element: Try<A> defined in net.corda.client.mock.Generator.Companion.sequence.<anonymous>[LocalVariableDescriptor]

'Try' @ [100:13] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Success' @ [100:17] ==> public constructor Success<out A>(value: MutableList<A>) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> MutableList<A>

'result' @ [100:25] ==> val result: MutableList<A> defined in net.corda.client.mock.Generator.Companion.sequence.<anonymous>[LocalVariableDescriptor]

'frequency' @ [105:88] ==> public final fun <A> frequency(generators: List<Pair<Double, Generator<A>>>): Generator<A> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> A

'generators' @ [105:98] ==> value-parameter vararg generators: Pair<Double, Generator<A>> defined in net.corda.client.mock.frequency[ValueParameterDescriptorImpl]

'toList' @ [105:109] ==> public fun <T> Array<out Pair<Double, Generator<A>>>.toList(): List<Pair<Double, Generator<A>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Generator<A>>

'..' @ [109:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'numberOfTries' @ [109:18] ==> value-parameter numberOfTries: Int = ... defined in net.corda.client.mock.generateOrFail[ValueParameterDescriptorImpl]

'invoke' @ [110:22] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<A> defined in kotlin.Function1[FunctionInvokeDescriptor]

'random' @ [110:31] ==> value-parameter random: SplittableRandom defined in net.corda.client.mock.generateOrFail[ValueParameterDescriptorImpl]

'error' @ [111:9] ==> var error: Throwable? defined in net.corda.client.mock.generateOrFail[LocalVariableDescriptor]

'when (result) {
            is Try.Success -> return result.value
            is Try.Failure -> result.exception
        }' @ [111:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Throwable?, entry1: Throwable?): Throwable?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Throwable?

'result' @ [111:23] ==> val result: Try<A> defined in net.corda.client.mock.generateOrFail[LocalVariableDescriptor]

'result' @ [112:38] ==> val result: Try<A> defined in net.corda.client.mock.generateOrFail[LocalVariableDescriptor]

'value' @ [112:45] ==> public final val value: A defined in net.corda.core.utilities.Try.Success[DeserializedPropertyDescriptor]

'result' @ [113:31] ==> val result: Try<A> defined in net.corda.client.mock.generateOrFail[LocalVariableDescriptor]

'exception' @ [113:38] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[DeserializedPropertyDescriptor]

'if (error == null) {
        throw IllegalArgumentException("numberOfTries cannot be <= 0")
    } else {
        throw Exception("Failed to generate", error)
    }' @ [116:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'error' @ [116:9] ==> var error: Throwable? defined in net.corda.client.mock.generateOrFail[LocalVariableDescriptor]

'IllegalArgumentException' @ [117:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'Exception' @ [119:15] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'error' @ [119:47] ==> var error: Throwable? defined in net.corda.client.mock.generateOrFail[LocalVariableDescriptor]

'Generator' @ [123:33] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'success' @ [123:43] ==> public final fun <A> success(generate: (SplittableRandom) -> Int): Generator<Int> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Int

'SplittableRandom' @ [123:51] ==> public constructor SplittableRandom() defined in java.util.SplittableRandom[JavaClassConstructorDescriptor]

'nextInt' @ [123:69] ==> public open fun nextInt(): Int defined in java.util.SplittableRandom[JavaMethodDescriptor]

'Generator' @ [124:34] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'success' @ [124:44] ==> public final fun <A> success(generate: (SplittableRandom) -> Long): Generator<Long> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Long

'SplittableRandom' @ [124:52] ==> public constructor SplittableRandom() defined in java.util.SplittableRandom[JavaClassConstructorDescriptor]

'nextLong' @ [124:70] ==> public open fun nextLong(): Long defined in java.util.SplittableRandom[JavaMethodDescriptor]

'Generator' @ [125:66] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'success' @ [125:76] ==> public final fun <A> success(generate: (SplittableRandom) -> ByteArray): Generator<ByteArray> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> ByteArray

'ByteArray' @ [126:5] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'size' @ [126:15] ==> value-parameter size: Int defined in net.corda.client.mock.bytes[ValueParameterDescriptorImpl]

'random' @ [126:23] ==> value-parameter random: SplittableRandom defined in net.corda.client.mock.bytes.<anonymous>[ValueParameterDescriptorImpl]

'nextInt' @ [126:30] ==> public open fun nextInt(): Int defined in java.util.SplittableRandom[JavaMethodDescriptor]

'toByte' @ [126:40] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'intRange' @ [129:53] ==> public fun Generator.Companion.intRange(from: Int, to: Int): Generator<Int> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'range' @ [129:62] ==> value-parameter range: IntRange defined in net.corda.client.mock.intRange[ValueParameterDescriptorImpl]

'first' @ [129:68] ==> public final val first: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'range' @ [129:75] ==> value-parameter range: IntRange defined in net.corda.client.mock.intRange[ValueParameterDescriptorImpl]

'last' @ [129:81] ==> public final val last: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'Generator' @ [130:72] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'success' @ [130:82] ==> public final fun <A> success(generate: (SplittableRandom) -> Int): Generator<Int> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Int

'from' @ [131:6] ==> value-parameter from: Int defined in net.corda.client.mock.intRange[ValueParameterDescriptorImpl]

'%' @ [131:13] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'abs' @ [131:18] ==> public open fun abs(p0: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'it' @ [131:22] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.intRange.<anonymous>[ValueParameterDescriptorImpl]

'nextInt' @ [131:25] ==> public open fun nextInt(): Int defined in java.util.SplittableRandom[JavaMethodDescriptor]

'to' @ [131:39] ==> value-parameter to: Int defined in net.corda.client.mock.intRange[ValueParameterDescriptorImpl]

'from' @ [131:44] ==> value-parameter from: Int defined in net.corda.client.mock.intRange[ValueParameterDescriptorImpl]

'toInt' @ [131:55] ==> public open fun toInt(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'longRange' @ [134:55] ==> public fun Generator.Companion.longRange(from: Long, to: Long): Generator<Long> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'range' @ [134:65] ==> value-parameter range: LongRange defined in net.corda.client.mock.longRange[ValueParameterDescriptorImpl]

'first' @ [134:71] ==> public final val first: Long defined in kotlin.ranges.LongRange[DeserializedPropertyDescriptor]

'range' @ [134:78] ==> value-parameter range: LongRange defined in net.corda.client.mock.longRange[ValueParameterDescriptorImpl]

'last' @ [134:84] ==> public final val last: Long defined in kotlin.ranges.LongRange[DeserializedPropertyDescriptor]

'Generator' @ [135:76] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'success' @ [135:86] ==> public final fun <A> success(generate: (SplittableRandom) -> Long): Generator<Long> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Long

'from' @ [136:6] ==> value-parameter from: Long defined in net.corda.client.mock.longRange[ValueParameterDescriptorImpl]

'%' @ [136:13] ==> @SinceKotlin public final operator fun rem(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'abs' @ [136:18] ==> public open fun abs(p0: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'it' @ [136:22] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.longRange.<anonymous>[ValueParameterDescriptorImpl]

'nextLong' @ [136:25] ==> public open fun nextLong(): Long defined in java.util.SplittableRandom[JavaMethodDescriptor]

'to' @ [136:40] ==> value-parameter to: Long defined in net.corda.client.mock.longRange[ValueParameterDescriptorImpl]

'from' @ [136:45] ==> value-parameter from: Long defined in net.corda.client.mock.longRange[ValueParameterDescriptorImpl]

'toLong' @ [136:56] ==> public open fun toLong(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'Generator' @ [139:36] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'success' @ [139:46] ==> public final fun <A> success(generate: (SplittableRandom) -> Double): Generator<Double> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Double

'it' @ [139:56] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.double.<anonymous>[ValueParameterDescriptorImpl]

'nextDouble' @ [139:59] ==> public open fun nextDouble(): Double defined in java.util.SplittableRandom[JavaMethodDescriptor]

'Generator' @ [140:84] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'success' @ [140:94] ==> public final fun <A> success(generate: (SplittableRandom) -> Double): Generator<Double> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Double

'from' @ [141:5] ==> value-parameter from: Double defined in net.corda.client.mock.doubleRange[ValueParameterDescriptorImpl]

'it' @ [141:12] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.doubleRange.<anonymous>[ValueParameterDescriptorImpl]

'nextDouble' @ [141:15] ==> public open fun nextDouble(): Double defined in java.util.SplittableRandom[JavaMethodDescriptor]

'to' @ [141:31] ==> value-parameter to: Double defined in net.corda.client.mock.doubleRange[ValueParameterDescriptorImpl]

'from' @ [141:36] ==> value-parameter from: Double defined in net.corda.client.mock.doubleRange[ValueParameterDescriptorImpl]

'Generator' @ [144:34] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<Char>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> Char

'%' @ [145:21] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'abs' @ [145:26] ==> public open fun abs(p0: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'it' @ [145:30] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.char.<anonymous>[ValueParameterDescriptorImpl]

'nextInt' @ [145:33] ==> public open fun nextInt(): Int defined in java.util.SplittableRandom[JavaMethodDescriptor]

'*' @ [145:47] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'shl' @ [145:53] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (Character.isValidCodePoint(codePoint)) {
        return@Generator Try.Success(codePoint.toChar())
    } else {
        Try.Failure(IllegalStateException("Could not generate valid codepoint"))
    }' @ [146:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Try.Failure, elseBranch: Try.Failure): Try.Failure[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Failure

'isValidCodePoint' @ [146:19] ==> public open fun isValidCodePoint(p0: Int): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'codePoint' @ [146:36] ==> val codePoint: Int defined in net.corda.client.mock.char.<anonymous>[LocalVariableDescriptor]

'Try' @ [147:26] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Success' @ [147:30] ==> public constructor Success<out A>(value: Char) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Char

'codePoint' @ [147:38] ==> val codePoint: Int defined in net.corda.client.mock.char.<anonymous>[LocalVariableDescriptor]

'toChar' @ [147:48] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Failure' @ [149:13] ==> public constructor Failure(exception: Throwable) defined in net.corda.core.utilities.Try.Failure[DeserializedClassConstructorDescriptor]

'IllegalStateException' @ [149:21] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'replicatePoisson' @ [153:59] ==> public fun <A> Generator.Companion.replicatePoisson(meanSize: Double, generator: Generator<Char>, atLeastOne: Boolean = ...): Generator<List<Char>> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Char

'meanSize' @ [153:76] ==> value-parameter meanSize: Double = ... defined in net.corda.client.mock.string[ValueParameterDescriptorImpl]

'char' @ [153:86] ==> public fun Generator.Companion.char(): Generator<Char> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'map' @ [153:94] ==> public final fun <B> map(function: (List<Char>) -> String): Generator<String> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> String

'StringBuilder' @ [154:19] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'it' @ [155:5] ==> value-parameter it: List<Char> defined in net.corda.client.mock.string.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [155:8] ==> @HidesMembers public inline fun <T> Iterable<Char>.forEach(action: (Char) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'builder' @ [156:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in net.corda.client.mock.string.<anonymous>[LocalVariableDescriptor]

'append' @ [156:17] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [156:24] ==> value-parameter it: Char defined in net.corda.client.mock.string.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [158:5] ==> val builder: StringBuilder /* = StringBuilder */ defined in net.corda.client.mock.string.<anonymous>[LocalVariableDescriptor]

'toString' @ [158:13] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'mutableListOf' @ [162:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Generator<A>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Generator<A>

'..' @ [163:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'number' @ [163:18] ==> value-parameter number: Int defined in net.corda.client.mock.replicate[ValueParameterDescriptorImpl]

'generators' @ [164:9] ==> val generators: MutableList<Generator<A>> defined in net.corda.client.mock.replicate[LocalVariableDescriptor]

'add' @ [164:20] ==> public abstract fun add(element: Generator<A>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'generator' @ [164:24] ==> value-parameter generator: Generator<A> defined in net.corda.client.mock.replicate[ValueParameterDescriptorImpl]

'sequence' @ [166:12] ==> public final fun <A> sequence(generators: List<Generator<A>>): Generator<List<A>> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> A

'generators' @ [166:21] ==> val generators: MutableList<Generator<A>> defined in net.corda.client.mock.replicate[LocalVariableDescriptor]

'Generator' @ [170:120] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<List<A>>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> List<A>

'/' @ [171:18] ==> public final operator fun div(other: Double): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'meanSize' @ [171:19] ==> value-parameter meanSize: Double defined in net.corda.client.mock.replicatePoisson[ValueParameterDescriptorImpl]

'meanSize' @ [171:35] ==> value-parameter meanSize: Double defined in net.corda.client.mock.replicatePoisson[ValueParameterDescriptorImpl]

'mutableListOf' @ [172:18] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'!' @ [174:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'finish' @ [174:13] ==> var finish: Boolean defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'Generator' @ [175:19] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'doubleRange' @ [175:29] ==> public fun Generator.Companion.doubleRange(from: Double, to: Double): Generator<Double> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [175:51] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<Double> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [175:60] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.replicatePoisson.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [175:64] ==> public final inline fun <B> flatMap(function: (Double) -> Try<Any>): Try<Any> defined in net.corda.core.utilities.Try[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> Any

'if (value < chance) {
                generator.generate(it).map { result.add(it) }
            } else {
                finish = true
                if (result.isEmpty() && atLeastOne) {
                    generator.generate(it).map { result.add(it) }
                } else Try.Success(Unit)
            }' @ [176:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Try<Any>, elseBranch: Try<Any>): Try<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Try<Any>

'value' @ [176:17] ==> value-parameter value: Double defined in net.corda.client.mock.replicatePoisson.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'chance' @ [176:25] ==> val chance: Double defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'generator' @ [177:17] ==> value-parameter generator: Generator<A> defined in net.corda.client.mock.replicatePoisson[ValueParameterDescriptorImpl]

'invoke' @ [177:27] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<A> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [177:36] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.replicatePoisson.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [177:40] ==> public final inline fun <B> map(function: (A) -> Boolean): Try<Boolean> defined in net.corda.core.utilities.Try[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> Boolean

'result' @ [177:46] ==> val result: MutableList<A> defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'add' @ [177:53] ==> public abstract fun add(element: A): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [177:57] ==> value-parameter it: A defined in net.corda.client.mock.replicatePoisson.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'finish' @ [179:17] ==> var finish: Boolean defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'if (result.isEmpty() && atLeastOne) {
                    generator.generate(it).map { result.add(it) }
                } else Try.Success(Unit)' @ [180:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Try<Any>, elseBranch: Try<Any>): Try<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Try<Any>

'result' @ [180:21] ==> val result: MutableList<A> defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [180:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'atLeastOne' @ [180:41] ==> value-parameter atLeastOne: Boolean = ... defined in net.corda.client.mock.replicatePoisson[ValueParameterDescriptorImpl]

'generator' @ [181:21] ==> value-parameter generator: Generator<A> defined in net.corda.client.mock.replicatePoisson[ValueParameterDescriptorImpl]

'invoke' @ [181:31] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<A> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [181:40] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.replicatePoisson.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [181:44] ==> public final inline fun <B> map(function: (A) -> Boolean): Try<Boolean> defined in net.corda.core.utilities.Try[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> Boolean

'result' @ [181:50] ==> val result: MutableList<A> defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'add' @ [181:57] ==> public abstract fun add(element: A): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [181:61] ==> value-parameter it: A defined in net.corda.client.mock.replicatePoisson.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Success' @ [182:28] ==> public constructor Success<out A>(value: Unit) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Unit

'Unit' @ [182:36] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'res' @ [185:13] ==> val res: Try<Any> defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'res' @ [186:30] ==> val res: Try<Any> defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'Try' @ [189:5] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Success' @ [189:9] ==> public constructor Success<out A>(value: MutableList<A>) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> MutableList<A>

'result' @ [189:17] ==> val result: MutableList<A> defined in net.corda.client.mock.replicatePoisson.<anonymous>[LocalVariableDescriptor]

'Generator' @ [192:54] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'intRange' @ [192:64] ==> public fun Generator.Companion.intRange(from: Int, to: Int): Generator<Int> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'list' @ [192:76] ==> value-parameter list: List<A> defined in net.corda.client.mock.pickOne[ValueParameterDescriptorImpl]

'size' @ [192:81] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'map' @ [192:91] ==> public final fun <B> map(function: (Int) -> A): Generator<A> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> A

'list' @ [192:97] ==> value-parameter list: List<A> defined in net.corda.client.mock.pickOne[ValueParameterDescriptorImpl]

'it' @ [192:102] ==> value-parameter it: Int defined in net.corda.client.mock.pickOne.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [193:65] ==> public constructor Generator<out A>(generate: (SplittableRandom) -> Try<List<A>>) defined in net.corda.client.mock.Generator[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> List<A>

'BitSet' @ [194:16] ==> public constructor BitSet(p0: Int) defined in java.util.BitSet[JavaClassConstructorDescriptor]

'list' @ [194:23] ==> value-parameter list: List<A> defined in net.corda.client.mock.pickN[ValueParameterDescriptorImpl]

'size' @ [194:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'min' @ [195:21] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'list' @ [195:25] ==> value-parameter list: List<A> defined in net.corda.client.mock.pickN[ValueParameterDescriptorImpl]

'size' @ [195:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'number' @ [195:36] ==> value-parameter number: Int defined in net.corda.client.mock.pickN[ValueParameterDescriptorImpl]

'..' @ [196:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [196:18] ==> val size: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'mask' @ [198:9] ==> val mask: BitSet defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'i' @ [198:14] ==> val i: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'..' @ [200:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'list' @ [200:18] ==> value-parameter list: List<A> defined in net.corda.client.mock.pickN[ValueParameterDescriptorImpl]

'size' @ [200:23] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'mask' @ [201:19] ==> val mask: BitSet defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'i' @ [201:24] ==> val i: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'i' @ [202:25] ==> val i: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'it' @ [202:29] ==> value-parameter it: SplittableRandom defined in net.corda.client.mock.pickN.<anonymous>[ValueParameterDescriptorImpl]

'nextInt' @ [202:32] ==> public open fun nextInt(p0: Int): Int defined in java.util.SplittableRandom[JavaMethodDescriptor]

'size' @ [202:40] ==> val size: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'i' @ [202:47] ==> val i: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'mask' @ [203:9] ==> val mask: BitSet defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'i' @ [203:14] ==> val i: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'mask' @ [203:19] ==> val mask: BitSet defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'swapIndex' @ [203:24] ==> val swapIndex: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'mask' @ [204:9] ==> val mask: BitSet defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'swapIndex' @ [204:14] ==> val swapIndex: Int defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'bit' @ [204:27] ==> val bit: Boolean defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [206:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'list' @ [207:5] ==> value-parameter list: List<A> defined in net.corda.client.mock.pickN[ValueParameterDescriptorImpl]

'forEachIndexed' @ [207:10] ==> public inline fun <T> Iterable<A>.forEachIndexed(action: (index: Int, A) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'mask' @ [208:13] ==> val mask: BitSet defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'index' @ [208:18] ==> value-parameter index: Int defined in net.corda.client.mock.pickN.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultList' @ [209:13] ==> val resultList: ArrayList<A> defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'add' @ [209:24] ==> public open fun add(element: A): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'a' @ [209:28] ==> value-parameter a: A defined in net.corda.client.mock.pickN.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Try' @ [212:5] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'Success' @ [212:9] ==> public constructor Success<out A>(value: ArrayList<A>) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ArrayList<A>

'resultList' @ [212:17] ==> val resultList: ArrayList<A> defined in net.corda.client.mock.pickN.<anonymous>[LocalVariableDescriptor]

'sampleBernoulli' @ [216:9] ==> public fun <A> Generator.Companion.sampleBernoulli(collection: Collection<Array<out A>>, meanRatio: Double = ...): Generator<List<Array<out A>>> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Array<out A>

'listOf' @ [216:25] ==> public fun <T> listOf(element: Array<out A>): List<Array<out A>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<out A>

'collection' @ [216:32] ==> value-parameter vararg collection: A defined in net.corda.client.mock.sampleBernoulli[ValueParameterDescriptorImpl]

'maxRatio' @ [216:45] ==> value-parameter maxRatio: Double = ... defined in net.corda.client.mock.sampleBernoulli[ValueParameterDescriptorImpl]

'replicate' @ [219:9] ==> public fun <A> Generator.Companion.replicate(number: Int, generator: Generator<Double>): Generator<List<Double>> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Double

'collection' @ [219:19] ==> value-parameter collection: Collection<A> defined in net.corda.client.mock.sampleBernoulli[ValueParameterDescriptorImpl]

'size' @ [219:30] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'doubleRange' @ [219:46] ==> public fun Generator.Companion.doubleRange(from: Double, to: Double): Generator<Double> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'map' @ [219:69] ==> public final fun <B> map(function: (List<Double>) -> MutableList<A>): Generator<MutableList<A>> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> MutableList<A>

'mutableListOf' @ [220:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'collection' @ [221:13] ==> value-parameter collection: Collection<A> defined in net.corda.client.mock.sampleBernoulli[ValueParameterDescriptorImpl]

'forEachIndexed' @ [221:24] ==> public inline fun <T> Iterable<A>.forEachIndexed(action: (index: Int, A) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'chances' @ [222:21] ==> value-parameter chances: List<Double> defined in net.corda.client.mock.sampleBernoulli.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [222:29] ==> value-parameter index: Int defined in net.corda.client.mock.sampleBernoulli.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'meanRatio' @ [222:38] ==> value-parameter meanRatio: Double = ... defined in net.corda.client.mock.sampleBernoulli[ValueParameterDescriptorImpl]

'result' @ [223:21] ==> val result: MutableList<A> defined in net.corda.client.mock.sampleBernoulli.<anonymous>[LocalVariableDescriptor]

'add' @ [223:28] ==> public abstract fun add(element: A): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [223:32] ==> value-parameter element: A defined in net.corda.client.mock.sampleBernoulli.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [226:13] ==> val result: MutableList<A> defined in net.corda.client.mock.sampleBernoulli.<anonymous>[LocalVariableDescriptor]

