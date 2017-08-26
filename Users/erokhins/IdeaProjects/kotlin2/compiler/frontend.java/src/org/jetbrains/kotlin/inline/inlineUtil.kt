'header' @ [30:26] ==> value-parameter header: KotlinClassHeader defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[ValueParameterDescriptorImpl]

'data' @ [30:33] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'emptySet' @ [30:48] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'header' @ [31:19] ==> value-parameter header: KotlinClassHeader defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[ValueParameterDescriptorImpl]

'strings' @ [31:26] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'emptySet' @ [31:44] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'when (header.kind) {
        KotlinClassHeader.Kind.CLASS -> {
            val (nameResolver, classProto) = JvmProtoBufUtil.readClassDataFrom(BitEncoding.decodeBytes(annotationData), strings)
            inlineFunctionsJvmNames(classProto.functionList, nameResolver, classProto.typeTable) +
            inlineAccessorsJvmNames(classProto.propertyList, nameResolver)
        }
        KotlinClassHeader.Kind.FILE_FACADE,
        KotlinClassHeader.Kind.MULTIFILE_CLASS_PART -> {
            val (nameResolver, packageProto) = JvmProtoBufUtil.readPackageDataFrom(BitEncoding.decodeBytes(annotationData), strings)
            inlineFunctionsJvmNames(packageProto.functionList, nameResolver, packageProto.typeTable) +
            inlineAccessorsJvmNames(packageProto.propertyList, nameResolver)
        }
        else -> emptySet()
    }' @ [33:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Set<String>, entry1: Set<String>, entry2: Set<String>): Set<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Set<String>

'header' @ [33:18] ==> value-parameter header: KotlinClassHeader defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[ValueParameterDescriptorImpl]

'kind' @ [33:25] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'CLASS' @ [34:32] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'component1' @ [35:18] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedSimpleFunctionDescriptor]

'component2' @ [35:32] ==> public final operator fun component2(): ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedSimpleFunctionDescriptor]

'JvmProtoBufUtil' @ [35:46] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readClassDataFrom' @ [35:62] ==> @JvmStatic public final fun readClassDataFrom(bytes: ByteArray, strings: Array<String>): ClassData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'decodeBytes' @ [35:92] ==> @NotNull public open fun decodeBytes(@NotNull p0: (Array<(String..String?)>..Array<out (String..String?)>)): ByteArray defined in org.jetbrains.kotlin.serialization.jvm.BitEncoding[JavaMethodDescriptor]

'annotationData' @ [35:104] ==> val annotationData: Array<String> defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'strings' @ [35:121] ==> val strings: Array<String> defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'inlineFunctionsJvmNames' @ [36:13] ==> private fun inlineFunctionsJvmNames(functions: List<ProtoBuf.Function>, nameResolver: NameResolver, protoTypeTable: ProtoBuf.TypeTable): Set<String> defined in org.jetbrains.kotlin.inline[SimpleFunctionDescriptorImpl]

'classProto' @ [36:37] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'functionList' @ [36:48] ==> public final val ProtoBuf.Class.functionList: (MutableList<(ProtoBuf.Function..ProtoBuf.Function?)>..List<(ProtoBuf.Function..ProtoBuf.Function?)>?)[MyPropertyDescriptor]

'nameResolver' @ [36:62] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'classProto' @ [36:76] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'typeTable' @ [36:87] ==> public final val ProtoBuf.Class.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'inlineAccessorsJvmNames' @ [37:13] ==> private fun inlineAccessorsJvmNames(properties: List<ProtoBuf.Property>, nameResolver: NameResolver): Set<String> defined in org.jetbrains.kotlin.inline[SimpleFunctionDescriptorImpl]

'classProto' @ [37:37] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'propertyList' @ [37:48] ==> public final val ProtoBuf.Class.propertyList: (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)[MyPropertyDescriptor]

'nameResolver' @ [37:62] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'FILE_FACADE' @ [39:32] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS_PART' @ [40:32] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'component1' @ [41:18] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedSimpleFunctionDescriptor]

'component2' @ [41:32] ==> public final operator fun component2(): ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedSimpleFunctionDescriptor]

'JvmProtoBufUtil' @ [41:48] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readPackageDataFrom' @ [41:64] ==> @JvmStatic public final fun readPackageDataFrom(bytes: ByteArray, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'decodeBytes' @ [41:96] ==> @NotNull public open fun decodeBytes(@NotNull p0: (Array<(String..String?)>..Array<out (String..String?)>)): ByteArray defined in org.jetbrains.kotlin.serialization.jvm.BitEncoding[JavaMethodDescriptor]

