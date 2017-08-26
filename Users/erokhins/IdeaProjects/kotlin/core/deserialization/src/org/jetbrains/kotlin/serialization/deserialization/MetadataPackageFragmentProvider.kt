'AbstractDeserializedPackageFragmentProvider' @ [46:5] ==> public constructor AbstractDeserializedPackageFragmentProvider(storageManager: StorageManager, finder: KotlinMetadataFinder, moduleDescriptor: ModuleDescriptor) defined in org.jetbrains.kotlin.serialization.deserialization.AbstractDeserializedPackageFragmentProvider[ClassConstructorDescriptorImpl]

'storageManager' @ [46:49] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'finder' @ [46:65] ==> value-parameter finder: KotlinMetadataFinder defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [46:73] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'components' @ [48:9] ==> protected final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[PropertyDescriptorImpl]

'DeserializationComponents' @ [48:22] ==> public constructor DeserializationComponents(storageManager: StorageManager, moduleDescriptor: ModuleDescriptor, configuration: DeserializationConfiguration, classDataFinder: ClassDataFinder, annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget>, packageFragmentProvider: PackageFragmentProvider, localClassifierTypeSettings: LocalClassifierTypeSettings, errorReporter: ErrorReporter, lookupTracker: LookupTracker, flexibleTypeDeserializer: FlexibleTypeDeserializer, fictitiousClassDescriptorFactories: Iterable<ClassDescriptorFactory>, notFoundClasses: NotFoundClasses, additionalClassPartsProvider: AdditionalClassPartsProvider = ..., platformDependentDeclarationFilter: PlatformDependentDeclarationFilter = ...) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[ClassConstructorDescriptorImpl]

'storageManager' @ [49:17] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [50:17] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'Default' @ [51:46] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'DeserializedClassDataFinder' @ [52:17] ==> public constructor DeserializedClassDataFinder(packageFragmentProvider: PackageFragmentProvider) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedClassDataFinder[ClassConstructorDescriptorImpl]

'this' @ [52:45] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[LazyClassReceiverParameterDescriptor]

'AnnotationAndConstantLoaderImpl' @ [53:17] ==> public constructor AnnotationAndConstantLoaderImpl(module: ModuleDescriptor, notFoundClasses: NotFoundClasses, protocol: SerializerExtensionProtocol) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[ClassConstructorDescriptorImpl]

'moduleDescriptor' @ [53:49] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'notFoundClasses' @ [53:67] ==> value-parameter notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'BuiltInSerializerProtocol' @ [53:84] ==> public object BuiltInSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.builtins in file BuiltInSerializerProtocol.kt[FakeCallableDescriptorForObject]

'this' @ [54:17] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[LazyClassReceiverParameterDescriptor]

'Default' @ [55:45] ==> public object Default : LocalClassifierTypeSettings defined in org.jetbrains.kotlin.serialization.deserialization.LocalClassifierTypeSettings[FakeCallableDescriptorForObject]

'DO_NOTHING' @ [56:31] ==> public final val DO_NOTHING: (ErrorReporter..ErrorReporter?) defined in org.jetbrains.kotlin.serialization.deserialization.ErrorReporter[JavaPropertyDescriptor]

'DO_NOTHING' @ [57:31] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'ThrowException' @ [58:42] ==> public object ThrowException : FlexibleTypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.FlexibleTypeDeserializer[FakeCallableDescriptorForObject]

'emptyList' @ [59:17] ==> public fun <T> emptyList(): List<ClassDescriptorFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorFactory

'notFoundClasses' @ [60:17] ==> value-parameter notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'None' @ [60:63] ==> public object None : AdditionalClassPartsProvider defined in org.jetbrains.kotlin.descriptors.deserialization.AdditionalClassPartsProvider[FakeCallableDescriptorForObject]

'All' @ [60:104] ==> public object All : PlatformDependentDeclarationFilter defined in org.jetbrains.kotlin.descriptors.deserialization.PlatformDependentDeclarationFilter[FakeCallableDescriptorForObject]

'if (finder.hasMetadataPackage(fqName))
                MetadataPackageFragment(fqName, storageManager, moduleDescriptor, packagePartProvider, finder)
            else null' @ [65:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeserializedPackageFragment?, elseBranch: DeserializedPackageFragment?): DeserializedPackageFragment?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeserializedPackageFragment?

