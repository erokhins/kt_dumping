'Inject' @ [36:5] ==> public constructor Inject() defined in javax.inject.Inject[JavaClassConstructorDescriptor]

'this' @ [38:9] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[LazyClassReceiverParameterDescriptor]

'components' @ [38:14] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'components' @ [38:27] ==> value-parameter components: DeserializationComponentsForJava defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.setComponents[ValueParameterDescriptorImpl]

'components' @ [38:38] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializationComponentsForJava[PropertyDescriptorImpl]

'components' @ [42:17] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'configuration' @ [42:28] ==> public final val configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[DeserializedPropertyDescriptor]

'skipMetadataVersionCheck' @ [42:42] ==> public open val skipMetadataVersionCheck: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[DeserializedPropertyDescriptor]

'readClassData' @ [45:25] ==> internal final fun readClassData(kotlinClass: KotlinJvmBinaryClass): ClassDataWithSource? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [45:39] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.resolveClass[ValueParameterDescriptorImpl]

'components' @ [46:16] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'classDeserializer' @ [46:27] ==> public final val classDeserializer: ClassDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[DeserializedPropertyDescriptor]

'deserializeClass' @ [46:45] ==> public final fun deserializeClass(classId: ClassId, classDataWithSource: ClassDataWithSource? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[DeserializedSimpleFunctionDescriptor]

'kotlinClass' @ [46:62] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.resolveClass[ValueParameterDescriptorImpl]

'classId' @ [46:74] ==> public abstract val classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'classData' @ [46:83] ==> val classData: ClassDataWithSource defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.resolveClass[LocalVariableDescriptor]

'readData' @ [50:20] ==> internal final fun readData(kotlinClass: KotlinJvmBinaryClass, expectedKinds: Set<KotlinClassHeader.Kind>): Array<String>? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [50:29] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[ValueParameterDescriptorImpl]

'KOTLIN_CLASS' @ [50:42] ==> internal final val KOTLIN_CLASS: Set<KotlinClassHeader.Kind> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.Companion[PropertyDescriptorImpl]

'kotlinClass' @ [51:23] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[ValueParameterDescriptorImpl]

'classHeader' @ [51:35] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'strings' @ [51:47] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'parseProto' @ [52:25] ==> private final inline fun <T : Any> parseProto(klass: KotlinJvmBinaryClass, block: () -> ClassData): ClassData? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ClassData

'kotlinClass' @ [52:36] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[ValueParameterDescriptorImpl]

'JvmProtoBufUtil' @ [53:13] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'readClassDataFrom' @ [53:29] ==> @JvmStatic public final fun readClassDataFrom(data: Array<String>, strings: Array<String>): ClassData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'data' @ [53:47] ==> val data: Array<String> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[LocalVariableDescriptor]

'strings' @ [53:53] ==> val strings: Array<String> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[LocalVariableDescriptor]

'KotlinJvmBinarySourceElement' @ [55:22] ==> public constructor KotlinJvmBinarySourceElement(binaryClass: KotlinJvmBinaryClass, incompatibility: IncompatibleVersionErrorData<JvmMetadataVersion>? = ..., isPreReleaseInvisible: Boolean = ...) defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinarySourceElement[ClassConstructorDescriptorImpl]

'kotlinClass' @ [55:51] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[ValueParameterDescriptorImpl]

'kotlinClass' @ [55:64] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[ValueParameterDescriptorImpl]

'incompatibility' @ [55:76] ==> private final val KotlinJvmBinaryClass.incompatibility: IncompatibleVersionErrorData<JvmMetadataVersion>? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'kotlinClass' @ [55:93] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[ValueParameterDescriptorImpl]

'isPreReleaseInvisible' @ [55:105] ==> private final val KotlinJvmBinaryClass.isPreReleaseInvisible: Boolean defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'ClassDataWithSource' @ [56:16] ==> public constructor ClassDataWithSource(classData: ClassData, sourceElement: SourceElement) defined in org.jetbrains.kotlin.serialization.ClassDataWithSource[DeserializedClassConstructorDescriptor]

'classData' @ [56:36] ==> val classData: ClassData defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[LocalVariableDescriptor]

'source' @ [56:47] ==> val source: KotlinJvmBinarySourceElement defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readClassData[LocalVariableDescriptor]

'readData' @ [60:20] ==> internal final fun readData(kotlinClass: KotlinJvmBinaryClass, expectedKinds: Set<KotlinClassHeader.Kind>): Array<String>? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [60:29] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[ValueParameterDescriptorImpl]

'KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART' @ [60:42] ==> private final val KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART: Set<KotlinClassHeader.Kind> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.Companion[PropertyDescriptorImpl]

'kotlinClass' @ [61:23] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[ValueParameterDescriptorImpl]

'classHeader' @ [61:35] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'strings' @ [61:47] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'component1' @ [62:14] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedSimpleFunctionDescriptor]

'component2' @ [62:28] ==> public final operator fun component2(): ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedSimpleFunctionDescriptor]

'parseProto' @ [62:44] ==> private final inline fun <T : Any> parseProto(klass: KotlinJvmBinaryClass, block: () -> PackageData): PackageData? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> PackageData

'kotlinClass' @ [62:55] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[ValueParameterDescriptorImpl]

