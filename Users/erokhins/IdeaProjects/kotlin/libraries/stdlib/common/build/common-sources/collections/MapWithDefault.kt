'kotlin.jvm.JvmMultifileClass' @ [1:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [13:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'PublishedApi' @ [14:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'this' @ [16:9] ==> <this> defined in kotlin.collections.getOrImplicitDefault[ReceiverParameterDescriptorImpl]

'this' @ [17:16] ==> <this> defined in kotlin.collections.getOrImplicitDefault[ReceiverParameterDescriptorImpl]

'getOrImplicitDefault' @ [17:21] ==> public abstract fun getOrImplicitDefault(key: K): V defined in kotlin.collections.MapWithDefault[SimpleFunctionDescriptorImpl]

'key' @ [17:42] ==> value-parameter key: K defined in kotlin.collections.getOrImplicitDefault[ValueParameterDescriptorImpl]

'getOrElseNullable' @ [19:12] ==> internal inline fun <K, V> Map<K, V>.getOrElseNullable(key: K, defaultValue: () -> V): V defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'key' @ [19:30] ==> value-parameter key: K defined in kotlin.collections.getOrImplicitDefault[ValueParameterDescriptorImpl]

'NoSuchElementException' @ [19:43] ==> public constructor NoSuchElementException(message: String) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'key' @ [19:72] ==> value-parameter key: K defined in kotlin.collections.getOrImplicitDefault[ValueParameterDescriptorImpl]

'when (this) {
            is MapWithDefault -> this.map.withDefault(defaultValue)
            else -> MapWithDefaultImpl(this, defaultValue)
        }' @ [31:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Map<K, V>, entry1: Map<K, V>): Map<K, V>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Map<K, V>

'this' @ [31:15] ==> <this> defined in kotlin.collections.withDefault[ReceiverParameterDescriptorImpl]

'this' @ [32:34] ==> <this> defined in kotlin.collections.withDefault[ReceiverParameterDescriptorImpl]

'map' @ [32:39] ==> public abstract val map: Map<K, V> defined in kotlin.collections.MapWithDefault[PropertyDescriptorImpl]

'withDefault' @ [32:43] ==> public fun <K, V> Map<K, V>.withDefault(defaultValue: (key: K) -> V): Map<K, V> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'defaultValue' @ [32:55] ==> value-parameter defaultValue: (key: K) -> V defined in kotlin.collections.withDefault[ValueParameterDescriptorImpl]

'MapWithDefaultImpl' @ [33:21] ==> public constructor MapWithDefaultImpl<K, out V>(map: Map<K, V>, default: (key: K) -> V) defined in kotlin.collections.MapWithDefaultImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <out V> -> V

'this' @ [33:40] ==> <this> defined in kotlin.collections.withDefault[ReceiverParameterDescriptorImpl]

'defaultValue' @ [33:46] ==> value-parameter defaultValue: (key: K) -> V defined in kotlin.collections.withDefault[ValueParameterDescriptorImpl]

'kotlin.jvm.JvmName' @ [44:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'when (this) {
            is MutableMapWithDefault -> this.map.withDefault(defaultValue)
            else -> MutableMapWithDefaultImpl(this, defaultValue)
        }' @ [46:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MutableMap<K, V>, entry1: MutableMap<K, V>): MutableMap<K, V>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MutableMap<K, V>

'this' @ [46:15] ==> <this> defined in kotlin.collections.withDefault[ReceiverParameterDescriptorImpl]

'this' @ [47:41] ==> <this> defined in kotlin.collections.withDefault[ReceiverParameterDescriptorImpl]

'map' @ [47:46] ==> public abstract val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefault[PropertyDescriptorImpl]

'withDefault' @ [47:50] ==> @JvmName public fun <K, V> MutableMap<K, V>.withDefault(defaultValue: (key: K) -> V): MutableMap<K, V> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'defaultValue' @ [47:62] ==> value-parameter defaultValue: (key: K) -> V defined in kotlin.collections.withDefault[ValueParameterDescriptorImpl]

'MutableMapWithDefaultImpl' @ [48:21] ==> public constructor MutableMapWithDefaultImpl<K, V>(map: MutableMap<K, V>, default: (key: K) -> V) defined in kotlin.collections.MutableMapWithDefaultImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'this' @ [48:47] ==> <this> defined in kotlin.collections.withDefault[ReceiverParameterDescriptorImpl]

'defaultValue' @ [48:53] ==> value-parameter defaultValue: (key: K) -> V defined in kotlin.collections.withDefault[ValueParameterDescriptorImpl]

'map' @ [66:49] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'equals' @ [66:53] ==> public open fun equals(other: Any?): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'other' @ [66:60] ==> value-parameter other: Any? defined in kotlin.collections.MapWithDefaultImpl.equals[ValueParameterDescriptorImpl]

'map' @ [67:36] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'hashCode' @ [67:40] ==> public open fun hashCode(): Int defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'map' @ [68:39] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'toString' @ [68:43] ==> public open fun toString(): String defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'map' @ [69:36] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'size' @ [69:40] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [70:39] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'isEmpty' @ [70:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'map' @ [71:49] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'containsKey' @ [71:53] ==> public abstract fun containsKey(key: K): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'key' @ [71:65] ==> value-parameter key: K defined in kotlin.collections.MapWithDefaultImpl.containsKey[ValueParameterDescriptorImpl]

'UnsafeVariance' @ [72:39] ==> public constructor UnsafeVariance() defined in kotlin.UnsafeVariance[DeserializedClassConstructorDescriptor]

'map' @ [72:69] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'containsValue' @ [72:73] ==> public abstract fun containsValue(value: V): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'value' @ [72:87] ==> value-parameter value: @UnsafeVariance V defined in kotlin.collections.MapWithDefaultImpl.containsValue[ValueParameterDescriptorImpl]

'map' @ [73:36] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'get' @ [73:40] ==> public abstract operator fun get(key: K): V? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'key' @ [73:44] ==> value-parameter key: K defined in kotlin.collections.MapWithDefaultImpl.get[ValueParameterDescriptorImpl]

'map' @ [74:39] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'keys' @ [74:43] ==> public abstract val keys: Set<K> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [75:48] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'values' @ [75:52] ==> public abstract val values: Collection<V> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [76:56] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'entries' @ [76:60] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [78:52] ==> public open val map: Map<K, V> defined in kotlin.collections.MapWithDefaultImpl[PropertyDescriptorImpl]

'getOrElseNullable' @ [78:56] ==> internal inline fun <K, V> Map<K, V>.getOrElseNullable(key: K, defaultValue: () -> V): V defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'key' @ [78:74] ==> value-parameter key: K defined in kotlin.collections.MapWithDefaultImpl.getOrImplicitDefault[ValueParameterDescriptorImpl]

'invoke' @ [78:81] ==> public abstract operator fun invoke(key: @ParameterName K): V defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [78:89] ==> value-parameter key: K defined in kotlin.collections.MapWithDefaultImpl.getOrImplicitDefault[ValueParameterDescriptorImpl]

'map' @ [82:49] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'equals' @ [82:53] ==> public open fun equals(other: Any?): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'other' @ [82:60] ==> value-parameter other: Any? defined in kotlin.collections.MutableMapWithDefaultImpl.equals[ValueParameterDescriptorImpl]

'map' @ [83:36] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'hashCode' @ [83:40] ==> public open fun hashCode(): Int defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'map' @ [84:39] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'toString' @ [84:43] ==> public open fun toString(): String defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'map' @ [85:36] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'size' @ [85:40] ==> public abstract val size: Int defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [86:39] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'isEmpty' @ [86:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'map' @ [87:49] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'containsKey' @ [87:53] ==> public abstract fun containsKey(key: K): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [87:65] ==> value-parameter key: K defined in kotlin.collections.MutableMapWithDefaultImpl.containsKey[ValueParameterDescriptorImpl]

'UnsafeVariance' @ [88:39] ==> public constructor UnsafeVariance() defined in kotlin.UnsafeVariance[DeserializedClassConstructorDescriptor]

'map' @ [88:69] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'containsValue' @ [88:73] ==> public abstract fun containsValue(value: V): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'value' @ [88:87] ==> value-parameter value: @UnsafeVariance V defined in kotlin.collections.MutableMapWithDefaultImpl.containsValue[ValueParameterDescriptorImpl]

'map' @ [89:36] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'get' @ [89:40] ==> public abstract fun get(key: K): V? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [89:44] ==> value-parameter key: K defined in kotlin.collections.MutableMapWithDefaultImpl.get[ValueParameterDescriptorImpl]

'map' @ [90:46] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'keys' @ [90:50] ==> public abstract val keys: MutableSet<K> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [91:55] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'values' @ [91:59] ==> public abstract val values: MutableCollection<V> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [92:77] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'entries' @ [92:81] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [94:46] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'put' @ [94:50] ==> public abstract fun put(key: K, value: V): V? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [94:54] ==> value-parameter key: K defined in kotlin.collections.MutableMapWithDefaultImpl.put[ValueParameterDescriptorImpl]

'value' @ [94:59] ==> value-parameter value: V defined in kotlin.collections.MutableMapWithDefaultImpl.put[ValueParameterDescriptorImpl]

'map' @ [95:39] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'remove' @ [95:43] ==> public abstract fun remove(key: K): V? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [95:50] ==> value-parameter key: K defined in kotlin.collections.MutableMapWithDefaultImpl.remove[ValueParameterDescriptorImpl]

'map' @ [96:48] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'putAll' @ [96:52] ==> public abstract fun putAll(from: Map<out K, V>): Unit defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'from' @ [96:59] ==> value-parameter from: Map<out K, V> defined in kotlin.collections.MutableMapWithDefaultImpl.putAll[ValueParameterDescriptorImpl]

'map' @ [97:28] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'clear' @ [97:32] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'map' @ [99:52] ==> public open val map: MutableMap<K, V> defined in kotlin.collections.MutableMapWithDefaultImpl[PropertyDescriptorImpl]

'getOrElseNullable' @ [99:56] ==> internal inline fun <K, V> Map<K, V>.getOrElseNullable(key: K, defaultValue: () -> V): V defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'key' @ [99:74] ==> value-parameter key: K defined in kotlin.collections.MutableMapWithDefaultImpl.getOrImplicitDefault[ValueParameterDescriptorImpl]

'invoke' @ [99:81] ==> public abstract operator fun invoke(key: @ParameterName K): V defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [99:89] ==> value-parameter key: K defined in kotlin.collections.MutableMapWithDefaultImpl.getOrImplicitDefault[ValueParameterDescriptorImpl]

