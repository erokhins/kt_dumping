'elements' @ [10:84] ==> value-parameter elements: Set<T> defined in net.corda.core.utilities.NonEmptySet.<init>[ValueParameterDescriptorImpl]

'JvmStatic' @ [16:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'NonEmptySet' @ [17:50] ==> private constructor NonEmptySet<T>(elements: Set<T>) defined in net.corda.core.utilities.NonEmptySet[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'singleton' @ [17:74] ==> public open fun <T : (Any..Any?)> singleton(p0: (T..T?)): (MutableSet<(T..T?)>..Set<(T..T?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'element' @ [17:84] ==> value-parameter element: T defined in net.corda.core.utilities.NonEmptySet.Companion.of[ValueParameterDescriptorImpl]

'JvmStatic' @ [20:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'LinkedHashSet' @ [22:28] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: Int) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'rest' @ [22:45] ==> value-parameter vararg rest: T defined in net.corda.core.utilities.NonEmptySet.Companion.of[ValueParameterDescriptorImpl]

'size' @ [22:50] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'elements' @ [23:13] ==> val elements: LinkedHashSet<T> defined in net.corda.core.utilities.NonEmptySet.Companion.of[LocalVariableDescriptor]

'first' @ [23:25] ==> value-parameter first: T defined in net.corda.core.utilities.NonEmptySet.Companion.of[ValueParameterDescriptorImpl]

'elements' @ [24:13] ==> val elements: LinkedHashSet<T> defined in net.corda.core.utilities.NonEmptySet.Companion.of[LocalVariableDescriptor]

'second' @ [24:25] ==> value-parameter second: T defined in net.corda.core.utilities.NonEmptySet.Companion.of[ValueParameterDescriptorImpl]

'elements' @ [25:13] ==> val elements: LinkedHashSet<T> defined in net.corda.core.utilities.NonEmptySet.Companion.of[LocalVariableDescriptor]

'addAll' @ [25:22] ==> public fun <T> MutableCollection<in T>.addAll(elements: Array<out T>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'rest' @ [25:29] ==> value-parameter vararg rest: T defined in net.corda.core.utilities.NonEmptySet.Companion.of[ValueParameterDescriptorImpl]

'NonEmptySet' @ [26:20] ==> private constructor NonEmptySet<T>(elements: Set<T>) defined in net.corda.core.utilities.NonEmptySet[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'elements' @ [26:32] ==> val elements: LinkedHashSet<T> defined in net.corda.core.utilities.NonEmptySet.Companion.of[LocalVariableDescriptor]

'JvmStatic' @ [34:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'elements' @ [36:17] ==> value-parameter elements: Collection<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[ValueParameterDescriptorImpl]

'elements' @ [36:49] ==> value-parameter elements: Collection<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[ValueParameterDescriptorImpl]

'when (elements.size) {
                0 -> throw IllegalArgumentException("elements is empty")
                1 -> of(elements.first())
                else -> {
                    val copy = LinkedHashSet<T>(elements.size)
                    elements.forEach { copy += it }  // Can't use Collection.addAll as it doesn't specify insertion order
                    NonEmptySet(copy)
                }
            }' @ [37:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NonEmptySet<T>, entry1: NonEmptySet<T>, entry2: NonEmptySet<T>): NonEmptySet<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NonEmptySet<T>

'elements' @ [37:26] ==> value-parameter elements: Collection<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[ValueParameterDescriptorImpl]

'size' @ [37:35] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [38:28] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'of' @ [39:22] ==> @JvmStatic public final fun <T> of(element: T): NonEmptySet<T> defined in net.corda.core.utilities.NonEmptySet.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'elements' @ [39:25] ==> value-parameter elements: Collection<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[ValueParameterDescriptorImpl]

'first' @ [39:34] ==> public fun <T> Iterable<T>.first(): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'LinkedHashSet' @ [41:32] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: Int) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'elements' @ [41:49] ==> value-parameter elements: Collection<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[ValueParameterDescriptorImpl]

'size' @ [41:58] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'elements' @ [42:21] ==> value-parameter elements: Collection<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[ValueParameterDescriptorImpl]

'forEach' @ [42:30] ==> @HidesMembers public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'copy' @ [42:40] ==> val copy: LinkedHashSet<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[LocalVariableDescriptor]

'it' @ [42:48] ==> value-parameter it: T defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf.<anonymous>[ValueParameterDescriptorImpl]

'NonEmptySet' @ [43:21] ==> private constructor NonEmptySet<T>(elements: Set<T>) defined in net.corda.core.utilities.NonEmptySet[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'copy' @ [43:33] ==> val copy: LinkedHashSet<T> defined in net.corda.core.utilities.NonEmptySet.Companion.copyOf[LocalVariableDescriptor]

'elements' @ [50:21] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'iterator' @ [50:30] ==> public abstract fun iterator(): Iterator<T> defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'next' @ [50:41] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'elements' @ [52:55] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'iterator' @ [52:64] ==> public abstract fun iterator(): Iterator<T> defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'elements' @ [55:52] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'forEach' @ [55:61] ==> public open fun forEach(p0: (Consumer<in (T..T?)>..Consumer<in (T..T?)>?)): Unit defined in kotlin.collections.Set[JavaMethodDescriptor]

'action' @ [55:69] ==> value-parameter action: Consumer<in T> defined in net.corda.core.utilities.NonEmptySet.forEach[ValueParameterDescriptorImpl]

'elements' @ [56:40] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'stream' @ [56:49] ==> public open fun stream(): Stream<T> defined in kotlin.collections.Set[JavaMethodDescriptor]

'elements' @ [57:48] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'parallelStream' @ [57:57] ==> public open fun parallelStream(): Stream<T> defined in kotlin.collections.Set[JavaMethodDescriptor]

'elements' @ [58:50] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'spliterator' @ [58:59] ==> public open fun spliterator(): Spliterator<(T..T?)> defined in kotlin.collections.Set[JavaMethodDescriptor]

'other' @ [59:49] ==> value-parameter other: Any? defined in net.corda.core.utilities.NonEmptySet.equals[ValueParameterDescriptorImpl]

'this' @ [59:59] ==> <this> defined in net.corda.core.utilities.NonEmptySet[LazyClassReceiverParameterDescriptor]

'other' @ [59:67] ==> value-parameter other: Any? defined in net.corda.core.utilities.NonEmptySet.equals[ValueParameterDescriptorImpl]

'elements' @ [59:76] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'elements' @ [60:36] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'hashCode' @ [60:45] ==> public open fun hashCode(): Int defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'elements' @ [61:39] ==> private final val elements: Set<T> defined in net.corda.core.utilities.NonEmptySet[PropertyDescriptorImpl]

'toString' @ [61:48] ==> public open fun toString(): String defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

