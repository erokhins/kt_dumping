'DeserializedPackageFragment' @ [33:5] ==> public constructor DeserializedPackageFragment(fqName: FqName, storageManager: StorageManager, module: ModuleDescriptor) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragment[ClassConstructorDescriptorImpl]

'fqName' @ [33:33] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [33:41] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl.<init>[ValueParameterDescriptorImpl]

'module' @ [33:57] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl.<init>[ValueParameterDescriptorImpl]

'NameResolverImpl' @ [34:34] ==> public constructor NameResolverImpl(strings: ProtoBuf.StringTable, qualifiedNames: ProtoBuf.QualifiedNameTable) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[ClassConstructorDescriptorImpl]

'proto' @ [34:51] ==> protected final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'strings' @ [34:57] ==> public final val ProtoBuf.PackageFragment.strings: (ProtoBuf.StringTable..ProtoBuf.StringTable?)[MyPropertyDescriptor]

'proto' @ [34:66] ==> protected final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'qualifiedNames' @ [34:72] ==> public final val ProtoBuf.PackageFragment.qualifiedNames: (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?)[MyPropertyDescriptor]

'ProtoBasedClassDataFinder' @ [36:36] ==> public constructor ProtoBasedClassDataFinder(proto: ProtoBuf.PackageFragment, nameResolver: NameResolver, classSource: (ClassId) -> SourceElement = ...) defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[ClassConstructorDescriptorImpl]

'proto' @ [36:62] ==> protected final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'nameResolver' @ [36:69] ==> protected final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'containerSource' @ [36:85] ==> private final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'NO_SOURCE' @ [36:118] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'DeserializedPackageMemberScope' @ [39:13] ==> public constructor DeserializedPackageMemberScope(packageDescriptor: PackageFragmentDescriptor, proto: ProtoBuf.Package, nameResolver: NameResolver, containerSource: DeserializedContainerSource?, components: DeserializationComponents, classNames: () -> Collection<Name>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[ClassConstructorDescriptorImpl]

'this' @ [40:21] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[LazyClassReceiverParameterDescriptor]

'proto' @ [40:27] ==> protected final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'`package`' @ [40:33] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'nameResolver' @ [40:44] ==> protected final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'containerSource' @ [40:58] ==> private final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'components' @ [40:75] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'classDataFinder' @ [42:25] ==> public open val classDataFinder: ProtoBasedClassDataFinder defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[PropertyDescriptorImpl]

'allClassIds' @ [42:41] ==> internal final val allClassIds: Collection<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[PropertyDescriptorImpl]

'filter' @ [42:53] ==> public inline fun <T> Iterable<ClassId>.filter(predicate: (ClassId) -> Boolean): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'!' @ [43:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classId' @ [43:30] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl.computeMemberScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNestedClass' @ [43:38] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'classId' @ [43:55] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl.computeMemberScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ClassDeserializer' @ [43:67] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[FakeCallableDescriptorForObject]

'BLACK_LIST' @ [43:85] ==> public final val BLACK_LIST: Set<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.Companion[PropertyDescriptorImpl]

'map' @ [44:27] ==> public inline fun <T, R> Iterable<ClassId>.map(transform: (ClassId) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> Name

'it' @ [44:33] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl.computeMemberScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'shortClassName' @ [44:36] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

