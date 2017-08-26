'packageFqName2Parts' @ [27:16] ==> public final val packageFqName2Parts: Map<String, PackageParts> defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[PropertyDescriptorImpl]

'packageFqName' @ [27:36] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.findPackageParts[ValueParameterDescriptorImpl]

'debugName' @ [30:31] ==> private final val debugName: String defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[PropertyDescriptorImpl]

'JvmField' @ [33:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [36:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ModuleMapping' @ [37:36] ==> private constructor ModuleMapping(packageFqName2Parts: Map<String, PackageParts>, debugName: String) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[ClassConstructorDescriptorImpl]

'emptyMap' @ [37:50] ==> public fun <K, V> emptyMap(): Map<String, PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PackageParts

'JvmField' @ [39:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ModuleMapping' @ [40:40] ==> private constructor ModuleMapping(packageFqName2Parts: Map<String, PackageParts>, debugName: String) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[ClassConstructorDescriptorImpl]

'emptyMap' @ [40:54] ==> public fun <K, V> emptyMap(): Map<String, PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PackageParts

'bytes' @ [47:17] ==> value-parameter bytes: ByteArray? defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[ValueParameterDescriptorImpl]

'EMPTY' @ [48:24] ==> @JvmField public final val EMPTY: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[PropertyDescriptorImpl]

'DataInputStream' @ [51:26] ==> public constructor DataInputStream(p0: (InputStream..InputStream?)) defined in java.io.DataInputStream[JavaClassConstructorDescriptor]

'ByteArrayInputStream' @ [51:42] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'bytes' @ [51:63] ==> value-parameter bytes: ByteArray? defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[ValueParameterDescriptorImpl]

'IntArray' @ [54:17] ==> public constructor IntArray(size: Int, init: (Int) -> Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'stream' @ [54:26] ==> val stream: DataInputStream defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'readInt' @ [54:33] ==> public final fun readInt(): Int defined in java.io.DataInputStream[JavaMethodDescriptor]

'stream' @ [54:46] ==> val stream: DataInputStream defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'readInt' @ [54:53] ==> public final fun readInt(): Int defined in java.io.DataInputStream[JavaMethodDescriptor]

'CORRUPTED' @ [57:24] ==> @JvmField public final val CORRUPTED: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[PropertyDescriptorImpl]

'JvmMetadataVersion' @ [60:27] ==> public constructor JvmMetadataVersion(vararg numbers: Int) defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[ClassConstructorDescriptorImpl]

'versionNumber' @ [60:47] ==> val versionNumber: IntArray defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'if (configuration.skipMetadataVersionCheck || version.isCompatible()) {
                val table = JvmPackageTable.PackageTable.parseFrom(stream) ?: return EMPTY
                val result = linkedMapOf<String, PackageParts>()

                for (proto in table.packagePartsList) {
                    val packageParts = result.getOrPut(proto.packageFqName) { PackageParts(proto.packageFqName) }
                    for ((index, partShortName) in proto.classNameList.withIndex()) {
                        val multifileFacadeId = proto.multifileFacadeIdList.getOrNull(index)?.minus(1)
                        packageParts.addPart(partShortName, multifileFacadeId?.let(proto.multifileFacadeNameList::getOrNull))
                    }
                }

                for (proto in table.metadataPartsList) {
                    val packageParts = result.getOrPut(proto.packageFqName) { PackageParts(proto.packageFqName) }
                    proto.classNameList.forEach(packageParts::addMetadataPart)
                }

                return ModuleMapping(result, debugName)
            }
            else {
                // TODO: consider reporting "incompatible ABI version" error for package parts
            }' @ [62:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'configuration' @ [62:17] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[ValueParameterDescriptorImpl]

'skipMetadataVersionCheck' @ [62:31] ==> public open val skipMetadataVersionCheck: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[PropertyDescriptorImpl]

'version' @ [62:59] ==> val version: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'isCompatible' @ [62:67] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[SimpleFunctionDescriptorImpl]

'?:' @ [63:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JvmPackageTable.PackageTable?, right: JvmPackageTable.PackageTable): JvmPackageTable.PackageTable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PackageTable

'parseFrom' @ [63:58] ==> public open fun parseFrom(input: (InputStream..InputStream?)): (JvmPackageTable.PackageTable..JvmPackageTable.PackageTable?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable[JavaMethodDescriptor]

'stream' @ [63:68] ==> val stream: DataInputStream defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'EMPTY' @ [63:86] ==> @JvmField public final val EMPTY: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[PropertyDescriptorImpl]

'linkedMapOf' @ [64:30] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, PackageParts> /* = LinkedHashMap<String, PackageParts> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PackageParts

'table' @ [66:31] ==> val table: JvmPackageTable.PackageTable defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'packagePartsList' @ [66:37] ==> public final val JvmPackageTable.PackageTable.packagePartsList: (MutableList<(JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?)>..List<(JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?)>?)[MyPropertyDescriptor]

'result' @ [67:40] ==> val result: LinkedHashMap<String, PackageParts> /* = LinkedHashMap<String, PackageParts> */ defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'getOrPut' @ [67:47] ==> public inline fun <K, V> MutableMap<String, PackageParts>.getOrPut(key: String, defaultValue: () -> PackageParts): PackageParts defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PackageParts

'proto' @ [67:56] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'packageFqName' @ [67:62] ==> public final val JvmPackageTable.PackageParts.packageFqName: (String..String?)[MyPropertyDescriptor]

'PackageParts' @ [67:79] ==> public constructor PackageParts(packageFqName: String) defined in org.jetbrains.kotlin.load.kotlin.PackageParts[ClassConstructorDescriptorImpl]

'proto' @ [67:92] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'packageFqName' @ [67:98] ==> public final val JvmPackageTable.PackageParts.packageFqName: (String..String?)[MyPropertyDescriptor]

'component1' @ [68:27] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [68:34] ==> public final operator fun component2(): (String..String?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'proto' @ [68:52] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'classNameList' @ [68:58] ==> public final val JvmPackageTable.PackageParts.classNameList: (ProtocolStringList..ProtocolStringList?)[MyPropertyDescriptor]

'withIndex' @ [68:72] ==> public fun <T> Iterable<(String..String?)>.withIndex(): Iterable<IndexedValue<(String..String?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'proto' @ [69:49] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'multifileFacadeIdList' @ [69:55] ==> public final val JvmPackageTable.PackageParts.multifileFacadeIdList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'getOrNull' @ [69:77] ==> public fun <T> List<(Int..Int?)>.getOrNull(index: Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'index' @ [69:87] ==> val index: Int defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'minus' @ [69:95] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'packageParts' @ [70:25] ==> val packageParts: PackageParts defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'addPart' @ [70:38] ==> public final fun addPart(partShortName: String, facadeShortName: String?): Unit defined in org.jetbrains.kotlin.load.kotlin.PackageParts[SimpleFunctionDescriptorImpl]

'partShortName' @ [70:46] ==> val partShortName: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'multifileFacadeId' @ [70:61] ==> val multifileFacadeId: Int? defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'let' @ [70:80] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String?

'proto' @ [70:84] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'multifileFacadeNameList' @ [70:90] ==> public final val JvmPackageTable.PackageParts.multifileFacadeNameList: (ProtocolStringList..ProtocolStringList?)[MyPropertyDescriptor]

'table' @ [74:31] ==> val table: JvmPackageTable.PackageTable defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'metadataPartsList' @ [74:37] ==> public final val JvmPackageTable.PackageTable.metadataPartsList: (MutableList<(JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?)>..List<(JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?)>?)[MyPropertyDescriptor]

'result' @ [75:40] ==> val result: LinkedHashMap<String, PackageParts> /* = LinkedHashMap<String, PackageParts> */ defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'getOrPut' @ [75:47] ==> public inline fun <K, V> MutableMap<String, PackageParts>.getOrPut(key: String, defaultValue: () -> PackageParts): PackageParts defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PackageParts

'proto' @ [75:56] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'packageFqName' @ [75:62] ==> public final val JvmPackageTable.PackageParts.packageFqName: (String..String?)[MyPropertyDescriptor]

'PackageParts' @ [75:79] ==> public constructor PackageParts(packageFqName: String) defined in org.jetbrains.kotlin.load.kotlin.PackageParts[ClassConstructorDescriptorImpl]

'proto' @ [75:92] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'packageFqName' @ [75:98] ==> public final val JvmPackageTable.PackageParts.packageFqName: (String..String?)[MyPropertyDescriptor]

'proto' @ [76:21] ==> val proto: (JvmPackageTable.PackageParts..JvmPackageTable.PackageParts?) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'classNameList' @ [76:27] ==> public final val JvmPackageTable.PackageParts.classNameList: (ProtocolStringList..ProtocolStringList?)[MyPropertyDescriptor]

'forEach' @ [76:41] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'packageParts' @ [76:49] ==> val packageParts: PackageParts defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'ModuleMapping' @ [79:24] ==> private constructor ModuleMapping(packageFqName2Parts: Map<String, PackageParts>, debugName: String) defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[ClassConstructorDescriptorImpl]

'result' @ [79:38] ==> val result: LinkedHashMap<String, PackageParts> /* = LinkedHashMap<String, PackageParts> */ defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[LocalVariableDescriptor]

'debugName' @ [79:46] ==> value-parameter debugName: String defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion.create[ValueParameterDescriptorImpl]

'EMPTY' @ [85:20] ==> @JvmField public final val EMPTY: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[PropertyDescriptorImpl]

'linkedMapOf' @ [92:32] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String?

'packageParts' @ [95:36] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'keys' @ [95:49] ==> public open val keys: MutableSet<String> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'linkedSetOf' @ [97:38] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'packageParts' @ [100:9] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'partShortName' @ [100:22] ==> value-parameter partShortName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addPart[ValueParameterDescriptorImpl]

'facadeShortName' @ [100:39] ==> value-parameter facadeShortName: String? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addPart[ValueParameterDescriptorImpl]

'packageParts' @ [104:9] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'remove' @ [104:22] ==> public open fun remove(key: String): String? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'shortName' @ [104:29] ==> value-parameter shortName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.removePart[ValueParameterDescriptorImpl]

'metadataParts' @ [108:10] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'add' @ [108:58] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'shortName' @ [108:62] ==> value-parameter shortName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addMetadataPart[ValueParameterDescriptorImpl]

'parts' @ [112:13] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'isNotEmpty' @ [112:19] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'builder' @ [113:13] ==> value-parameter builder: JvmPackageTable.PackageTable.Builder defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo[ValueParameterDescriptorImpl]

'addPackageParts' @ [113:21] ==> public open fun addPackageParts(builderForValue: (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?)): (JvmPackageTable.PackageTable.Builder..JvmPackageTable.PackageTable.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable.Builder[JavaMethodDescriptor]

'newBuilder' @ [113:66] ==> public open fun newBuilder(): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts[JavaMethodDescriptor]

'apply' @ [113:79] ==> @InlineOnly public inline fun <T> (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?).apply(block: (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?).() -> Unit): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder..org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder?)

'packageFqName' @ [114:17] ==> public final var JvmPackageTable.PackageParts.Builder.packageFqName: (String..String?)[MyPropertyDescriptor]

'this@PackageParts' @ [114:33] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[LazyClassReceiverParameterDescriptor]

'packageFqName' @ [114:51] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'mutableMapOf' @ [116:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'component1' @ [117:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String?, (List<String>..List<String>?)>.component1(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String?
    <V> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'component2' @ [117:35] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String?, (List<String>..List<String>?)>.component2(): (List<String>..List<String>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String?
    <V> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'parts' @ [117:49] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'groupBy' @ [117:55] ==> public inline fun <T, K> Iterable<String>.groupBy(keySelector: (String) -> String?): Map<String?, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> String?

'getMultifileFacadeName' @ [117:65] ==> public final fun getMultifileFacadeName(partShortName: String): String? defined in org.jetbrains.kotlin.load.kotlin.PackageParts[SimpleFunctionDescriptorImpl]

'it' @ [117:88] ==> value-parameter it: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toSortedMap' @ [117:94] ==> public fun <K, V> Map<out String?, List<String>>.toSortedMap(comparator: Comparator<in String?>): SortedMap<String?, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String?
    <V> -> List<String>

'nullsLast' @ [117:106] ==> @InlineOnly public inline fun <T : Comparable<String>> nullsLast(): Comparator<String?> /* = Comparator<String?> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'partNames' @ [118:38] ==> val partNames: (List<String>..List<String>?) defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'sorted' @ [118:48] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'addClassName' @ [119:25] ==> public open fun addClassName(value: (String..String?)): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder[JavaMethodDescriptor]

'partName' @ [119:38] ==> val partName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'facadeName' @ [120:29] ==> val facadeName: String? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'addMultifileFacadeId' @ [121:29] ==> public open fun addMultifileFacadeId(value: Int): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder[JavaMethodDescriptor]

'+' @ [121:50] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'facadeNameToId' @ [121:54] ==> val facadeNameToId: MutableMap<String, Int> defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'getOrPut' @ [121:69] ==> public inline fun <K, V> MutableMap<String, Int>.getOrPut(key: String, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'facadeName' @ [121:78] ==> val facadeName: String? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'facadeNameToId' @ [121:92] ==> val facadeNameToId: MutableMap<String, Int> defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'size' @ [121:107] ==> public abstract val size: Int defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'component1' @ [126:23] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [126:33] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'facadeNameToId' @ [126:48] ==> val facadeNameToId: MutableMap<String, Int> defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'values' @ [126:63] ==> public abstract val values: MutableCollection<Int> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'zip' @ [126:70] ==> public infix fun <T, R> Iterable<Int>.zip(other: Iterable<String>): List<Pair<Int, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'facadeNameToId' @ [126:74] ==> val facadeNameToId: MutableMap<String, Int> defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'keys' @ [126:89] ==> public abstract val keys: MutableSet<String> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'sortedBy' @ [126:95] ==> public inline fun <T, R : Comparable<Int>> Iterable<Pair<Int, String>>.sortedBy(crossinline selector: (Pair<Int, String>) -> Int?): List<Pair<Int, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, String>
    <R : Comparable<R>> -> Int

'Pair' @ [126:104] ==> public constructor Pair<out A, out B>(first: Nothing, second: Nothing) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Nothing
    <out B> -> Nothing

'assert' @ [127:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'facadeId' @ [127:28] ==> val facadeId: Int defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'multifileFacadeNameCount' @ [127:40] ==> public final val JvmPackageTable.PackageParts.Builder.multifileFacadeNameCount: Int[MyPropertyDescriptor]

'facadeNameToId' @ [127:112] ==> val facadeNameToId: MutableMap<String, Int> defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'addMultifileFacadeName' @ [128:21] ==> public open fun addMultifileFacadeName(value: (String..String?)): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder[JavaMethodDescriptor]

'facadeName' @ [128:44] ==> val facadeName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo.<anonymous>[LocalVariableDescriptor]

'metadataParts' @ [133:13] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'isNotEmpty' @ [133:27] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'builder' @ [134:13] ==> value-parameter builder: JvmPackageTable.PackageTable.Builder defined in org.jetbrains.kotlin.load.kotlin.PackageParts.addTo[ValueParameterDescriptorImpl]

'addMetadataParts' @ [134:21] ==> public open fun addMetadataParts(builderForValue: (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?)): (JvmPackageTable.PackageTable.Builder..JvmPackageTable.PackageTable.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable.Builder[JavaMethodDescriptor]

'newBuilder' @ [134:67] ==> public open fun newBuilder(): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts[JavaMethodDescriptor]

'apply' @ [134:80] ==> @InlineOnly public inline fun <T> (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?).apply(block: (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?).() -> Unit): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder..org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder?)

'packageFqName' @ [135:17] ==> public final var JvmPackageTable.PackageParts.Builder.packageFqName: (String..String?)[MyPropertyDescriptor]

'this@PackageParts' @ [135:33] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[LazyClassReceiverParameterDescriptor]

'packageFqName' @ [135:51] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'addAllClassName' @ [136:17] ==> public open fun addAllClassName(values: (MutableIterable<(String..String?)>..Iterable<(String..String?)>?)): (JvmPackageTable.PackageParts.Builder..JvmPackageTable.PackageParts.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageParts.Builder[JavaMethodDescriptor]

'metadataParts' @ [136:33] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'sorted' @ [136:47] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'packageParts' @ [141:66] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'partShortName' @ [141:79] ==> value-parameter partShortName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.getMultifileFacadeName[ValueParameterDescriptorImpl]

'component1' @ [144:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String?>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String?

'component2' @ [144:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String?>.component2(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String?

'other' @ [144:50] ==> value-parameter other: PackageParts defined in org.jetbrains.kotlin.load.kotlin.PackageParts.plusAssign[ValueParameterDescriptorImpl]

'packageParts' @ [144:56] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'addPart' @ [145:13] ==> public final fun addPart(partShortName: String, facadeShortName: String?): Unit defined in org.jetbrains.kotlin.load.kotlin.PackageParts[SimpleFunctionDescriptorImpl]

'partShortName' @ [145:21] ==> val partShortName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts.plusAssign[LocalVariableDescriptor]

'facadeShortName' @ [145:36] ==> val facadeShortName: String? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.plusAssign[LocalVariableDescriptor]

'other' @ [147:9] ==> value-parameter other: PackageParts defined in org.jetbrains.kotlin.load.kotlin.PackageParts.plusAssign[ValueParameterDescriptorImpl]

'metadataParts' @ [147:15] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'forEach' @ [147:29] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'this' @ [147:37] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[LazyClassReceiverParameterDescriptor]

'other' @ [151:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.equals[ValueParameterDescriptorImpl]

'other' @ [152:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.equals[ValueParameterDescriptorImpl]

'packageFqName' @ [152:19] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'packageFqName' @ [152:36] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'other' @ [152:53] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.equals[ValueParameterDescriptorImpl]

'packageParts' @ [152:59] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'packageParts' @ [152:75] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'other' @ [152:91] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.kotlin.PackageParts.equals[ValueParameterDescriptorImpl]

'metadataParts' @ [152:97] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'metadataParts' @ [152:114] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'*' @ [155:13] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [155:14] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'hashCode' @ [155:28] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'packageParts' @ [155:46] ==> private final val packageParts: LinkedHashMap<String, String?> /* = LinkedHashMap<String, String?> */ defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'hashCode' @ [155:59] ==> public open fun hashCode(): Int defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'metadataParts' @ [155:78] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'hashCode' @ [155:92] ==> public open fun hashCode(): Int defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'parts' @ [158:14] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'metadataParts' @ [158:22] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[PropertyDescriptorImpl]

'toString' @ [158:37] ==> public open fun toString(): String defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

