'emptySet' @ [35:48] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TestOnly' @ [36:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'ProtoData' @ [41:88] ==> private constructor ProtoData() defined in org.jetbrains.kotlin.incremental.ProtoData[ClassConstructorDescriptorImpl]

'ProtoData' @ [42:96] ==> private constructor ProtoData() defined in org.jetbrains.kotlin.incremental.ProtoData[ClassConstructorDescriptorImpl]

'if (isPackageFacade) {
        val packageData = JvmProtoBufUtil.readPackageDataFrom(bytes, strings)
        PackagePartProtoData(packageData.packageProto, packageData.nameResolver)
    }
    else {
        val classData = JvmProtoBufUtil.readClassDataFrom(bytes, strings)
        ClassProtoData(classData.classProto, classData.nameResolver)
    }' @ [45:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProtoData, elseBranch: ProtoData): ProtoData[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ProtoData

'isPackageFacade' @ [45:9] ==> public final val isPackageFacade: Boolean defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'JvmProtoBufUtil' @ [46:27] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readPackageDataFrom' @ [46:43] ==> @JvmStatic public final fun readPackageDataFrom(bytes: ByteArray, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'bytes' @ [46:63] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'strings' @ [46:70] ==> public final val strings: Array<String> defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'PackagePartProtoData' @ [47:9] ==> public constructor PackagePartProtoData(proto: ProtoBuf.Package, nameResolver: NameResolver) defined in org.jetbrains.kotlin.incremental.PackagePartProtoData[ClassConstructorDescriptorImpl]

'packageData' @ [47:30] ==> val packageData: PackageData defined in org.jetbrains.kotlin.incremental.toProtoData[LocalVariableDescriptor]

'packageProto' @ [47:42] ==> public final val packageProto: ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedPropertyDescriptor]

'packageData' @ [47:56] ==> val packageData: PackageData defined in org.jetbrains.kotlin.incremental.toProtoData[LocalVariableDescriptor]

'nameResolver' @ [47:68] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedPropertyDescriptor]

'JvmProtoBufUtil' @ [50:25] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readClassDataFrom' @ [50:41] ==> @JvmStatic public final fun readClassDataFrom(bytes: ByteArray, strings: Array<String>): ClassData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'bytes' @ [50:59] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'strings' @ [50:66] ==> public final val strings: Array<String> defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'ClassProtoData' @ [51:9] ==> public constructor ClassProtoData(proto: ProtoBuf.Class, nameResolver: NameResolver) defined in org.jetbrains.kotlin.incremental.ClassProtoData[ClassConstructorDescriptorImpl]

'classData' @ [51:24] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.toProtoData[LocalVariableDescriptor]

'classProto' @ [51:34] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'classData' @ [51:46] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.toProtoData[LocalVariableDescriptor]

'nameResolver' @ [51:56] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'difference' @ [55:9] ==> public fun difference(oldData: ProtoData, newData: ProtoData): Difference defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'oldValue' @ [55:20] ==> value-parameter oldValue: ProtoMapValue defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'toProtoData' @ [55:29] ==> public fun ProtoMapValue.toProtoData(): ProtoData defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'newValue' @ [55:44] ==> value-parameter newValue: ProtoMapValue defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'toProtoData' @ [55:53] ==> public fun ProtoMapValue.toProtoData(): ProtoData defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'when (oldData) {
            is ClassProtoData -> {
                when (newData) {
                    is ClassProtoData ->
                        DifferenceCalculatorForClass(oldData, newData).difference()
                    is PackagePartProtoData ->
                        Difference(isClassAffected = true, areSubclassesAffected = true)
                }
            }
            is PackagePartProtoData -> {
                when (newData) {
                    is ClassProtoData ->
                        Difference(isClassAffected = true)
                    is PackagePartProtoData ->
                        DifferenceCalculatorForPackageFacade(oldData, newData).difference()
                }
            }
        }' @ [58:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Difference, entry1: Difference): Difference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Difference

'oldData' @ [58:15] ==> value-parameter oldData: ProtoData defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'when (newData) {
                    is ClassProtoData ->
                        DifferenceCalculatorForClass(oldData, newData).difference()
                    is PackagePartProtoData ->
                        Difference(isClassAffected = true, areSubclassesAffected = true)
                }' @ [60:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Difference, entry1: Difference): Difference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Difference

'newData' @ [60:23] ==> value-parameter newData: ProtoData defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'DifferenceCalculatorForClass' @ [62:25] ==> public constructor DifferenceCalculatorForClass(oldData: ClassProtoData, newData: ClassProtoData) defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[ClassConstructorDescriptorImpl]

'oldData' @ [62:54] ==> value-parameter oldData: ProtoData defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'newData' @ [62:63] ==> value-parameter newData: ProtoData defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'difference' @ [62:72] ==> public open fun difference(): Difference defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[SimpleFunctionDescriptorImpl]

'Difference' @ [64:25] ==> public constructor Difference(isClassAffected: Boolean = ..., areSubclassesAffected: Boolean = ..., changedMembersNames: Set<String> = ..., rawProtoDifference: EnumSet<*>? = ...) defined in org.jetbrains.kotlin.incremental.Difference[ClassConstructorDescriptorImpl]

'when (newData) {
                    is ClassProtoData ->
                        Difference(isClassAffected = true)
                    is PackagePartProtoData ->
                        DifferenceCalculatorForPackageFacade(oldData, newData).difference()
                }' @ [68:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Difference, entry1: Difference): Difference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Difference

'newData' @ [68:23] ==> value-parameter newData: ProtoData defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'Difference' @ [70:25] ==> public constructor Difference(isClassAffected: Boolean = ..., areSubclassesAffected: Boolean = ..., changedMembersNames: Set<String> = ..., rawProtoDifference: EnumSet<*>? = ...) defined in org.jetbrains.kotlin.incremental.Difference[ClassConstructorDescriptorImpl]

'DifferenceCalculatorForPackageFacade' @ [72:25] ==> public constructor DifferenceCalculatorForPackageFacade(oldData: PackagePartProtoData, newData: PackagePartProtoData) defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[ClassConstructorDescriptorImpl]

