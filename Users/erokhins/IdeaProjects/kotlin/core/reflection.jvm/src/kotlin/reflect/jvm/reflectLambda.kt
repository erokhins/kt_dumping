'Suppress' @ [17:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'javaClass' @ [39:22] ==> public val <T : Any> Function<R>.javaClass: Class<Function<R>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Function<R>

'getAnnotation' @ [39:32] ==> public open fun <A : (Annotation..Annotation?)> getAnnotation(p0: (Class<(Metadata..Metadata?)>..Class<(Metadata..Metadata?)>?)): (Metadata..Metadata?) defined in java.lang.Class[JavaMethodDescriptor]
Inferred types:
    <A : (Annotation..Annotation?)> -> Metadata

'Metadata' @ [39:46] ==> public constructor Metadata(k: Int = ..., mv: IntArray = ..., bv: IntArray = ..., d1: Array<String> = ..., d2: Array<String> = ..., xs: String = ..., xi: Int = ...) defined in kotlin.Metadata[DeserializedClassConstructorDescriptor]

'java' @ [39:62] ==> public val <T> KClass<Metadata>.java: Class<Metadata> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Metadata

'annotation' @ [40:16] ==> val annotation: Metadata defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'd1' @ [40:27] ==> public final val d1: Array<String> defined in kotlin.Metadata[DeserializedPropertyDescriptor]

'takeUnless' @ [40:30] ==> @InlineOnly @SinceKotlin public inline fun <T> Array<String>.takeUnless(predicate: (Array<String>) -> Boolean): Array<String>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<String>

'Array' @ [40:41] ==> public constructor Array<T>(size: Int, init: (Int) -> Any?) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Any?

'decodeBytes' @ [41:29] ==> @NotNull public open fun decodeBytes(@NotNull data: (Array<(String..String?)>..Array<out (String..String?)>)): ByteArray defined in org.jetbrains.kotlin.serialization.jvm.BitEncoding[JavaMethodDescriptor]

'data' @ [41:41] ==> val data: Array<String> defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'inputStream' @ [41:47] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'parseDelimitedFrom' @ [42:57] ==> public open fun parseDelimitedFrom(input: (InputStream..InputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (JvmProtoBuf.StringTableTypes..JvmProtoBuf.StringTableTypes?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.StringTableTypes[JavaMethodDescriptor]

'input' @ [42:76] ==> val input: ByteArrayInputStream defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'JvmProtoBufUtil' @ [42:83] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'EXTENSION_REGISTRY' @ [42:99] ==> public final val EXTENSION_REGISTRY: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[PropertyDescriptorImpl]

'JvmNameResolver' @ [43:24] ==> public constructor JvmNameResolver(types: JvmProtoBuf.StringTableTypes, strings: Array<String>) defined in org.jetbrains.kotlin.load.kotlin.JvmNameResolver[ClassConstructorDescriptorImpl]

'stringTableTypes' @ [43:40] ==> val stringTableTypes: (JvmProtoBuf.StringTableTypes..JvmProtoBuf.StringTableTypes?) defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'annotation' @ [43:58] ==> val annotation: Metadata defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'd2' @ [43:69] ==> public final val d2: Array<String> defined in kotlin.Metadata[DeserializedPropertyDescriptor]

'parseFrom' @ [44:35] ==> public open fun parseFrom(input: (InputStream..InputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.Function..ProtoBuf.Function?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'input' @ [44:45] ==> val input: ByteArrayInputStream defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'JvmProtoBufUtil' @ [44:52] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'EXTENSION_REGISTRY' @ [44:68] ==> public final val EXTENSION_REGISTRY: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[PropertyDescriptorImpl]

'deserializeToDescriptor' @ [46:22] ==> internal fun <M : MessageLite, D : CallableDescriptor> deserializeToDescriptor(moduleAnchor: Class<*>, proto: (ProtoBuf.Function..ProtoBuf.Function?), nameResolver: NameResolver, typeTable: TypeTable, createDescriptor: MemberDeserializer.((ProtoBuf.Function..ProtoBuf.Function?)) -> SimpleFunctionDescriptor): SimpleFunctionDescriptor? defined in kotlin.reflect.jvm.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Function..org.jetbrains.kotlin.serialization.ProtoBuf.Function?)
    <D : CallableDescriptor> -> SimpleFunctionDescriptor

'javaClass' @ [46:46] ==> public val <T : Any> Function<R>.javaClass: Class<Function<R>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Function<R>

'proto' @ [46:57] ==> val proto: (ProtoBuf.Function..ProtoBuf.Function?) defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'nameResolver' @ [46:64] ==> val nameResolver: JvmNameResolver defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'TypeTable' @ [46:78] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[ClassConstructorDescriptorImpl]

'proto' @ [46:88] ==> val proto: (ProtoBuf.Function..ProtoBuf.Function?) defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

'typeTable' @ [46:94] ==> public final val ProtoBuf.Function.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'MemberDeserializer' @ [46:106] ==> public constructor MemberDeserializer(c: DeserializationContext) defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[ClassConstructorDescriptorImpl]

'Suppress' @ [49:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'KFunctionImpl' @ [50:12] ==> public constructor KFunctionImpl(container: KDeclarationContainerImpl, descriptor: FunctionDescriptor) defined in kotlin.reflect.jvm.internal.KFunctionImpl[ClassConstructorDescriptorImpl]

'EmptyContainerForLocal' @ [50:26] ==> internal object EmptyContainerForLocal : KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal in file EmptyContainerForLocal.kt[FakeCallableDescriptorForObject]

'descriptor' @ [50:50] ==> val descriptor: SimpleFunctionDescriptor defined in kotlin.reflect.jvm.reflect[LocalVariableDescriptor]

