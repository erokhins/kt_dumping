'kotlin.internal.InlineOnly' @ [22:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [23:63] ==> <this> defined in kotlin.collections.orEmpty[ReceiverParameterDescriptorImpl]

'emptyArray' @ [23:71] ==> public inline fun <T> emptyArray(): Array<T> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'kotlin.internal.InlineOnly' @ [25:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'copyToArray' @ [26:64] ==> @JsName @PublishedApi internal fun <T> copyToArray(collection: Collection<T>): Array<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [26:76] ==> <this> defined in kotlin.collections.toTypedArray[ReceiverParameterDescriptorImpl]

'JsName' @ [28:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'PublishedApi' @ [29:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'if (collection.asDynamic().toArray !== undefined)
        collection.asDynamic().toArray().unsafeCast<Array<T>>()
    else
        copyToArrayImpl(collection).unsafeCast<Array<T>>()' @ [31:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<T>, elseBranch: Array<T>): Array<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<T>

'collection' @ [31:16] ==> value-parameter collection: Collection<T> defined in kotlin.collections.copyToArray[ValueParameterDescriptorImpl]

'asDynamic' @ [31:27] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'toArray' @ [31:39] ==> public final var toArray: dynamic defined in kotlin.collections.copyToArray[PropertyDescriptorImpl]

'undefined' @ [31:51] ==> public external val undefined: Nothing? defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'collection' @ [32:9] ==> value-parameter collection: Collection<T> defined in kotlin.collections.copyToArray[ValueParameterDescriptorImpl]

'asDynamic' @ [32:20] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'toArray' @ [32:32] ==> public final fun toArray(): dynamic defined in kotlin.collections.copyToArray[SimpleFunctionDescriptorImpl]

'unsafeCast' @ [32:42] ==> @DynamicExtension @JsName @InlineOnly public inline fun <T> dynamic.unsafeCast(): Array<T> defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Array<T>

'copyToArrayImpl' @ [34:9] ==> @JsName internal fun copyToArrayImpl(collection: Collection<*>): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]

'collection' @ [34:25] ==> value-parameter collection: Collection<T> defined in kotlin.collections.copyToArray[ValueParameterDescriptorImpl]

'unsafeCast' @ [34:37] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): Array<T> defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Array<T>

'JsName' @ [37:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'emptyArray' @ [39:17] ==> public inline fun <T> emptyArray(): Array<Any?> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'collection' @ [40:20] ==> value-parameter collection: Collection<*> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'iterator' @ [40:31] ==> public abstract fun iterator(): Iterator<Any?> defined in kotlin.collections.Collection[SimpleFunctionDescriptorImpl]

'iterator' @ [41:12] ==> val iterator: Iterator<Any?> defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'hasNext' @ [41:21] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'array' @ [42:9] ==> val array: Array<Any?> defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'asDynamic' @ [42:15] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'push' @ [42:27] ==> public final fun push(p0: dynamic): dynamic defined in kotlin.collections.copyToArrayImpl[SimpleFunctionDescriptorImpl]

'iterator' @ [42:32] ==> val iterator: Iterator<Any?> defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'next' @ [42:41] ==> public abstract operator fun next(): Any? defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'array' @ [43:12] ==> val array: Array<Any?> defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'JsName' @ [46:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'array' @ [48:9] ==> value-parameter array: Array<T> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'size' @ [48:15] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'collection' @ [48:22] ==> value-parameter collection: Collection<*> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'size' @ [48:33] ==> public abstract val size: Int defined in kotlin.collections.Collection[PropertyDescriptorImpl]

'copyToArrayImpl' @ [49:16] ==> @JsName internal fun copyToArrayImpl(collection: Collection<*>): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]

'collection' @ [49:32] ==> value-parameter collection: Collection<*> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'unsafeCast' @ [49:44] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): Array<T> defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Array<T>

'collection' @ [51:20] ==> value-parameter collection: Collection<*> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'iterator' @ [51:31] ==> public abstract fun iterator(): Iterator<Any?> defined in kotlin.collections.Collection[SimpleFunctionDescriptorImpl]

'iterator' @ [53:12] ==> val iterator: Iterator<Any?> defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'hasNext' @ [53:21] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'array' @ [54:9] ==> value-parameter array: Array<T> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'index' @ [54:15] ==> var index: Int defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'iterator' @ [54:26] ==> val iterator: Iterator<Any?> defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'next' @ [54:35] ==> public abstract operator fun next(): Any? defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'unsafeCast' @ [54:42] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): T defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'index' @ [56:9] ==> var index: Int defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'array' @ [56:17] ==> value-parameter array: Array<T> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'size' @ [56:23] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'array' @ [57:9] ==> value-parameter array: Array<T> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'index' @ [57:15] ==> var index: Int defined in kotlin.collections.copyToArrayImpl[LocalVariableDescriptor]

'unsafeCast' @ [57:29] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): T defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'array' @ [59:12] ==> value-parameter array: Array<T> defined in kotlin.collections.copyToArrayImpl[ValueParameterDescriptorImpl]

