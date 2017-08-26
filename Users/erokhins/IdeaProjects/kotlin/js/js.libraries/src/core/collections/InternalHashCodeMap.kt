'createJsMap' @ [40:39] ==> public open fun createJsMap(): dynamic defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'equality' @ [45:24] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'getHashCode' @ [45:33] ==> public abstract fun getHashCode(value: Any?): Int defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'key' @ [45:45] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'getChainOrEntryOrNull' @ [46:28] ==> private final fun getChainOrEntryOrNull(hashCode: Int): dynamic defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'hashCode' @ [46:50] ==> val hashCode: Int defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'if (chainOrEntry == null) {
            // This is a new chain, put it to the map.
            backingMap[hashCode] = SimpleEntry(key, value)
        }
        else {
            if (chainOrEntry !is Array<*>) {
                // It is an entry
                val entry: SimpleEntry<K, V> = chainOrEntry
                if (equality.equals(entry.key, key)) {
                    return entry.setValue(value)
                }
                else {
                    backingMap[hashCode] = arrayOf(entry, SimpleEntry(key, value))
                    size++
                    return null
                }
            }
            else {
                // Chain already exists, perhaps key also exists.
                val chain: Array<MutableEntry<K, V>> = chainOrEntry
                val entry = chain.findEntryInChain(key)
                if (entry != null) {
                    return entry.setValue(value)
                }
                chain.asDynamic().push(SimpleEntry(key, value))
            }
        }' @ [47:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'chainOrEntry' @ [47:13] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'backingMap' @ [49:13] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'hashCode' @ [49:24] ==> val hashCode: Int defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'SimpleEntry' @ [49:36] ==> public constructor SimpleEntry<K, V>(key: K, value: V) defined in kotlin.collections.AbstractMutableMap.SimpleEntry[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'key' @ [49:48] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'value' @ [49:53] ==> value-parameter value: V defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'if (chainOrEntry !is Array<*>) {
                // It is an entry
                val entry: SimpleEntry<K, V> = chainOrEntry
                if (equality.equals(entry.key, key)) {
                    return entry.setValue(value)
                }
                else {
                    backingMap[hashCode] = arrayOf(entry, SimpleEntry(key, value))
                    size++
                    return null
                }
            }
            else {
                // Chain already exists, perhaps key also exists.
                val chain: Array<MutableEntry<K, V>> = chainOrEntry
                val entry = chain.findEntryInChain(key)
                if (entry != null) {
                    return entry.setValue(value)
                }
                chain.asDynamic().push(SimpleEntry(key, value))
            }' @ [52:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'chainOrEntry' @ [52:17] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'chainOrEntry' @ [54:48] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'if (equality.equals(entry.key, key)) {
                    return entry.setValue(value)
                }
                else {
                    backingMap[hashCode] = arrayOf(entry, SimpleEntry(key, value))
                    size++
                    return null
                }' @ [55:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'equality' @ [55:21] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'equals' @ [55:30] ==> public abstract fun equals(value1: Any?, value2: Any?): Boolean defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'entry' @ [55:37] ==> val entry: AbstractMutableMap.SimpleEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'key' @ [55:43] ==> public open val key: K defined in kotlin.collections.AbstractMutableMap.SimpleEntry[PropertyDescriptorImpl]

'key' @ [55:48] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'entry' @ [56:28] ==> val entry: AbstractMutableMap.SimpleEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'setValue' @ [56:34] ==> public open fun setValue(newValue: V): V defined in kotlin.collections.AbstractMutableMap.SimpleEntry[SimpleFunctionDescriptorImpl]

'value' @ [56:43] ==> value-parameter value: V defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'backingMap' @ [59:21] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'hashCode' @ [59:32] ==> val hashCode: Int defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'arrayOf' @ [59:44] ==> @library public fun <T> arrayOf(vararg elements: AbstractMutableMap.SimpleEntry<K, V>): Array<AbstractMutableMap.SimpleEntry<K, V>> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SimpleEntry<K, V>

