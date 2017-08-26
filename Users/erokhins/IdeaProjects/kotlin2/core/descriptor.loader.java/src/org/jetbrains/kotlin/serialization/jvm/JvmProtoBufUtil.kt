'run' @ [28:53] ==> @InlineOnly public inline fun <T, R> JvmProtoBufUtil.run(block: JvmProtoBufUtil.() -> (ExtensionRegistryLite..ExtensionRegistryLite?)): (ExtensionRegistryLite..ExtensionRegistryLite?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmProtoBufUtil
    <R> -> (org.jetbrains.kotlin.protobuf.ExtensionRegistryLite..org.jetbrains.kotlin.protobuf.ExtensionRegistryLite?)

'newInstance' @ [29:46] ==> public open fun newInstance(): (ExtensionRegistryLite..ExtensionRegistryLite?) defined in org.jetbrains.kotlin.protobuf.ExtensionRegistryLite[JavaMethodDescriptor]

'registerAllExtensions' @ [30:21] ==> public open fun registerAllExtensions(registry: (ExtensionRegistryLite..ExtensionRegistryLite?)): Unit defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaMethodDescriptor]

'registry' @ [30:43] ==> val registry: (ExtensionRegistryLite..ExtensionRegistryLite?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.EXTENSION_REGISTRY.<anonymous>[LocalVariableDescriptor]

'registry' @ [31:9] ==> val registry: (ExtensionRegistryLite..ExtensionRegistryLite?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.EXTENSION_REGISTRY.<anonymous>[LocalVariableDescriptor]

'JvmStatic' @ [34:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'readClassDataFrom' @ [35:13] ==> @JvmStatic public final fun readClassDataFrom(bytes: ByteArray, strings: Array<String>): ClassData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'decodeBytes' @ [35:43] ==> @NotNull public open fun decodeBytes(@NotNull data: (Array<(String..String?)>..Array<out (String..String?)>)): ByteArray defined in org.jetbrains.kotlin.serialization.jvm.BitEncoding[JavaMethodDescriptor]

'data' @ [35:55] ==> value-parameter data: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[ValueParameterDescriptorImpl]

'strings' @ [35:62] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[ValueParameterDescriptorImpl]

'JvmStatic' @ [37:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ByteArrayInputStream' @ [38:21] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'bytes' @ [38:42] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[ValueParameterDescriptorImpl]

'JvmNameResolver' @ [39:28] ==> public constructor JvmNameResolver(types: JvmProtoBuf.StringTableTypes, strings: Array<String>) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[ClassConstructorDescriptorImpl]

'parseDelimitedFrom' @ [39:73] ==> public open fun parseDelimitedFrom(input: (InputStream..InputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (JvmProtoBuf.StringTableTypes..JvmProtoBuf.StringTableTypes?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes[JavaMethodDescriptor]

'input' @ [39:92] ==> val input: ByteArrayInputStream defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[LocalVariableDescriptor]

'EXTENSION_REGISTRY' @ [39:99] ==> public final val EXTENSION_REGISTRY: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[PropertyDescriptorImpl]

'strings' @ [39:120] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[ValueParameterDescriptorImpl]

'parseFrom' @ [40:41] ==> public open fun parseFrom(p0: (InputStream..InputStream?), p1: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'input' @ [40:51] ==> val input: ByteArrayInputStream defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[LocalVariableDescriptor]

'EXTENSION_REGISTRY' @ [40:58] ==> public final val EXTENSION_REGISTRY: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[PropertyDescriptorImpl]

'ClassData' @ [41:16] ==> public constructor ClassData(nameResolver: NameResolver, classProto: ProtoBuf.Class) defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedClassConstructorDescriptor]

'nameResolver' @ [41:26] ==> val nameResolver: JvmNameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[LocalVariableDescriptor]

'classProto' @ [41:40] ==> val classProto: (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readClassDataFrom[LocalVariableDescriptor]

'JvmStatic' @ [44:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'readPackageDataFrom' @ [45:13] ==> @JvmStatic public final fun readPackageDataFrom(bytes: ByteArray, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'decodeBytes' @ [45:45] ==> @NotNull public open fun decodeBytes(@NotNull data: (Array<(String..String?)>..Array<out (String..String?)>)): ByteArray defined in org.jetbrains.kotlin.serialization.jvm.BitEncoding[JavaMethodDescriptor]

'data' @ [45:57] ==> value-parameter data: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[ValueParameterDescriptorImpl]

'strings' @ [45:64] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[ValueParameterDescriptorImpl]

'JvmStatic' @ [47:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ByteArrayInputStream' @ [48:21] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'bytes' @ [48:42] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[ValueParameterDescriptorImpl]

'JvmNameResolver' @ [49:28] ==> public constructor JvmNameResolver(types: JvmProtoBuf.StringTableTypes, strings: Array<String>) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[ClassConstructorDescriptorImpl]

'parseDelimitedFrom' @ [49:73] ==> public open fun parseDelimitedFrom(input: (InputStream..InputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (JvmProtoBuf.StringTableTypes..JvmProtoBuf.StringTableTypes?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes[JavaMethodDescriptor]

'input' @ [49:92] ==> val input: ByteArrayInputStream defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[LocalVariableDescriptor]

'EXTENSION_REGISTRY' @ [49:99] ==> public final val EXTENSION_REGISTRY: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[PropertyDescriptorImpl]

'strings' @ [49:120] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[ValueParameterDescriptorImpl]

'parseFrom' @ [50:45] ==> public open fun parseFrom(p0: (InputStream..InputStream?), p1: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]

'input' @ [50:55] ==> val input: ByteArrayInputStream defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[LocalVariableDescriptor]

'EXTENSION_REGISTRY' @ [50:62] ==> public final val EXTENSION_REGISTRY: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[PropertyDescriptorImpl]

'PackageData' @ [51:16] ==> public constructor PackageData(nameResolver: NameResolver, packageProto: ProtoBuf.Package) defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedClassConstructorDescriptor]

'nameResolver' @ [51:28] ==> val nameResolver: JvmNameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[LocalVariableDescriptor]

'packageProto' @ [51:42] ==> val packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.readPackageDataFrom[LocalVariableDescriptor]

'if (proto.hasExtension(JvmProtoBuf.methodSignature)) proto.getExtension(JvmProtoBuf.methodSignature) else null' @ [61:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmProtoBuf.JvmMethodSignature?, elseBranch: JvmProtoBuf.JvmMethodSignature?): JvmProtoBuf.JvmMethodSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmMethodSignature?

'proto' @ [61:21] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'hasExtension' @ [61:27] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature?)

'methodSignature' @ [61:52] ==> public final val methodSignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'proto' @ [61:70] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'getExtension' @ [61:76] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?)): (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature?)

'methodSignature' @ [61:101] ==> public final val methodSignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'if (signature != null && signature.hasName()) signature.name else proto.name' @ [62:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'signature' @ [62:24] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'signature' @ [62:45] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'hasName' @ [62:55] ==> public open fun hasName(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature[JavaMethodDescriptor]

'signature' @ [62:66] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'name' @ [62:76] ==> public final val JvmProtoBuf.JvmMethodSignature.name: Int[MyPropertyDescriptor]

'proto' @ [62:86] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'name' @ [62:92] ==> public final val ProtoBuf.Function.name: Int[MyPropertyDescriptor]

'if (signature != null && signature.hasDesc()) {
            nameResolver.getString(signature.desc)
        }
        else {
            val parameterTypes = listOfNotNull(proto.receiverType(typeTable)) + proto.valueParameterList.map { it.type(typeTable) }

            val parametersDesc = parameterTypes.map { mapTypeDefault(it, nameResolver) ?: return null }
            val returnTypeDesc = mapTypeDefault(proto.returnType(typeTable), nameResolver) ?: return null

            parametersDesc.joinToString(separator = "", prefix = "(", postfix = ")") + returnTypeDesc
        }' @ [63:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'signature' @ [63:24] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'signature' @ [63:45] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'hasDesc' @ [63:55] ==> public open fun hasDesc(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature[JavaMethodDescriptor]

'nameResolver' @ [64:13] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'getString' @ [64:26] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'signature' @ [64:36] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'desc' @ [64:46] ==> public final val JvmProtoBuf.JvmMethodSignature.desc: Int[MyPropertyDescriptor]

'listOfNotNull' @ [67:34] ==> public fun <T : Any> listOfNotNull(element: ProtoBuf.Type?): List<ProtoBuf.Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Type

'proto' @ [67:48] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'receiverType' @ [67:54] ==> public fun ProtoBuf.Function.receiverType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'typeTable' @ [67:67] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'proto' @ [67:81] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'valueParameterList' @ [67:87] ==> public final val ProtoBuf.Function.valueParameterList: (MutableList<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>..List<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>?)[MyPropertyDescriptor]

'map' @ [67:106] ==> public inline fun <T, R> Iterable<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>.map(transform: ((ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)) -> ProtoBuf.Type): List<ProtoBuf.Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter..org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter?)
    <R> -> Type

'it' @ [67:112] ==> value-parameter it: (ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [67:115] ==> public fun ProtoBuf.ValueParameter.type(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'typeTable' @ [67:120] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'parameterTypes' @ [69:34] ==> val parameterTypes: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'map' @ [69:49] ==> public inline fun <T, R> Iterable<ProtoBuf.Type>.map(transform: (ProtoBuf.Type) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> String

'mapTypeDefault' @ [69:55] ==> private final fun mapTypeDefault(type: ProtoBuf.Type, nameResolver: NameResolver): String? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'it' @ [69:70] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [69:74] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'mapTypeDefault' @ [70:34] ==> private final fun mapTypeDefault(type: ProtoBuf.Type, nameResolver: NameResolver): String? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'proto' @ [70:49] ==> value-parameter proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'returnType' @ [70:55] ==> public fun ProtoBuf.Function.returnType(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'typeTable' @ [70:66] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'nameResolver' @ [70:78] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'parametersDesc' @ [72:13] ==> val parametersDesc: List<String> defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'joinToString' @ [72:28] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'returnTypeDesc' @ [72:88] ==> val returnTypeDesc: String defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'nameResolver' @ [74:16] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[ValueParameterDescriptorImpl]

'getString' @ [74:29] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'name' @ [74:39] ==> val name: Int defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'desc' @ [74:47] ==> val desc: String defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmMethodSignature[LocalVariableDescriptor]

'if (proto.hasExtension(JvmProtoBuf.constructorSignature)) proto.getExtension(JvmProtoBuf.constructorSignature) else null' @ [83:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmProtoBuf.JvmMethodSignature?, elseBranch: JvmProtoBuf.JvmMethodSignature?): JvmProtoBuf.JvmMethodSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmMethodSignature?

'proto' @ [83:21] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[ValueParameterDescriptorImpl]

'hasExtension' @ [83:27] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature?)

'constructorSignature' @ [83:52] ==> public final val constructorSignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'proto' @ [83:75] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[ValueParameterDescriptorImpl]

'getExtension' @ [83:81] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?)): (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature?)

'constructorSignature' @ [83:106] ==> public final val constructorSignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'if (signature != null && signature.hasDesc()) {
            nameResolver.getString(signature.desc)
        }
        else {
            proto.valueParameterList.map {
                mapTypeDefault(it.type(typeTable), nameResolver) ?: return null
            }.joinToString(separator = "", prefix = "(", postfix = ")V")
        }' @ [84:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'signature' @ [84:24] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[LocalVariableDescriptor]

'signature' @ [84:45] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[LocalVariableDescriptor]

'hasDesc' @ [84:55] ==> public open fun hasDesc(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmMethodSignature[JavaMethodDescriptor]

'nameResolver' @ [85:13] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[ValueParameterDescriptorImpl]

'getString' @ [85:26] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'signature' @ [85:36] ==> val signature: JvmProtoBuf.JvmMethodSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[LocalVariableDescriptor]

'desc' @ [85:46] ==> public final val JvmProtoBuf.JvmMethodSignature.desc: Int[MyPropertyDescriptor]

'proto' @ [88:13] ==> value-parameter proto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[ValueParameterDescriptorImpl]

'valueParameterList' @ [88:19] ==> public final val ProtoBuf.Constructor.valueParameterList: (MutableList<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>..List<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>?)[MyPropertyDescriptor]

'map' @ [88:38] ==> public inline fun <T, R> Iterable<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)>.map(transform: ((ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter..org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter?)
    <R> -> String

'mapTypeDefault' @ [89:17] ==> private final fun mapTypeDefault(type: ProtoBuf.Type, nameResolver: NameResolver): String? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'it' @ [89:32] ==> value-parameter it: (ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [89:35] ==> public fun ProtoBuf.ValueParameter.type(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'typeTable' @ [89:40] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[ValueParameterDescriptorImpl]

'nameResolver' @ [89:52] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[ValueParameterDescriptorImpl]

'joinToString' @ [90:15] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [92:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'desc' @ [92:27] ==> val desc: String defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmConstructorSignature[LocalVariableDescriptor]

'if (proto.hasExtension(JvmProtoBuf.propertySignature)) proto.getExtension(JvmProtoBuf.propertySignature) else return null' @ [101:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?), elseBranch: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)): (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature?)

'proto' @ [101:21] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'hasExtension' @ [101:27] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature?)

'propertySignature' @ [101:52] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'proto' @ [101:72] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'getExtension' @ [101:78] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature..org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature?)

'propertySignature' @ [101:103] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'if (signature.hasField()) signature.field else null' @ [103:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmProtoBuf.JvmFieldSignature?, elseBranch: JvmProtoBuf.JvmFieldSignature?): JvmProtoBuf.JvmFieldSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmFieldSignature?

'signature' @ [103:21] ==> val signature: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'hasField' @ [103:31] ==> public open fun hasField(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature[JavaMethodDescriptor]

'signature' @ [103:43] ==> val signature: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'field' @ [103:53] ==> public final val JvmProtoBuf.JvmPropertySignature.field: (JvmProtoBuf.JvmFieldSignature..JvmProtoBuf.JvmFieldSignature?)[MyPropertyDescriptor]

'if (field != null && field.hasName()) field.name else proto.name' @ [105:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'field' @ [105:24] ==> val field: JvmProtoBuf.JvmFieldSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'field' @ [105:41] ==> val field: JvmProtoBuf.JvmFieldSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'hasName' @ [105:47] ==> public open fun hasName(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmFieldSignature[JavaMethodDescriptor]

'field' @ [105:58] ==> val field: JvmProtoBuf.JvmFieldSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'name' @ [105:64] ==> public final val JvmProtoBuf.JvmFieldSignature.name: Int[MyPropertyDescriptor]

'proto' @ [105:74] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'name' @ [105:80] ==> public final val ProtoBuf.Property.name: Int[MyPropertyDescriptor]

'if (field != null && field.hasDesc()) nameResolver.getString(field.desc)
                else mapTypeDefault(proto.returnType(typeTable), nameResolver) ?: return null' @ [107:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'field' @ [107:21] ==> val field: JvmProtoBuf.JvmFieldSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'field' @ [107:38] ==> val field: JvmProtoBuf.JvmFieldSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'hasDesc' @ [107:44] ==> public open fun hasDesc(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmFieldSignature[JavaMethodDescriptor]

'nameResolver' @ [107:55] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'getString' @ [107:68] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'field' @ [107:78] ==> val field: JvmProtoBuf.JvmFieldSignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'desc' @ [107:84] ==> public final val JvmProtoBuf.JvmFieldSignature.desc: Int[MyPropertyDescriptor]

'mapTypeDefault' @ [108:22] ==> private final fun mapTypeDefault(type: ProtoBuf.Type, nameResolver: NameResolver): String? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'proto' @ [108:37] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'returnType' @ [108:43] ==> public fun ProtoBuf.Property.returnType(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'typeTable' @ [108:54] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'nameResolver' @ [108:66] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'PropertySignature' @ [110:16] ==> public constructor PropertySignature(name: String, desc: String) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.PropertySignature[ClassConstructorDescriptorImpl]

'nameResolver' @ [110:34] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[ValueParameterDescriptorImpl]

'getString' @ [110:47] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'name' @ [110:57] ==> val name: Int defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'desc' @ [110:64] ==> val desc: String defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.getJvmFieldSignature[LocalVariableDescriptor]

'if (type.hasClassName()) ClassMapperLite.mapClass(nameResolver.getClassId(type.className)) else null' @ [116:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'type' @ [116:20] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.mapTypeDefault[ValueParameterDescriptorImpl]

'hasClassName' @ [116:25] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'mapClass' @ [116:57] ==> @JvmStatic public final fun mapClass(classId: ClassId): String defined in org.jetbrains.kotlin.serialization.jvm.ClassMapperLite[SimpleFunctionDescriptorImpl]

'nameResolver' @ [116:66] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.mapTypeDefault[ValueParameterDescriptorImpl]

'getClassId' @ [116:79] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'type' @ [116:90] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.mapTypeDefault[ValueParameterDescriptorImpl]

'className' @ [116:95] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

