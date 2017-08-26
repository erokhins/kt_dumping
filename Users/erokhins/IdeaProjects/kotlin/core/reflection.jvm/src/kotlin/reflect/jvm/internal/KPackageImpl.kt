'Suppress' @ [38:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'KDeclarationContainerImpl' @ [39:5] ==> public constructor KDeclarationContainerImpl() defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[ClassConstructorDescriptorImpl]

'KDeclarationContainerImpl.Data' @ [40:32] ==> public constructor Data() defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data[ClassConstructorDescriptorImpl]

'getValue' @ [41:57] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (ReflectKotlinClass..ReflectKotlinClass?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [41:75] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (ReflectKotlinClass..ReflectKotlinClass?)): ReflectProperties.LazySoftVal<(ReflectKotlinClass..ReflectKotlinClass?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ReflectKotlinClass

'ReflectKotlinClass' @ [43:13] ==> public companion object Factory defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[FakeCallableDescriptorForObject]

'create' @ [43:32] ==> public final fun create(klass: Class<*>): ReflectKotlinClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass.Factory[SimpleFunctionDescriptorImpl]

'jClass' @ [43:39] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'getValue' @ [46:50] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (PackageViewDescriptor..PackageViewDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [46:68] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (PackageViewDescriptor..PackageViewDescriptor?)): ReflectProperties.LazySoftVal<(PackageViewDescriptor..PackageViewDescriptor?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PackageViewDescriptor

'with' @ [47:13] ==> @InlineOnly public inline fun <T, R> with(receiver: RuntimeModuleData, block: RuntimeModuleData.() -> PackageViewDescriptor): PackageViewDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RuntimeModuleData
    <R> -> PackageViewDescriptor

'moduleData' @ [47:18] ==> public final val moduleData: RuntimeModuleData defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'kotlinClass' @ [48:17] ==> private final val kotlinClass: ReflectKotlinClass? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'packageModuleName' @ [48:30] ==> internal val ReflectKotlinClass.packageModuleName: String? defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'let' @ [48:49] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'packagePartProvider' @ [48:53] ==> public final val packagePartProvider: RuntimePackagePartProvider defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[PropertyDescriptorImpl]

'module' @ [49:17] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[PropertyDescriptorImpl]

'getPackage' @ [49:24] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]

'jClass' @ [49:35] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'classId' @ [49:42] ==> public val Class<*>.classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'packageFqName' @ [49:50] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'getValue' @ [53:38] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (Class<out Any>..Class<out Any>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'lazy' @ [53:56] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> (Class<out Any>..Class<out Any>?)): ReflectProperties.LazyVal<(Class<out Any>..Class<out Any>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Class<out Any>

'kotlinClass' @ [54:30] ==> private final val kotlinClass: ReflectKotlinClass? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'classHeader' @ [54:43] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'multifileClassName' @ [54:56] ==> public final val multifileClassName: String? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'if (facadeName != null && facadeName.isNotEmpty()) {
                jClass.classLoader.loadClass(facadeName.replace('/', '.'))
            }
            else {
                jClass
            }' @ [57:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class<out Any>, elseBranch: Class<out Any>): Class<out Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class<out Any>

'facadeName' @ [57:17] ==> val facadeName: String? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.methodOwner.<anonymous>[LocalVariableDescriptor]

'facadeName' @ [57:39] ==> val facadeName: String? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.methodOwner.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [57:50] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'jClass' @ [58:17] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'classLoader' @ [58:24] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'loadClass' @ [58:36] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'facadeName' @ [58:46] ==> val facadeName: String? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.methodOwner.<anonymous>[LocalVariableDescriptor]

'replace' @ [58:57] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'jClass' @ [61:17] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'getValue' @ [65:39] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): PackageData? defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'lazy' @ [65:57] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> PackageData?): ReflectProperties.LazyVal<PackageData?> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PackageData?

'kotlinClass' @ [66:13] ==> private final val kotlinClass: ReflectKotlinClass? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'classHeader' @ [66:26] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'let' @ [66:39] ==> @InlineOnly public inline fun <T, R> KotlinClassHeader.let(block: (KotlinClassHeader) -> PackageData?): PackageData? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinClassHeader
    <R> -> PackageData?

'header' @ [67:28] ==> value-parameter header: KotlinClassHeader defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.metadata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [67:35] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'header' @ [68:31] ==> value-parameter header: KotlinClassHeader defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.metadata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'strings' @ [68:38] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'if (data != null && strings != null) {
                    JvmProtoBufUtil.readPackageDataFrom(data, strings)
                }
                else null' @ [69:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PackageData?, elseBranch: PackageData?): PackageData?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PackageData?