'entry' @ [59:52] ==> val entry: AbstractMutableMap.SimpleEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'SimpleEntry' @ [59:59] ==> public constructor SimpleEntry<K, V>(key: K, value: V) defined in kotlin.collections.AbstractMutableMap.SimpleEntry[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'key' @ [59:71] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'value' @ [59:76] ==> value-parameter value: V defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'size' @ [60:21] ==> public open var size: Int defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'chainOrEntry' @ [66:56] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'chain' @ [67:29] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'findEntryInChain' @ [67:35] ==> private final fun Array<MutableMap.MutableEntry<K, V>>.findEntryInChain(key: K): MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'key' @ [67:52] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'entry' @ [68:21] ==> val entry: MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'entry' @ [69:28] ==> val entry: MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'setValue' @ [69:34] ==> public abstract fun setValue(newValue: V): V defined in kotlin.collections.MutableMap.MutableEntry[SimpleFunctionDescriptorImpl]

'value' @ [69:43] ==> value-parameter value: V defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'chain' @ [71:17] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.put[LocalVariableDescriptor]

'asDynamic' @ [71:23] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'push' @ [71:35] ==> public final fun push(p0: dynamic): dynamic defined in kotlin.collections.InternalHashCodeMap.put[SimpleFunctionDescriptorImpl]

'SimpleEntry' @ [71:40] ==> public constructor SimpleEntry<K, V>(key: K, value: V) defined in kotlin.collections.AbstractMutableMap.SimpleEntry[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'key' @ [71:52] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'value' @ [71:57] ==> value-parameter value: V defined in kotlin.collections.InternalHashCodeMap.put[ValueParameterDescriptorImpl]

'size' @ [74:9] ==> public open var size: Int defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'equality' @ [80:24] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'getHashCode' @ [80:33] ==> public abstract fun getHashCode(value: Any?): Int defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'key' @ [80:45] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.remove[ValueParameterDescriptorImpl]

'getChainOrEntryOrNull' @ [81:28] ==> private final fun getChainOrEntryOrNull(hashCode: Int): dynamic defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'hashCode' @ [81:50] ==> val hashCode: Int defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'if (chainOrEntry !is Array<*>) {
            val entry: MutableEntry<K, V> = chainOrEntry
            if (equality.equals(entry.key, key)) {
                deleteProperty(backingMap, hashCode)
                size--
                return entry.value
            }
            else {
                return null
            }
        }
        else {
            val chain: Array<MutableEntry<K, V>> = chainOrEntry
            for (index in 0..chain.size - 1) {
                val entry = chain[index]
                if (equality.equals(key, entry.key)) {
                    if (chain.size == 1) {
                        chain.asDynamic().length = 0
                        // remove the whole array
                        deleteProperty(backingMap, hashCode)
                    } else {
                        // splice out the entry we're removing
                        chain.asDynamic().splice(index, 1)
                    }
                    size--
//                structureChanged(host)
                    return entry.value
                }
            }
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'chainOrEntry' @ [82:13] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'chainOrEntry' @ [83:45] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'if (equality.equals(entry.key, key)) {
                deleteProperty(backingMap, hashCode)
                size--
                return entry.value
            }
            else {
                return null
            }' @ [84:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'equality' @ [84:17] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'equals' @ [84:26] ==> public abstract fun equals(value1: Any?, value2: Any?): Boolean defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'entry' @ [84:33] ==> val entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'key' @ [84:39] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'key' @ [84:44] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.remove[ValueParameterDescriptorImpl]

'deleteProperty' @ [85:17] ==> @InlineOnly @Suppress internal inline fun deleteProperty(obj: Any, property: Any): Unit defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'backingMap' @ [85:32] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'hashCode' @ [85:44] ==> val hashCode: Int defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'size' @ [86:17] ==> public open var size: Int defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'entry' @ [87:24] ==> val entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'value' @ [87:30] ==> public abstract val value: V defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'chainOrEntry' @ [94:52] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'..' @ [95:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'chain' @ [95:30] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'size' @ [95:36] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'chain' @ [96:29] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'index' @ [96:35] ==> val index: Int defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'equality' @ [97:21] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'equals' @ [97:30] ==> public abstract fun equals(value1: Any?, value2: Any?): Boolean defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'key' @ [97:37] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.remove[ValueParameterDescriptorImpl]

'entry' @ [97:42] ==> val entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'key' @ [97:48] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'if (chain.size == 1) {
                        chain.asDynamic().length = 0
                        // remove the whole array
                        deleteProperty(backingMap, hashCode)
                    } else {
                        // splice out the entry we're removing
                        chain.asDynamic().splice(index, 1)
                    }' @ [98:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'chain' @ [98:25] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'size' @ [98:31] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'chain' @ [99:25] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'asDynamic' @ [99:31] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'length' @ [99:43] ==> public final var length: dynamic defined in kotlin.collections.InternalHashCodeMap.remove[PropertyDescriptorImpl]

'deleteProperty' @ [101:25] ==> @InlineOnly @Suppress internal inline fun deleteProperty(obj: Any, property: Any): Unit defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'backingMap' @ [101:40] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'hashCode' @ [101:52] ==> val hashCode: Int defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'chain' @ [104:25] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'asDynamic' @ [104:31] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'splice' @ [104:43] ==> public final fun splice(p0: dynamic, p1: dynamic): dynamic defined in kotlin.collections.InternalHashCodeMap.remove[SimpleFunctionDescriptorImpl]

'index' @ [104:50] ==> val index: Int defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'size' @ [106:21] ==> public open var size: Int defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'entry' @ [108:28] ==> val entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.remove[LocalVariableDescriptor]

'value' @ [108:34] ==> public abstract val value: V defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'backingMap' @ [116:9] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'createJsMap' @ [116:22] ==> public open fun createJsMap(): dynamic defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'size' @ [117:9] ==> public open var size: Int defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'getEntry' @ [120:46] ==> private final fun getEntry(key: K): MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'key' @ [120:55] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.contains[ValueParameterDescriptorImpl]

'getEntry' @ [122:36] ==> private final fun getEntry(key: K): MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'key' @ [122:45] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.get[ValueParameterDescriptorImpl]

'value' @ [122:51] ==> public abstract val value: V defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'getChainOrEntryOrNull' @ [125:28] ==> private final fun getChainOrEntryOrNull(hashCode: Int): dynamic defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'equality' @ [125:50] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'getHashCode' @ [125:59] ==> public abstract fun getHashCode(value: Any?): Int defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'key' @ [125:71] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.getEntry[ValueParameterDescriptorImpl]

'if (chainOrEntry !is Array<*>) {
            val entry: MutableEntry<K, V> = chainOrEntry
            if (equality.equals(entry.key, key)) {
                return entry
            }
            else {
                return null
            }
        }
        else {
            val chain: Array<MutableEntry<K, V>> = chainOrEntry
            return chain.findEntryInChain(key)
        }' @ [126:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'chainOrEntry' @ [126:13] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.getEntry[LocalVariableDescriptor]