'JvmProtoBufUtil' @ [63:13] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'readPackageDataFrom' @ [63:29] ==> @JvmStatic public final fun readPackageDataFrom(data: Array<String>, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'data' @ [63:49] ==> val data: Array<String> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[LocalVariableDescriptor]

'strings' @ [63:55] ==> val strings: Array<String> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[LocalVariableDescriptor]

'JvmPackagePartSource' @ [65:22] ==> public constructor JvmPackagePartSource(kotlinClass: KotlinJvmBinaryClass, incompatibility: IncompatibleVersionErrorData<JvmMetadataVersion>? = ..., isPreReleaseInvisible: Boolean = ...) defined in org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource[ClassConstructorDescriptorImpl]

'kotlinClass' @ [65:43] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[ValueParameterDescriptorImpl]

'kotlinClass' @ [65:56] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[ValueParameterDescriptorImpl]

'incompatibility' @ [65:68] ==> private final val KotlinJvmBinaryClass.incompatibility: IncompatibleVersionErrorData<JvmMetadataVersion>? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'kotlinClass' @ [65:85] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[ValueParameterDescriptorImpl]

'isPreReleaseInvisible' @ [65:97] ==> private final val KotlinJvmBinaryClass.isPreReleaseInvisible: Boolean defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'DeserializedPackageMemberScope' @ [66:16] ==> public constructor DeserializedPackageMemberScope(packageDescriptor: PackageFragmentDescriptor, proto: ProtoBuf.Package, nameResolver: NameResolver, containerSource: DeserializedContainerSource?, components: DeserializationComponents, classNames: () -> Collection<Name>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[DeserializedClassConstructorDescriptor]

'descriptor' @ [66:47] ==> value-parameter descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[ValueParameterDescriptorImpl]

'packageProto' @ [66:59] ==> val packageProto: ProtoBuf.Package defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[LocalVariableDescriptor]

'nameResolver' @ [66:73] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[LocalVariableDescriptor]

'source' @ [66:87] ==> val source: JvmPackagePartSource defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope[LocalVariableDescriptor]

'components' @ [66:95] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'emptyList' @ [68:13] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'skipMetadataVersionCheck' @ [74:17] ==> private final val skipMetadataVersionCheck: Boolean defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'classHeader' @ [74:45] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'metadataVersion' @ [74:57] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'isCompatible' @ [74:73] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[SimpleFunctionDescriptorImpl]

'IncompatibleVersionErrorData' @ [75:20] ==> public constructor IncompatibleVersionErrorData<out T : BinaryVersion>(actualVersion: JvmMetadataVersion, expectedVersion: JvmMetadataVersion, filePath: String, classId: ClassId) defined in org.jetbrains.kotlin.serialization.deserialization.IncompatibleVersionErrorData[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : BinaryVersion> -> JvmMetadataVersion

'classHeader' @ [75:49] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'metadataVersion' @ [75:61] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'JvmMetadataVersion' @ [75:78] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [75:97] ==> @JvmField public final val INSTANCE: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion.Companion[PropertyDescriptorImpl]

'location' @ [75:107] ==> public abstract val location: String defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'classId' @ [75:117] ==> public abstract val classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'!' @ [79:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipMetadataVersionCheck' @ [79:18] ==> private final val skipMetadataVersionCheck: Boolean defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'!' @ [80:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPreRelease' @ [80:40] ==> public open fun isPreRelease(): Boolean defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaMethodDescriptor]

'classHeader' @ [81:18] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'isPreRelease' @ [81:30] ==> public final val isPreRelease: Boolean defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'classHeader' @ [81:46] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'metadataVersion' @ [81:58] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'KOTLIN_1_1_EAP_METADATA_VERSION' @ [81:77] ==> private final val KOTLIN_1_1_EAP_METADATA_VERSION: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.Companion[PropertyDescriptorImpl]

'kotlinClass' @ [84:22] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readData[ValueParameterDescriptorImpl]

'classHeader' @ [84:34] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'header' @ [85:17] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readData[LocalVariableDescriptor]

'data' @ [85:24] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'header' @ [85:32] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readData[LocalVariableDescriptor]

'incompatibleData' @ [85:39] ==> public final val incompatibleData: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'takeIf' @ [85:58] ==> @InlineOnly @SinceKotlin public inline fun <T> Array<String>.takeIf(predicate: (Array<String>) -> Boolean): Array<String>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<String>

'header' @ [85:67] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readData[LocalVariableDescriptor]

'kind' @ [85:74] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'expectedKinds' @ [85:82] ==> value-parameter expectedKinds: Set<KotlinClassHeader.Kind> defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.readData[ValueParameterDescriptorImpl]

'invoke' @ [91:24] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'IllegalStateException' @ [94:23] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'klass' @ [94:73] ==> value-parameter klass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.parseProto[ValueParameterDescriptorImpl]

'location' @ [94:79] ==> public abstract val location: String defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'e' @ [94:91] ==> val e: InvalidProtocolBufferException defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.parseProto[LocalVariableDescriptor]

'skipMetadataVersionCheck' @ [98:17] ==> private final val skipMetadataVersionCheck: Boolean defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'klass' @ [98:45] ==> value-parameter klass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.parseProto[ValueParameterDescriptorImpl]

'classHeader' @ [98:51] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'metadataVersion' @ [98:63] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'isCompatible' @ [98:79] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[SimpleFunctionDescriptorImpl]

'e' @ [99:23] ==> val e: Throwable defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver.parseProto[LocalVariableDescriptor]

'setOf' @ [108:37] ==> public fun <T> setOf(element: KotlinClassHeader.Kind): Set<KotlinClassHeader.Kind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Kind

'CLASS' @ [108:66] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'setOf' @ [111:17] ==> public fun <T> setOf(vararg elements: KotlinClassHeader.Kind): Set<KotlinClassHeader.Kind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Kind

'FILE_FACADE' @ [111:46] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS_PART' @ [111:82] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'JvmMetadataVersion' @ [113:55] ==> public constructor JvmMetadataVersion(vararg numbers: Int) defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[ClassConstructorDescriptorImpl]