'finder' @ [65:17] ==> protected final val finder: KotlinMetadataFinder defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[PropertyDescriptorImpl]

'hasMetadataPackage' @ [65:24] ==> public abstract fun hasMetadataPackage(fqName: FqName): Boolean defined in org.jetbrains.kotlin.serialization.deserialization.KotlinMetadataFinder[SimpleFunctionDescriptorImpl]

'fqName' @ [65:43] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.findPackage[ValueParameterDescriptorImpl]

'MetadataPackageFragment' @ [66:17] ==> public constructor MetadataPackageFragment(fqName: FqName, storageManager: StorageManager, module: ModuleDescriptor, packagePartProvider: PackagePartProvider, finder: KotlinMetadataFinder) defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[ClassConstructorDescriptorImpl]

'fqName' @ [66:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider.findPackage[ValueParameterDescriptorImpl]

'storageManager' @ [66:49] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[PropertyDescriptorImpl]

'moduleDescriptor' @ [66:65] ==> protected final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[PropertyDescriptorImpl]

'packagePartProvider' @ [66:83] ==> private final val packagePartProvider: PackagePartProvider defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[PropertyDescriptorImpl]

'finder' @ [66:104] ==> protected final val finder: KotlinMetadataFinder defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragmentProvider[PropertyDescriptorImpl]

'DeserializedPackageFragment' @ [76:5] ==> public constructor DeserializedPackageFragment(fqName: FqName, storageManager: StorageManager, module: ModuleDescriptor) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragment[ClassConstructorDescriptorImpl]

'fqName' @ [76:33] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [76:41] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.<init>[ValueParameterDescriptorImpl]

'module' @ [76:57] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.<init>[ValueParameterDescriptorImpl]

'ClassDataFinder' @ [77:36] ==> public fun ClassDataFinder(function: (classId: ClassId) -> ClassDataWithSource?): ClassDataFinder defined in org.jetbrains.kotlin.serialization.deserialization[SimpleFunctionDescriptorImpl]

'generateSequence' @ [78:31] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassId?, nextFunction: (ClassId) -> ClassId?): Sequence<ClassId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassId

'classId' @ [78:48] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [78:83] ==> public fun <T> Sequence<ClassId>.last(): ClassId defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'finder' @ [79:22] ==> private final val finder: KotlinMetadataFinder defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[PropertyDescriptorImpl]

'findMetadata' @ [79:29] ==> public abstract fun findMetadata(classId: ClassId): InputStream? defined in org.jetbrains.kotlin.serialization.deserialization.KotlinMetadataFinder[SimpleFunctionDescriptorImpl]

'topLevelClassId' @ [79:42] ==> val topLevelClassId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>[LocalVariableDescriptor]

'component1' @ [80:14] ==> public final operator fun component1(): ProtoBuf.PackageFragment defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [80:23] ==> public final operator fun component2(): NameResolverImpl defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'readProto' @ [80:39] ==> private final fun readProto(stream: InputStream): Pair<ProtoBuf.PackageFragment, NameResolverImpl> defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[SimpleFunctionDescriptorImpl]

'stream' @ [80:49] ==> val stream: InputStream defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>[LocalVariableDescriptor]

'message' @ [81:9] ==> val message: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>[LocalVariableDescriptor]

'class_List' @ [81:17] ==> public final val ProtoBuf.PackageFragment.class_List: (MutableList<(ProtoBuf.Class..ProtoBuf.Class?)>..List<(ProtoBuf.Class..ProtoBuf.Class?)>?)[MyPropertyDescriptor]

'firstOrNull' @ [81:28] ==> public inline fun <T> Iterable<(ProtoBuf.Class..ProtoBuf.Class?)>.firstOrNull(predicate: ((ProtoBuf.Class..ProtoBuf.Class?)) -> Boolean): ProtoBuf.Class? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class..org.jetbrains.kotlin.serialization.ProtoBuf.Class?)

'nameResolver' @ [82:13] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>[LocalVariableDescriptor]

'getClassId' @ [82:26] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[SimpleFunctionDescriptorImpl]

