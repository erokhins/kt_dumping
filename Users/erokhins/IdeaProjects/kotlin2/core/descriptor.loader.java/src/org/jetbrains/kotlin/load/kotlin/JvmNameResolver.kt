'types' @ [32:36] ==> private final val types: JvmProtoBuf.StringTableTypes defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[PropertyDescriptorImpl]

'localNameList' @ [32:42] ==> public final val JvmProtoBuf.StringTableTypes.localNameList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'run' @ [32:56] ==> @InlineOnly public inline fun <T, R> (MutableList<(Int..Int?)>..List<(Int..Int?)>?).run(block: (MutableList<(Int..Int?)>..List<(Int..Int?)>?).() -> Set<(Int..Int?)>): Set<(Int..Int?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(kotlin.Int..kotlin.Int?)>..kotlin.collections.List<(kotlin.Int..kotlin.Int?)>?)
    <R> -> Set<(kotlin.Int..kotlin.Int?)>

'if (isEmpty()) emptySet() else toSet()' @ [32:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<(Int..Int?)>, elseBranch: Set<(Int..Int?)>): Set<(Int..Int?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<(kotlin.Int..kotlin.Int?)>

'isEmpty' @ [32:66] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'emptySet' @ [32:77] ==> public fun <T> emptySet(): Set<(Int..Int?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'toSet' @ [32:93] ==> public fun <T> Iterable<(Int..Int?)>.toSet(): Set<(Int..Int?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'ArrayList' @ [35:41] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Record

'apply' @ [35:61] ==> @InlineOnly public inline fun <T> ArrayList<JvmProtoBuf.StringTableTypes.Record>.apply(block: ArrayList<JvmProtoBuf.StringTableTypes.Record>.() -> Unit): ArrayList<JvmProtoBuf.StringTableTypes.Record> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<Record>

'types' @ [36:23] ==> private final val types: JvmProtoBuf.StringTableTypes defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[PropertyDescriptorImpl]

'recordList' @ [36:29] ==> public final val JvmProtoBuf.StringTableTypes.recordList: (MutableList<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>..List<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>?)[MyPropertyDescriptor]

'this' @ [37:9] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.records.<anonymous>[ReceiverParameterDescriptorImpl]

'ensureCapacity' @ [37:14] ==> public open fun ensureCapacity(p0: Int): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'records' @ [37:29] ==> val records: (MutableList<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>..List<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.records.<anonymous>[LocalVariableDescriptor]

'size' @ [37:37] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'records' @ [38:24] ==> val records: (MutableList<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>..List<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.records.<anonymous>[LocalVariableDescriptor]

'repeat' @ [39:13] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'record' @ [39:20] ==> val record: (JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.records.<anonymous>[LocalVariableDescriptor]

'range' @ [39:27] ==> public final val JvmProtoBuf.StringTableTypes.Record.range: Int[MyPropertyDescriptor]

'this' @ [40:17] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.records.<anonymous>[ReceiverParameterDescriptorImpl]

'add' @ [40:22] ==> public open fun add(element: JvmProtoBuf.StringTableTypes.Record): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'record' @ [40:26] ==> val record: (JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.records.<anonymous>[LocalVariableDescriptor]

'this' @ [43:9] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.records.<anonymous>[ReceiverParameterDescriptorImpl]

'trimToSize' @ [43:14] ==> public open fun trimToSize(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'records' @ [47:22] ==> private final val records: List<JvmProtoBuf.StringTableTypes.Record> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[PropertyDescriptorImpl]

'index' @ [47:30] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[ValueParameterDescriptorImpl]

'when {
            record.hasString() -> record.string
            record.hasPredefinedIndex() && record.predefinedIndex in PREDEFINED_STRINGS.indices ->
                PREDEFINED_STRINGS[record.predefinedIndex]
            else -> strings[index]
        }' @ [49:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?), entry2: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'record' @ [50:13] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'hasString' @ [50:20] ==> public open fun hasString(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record[JavaMethodDescriptor]

'record' @ [50:35] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'string' @ [50:42] ==> public final val JvmProtoBuf.StringTableTypes.Record.string: (String..String?)[MyPropertyDescriptor]

'record' @ [51:13] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'hasPredefinedIndex' @ [51:20] ==> public open fun hasPredefinedIndex(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record[JavaMethodDescriptor]

'record' @ [51:44] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'predefinedIndex' @ [51:51] ==> public final val JvmProtoBuf.StringTableTypes.Record.predefinedIndex: Int[MyPropertyDescriptor]

'PREDEFINED_STRINGS' @ [51:70] ==> public final val PREDEFINED_STRINGS: List<String> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion[PropertyDescriptorImpl]

'indices' @ [51:89] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'PREDEFINED_STRINGS' @ [52:17] ==> public final val PREDEFINED_STRINGS: List<String> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion[PropertyDescriptorImpl]

'record' @ [52:36] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'predefinedIndex' @ [52:43] ==> public final val JvmProtoBuf.StringTableTypes.Record.predefinedIndex: Int[MyPropertyDescriptor]

'strings' @ [53:21] ==> private final val strings: Array<String> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[PropertyDescriptorImpl]

'index' @ [53:29] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[ValueParameterDescriptorImpl]

'record' @ [56:13] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'substringIndexCount' @ [56:20] ==> public final val JvmProtoBuf.StringTableTypes.Record.substringIndexCount: Int[MyPropertyDescriptor]

'component1' @ [57:18] ==> @InlineOnly public operator inline fun <T> List<(Int..Int?)>.component1(): (Int..Int?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'component2' @ [57:25] ==> @InlineOnly public operator inline fun <T> List<(Int..Int?)>.component2(): (Int..Int?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'record' @ [57:32] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'substringIndexList' @ [57:39] ==> public final val JvmProtoBuf.StringTableTypes.Record.substringIndexList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'<=' @ [58:17] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'begin' @ [58:22] ==> val begin: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'begin' @ [58:31] ==> val begin: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'end' @ [58:40] ==> val end: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'end' @ [58:47] ==> val end: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'string' @ [58:54] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'length' @ [58:61] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'string' @ [59:17] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'string' @ [59:26] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'substring' @ [59:33] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'begin' @ [59:43] ==> val begin: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'end' @ [59:50] ==> val end: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'record' @ [63:13] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'replaceCharCount' @ [63:20] ==> public final val JvmProtoBuf.StringTableTypes.Record.replaceCharCount: Int[MyPropertyDescriptor]

'component1' @ [64:18] ==> @InlineOnly public operator inline fun <T> List<(Int..Int?)>.component1(): (Int..Int?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'component2' @ [64:24] ==> @InlineOnly public operator inline fun <T> List<(Int..Int?)>.component2(): (Int..Int?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'record' @ [64:30] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'replaceCharList' @ [64:37] ==> public final val JvmProtoBuf.StringTableTypes.Record.replaceCharList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'string' @ [65:13] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'string' @ [65:22] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'replace' @ [65:29] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'from' @ [65:37] ==> val from: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'toChar' @ [65:42] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'to' @ [65:52] ==> val to: (Int..Int?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'toChar' @ [65:55] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'when (record.operation ?: NONE) {
            NONE -> {
                // Do nothing
            }
            INTERNAL_TO_CLASS_ID -> {
                string = string.replace('$', '.')
            }
            DESC_TO_CLASS_ID -> {
                if (string.length >= 2) {
                    string = string.substring(1, string.length - 1)
                }
                string = string.replace('$', '.')
            }
        }' @ [68:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'record' @ [68:15] ==> val record: JvmProtoBuf.StringTableTypes.Record defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'operation' @ [68:22] ==> public final val JvmProtoBuf.StringTableTypes.Record.operation: (JvmProtoBuf.StringTableTypes.Record.Operation..JvmProtoBuf.StringTableTypes.Record.Operation?)[MyPropertyDescriptor]

'NONE' @ [68:35] ==> enum entry NONE defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Operation[FakeCallableDescriptorForObject]

'NONE' @ [69:13] ==> enum entry NONE defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Operation[FakeCallableDescriptorForObject]

'INTERNAL_TO_CLASS_ID' @ [72:13] ==> enum entry INTERNAL_TO_CLASS_ID defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Operation[FakeCallableDescriptorForObject]

'string' @ [73:17] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'string' @ [73:26] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'replace' @ [73:33] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DESC_TO_CLASS_ID' @ [75:13] ==> enum entry DESC_TO_CLASS_ID defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Operation[FakeCallableDescriptorForObject]

'string' @ [76:21] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'length' @ [76:28] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'string' @ [77:21] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'string' @ [77:30] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'substring' @ [77:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'string' @ [77:50] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'length' @ [77:57] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'string' @ [79:17] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'string' @ [79:26] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'replace' @ [79:33] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'string' @ [83:16] ==> var string: (String..String?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getString[LocalVariableDescriptor]

'guessByFirstCharacter' @ [86:45] ==> @NotNull public open fun guessByFirstCharacter(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getString' @ [86:67] ==> public open fun getString(index: Int): String defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[SimpleFunctionDescriptorImpl]

'index' @ [86:77] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getName[ValueParameterDescriptorImpl]

'getString' @ [89:22] ==> public open fun getString(index: Int): String defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[SimpleFunctionDescriptorImpl]

'index' @ [89:32] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[ValueParameterDescriptorImpl]

'string' @ [90:25] ==> val string: String defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'lastIndexOf' @ [90:32] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (lastSlash < 0) FqName.ROOT
                else FqName(string.substring(0, lastSlash).replace('/', '.'))' @ [92:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (FqName..FqName?), elseBranch: (FqName..FqName?)): (FqName..FqName?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'lastSlash' @ [92:21] ==> val lastSlash: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'ROOT' @ [92:43] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'FqName' @ [93:22] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'string' @ [93:29] ==> val string: String defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'substring' @ [93:36] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lastSlash' @ [93:49] ==> val lastSlash: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'replace' @ [93:60] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'FqName' @ [94:25] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'string' @ [94:32] ==> val string: String defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'substring' @ [94:39] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lastSlash' @ [94:49] ==> val lastSlash: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'ClassId' @ [95:16] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: FqName, p2: Boolean) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'packageName' @ [95:24] ==> val packageName: (FqName..FqName?) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'className' @ [95:37] ==> val className: FqName defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[LocalVariableDescriptor]

'index' @ [95:48] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.getClassId[ValueParameterDescriptorImpl]

'localNameIndices' @ [95:57] ==> private final val localNameIndices: Set<(Int..Int?)> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[PropertyDescriptorImpl]

'listOf' @ [99:34] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'PREDEFINED_STRINGS' @ [132:46] ==> public final val PREDEFINED_STRINGS: List<String> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion[PropertyDescriptorImpl]

'withIndex' @ [132:65] ==> public fun <T> Iterable<String>.withIndex(): Iterable<IndexedValue<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'associateBy' @ [132:77] ==> public inline fun <T, K, V> Iterable<IndexedValue<String>>.associateBy(keySelector: (IndexedValue<String>) -> String, valueTransform: (IndexedValue<String>) -> Int): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<String>
    <K> -> String
    <V> -> Int

'it' @ [132:91] ==> value-parameter it: IndexedValue<String> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion.PREDEFINED_STRINGS_MAP.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [132:94] ==> public final val value: String defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'it' @ [132:105] ==> value-parameter it: IndexedValue<String> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion.PREDEFINED_STRINGS_MAP.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [132:108] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'PREDEFINED_STRINGS_MAP' @ [134:62] ==> private final val PREDEFINED_STRINGS_MAP: Map<String, Int> defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion[PropertyDescriptorImpl]

'string' @ [134:85] ==> value-parameter string: String defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion.getPredefinedStringIndex[ValueParameterDescriptorImpl]

