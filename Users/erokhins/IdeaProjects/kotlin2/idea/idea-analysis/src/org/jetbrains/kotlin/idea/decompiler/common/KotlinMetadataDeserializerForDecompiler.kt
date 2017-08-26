'DeserializerForDecompilerBase' @ [42:5] ==> public constructor DeserializerForDecompilerBase(directoryPackageFqName: FqName) defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DeserializerForDecompilerBase[ClassConstructorDescriptorImpl]

'packageFqName' @ [42:35] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.<init>[ValueParameterDescriptorImpl]

'DefaultBuiltIns' @ [43:51] ==> public companion object defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns[FakeCallableDescriptorForObject]

'Instance' @ [43:67] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'NotFoundClasses' @ [48:31] ==> public constructor NotFoundClasses(storageManager: StorageManager, module: ModuleDescriptor) defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[DeserializedClassConstructorDescriptor]

'storageManager' @ [48:47] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'moduleDescriptor' @ [48:63] ==> protected final val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'deserializationComponents' @ [50:9] ==> protected open val deserializationComponents: DeserializationComponents defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'DeserializationComponents' @ [50:37] ==> public constructor DeserializationComponents(storageManager: StorageManager, moduleDescriptor: ModuleDescriptor, configuration: DeserializationConfiguration, classDataFinder: ClassDataFinder, annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget>, packageFragmentProvider: PackageFragmentProvider, localClassifierTypeSettings: LocalClassifierTypeSettings, errorReporter: ErrorReporter, lookupTracker: LookupTracker, flexibleTypeDeserializer: FlexibleTypeDeserializer, fictitiousClassDescriptorFactories: Iterable<ClassDescriptorFactory>, notFoundClasses: NotFoundClasses, additionalClassPartsProvider: AdditionalClassPartsProvider = ..., platformDependentDeclarationFilter: PlatformDependentDeclarationFilter = ...) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[DeserializedClassConstructorDescriptor]

'storageManager' @ [51:17] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'moduleDescriptor' @ [51:33] ==> protected final val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'Default' @ [51:80] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'ProtoBasedClassDataFinder' @ [51:89] ==> public constructor ProtoBasedClassDataFinder(proto: ProtoBuf.PackageFragment, nameResolver: NameResolver, classSource: (ClassId) -> SourceElement = ...) defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[DeserializedClassConstructorDescriptor]

'proto' @ [51:115] ==> private final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'nameResolver' @ [51:122] ==> private final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'AnnotationAndConstantLoaderImpl' @ [52:17] ==> public constructor AnnotationAndConstantLoaderImpl(module: ModuleDescriptor, notFoundClasses: NotFoundClasses, protocol: SerializerExtensionProtocol) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[DeserializedClassConstructorDescriptor]

'moduleDescriptor' @ [52:49] ==> protected final val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'notFoundClasses' @ [52:67] ==> val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.<init>[LocalVariableDescriptor]

'serializerProtocol' @ [52:84] ==> value-parameter serializerProtocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.<init>[ValueParameterDescriptorImpl]

'packageFragmentProvider' @ [52:105] ==> protected final val packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'ResolveEverythingToKotlinAnyLocalClassifierResolver' @ [53:17] ==> public constructor ResolveEverythingToKotlinAnyLocalClassifierResolver(builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.ResolveEverythingToKotlinAnyLocalClassifierResolver[ClassConstructorDescriptorImpl]

'builtIns' @ [53:69] ==> protected open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'LoggingErrorReporter' @ [53:80] ==> public constructor LoggingErrorReporter(log: Logger) defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.LoggingErrorReporter[ClassConstructorDescriptorImpl]

'LOG' @ [53:101] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.Companion[PropertyDescriptorImpl]

'DO_NOTHING' @ [54:31] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'flexibleTypeDeserializer' @ [54:43] ==> value-parameter flexibleTypeDeserializer: FlexibleTypeDeserializer defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [54:69] ==> public fun <T> emptyList(): List<ClassDescriptorFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorFactory

'notFoundClasses' @ [54:82] ==> val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.<init>[LocalVariableDescriptor]

'assert' @ [59:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'facadeFqName' @ [59:16] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.resolveDeclarationsInFacade[ValueParameterDescriptorImpl]

'directoryPackageFqName' @ [59:32] ==> public final val directoryPackageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'facadeFqName' @ [60:30] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.resolveDeclarationsInFacade[ValueParameterDescriptorImpl]

'directoryPackageFqName' @ [60:61] ==> public final val directoryPackageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'DeserializedPackageMemberScope' @ [63:28] ==> public constructor DeserializedPackageMemberScope(packageDescriptor: PackageFragmentDescriptor, proto: ProtoBuf.Package, nameResolver: NameResolver, containerSource: DeserializedContainerSource?, components: DeserializationComponents, classNames: () -> Collection<Name>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[DeserializedClassConstructorDescriptor]

'createDummyPackageFragment' @ [64:17] ==> protected final fun createDummyPackageFragment(fqName: FqName): MutablePackageFragmentDescriptor defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [64:44] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.resolveDeclarationsInFacade[ValueParameterDescriptorImpl]

'proto' @ [64:59] ==> private final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'`package`' @ [64:65] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'nameResolver' @ [64:76] ==> private final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'deserializationComponents' @ [65:30] ==> protected open val deserializationComponents: DeserializationComponents defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[PropertyDescriptorImpl]

'emptyList' @ [66:13] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'membersScope' @ [68:16] ==> val membersScope: DeserializedPackageMemberScope defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler.resolveDeclarationsInFacade[LocalVariableDescriptor]

'getContributedDescriptors' @ [68:29] ==> public open fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPackageMemberScope[DeserializedSimpleFunctionDescriptor]

'toList' @ [68:57] ==> public fun <T> Iterable<DeclarationDescriptor>.toList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'getInstance' @ [72:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinMetadataDeserializerForDecompiler' @ [72:46] ==> public companion object defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[FakeCallableDescriptorForObject]

'java' @ [72:93] ==> public val <T> KClass<KotlinMetadataDeserializerForDecompiler>.java: Class<KotlinMetadataDeserializerForDecompiler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinMetadataDeserializerForDecompiler

