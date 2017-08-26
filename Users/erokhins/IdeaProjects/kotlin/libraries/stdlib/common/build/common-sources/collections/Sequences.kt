'kotlin.jvm.JvmMultifileClass' @ [1:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'kotlin.internal.InlineOnly' @ [13:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'invoke' @ [15:44] ==> public abstract operator fun invoke(): Iterator<T> defined in kotlin.Function0[FunctionInvokeDescriptor]

'Sequence' @ [23:56] ==> @InlineOnly public inline fun <T> Sequence(crossinline iterator: () -> Iterator<T>): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [23:67] ==> <this> defined in kotlin.sequences.asSequence[ReceiverParameterDescriptorImpl]

'constrainOnce' @ [23:74] ==> public fun <T> Sequence<T>.constrainOnce(): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'if (elements.isEmpty()) emptySequence() else elements.asSequence()' @ [37:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<T>, elseBranch: Sequence<T>): Sequence<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<T>

'elements' @ [37:66] ==> value-parameter vararg elements: T defined in kotlin.sequences.sequenceOf[ValueParameterDescriptorImpl]

'isEmpty' @ [37:75] ==> @InlineOnly public header inline fun <T> Array<out T>.isEmpty(): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'emptySequence' @ [37:86] ==> public fun <T> emptySequence(): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'elements' @ [37:107] ==> value-parameter vararg elements: T defined in kotlin.sequences.sequenceOf[ValueParameterDescriptorImpl]

'asSequence' @ [37:116] ==> public header fun <T> Array<out T>.asSequence(): Sequence<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'EmptySequence' @ [42:47] ==> private object EmptySequence : Sequence<Nothing>, DropTakeSequence<Nothing> defined in kotlin.sequences in file Sequences.kt[FakeCallableDescriptorForObject]

'EmptyIterator' @ [45:50] ==> internal object EmptyIterator : ListIterator<Nothing> defined in kotlin.collections in file Collections.kt[FakeCallableDescriptorForObject]

'EmptySequence' @ [46:33] ==> private object EmptySequence : Sequence<Nothing>, DropTakeSequence<Nothing> defined in kotlin.sequences in file Sequences.kt[FakeCallableDescriptorForObject]

'EmptySequence' @ [47:33] ==> private object EmptySequence : Sequence<Nothing>, DropTakeSequence<Nothing> defined in kotlin.sequences in file Sequences.kt[FakeCallableDescriptorForObject]

'flatten' @ [55:63] ==> private fun <T, R> Sequence<Sequence<T>>.flatten(iterator: (Sequence<T>) -> Iterator<T>): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Sequence<T>
    <R> -> T

'it' @ [55:73] ==> value-parameter it: Sequence<T> defined in kotlin.sequences.flatten.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [55:76] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'kotlin.jvm.JvmName' @ [62:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'flatten' @ [63:63] ==> private fun <T, R> Sequence<Iterable<T>>.flatten(iterator: (Iterable<T>) -> Iterator<T>): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Iterable<T>
    <R> -> T

'it' @ [63:73] ==> value-parameter it: Iterable<T> defined in kotlin.sequences.flatten.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [63:76] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'this' @ [66:9] ==> <this> defined in kotlin.sequences.flatten[ReceiverParameterDescriptorImpl]

'this' @ [67:17] ==> <this> defined in kotlin.sequences.flatten[ReceiverParameterDescriptorImpl]

'flatten' @ [67:53] ==> internal final fun <E> flatten(iterator: (T) -> Iterator<R>): Sequence<R> defined in kotlin.sequences.TransformingSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> R

'iterator' @ [67:61] ==> value-parameter iterator: (T) -> Iterator<R> defined in kotlin.sequences.flatten[ValueParameterDescriptorImpl]

'FlatteningSequence' @ [69:12] ==> public constructor FlatteningSequence<T, R, E>(sequence: Sequence<T>, transformer: (T) -> T, iterator: (T) -> Iterator<R>) defined in kotlin.sequences.FlatteningSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <R> -> T
    <E> -> R

'this' @ [69:31] ==> <this> defined in kotlin.sequences.flatten[ReceiverParameterDescriptorImpl]

'it' @ [69:39] ==> value-parameter it: T defined in kotlin.sequences.flatten.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [69:45] ==> value-parameter iterator: (T) -> Iterator<R> defined in kotlin.sequences.flatten[ValueParameterDescriptorImpl]

'ArrayList' @ [80:17] ==> public constructor ArrayList<E>() defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> T

'ArrayList' @ [81:17] ==> public constructor ArrayList<E>() defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> R

'this' @ [82:18] ==> <this> defined in kotlin.sequences.unzip[ReceiverParameterDescriptorImpl]

'listT' @ [83:9] ==> val listT: ArrayList<T> defined in kotlin.sequences.unzip[LocalVariableDescriptor]

'add' @ [83:15] ==> public open header fun add(element: T): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'pair' @ [83:19] ==> val pair: Pair<T, R> defined in kotlin.sequences.unzip[LocalVariableDescriptor]

'first' @ [83:24] ==> public final val first: T defined in kotlin.Pair[PropertyDescriptorImpl]

'listR' @ [84:9] ==> val listR: ArrayList<R> defined in kotlin.sequences.unzip[LocalVariableDescriptor]

'add' @ [84:15] ==> public open header fun add(element: R): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'pair' @ [84:19] ==> val pair: Pair<T, R> defined in kotlin.sequences.unzip[LocalVariableDescriptor]

'second' @ [84:24] ==> public final val second: R defined in kotlin.Pair[PropertyDescriptorImpl]

'listT' @ [86:12] ==> val listT: ArrayList<T> defined in kotlin.sequences.unzip[LocalVariableDescriptor]

'listR' @ [86:21] ==> val listR: ArrayList<R> defined in kotlin.sequences.unzip[LocalVariableDescriptor]

'sequence' @ [102:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.FilteringSequence[PropertyDescriptorImpl]

'iterator' @ [102:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'-' @ [103:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'iterator' @ [107:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [107:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [108:28] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [108:37] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'invoke' @ [109:21] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'item' @ [109:31] ==> val item: T defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'sendWhen' @ [109:40] ==> private final val sendWhen: Boolean defined in kotlin.sequences.FilteringSequence[PropertyDescriptorImpl]

'nextItem' @ [110:21] ==> public final var nextItem: T? defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'item' @ [110:32] ==> val item: T defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'nextState' @ [111:21] ==> public final var nextState: Int defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [115:13] ==> public final var nextState: Int defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [119:17] ==> public final var nextState: Int defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [119:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calcNext' @ [120:17] ==> private final fun calcNext(): Unit defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [121:17] ==> public final var nextState: Int defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [122:23] ==> public constructor NoSuchElementException() defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'nextItem' @ [123:26] ==> public final var nextItem: T? defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextItem' @ [124:13] ==> public final var nextItem: T? defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [125:13] ==> public final var nextState: Int defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [125:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [126:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'result' @ [127:20] ==> val result: T? defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>.next[LocalVariableDescriptor]

'nextState' @ [131:17] ==> public final var nextState: Int defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [131:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calcNext' @ [132:17] ==> private final fun calcNext(): Unit defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [133:20] ==> public final var nextState: Int defined in kotlin.sequences.FilteringSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'sequence' @ [146:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.TransformingSequence[PropertyDescriptorImpl]

'iterator' @ [146:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'invoke' @ [148:20] ==> public abstract operator fun invoke(p1: T): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'iterator' @ [148:32] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TransformingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [148:41] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [152:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TransformingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [152:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'FlatteningSequence' @ [157:16] ==> public constructor FlatteningSequence<T, R, E>(sequence: Sequence<T>, transformer: (T) -> R, iterator: (R) -> Iterator<E>) defined in kotlin.sequences.FlatteningSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <R> -> R
    <E> -> E

'sequence' @ [157:44] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.TransformingSequence[PropertyDescriptorImpl]

'transformer' @ [157:54] ==> private final val transformer: (T) -> R defined in kotlin.sequences.TransformingSequence[PropertyDescriptorImpl]

'iterator' @ [157:67] ==> value-parameter iterator: (R) -> Iterator<E> defined in kotlin.sequences.TransformingSequence.flatten[ValueParameterDescriptorImpl]

'sequence' @ [169:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.TransformingIndexedSequence[PropertyDescriptorImpl]

'iterator' @ [169:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'invoke' @ [172:20] ==> public abstract operator fun invoke(p1: Int, p2: T): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'index' @ [172:32] ==> public final var index: Int defined in kotlin.sequences.TransformingIndexedSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [172:41] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TransformingIndexedSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [172:50] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [176:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TransformingIndexedSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [176:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'sequence' @ [188:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.IndexingSequence[PropertyDescriptorImpl]

'iterator' @ [188:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'IndexedValue' @ [191:20] ==> public constructor IndexedValue<out T>(index: Int, value: T) defined in kotlin.collections.IndexedValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'index' @ [191:33] ==> public final var index: Int defined in kotlin.sequences.IndexingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [191:42] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.IndexingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [191:51] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [195:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.IndexingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [195:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'sequence1' @ [211:25] ==> private final val sequence1: Sequence<T1> defined in kotlin.sequences.MergingSequence[PropertyDescriptorImpl]

'iterator' @ [211:35] ==> public abstract operator fun iterator(): Iterator<T1> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'sequence2' @ [212:25] ==> private final val sequence2: Sequence<T2> defined in kotlin.sequences.MergingSequence[PropertyDescriptorImpl]

'iterator' @ [212:35] ==> public abstract operator fun iterator(): Iterator<T2> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'invoke' @ [214:20] ==> public abstract operator fun invoke(p1: T1, p2: T2): V defined in kotlin.Function2[FunctionInvokeDescriptor]

'iterator1' @ [214:30] ==> public final val iterator1: Iterator<T1> defined in kotlin.sequences.MergingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [214:40] ==> public abstract operator fun next(): T1 defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator2' @ [214:48] ==> public final val iterator2: Iterator<T2> defined in kotlin.sequences.MergingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [214:58] ==> public abstract operator fun next(): T2 defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator1' @ [218:20] ==> public final val iterator1: Iterator<T1> defined in kotlin.sequences.MergingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [218:30] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator2' @ [218:43] ==> public final val iterator2: Iterator<T2> defined in kotlin.sequences.MergingSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [218:53] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'sequence' @ [230:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.FlatteningSequence[PropertyDescriptorImpl]

'iterator' @ [230:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'!' @ [234:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ensureItemIterator' @ [234:18] ==> private final fun ensureItemIterator(): Boolean defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'NoSuchElementException' @ [235:23] ==> public constructor NoSuchElementException() defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'itemIterator' @ [236:20] ==> public final var itemIterator: Iterator<E>? defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [236:35] ==> public abstract operator fun next(): E defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'ensureItemIterator' @ [240:20] ==> private final fun ensureItemIterator(): Boolean defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'itemIterator' @ [244:17] ==> public final var itemIterator: Iterator<E>? defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [244:31] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'itemIterator' @ [245:17] ==> public final var itemIterator: Iterator<E>? defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'itemIterator' @ [247:20] ==> public final var itemIterator: Iterator<E>? defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (!iterator.hasNext()) {
                    return false
                } else {
                    val element = iterator.next()
                    val nextItemIterator = iterator(transformer(element))
                    if (nextItemIterator.hasNext()) {
                        itemIterator = nextItemIterator
                        return true
                    }
                }' @ [248:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [248:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [248:22] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [248:31] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [251:35] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [251:44] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'invoke' @ [252:44] ==> public abstract operator fun invoke(p1: R): Iterator<E> defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [252:53] ==> public abstract operator fun invoke(p1: T): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [252:65] ==> val element: T defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>.ensureItemIterator[LocalVariableDescriptor]

'nextItemIterator' @ [253:25] ==> val nextItemIterator: Iterator<E> defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>.ensureItemIterator[LocalVariableDescriptor]

'hasNext' @ [253:42] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'itemIterator' @ [254:25] ==> public final var itemIterator: Iterator<E>? defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextItemIterator' @ [254:40] ==> val nextItemIterator: Iterator<E> defined in kotlin.sequences.FlatteningSequence.iterator.<no name provided>.ensureItemIterator[LocalVariableDescriptor]

'require' @ [283:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'startIndex' @ [283:17] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'startIndex' @ [283:80] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'require' @ [284:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'endIndex' @ [284:17] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'endIndex' @ [284:76] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'require' @ [285:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'endIndex' @ [285:17] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'startIndex' @ [285:29] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'endIndex' @ [285:98] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'startIndex' @ [285:110] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'endIndex' @ [288:36] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'startIndex' @ [288:47] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'if (n >= count) emptySequence() else SubSequence(sequence, startIndex + n, endIndex)' @ [290:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<T>, elseBranch: Sequence<T>): Sequence<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<T>

'n' @ [290:50] ==> value-parameter n: Int defined in kotlin.sequences.SubSequence.drop[ValueParameterDescriptorImpl]

'count' @ [290:55] ==> private final val count: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'emptySequence' @ [290:62] ==> public fun <T> emptySequence(): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'SubSequence' @ [290:83] ==> public constructor SubSequence<T>(sequence: Sequence<T>, startIndex: Int, endIndex: Int) defined in kotlin.sequences.SubSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'sequence' @ [290:95] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'startIndex' @ [290:105] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'n' @ [290:118] ==> value-parameter n: Int defined in kotlin.sequences.SubSequence.drop[ValueParameterDescriptorImpl]

'endIndex' @ [290:121] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'if (n >= count) this else SubSequence(sequence, startIndex, startIndex + n)' @ [291:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<T>, elseBranch: Sequence<T>): Sequence<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<T>

'n' @ [291:50] ==> value-parameter n: Int defined in kotlin.sequences.SubSequence.take[ValueParameterDescriptorImpl]

'count' @ [291:55] ==> private final val count: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'this' @ [291:62] ==> <this> defined in kotlin.sequences.SubSequence[LazyClassReceiverParameterDescriptor]

'SubSequence' @ [291:72] ==> public constructor SubSequence<T>(sequence: Sequence<T>, startIndex: Int, endIndex: Int) defined in kotlin.sequences.SubSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'sequence' @ [291:84] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'startIndex' @ [291:94] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'startIndex' @ [291:106] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'n' @ [291:119] ==> value-parameter n: Int defined in kotlin.sequences.SubSequence.take[ValueParameterDescriptorImpl]

'sequence' @ [295:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'iterator' @ [295:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'position' @ [300:19] ==> public final var position: Int defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'startIndex' @ [300:30] ==> private final val startIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'iterator' @ [300:44] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [300:53] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [301:17] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [301:26] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'position' @ [302:17] ==> public final var position: Int defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'drop' @ [307:13] ==> private final fun drop(): Unit defined in kotlin.sequences.SubSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'position' @ [308:21] ==> public final var position: Int defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'endIndex' @ [308:32] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'iterator' @ [308:45] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [308:54] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'drop' @ [312:13] ==> private final fun drop(): Unit defined in kotlin.sequences.SubSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'position' @ [313:17] ==> public final var position: Int defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'endIndex' @ [313:29] ==> private final val endIndex: Int defined in kotlin.sequences.SubSequence[PropertyDescriptorImpl]

'NoSuchElementException' @ [314:23] ==> public constructor NoSuchElementException() defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'position' @ [315:13] ==> public final var position: Int defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [316:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.SubSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [316:29] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'require' @ [331:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'count' @ [331:18] ==> private final val count: Int defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'count' @ [331:70] ==> private final val count: Int defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'if (n >= count) emptySequence() else SubSequence(sequence, n, count)' @ [334:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<T>, elseBranch: Sequence<T>): Sequence<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<T>

'n' @ [334:50] ==> value-parameter n: Int defined in kotlin.sequences.TakeSequence.drop[ValueParameterDescriptorImpl]

'count' @ [334:55] ==> private final val count: Int defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'emptySequence' @ [334:62] ==> public fun <T> emptySequence(): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'SubSequence' @ [334:83] ==> public constructor SubSequence<T>(sequence: Sequence<T>, startIndex: Int, endIndex: Int) defined in kotlin.sequences.SubSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'sequence' @ [334:95] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'n' @ [334:105] ==> value-parameter n: Int defined in kotlin.sequences.TakeSequence.drop[ValueParameterDescriptorImpl]

'count' @ [334:108] ==> private final val count: Int defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'if (n >= count) this else TakeSequence(sequence, n)' @ [335:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<T>, elseBranch: Sequence<T>): Sequence<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<T>

'n' @ [335:50] ==> value-parameter n: Int defined in kotlin.sequences.TakeSequence.take[ValueParameterDescriptorImpl]

'count' @ [335:55] ==> private final val count: Int defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'this' @ [335:62] ==> <this> defined in kotlin.sequences.TakeSequence[LazyClassReceiverParameterDescriptor]

'TakeSequence' @ [335:72] ==> public constructor TakeSequence<T>(sequence: Sequence<T>, count: Int) defined in kotlin.sequences.TakeSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'sequence' @ [335:85] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'n' @ [335:95] ==> value-parameter n: Int defined in kotlin.sequences.TakeSequence.take[ValueParameterDescriptorImpl]

'count' @ [338:20] ==> private final val count: Int defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'sequence' @ [339:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.TakeSequence[PropertyDescriptorImpl]

'iterator' @ [339:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'left' @ [342:17] ==> public final var left: Int defined in kotlin.sequences.TakeSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [343:23] ==> public constructor NoSuchElementException() defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'left' @ [344:13] ==> public final var left: Int defined in kotlin.sequences.TakeSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [345:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TakeSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [345:29] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'left' @ [349:20] ==> public final var left: Int defined in kotlin.sequences.TakeSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [349:32] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TakeSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [349:41] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'sequence' @ [363:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.TakeWhileSequence[PropertyDescriptorImpl]

'iterator' @ [363:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'-' @ [364:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'iterator' @ [368:17] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [368:26] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [369:28] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [369:37] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'invoke' @ [370:21] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'item' @ [370:31] ==> val item: T defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'nextState' @ [371:21] ==> public final var nextState: Int defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextItem' @ [372:21] ==> public final var nextItem: T? defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'item' @ [372:32] ==> val item: T defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'nextState' @ [376:13] ==> public final var nextState: Int defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [380:17] ==> public final var nextState: Int defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [380:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calcNext' @ [381:17] ==> private final fun calcNext(): Unit defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [382:17] ==> public final var nextState: Int defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [383:23] ==> public constructor NoSuchElementException() defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'Suppress' @ [384:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'nextItem' @ [385:26] ==> public final var nextItem: T? defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextItem' @ [388:13] ==> public final var nextItem: T? defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [389:13] ==> public final var nextState: Int defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [389:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [390:20] ==> val result: T defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>.next[LocalVariableDescriptor]

'nextState' @ [394:17] ==> public final var nextState: Int defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [394:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calcNext' @ [395:17] ==> private final fun calcNext(): Unit defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [396:20] ==> public final var nextState: Int defined in kotlin.sequences.TakeWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'require' @ [410:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'count' @ [410:18] ==> private final val count: Int defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'count' @ [410:70] ==> private final val count: Int defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'DropSequence' @ [413:46] ==> public constructor DropSequence<T>(sequence: Sequence<T>, count: Int) defined in kotlin.sequences.DropSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'sequence' @ [413:59] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'count' @ [413:69] ==> private final val count: Int defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'n' @ [413:77] ==> value-parameter n: Int defined in kotlin.sequences.DropSequence.drop[ValueParameterDescriptorImpl]

'SubSequence' @ [414:46] ==> public constructor SubSequence<T>(sequence: Sequence<T>, startIndex: Int, endIndex: Int) defined in kotlin.sequences.SubSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'sequence' @ [414:58] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'count' @ [414:68] ==> private final val count: Int defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'count' @ [414:75] ==> private final val count: Int defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'n' @ [414:83] ==> value-parameter n: Int defined in kotlin.sequences.DropSequence.take[ValueParameterDescriptorImpl]

'sequence' @ [417:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'iterator' @ [417:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'count' @ [418:20] ==> private final val count: Int defined in kotlin.sequences.DropSequence[PropertyDescriptorImpl]

'left' @ [422:20] ==> public final var left: Int defined in kotlin.sequences.DropSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [422:32] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [422:41] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [423:17] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [423:26] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'left' @ [424:17] ==> public final var left: Int defined in kotlin.sequences.DropSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'drop' @ [429:13] ==> private final fun drop(): Unit defined in kotlin.sequences.DropSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'iterator' @ [430:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [430:29] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'drop' @ [434:13] ==> private final fun drop(): Unit defined in kotlin.sequences.DropSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'iterator' @ [435:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [435:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'sequence' @ [450:24] ==> private final val sequence: Sequence<T> defined in kotlin.sequences.DropWhileSequence[PropertyDescriptorImpl]

'iterator' @ [450:33] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'-' @ [451:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'iterator' @ [455:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [455:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [456:28] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [456:37] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'!' @ [457:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [457:22] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'item' @ [457:32] ==> val item: T defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>.drop[LocalVariableDescriptor]

'nextItem' @ [458:21] ==> public final var nextItem: T? defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'item' @ [458:32] ==> val item: T defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>.drop[LocalVariableDescriptor]

'dropState' @ [459:21] ==> public final var dropState: Int defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'dropState' @ [463:13] ==> public final var dropState: Int defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'dropState' @ [467:17] ==> public final var dropState: Int defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [467:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'drop' @ [468:17] ==> private final fun drop(): Unit defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'dropState' @ [470:17] ==> public final var dropState: Int defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'Suppress' @ [471:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'nextItem' @ [472:30] ==> public final var nextItem: T? defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextItem' @ [473:17] ==> public final var nextItem: T? defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'dropState' @ [474:17] ==> public final var dropState: Int defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'result' @ [475:24] ==> val result: T defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>.next[LocalVariableDescriptor]

'iterator' @ [477:20] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [477:29] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'dropState' @ [481:17] ==> public final var dropState: Int defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [481:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'drop' @ [482:17] ==> private final fun drop(): Unit defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'dropState' @ [483:20] ==> public final var dropState: Int defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [483:38] ==> public final val iterator: Iterator<T> defined in kotlin.sequences.DropWhileSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [483:47] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'DistinctIterator' @ [489:44] ==> public constructor DistinctIterator<T, K>(source: Iterator<T>, keySelector: (T) -> K) defined in kotlin.sequences.DistinctIterator[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K

'source' @ [489:61] ==> private final val source: Sequence<T> defined in kotlin.sequences.DistinctSequence[PropertyDescriptorImpl]

'iterator' @ [489:68] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'keySelector' @ [489:80] ==> private final val keySelector: (T) -> K defined in kotlin.sequences.DistinctSequence[PropertyDescriptorImpl]

'AbstractIterator<T>' @ [492:110] ==> public constructor AbstractIterator<T>() defined in kotlin.collections.AbstractIterator[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'HashSet' @ [493:28] ==> public constructor HashSet<E>() defined in kotlin.collections.HashSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> K

'source' @ [496:16] ==> private final val source: Iterator<T> defined in kotlin.sequences.DistinctIterator[PropertyDescriptorImpl]

'hasNext' @ [496:23] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'source' @ [497:24] ==> private final val source: Iterator<T> defined in kotlin.sequences.DistinctIterator[PropertyDescriptorImpl]

'next' @ [497:31] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'invoke' @ [498:23] ==> public abstract operator fun invoke(p1: T): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'next' @ [498:35] ==> val next: T defined in kotlin.sequences.DistinctIterator.computeNext[LocalVariableDescriptor]

'observed' @ [500:17] ==> private final val observed: HashSet<K> defined in kotlin.sequences.DistinctIterator[PropertyDescriptorImpl]

'add' @ [500:26] ==> public open header fun add(element: K): Boolean defined in kotlin.collections.HashSet[SimpleFunctionDescriptorImpl]

'key' @ [500:30] ==> val key: K defined in kotlin.sequences.DistinctIterator.computeNext[LocalVariableDescriptor]

'setNext' @ [501:17] ==> protected final fun setNext(value: T): Unit defined in kotlin.sequences.DistinctIterator[SimpleFunctionDescriptorImpl]

'next' @ [501:25] ==> val next: T defined in kotlin.sequences.DistinctIterator.computeNext[LocalVariableDescriptor]

'done' @ [506:9] ==> protected final fun done(): Unit defined in kotlin.sequences.DistinctIterator[SimpleFunctionDescriptorImpl]

'-' @ [514:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'nextItem' @ [517:13] ==> public final var nextItem: T? defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (nextState == -2) getInitialValue() else getNextValue(nextItem!!)' @ [517:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'nextState' @ [517:28] ==> public final var nextState: Int defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [517:41] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invoke' @ [517:45] ==> public abstract operator fun invoke(): T? defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [517:68] ==> public abstract operator fun invoke(p1: T): T? defined in kotlin.Function1[FunctionInvokeDescriptor]

'nextItem' @ [517:81] ==> public final var nextItem: T? defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [518:13] ==> public final var nextState: Int defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (nextItem == null) 0 else 1' @ [518:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'nextItem' @ [518:29] ==> public final var nextItem: T? defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [522:17] ==> public final var nextState: Int defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'calcNext' @ [523:17] ==> private final fun calcNext(): Unit defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [525:17] ==> public final var nextState: Int defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [526:23] ==> public constructor NoSuchElementException() defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'nextItem' @ [527:26] ==> public final var nextItem: T? defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [529:13] ==> public final var nextState: Int defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [529:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [530:20] ==> val result: T defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>.next[LocalVariableDescriptor]

'nextState' @ [534:17] ==> public final var nextState: Int defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'calcNext' @ [535:17] ==> private final fun calcNext(): Unit defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [536:20] ==> public final var nextState: Int defined in kotlin.sequences.GeneratorSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (this is ConstrainedOnceSequence<T>) this else ConstrainedOnceSequence(this)' @ [552:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<T>, elseBranch: Sequence<T>): Sequence<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<T>

'this' @ [552:16] ==> <this> defined in kotlin.sequences.constrainOnce[ReceiverParameterDescriptorImpl]

'this' @ [552:52] ==> <this> defined in kotlin.sequences.constrainOnce[ReceiverParameterDescriptorImpl]

'ConstrainedOnceSequence' @ [552:62] ==> public constructor ConstrainedOnceSequence<T>(sequence: Sequence<T>) defined in kotlin.sequences.ConstrainedOnceSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [552:86] ==> <this> defined in kotlin.sequences.constrainOnce[ReceiverParameterDescriptorImpl]

'GeneratorSequence' @ [578:12] ==> public constructor GeneratorSequence<T : Any>(getInitialValue: () -> T?, getNextValue: (T) -> T?) defined in kotlin.sequences.GeneratorSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'nextFunction' @ [578:30] ==> value-parameter nextFunction: () -> T? defined in kotlin.sequences.generateSequence[ValueParameterDescriptorImpl]

'invoke' @ [578:46] ==> public abstract operator fun invoke(): T? defined in kotlin.Function0[FunctionInvokeDescriptor]

'constrainOnce' @ [578:64] ==> public fun <T> Sequence<T>.constrainOnce(): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'kotlin.internal.LowPriorityInOverloadResolution' @ [594:1] ==> public constructor LowPriorityInOverloadResolution() defined in kotlin.internal.LowPriorityInOverloadResolution[ClassConstructorDescriptorImpl]

'if (seed == null)
        EmptySequence
    else
        GeneratorSequence({ seed }, nextFunction)' @ [596:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<T>, elseBranch: Sequence<T>): Sequence<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<T>

'seed' @ [596:9] ==> value-parameter seed: T? defined in kotlin.sequences.generateSequence[ValueParameterDescriptorImpl]

'EmptySequence' @ [597:9] ==> private object EmptySequence : Sequence<Nothing>, DropTakeSequence<Nothing> defined in kotlin.sequences in file Sequences.kt[FakeCallableDescriptorForObject]

'GeneratorSequence' @ [599:9] ==> public constructor GeneratorSequence<T : Any>(getInitialValue: () -> T?, getNextValue: (T) -> T?) defined in kotlin.sequences.GeneratorSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'seed' @ [599:29] ==> value-parameter seed: T? defined in kotlin.sequences.generateSequence[ValueParameterDescriptorImpl]

'nextFunction' @ [599:37] ==> value-parameter nextFunction: (T) -> T? defined in kotlin.sequences.generateSequence[ValueParameterDescriptorImpl]

'GeneratorSequence' @ [615:9] ==> public constructor GeneratorSequence<T : Any>(getInitialValue: () -> T?, getNextValue: (T) -> T?) defined in kotlin.sequences.GeneratorSequence[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'seedFunction' @ [615:27] ==> value-parameter seedFunction: () -> T? defined in kotlin.sequences.generateSequence[ValueParameterDescriptorImpl]

'nextFunction' @ [615:41] ==> value-parameter nextFunction: (T) -> T? defined in kotlin.sequences.generateSequence[ValueParameterDescriptorImpl]

