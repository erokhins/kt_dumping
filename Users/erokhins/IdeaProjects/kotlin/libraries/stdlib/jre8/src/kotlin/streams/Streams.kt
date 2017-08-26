'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [10:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Sequence' @ [11:54] ==> @InlineOnly public inline fun <T> Sequence(crossinline iterator: () -> Iterator<(T..T?)>): Sequence<(T..T?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'iterator' @ [11:65] ==> public abstract fun iterator(): (MutableIterator<(T..T?)>..Iterator<(T..T?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]

'SinceKotlin' @ [16:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Sequence' @ [17:52] ==> @InlineOnly public inline fun <T> Sequence(crossinline iterator: () -> Iterator<(Int..Int?)>): Sequence<(Int..Int?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'iterator' @ [17:63] ==> public abstract fun iterator(): (PrimitiveIterator.OfInt..PrimitiveIterator.OfInt?) defined in java.util.stream.IntStream[JavaMethodDescriptor]

'SinceKotlin' @ [22:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Sequence' @ [23:54] ==> @InlineOnly public inline fun <T> Sequence(crossinline iterator: () -> Iterator<(Long..Long?)>): Sequence<(Long..Long?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Long..kotlin.Long?)

'iterator' @ [23:65] ==> public abstract fun iterator(): (PrimitiveIterator.OfLong..PrimitiveIterator.OfLong?) defined in java.util.stream.LongStream[JavaMethodDescriptor]

'SinceKotlin' @ [28:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Sequence' @ [29:58] ==> @InlineOnly public inline fun <T> Sequence(crossinline iterator: () -> Iterator<(Double..Double?)>): Sequence<(Double..Double?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Double..kotlin.Double?)

'iterator' @ [29:69] ==> public abstract fun iterator(): (PrimitiveIterator.OfDouble..PrimitiveIterator.OfDouble?) defined in java.util.stream.DoubleStream[JavaMethodDescriptor]

'SinceKotlin' @ [34:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'stream' @ [35:66] ==> public final fun <T : (Any..Any?)> stream(p0: (() -> (Spliterator<(T..T?)>..Spliterator<(T..T?)>?)..(() -> (Spliterator<(T..T?)>..Spliterator<(T..T?)>?))?), p1: Int, p2: Boolean): (Stream<(T..T?)>..Stream<(T..T?)>?) defined in java.util.stream.StreamSupport[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'spliteratorUnknownSize' @ [35:88] ==> public open fun <T : (Any..Any?)> spliteratorUnknownSize(p0: (MutableIterator<(T..T?)>..Iterator<(T..T?)>?), p1: Int): (Spliterator<(T..T?)>..Spliterator<(T..T?)>?) defined in java.util.Spliterators[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'iterator' @ [35:111] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'ORDERED' @ [35:135] ==> public const final val ORDERED: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'ORDERED' @ [35:159] ==> public const final val ORDERED: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'SinceKotlin' @ [40:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'collect' @ [41:46] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (T..T?), (Any..Any?), (MutableList<T>..MutableList<T>?)>..Collector<in (T..T?), (Any..Any?), (MutableList<T>..MutableList<T>?)>?)): (MutableList<T>..MutableList<T>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> MutableList<T>
    <A : (Any..Any?)> -> Any

'toList' @ [41:87] ==> public open fun <T : (Any..Any?)> toList(): (Collector<(T..T?), *, (MutableList<(T..T?)>..List<(T..T?)>?)>..Collector<(T..T?), *, (MutableList<(T..T?)>..List<(T..T?)>?)>?) defined in java.util.stream.Collectors[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'SinceKotlin' @ [46:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'toArray' @ [47:44] ==> public abstract fun toArray(): (IntArray..IntArray?) defined in java.util.stream.IntStream[JavaMethodDescriptor]

'asList' @ [47:54] ==> public fun IntArray.asList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'SinceKotlin' @ [52:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'toArray' @ [53:46] ==> public abstract fun toArray(): (LongArray..LongArray?) defined in java.util.stream.LongStream[JavaMethodDescriptor]

'asList' @ [53:56] ==> public fun LongArray.asList(): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'SinceKotlin' @ [58:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'toArray' @ [59:50] ==> public abstract fun toArray(): (DoubleArray..DoubleArray?) defined in java.util.stream.DoubleStream[JavaMethodDescriptor]

'asList' @ [59:60] ==> public fun DoubleArray.asList(): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