'oldData' @ [72:62] ==> value-parameter oldData: ProtoData defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'newData' @ [72:71] ==> value-parameter newData: ProtoData defined in org.jetbrains.kotlin.incremental.difference[ValueParameterDescriptorImpl]

'difference' @ [72:80] ==> public open fun difference(): Difference defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[SimpleFunctionDescriptorImpl]

'isPrivate' @ [78:26] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'visibility' @ [78:52] ==> @JvmStatic public final fun visibility(visibility: ProtoBuf.Visibility?): Visibility defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[DeserializedSimpleFunctionDescriptor]

'when (this) {
                is ProtoBuf.Constructor -> Flags.VISIBILITY.get(flags)
                is ProtoBuf.Function -> Flags.VISIBILITY.get(flags)
                is ProtoBuf.Property -> Flags.VISIBILITY.get(flags)
                is ProtoBuf.TypeAlias -> Flags.VISIBILITY.get(flags)
                else -> error("Unknown message: $this")
            }' @ [79:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (ProtoBuf.Visibility..ProtoBuf.Visibility?), entry1: (ProtoBuf.Visibility..ProtoBuf.Visibility?), entry2: (ProtoBuf.Visibility..ProtoBuf.Visibility?), entry3: (ProtoBuf.Visibility..ProtoBuf.Visibility?), entry4: (ProtoBuf.Visibility..ProtoBuf.Visibility?)): (ProtoBuf.Visibility..ProtoBuf.Visibility?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Visibility..org.jetbrains.kotlin.serialization.ProtoBuf.Visibility?)

'this' @ [79:19] ==> <this> defined in org.jetbrains.kotlin.incremental.isPrivate[ReceiverParameterDescriptorImpl]

'VISIBILITY' @ [80:50] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [80:61] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [80:65] ==> public final val ProtoBuf.Constructor.flags: Int[MyPropertyDescriptor]

'VISIBILITY' @ [81:47] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [81:58] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [81:62] ==> public final val ProtoBuf.Function.flags: Int[MyPropertyDescriptor]

'VISIBILITY' @ [82:47] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [82:58] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [82:62] ==> public final val ProtoBuf.Property.flags: Int[MyPropertyDescriptor]

'VISIBILITY' @ [83:48] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [83:59] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [83:63] ==> public final val ProtoBuf.TypeAlias.flags: Int[MyPropertyDescriptor]

'error' @ [84:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [84:50] ==> <this> defined in org.jetbrains.kotlin.incremental.isPrivate[ReceiverParameterDescriptorImpl]

'when (this) {
        is ProtoBuf.Constructor -> "<init>"
        is ProtoBuf.Function -> nameResolver.getString(name)
        is ProtoBuf.Property -> nameResolver.getString(name)
        is ProtoBuf.TypeAlias -> nameResolver.getString(name)
        else -> error("Unknown message: $this")
    }' @ [88:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [88:18] ==> <this> defined in org.jetbrains.kotlin.incremental.name[ReceiverParameterDescriptorImpl]

'nameResolver' @ [90:33] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.name[ValueParameterDescriptorImpl]

'getString' @ [90:46] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'name' @ [90:56] ==> public final val ProtoBuf.Function.name: Int[MyPropertyDescriptor]

'nameResolver' @ [91:33] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.name[ValueParameterDescriptorImpl]

'getString' @ [91:46] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'name' @ [91:56] ==> public final val ProtoBuf.Property.name: Int[MyPropertyDescriptor]

'nameResolver' @ [92:34] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.name[ValueParameterDescriptorImpl]

'getString' @ [92:47] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'name' @ [92:57] ==> public final val ProtoBuf.TypeAlias.name: Int[MyPropertyDescriptor]

