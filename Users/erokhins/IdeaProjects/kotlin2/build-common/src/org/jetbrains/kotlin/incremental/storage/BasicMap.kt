'LazyStorage' @ [31:29] ==> public constructor LazyStorage<K, V>(storageFile: File, keyDescriptor: KeyDescriptor<K>, valueExternalizer: DataExternalizer<V>) defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'storageFile' @ [31:41] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.storage.BasicMap.<init>[ValueParameterDescriptorImpl]

'keyDescriptor' @ [31:54] ==> value-parameter keyDescriptor: KeyDescriptor<K> defined in org.jetbrains.kotlin.incremental.storage.BasicMap.<init>[ValueParameterDescriptorImpl]

'valueExternalizer' @ [31:69] ==> value-parameter valueExternalizer: DataExternalizer<V> defined in org.jetbrains.kotlin.incremental.storage.BasicMap.<init>[ValueParameterDescriptorImpl]

'storage' @ [34:9] ==> protected final val storage: LazyStorage<K, V> defined in org.jetbrains.kotlin.incremental.storage.BasicMap[PropertyDescriptorImpl]

'clean' @ [34:17] ==> @Synchronized public final fun clean(): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'storage' @ [38:9] ==> protected final val storage: LazyStorage<K, V> defined in org.jetbrains.kotlin.incremental.storage.BasicMap[PropertyDescriptorImpl]

'flush' @ [38:17] ==> @Synchronized public final fun flush(memoryCachesOnly: Boolean): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'memoryCachesOnly' @ [38:23] ==> value-parameter memoryCachesOnly: Boolean defined in org.jetbrains.kotlin.incremental.storage.BasicMap.flush[ValueParameterDescriptorImpl]

'storage' @ [42:9] ==> protected final val storage: LazyStorage<K, V> defined in org.jetbrains.kotlin.incremental.storage.BasicMap[PropertyDescriptorImpl]

'close' @ [42:17] ==> @Synchronized public final fun close(): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'TestOnly' @ [45:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'with' @ [47:16] ==> @InlineOnly public inline fun <T, R> with(receiver: StringBuilder /* = StringBuilder */, block: StringBuilder /* = StringBuilder */.() -> StringBuilder /* = StringBuilder */): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder
    <R> -> StringBuilder

'StringBuilder' @ [47:21] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'with' @ [48:13] ==> @InlineOnly public inline fun <T, R> with(receiver: Printer, block: Printer.() -> Printer): Printer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Printer
    <R> -> Printer

'Printer' @ [48:18] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'this' @ [48:26] ==> <this> defined in org.jetbrains.kotlin.incremental.storage.BasicMap.dump.<anonymous>[ReceiverParameterDescriptorImpl]

'println' @ [49:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this@BasicMap' @ [49:25] ==> <this> defined in org.jetbrains.kotlin.incremental.storage.BasicMap[LazyClassReceiverParameterDescriptor]

'java' @ [49:46] ==> public val <T> KClass<out BasicMap<K, V>>.java: Class<out BasicMap<K, V>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BasicMap<K, V>

'simpleName' @ [49:51] ==> public final val <T : (Any..Any?)> Class<out BasicMap<K, V>>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BasicMap<K, V>

'pushIndent' @ [50:17] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'storage' @ [52:29] ==> protected final val storage: LazyStorage<K, V> defined in org.jetbrains.kotlin.incremental.storage.BasicMap[PropertyDescriptorImpl]

'keys' @ [52:37] ==> public final val keys: Collection<K> defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[PropertyDescriptorImpl]

'sorted' @ [52:42] ==> public fun <T : Comparable<K>> Iterable<K>.sorted(): List<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> K

'println' @ [53:21] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'dumpKey' @ [53:32] ==> @TestOnly protected abstract fun dumpKey(key: K): String defined in org.jetbrains.kotlin.incremental.storage.BasicMap[SimpleFunctionDescriptorImpl]

'key' @ [53:40] ==> val key: K defined in org.jetbrains.kotlin.incremental.storage.BasicMap.dump.<anonymous>.<anonymous>[LocalVariableDescriptor]

'dumpValue' @ [53:51] ==> @TestOnly protected abstract fun dumpValue(value: V): String defined in org.jetbrains.kotlin.incremental.storage.BasicMap[SimpleFunctionDescriptorImpl]

'storage' @ [53:61] ==> protected final val storage: LazyStorage<K, V> defined in org.jetbrains.kotlin.incremental.storage.BasicMap[PropertyDescriptorImpl]

'key' @ [53:69] ==> val key: K defined in org.jetbrains.kotlin.incremental.storage.BasicMap.dump.<anonymous>.<anonymous>[LocalVariableDescriptor]

'popIndent' @ [56:17] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [59:13] ==> <this> defined in org.jetbrains.kotlin.incremental.storage.BasicMap.dump.<anonymous>[ReceiverParameterDescriptorImpl]

'toString' @ [60:11] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'TestOnly' @ [63:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'TestOnly' @ [66:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'BasicMap<String, V>' @ [74:5] ==> public constructor BasicMap<K : Comparable<String>, V>(storageFile: File, keyDescriptor: KeyDescriptor<String>, valueExternalizer: DataExternalizer<V>) defined in org.jetbrains.kotlin.incremental.storage.BasicMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K : Comparable<K>> -> String
    <V> -> V

'storageFile' @ [74:25] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap.<init>[ValueParameterDescriptorImpl]

'keyDescriptor' @ [74:38] ==> value-parameter keyDescriptor: KeyDescriptor<String> defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap.<init>[ValueParameterDescriptorImpl]

'valueExternalizer' @ [74:53] ==> value-parameter valueExternalizer: DataExternalizer<V> defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap.<init>[ValueParameterDescriptorImpl]

'this' @ [78:9] ==> public constructor BasicStringMap<V>(storageFile: File, keyDescriptor: KeyDescriptor<String>, valueExternalizer: DataExternalizer<V>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> V

'storageFile' @ [78:14] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [78:54] ==> public final val INSTANCE: (EnumeratorStringDescriptor..EnumeratorStringDescriptor?) defined in com.intellij.util.io.EnumeratorStringDescriptor[JavaPropertyDescriptor]

'valueExternalizer' @ [78:64] ==> value-parameter valueExternalizer: DataExternalizer<V> defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap.<init>[ValueParameterDescriptorImpl]

'key' @ [80:49] ==> value-parameter key: String defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap.dumpKey[ValueParameterDescriptorImpl]

