'createJsMap' @ [33:39] ==> public open fun createJsMap(): dynamic defined in kotlin.collections.InternalStringMap[SimpleFunctionDescriptorImpl]

'key' @ [46:13] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.contains[ValueParameterDescriptorImpl]

'backingMap' @ [47:16] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'key' @ [47:27] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.contains[ValueParameterDescriptorImpl]

'undefined' @ [47:36] ==> public external val undefined: Nothing? defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'key' @ [51:13] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.get[ValueParameterDescriptorImpl]

'backingMap' @ [52:21] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'key' @ [52:32] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.get[ValueParameterDescriptorImpl]

'if (value !== undefined) value.unsafeCast<V>() else null' @ [53:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: V?, elseBranch: V?): V?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> V?

'value' @ [53:20] ==> val value: dynamic defined in kotlin.collections.InternalStringMap.get[LocalVariableDescriptor]

'undefined' @ [53:30] ==> public external val undefined: Nothing? defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'value' @ [53:41] ==> val value: dynamic defined in kotlin.collections.InternalStringMap.get[LocalVariableDescriptor]

'unsafeCast' @ [53:47] ==> @DynamicExtension @JsName @InlineOnly public inline fun <T> dynamic.unsafeCast(): V defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V

'require' @ [58:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'key' @ [58:17] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.put[ValueParameterDescriptorImpl]

'backingMap' @ [59:24] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'key' @ [59:35] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.put[ValueParameterDescriptorImpl]

'backingMap' @ [60:9] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'key' @ [60:20] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.put[ValueParameterDescriptorImpl]

'value' @ [60:27] ==> value-parameter value: V defined in kotlin.collections.InternalStringMap.put[ValueParameterDescriptorImpl]

'if (oldValue === undefined) {
            size++
//            structureChanged(host)
            return null
        }
        else {
//            valueMod++
            return oldValue.unsafeCast<V>()
        }' @ [62:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'oldValue' @ [62:13] ==> val oldValue: dynamic defined in kotlin.collections.InternalStringMap.put[LocalVariableDescriptor]

'undefined' @ [62:26] ==> public external val undefined: Nothing? defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'size' @ [63:13] ==> public open var size: Int defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'oldValue' @ [69:20] ==> val oldValue: dynamic defined in kotlin.collections.InternalStringMap.put[LocalVariableDescriptor]

'unsafeCast' @ [69:29] ==> @DynamicExtension @JsName @InlineOnly public inline fun <T> dynamic.unsafeCast(): V defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V

'key' @ [74:13] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.remove[ValueParameterDescriptorImpl]

'backingMap' @ [75:21] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'key' @ [75:32] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.remove[ValueParameterDescriptorImpl]

'if (value !== undefined) {
            deleteProperty(backingMap, key)
            size--
