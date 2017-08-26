'PackagePartClassUtils' @ [51:13] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin in file PackagePartClassUtils.kt[FakeCallableDescriptorForObject]

'getFilesWithCallables' @ [51:35] ==> @JvmStatic public final fun getFilesWithCallables(files: Collection<KtFile>): List<KtFile> defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[SimpleFunctionDescriptorImpl]

'sourceFiles' @ [51:57] ==> value-parameter sourceFiles: Collection<KtFile> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'mapTo' @ [52:22] ==> public inline fun <T, R, C : MutableCollection<in FqName>> Iterable<KtFile>.mapTo(destination: HashSet<FqName> /* = HashSet<FqName> */, transform: (KtFile) -> FqName): HashSet<FqName> /* = HashSet<FqName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> FqName
    <C : MutableCollection<in R>> -> HashSet<FqName>

'hashSetOf' @ [52:28] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<FqName> /* = HashSet<FqName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'it' @ [52:43] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.fqNameToPackageFragment.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [52:46] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'keysToMap' @ [53:22] ==> public fun <K, V> Iterable<FqName>.keysToMap(value: (FqName) -> IncrementalPackageFragmentProvider.IncrementalPackageFragment): Map<FqName, IncrementalPackageFragmentProvider.IncrementalPackageFragment> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> IncrementalPackageFragment

'this' @ [53:32] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[LazyClassReceiverParameterDescriptor]

'emptySet' @ [55:104] ==> public fun <T> emptySet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'listOfNotNull' @ [58:16] ==> public fun <T : Any> listOfNotNull(element: IncrementalPackageFragmentProvider.IncrementalPackageFragment?): List<IncrementalPackageFragmentProvider.IncrementalPackageFragment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IncrementalPackageFragment

'fqNameToPackageFragment' @ [58:30] ==> private final val fqNameToPackageFragment: Map<FqName, IncrementalPackageFragmentProvider.IncrementalPackageFragment> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'fqName' @ [58:54] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.getPackageFragments[ValueParameterDescriptorImpl]

'PackageFragmentDescriptorImpl' @ [62:62] ==> public constructor PackageFragmentDescriptorImpl(module: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.PackageFragmentDescriptorImpl[DeserializedClassConstructorDescriptor]

'moduleDescriptor' @ [62:92] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'fqName' @ [62:110] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalPackageFragment.<init>[ValueParameterDescriptorImpl]

'this@IncrementalPackageFragmentProvider' @ [64:21] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[LazyClassReceiverParameterDescriptor]

'target' @ [64:61] ==> public final val target: TargetId defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'byFqNameWithoutInnerClasses' @ [67:51] ==> @NotNull public open fun byFqNameWithoutInnerClasses(@NotNull p0: FqName): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'multifileClassFqName' @ [67:79] ==> value-parameter multifileClassFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalPackageFragment.getPackageFragmentForMultifileClass[ValueParameterDescriptorImpl]

'internalName' @ [67:101] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'incrementalCache' @ [68:30] ==> public final val incrementalCache: IncrementalCache defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'getStableMultifileFacadeParts' @ [68:47] ==> public abstract fun getStableMultifileFacadeParts(facadeInternalName: String): Collection<String>? defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCache[DeserializedSimpleFunctionDescriptor]

'facadeInternalName' @ [68:77] ==> val facadeInternalName: String defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalPackageFragment.getPackageFragmentForMultifileClass[LocalVariableDescriptor]

'IncrementalMultifileClassPackageFragment' @ [69:20] ==> public constructor IncrementalMultifileClassPackageFragment(multifileClassFqName: FqName, partsInternalNames: Collection<String>) defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment[ClassConstructorDescriptorImpl]

'multifileClassFqName' @ [69:61] ==> value-parameter multifileClassFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalPackageFragment.getPackageFragmentForMultifileClass[ValueParameterDescriptorImpl]

'partsNames' @ [69:83] ==> val partsNames: Collection<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalPackageFragment.getPackageFragmentForMultifileClass[LocalVariableDescriptor]

'MemberScope' @ [72:54] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'Empty' @ [72:66] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'PackageFragmentDescriptorImpl' @ [78:9] ==> public constructor PackageFragmentDescriptorImpl(module: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.PackageFragmentDescriptorImpl[DeserializedClassConstructorDescriptor]

'moduleDescriptor' @ [78:39] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'multifileClassFqName' @ [78:57] ==> value-parameter multifileClassFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.<init>[ValueParameterDescriptorImpl]

'parent' @ [78:78] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'storageManager' @ [79:35] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'createLazyValue' @ [79:50] ==> public abstract fun <T : Any> createLazyValue(computable: () -> MemberScope): NotNullLazyValue<MemberScope> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MemberScope

'ChainedMemberScope' @ [80:13] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[FakeCallableDescriptorForObject]

'create' @ [80:32] ==> public final fun create(debugName: String, scopes: List<MemberScope>): MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.Companion[DeserializedSimpleFunctionDescriptor]

'multifileClassFqName' @ [81:105] ==> private final val multifileClassFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment[PropertyDescriptorImpl]

'partsInternalNames' @ [82:21] ==> public final val partsInternalNames: Collection<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment[PropertyDescriptorImpl]

'mapNotNull' @ [82:40] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> DeserializedPackageMemberScope?): List<DeserializedPackageMemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> DeserializedPackageMemberScope

'incrementalCache' @ [83:25] ==> public final val incrementalCache: IncrementalCache defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'getPackagePartData' @ [83:42] ==> public abstract fun getPackagePartData(partInternalName: String): JvmPackagePartProto? defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCache[DeserializedSimpleFunctionDescriptor]

'internalName' @ [83:61] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [83:76] ==> @InlineOnly public inline fun <T, R> JvmPackagePartProto.let(block: (JvmPackagePartProto) -> DeserializedPackageMemberScope): DeserializedPackageMemberScope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPackagePartProto
    <R> -> DeserializedPackageMemberScope

'component1' @ [83:83] ==> public final operator fun component1(): ByteArray defined in org.jetbrains.kotlin.load.kotlin.incremental.components.JvmPackagePartProto[DeserializedSimpleFunctionDescriptor]

'component2' @ [83:89] ==> public final operator fun component2(): Array<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.components.JvmPackagePartProto[DeserializedSimpleFunctionDescriptor]

'component1' @ [84:34] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedSimpleFunctionDescriptor]

'component2' @ [84:48] ==> public final operator fun component2(): ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedSimpleFunctionDescriptor]

'JvmProtoBufUtil' @ [84:64] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readPackageDataFrom' @ [84:80] ==> @JvmStatic public final fun readPackageDataFrom(bytes: ByteArray, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'data' @ [84:100] ==> val data: ByteArray defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'strings' @ [84:106] ==> val strings: Array<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'kotlinClassFinder' @ [86:50] ==> private final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'findKotlinClass' @ [86:68] ==> public abstract fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[DeserializedSimpleFunctionDescriptor]

'topLevel' @ [87:45] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [87:54] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'internalName' @ [87:61] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [87:74] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DeserializedPackageMemberScope' @ [90:29] ==> public constructor DeserializedPackageMemberScope(packageDescriptor: PackageFragmentDescriptor, proto: ProtoBuf.Package, nameResolver: NameResolver, containerSource: DeserializedContainerSource?, components: DeserializationComponents, classNames: () -> Collection<Name>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[DeserializedClassConstructorDescriptor]

'this' @ [91:37] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment[LazyClassReceiverParameterDescriptor]

'packageProto' @ [91:43] ==> val packageProto: ProtoBuf.Package defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'nameResolver' @ [91:57] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'JvmPackagePartSource' @ [92:37] ==> public constructor JvmPackagePartSource(className: JvmClassName, facadeClassName: JvmClassName?, incompatibility: IncompatibleVersionErrorData<JvmMetadataVersion>? = ..., isPreReleaseInvisible: Boolean = ..., knownJvmBinaryClass: KotlinJvmBinaryClass? = ...) defined in org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource[DeserializedClassConstructorDescriptor]

'byInternalName' @ [93:58] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'internalName' @ [93:73] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'byFqNameWithoutInnerClasses' @ [94:58] ==> @NotNull public open fun byFqNameWithoutInnerClasses(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'multifileClassFqName' @ [94:86] ==> private final val multifileClassFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment[PropertyDescriptorImpl]

'asString' @ [94:107] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'jvmBinaryClass' @ [95:67] ==> val jvmBinaryClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.memberScope.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'deserializationComponents' @ [97:37] ==> public final val deserializationComponents: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[PropertyDescriptorImpl]

'emptyList' @ [97:79] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'multifileClassFqName' @ [105:21] ==> private final val multifileClassFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment[PropertyDescriptorImpl]

'shortName' @ [105:42] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'invoke' @ [107:41] ==> public abstract fun invoke(): MemberScope defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