'chainOrEntry' @ [127:45] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.getEntry[LocalVariableDescriptor]

'if (equality.equals(entry.key, key)) {
                return entry
            }
            else {
                return null
            }' @ [128:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'equality' @ [128:17] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'equals' @ [128:26] ==> public abstract fun equals(value1: Any?, value2: Any?): Boolean defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'entry' @ [128:33] ==> val entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.getEntry[LocalVariableDescriptor]

'key' @ [128:39] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'key' @ [128:44] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.getEntry[ValueParameterDescriptorImpl]

'entry' @ [129:24] ==> val entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.getEntry[LocalVariableDescriptor]

'chainOrEntry' @ [136:52] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.getEntry[LocalVariableDescriptor]

'chain' @ [137:20] ==> val chain: Array<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalHashCodeMap.getEntry[LocalVariableDescriptor]

'findEntryInChain' @ [137:26] ==> private final fun Array<MutableMap.MutableEntry<K, V>>.findEntryInChain(key: K): MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'key' @ [137:43] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.getEntry[ValueParameterDescriptorImpl]

'firstOrNull' @ [142:13] ==> public inline fun <T> Array<out MutableMap.MutableEntry<K, V>>.firstOrNull(predicate: (MutableMap.MutableEntry<K, V>) -> Boolean): MutableMap.MutableEntry<K, V>? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MutableEntry<K, V>

'equality' @ [142:36] ==> public open val equality: EqualityComparator defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'equals' @ [142:45] ==> public abstract fun equals(value1: Any?, value2: Any?): Boolean defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'entry' @ [142:52] ==> value-parameter entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.findEntryInChain.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [142:58] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'key' @ [142:63] ==> value-parameter key: K defined in kotlin.collections.InternalHashCodeMap.findEntryInChain[ValueParameterDescriptorImpl]