//            structureChanged(host)
            return value.unsafeCast<V>()
        }
        else {
//            valueMod++
            return null
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'value' @ [76:13] ==> val value: dynamic defined in kotlin.collections.InternalStringMap.remove[LocalVariableDescriptor]

'undefined' @ [76:23] ==> public external val undefined: Nothing? defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'deleteProperty' @ [77:13] ==> @InlineOnly @Suppress internal inline fun deleteProperty(obj: Any, property: Any): Unit defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'backingMap' @ [77:28] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'key' @ [77:40] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.remove[ValueParameterDescriptorImpl]

'size' @ [78:13] ==> public open var size: Int defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'value' @ [80:20] ==> val value: dynamic defined in kotlin.collections.InternalStringMap.remove[LocalVariableDescriptor]

'unsafeCast' @ [80:26] ==> @DynamicExtension @JsName @InlineOnly public inline fun <T> dynamic.unsafeCast(): V defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V

'backingMap' @ [90:9] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'createJsMap' @ [90:22] ==> public open fun createJsMap(): dynamic defined in kotlin.collections.InternalStringMap[SimpleFunctionDescriptorImpl]

'size' @ [91:9] ==> public open var size: Int defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'js' @ [97:47] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'keys' @ [97:60] ==> public final fun keys(p0: dynamic): dynamic defined in kotlin.collections.InternalStringMap.iterator.<no name provided>.keys[SimpleFunctionDescriptorImpl]

'backingMap' @ [97:65] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalStringMap[PropertyDescriptorImpl]

'keys' @ [98:36] ==> private final val keys: Array<String> defined in kotlin.collections.InternalStringMap.iterator.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [98:41] ==> public final operator fun iterator(): Iterator<String> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'iterator' @ [101:47] ==> private final val iterator: Iterator<String> defined in kotlin.collections.InternalStringMap.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [101:56] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [104:27] ==> private final val iterator: Iterator<String> defined in kotlin.collections.InternalStringMap.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [104:36] ==> public abstract operator fun next(): String defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'lastKey' @ [105:17] ==> private final var lastKey: String? defined in kotlin.collections.InternalStringMap.iterator.<no name provided>[PropertyDescriptorImpl]

'key' @ [105:27] ==> val key: String defined in kotlin.collections.InternalStringMap.iterator.<no name provided>.next[LocalVariableDescriptor]

'Suppress' @ [106:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'newMapEntry' @ [107:24] ==> private final fun newMapEntry(key: K): MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalStringMap[SimpleFunctionDescriptorImpl]

'key' @ [107:36] ==> val key: String defined in kotlin.collections.InternalStringMap.iterator.<no name provided>.next[LocalVariableDescriptor]

'Suppress' @ [111:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this@InternalStringMap' @ [112:17] ==> <this> defined in kotlin.collections.InternalStringMap[LazyClassReceiverParameterDescriptor]

'remove' @ [112:40] ==> public open fun remove(key: K): V? defined in kotlin.collections.InternalStringMap[SimpleFunctionDescriptorImpl]

'checkNotNull' @ [112:47] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: String?): String defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> String

'lastKey' @ [112:60] ==> private final var lastKey: String? defined in kotlin.collections.InternalStringMap.iterator.<no name provided>[PropertyDescriptorImpl]

'key' @ [118:37] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.newMapEntry[ValueParameterDescriptorImpl]

'this@InternalStringMap' @ [119:39] ==> <this> defined in kotlin.collections.InternalStringMap[LazyClassReceiverParameterDescriptor]

'key' @ [119:62] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.newMapEntry[ValueParameterDescriptorImpl]

'unsafeCast' @ [119:67] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): V defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V

'this@InternalStringMap' @ [121:49] ==> <this> defined in kotlin.collections.InternalStringMap[LazyClassReceiverParameterDescriptor]

'put' @ [121:72] ==> public open fun put(key: K, value: V): V? defined in kotlin.collections.InternalStringMap[SimpleFunctionDescriptorImpl]

'key' @ [121:76] ==> value-parameter key: K defined in kotlin.collections.InternalStringMap.newMapEntry[ValueParameterDescriptorImpl]

'newValue' @ [121:81] ==> value-parameter newValue: V defined in kotlin.collections.InternalStringMap.newMapEntry.<no name provided>.setValue[ValueParameterDescriptorImpl]

'unsafeCast' @ [121:91] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): V defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V

'AbstractMap' @ [123:40] ==> internal companion object defined in kotlin.collections.AbstractMap[FakeCallableDescriptorForObject]

'entryHashCode' @ [123:52] ==> internal final fun entryHashCode(e: Map.Entry<*, *>): Int defined in kotlin.collections.AbstractMap.Companion[SimpleFunctionDescriptorImpl]

'this' @ [123:66] ==> <this> defined in kotlin.collections.InternalStringMap.newMapEntry.<no name provided>[LazyClassReceiverParameterDescriptor]

'AbstractMap' @ [124:43] ==> internal companion object defined in kotlin.collections.AbstractMap[FakeCallableDescriptorForObject]

'entryToString' @ [124:55] ==> internal final fun entryToString(e: Map.Entry<*, *>): String defined in kotlin.collections.AbstractMap.Companion[SimpleFunctionDescriptorImpl]

'this' @ [124:69] ==> <this> defined in kotlin.collections.InternalStringMap.newMapEntry.<no name provided>[LazyClassReceiverParameterDescriptor]

'AbstractMap' @ [125:53] ==> internal companion object defined in kotlin.collections.AbstractMap[FakeCallableDescriptorForObject]

'entryEquals' @ [125:65] ==> internal final fun entryEquals(e: Map.Entry<*, *>, other: Any?): Boolean defined in kotlin.collections.AbstractMap.Companion[SimpleFunctionDescriptorImpl]

'this' @ [125:77] ==> <this> defined in kotlin.collections.InternalStringMap.newMapEntry.<no name provided>[LazyClassReceiverParameterDescriptor]

'other' @ [125:83] ==> value-parameter other: Any? defined in kotlin.collections.InternalStringMap.newMapEntry.<no name provided>.equals[ValueParameterDescriptorImpl]

