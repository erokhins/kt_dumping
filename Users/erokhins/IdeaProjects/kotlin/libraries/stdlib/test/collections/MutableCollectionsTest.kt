'invoke' @ [10:28] ==> public abstract operator fun invoke(p1: List<T>): C defined in kotlin.Function1[FunctionInvokeDescriptor]

'before' @ [10:48] ==> value-parameter before: List<T> defined in test.collections.MutableCollectionTest.testOperation[ValueParameterDescriptorImpl]

'assertEquals' @ [11:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'expectedModified' @ [11:30] ==> value-parameter expectedModified: Boolean defined in test.collections.MutableCollectionTest.testOperation[ValueParameterDescriptorImpl]

'list' @ [11:48] ==> val list: C defined in test.collections.MutableCollectionTest.testOperation.<no name provided>[LocalVariableDescriptor]

'invoke' @ [11:53] ==> public abstract operator fun C.invoke(): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertEquals' @ [12:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: C, actual: C, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> C

'invoke' @ [12:30] ==> public abstract operator fun invoke(p1: List<T>): C defined in kotlin.Function1[FunctionInvokeDescriptor]

'after' @ [12:50] ==> value-parameter after: List<T> defined in test.collections.MutableCollectionTest.testOperation[ValueParameterDescriptorImpl]

'list' @ [12:58] ==> val list: C defined in test.collections.MutableCollectionTest.testOperation.<no name provided>[LocalVariableDescriptor]

'testOperation' @ [16:15] ==> public final fun <T, C : MutableCollection<T>> testOperation(before: List<T>, after: List<T>, expectedModified: Boolean, toMutableCollection: (List<T>) -> MutableList<T>): (MutableList<T>.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <C : MutableCollection<T>> -> MutableList<T>

'before' @ [16:29] ==> value-parameter before: List<T> defined in test.collections.MutableCollectionTest.testOperation[ValueParameterDescriptorImpl]

'after' @ [16:37] ==> value-parameter after: List<T> defined in test.collections.MutableCollectionTest.testOperation[ValueParameterDescriptorImpl]

'expectedModified' @ [16:44] ==> value-parameter expectedModified: Boolean defined in test.collections.MutableCollectionTest.testOperation[ValueParameterDescriptorImpl]

'it' @ [16:64] ==> value-parameter it: List<T> defined in test.collections.MutableCollectionTest.testOperation.<anonymous>[ValueParameterDescriptorImpl]

'toMutableList' @ [16:67] ==> public fun <T> Collection<T>.toMutableList(): MutableList<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'Test' @ [19:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [20:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'testOperation' @ [22:9] ==> public final fun <T> testOperation(before: List<String>, after: List<String>, expectedModified: Boolean): (MutableList<String>.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'emptyList' @ [22:23] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [22:36] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'let' @ [22:48] ==> @InlineOnly public inline fun <T, R> ((MutableList<String>.() -> Boolean) -> Unit).let(block: ((MutableList<String>.() -> Boolean) -> Unit) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<[@kotlin.ExtensionFunctionType] Function1<MutableList<String>, Boolean>, Unit>
    <R> -> Unit

'invoke' @ [23:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [23:25] ==> public abstract fun addAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'data' @ [23:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'invoke' @ [24:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [24:25] ==> public fun <T> MutableCollection<in String>.addAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [24:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'toTypedArray' @ [24:37] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'invoke' @ [25:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [25:25] ==> public fun <T> MutableCollection<in String>.addAll(elements: Iterable<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [25:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'toTypedArray' @ [25:37] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'asIterable' @ [25:52] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [26:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [26:25] ==> public fun <T> MutableCollection<in String>.addAll(elements: Sequence<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [26:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'asSequence' @ [26:37] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'testOperation' @ [29:9] ==> public final fun <T, C : MutableCollection<String>> testOperation(before: List<String>, after: List<String>, expectedModified: Boolean, toMutableCollection: (List<String>) -> LinkedHashSet<String> /* = LinkedHashSet<String> */): (LinkedHashSet<String> /* = LinkedHashSet<String> */.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <C : MutableCollection<T>> -> LinkedHashSet<String>

'data' @ [29:23] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'data' @ [29:29] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'it' @ [29:44] ==> value-parameter it: List<String> defined in test.collections.MutableCollectionTest.addAll.<anonymous>[ValueParameterDescriptorImpl]

'toCollection' @ [29:47] ==> public fun <T, C : MutableCollection<in String>> Iterable<String>.toCollection(destination: LinkedHashSet<String> /* = LinkedHashSet<String> */): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : MutableCollection<in T>> -> LinkedHashSet<String>

'LinkedHashSet' @ [29:60] ==> public final fun <E> <init>(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'let' @ [29:80] ==> @InlineOnly public inline fun <T, R> ((LinkedHashSet<String> /* = LinkedHashSet<String> */.() -> Boolean) -> Unit).let(block: ((LinkedHashSet<String> /* = LinkedHashSet<String> */.() -> Boolean) -> Unit) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<[@kotlin.ExtensionFunctionType] Function1<LinkedHashSet<String>, Boolean>, Unit>
    <R> -> Unit

'invoke' @ [30:13] ==> public abstract operator fun invoke(p1: LinkedHashSet<String> /* = LinkedHashSet<String> */.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [30:25] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'data' @ [30:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'invoke' @ [31:13] ==> public abstract operator fun invoke(p1: LinkedHashSet<String> /* = LinkedHashSet<String> */.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [31:25] ==> public fun <T> MutableCollection<in String>.addAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [31:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'toTypedArray' @ [31:37] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'invoke' @ [32:13] ==> public abstract operator fun invoke(p1: LinkedHashSet<String> /* = LinkedHashSet<String> */.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [32:25] ==> public fun <T> MutableCollection<in String>.addAll(elements: Iterable<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [32:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'toTypedArray' @ [32:37] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'asIterable' @ [32:52] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [33:13] ==> public abstract operator fun invoke(p1: LinkedHashSet<String> /* = LinkedHashSet<String> */.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'addAll' @ [33:25] ==> public fun <T> MutableCollection<in String>.addAll(elements: Sequence<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [33:32] ==> val data: List<String> defined in test.collections.MutableCollectionTest.addAll[LocalVariableDescriptor]

'asSequence' @ [33:37] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [37:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [38:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [39:20] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [40:24] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'testOperation' @ [42:9] ==> public final fun <T> testOperation(before: List<String>, after: List<String>, expectedModified: Boolean): (MutableList<String>.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'content' @ [42:23] ==> val content: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'expected' @ [42:32] ==> val expected: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'let' @ [42:48] ==> @InlineOnly public inline fun <T, R> ((MutableList<String>.() -> Boolean) -> Unit).let(block: ((MutableList<String>.() -> Boolean) -> Unit) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<[@kotlin.ExtensionFunctionType] Function1<MutableList<String>, Boolean>, Unit>
    <R> -> Unit

'invoke' @ [43:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [43:28] ==> public abstract fun removeAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'data' @ [43:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'invoke' @ [44:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [44:28] ==> public fun <T> MutableCollection<in String>.removeAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [44:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'toTypedArray' @ [44:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'invoke' @ [45:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [45:28] ==> public fun <T> MutableCollection<in String>.removeAll(elements: Iterable<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [45:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'toTypedArray' @ [45:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'asIterable' @ [45:58] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [46:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [46:28] ==> public fun <T> MutableList<String>.removeAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [46:40] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.removeAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [46:46] ==> val data: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'invoke' @ [47:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [47:29] ==> <this> defined in test.collections.MutableCollectionTest.removeAll.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'removeAll' @ [47:62] ==> public fun <T> MutableIterable<String>.removeAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [47:74] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.removeAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [47:80] ==> val data: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'cs' @ [48:51] ==> value-parameter cs: CharSequence defined in test.collections.MutableCollectionTest.removeAll.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [48:54] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [49:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [49:28] ==> public fun <T> MutableList<String>.removeAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'predicate' @ [49:38] ==> val predicate: (CharSequence) -> Boolean defined in test.collections.MutableCollectionTest.removeAll.<anonymous>[LocalVariableDescriptor]

'testOperation' @ [53:9] ==> public final fun <T> testOperation(before: List<String>, after: List<String>, expectedModified: Boolean): (MutableList<String>.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'content' @ [53:23] ==> val content: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'content' @ [53:32] ==> val content: List<String> defined in test.collections.MutableCollectionTest.removeAll[LocalVariableDescriptor]

'let' @ [53:48] ==> @InlineOnly public inline fun <T, R> ((MutableList<String>.() -> Boolean) -> Unit).let(block: ((MutableList<String>.() -> Boolean) -> Unit) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<[@kotlin.ExtensionFunctionType] Function1<MutableList<String>, Boolean>, Unit>
    <R> -> Unit

'invoke' @ [54:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [54:28] ==> public abstract fun removeAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [54:38] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [55:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [55:28] ==> public fun <T> MutableCollection<in String>.removeAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptyArray' @ [55:38] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'invoke' @ [56:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [56:28] ==> public fun <T> MutableCollection<in String>.removeAll(elements: Sequence<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptySequence' @ [56:38] ==> public fun <T> emptySequence(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [57:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'removeAll' @ [57:28] ==> public fun <T> MutableList<String>.removeAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [58:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [58:29] ==> <this> defined in test.collections.MutableCollectionTest.removeAll.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'removeAll' @ [58:62] ==> public fun <T> MutableIterable<String>.removeAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [62:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [63:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [64:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'testOperation' @ [66:9] ==> public final fun <T> testOperation(before: List<String>, after: List<String>, expectedModified: Boolean): (MutableList<String>.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'content' @ [66:23] ==> val content: List<String> defined in test.collections.MutableCollectionTest.retainAll[LocalVariableDescriptor]

'expected' @ [66:32] ==> val expected: List<String> defined in test.collections.MutableCollectionTest.retainAll[LocalVariableDescriptor]

'let' @ [66:48] ==> @InlineOnly public inline fun <T, R> ((MutableList<String>.() -> Boolean) -> Unit).let(block: ((MutableList<String>.() -> Boolean) -> Unit) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<[@kotlin.ExtensionFunctionType] Function1<MutableList<String>, Boolean>, Unit>
    <R> -> Unit

'listOf' @ [67:24] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [68:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [68:28] ==> public abstract fun retainAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'data' @ [68:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'invoke' @ [69:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [69:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [69:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [69:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'invoke' @ [70:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [70:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Iterable<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [70:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [70:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'asIterable' @ [70:58] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [71:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [71:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Sequence<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [71:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [71:43] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [72:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [72:28] ==> public fun <T> MutableList<String>.retainAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [72:40] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [72:46] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'invoke' @ [73:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [73:29] ==> <this> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'retainAll' @ [73:62] ==> public fun <T> MutableIterable<String>.retainAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [73:74] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [73:80] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'cs' @ [75:51] ==> value-parameter cs: CharSequence defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [75:54] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [76:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [76:28] ==> public fun <T> MutableList<String>.retainAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'predicate' @ [76:38] ==> val predicate: (CharSequence) -> Boolean defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'testOperation' @ [78:9] ==> public final fun <T> testOperation(before: List<String>, after: List<String>, expectedModified: Boolean): (MutableList<String>.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'content' @ [78:23] ==> val content: List<String> defined in test.collections.MutableCollectionTest.retainAll[LocalVariableDescriptor]

'emptyList' @ [78:32] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [78:51] ==> @InlineOnly public inline fun <T, R> ((MutableList<String>.() -> Boolean) -> Unit).let(block: ((MutableList<String>.() -> Boolean) -> Unit) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<[@kotlin.ExtensionFunctionType] Function1<MutableList<String>, Boolean>, Unit>
    <R> -> Unit

'emptyList' @ [79:24] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [80:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [80:28] ==> public abstract fun retainAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'data' @ [80:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'invoke' @ [81:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [81:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [81:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [81:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'invoke' @ [82:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [82:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Iterable<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [82:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [82:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'asIterable' @ [82:58] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [83:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [83:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Sequence<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [83:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [83:43] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [84:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [84:28] ==> public fun <T> MutableList<String>.retainAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [84:40] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [84:46] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'invoke' @ [85:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [85:29] ==> <this> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'retainAll' @ [85:62] ==> public fun <T> MutableIterable<String>.retainAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [85:74] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [85:80] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'testOperation' @ [87:9] ==> public final fun <T> testOperation(before: List<String>, after: List<String>, expectedModified: Boolean): (MutableList<String>.() -> Boolean) -> Unit defined in test.collections.MutableCollectionTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'emptyList' @ [87:23] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptyList' @ [87:44] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [87:64] ==> @InlineOnly public inline fun <T, R> ((MutableList<String>.() -> Boolean) -> Unit).let(block: ((MutableList<String>.() -> Boolean) -> Unit) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<[@kotlin.ExtensionFunctionType] Function1<MutableList<String>, Boolean>, Unit>
    <R> -> Unit

'emptyList' @ [88:24] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [89:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [89:28] ==> public abstract fun retainAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'data' @ [89:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'invoke' @ [90:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [90:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [90:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [90:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'invoke' @ [91:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [91:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Iterable<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [91:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [91:43] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'asIterable' @ [91:58] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [92:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [92:28] ==> public fun <T> MutableCollection<in String>.retainAll(elements: Sequence<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [92:38] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [92:43] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [93:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'retainAll' @ [93:28] ==> public fun <T> MutableList<String>.retainAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [93:40] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [93:46] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

'invoke' @ [94:13] ==> public abstract operator fun invoke(p1: MutableList<String>.() -> Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [94:29] ==> <this> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'retainAll' @ [94:62] ==> public fun <T> MutableIterable<String>.retainAll(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [94:74] ==> value-parameter it: String defined in test.collections.MutableCollectionTest.retainAll.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [94:80] ==> val data: List<String> defined in test.collections.MutableCollectionTest.retainAll.<anonymous>[LocalVariableDescriptor]

