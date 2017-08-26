'ArrayList' @ [35:19] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'ArrayList' @ [36:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Builder

'HashMap' @ [37:23] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Int

'HashSet' @ [38:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'map' @ [41:13] ==> private final val map: HashMap<String, Int> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'getOrPut' @ [41:17] ==> public inline fun <K, V> MutableMap<String, Int>.getOrPut(key: String, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'string' @ [41:26] ==> value-parameter string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getStringIndex[ValueParameterDescriptorImpl]

'strings' @ [42:17] ==> public final val strings: ArrayList<String> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'size' @ [42:25] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'apply' @ [42:30] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'strings' @ [43:21] ==> public final val strings: ArrayList<String> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'add' @ [43:29] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'string' @ [43:33] ==> value-parameter string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getStringIndex[ValueParameterDescriptorImpl]

'records' @ [45:38] ==> private final val records: ArrayList<JvmProtoBuf.StringTableTypes.Record.Builder> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'lastOrNull' @ [45:46] ==> public fun <T> List<JvmProtoBuf.StringTableTypes.Record.Builder>.lastOrNull(): JvmProtoBuf.StringTableTypes.Record.Builder? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Builder

'if (lastRecord != null && lastRecord.isTrivial()) {
                        lastRecord.range = lastRecord.range + 1
                    }
                    else records.add(Record.newBuilder())' @ [46:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'lastRecord' @ [46:25] ==> val lastRecord: JvmProtoBuf.StringTableTypes.Record.Builder? defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getStringIndex.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lastRecord' @ [46:47] ==> val lastRecord: JvmProtoBuf.StringTableTypes.Record.Builder? defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getStringIndex.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isTrivial' @ [46:58] ==> private final fun JvmProtoBuf.StringTableTypes.Record.Builder.isTrivial(): Boolean defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[SimpleFunctionDescriptorImpl]

'lastRecord' @ [47:25] ==> val lastRecord: JvmProtoBuf.StringTableTypes.Record.Builder? defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getStringIndex.<anonymous>.<anonymous>[LocalVariableDescriptor]

'range' @ [47:36] ==> public final var JvmProtoBuf.StringTableTypes.Record.Builder.range: Int[MyPropertyDescriptor]

'lastRecord' @ [47:44] ==> val lastRecord: JvmProtoBuf.StringTableTypes.Record.Builder? defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getStringIndex.<anonymous>.<anonymous>[LocalVariableDescriptor]

'range' @ [47:55] ==> public final var JvmProtoBuf.StringTableTypes.Record.Builder.range: Int[MyPropertyDescriptor]

'records' @ [49:26] ==> private final val records: ArrayList<JvmProtoBuf.StringTableTypes.Record.Builder> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'add' @ [49:34] ==> public open fun add(element: JvmProtoBuf.StringTableTypes.Record.Builder): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'newBuilder' @ [49:45] ==> public open fun newBuilder(): (JvmProtoBuf.StringTableTypes.Record.Builder..JvmProtoBuf.StringTableTypes.Record.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record[JavaMethodDescriptor]

'!' @ [54:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasPredefinedIndex' @ [54:17] ==> public open fun hasPredefinedIndex(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Builder[JavaMethodDescriptor]

'!' @ [54:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasOperation' @ [54:42] ==> public open fun hasOperation(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Builder[JavaMethodDescriptor]

'substringIndexCount' @ [54:60] ==> public final val JvmProtoBuf.StringTableTypes.Record.Builder.substringIndexCount: Int[MyPropertyDescriptor]

'replaceCharCount' @ [54:88] ==> public final val JvmProtoBuf.StringTableTypes.Record.Builder.replaceCharCount: Int[MyPropertyDescriptor]

'isError' @ [58:24] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [58:32] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[ValueParameterDescriptorImpl]

'IllegalStateException' @ [59:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [59:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [59:81] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[ValueParameterDescriptorImpl]

'descriptor' @ [71:23] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[ValueParameterDescriptorImpl]

'classId' @ [71:34] ==> private final val ClassifierDescriptorWithTypeParameters.classId: ClassId defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'classId' @ [72:22] ==> val classId: ClassId defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'asString' @ [72:30] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'map' @ [74:9] ==> private final val map: HashMap<String, Int> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'string' @ [74:13] ==> val string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'let' @ [74:22] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Unit

'classId' @ [77:17] ==> val classId: ClassId defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'isLocal' @ [77:25] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'recordedIndex' @ [77:37] ==> value-parameter recordedIndex: Int defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex.<anonymous>[ValueParameterDescriptorImpl]

'localNames' @ [77:54] ==> private final val localNames: HashSet<Int> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'recordedIndex' @ [78:24] ==> value-parameter recordedIndex: Int defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex.<anonymous>[ValueParameterDescriptorImpl]

'strings' @ [82:21] ==> public final val strings: ArrayList<String> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'size' @ [82:29] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'classId' @ [83:13] ==> val classId: ClassId defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'isLocal' @ [83:21] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'localNames' @ [84:13] ==> private final val localNames: HashSet<Int> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'add' @ [84:24] ==> public open fun add(element: Int): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'index' @ [84:28] ==> val index: Int defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'newBuilder' @ [87:29] ==> public open fun newBuilder(): (JvmProtoBuf.StringTableTypes.Record.Builder..JvmProtoBuf.StringTableTypes.Record.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record[JavaMethodDescriptor]

'if (classId.isLocal || '$' in string) {
            strings.add(string)
        }
        else {
            val predefinedIndex = JvmNameResolver.getPredefinedStringIndex(string)
            if (predefinedIndex != null) {
                record.predefinedIndex = predefinedIndex
                // TODO: move all records with predefined names to the end and do not write associated strings for them (since they are ignored)
                strings.add("")
            }
            else {
                record.operation = Record.Operation.DESC_TO_CLASS_ID
                strings.add("L${string.replace('.', '$')};")
            }
        }' @ [90:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'classId' @ [90:13] ==> val classId: ClassId defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'isLocal' @ [90:21] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'in' @ [90:32] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'string' @ [90:39] ==> val string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'strings' @ [91:13] ==> public final val strings: ArrayList<String> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'add' @ [91:21] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'string' @ [91:25] ==> val string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'JvmNameResolver' @ [94:35] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[FakeCallableDescriptorForObject]

'getPredefinedStringIndex' @ [94:51] ==> public final fun getPredefinedStringIndex(string: String): Int? defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver.Companion[DeserializedSimpleFunctionDescriptor]

'string' @ [94:76] ==> val string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'if (predefinedIndex != null) {
                record.predefinedIndex = predefinedIndex
                // TODO: move all records with predefined names to the end and do not write associated strings for them (since they are ignored)
                strings.add("")
            }
            else {
                record.operation = Record.Operation.DESC_TO_CLASS_ID
                strings.add("L${string.replace('.', '$')};")
            }' @ [95:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'predefinedIndex' @ [95:17] ==> val predefinedIndex: Int? defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'record' @ [96:17] ==> val record: (JvmProtoBuf.StringTableTypes.Record.Builder..JvmProtoBuf.StringTableTypes.Record.Builder?) defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'predefinedIndex' @ [96:24] ==> public final var JvmProtoBuf.StringTableTypes.Record.Builder.predefinedIndex: Int[MyPropertyDescriptor]

'predefinedIndex' @ [96:42] ==> val predefinedIndex: Int? defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'strings' @ [98:17] ==> public final val strings: ArrayList<String> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'add' @ [98:25] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'record' @ [101:17] ==> val record: (JvmProtoBuf.StringTableTypes.Record.Builder..JvmProtoBuf.StringTableTypes.Record.Builder?) defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'operation' @ [101:24] ==> public final var JvmProtoBuf.StringTableTypes.Record.Builder.operation: (JvmProtoBuf.StringTableTypes.Record.Operation..JvmProtoBuf.StringTableTypes.Record.Operation?)[MyPropertyDescriptor]

'DESC_TO_CLASS_ID' @ [101:53] ==> enum entry DESC_TO_CLASS_ID defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Operation[FakeCallableDescriptorForObject]

'strings' @ [102:17] ==> public final val strings: ArrayList<String> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'add' @ [102:25] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'string' @ [102:33] ==> val string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'replace' @ [102:40] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'records' @ [106:9] ==> private final val records: ArrayList<JvmProtoBuf.StringTableTypes.Record.Builder> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'add' @ [106:17] ==> public open fun add(element: JvmProtoBuf.StringTableTypes.Record.Builder): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'record' @ [106:21] ==> val record: (JvmProtoBuf.StringTableTypes.Record.Builder..JvmProtoBuf.StringTableTypes.Record.Builder?) defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'map' @ [108:9] ==> private final val map: HashMap<String, Int> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'string' @ [108:13] ==> val string: String defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'index' @ [108:23] ==> val index: Int defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'index' @ [110:16] ==> val index: Int defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.getFqNameIndex[LocalVariableDescriptor]

'containingDeclaration' @ [115:29] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (container) {
                is ClassDescriptor -> container.classId.createNestedClassId(name)
                is PackageFragmentDescriptor -> ClassId(container.fqName, name)
                else -> {
                    val fqName = FqName(typeMapper.mapClass(this).internalName.replace('/', '.'))
                    ClassId(fqName.parent(), FqName.topLevel(fqName.shortName()), /* isLocal = */ true)
                }
            }' @ [116:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassId, entry1: ClassId, entry2: ClassId): ClassId[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassId

'container' @ [116:26] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.<get-classId>[LocalVariableDescriptor]

'container' @ [117:39] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.<get-classId>[LocalVariableDescriptor]

'classId' @ [117:49] ==> private final val ClassifierDescriptorWithTypeParameters.classId: ClassId defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'createNestedClassId' @ [117:57] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'name' @ [117:77] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'ClassId' @ [118:49] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'container' @ [118:57] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.<get-classId>[LocalVariableDescriptor]

'fqName' @ [118:67] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'name' @ [118:75] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'FqName' @ [120:34] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'typeMapper' @ [120:41] ==> private final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'mapClass' @ [120:52] ==> @NotNull public open fun mapClass(@NotNull classifier: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'this' @ [120:61] ==> <this> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.classId[ReceiverParameterDescriptorImpl]

'internalName' @ [120:67] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'replace' @ [120:80] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ClassId' @ [121:21] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: FqName, p2: Boolean) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'fqName' @ [121:29] ==> val fqName: FqName defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.<get-classId>[LocalVariableDescriptor]

'parent' @ [121:36] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'topLevel' @ [121:53] ==> @NotNull public open fun topLevel(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [121:62] ==> val fqName: FqName defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.<get-classId>[LocalVariableDescriptor]

'shortName' @ [121:69] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'with' @ [127:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (JvmProtoBuf.StringTableTypes.Builder..JvmProtoBuf.StringTableTypes.Builder?), block: (JvmProtoBuf.StringTableTypes.Builder..JvmProtoBuf.StringTableTypes.Builder?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Builder..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Builder?)
    <R> -> Unit

'newBuilder' @ [127:43] ==> public open fun newBuilder(): (JvmProtoBuf.StringTableTypes.Builder..JvmProtoBuf.StringTableTypes.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes[JavaMethodDescriptor]

'addAllRecord' @ [128:13] ==> public open fun addAllRecord(p0: (MutableIterable<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>..Iterable<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)>?)): (JvmProtoBuf.StringTableTypes.Builder..JvmProtoBuf.StringTableTypes.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Builder[JavaMethodDescriptor]

'records' @ [128:26] ==> private final val records: ArrayList<JvmProtoBuf.StringTableTypes.Record.Builder> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'map' @ [128:34] ==> public inline fun <T, R> Iterable<JvmProtoBuf.StringTableTypes.Record.Builder>.map(transform: (JvmProtoBuf.StringTableTypes.Record.Builder) -> (JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)): List<(JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Builder
    <R> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record?)

'it' @ [128:40] ==> value-parameter it: JvmProtoBuf.StringTableTypes.Record.Builder defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.serializeTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [128:43] ==> public open fun build(): (JvmProtoBuf.StringTableTypes.Record..JvmProtoBuf.StringTableTypes.Record?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Record.Builder[JavaMethodDescriptor]

'addAllLocalName' @ [129:13] ==> public open fun addAllLocalName(p0: (MutableIterable<(Int..Int?)>..Iterable<(Int..Int?)>?)): (JvmProtoBuf.StringTableTypes.Builder..JvmProtoBuf.StringTableTypes.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Builder[JavaMethodDescriptor]

'localNames' @ [129:29] ==> private final val localNames: HashSet<Int> defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable[PropertyDescriptorImpl]

'build' @ [130:13] ==> public open fun build(): (JvmProtoBuf.StringTableTypes..JvmProtoBuf.StringTableTypes?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes.Builder[JavaMethodDescriptor]

'writeDelimitedTo' @ [130:21] ==> public open fun writeDelimitedTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes[JavaMethodDescriptor]

'output' @ [130:38] ==> value-parameter output: OutputStream defined in org.jetbrains.kotlin.codegen.serialization.JvmStringTable.serializeTo[ValueParameterDescriptorImpl]

