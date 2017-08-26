'DeserializedMemberScope' @ [40:5] ==> protected constructor DeserializedMemberScope(c: DeserializationContext, functionList: Collection<ProtoBuf.Function>, propertyList: Collection<ProtoBuf.Property>, typeAliasList: Collection<ProtoBuf.TypeAlias>, classNames: () -> Collection<Name>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[ClassConstructorDescriptorImpl]

'components' @ [41:9] ==> value-parameter components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'createContext' @ [41:20] ==> public final fun createContext(descriptor: PackageFragmentDescriptor, nameResolver: NameResolver, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?): DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[SimpleFunctionDescriptorImpl]

'packageDescriptor' @ [41:34] ==> value-parameter packageDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'nameResolver' @ [41:53] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'TypeTable' @ [41:67] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[ClassConstructorDescriptorImpl]

'proto' @ [41:77] ==> value-parameter proto: ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'typeTable' @ [41:83] ==> public final val ProtoBuf.Package.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'create' @ [42:55] ==> public final fun create(table: ProtoBuf.SinceKotlinInfoTable): SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable.Companion[SimpleFunctionDescriptorImpl]

'proto' @ [42:62] ==> value-parameter proto: ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'sinceKotlinInfoTable' @ [42:68] ==> public final val ProtoBuf.Package.sinceKotlinInfoTable: (ProtoBuf.SinceKotlinInfoTable..ProtoBuf.SinceKotlinInfoTable?)[MyPropertyDescriptor]

'containerSource' @ [42:91] ==> value-parameter containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'proto' @ [43:9] ==> value-parameter proto: ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'functionList' @ [43:15] ==> public final val ProtoBuf.Package.functionList: (MutableList<(ProtoBuf.Function..ProtoBuf.Function?)>..List<(ProtoBuf.Function..ProtoBuf.Function?)>?)[MyPropertyDescriptor]

'proto' @ [43:29] ==> value-parameter proto: ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'propertyList' @ [43:35] ==> public final val ProtoBuf.Package.propertyList: (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)[MyPropertyDescriptor]

'proto' @ [43:49] ==> value-parameter proto: ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'typeAliasList' @ [43:55] ==> public final val ProtoBuf.Package.typeAliasList: (MutableList<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>..List<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>?)[MyPropertyDescriptor]

'classNames' @ [43:70] ==> value-parameter classNames: () -> Collection<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'packageDescriptor' @ [45:33] ==> private final val packageDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'fqName' @ [45:51] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'computeDescriptors' @ [48:15] ==> protected final fun computeDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, location: LookupLocation): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [48:34] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [48:46] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'WHEN_GET_ALL_DESCRIPTORS' @ [48:75] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'c' @ [49:15] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'components' @ [49:17] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'fictitiousClassDescriptorFactories' @ [49:28] ==> public final val fictitiousClassDescriptorFactories: Iterable<ClassDescriptorFactory> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'flatMap' @ [49:63] ==> public inline fun <T, R> Iterable<ClassDescriptorFactory>.flatMap(transform: (ClassDescriptorFactory) -> Iterable<ClassDescriptor>): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorFactory
    <R> -> ClassDescriptor

'it' @ [49:73] ==> value-parameter it: ClassDescriptorFactory defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'getAllContributedClassesIfPossible' @ [49:76] ==> public abstract fun getAllContributedClassesIfPossible(packageFqName: FqName): Collection<ClassDescriptor> defined in org.jetbrains.kotlin.descriptors.deserialization.ClassDescriptorFactory[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [49:111] ==> private final val packageFqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'super' @ [52:13] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[LazyClassReceiverParameterDescriptor]

'hasClass' @ [52:19] ==> protected open fun hasClass(name: Name): Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [52:28] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.hasClass[ValueParameterDescriptorImpl]

'c' @ [52:37] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'components' @ [52:39] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'fictitiousClassDescriptorFactories' @ [52:50] ==> public final val fictitiousClassDescriptorFactories: Iterable<ClassDescriptorFactory> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'any' @ [52:85] ==> public inline fun <T> Iterable<ClassDescriptorFactory>.any(predicate: (ClassDescriptorFactory) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorFactory

'it' @ [52:91] ==> value-parameter it: ClassDescriptorFactory defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.hasClass.<anonymous>[ValueParameterDescriptorImpl]

'shouldCreateClass' @ [52:94] ==> public abstract fun shouldCreateClass(packageFqName: FqName, name: Name): Boolean defined in org.jetbrains.kotlin.descriptors.deserialization.ClassDescriptorFactory[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [52:112] ==> private final val packageFqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'name' @ [52:127] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.hasClass[ValueParameterDescriptorImpl]

'ClassId' @ [54:46] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'packageFqName' @ [54:54] ==> private final val packageFqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'name' @ [54:69] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.createClassId[ValueParameterDescriptorImpl]

'c' @ [58:9] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'components' @ [58:11] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'lookupTracker' @ [58:22] ==> public final val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'record' @ [58:36] ==> public fun LookupTracker.record(from: LookupLocation, scopeOwner: PackageFragmentDescriptor, name: Name): Unit defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'location' @ [58:43] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'packageDescriptor' @ [58:53] ==> private final val packageDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[PropertyDescriptorImpl]

'name' @ [58:72] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'super' @ [59:16] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[LazyClassReceiverParameterDescriptor]

'getContributedClassifier' @ [59:22] ==> public open fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [59:47] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [59:53] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'emptySet' @ [62:61] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'emptySet' @ [63:61] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