'error' @ [93:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [93:42] ==> <this> defined in org.jetbrains.kotlin.incremental.name[ReceiverParameterDescriptorImpl]

'map' @ [97:82] ==> public inline fun <T, R> Iterable<MessageLite>.map(transform: (MessageLite) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite
    <R> -> String

'it' @ [97:88] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.names.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [97:91] ==> private fun MessageLite.name(nameResolver: NameResolver): String defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'nameResolver' @ [97:96] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.names[ValueParameterDescriptorImpl]

'hashSetOf' @ [105:22] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'oldList' @ [108:17] ==> value-parameter oldList: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[ValueParameterDescriptorImpl]

'groupBy' @ [108:25] ==> public inline fun <T, K> Iterable<MessageLite>.groupBy(keySelector: (MessageLite) -> Int): Map<Int, List<MessageLite>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite
    <K> -> Int

'it' @ [108:35] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers.<anonymous>[ValueParameterDescriptorImpl]

'getHashCode' @ [108:38] ==> private final fun MessageLite.getHashCode(stringIndexes: (Int) -> Int, fqNameIndexes: (Int) -> Int): Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[SimpleFunctionDescriptorImpl]

'compareObject' @ [108:52] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'oldGetIndexOfString' @ [108:66] ==> public final fun oldGetIndexOfString(index: Int): Int defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'it' @ [108:86] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compareObject' @ [108:95] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'oldGetIndexOfClassId' @ [108:109] ==> public final fun oldGetIndexOfClassId(index: Int): Int defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'it' @ [108:130] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newList' @ [110:17] ==> value-parameter newList: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[ValueParameterDescriptorImpl]

'groupBy' @ [110:25] ==> public inline fun <T, K> Iterable<MessageLite>.groupBy(keySelector: (MessageLite) -> Int): Map<Int, List<MessageLite>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite
    <K> -> Int

'it' @ [110:35] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers.<anonymous>[ValueParameterDescriptorImpl]

'getHashCode' @ [110:38] ==> private final fun MessageLite.getHashCode(stringIndexes: (Int) -> Int, fqNameIndexes: (Int) -> Int): Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[SimpleFunctionDescriptorImpl]

'compareObject' @ [110:52] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'newGetIndexOfString' @ [110:66] ==> public final fun newGetIndexOfString(index: Int): Int defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'it' @ [110:86] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compareObject' @ [110:95] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'newGetIndexOfClassId' @ [110:109] ==> public final fun newGetIndexOfClassId(index: Int): Int defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'it' @ [110:130] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oldMap' @ [112:22] ==> val oldMap: Map<Int, List<MessageLite>> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'keys' @ [112:29] ==> public abstract val keys: Set<Int> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'newMap' @ [112:36] ==> val newMap: Map<Int, List<MessageLite>> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'keys' @ [112:43] ==> public abstract val keys: Set<Int> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'hashes' @ [113:22] ==> val hashes: Set<Int> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'oldMap' @ [114:30] ==> val oldMap: Map<Int, List<MessageLite>> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'hash' @ [114:37] ==> val hash: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'newMap' @ [115:30] ==> val newMap: Map<Int, List<MessageLite>> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'hash' @ [115:37] ==> val hash: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'when {
                newMembers == null -> oldMembers!!.names(compareObject.oldNameResolver)
                oldMembers == null -> newMembers.names(compareObject.newNameResolver)
                else -> calcDifferenceForEqualHashes(oldMembers, newMembers)
            }' @ [117:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<String>, entry1: Collection<String>, entry2: Collection<String>): Collection<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<String>

'newMembers' @ [118:17] ==> val newMembers: List<MessageLite>? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'oldMembers' @ [118:39] ==> val oldMembers: List<MessageLite>? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'names' @ [118:52] ==> internal fun List<MessageLite>.names(nameResolver: NameResolver): List<String> defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'compareObject' @ [118:58] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'oldNameResolver' @ [118:72] ==> public final val oldNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[PropertyDescriptorImpl]

'oldMembers' @ [119:17] ==> val oldMembers: List<MessageLite>? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'newMembers' @ [119:39] ==> val newMembers: List<MessageLite>? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'names' @ [119:50] ==> internal fun List<MessageLite>.names(nameResolver: NameResolver): List<String> defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'compareObject' @ [119:56] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'newNameResolver' @ [119:70] ==> public final val newNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[PropertyDescriptorImpl]

'calcDifferenceForEqualHashes' @ [120:25] ==> private final fun calcDifferenceForEqualHashes(oldList: List<MessageLite>, newList: List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[SimpleFunctionDescriptorImpl]

'oldMembers' @ [120:54] ==> val oldMembers: List<MessageLite>? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'newMembers' @ [120:66] ==> val newMembers: List<MessageLite>? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'result' @ [122:13] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'addAll' @ [122:20] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'differentMembers' @ [122:27] ==> val differentMembers: Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'result' @ [125:16] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForMembers[LocalVariableDescriptor]

'hashSetOf' @ [132:22] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'HashSet' @ [133:22] ==> public constructor HashSet<E : (Any..Any?)>(p0: (MutableCollection<out (MessageLite..MessageLite?)>..Collection<(MessageLite..MessageLite?)>?)) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.protobuf.MessageLite..org.jetbrains.kotlin.protobuf.MessageLite?)

'newList' @ [133:30] ==> value-parameter newList: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[ValueParameterDescriptorImpl]

'oldList' @ [135:9] ==> value-parameter oldList: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[ValueParameterDescriptorImpl]

'forEach' @ [135:17] ==> @HidesMembers public inline fun <T> Iterable<MessageLite>.forEach(action: (MessageLite) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite

'newSet' @ [136:29] ==> val newSet: HashSet<(MessageLite..MessageLite?)> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[LocalVariableDescriptor]

'firstOrNull' @ [136:36] ==> public inline fun <T> Iterable<(MessageLite..MessageLite?)>.firstOrNull(predicate: ((MessageLite..MessageLite?)) -> Boolean): MessageLite? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.protobuf.MessageLite..org.jetbrains.kotlin.protobuf.MessageLite?)

'compareObject' @ [136:50] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'checkEquals' @ [136:64] ==> private final fun ProtoCompareGenerated.checkEquals(old: MessageLite, new: MessageLite): Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[SimpleFunctionDescriptorImpl]

'oldMember' @ [136:76] ==> value-parameter oldMember: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [136:87] ==> value-parameter it: (MessageLite..MessageLite?) defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (newMember != null) {
                newSet.remove(newMember)
            }
            else {
                result.add(oldMember.name(compareObject.oldNameResolver))
            }' @ [137:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'newMember' @ [137:17] ==> val newMember: MessageLite? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes.<anonymous>[LocalVariableDescriptor]

'newSet' @ [138:17] ==> val newSet: HashSet<(MessageLite..MessageLite?)> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[LocalVariableDescriptor]

'remove' @ [138:24] ==> public open fun remove(element: (MessageLite..MessageLite?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'newMember' @ [138:31] ==> val newMember: MessageLite? defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes.<anonymous>[LocalVariableDescriptor]

'result' @ [141:17] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[LocalVariableDescriptor]

'add' @ [141:24] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'oldMember' @ [141:28] ==> value-parameter oldMember: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [141:38] ==> private fun MessageLite.name(nameResolver: NameResolver): String defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'compareObject' @ [141:43] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'oldNameResolver' @ [141:57] ==> public final val oldNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[PropertyDescriptorImpl]

'newSet' @ [145:9] ==> val newSet: HashSet<(MessageLite..MessageLite?)> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[LocalVariableDescriptor]

'forEach' @ [145:16] ==> @HidesMembers public inline fun <T> Iterable<(MessageLite..MessageLite?)>.forEach(action: ((MessageLite..MessageLite?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.protobuf.MessageLite..org.jetbrains.kotlin.protobuf.MessageLite?)

'result' @ [146:13] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[LocalVariableDescriptor]

'add' @ [146:20] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'newMember' @ [146:24] ==> value-parameter newMember: (MessageLite..MessageLite?) defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [146:34] ==> private fun MessageLite.name(nameResolver: NameResolver): String defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'compareObject' @ [146:39] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'newNameResolver' @ [146:53] ==> public final val newNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[PropertyDescriptorImpl]

'result' @ [149:16] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForEqualHashes[LocalVariableDescriptor]

'oldList' @ [156:24] ==> value-parameter oldList: List<Int> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames[ValueParameterDescriptorImpl]

'map' @ [156:32] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'compareObject' @ [156:38] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'oldNameResolver' @ [156:52] ==> public final val oldNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[PropertyDescriptorImpl]

'getString' @ [156:68] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [156:78] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [156:84] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'newList' @ [157:24] ==> value-parameter newList: List<Int> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames[ValueParameterDescriptorImpl]

'map' @ [157:32] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'compareObject' @ [157:38] ==> protected abstract val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[PropertyDescriptorImpl]

'newNameResolver' @ [157:52] ==> public final val newNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[PropertyDescriptorImpl]

'getString' @ [157:68] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [157:78] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [157:84] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'oldNames' @ [158:16] ==> val oldNames: Set<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames[LocalVariableDescriptor]

'union' @ [158:25] ==> public infix fun <T> Iterable<String>.union(other: Iterable<String>): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'newNames' @ [158:31] ==> val newNames: Set<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames[LocalVariableDescriptor]

'oldNames' @ [158:43] ==> val oldNames: Set<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames[LocalVariableDescriptor]

'intersect' @ [158:52] ==> public infix fun <T> Iterable<String>.intersect(other: Iterable<String>): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'newNames' @ [158:62] ==> val newNames: Set<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.calcDifferenceForNames[LocalVariableDescriptor]

'when (this) {
            is ProtoBuf.Constructor -> hashCode(stringIndexes, fqNameIndexes)
            is ProtoBuf.Function -> hashCode(stringIndexes, fqNameIndexes)
            is ProtoBuf.Property -> hashCode(stringIndexes, fqNameIndexes)
            is ProtoBuf.TypeAlias -> hashCode(stringIndexes, fqNameIndexes)
            else -> error("Unknown message: $this")
        }' @ [162:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'this' @ [162:22] ==> <this> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ReceiverParameterDescriptorImpl]

'hashCode' @ [163:40] ==> public fun ProtoBuf.Constructor.hashCode(stringIndexes: (Int) -> Int, fqNameIndexes: (Int) -> Int): Int defined in org.jetbrains.kotlin.incremental in file ProtoCompareGenerated.kt[SimpleFunctionDescriptorImpl]

'stringIndexes' @ [163:49] ==> value-parameter stringIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'fqNameIndexes' @ [163:64] ==> value-parameter fqNameIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'hashCode' @ [164:37] ==> public fun ProtoBuf.Function.hashCode(stringIndexes: (Int) -> Int, fqNameIndexes: (Int) -> Int): Int defined in org.jetbrains.kotlin.incremental in file ProtoCompareGenerated.kt[SimpleFunctionDescriptorImpl]

'stringIndexes' @ [164:46] ==> value-parameter stringIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'fqNameIndexes' @ [164:61] ==> value-parameter fqNameIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'hashCode' @ [165:37] ==> public fun ProtoBuf.Property.hashCode(stringIndexes: (Int) -> Int, fqNameIndexes: (Int) -> Int): Int defined in org.jetbrains.kotlin.incremental in file ProtoCompareGenerated.kt[SimpleFunctionDescriptorImpl]

'stringIndexes' @ [165:46] ==> value-parameter stringIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'fqNameIndexes' @ [165:61] ==> value-parameter fqNameIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'hashCode' @ [166:38] ==> public fun ProtoBuf.TypeAlias.hashCode(stringIndexes: (Int) -> Int, fqNameIndexes: (Int) -> Int): Int defined in org.jetbrains.kotlin.incremental in file ProtoCompareGenerated.kt[SimpleFunctionDescriptorImpl]

'stringIndexes' @ [166:47] ==> value-parameter stringIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'fqNameIndexes' @ [166:62] ==> value-parameter fqNameIndexes: (Int) -> Int defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ValueParameterDescriptorImpl]

'error' @ [167:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [167:46] ==> <this> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.getHashCode[ReceiverParameterDescriptorImpl]

'when {
            old is ProtoBuf.Constructor && new is ProtoBuf.Constructor -> checkEquals(old, new)
            old is ProtoBuf.Function && new is ProtoBuf.Function -> checkEquals(old, new)
            old is ProtoBuf.Property && new is ProtoBuf.Property -> checkEquals(old, new)
            old is ProtoBuf.TypeAlias && new is ProtoBuf.TypeAlias -> checkEquals(old, new)
            else -> error("Unknown message: $this")
        }' @ [172:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'old' @ [173:13] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [173:44] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'checkEquals' @ [173:75] ==> public open fun checkEquals(old: ProtoBuf.Constructor, new: ProtoBuf.Constructor): Boolean defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'old' @ [173:87] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [173:92] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'old' @ [174:13] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [174:41] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'checkEquals' @ [174:69] ==> public open fun checkEquals(old: ProtoBuf.Function, new: ProtoBuf.Function): Boolean defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'old' @ [174:81] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [174:86] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'old' @ [175:13] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [175:41] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'checkEquals' @ [175:69] ==> public open fun checkEquals(old: ProtoBuf.Property, new: ProtoBuf.Property): Boolean defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'old' @ [175:81] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [175:86] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'old' @ [176:13] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [176:42] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'checkEquals' @ [176:71] ==> public open fun checkEquals(old: ProtoBuf.TypeAlias, new: ProtoBuf.TypeAlias): Boolean defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'old' @ [176:83] ==> value-parameter old: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'new' @ [176:88] ==> value-parameter new: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ValueParameterDescriptorImpl]

'error' @ [177:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [177:46] ==> <this> defined in org.jetbrains.kotlin.incremental.DifferenceCalculator.checkEquals[ReceiverParameterDescriptorImpl]

'DifferenceCalculator' @ [185:5] ==> public constructor DifferenceCalculator() defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[ClassConstructorDescriptorImpl]

'ProtoCompareGenerated' @ [186:34] ==> public constructor ProtoCompareGenerated(oldNameResolver: NameResolver, newNameResolver: NameResolver) defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[ClassConstructorDescriptorImpl]

'oldData' @ [186:56] ==> private final val oldData: ClassProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[PropertyDescriptorImpl]

'nameResolver' @ [186:64] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ClassProtoData[PropertyDescriptorImpl]

'newData' @ [186:78] ==> private final val newData: ClassProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[PropertyDescriptorImpl]

'nameResolver' @ [186:86] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.ClassProtoData[PropertyDescriptorImpl]

'component1' @ [189:14] ==> public final operator fun component1(): ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.ClassProtoData[SimpleFunctionDescriptorImpl]

'component2' @ [189:24] ==> public final operator fun component2(): NameResolver defined in org.jetbrains.kotlin.incremental.ClassProtoData[SimpleFunctionDescriptorImpl]

'oldData' @ [189:43] ==> private final val oldData: ClassProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[PropertyDescriptorImpl]

'component1' @ [190:14] ==> public final operator fun component1(): ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.ClassProtoData[SimpleFunctionDescriptorImpl]

'component2' @ [190:24] ==> public final operator fun component2(): NameResolver defined in org.jetbrains.kotlin.incremental.ClassProtoData[SimpleFunctionDescriptorImpl]

'newData' @ [190:43] ==> private final val newData: ClassProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[PropertyDescriptorImpl]

'compareObject' @ [192:20] ==> protected open val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[PropertyDescriptorImpl]

'difference' @ [192:34] ==> public final fun difference(old: ProtoBuf.Class, new: ProtoBuf.Class): EnumSet<ProtoCompareGenerated.ProtoBufClassKind> defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'oldProto' @ [192:45] ==> val oldProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'newProto' @ [192:55] ==> val newProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'hashSetOf' @ [196:21] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'newProto' @ [197:29] ==> val newProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'isSealed' @ [197:38] ==> private val ProtoBuf.Class.isSealed: Boolean defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[PropertyDescriptorImpl]

'oldProto' @ [197:50] ==> val oldProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'isSealed' @ [197:59] ==> private val ProtoBuf.Class.isSealed: Boolean defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[PropertyDescriptorImpl]

'names' @ [199:32] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'add' @ [199:38] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'oldNameResolver' @ [199:42] ==> val oldNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'getString' @ [199:58] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'this' @ [199:68] ==> <this> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference.oldToNames[ReceiverParameterDescriptorImpl]

'names' @ [200:32] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'add' @ [200:38] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'newNameResolver' @ [200:42] ==> val newNameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'getString' @ [200:58] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'this' @ [200:68] ==> <this> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference.newToNames[ReceiverParameterDescriptorImpl]

'invoke' @ [203:30] ==> public abstract operator fun invoke(p1: ProtoBuf.Class): List<MessageLite> defined in kotlin.Function1[FunctionInvokeDescriptor]

'oldProto' @ [203:38] ==> val oldProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'filterNot' @ [203:48] ==> public inline fun <T> Iterable<MessageLite>.filterNot(predicate: (MessageLite) -> Boolean): List<MessageLite> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite

'it' @ [203:60] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference.calcDifferenceForNonPrivateMembers.<anonymous>[ValueParameterDescriptorImpl]

'isPrivate' @ [203:63] ==> internal val MessageLite.isPrivate: Boolean defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[PropertyDescriptorImpl]

'invoke' @ [204:30] ==> public abstract operator fun invoke(p1: ProtoBuf.Class): List<MessageLite> defined in kotlin.Function1[FunctionInvokeDescriptor]

'newProto' @ [204:38] ==> val newProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'filterNot' @ [204:48] ==> public inline fun <T> Iterable<MessageLite>.filterNot(predicate: (MessageLite) -> Boolean): List<MessageLite> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite

'it' @ [204:60] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference.calcDifferenceForNonPrivateMembers.<anonymous>[ValueParameterDescriptorImpl]

'isPrivate' @ [204:63] ==> internal val MessageLite.isPrivate: Boolean defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[PropertyDescriptorImpl]

'calcDifferenceForMembers' @ [205:20] ==> protected final fun calcDifferenceForMembers(oldList: List<MessageLite>, newList: List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[SimpleFunctionDescriptorImpl]

'oldMembers' @ [205:45] ==> val oldMembers: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference.calcDifferenceForNonPrivateMembers[LocalVariableDescriptor]

'newMembers' @ [205:57] ==> val newMembers: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference.calcDifferenceForNonPrivateMembers[LocalVariableDescriptor]

'diff' @ [208:22] ==> val diff: EnumSet<ProtoCompareGenerated.ProtoBufClassKind> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'Suppress' @ [209:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (kind!!) {
                ProtoBufClassKind.COMPANION_OBJECT_NAME -> {
                    if (oldProto.hasCompanionObjectName()) oldProto.companionObjectName.oldToNames()
                    if (newProto.hasCompanionObjectName()) newProto.companionObjectName.newToNames()
                    isClassAffected = true
                }
                ProtoBufClassKind.NESTED_CLASS_NAME_LIST -> {
                    if (classIsSealed) {
                        // when class is sealed, adding an implementation can break exhaustive when expressions
                        // the workaround is to recompile all class usages
                        isClassAffected = true
                    }

                    names.addAll(calcDifferenceForNames(oldProto.nestedClassNameList, newProto.nestedClassNameList))
                }
                ProtoBufClassKind.CONSTRUCTOR_LIST -> {
                    val differentNonPrivateConstructors = calcDifferenceForNonPrivateMembers(ProtoBuf.Class::getConstructorList)
                    isClassAffected = isClassAffected || differentNonPrivateConstructors.isNotEmpty()
                }
                ProtoBufClassKind.FUNCTION_LIST ->
                    names.addAll(calcDifferenceForNonPrivateMembers(ProtoBuf.Class::getFunctionList))
                ProtoBufClassKind.PROPERTY_LIST ->
                    names.addAll(calcDifferenceForNonPrivateMembers(ProtoBuf.Class::getPropertyList))
                ProtoBufClassKind.TYPE_ALIAS_LIST ->
                    names.addAll(calcDifferenceForNonPrivateMembers(ProtoBuf.Class::getTypeAliasList))
                ProtoBufClassKind.ENUM_ENTRY_LIST -> {
                    isClassAffected = true
                }
                ProtoBufClassKind.SEALED_SUBCLASS_FQ_NAME_LIST -> {
                    isClassAffected = true
                    // Subclasses are considered to be affected to fix the case where
                    // an implementation is added to an nth-level (n > 1) sealed class.
                    // In case of the following hierarchy:
                    //     Base <- Intermediate <- Impl
                    // the change of the SEALED_SUBCLASS_FQ_NAME_LIST will be detected in the Intermediate,
                    // but there can be usages, that should be rebuilt, without direct references to the Intermediate:
                    //     when (x as Base) { is Impl -> ... }
                    areSubclassesAffected = true
                }
                ProtoBufClassKind.TYPE_TABLE -> {
                    // TODO
                }
                ProtoCompareGenerated.ProtoBufClassKind.SINCE_KOTLIN_INFO,
                ProtoCompareGenerated.ProtoBufClassKind.SINCE_KOTLIN_INFO_TABLE -> {
                    // TODO
                }
                ProtoBufClassKind.FLAGS,
                ProtoBufClassKind.FQ_NAME,
                ProtoBufClassKind.TYPE_PARAMETER_LIST,
                ProtoBufClassKind.SUPERTYPE_LIST,
                ProtoBufClassKind.SUPERTYPE_ID_LIST,
                ProtoBufClassKind.JS_EXT_CLASS_ANNOTATION_LIST -> {
                    isClassAffected = true
                    areSubclassesAffected = true
                }
                ProtoBufClassKind.JVM_EXT_CLASS_MODULE_NAME,
                ProtoBufClassKind.JS_EXT_CLASS_CONTAINING_FILE_ID -> {
                   // TODO
                }
                ProtoBufClassKind.JVM_EXT_CLASS_LOCAL_VARIABLE_LIST -> {
                    // Not affected, local variables are not accessible outside of a file
                }
            }' @ [210:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any, entry5: Any, entry6: Any, entry7: Any, entry8: Any, entry9: Any, entry10: Any, entry11: Any, entry12: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'kind' @ [210:37] ==> val kind: (ProtoCompareGenerated.ProtoBufClassKind..ProtoCompareGenerated.ProtoBufClassKind?) defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'COMPANION_OBJECT_NAME' @ [211:35] ==> enum entry COMPANION_OBJECT_NAME defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'oldProto' @ [212:25] ==> val oldProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'hasCompanionObjectName' @ [212:34] ==> public open fun hasCompanionObjectName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'oldProto' @ [212:60] ==> val oldProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'companionObjectName' @ [212:69] ==> public final val ProtoBuf.Class.companionObjectName: Int[MyPropertyDescriptor]

'oldToNames' @ [212:89] ==> local final fun Int.oldToNames(): Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[SimpleFunctionDescriptorImpl]

'newProto' @ [213:25] ==> val newProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'hasCompanionObjectName' @ [213:34] ==> public open fun hasCompanionObjectName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'newProto' @ [213:60] ==> val newProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'companionObjectName' @ [213:69] ==> public final val ProtoBuf.Class.companionObjectName: Int[MyPropertyDescriptor]

'newToNames' @ [213:89] ==> local final fun Int.newToNames(): Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[SimpleFunctionDescriptorImpl]

'isClassAffected' @ [214:21] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'NESTED_CLASS_NAME_LIST' @ [216:35] ==> enum entry NESTED_CLASS_NAME_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'classIsSealed' @ [217:25] ==> val classIsSealed: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'isClassAffected' @ [220:25] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'names' @ [223:21] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'addAll' @ [223:27] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'calcDifferenceForNames' @ [223:34] ==> protected final fun calcDifferenceForNames(oldList: List<Int>, newList: List<Int>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass[SimpleFunctionDescriptorImpl]

'oldProto' @ [223:57] ==> val oldProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'nestedClassNameList' @ [223:66] ==> public final val ProtoBuf.Class.nestedClassNameList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'newProto' @ [223:87] ==> val newProto: ProtoBuf.Class defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'nestedClassNameList' @ [223:96] ==> public final val ProtoBuf.Class.nestedClassNameList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'CONSTRUCTOR_LIST' @ [225:35] ==> enum entry CONSTRUCTOR_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'calcDifferenceForNonPrivateMembers' @ [226:59] ==> local final fun calcDifferenceForNonPrivateMembers(members: (ProtoBuf.Class) -> List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[SimpleFunctionDescriptorImpl]

'getConstructorList' @ [226:110] ==> public open fun getConstructorList(): (MutableList<(ProtoBuf.Constructor..ProtoBuf.Constructor?)>..List<(ProtoBuf.Constructor..ProtoBuf.Constructor?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'isClassAffected' @ [227:21] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'isClassAffected' @ [227:39] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'differentNonPrivateConstructors' @ [227:58] ==> val differentNonPrivateConstructors: Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'isNotEmpty' @ [227:90] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'FUNCTION_LIST' @ [229:35] ==> enum entry FUNCTION_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'names' @ [230:21] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'addAll' @ [230:27] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'calcDifferenceForNonPrivateMembers' @ [230:34] ==> local final fun calcDifferenceForNonPrivateMembers(members: (ProtoBuf.Class) -> List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[SimpleFunctionDescriptorImpl]

'getFunctionList' @ [230:85] ==> public open fun getFunctionList(): (MutableList<(ProtoBuf.Function..ProtoBuf.Function?)>..List<(ProtoBuf.Function..ProtoBuf.Function?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'PROPERTY_LIST' @ [231:35] ==> enum entry PROPERTY_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'names' @ [232:21] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'addAll' @ [232:27] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'calcDifferenceForNonPrivateMembers' @ [232:34] ==> local final fun calcDifferenceForNonPrivateMembers(members: (ProtoBuf.Class) -> List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[SimpleFunctionDescriptorImpl]

'getPropertyList' @ [232:85] ==> public open fun getPropertyList(): (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'TYPE_ALIAS_LIST' @ [233:35] ==> enum entry TYPE_ALIAS_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'names' @ [234:21] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'addAll' @ [234:27] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'calcDifferenceForNonPrivateMembers' @ [234:34] ==> local final fun calcDifferenceForNonPrivateMembers(members: (ProtoBuf.Class) -> List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[SimpleFunctionDescriptorImpl]

'getTypeAliasList' @ [234:85] ==> public open fun getTypeAliasList(): (MutableList<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>..List<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'ENUM_ENTRY_LIST' @ [235:35] ==> enum entry ENUM_ENTRY_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'isClassAffected' @ [236:21] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'SEALED_SUBCLASS_FQ_NAME_LIST' @ [238:35] ==> enum entry SEALED_SUBCLASS_FQ_NAME_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'isClassAffected' @ [239:21] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'areSubclassesAffected' @ [247:21] ==> var areSubclassesAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'TYPE_TABLE' @ [249:35] ==> enum entry TYPE_TABLE defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'SINCE_KOTLIN_INFO' @ [252:57] ==> enum entry SINCE_KOTLIN_INFO defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'SINCE_KOTLIN_INFO_TABLE' @ [253:57] ==> enum entry SINCE_KOTLIN_INFO_TABLE defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'FLAGS' @ [256:35] ==> enum entry FLAGS defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'FQ_NAME' @ [257:35] ==> enum entry FQ_NAME defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'TYPE_PARAMETER_LIST' @ [258:35] ==> enum entry TYPE_PARAMETER_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'SUPERTYPE_LIST' @ [259:35] ==> enum entry SUPERTYPE_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'SUPERTYPE_ID_LIST' @ [260:35] ==> enum entry SUPERTYPE_ID_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'JS_EXT_CLASS_ANNOTATION_LIST' @ [261:35] ==> enum entry JS_EXT_CLASS_ANNOTATION_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'isClassAffected' @ [262:21] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'areSubclassesAffected' @ [263:21] ==> var areSubclassesAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'JVM_EXT_CLASS_MODULE_NAME' @ [265:35] ==> enum entry JVM_EXT_CLASS_MODULE_NAME defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'JS_EXT_CLASS_CONTAINING_FILE_ID' @ [266:35] ==> enum entry JS_EXT_CLASS_CONTAINING_FILE_ID defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'JVM_EXT_CLASS_LOCAL_VARIABLE_LIST' @ [269:35] ==> enum entry JVM_EXT_CLASS_LOCAL_VARIABLE_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufClassKind[FakeCallableDescriptorForObject]

'Difference' @ [275:16] ==> public constructor Difference(isClassAffected: Boolean = ..., areSubclassesAffected: Boolean = ..., changedMembersNames: Set<String> = ..., rawProtoDifference: EnumSet<*>? = ...) defined in org.jetbrains.kotlin.incremental.Difference[ClassConstructorDescriptorImpl]

'isClassAffected' @ [275:27] ==> var isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'areSubclassesAffected' @ [275:44] ==> var areSubclassesAffected: Boolean defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'names' @ [275:67] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'diff' @ [275:95] ==> val diff: EnumSet<ProtoCompareGenerated.ProtoBufClassKind> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForClass.difference[LocalVariableDescriptor]

'DifferenceCalculator' @ [282:5] ==> public constructor DifferenceCalculator() defined in org.jetbrains.kotlin.incremental.DifferenceCalculator[ClassConstructorDescriptorImpl]

'ProtoCompareGenerated' @ [283:34] ==> public constructor ProtoCompareGenerated(oldNameResolver: NameResolver, newNameResolver: NameResolver) defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[ClassConstructorDescriptorImpl]

'oldData' @ [283:56] ==> private final val oldData: PackagePartProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[PropertyDescriptorImpl]

'nameResolver' @ [283:64] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.PackagePartProtoData[PropertyDescriptorImpl]

'newData' @ [283:78] ==> private final val newData: PackagePartProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[PropertyDescriptorImpl]

'nameResolver' @ [283:86] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.PackagePartProtoData[PropertyDescriptorImpl]

'oldData' @ [286:24] ==> private final val oldData: PackagePartProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[PropertyDescriptorImpl]

'proto' @ [286:32] ==> public final val proto: ProtoBuf.Package defined in org.jetbrains.kotlin.incremental.PackagePartProtoData[PropertyDescriptorImpl]

'newData' @ [287:24] ==> private final val newData: PackagePartProtoData defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[PropertyDescriptorImpl]

'proto' @ [287:32] ==> public final val proto: ProtoBuf.Package defined in org.jetbrains.kotlin.incremental.PackagePartProtoData[PropertyDescriptorImpl]

'compareObject' @ [289:20] ==> protected open val compareObject: ProtoCompareGenerated defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[PropertyDescriptorImpl]

'difference' @ [289:34] ==> public final fun difference(old: ProtoBuf.Package, new: ProtoBuf.Package): EnumSet<ProtoCompareGenerated.ProtoBufPackageKind> defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated[SimpleFunctionDescriptorImpl]

'oldProto' @ [289:45] ==> val oldProto: ProtoBuf.Package defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'newProto' @ [289:55] ==> val newProto: ProtoBuf.Package defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'hashSetOf' @ [291:21] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [294:30] ==> public abstract operator fun invoke(p1: ProtoBuf.Package): List<MessageLite> defined in kotlin.Function1[FunctionInvokeDescriptor]

'oldProto' @ [294:38] ==> val oldProto: ProtoBuf.Package defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'filterNot' @ [294:48] ==> public inline fun <T> Iterable<MessageLite>.filterNot(predicate: (MessageLite) -> Boolean): List<MessageLite> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite

'it' @ [294:60] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference.calcDifferenceForNonPrivateMembers.<anonymous>[ValueParameterDescriptorImpl]

'isPrivate' @ [294:63] ==> internal val MessageLite.isPrivate: Boolean defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[PropertyDescriptorImpl]

'invoke' @ [295:30] ==> public abstract operator fun invoke(p1: ProtoBuf.Package): List<MessageLite> defined in kotlin.Function1[FunctionInvokeDescriptor]

'newProto' @ [295:38] ==> val newProto: ProtoBuf.Package defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'filterNot' @ [295:48] ==> public inline fun <T> Iterable<MessageLite>.filterNot(predicate: (MessageLite) -> Boolean): List<MessageLite> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite

'it' @ [295:60] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference.calcDifferenceForNonPrivateMembers.<anonymous>[ValueParameterDescriptorImpl]

'isPrivate' @ [295:63] ==> internal val MessageLite.isPrivate: Boolean defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[PropertyDescriptorImpl]

'calcDifferenceForMembers' @ [296:20] ==> protected final fun calcDifferenceForMembers(oldList: List<MessageLite>, newList: List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade[SimpleFunctionDescriptorImpl]

'oldMembers' @ [296:45] ==> val oldMembers: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference.calcDifferenceForNonPrivateMembers[LocalVariableDescriptor]

'newMembers' @ [296:57] ==> val newMembers: List<MessageLite> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference.calcDifferenceForNonPrivateMembers[LocalVariableDescriptor]

'diff' @ [299:22] ==> val diff: EnumSet<ProtoCompareGenerated.ProtoBufPackageKind> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'Suppress' @ [300:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (kind!!) {
                ProtoBufPackageKind.FUNCTION_LIST ->
                    names.addAll(calcDifferenceForNonPrivateMembers(ProtoBuf.Package::getFunctionList))
                ProtoBufPackageKind.PROPERTY_LIST ->
                    names.addAll(calcDifferenceForNonPrivateMembers(ProtoBuf.Package::getPropertyList))
                ProtoBufPackageKind.TYPE_ALIAS_LIST ->
                    names.addAll(calcDifferenceForNonPrivateMembers(ProtoBuf.Package::getTypeAliasList))
                ProtoBufPackageKind.TYPE_TABLE,
                ProtoBufPackageKind.SINCE_KOTLIN_INFO_TABLE,
                ProtoBufPackageKind.JVM_EXT_PACKAGE_MODULE_NAME,
                ProtoBufPackageKind.JS_EXT_PACKAGE_FQ_NAME-> {
                    // TODO
                }
                ProtoBufPackageKind.JVM_EXT_PACKAGE_LOCAL_VARIABLE_LIST -> {
                    // Not affected, local variables are not accessible outside of a file
                }
            }' @ [301:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'kind' @ [301:37] ==> val kind: (ProtoCompareGenerated.ProtoBufPackageKind..ProtoCompareGenerated.ProtoBufPackageKind?) defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'FUNCTION_LIST' @ [302:37] ==> enum entry FUNCTION_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'names' @ [303:21] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'addAll' @ [303:27] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'calcDifferenceForNonPrivateMembers' @ [303:34] ==> local final fun calcDifferenceForNonPrivateMembers(members: (ProtoBuf.Package) -> List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[SimpleFunctionDescriptorImpl]

'getFunctionList' @ [303:87] ==> public open fun getFunctionList(): (MutableList<(ProtoBuf.Function..ProtoBuf.Function?)>..List<(ProtoBuf.Function..ProtoBuf.Function?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]

'PROPERTY_LIST' @ [304:37] ==> enum entry PROPERTY_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'names' @ [305:21] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'addAll' @ [305:27] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'calcDifferenceForNonPrivateMembers' @ [305:34] ==> local final fun calcDifferenceForNonPrivateMembers(members: (ProtoBuf.Package) -> List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[SimpleFunctionDescriptorImpl]

'getPropertyList' @ [305:87] ==> public open fun getPropertyList(): (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]

'TYPE_ALIAS_LIST' @ [306:37] ==> enum entry TYPE_ALIAS_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'names' @ [307:21] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'addAll' @ [307:27] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'calcDifferenceForNonPrivateMembers' @ [307:34] ==> local final fun calcDifferenceForNonPrivateMembers(members: (ProtoBuf.Package) -> List<MessageLite>): Collection<String> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[SimpleFunctionDescriptorImpl]

'getTypeAliasList' @ [307:87] ==> public open fun getTypeAliasList(): (MutableList<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>..List<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]

'TYPE_TABLE' @ [308:37] ==> enum entry TYPE_TABLE defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'SINCE_KOTLIN_INFO_TABLE' @ [309:37] ==> enum entry SINCE_KOTLIN_INFO_TABLE defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'JVM_EXT_PACKAGE_MODULE_NAME' @ [310:37] ==> enum entry JVM_EXT_PACKAGE_MODULE_NAME defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'JS_EXT_PACKAGE_FQ_NAME' @ [311:37] ==> enum entry JS_EXT_PACKAGE_FQ_NAME defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'JVM_EXT_PACKAGE_LOCAL_VARIABLE_LIST' @ [314:37] ==> enum entry JVM_EXT_PACKAGE_LOCAL_VARIABLE_LIST defined in org.jetbrains.kotlin.incremental.ProtoCompareGenerated.ProtoBufPackageKind[FakeCallableDescriptorForObject]

'Difference' @ [320:16] ==> public constructor Difference(isClassAffected: Boolean = ..., areSubclassesAffected: Boolean = ..., changedMembersNames: Set<String> = ..., rawProtoDifference: EnumSet<*>? = ...) defined in org.jetbrains.kotlin.incremental.Difference[ClassConstructorDescriptorImpl]

'names' @ [320:49] ==> val names: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'diff' @ [320:77] ==> val diff: EnumSet<ProtoCompareGenerated.ProtoBufPackageKind> defined in org.jetbrains.kotlin.incremental.DifferenceCalculatorForPackageFacade.difference[LocalVariableDescriptor]

'==' @ [325:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[DeserializedSimpleFunctionDescriptor]

'SEALED' @ [325:31] ==> enum entry SEALED defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'MODALITY' @ [325:47] ==> public final val MODALITY: (Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>..Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [325:56] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Modality..ProtoBuf.Modality?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [325:60] ==> public final val ProtoBuf.Class.flags: Int[MyPropertyDescriptor]