'classProto' @ [82:37] ==> value-parameter classProto: (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [82:48] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'classId' @ [82:59] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [83:12] ==> @InlineOnly public inline fun <T, R> ProtoBuf.Class.let(block: (ProtoBuf.Class) -> ClassDataWithSource): ClassDataWithSource defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class
    <R> -> ClassDataWithSource

'ClassDataWithSource' @ [84:13] ==> public constructor ClassDataWithSource(classData: ClassData, sourceElement: SourceElement) defined in org.jetbrains.kotlin.serialization.ClassDataWithSource[ClassConstructorDescriptorImpl]

'ClassData' @ [84:33] ==> public constructor ClassData(nameResolver: NameResolver, classProto: ProtoBuf.Class) defined in org.jetbrains.kotlin.serialization.ClassData[ClassConstructorDescriptorImpl]

'nameResolver' @ [84:43] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>[LocalVariableDescriptor]

'classProto' @ [84:57] ==> value-parameter classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.classDataFinder.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [84:84] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'packagePartProvider' @ [91:28] ==> private final val packagePartProvider: PackagePartProvider defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[PropertyDescriptorImpl]

'findMetadataPackageParts' @ [91:48] ==> public abstract fun findMetadataPackageParts(packageFqName: String): List<String> defined in org.jetbrains.kotlin.descriptors.PackagePartProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [91:73] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[PropertyDescriptorImpl]

'asString' @ [91:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'arrayListOf' @ [92:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<DeserializedPackageMemberScope> /* = ArrayList<DeserializedPackageMemberScope> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeserializedPackageMemberScope

'packageParts' @ [93:26] ==> val packageParts: List<String> defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'finder' @ [94:26] ==> private final val finder: KotlinMetadataFinder defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[PropertyDescriptorImpl]

'findMetadata' @ [94:33] ==> public abstract fun findMetadata(classId: ClassId): InputStream? defined in org.jetbrains.kotlin.serialization.deserialization.KotlinMetadataFinder[SimpleFunctionDescriptorImpl]

'ClassId' @ [94:46] ==> public constructor ClassId(@NotNull packageFqName: FqName, @NotNull topLevelName: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'fqName' @ [94:54] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[PropertyDescriptorImpl]

'identifier' @ [94:67] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'partName' @ [94:78] ==> val partName: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'component1' @ [95:18] ==> public final operator fun component1(): ProtoBuf.PackageFragment defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [95:25] ==> public final operator fun component2(): NameResolverImpl defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'readProto' @ [95:41] ==> private final fun readProto(stream: InputStream): Pair<ProtoBuf.PackageFragment, NameResolverImpl> defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[SimpleFunctionDescriptorImpl]

'stream' @ [95:51] ==> val stream: InputStream defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'scopes' @ [97:13] ==> val scopes: ArrayList<DeserializedPackageMemberScope> /* = ArrayList<DeserializedPackageMemberScope> */ defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'add' @ [97:20] ==> public open fun add(element: DeserializedPackageMemberScope): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'DeserializedPackageMemberScope' @ [97:24] ==> public constructor DeserializedPackageMemberScope(packageDescriptor: PackageFragmentDescriptor, proto: ProtoBuf.Package, nameResolver: NameResolver, containerSource: DeserializedContainerSource?, components: DeserializationComponents, classNames: () -> Collection<Name>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[ClassConstructorDescriptorImpl]

'this' @ [98:21] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[LazyClassReceiverParameterDescriptor]

'proto' @ [98:27] ==> val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'`package`' @ [98:33] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'nameResolver' @ [98:44] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'components' @ [98:95] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[PropertyDescriptorImpl]

'emptyList' @ [98:122] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'scopes' @ [103:9] ==> val scopes: ArrayList<DeserializedPackageMemberScope> /* = ArrayList<DeserializedPackageMemberScope> */ defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'add' @ [103:16] ==> public open fun add(element: DeserializedPackageMemberScope): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'DeserializedPackageMemberScope' @ [103:29] ==> public constructor DeserializedPackageMemberScope(packageDescriptor: PackageFragmentDescriptor, proto: ProtoBuf.Package, nameResolver: NameResolver, containerSource: DeserializedContainerSource?, components: DeserializationComponents, classNames: () -> Collection<Name>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[ClassConstructorDescriptorImpl]

'this' @ [104:17] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[LazyClassReceiverParameterDescriptor]

'getDefaultInstance' @ [104:40] ==> public open fun getDefaultInstance(): (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]

'NameResolverImpl' @ [105:17] ==> public constructor NameResolverImpl(strings: ProtoBuf.StringTable, qualifiedNames: ProtoBuf.QualifiedNameTable) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[ClassConstructorDescriptorImpl]

'getDefaultInstance' @ [105:55] ==> public open fun getDefaultInstance(): (ProtoBuf.StringTable..ProtoBuf.StringTable?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.StringTable[JavaMethodDescriptor]

'getDefaultInstance' @ [105:105] ==> public open fun getDefaultInstance(): (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.QualifiedNameTable[JavaMethodDescriptor]

'components' @ [106:54] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[PropertyDescriptorImpl]

'emptyList' @ [106:81] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'hasTopLevelClass' @ [108:58] ==> public open fun hasTopLevelClass(name: Name): Boolean defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[SimpleFunctionDescriptorImpl]

'name' @ [108:75] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope.<no name provided>.hasClass[ValueParameterDescriptorImpl]

'ChainedMemberScope' @ [111:16] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[FakeCallableDescriptorForObject]

'create' @ [111:35] ==> public final fun create(debugName: String, scopes: List<MemberScope>): MemberScope defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope.Companion[SimpleFunctionDescriptorImpl]

'scopes' @ [111:60] ==> val scopes: ArrayList<DeserializedPackageMemberScope> /* = ArrayList<DeserializedPackageMemberScope> */ defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.computeMemberScope[LocalVariableDescriptor]

'BuiltInsBinaryVersion' @ [120:23] ==> public companion object defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion[FakeCallableDescriptorForObject]

'readFrom' @ [120:45] ==> public final fun readFrom(stream: InputStream): BuiltInsBinaryVersion defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion.Companion[SimpleFunctionDescriptorImpl]

'stream' @ [120:54] ==> value-parameter stream: InputStream defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[ValueParameterDescriptorImpl]

'!' @ [122:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'version' @ [122:14] ==> val version: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[LocalVariableDescriptor]

'isCompatible' @ [122:22] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion[SimpleFunctionDescriptorImpl]

'UnsupportedOperationException' @ [124:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [125:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'BuiltInsBinaryVersion' @ [126:33] ==> public companion object defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [126:55] ==> @JvmField public final val INSTANCE: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion.Companion[PropertyDescriptorImpl]

'version' @ [126:74] ==> val version: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[LocalVariableDescriptor]

'parseFrom' @ [131:48] ==> public open fun parseFrom(input: (InputStream..InputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'stream' @ [131:58] ==> value-parameter stream: InputStream defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[ValueParameterDescriptorImpl]

'BuiltInSerializerProtocol' @ [131:66] ==> public object BuiltInSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.builtins in file BuiltInSerializerProtocol.kt[FakeCallableDescriptorForObject]

'extensionRegistry' @ [131:92] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.builtins.BuiltInSerializerProtocol[PropertyDescriptorImpl]

'NameResolverImpl' @ [132:28] ==> public constructor NameResolverImpl(strings: ProtoBuf.StringTable, qualifiedNames: ProtoBuf.QualifiedNameTable) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[ClassConstructorDescriptorImpl]

'message' @ [132:45] ==> val message: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[LocalVariableDescriptor]

'strings' @ [132:53] ==> public final val ProtoBuf.PackageFragment.strings: (ProtoBuf.StringTable..ProtoBuf.StringTable?)[MyPropertyDescriptor]

'message' @ [132:62] ==> val message: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[LocalVariableDescriptor]

'qualifiedNames' @ [132:70] ==> public final val ProtoBuf.PackageFragment.qualifiedNames: (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?)[MyPropertyDescriptor]

'Pair' @ [133:16] ==> public constructor Pair<out A, out B>(first: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), second: NameResolverImpl) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment..org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment?)
    <out B> -> NameResolverImpl

'message' @ [133:21] ==> val message: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[LocalVariableDescriptor]

'nameResolver' @ [133:30] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.readProto[LocalVariableDescriptor]

