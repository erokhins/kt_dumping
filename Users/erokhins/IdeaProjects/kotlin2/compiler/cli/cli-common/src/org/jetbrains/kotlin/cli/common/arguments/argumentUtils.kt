'Suppress' @ [28:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'copyProperties' @ [30:9] ==> private fun <From : Any, To : Any> copyProperties(from: T, to: T, deepCopyWhenNeeded: Boolean, propertiesToCopy: List<KProperty1<T, Any?>>): T defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <From : Any> -> T
    <To : Any> -> T

'bean' @ [30:24] ==> value-parameter bean: T defined in org.jetbrains.kotlin.cli.common.arguments.copyBean[ValueParameterDescriptorImpl]

'bean' @ [30:30] ==> value-parameter bean: T defined in org.jetbrains.kotlin.cli.common.arguments.copyBean[ValueParameterDescriptorImpl]

'java' @ [30:42] ==> public val <T> KClass<out T>.java: Class<out T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'newInstance' @ [30:47] ==> @CallerSensitive public open fun newInstance(): (T..T?) defined in java.lang.Class[JavaMethodDescriptor]

'collectProperties' @ [30:70] ==> public fun <T : Any> collectProperties(kClass: KClass<T>, inheritedOnly: Boolean): List<KProperty1<T, Any?>> defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'bean' @ [30:88] ==> value-parameter bean: T defined in org.jetbrains.kotlin.cli.common.arguments.copyBean[ValueParameterDescriptorImpl]

'Suppress' @ [34:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'copyProperties' @ [35:12] ==> private fun <From : Any, To : Any> copyProperties(from: From, to: To, deepCopyWhenNeeded: Boolean, propertiesToCopy: List<KProperty1<From, Any?>>): To defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <From : Any> -> From
    <To : Any> -> To

'from' @ [35:27] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.mergeBeans[ValueParameterDescriptorImpl]

'to' @ [35:33] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.mergeBeans[ValueParameterDescriptorImpl]

'collectProperties' @ [35:44] ==> public fun <T : Any> collectProperties(kClass: KClass<From>, inheritedOnly: Boolean): List<KProperty1<From, Any?>> defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> From

'from' @ [35:62] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.mergeBeans[ValueParameterDescriptorImpl]

'Suppress' @ [38:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'copyProperties' @ [40:9] ==> private fun <From : Any, To : Any> copyProperties(from: From, to: To, deepCopyWhenNeeded: Boolean, propertiesToCopy: List<KProperty1<From, Any?>>): To defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <From : Any> -> From
    <To : Any> -> To

'from' @ [40:24] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.copyInheritedFields[ValueParameterDescriptorImpl]

'to' @ [40:30] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.copyInheritedFields[ValueParameterDescriptorImpl]

'collectProperties' @ [40:40] ==> public fun <T : Any> collectProperties(kClass: KClass<From>, inheritedOnly: Boolean): List<KProperty1<From, Any?>> defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> From

'from' @ [40:58] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.copyInheritedFields[ValueParameterDescriptorImpl]

'Suppress' @ [42:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'copyProperties' @ [44:9] ==> private fun <From : Any, To : Any> copyProperties(from: From, to: To, deepCopyWhenNeeded: Boolean, propertiesToCopy: List<KProperty1<From, Any?>>): To defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <From : Any> -> From
    <To : Any> -> To

'from' @ [44:24] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.copyFieldsSatisfying[ValueParameterDescriptorImpl]

'to' @ [44:30] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.copyFieldsSatisfying[ValueParameterDescriptorImpl]

'collectProperties' @ [44:40] ==> public fun <T : Any> collectProperties(kClass: KClass<From>, inheritedOnly: Boolean): List<KProperty1<From, Any?>> defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> From

'from' @ [44:58] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.copyFieldsSatisfying[ValueParameterDescriptorImpl]

'filter' @ [44:94] ==> public inline fun <T> Iterable<KProperty1<From, Any?>>.filter(predicate: (KProperty1<From, Any?>) -> Boolean): List<KProperty1<From, Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<From, Any?>

'predicate' @ [44:101] ==> value-parameter predicate: (KProperty1<From, Any?>) -> Boolean defined in org.jetbrains.kotlin.cli.common.arguments.copyFieldsSatisfying[ValueParameterDescriptorImpl]

'from' @ [52:9] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'to' @ [52:17] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'to' @ [52:28] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'propertiesToCopy' @ [54:26] ==> value-parameter propertiesToCopy: List<KProperty1<From, Any?>> defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'Suppress' @ [55:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'to' @ [56:26] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'memberProperties' @ [56:36] ==> @SinceKotlin public val <T : Any> KClass<out To>.memberProperties: Collection<KProperty1<out To, *>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> To

'firstOrNull' @ [56:53] ==> public inline fun <T> Iterable<KProperty1<out To, *>>.firstOrNull(predicate: (KProperty1<out To, *>) -> Boolean): KProperty1<out To, *>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<out To, *>

'it' @ [56:67] ==> value-parameter it: KProperty1<out To, *> defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [56:70] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'fromProperty' @ [56:78] ==> val fromProperty: KProperty1<From, Any?> defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[LocalVariableDescriptor]

'name' @ [56:91] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'fromProperty' @ [58:25] ==> val fromProperty: KProperty1<From, Any?> defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[LocalVariableDescriptor]

'get' @ [58:38] ==> public abstract fun get(receiver: From): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'from' @ [58:42] ==> value-parameter from: From defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'toProperty' @ [59:9] ==> val toProperty: KMutableProperty1<To, Any?> defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[LocalVariableDescriptor]

'set' @ [59:20] ==> public abstract fun set(receiver: To, value: Any?): Unit defined in kotlin.reflect.KMutableProperty1[DeserializedSimpleFunctionDescriptor]

'to' @ [59:24] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'if (deepCopyWhenNeeded) fromValue?.copyValueIfNeeded() else fromValue' @ [59:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'deepCopyWhenNeeded' @ [59:32] ==> value-parameter deepCopyWhenNeeded: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'fromValue' @ [59:52] ==> val fromValue: Any? defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[LocalVariableDescriptor]

'copyValueIfNeeded' @ [59:63] ==> private fun Any.copyValueIfNeeded(): Any defined in org.jetbrains.kotlin.cli.common.arguments in file argumentUtils.kt[SimpleFunctionDescriptorImpl]

'fromValue' @ [59:88] ==> val fromValue: Any? defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[LocalVariableDescriptor]

'to' @ [61:12] ==> value-parameter to: To defined in org.jetbrains.kotlin.cli.common.arguments.copyProperties[ValueParameterDescriptorImpl]

'Suppress' @ [65:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (this) {
        is ByteArray -> Arrays.copyOf(this, size)
        is CharArray -> Arrays.copyOf(this, size)
        is ShortArray -> Arrays.copyOf(this, size)
        is IntArray -> Arrays.copyOf(this, size)
        is LongArray -> Arrays.copyOf(this, size)
        is FloatArray -> Arrays.copyOf(this, size)
        is DoubleArray -> Arrays.copyOf(this, size)
        is BooleanArray -> Arrays.copyOf(this, size)

        is Array<*> -> java.lang.reflect.Array.newInstance(this::class.java.componentType, size).apply {
            this as Array<Any?>
            (this@copyValueIfNeeded as Array<Any?>).forEachIndexed { i, value -> this[i] = value?.copyValueIfNeeded() }
        }

        is MutableCollection<*> -> (this as Collection<Any?>).mapTo(this::class.java.newInstance() as MutableCollection<Any?>) { it?.copyValueIfNeeded() }

        is MutableMap<*, *> -> (this::class.java.newInstance() as MutableMap<Any?, Any?>).apply {
            for ((k, v) in this@copyValueIfNeeded.entries) {
                put(k?.copyValueIfNeeded(), v?.copyValueIfNeeded())
            }
        }

        else -> this
    }' @ [66:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any, entry5: Any, entry6: Any, entry7: Any, entry8: Any, entry9: Any, entry10: Any, entry11: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'this' @ [66:18] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'copyOf' @ [67:32] ==> public open fun copyOf(p0: (ByteArray..ByteArray?), p1: Int): (ByteArray..ByteArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [67:39] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [67:45] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'copyOf' @ [68:32] ==> public open fun copyOf(p0: (CharArray..CharArray?), p1: Int): (CharArray..CharArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [68:39] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [68:45] ==> public final val size: Int defined in kotlin.CharArray[DeserializedPropertyDescriptor]

'copyOf' @ [69:33] ==> public open fun copyOf(p0: (ShortArray..ShortArray?), p1: Int): (ShortArray..ShortArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [69:40] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [69:46] ==> public final val size: Int defined in kotlin.ShortArray[DeserializedPropertyDescriptor]

'copyOf' @ [70:31] ==> public open fun copyOf(p0: (IntArray..IntArray?), p1: Int): (IntArray..IntArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [70:38] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [70:44] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'copyOf' @ [71:32] ==> public open fun copyOf(p0: (LongArray..LongArray?), p1: Int): (LongArray..LongArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [71:39] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [71:45] ==> public final val size: Int defined in kotlin.LongArray[DeserializedPropertyDescriptor]

'copyOf' @ [72:33] ==> public open fun copyOf(p0: (FloatArray..FloatArray?), p1: Int): (FloatArray..FloatArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [72:40] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [72:46] ==> public final val size: Int defined in kotlin.FloatArray[DeserializedPropertyDescriptor]

'copyOf' @ [73:34] ==> public open fun copyOf(p0: (DoubleArray..DoubleArray?), p1: Int): (DoubleArray..DoubleArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [73:41] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [73:47] ==> public final val size: Int defined in kotlin.DoubleArray[DeserializedPropertyDescriptor]

'copyOf' @ [74:35] ==> public open fun copyOf(p0: (BooleanArray..BooleanArray?), p1: Int): (BooleanArray..BooleanArray?) defined in java.util.Arrays[JavaMethodDescriptor]

'this' @ [74:42] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'size' @ [74:48] ==> public final val size: Int defined in kotlin.BooleanArray[DeserializedPropertyDescriptor]

'newInstance' @ [76:48] ==> public open fun newInstance(p0: (Class<*>..Class<*>?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'this' @ [76:60] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'java' @ [76:72] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'componentType' @ [76:77] ==> public final val <T : (Any..Any?)> Class<out Any>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'size' @ [76:92] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'apply' @ [76:98] ==> @InlineOnly public inline fun <T> (Any..Any?).apply(block: (Any..Any?).() -> Unit): (Any..Any?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'this' @ [77:13] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded.<anonymous>[ReceiverParameterDescriptorImpl]

'this@copyValueIfNeeded' @ [78:14] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'forEachIndexed' @ [78:53] ==> public inline fun <T> Array<out Any?>.forEachIndexed(action: (index: Int, Any?) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'this' @ [78:82] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded.<anonymous>[ReceiverParameterDescriptorImpl]

'i' @ [78:87] ==> value-parameter i: Int defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [78:92] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'copyValueIfNeeded' @ [78:99] ==> private fun Any.copyValueIfNeeded(): Any defined in org.jetbrains.kotlin.cli.common.arguments in file argumentUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [81:37] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'mapTo' @ [81:63] ==> public inline fun <T, R, C : MutableCollection<in Any?>> Iterable<Any?>.mapTo(destination: MutableCollection<Any?>, transform: (Any?) -> Any?): MutableCollection<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> Any?
    <C : MutableCollection<in R>> -> MutableCollection<Any?>

'this' @ [81:69] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'java' @ [81:81] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'newInstance' @ [81:86] ==> @CallerSensitive public open fun newInstance(): (Any..Any?) defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [81:130] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'copyValueIfNeeded' @ [81:134] ==> private fun Any.copyValueIfNeeded(): Any defined in org.jetbrains.kotlin.cli.common.arguments in file argumentUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [83:33] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'java' @ [83:45] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'newInstance' @ [83:50] ==> @CallerSensitive public open fun newInstance(): (Any..Any?) defined in java.lang.Class[JavaMethodDescriptor]

'apply' @ [83:91] ==> @InlineOnly public inline fun <T> MutableMap<Any?, Any?>.apply(block: MutableMap<Any?, Any?>.() -> Unit): MutableMap<Any?, Any?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableMap<Any?, Any?>

'component1' @ [84:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, Any?>.component1(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'component2' @ [84:22] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, Any?>.component2(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'this@copyValueIfNeeded' @ [84:28] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'entries' @ [84:51] ==> public abstract val entries: MutableSet<out MutableMap.MutableEntry<out Any?, out Any?>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'put' @ [85:17] ==> public abstract fun put(key: Any?, value: Any?): Any? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'k' @ [85:21] ==> val k: Any? defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded.<anonymous>[LocalVariableDescriptor]

'copyValueIfNeeded' @ [85:24] ==> private fun Any.copyValueIfNeeded(): Any defined in org.jetbrains.kotlin.cli.common.arguments in file argumentUtils.kt[SimpleFunctionDescriptorImpl]

'v' @ [85:45] ==> val v: Any? defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded.<anonymous>[LocalVariableDescriptor]

'copyValueIfNeeded' @ [85:48] ==> private fun Any.copyValueIfNeeded(): Any defined in org.jetbrains.kotlin.cli.common.arguments in file argumentUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [89:17] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.copyValueIfNeeded[ReceiverParameterDescriptorImpl]

'ArrayList' @ [94:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (KProperty1<T, *>..KProperty1<T, *>?)>..Collection<(KProperty1<T, *>..KProperty1<T, *>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KProperty1<T, *>

'kClass' @ [94:32] ==> value-parameter kClass: KClass<T> defined in org.jetbrains.kotlin.cli.common.arguments.collectProperties[ValueParameterDescriptorImpl]

'memberProperties' @ [94:39] ==> @SinceKotlin public val <T : Any> KClass<T>.memberProperties: Collection<KProperty1<T, *>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'inheritedOnly' @ [95:9] ==> value-parameter inheritedOnly: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.collectProperties[ValueParameterDescriptorImpl]

'properties' @ [96:9] ==> val properties: ArrayList<KProperty1<T, *>> defined in org.jetbrains.kotlin.cli.common.arguments.collectProperties[LocalVariableDescriptor]

'removeAll' @ [96:20] ==> public open fun removeAll(elements: Collection<KProperty1<T, *>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'kClass' @ [96:30] ==> value-parameter kClass: KClass<T> defined in org.jetbrains.kotlin.cli.common.arguments.collectProperties[ValueParameterDescriptorImpl]

'declaredMemberProperties' @ [96:37] ==> @SinceKotlin public val <T : Any> KClass<T>.declaredMemberProperties: Collection<KProperty1<T, *>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'properties' @ [98:12] ==> val properties: ArrayList<KProperty1<T, *>> defined in org.jetbrains.kotlin.cli.common.arguments.collectProperties[LocalVariableDescriptor]

'filter' @ [98:23] ==> public inline fun <T> Iterable<KProperty1<T, *>>.filter(predicate: (KProperty1<T, *>) -> Boolean): List<KProperty1<T, *>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<T, *>

'it' @ [99:9] ==> value-parameter it: KProperty1<T, *> defined in org.jetbrains.kotlin.cli.common.arguments.collectProperties.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [99:12] ==> @SinceKotlin public abstract val visibility: KVisibility? defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'PUBLIC' @ [99:38] ==> enum entry PUBLIC defined in kotlin.reflect.KVisibility[FakeCallableDescriptorForObject]

'it' @ [99:48] ==> value-parameter it: KProperty1<T, *> defined in org.jetbrains.kotlin.cli.common.arguments.collectProperties.<anonymous>[ValueParameterDescriptorImpl]

'findAnnotation' @ [99:51] ==> @SinceKotlin public inline fun <reified T : Annotation> KAnnotatedElement.findAnnotation(): Transient? defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Annotation> -> Transient