'-' @ [147:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'js' @ [149:36] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'keys' @ [149:49] ==> public final fun keys(p0: dynamic): dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>.keys[SimpleFunctionDescriptorImpl]

'backingMap' @ [149:54] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'-' @ [150:28] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [154:29] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'chainOrEntry' @ [158:21] ==> public final var chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'isChain' @ [158:45] ==> public final var isChain: Boolean defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'chainOrEntry' @ [159:42] ==> public final var chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'unsafeCast' @ [159:55] ==> @DynamicExtension @JsName @InlineOnly public inline fun <T> dynamic.unsafeCast(): Array<MutableMap.MutableEntry<K, V>> defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Array<MutableEntry<K, V>>

'size' @ [159:95] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'++' @ [160:25] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'itemIndex' @ [160:27] ==> public final var itemIndex: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'chainSize' @ [160:39] ==> val chainSize: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>.computeNext[LocalVariableDescriptor]

'if (++keyIndex < keys.size) {
                    chainOrEntry = backingMap[keys[keyIndex]]
                    isChain = chainOrEntry is Array<*>
                    itemIndex = 0
                    return 0
                }
                else {
                    chainOrEntry = null
                    return 1
                }' @ [164:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'++' @ [164:21] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'keyIndex' @ [164:23] ==> public final var keyIndex: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'keys' @ [164:34] ==> public final val keys: Array<Int> defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'size' @ [164:39] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'chainOrEntry' @ [165:21] ==> public final var chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'backingMap' @ [165:36] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'keys' @ [165:47] ==> public final val keys: Array<Int> defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'keyIndex' @ [165:52] ==> public final var keyIndex: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'isChain' @ [166:21] ==> public final var isChain: Boolean defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'chainOrEntry' @ [166:31] ==> public final var chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'itemIndex' @ [167:21] ==> public final var itemIndex: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'chainOrEntry' @ [171:21] ==> public final var chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'state' @ [177:21] ==> public final var state: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [177:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'state' @ [178:21] ==> public final var state: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'computeNext' @ [178:29] ==> private final fun computeNext(): Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'state' @ [179:24] ==> public final var state: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'!' @ [183:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [183:22] ==> public open fun hasNext(): Boolean defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'NoSuchElementException' @ [183:39] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'if (isChain) {
                    chainOrEntry.unsafeCast<Array<MutableEntry<K, V>>>()[itemIndex]
                }
                else {
                    chainOrEntry.unsafeCast<MutableEntry<K, V>>()
                }' @ [184:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MutableMap.MutableEntry<K, V>, elseBranch: MutableMap.MutableEntry<K, V>): MutableMap.MutableEntry<K, V>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MutableEntry<K, V>

'isChain' @ [184:37] ==> public final var isChain: Boolean defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'chainOrEntry' @ [185:21] ==> public final var chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'unsafeCast' @ [185:34] ==> @DynamicExtension @JsName @InlineOnly public inline fun <T> dynamic.unsafeCast(): Array<MutableMap.MutableEntry<K, V>> defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Array<MutableEntry<K, V>>

'itemIndex' @ [185:74] ==> public final var itemIndex: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'chainOrEntry' @ [188:21] ==> public final var chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'unsafeCast' @ [188:34] ==> @DynamicExtension @JsName @InlineOnly public inline fun <T> dynamic.unsafeCast(): MutableMap.MutableEntry<K, V> defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MutableEntry<K, V>

'this' @ [190:17] ==> <this> defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[LazyClassReceiverParameterDescriptor]

'lastEntry' @ [190:22] ==> public final var lastEntry: MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'lastEntry' @ [190:34] ==> val lastEntry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>.next[LocalVariableDescriptor]

'state' @ [191:17] ==> public final var state: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [191:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastEntry' @ [192:24] ==> val lastEntry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>.next[LocalVariableDescriptor]

'checkNotNull' @ [196:17] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: MutableMap.MutableEntry<K, V>?): MutableMap.MutableEntry<K, V> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MutableEntry<K, V>

'lastEntry' @ [196:30] ==> public final var lastEntry: MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'this@InternalHashCodeMap' @ [197:17] ==> <this> defined in kotlin.collections.InternalHashCodeMap[LazyClassReceiverParameterDescriptor]

'remove' @ [197:42] ==> public open fun remove(key: K): V? defined in kotlin.collections.InternalHashCodeMap[SimpleFunctionDescriptorImpl]

'lastEntry' @ [197:49] ==> public final var lastEntry: MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'key' @ [197:61] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'lastEntry' @ [198:17] ==> public final var lastEntry: MutableMap.MutableEntry<K, V>? defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'itemIndex' @ [200:17] ==> public final var itemIndex: Int defined in kotlin.collections.InternalHashCodeMap.iterator.<no name provided>[PropertyDescriptorImpl]

'backingMap' @ [206:28] ==> private final var backingMap: dynamic defined in kotlin.collections.InternalHashCodeMap[PropertyDescriptorImpl]

'hashCode' @ [206:39] ==> value-parameter hashCode: Int defined in kotlin.collections.InternalHashCodeMap.getChainOrEntryOrNull[ValueParameterDescriptorImpl]

'if (chainOrEntry === undefined) null else chainOrEntry' @ [207:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'chainOrEntry' @ [207:20] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.getChainOrEntryOrNull[LocalVariableDescriptor]

'undefined' @ [207:37] ==> public external val undefined: Nothing? defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'chainOrEntry' @ [207:58] ==> val chainOrEntry: dynamic defined in kotlin.collections.InternalHashCodeMap.getChainOrEntryOrNull[LocalVariableDescriptor]

