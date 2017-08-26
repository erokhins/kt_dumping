'Suppress' @ [17:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [24:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'Deprecated' @ [27:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'CollectionAssertionSession' @ [29:5] ==> public constructor CollectionAssertionSession<E, C : Iterable<E>>(collection: C) defined in kotlin.test.CollectionAssertionSession[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E
    <C : Iterable<E>> -> C

'collection' @ [29:32] ==> value-parameter collection: C defined in kotlin.test.assert[ValueParameterDescriptorImpl]

'invoke' @ [29:44] ==> public abstract operator fun CollectionAssertionSession<E, C>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'Deprecated' @ [32:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'assertEquals' @ [34:5] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <@OnlyInputTypes T> -> Int

'expectedSize' @ [34:18] ==> value-parameter expectedSize: Int defined in kotlin.test.sizeShouldBe[ValueParameterDescriptorImpl]

'collection' @ [34:32] ==> public final val collection: C defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'size' @ [34:43] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'message' @ [34:49] ==> value-parameter message: String? = ... defined in kotlin.test.sizeShouldBe[ValueParameterDescriptorImpl]

'expectedSize' @ [34:90] ==> value-parameter expectedSize: Int defined in kotlin.test.sizeShouldBe[ValueParameterDescriptorImpl]

'collection' @ [34:115] ==> public final val collection: C defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'size' @ [34:126] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'Deprecated' @ [37:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'assertEquals' @ [39:5] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Any?, actual: Any?, message: String? = ...): Unit defined in kotlin.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <@OnlyInputTypes T> -> Any?

'expected' @ [39:18] ==> value-parameter expected: T defined in kotlin.test.elementAtShouldBe[ValueParameterDescriptorImpl]

'collection' @ [39:28] ==> public final val collection: Iterable<*> defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'elementAt' @ [39:39] ==> public fun <T> Iterable<Any?>.elementAt(index: Int): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'position' @ [39:49] ==> value-parameter position: Int defined in kotlin.test.elementAtShouldBe[ValueParameterDescriptorImpl]

'message' @ [39:60] ==> value-parameter message: String? = ... defined in kotlin.test.elementAtShouldBe[ValueParameterDescriptorImpl]

'position' @ [39:84] ==> value-parameter position: Int defined in kotlin.test.elementAtShouldBe[ValueParameterDescriptorImpl]

'expected' @ [39:104] ==> value-parameter expected: T defined in kotlin.test.elementAtShouldBe[ValueParameterDescriptorImpl]

'Deprecated' @ [42:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'assertTrue' @ [44:5] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[SimpleFunctionDescriptorImpl]

'message' @ [44:16] ==> value-parameter message: String? = ... defined in kotlin.test.elementAtShouldComply[ValueParameterDescriptorImpl]

'invoke' @ [44:27] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'collection' @ [44:37] ==> public final val collection: C defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'elementAt' @ [44:48] ==> public fun <T> Iterable<T>.elementAt(index: Int): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'position' @ [44:58] ==> value-parameter position: Int defined in kotlin.test.elementAtShouldComply[ValueParameterDescriptorImpl]

'Deprecated' @ [47:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'assertEquals' @ [49:5] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Any?, actual: Any?, message: String? = ...): Unit defined in kotlin.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <@OnlyInputTypes T> -> Any?

'expected' @ [49:18] ==> value-parameter expected: T defined in kotlin.test.lastElementShouldBe[ValueParameterDescriptorImpl]

'collection' @ [49:28] ==> public final val collection: Iterable<*> defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'last' @ [49:39] ==> public fun <T> Iterable<Any?>.last(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'message' @ [49:47] ==> value-parameter message: String? = ... defined in kotlin.test.lastElementShouldBe[ValueParameterDescriptorImpl]

'expected' @ [49:87] ==> value-parameter expected: T defined in kotlin.test.lastElementShouldBe[ValueParameterDescriptorImpl]

'Deprecated' @ [52:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'elements' @ [54:15] ==> value-parameter vararg elements: T defined in kotlin.test.containsAll[ValueParameterDescriptorImpl]

'assertTrue' @ [55:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[SimpleFunctionDescriptorImpl]

'e' @ [55:40] ==> val e: T defined in kotlin.test.containsAll[LocalVariableDescriptor]

'e' @ [55:75] ==> val e: T defined in kotlin.test.containsAll[LocalVariableDescriptor]

'collection' @ [55:80] ==> public final val collection: Iterable<*> defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'Deprecated' @ [59:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'collection' @ [61:18] ==> public final val collection: C defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'iterator' @ [61:29] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'expectedElements' @ [62:20] ==> value-parameter expectedElements: Iterable<T> defined in kotlin.test.shouldBe[ValueParameterDescriptorImpl]

'iterator' @ [62:37] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'actual' @ [64:12] ==> val actual: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'hasNext' @ [64:19] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'expected' @ [64:32] ==> val expected: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'hasNext' @ [64:41] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [65:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: T, actual: T, message: String? = ...): Unit defined in kotlin.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <@OnlyInputTypes T> -> T

'expected' @ [65:22] ==> val expected: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'next' @ [65:31] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'actual' @ [65:39] ==> val actual: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'next' @ [65:46] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'message' @ [65:54] ==> value-parameter message: String? = ... defined in kotlin.test.shouldBe[ValueParameterDescriptorImpl]

'actual' @ [68:9] ==> val actual: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'hasNext' @ [68:16] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'fail' @ [69:9] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test in file Assertions.kt[SimpleFunctionDescriptorImpl]

'actual' @ [69:80] ==> val actual: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'remaining' @ [69:87] ==> private fun <T> Iterator<T>.remaining(): List<T> defined in kotlin.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'expected' @ [71:9] ==> val expected: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'hasNext' @ [71:18] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'fail' @ [72:9] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test in file Assertions.kt[SimpleFunctionDescriptorImpl]

'expected' @ [72:83] ==> val expected: Iterator<T> defined in kotlin.test.shouldBe[LocalVariableDescriptor]

'remaining' @ [72:92] ==> private fun <T> Iterator<T>.remaining(): List<T> defined in kotlin.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'Deprecated' @ [76:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'other' @ [78:15] ==> value-parameter other: Set<T> defined in kotlin.test.shouldBeSet[ValueParameterDescriptorImpl]

'e' @ [79:13] ==> val e: T defined in kotlin.test.shouldBeSet[LocalVariableDescriptor]

'collection' @ [79:19] ==> public final val collection: C defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'fail' @ [80:13] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test in file Assertions.kt[SimpleFunctionDescriptorImpl]

'message' @ [80:18] ==> value-parameter message: String? = ... defined in kotlin.test.shouldBeSet[ValueParameterDescriptorImpl]

'e' @ [80:39] ==> val e: T defined in kotlin.test.shouldBeSet[LocalVariableDescriptor]

'collection' @ [80:67] ==> public final val collection: C defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'collection' @ [83:15] ==> public final val collection: C defined in kotlin.test.CollectionAssertionSession[PropertyDescriptorImpl]

'e' @ [84:13] ==> val e: T defined in kotlin.test.shouldBeSet[LocalVariableDescriptor]

'other' @ [84:19] ==> value-parameter other: Set<T> defined in kotlin.test.shouldBeSet[ValueParameterDescriptorImpl]

'fail' @ [85:13] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test in file Assertions.kt[SimpleFunctionDescriptorImpl]

'message' @ [85:18] ==> value-parameter message: String? = ... defined in kotlin.test.shouldBeSet[ValueParameterDescriptorImpl]

'e' @ [85:39] ==> val e: T defined in kotlin.test.shouldBeSet[LocalVariableDescriptor]

'Deprecated' @ [90:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'HashSet' @ [92:20] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'other' @ [93:15] ==> value-parameter vararg other: T defined in kotlin.test.shouldBeSet[ValueParameterDescriptorImpl]

'otherSet' @ [94:9] ==> val otherSet: HashSet<T> defined in kotlin.test.shouldBeSet[LocalVariableDescriptor]

'add' @ [94:18] ==> public open fun add(element: T): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'e' @ [94:22] ==> val e: T defined in kotlin.test.shouldBeSet[LocalVariableDescriptor]

'shouldBeSet' @ [97:5] ==> @Deprecated public fun <T, C : Set<T>> CollectionAssertionSession<T, C>.shouldBeSet(other: Set<T>, message: String? = ...): Unit defined in kotlin.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <C : Set<T>> -> C

'otherSet' @ [97:17] ==> val otherSet: HashSet<T> defined in kotlin.test.shouldBeSet[LocalVariableDescriptor]

'ArrayList' @ [101:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'hasNext' @ [102:12] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'result' @ [103:9] ==> val result: ArrayList<T> defined in kotlin.test.remaining[LocalVariableDescriptor]

'add' @ [103:16] ==> public open fun add(element: T): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'next' @ [103:20] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'result' @ [105:12] ==> val result: ArrayList<T> defined in kotlin.test.remaining[LocalVariableDescriptor]