'data' @ [69:21] ==> val data: Array<String>? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.metadata.<anonymous>.<anonymous>[LocalVariableDescriptor]

'strings' @ [69:37] ==> val strings: Array<String>? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.metadata.<anonymous>.<anonymous>[LocalVariableDescriptor]

'JvmProtoBufUtil' @ [70:21] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'readPackageDataFrom' @ [70:37] ==> @JvmStatic public final fun readPackageDataFrom(data: Array<String>, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'data' @ [70:57] ==> val data: Array<String>? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.metadata.<anonymous>.<anonymous>[LocalVariableDescriptor]

'strings' @ [70:63] ==> val strings: Array<String>? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.metadata.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getValue' @ [76:54] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (List<KCallableImpl<*>>..List<KCallableImpl<*>>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [76:72] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KCallableImpl<*>>..List<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(List<KCallableImpl<*>>..List<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<KCallableImpl<*>>

'getMembers' @ [77:13] ==> protected final fun getMembers(scope: MemberScope, belonginess: KDeclarationContainerImpl.MemberBelonginess): Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KPackageImpl[SimpleFunctionDescriptorImpl]

'scope' @ [77:24] ==> private final val scope: MemberScope defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'DECLARED' @ [77:31] ==> enum entry DECLARED defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[FakeCallableDescriptorForObject]

'filter' @ [77:41] ==> public inline fun <T> Iterable<KCallableImpl<*>>.filter(predicate: (KCallableImpl<*>) -> Boolean): List<KCallableImpl<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KCallableImpl<*>

'member' @ [78:42] ==> value-parameter member: KCallableImpl<*> defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.members.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [78:49] ==> public abstract val descriptor: CallableMemberDescriptor defined in kotlin.reflect.jvm.internal.KCallableImpl[PropertyDescriptorImpl]

'callableDescriptor' @ [79:39] ==> val callableDescriptor: DeserializedCallableMemberDescriptor defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.members.<anonymous>.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [79:58] ==> public final val DeserializedCallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'packageFragment' @ [80:31] ==> val packageFragment: PackageFragmentDescriptor defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.members.<anonymous>.<anonymous>[LocalVariableDescriptor]

'source' @ [80:77] ==> public final val LazyJavaPackageFragment.source: SourceElement[MyPropertyDescriptor]

'==' @ [81:17] ==> public open fun equals(other: Any?): Boolean defined in java.lang.Class[DeserializedSimpleFunctionDescriptor]

'source' @ [81:18] ==> val source: KotlinJvmBinaryPackageSourceElement? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.members.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getContainingBinaryClass' @ [81:26] ==> public final fun getContainingBinaryClass(descriptor: DeserializedMemberDescriptor): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[SimpleFunctionDescriptorImpl]

'callableDescriptor' @ [81:51] ==> val callableDescriptor: DeserializedCallableMemberDescriptor defined in kotlin.reflect.jvm.internal.KPackageImpl.Data.members.<anonymous>.<anonymous>[LocalVariableDescriptor]

'klass' @ [81:96] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'jClass' @ [81:105] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'lazy' @ [86:42] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> (KPackageImpl.Data..KPackageImpl.Data?)): ReflectProperties.LazyVal<(KPackageImpl.Data..KPackageImpl.Data?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Data

'Data' @ [86:49] ==> public constructor Data() defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[ClassConstructorDescriptorImpl]

'invoke' @ [88:48] ==> @Override public open fun invoke(): (KPackageImpl.Data..KPackageImpl.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'methodOwner' @ [88:55] ==> public final val methodOwner: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'invoke' @ [90:44] ==> @Override public open fun invoke(): (KPackageImpl.Data..KPackageImpl.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'descriptor' @ [90:51] ==> public final val descriptor: PackageViewDescriptor defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'memberScope' @ [90:62] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'invoke' @ [92:60] ==> @Override public open fun invoke(): (KPackageImpl.Data..KPackageImpl.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'members' @ [92:67] ==> public final val members: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'emptyList' @ [95:17] ==> public fun <T> emptyList(): List<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'scope' @ [98:13] ==> private final val scope: MemberScope defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'getContributedVariables' @ [98:19] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [98:43] ==> value-parameter name: Name defined in kotlin.reflect.jvm.internal.KPackageImpl.getProperties[ValueParameterDescriptorImpl]

'FROM_REFLECTION' @ [98:66] ==> enum entry FROM_REFLECTION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'scope' @ [101:13] ==> private final val scope: MemberScope defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'getContributedFunctions' @ [101:19] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [101:43] ==> value-parameter name: Name defined in kotlin.reflect.jvm.internal.KPackageImpl.getFunctions[ValueParameterDescriptorImpl]

'FROM_REFLECTION' @ [101:66] ==> enum entry FROM_REFLECTION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'invoke' @ [104:16] ==> @Override public open fun invoke(): (KPackageImpl.Data..KPackageImpl.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'metadata' @ [104:23] ==> public final val metadata: PackageData? defined in kotlin.reflect.jvm.internal.KPackageImpl.Data[PropertyDescriptorImpl]

'let' @ [104:33] ==> @InlineOnly public inline fun <T, R> PackageData.let(block: (PackageData) -> PropertyDescriptor?): PropertyDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageData
    <R> -> PropertyDescriptor?

'component1' @ [104:40] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.PackageData[SimpleFunctionDescriptorImpl]

'component2' @ [104:54] ==> public final operator fun component2(): ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.PackageData[SimpleFunctionDescriptorImpl]

'packageProto' @ [105:25] ==> val packageProto: ProtoBuf.Package defined in kotlin.reflect.jvm.internal.KPackageImpl.getLocalProperty.<anonymous>[LocalVariableDescriptor]

'getExtension' @ [105:38] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>?), p1: Int): (ProtoBuf.Property..ProtoBuf.Property?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Property

'packageLocalVariable' @ [105:63] ==> public final val packageLocalVariable: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'index' @ [105:85] ==> value-parameter index: Int defined in kotlin.reflect.jvm.internal.KPackageImpl.getLocalProperty[ValueParameterDescriptorImpl]

'deserializeToDescriptor' @ [106:13] ==> internal fun <M : MessageLite, D : CallableDescriptor> deserializeToDescriptor(moduleAnchor: Class<*>, proto: (ProtoBuf.Property..ProtoBuf.Property?), nameResolver: NameResolver, typeTable: TypeTable, createDescriptor: MemberDeserializer.((ProtoBuf.Property..ProtoBuf.Property?)) -> PropertyDescriptor): PropertyDescriptor? defined in kotlin.reflect.jvm.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Property..org.jetbrains.kotlin.serialization.ProtoBuf.Property?)
    <D : CallableDescriptor> -> PropertyDescriptor

'jClass' @ [106:37] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'proto' @ [106:45] ==> val proto: (ProtoBuf.Property..ProtoBuf.Property?) defined in kotlin.reflect.jvm.internal.KPackageImpl.getLocalProperty.<anonymous>[LocalVariableDescriptor]

'nameResolver' @ [106:52] ==> val nameResolver: NameResolver defined in kotlin.reflect.jvm.internal.KPackageImpl.getLocalProperty.<anonymous>[LocalVariableDescriptor]

'TypeTable' @ [106:66] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[ClassConstructorDescriptorImpl]

'packageProto' @ [106:76] ==> val packageProto: ProtoBuf.Package defined in kotlin.reflect.jvm.internal.KPackageImpl.getLocalProperty.<anonymous>[LocalVariableDescriptor]

'typeTable' @ [106:89] ==> public final val ProtoBuf.Package.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'MemberDeserializer' @ [106:101] ==> public constructor MemberDeserializer(c: DeserializationContext) defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[ClassConstructorDescriptorImpl]

'other' @ [111:13] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KPackageImpl.equals[ValueParameterDescriptorImpl]

'jClass' @ [111:38] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'other' @ [111:48] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KPackageImpl.equals[ValueParameterDescriptorImpl]

'jClass' @ [111:54] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'jClass' @ [114:13] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'hashCode' @ [114:20] ==> public open fun hashCode(): Int defined in java.lang.Class[DeserializedSimpleFunctionDescriptor]

'jClass' @ [117:22] ==> public open val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KPackageImpl[PropertyDescriptorImpl]

'classId' @ [117:29] ==> public val Class<*>.classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'packageFqName' @ [117:37] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'+' @ [118:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (fqName.isRoot) "<default>" else fqName.asString()' @ [118:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'fqName' @ [118:34] ==> val fqName: FqName defined in kotlin.reflect.jvm.internal.KPackageImpl.toString[LocalVariableDescriptor]

'isRoot' @ [118:41] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'fqName' @ [118:66] ==> val fqName: FqName defined in kotlin.reflect.jvm.internal.KPackageImpl.toString[LocalVariableDescriptor]

'asString' @ [118:73] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