'library' @ [62:1] ==> public constructor library(name: String = ...) defined in kotlin.js.library[ClassConstructorDescriptorImpl]

'Suppress' @ [63:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'definedExternally' @ [64:55] ==> public external val definedExternally: Nothing defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'arrayListOf' @ [69:46] ==> public fun <T> arrayListOf(vararg elements: T): ArrayList<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'element' @ [69:58] ==> value-parameter element: T defined in kotlin.collections.listOf[ValueParameterDescriptorImpl]

'hashSetOf' @ [74:44] ==> public fun <T> hashSetOf(vararg elements: T): HashSet<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'element' @ [74:54] ==> value-parameter element: T defined in kotlin.collections.setOf[ValueParameterDescriptorImpl]

'hashMapOf' @ [80:56] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<K, V>): HashMap<K, V> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'pair' @ [80:66] ==> value-parameter pair: Pair<K, V> defined in kotlin.collections.mapOf[ValueParameterDescriptorImpl]

'collectionsSort' @ [86:5] ==> private fun <T> collectionsSort(list: MutableList<T>, comparator: Comparator<in T>): Unit defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [86:21] ==> <this> defined in kotlin.collections.sort[ReceiverParameterDescriptorImpl]

'naturalOrder' @ [86:27] ==> public fun <T : Comparable<T>> naturalOrder(): Comparator<T> defined in kotlin.comparisons[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Comparable<T>> -> T

'collectionsSort' @ [93:5] ==> private fun <T> collectionsSort(list: MutableList<T>, comparator: Comparator<in T>): Unit defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [93:21] ==> <this> defined in kotlin.collections.sortWith[ReceiverParameterDescriptorImpl]

'comparator' @ [93:27] ==> value-parameter comparator: Comparator<in T> defined in kotlin.collections.sortWith[ValueParameterDescriptorImpl]

'list' @ [97:9] ==> value-parameter list: MutableList<T> defined in kotlin.collections.collectionsSort[ValueParameterDescriptorImpl]

'size' @ [97:14] ==> public abstract val size: Int defined in kotlin.collections.MutableList[PropertyDescriptorImpl]

'copyToArray' @ [99:17] ==> @JsName @PublishedApi internal fun <T> copyToArray(collection: Collection<T>): Array<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'list' @ [99:29] ==> value-parameter list: MutableList<T> defined in kotlin.collections.collectionsSort[ValueParameterDescriptorImpl]

'array' @ [101:5] ==> val array: Array<T> defined in kotlin.collections.collectionsSort[LocalVariableDescriptor]

'asDynamic' @ [101:11] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'sort' @ [101:23] ==> public final fun sort(p0: dynamic): dynamic defined in kotlin.collections.collectionsSort[SimpleFunctionDescriptorImpl]

'comparator' @ [101:28] ==> value-parameter comparator: Comparator<in T> defined in kotlin.collections.collectionsSort[ValueParameterDescriptorImpl]

'asDynamic' @ [101:39] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'compare' @ [101:51] ==> public final var compare: dynamic defined in kotlin.collections.collectionsSort[PropertyDescriptorImpl]

'bind' @ [101:59] ==> public final fun bind(p0: dynamic): dynamic defined in kotlin.collections.collectionsSort[SimpleFunctionDescriptorImpl]

'comparator' @ [101:64] ==> value-parameter comparator: Comparator<in T> defined in kotlin.collections.collectionsSort[ValueParameterDescriptorImpl]

'..' @ [103:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'array' @ [103:18] ==> val array: Array<T> defined in kotlin.collections.collectionsSort[LocalVariableDescriptor]

'size' @ [103:24] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'list' @ [104:9] ==> value-parameter list: MutableList<T> defined in kotlin.collections.collectionsSort[ValueParameterDescriptorImpl]

'i' @ [104:14] ==> val i: Int defined in kotlin.collections.collectionsSort[LocalVariableDescriptor]

'array' @ [104:19] ==> val array: Array<T> defined in kotlin.collections.collectionsSort[LocalVariableDescriptor]

'i' @ [104:25] ==> val i: Int defined in kotlin.collections.collectionsSort[LocalVariableDescriptor]