'annotationData' @ [41:108] ==> val annotationData: Array<String> defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'strings' @ [41:125] ==> val strings: Array<String> defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'inlineFunctionsJvmNames' @ [42:13] ==> private fun inlineFunctionsJvmNames(functions: List<ProtoBuf.Function>, nameResolver: NameResolver, protoTypeTable: ProtoBuf.TypeTable): Set<String> defined in org.jetbrains.kotlin.inline[SimpleFunctionDescriptorImpl]

'packageProto' @ [42:37] ==> val packageProto: ProtoBuf.Package defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'functionList' @ [42:50] ==> public final val ProtoBuf.Package.functionList: (MutableList<(ProtoBuf.Function..ProtoBuf.Function?)>..List<(ProtoBuf.Function..ProtoBuf.Function?)>?)[MyPropertyDescriptor]

'nameResolver' @ [42:64] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'packageProto' @ [42:78] ==> val packageProto: ProtoBuf.Package defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'typeTable' @ [42:91] ==> public final val ProtoBuf.Package.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'inlineAccessorsJvmNames' @ [43:13] ==> private fun inlineAccessorsJvmNames(properties: List<ProtoBuf.Property>, nameResolver: NameResolver): Set<String> defined in org.jetbrains.kotlin.inline[SimpleFunctionDescriptorImpl]

'packageProto' @ [43:37] ==> val packageProto: ProtoBuf.Package defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'propertyList' @ [43:50] ==> public final val ProtoBuf.Package.propertyList: (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)[MyPropertyDescriptor]

'nameResolver' @ [43:64] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'emptySet' @ [45:17] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TypeTable' @ [50:21] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[DeserializedClassConstructorDescriptor]

'protoTypeTable' @ [50:31] ==> value-parameter protoTypeTable: ProtoBuf.TypeTable defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[ValueParameterDescriptorImpl]

'functions' @ [51:27] ==> value-parameter functions: List<ProtoBuf.Function> defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[ValueParameterDescriptorImpl]

'filter' @ [51:37] ==> public inline fun <T> Iterable<ProtoBuf.Function>.filter(predicate: (ProtoBuf.Function) -> Boolean): List<ProtoBuf.Function> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function

'IS_INLINE' @ [51:52] ==> public final val IS_INLINE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [51:62] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'it' @ [51:66] ==> value-parameter it: ProtoBuf.Function defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'flags' @ [51:69] ==> public final val ProtoBuf.Function.flags: Int[MyPropertyDescriptor]

