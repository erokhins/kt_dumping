'this' @ [24:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[ReceiverParameterDescriptorImpl]

'element' @ [24:31] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[LocalVariableDescriptor]

'element' @ [24:52] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[LocalVariableDescriptor]

'this' @ [29:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[ReceiverParameterDescriptorImpl]

'element' @ [29:31] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[LocalVariableDescriptor]

'element' @ [29:52] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[LocalVariableDescriptor]

'this' @ [34:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[ReceiverParameterDescriptorImpl]

'element' @ [34:31] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[LocalVariableDescriptor]

'element' @ [34:52] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull[LocalVariableDescriptor]

'this' @ [39:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[ReceiverParameterDescriptorImpl]

'element' @ [39:31] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[LocalVariableDescriptor]

'element' @ [39:52] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[LocalVariableDescriptor]

'NoSuchElementException' @ [40:11] ==> public constructor NoSuchElementException(p0: (String..String?)) defined in java.util.NoSuchElementException[JavaClassConstructorDescriptor]

'this' @ [44:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[ReceiverParameterDescriptorImpl]

'element' @ [44:31] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[LocalVariableDescriptor]

'element' @ [44:52] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[LocalVariableDescriptor]

'NoSuchElementException' @ [45:11] ==> public constructor NoSuchElementException(p0: (String..String?)) defined in java.util.NoSuchElementException[JavaClassConstructorDescriptor]

'this' @ [49:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[ReceiverParameterDescriptorImpl]

'element' @ [49:31] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[LocalVariableDescriptor]

'element' @ [49:52] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance[LocalVariableDescriptor]

'NoSuchElementException' @ [50:11] ==> public constructor NoSuchElementException(p0: (String..String?)) defined in java.util.NoSuchElementException[JavaClassConstructorDescriptor]

'when (this) {
        is List<*> -> {
            for (i in this.indices.reversed()) {
                val element = this[i]
                if (element is T) return element
            }
            return null
        }

        else -> {
            return reversed().firstIsInstanceOrNull<T>()
        }
    }' @ [54:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'this' @ [54:11] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.lastIsInstanceOrNull[ReceiverParameterDescriptorImpl]

'this' @ [56:23] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.lastIsInstanceOrNull[ReceiverParameterDescriptorImpl]

'indices' @ [56:28] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'reversed' @ [56:36] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'this' @ [57:31] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.lastIsInstanceOrNull[ReceiverParameterDescriptorImpl]

'i' @ [57:36] ==> val i: Int defined in org.jetbrains.kotlin.utils.addToStdlib.lastIsInstanceOrNull[LocalVariableDescriptor]

'element' @ [58:21] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.lastIsInstanceOrNull[LocalVariableDescriptor]

'element' @ [58:42] ==> val element: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.lastIsInstanceOrNull[LocalVariableDescriptor]

'reversed' @ [64:20] ==> public fun <T> Iterable<Any?>.reversed(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'firstIsInstanceOrNull' @ [64:31] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): T? defined in org.jetbrains.kotlin.utils.addToStdlib[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> T

'elements' @ [69:71] ==> value-parameter vararg elements: () -> T defined in org.jetbrains.kotlin.utils.addToStdlib.sequenceOfLazyValues[ValueParameterDescriptorImpl]

'asSequence' @ [69:80] ==> public fun <T> Array<out () -> T>.asSequence(): Sequence<() -> T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<T>

'map' @ [69:93] ==> public fun <T, R> Sequence<() -> T>.map(transform: (() -> T) -> T): Sequence<T> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<T>
    <R> -> T

'invoke' @ [69:99] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'Pair' @ [71:50] ==> public constructor Pair<out A, out B>(first: T2, second: T1) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> T2
    <out B> -> T1

'second' @ [71:55] ==> public final val second: T2 defined in kotlin.Pair[DeserializedPropertyDescriptor]

'first' @ [71:63] ==> public final val first: T1 defined in kotlin.Pair[DeserializedPropertyDescriptor]

'this' @ [73:50] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.safeAs[ReceiverParameterDescriptorImpl]

'this' @ [74:47] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.cast[ReceiverParameterDescriptorImpl]

'this' @ [75:76] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.assertedCast[ReceiverParameterDescriptorImpl]

'AssertionError' @ [75:96] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'invoke' @ [75:111] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'constantMap' @ [78:18] ==> private val constantMap: ConcurrentHashMap<Function0<*>, Any> defined in org.jetbrains.kotlin.utils.addToStdlib in file addToStdlib.kt[PropertyDescriptorImpl]

'calculator' @ [78:30] ==> value-parameter calculator: () -> T defined in org.jetbrains.kotlin.utils.addToStdlib.constant[ValueParameterDescriptorImpl]

'Suppress' @ [79:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'cached' @ [80:9] ==> val cached: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.constant[LocalVariableDescriptor]

'cached' @ [80:32] ==> val cached: Any? defined in org.jetbrains.kotlin.utils.addToStdlib.constant[LocalVariableDescriptor]

'calculator' @ [83:18] ==> value-parameter calculator: () -> T defined in org.jetbrains.kotlin.utils.addToStdlib.constant[ValueParameterDescriptorImpl]

'java' @ [83:36] ==> public val <T> KClass<out () -> T>.java: Class<out () -> T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Function0<T>)

'declaredFields' @ [83:41] ==> public final val <T : (Any..Any?)> Class<out () -> T>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Function0<T>)

'filter' @ [83:56] ==> public inline fun <T> Array<out (Field..Field?)>.filter(predicate: ((Field..Field?)) -> Boolean): List<(Field..Field?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'it' @ [83:65] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.utils.addToStdlib.constant.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [83:68] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'and' @ [83:78] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'STATIC' @ [83:91] ==> public const final val STATIC: Int defined in java.lang.reflect.Modifier[JavaPropertyDescriptor]

'assert' @ [84:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'fields' @ [84:12] ==> val fields: List<(Field..Field?)> defined in org.jetbrains.kotlin.utils.addToStdlib.constant[LocalVariableDescriptor]

'isEmpty' @ [84:19] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'fields' @ [85:56] ==> val fields: List<(Field..Field?)> defined in org.jetbrains.kotlin.utils.addToStdlib.constant[LocalVariableDescriptor]

'joinToString' @ [85:63] ==> public fun <T> Iterable<(Field..Field?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((Field..Field?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'invoke' @ [88:17] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'constantMap' @ [89:5] ==> private val constantMap: ConcurrentHashMap<Function0<*>, Any> defined in org.jetbrains.kotlin.utils.addToStdlib in file addToStdlib.kt[PropertyDescriptorImpl]

'calculator' @ [89:17] ==> value-parameter calculator: () -> T defined in org.jetbrains.kotlin.utils.addToStdlib.constant[ValueParameterDescriptorImpl]

'value' @ [89:31] ==> val value: T defined in org.jetbrains.kotlin.utils.addToStdlib.constant[LocalVariableDescriptor]

'value' @ [90:12] ==> val value: T defined in org.jetbrains.kotlin.utils.addToStdlib.constant[LocalVariableDescriptor]

'ConcurrentHashMap' @ [93:27] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Function0<*>
    <V : (Any..Any?)> -> Any

'indexOf' @ [96:9] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'char' @ [96:17] ==> value-parameter char: Char defined in org.jetbrains.kotlin.utils.addToStdlib.indexOfOrNull[ValueParameterDescriptorImpl]

'startIndex' @ [96:23] ==> value-parameter startIndex: Int = ... defined in org.jetbrains.kotlin.utils.addToStdlib.indexOfOrNull[ValueParameterDescriptorImpl]

'ignoreCase' @ [96:35] ==> value-parameter ignoreCase: Boolean = ... defined in org.jetbrains.kotlin.utils.addToStdlib.indexOfOrNull[ValueParameterDescriptorImpl]

'takeIf' @ [96:47] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [96:56] ==> value-parameter it: Int defined in org.jetbrains.kotlin.utils.addToStdlib.indexOfOrNull.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [99:9] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'char' @ [99:21] ==> value-parameter char: Char defined in org.jetbrains.kotlin.utils.addToStdlib.lastIndexOfOrNull[ValueParameterDescriptorImpl]

'startIndex' @ [99:27] ==> value-parameter startIndex: Int = ... defined in org.jetbrains.kotlin.utils.addToStdlib.lastIndexOfOrNull[ValueParameterDescriptorImpl]

'ignoreCase' @ [99:39] ==> value-parameter ignoreCase: Boolean = ... defined in org.jetbrains.kotlin.utils.addToStdlib.lastIndexOfOrNull[ValueParameterDescriptorImpl]

'takeIf' @ [99:51] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [99:60] ==> value-parameter it: Int defined in org.jetbrains.kotlin.utils.addToStdlib.lastIndexOfOrNull.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [102:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[ReceiverParameterDescriptorImpl]

'invoke' @ [103:22] ==> public abstract operator fun invoke(p1: T): R? defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [103:32] ==> val element: T defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[LocalVariableDescriptor]

'result' @ [104:13] ==> val result: R? defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[LocalVariableDescriptor]

'result' @ [104:36] ==> val result: R? defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[LocalVariableDescriptor]

'this' @ [110:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[ReceiverParameterDescriptorImpl]

'invoke' @ [111:22] ==> public abstract operator fun invoke(p1: T): R? defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [111:32] ==> val element: T defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[LocalVariableDescriptor]

'result' @ [112:13] ==> val result: R? defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[LocalVariableDescriptor]

'result' @ [112:36] ==> val result: R? defined in org.jetbrains.kotlin.utils.addToStdlib.firstNotNullResult[LocalVariableDescriptor]

'this' @ [119:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.sumByLong[ReceiverParameterDescriptorImpl]

'sum' @ [120:9] ==> var sum: Long defined in org.jetbrains.kotlin.utils.addToStdlib.sumByLong[LocalVariableDescriptor]

'invoke' @ [120:16] ==> public abstract operator fun invoke(p1: T): Long defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [120:25] ==> val element: T defined in org.jetbrains.kotlin.utils.addToStdlib.sumByLong[LocalVariableDescriptor]

'sum' @ [122:12] ==> var sum: Long defined in org.jetbrains.kotlin.utils.addToStdlib.sumByLong[LocalVariableDescriptor]

'if (isNotEmpty()) this.body() else null' @ [125:75] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: O?, elseBranch: O?): O?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> O?

'isNotEmpty' @ [125:79] ==> @InlineOnly public inline fun <T> Collection<T>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [125:93] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.ifNotEmpty[ReceiverParameterDescriptorImpl]

'invoke' @ [125:98] ==> public abstract operator fun C.invoke(): O? defined in kotlin.Function1[FunctionInvokeDescriptor]

'if (isNotEmpty()) this.body() else null' @ [127:78] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: O?, elseBranch: O?): O?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> O?

'isNotEmpty' @ [127:82] ==> @InlineOnly public inline fun <T> Array<out T>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [127:96] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.ifNotEmpty[ReceiverParameterDescriptorImpl]

'invoke' @ [127:101] ==> public abstract operator fun Array<out T>.invoke(): O? defined in kotlin.Function1[FunctionInvokeDescriptor]

'currentTimeMillis' @ [130:24] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'invoke' @ [131:18] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'Pair' @ [132:12] ==> public constructor Pair<out A, out B>(first: Long, second: T) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Long
    <out B> -> T

'-' @ [132:17] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'currentTimeMillis' @ [132:24] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'start' @ [132:46] ==> val start: Long defined in org.jetbrains.kotlin.utils.addToStdlib.measureTimeMillisWithResult[LocalVariableDescriptor]

'result' @ [132:53] ==> val result: T defined in org.jetbrains.kotlin.utils.addToStdlib.measureTimeMillisWithResult[LocalVariableDescriptor]

'this' @ [136:21] ==> <this> defined in org.jetbrains.kotlin.utils.addToStdlib.flattenTo[ReceiverParameterDescriptorImpl]

'c' @ [137:9] ==> value-parameter c: C defined in org.jetbrains.kotlin.utils.addToStdlib.flattenTo[ValueParameterDescriptorImpl]

'addAll' @ [137:11] ==> public fun <T> MutableCollection<in T>.addAll(elements: Iterable<T>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'element' @ [137:18] ==> val element: Iterable<T> defined in org.jetbrains.kotlin.utils.addToStdlib.flattenTo[LocalVariableDescriptor]

'c' @ [139:12] ==> value-parameter c: C defined in org.jetbrains.kotlin.utils.addToStdlib.flattenTo[ValueParameterDescriptorImpl]

