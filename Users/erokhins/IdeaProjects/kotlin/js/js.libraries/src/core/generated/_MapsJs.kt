'kotlin.jvm.JvmMultifileClass' @ [1:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'size' @ [18:9] ==> public abstract val size: Int defined in kotlin.collections.Map[PropertyDescriptorImpl]

'emptyList' @ [19:16] ==> public fun <T> emptyList(): List<Pair<K, V>> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<K, V>

'entries' @ [20:20] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[PropertyDescriptorImpl]

'iterator' @ [20:28] ==> public abstract fun iterator(): Iterator<Map.Entry<K, V>> defined in kotlin.collections.Set[SimpleFunctionDescriptorImpl]

'!' @ [21:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [21:10] ==> val iterator: Iterator<Map.Entry<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'hasNext' @ [21:19] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'emptyList' @ [22:16] ==> public fun <T> emptyList(): List<Pair<K, V>> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<K, V>

'iterator' @ [23:17] ==> val iterator: Iterator<Map.Entry<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'next' @ [23:26] ==> public abstract operator fun next(): Map.Entry<K, V> defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'!' @ [24:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [24:10] ==> val iterator: Iterator<Map.Entry<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'hasNext' @ [24:19] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'listOf' @ [25:16] ==> public fun <T> listOf(element: Pair<K, V>): List<Pair<K, V>> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<K, V>

'first' @ [25:23] ==> val first: Map.Entry<K, V> defined in kotlin.collections.toList[LocalVariableDescriptor]

'toPair' @ [25:29] ==> @InlineOnly public inline fun <K, V> Map.Entry<K, V>.toPair(): Pair<K, V> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'ArrayList' @ [26:18] ==> public constructor ArrayList<E>(@Suppress capacity: Int = ...) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> Pair<K, V>

'size' @ [26:40] ==> public abstract val size: Int defined in kotlin.collections.Map[PropertyDescriptorImpl]

'result' @ [27:5] ==> val result: ArrayList<Pair<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'add' @ [27:12] ==> public open fun add(element: Pair<K, V>): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'first' @ [27:16] ==> val first: Map.Entry<K, V> defined in kotlin.collections.toList[LocalVariableDescriptor]

'toPair' @ [27:22] ==> @InlineOnly public inline fun <K, V> Map.Entry<K, V>.toPair(): Pair<K, V> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'result' @ [29:9] ==> val result: ArrayList<Pair<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'add' @ [29:16] ==> public open fun add(element: Pair<K, V>): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'iterator' @ [29:20] ==> val iterator: Iterator<Map.Entry<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'next' @ [29:29] ==> public abstract operator fun next(): Map.Entry<K, V> defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'toPair' @ [29:36] ==> @InlineOnly public inline fun <K, V> Map.Entry<K, V>.toPair(): Pair<K, V> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'iterator' @ [30:14] ==> val iterator: Iterator<Map.Entry<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'hasNext' @ [30:23] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'result' @ [31:12] ==> val result: ArrayList<Pair<K, V>> defined in kotlin.collections.toList[LocalVariableDescriptor]

'flatMapTo' @ [38:12] ==> public inline fun <K, V, R, C : MutableCollection<in R>> Map<out K, V>.flatMapTo(destination: ArrayList<R>, transform: (Map.Entry<K, V>) -> Iterable<R>): ArrayList<R> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V
    <R> -> R
    <C : MutableCollection<in R>> -> ArrayList<R>

'ArrayList' @ [38:22] ==> public constructor ArrayList<E>(@Suppress capacity: Int = ...) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> R

'transform' @ [38:38] ==> value-parameter transform: (Map.Entry<K, V>) -> Iterable<R> defined in kotlin.collections.flatMap[ValueParameterDescriptorImpl]

'this' @ [45:21] ==> <this> defined in kotlin.collections.flatMapTo[ReceiverParameterDescriptorImpl]

'invoke' @ [46:20] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): Iterable<R> defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [46:30] ==> val element: Map.Entry<K, V> defined in kotlin.collections.flatMapTo[LocalVariableDescriptor]

'destination' @ [47:9] ==> value-parameter destination: C defined in kotlin.collections.flatMapTo[ValueParameterDescriptorImpl]

'addAll' @ [47:21] ==> public fun <T> MutableCollection<in R>.addAll(elements: Iterable<R>): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> R

'list' @ [47:28] ==> val list: Iterable<R> defined in kotlin.collections.flatMapTo[LocalVariableDescriptor]

'destination' @ [49:12] ==> value-parameter destination: C defined in kotlin.collections.flatMapTo[ValueParameterDescriptorImpl]

'mapTo' @ [57:12] ==> public inline fun <K, V, R, C : MutableCollection<in R>> Map<out K, V>.mapTo(destination: ArrayList<R>, transform: (Map.Entry<K, V>) -> R): ArrayList<R> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V
    <R> -> R
    <C : MutableCollection<in R>> -> ArrayList<R>

'ArrayList' @ [57:18] ==> public constructor ArrayList<E>(@Suppress capacity: Int = ...) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> R

'size' @ [57:31] ==> public abstract val size: Int defined in kotlin.collections.Map[PropertyDescriptorImpl]

'transform' @ [57:38] ==> value-parameter transform: (Map.Entry<K, V>) -> R defined in kotlin.collections.map[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [65:12] ==> public inline fun <K, V, R : Any, C : MutableCollection<in R>> Map<out K, V>.mapNotNullTo(destination: ArrayList<R>, transform: (Map.Entry<K, V>) -> R?): ArrayList<R> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V
    <R : Any> -> R
    <C : MutableCollection<in R>> -> ArrayList<R>

'ArrayList' @ [65:25] ==> public constructor ArrayList<E>(@Suppress capacity: Int = ...) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> R

'transform' @ [65:41] ==> value-parameter transform: (Map.Entry<K, V>) -> R? defined in kotlin.collections.mapNotNull[ValueParameterDescriptorImpl]

'forEach' @ [73:5] ==> @HidesMembers public inline fun <K, V> Map<out K, V>.forEach(action: (Map.Entry<K, V>) -> Unit): Unit defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'invoke' @ [73:26] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): R? defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [73:36] ==> value-parameter element: Map.Entry<K, V> defined in kotlin.collections.mapNotNullTo.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [73:46] ==> @InlineOnly public inline fun <T, R> R.let(block: (R) -> Boolean): Boolean defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> R
    <R> -> Boolean

'destination' @ [73:52] ==> value-parameter destination: C defined in kotlin.collections.mapNotNullTo[ValueParameterDescriptorImpl]

'add' @ [73:64] ==> public abstract fun add(element: R): Boolean defined in kotlin.collections.MutableCollection[SimpleFunctionDescriptorImpl]

'it' @ [73:68] ==> value-parameter it: R defined in kotlin.collections.mapNotNullTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'destination' @ [74:12] ==> value-parameter destination: C defined in kotlin.collections.mapNotNullTo[ValueParameterDescriptorImpl]

'this' @ [82:18] ==> <this> defined in kotlin.collections.mapTo[ReceiverParameterDescriptorImpl]

'destination' @ [83:9] ==> value-parameter destination: C defined in kotlin.collections.mapTo[ValueParameterDescriptorImpl]

'add' @ [83:21] ==> public abstract fun add(element: R): Boolean defined in kotlin.collections.MutableCollection[SimpleFunctionDescriptorImpl]

'invoke' @ [83:25] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'item' @ [83:35] ==> val item: Map.Entry<K, V> defined in kotlin.collections.mapTo[LocalVariableDescriptor]

'destination' @ [84:12] ==> value-parameter destination: C defined in kotlin.collections.mapTo[ValueParameterDescriptorImpl]

'isEmpty' @ [91:9] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[SimpleFunctionDescriptorImpl]

'this' @ [92:21] ==> <this> defined in kotlin.collections.all[ReceiverParameterDescriptorImpl]

'!' @ [92:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [92:32] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [92:42] ==> val element: Map.Entry<K, V> defined in kotlin.collections.all[LocalVariableDescriptor]

'!' @ [100:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [100:13] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[SimpleFunctionDescriptorImpl]

'isEmpty' @ [107:9] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[SimpleFunctionDescriptorImpl]

'this' @ [108:21] ==> <this> defined in kotlin.collections.any[ReceiverParameterDescriptorImpl]

'invoke' @ [108:31] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [108:41] ==> val element: Map.Entry<K, V> defined in kotlin.collections.any[LocalVariableDescriptor]

'kotlin.internal.InlineOnly' @ [115:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'size' @ [117:12] ==> public abstract val size: Int defined in kotlin.collections.Map[PropertyDescriptorImpl]

'isEmpty' @ [124:9] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[SimpleFunctionDescriptorImpl]

'this' @ [126:21] ==> <this> defined in kotlin.collections.count[ReceiverParameterDescriptorImpl]

'invoke' @ [126:31] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [126:41] ==> val element: Map.Entry<K, V> defined in kotlin.collections.count[LocalVariableDescriptor]

'count' @ [126:51] ==> var count: Int defined in kotlin.collections.count[LocalVariableDescriptor]

'count' @ [127:12] ==> var count: Int defined in kotlin.collections.count[LocalVariableDescriptor]

'kotlin.internal.HidesMembers' @ [133:1] ==> public constructor HidesMembers() defined in kotlin.internal.HidesMembers[ClassConstructorDescriptorImpl]

'this' @ [135:21] ==> <this> defined in kotlin.collections.forEach[ReceiverParameterDescriptorImpl]

'invoke' @ [135:27] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [135:34] ==> val element: Map.Entry<K, V> defined in kotlin.collections.forEach[LocalVariableDescriptor]

'kotlin.internal.InlineOnly' @ [141:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'entries' @ [143:12] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[PropertyDescriptorImpl]

'maxBy' @ [143:20] ==> public inline fun <T, R : Comparable<R>> Iterable<Map.Entry<K, V>>.maxBy(selector: (Map.Entry<K, V>) -> R): Map.Entry<K, V>? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Entry<K, V>
    <R : Comparable<R>> -> R

'selector' @ [143:26] ==> value-parameter selector: (Map.Entry<K, V>) -> R defined in kotlin.collections.maxBy[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [149:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'entries' @ [151:12] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[PropertyDescriptorImpl]

'maxWith' @ [151:20] ==> public fun <T> Iterable<Map.Entry<K, V>>.maxWith(comparator: Comparator<in Map.Entry<K, V>>): Map.Entry<K, V>? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Entry<K, V>

'comparator' @ [151:28] ==> value-parameter comparator: Comparator<in Map.Entry<K, V>> defined in kotlin.collections.maxWith[ValueParameterDescriptorImpl]

'entries' @ [158:12] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[PropertyDescriptorImpl]

'minBy' @ [158:20] ==> public inline fun <T, R : Comparable<R>> Iterable<Map.Entry<K, V>>.minBy(selector: (Map.Entry<K, V>) -> R): Map.Entry<K, V>? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Entry<K, V>
    <R : Comparable<R>> -> R

'selector' @ [158:26] ==> value-parameter selector: (Map.Entry<K, V>) -> R defined in kotlin.collections.minBy[ValueParameterDescriptorImpl]

'entries' @ [165:12] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[PropertyDescriptorImpl]

'minWith' @ [165:20] ==> public fun <T> Iterable<Map.Entry<K, V>>.minWith(comparator: Comparator<in Map.Entry<K, V>>): Map.Entry<K, V>? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Entry<K, V>

'comparator' @ [165:28] ==> value-parameter comparator: Comparator<in Map.Entry<K, V>> defined in kotlin.collections.minWith[ValueParameterDescriptorImpl]

'isEmpty' @ [172:12] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[SimpleFunctionDescriptorImpl]

'isEmpty' @ [179:9] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[SimpleFunctionDescriptorImpl]

'this' @ [180:21] ==> <this> defined in kotlin.collections.none[ReceiverParameterDescriptorImpl]

'invoke' @ [180:31] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [180:41] ==> val element: Map.Entry<K, V> defined in kotlin.collections.none[LocalVariableDescriptor]

'SinceKotlin' @ [187:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'apply' @ [189:12] ==> @InlineOnly public inline fun <T> M.apply(block: M.() -> Unit): M defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> M

'this' @ [189:36] ==> <this> defined in kotlin.collections.onEach.<anonymous>[ReceiverParameterDescriptorImpl]

'invoke' @ [189:42] ==> public abstract operator fun invoke(p1: Map.Entry<K, V>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [189:49] ==> val element: Map.Entry<K, V> defined in kotlin.collections.onEach.<anonymous>[LocalVariableDescriptor]

'kotlin.internal.InlineOnly' @ [195:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'entries' @ [197:12] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[PropertyDescriptorImpl]

'entries' @ [204:12] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[PropertyDescriptorImpl]

'asSequence' @ [204:20] ==> public fun <T> Iterable<Map.Entry<K, V>>.asSequence(): Sequence<Map.Entry<K, V>> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Entry<K, V>