'inlineFunctions' @ [52:20] ==> val inlineFunctions: List<ProtoBuf.Function> defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'mapNotNull' @ [52:36] ==> public inline fun <T, R : Any> Iterable<ProtoBuf.Function>.mapNotNull(transform: (ProtoBuf.Function) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function
    <R : Any> -> String

'JvmProtoBufUtil' @ [53:9] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'getJvmMethodSignature' @ [53:25] ==> public final fun getJvmMethodSignature(proto: ProtoBuf.Function, nameResolver: NameResolver, typeTable: TypeTable): String? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [53:47] ==> value-parameter it: ProtoBuf.Function defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [53:51] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[ValueParameterDescriptorImpl]

'typeTable' @ [53:65] ==> val typeTable: TypeTable defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'jvmNames' @ [55:12] ==> val jvmNames: List<String> defined in org.jetbrains.kotlin.inline.inlineFunctionsJvmNames[LocalVariableDescriptor]

'toSet' @ [55:21] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'properties' @ [59:41] ==> value-parameter properties: List<ProtoBuf.Property> defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames[ValueParameterDescriptorImpl]

'filter' @ [59:52] ==> public inline fun <T> Iterable<ProtoBuf.Property>.filter(predicate: (ProtoBuf.Property) -> Boolean): List<ProtoBuf.Property> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Property

'proto' @ [60:9] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'hasGetterFlags' @ [60:15] ==> public open fun hasGetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_INLINE_ACCESSOR' @ [60:41] ==> public final val IS_INLINE_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [60:60] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'proto' @ [60:64] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'getterFlags' @ [60:70] ==> public final val ProtoBuf.Property.getterFlags: Int[MyPropertyDescriptor]

'proto' @ [61:9] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'hasSetterFlags' @ [61:15] ==> public open fun hasSetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_INLINE_ACCESSOR' @ [61:41] ==> public final val IS_INLINE_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [61:60] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'proto' @ [61:64] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'setterFlags' @ [61:70] ==> public final val ProtoBuf.Property.setterFlags: Int[MyPropertyDescriptor]

'arrayListOf' @ [63:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<JvmProtoBuf.JvmMethodSignature> /* = ArrayList<JvmProtoBuf.JvmMethodSignature> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmMethodSignature

'propertiesWithInlineAccessors' @ [64:5] ==> val propertiesWithInlineAccessors: List<ProtoBuf.Property> defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames[LocalVariableDescriptor]

'forEach' @ [64:35] ==> @HidesMembers public inline fun <T> Iterable<ProtoBuf.Property>.forEach(action: (ProtoBuf.Property) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Property

'proto' @ [65:13] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'hasExtension' @ [65:19] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> JvmPropertySignature

'propertySignature' @ [65:44] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'proto' @ [66:29] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'getExtension' @ [66:35] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> JvmPropertySignature

'propertySignature' @ [66:60] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'proto' @ [67:17] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'hasGetterFlags' @ [67:23] ==> public open fun hasGetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_INLINE_ACCESSOR' @ [67:49] ==> public final val IS_INLINE_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [67:68] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'proto' @ [67:72] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'getterFlags' @ [67:78] ==> public final val ProtoBuf.Property.getterFlags: Int[MyPropertyDescriptor]

'inlineAccessors' @ [68:17] ==> val inlineAccessors: ArrayList<JvmProtoBuf.JvmMethodSignature> /* = ArrayList<JvmProtoBuf.JvmMethodSignature> */ defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames[LocalVariableDescriptor]

'add' @ [68:33] ==> public open fun add(element: JvmProtoBuf.JvmMethodSignature): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'signature' @ [68:37] ==> val signature: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[LocalVariableDescriptor]

'getter' @ [68:47] ==> public final val JvmProtoBuf.JvmPropertySignature.getter: (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)[MyPropertyDescriptor]

'proto' @ [71:17] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'hasSetterFlags' @ [71:23] ==> public open fun hasSetterFlags(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'IS_INLINE_ACCESSOR' @ [71:49] ==> public final val IS_INLINE_ACCESSOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [71:68] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'proto' @ [71:72] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'setterFlags' @ [71:78] ==> public final val ProtoBuf.Property.setterFlags: Int[MyPropertyDescriptor]

'inlineAccessors' @ [72:17] ==> val inlineAccessors: ArrayList<JvmProtoBuf.JvmMethodSignature> /* = ArrayList<JvmProtoBuf.JvmMethodSignature> */ defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames[LocalVariableDescriptor]

'add' @ [72:33] ==> public open fun add(element: JvmProtoBuf.JvmMethodSignature): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'signature' @ [72:37] ==> val signature: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[LocalVariableDescriptor]

'setter' @ [72:47] ==> public final val JvmProtoBuf.JvmPropertySignature.setter: (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)[MyPropertyDescriptor]

'inlineAccessors' @ [77:12] ==> val inlineAccessors: ArrayList<JvmProtoBuf.JvmMethodSignature> /* = ArrayList<JvmProtoBuf.JvmMethodSignature> */ defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames[LocalVariableDescriptor]

'map' @ [77:28] ==> public inline fun <T, R> Iterable<JvmProtoBuf.JvmMethodSignature>.map(transform: (JvmProtoBuf.JvmMethodSignature) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmMethodSignature
    <R> -> String

'nameResolver' @ [78:9] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames[ValueParameterDescriptorImpl]

'getString' @ [78:22] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [78:32] ==> value-parameter it: JvmProtoBuf.JvmMethodSignature defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [78:35] ==> public final val JvmProtoBuf.JvmMethodSignature.name: Int[MyPropertyDescriptor]

'nameResolver' @ [78:43] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames[ValueParameterDescriptorImpl]

'getString' @ [78:56] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [78:66] ==> value-parameter it: JvmProtoBuf.JvmMethodSignature defined in org.jetbrains.kotlin.inline.inlineAccessorsJvmNames.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [78:69] ==> public final val JvmProtoBuf.JvmMethodSignature.desc: Int[MyPropertyDescriptor]

'toSet' @ [79:7] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

