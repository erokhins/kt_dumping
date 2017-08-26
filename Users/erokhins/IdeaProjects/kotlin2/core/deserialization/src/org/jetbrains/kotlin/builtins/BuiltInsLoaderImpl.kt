'this' @ [33:31] ==> <this> defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl[LazyClassReceiverParameterDescriptor]

'java' @ [33:43] ==> public val <T> KClass<out BuiltInsLoaderImpl>.java: Class<out BuiltInsLoaderImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BuiltInsLoaderImpl

'classLoader' @ [33:48] ==> public final val <T : (Any..Any?)> Class<out BuiltInsLoaderImpl>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BuiltInsLoaderImpl

'createBuiltInPackageFragmentProvider' @ [42:16] ==> public final fun createBuiltInPackageFragmentProvider(storageManager: StorageManager, module: ModuleDescriptor, packageFqNames: Set<FqName>, classDescriptorFactories: Iterable<ClassDescriptorFactory>, platformDependentDeclarationFilter: PlatformDependentDeclarationFilter, additionalClassPartsProvider: AdditionalClassPartsProvider = ..., loadResource: (String) -> InputStream?): PackageFragmentProvider defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl[SimpleFunctionDescriptorImpl]

'storageManager' @ [43:17] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createPackageFragmentProvider[ValueParameterDescriptorImpl]

'builtInsModule' @ [44:17] ==> value-parameter builtInsModule: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createPackageFragmentProvider[ValueParameterDescriptorImpl]

'BUILT_INS_PACKAGE_FQ_NAMES' @ [45:32] ==> public final val BUILT_INS_PACKAGE_FQ_NAMES: (MutableSet<(FqName..FqName?)>..Set<(FqName..FqName?)>?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'classDescriptorFactories' @ [46:17] ==> value-parameter classDescriptorFactories: Iterable<ClassDescriptorFactory> defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createPackageFragmentProvider[ValueParameterDescriptorImpl]

'platformDependentDeclarationFilter' @ [47:17] ==> value-parameter platformDependentDeclarationFilter: PlatformDependentDeclarationFilter defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createPackageFragmentProvider[ValueParameterDescriptorImpl]

'additionalClassPartsProvider' @ [48:17] ==> value-parameter additionalClassPartsProvider: AdditionalClassPartsProvider defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createPackageFragmentProvider[ValueParameterDescriptorImpl]

'classLoader' @ [50:13] ==> private final val classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl[PropertyDescriptorImpl]

'getResourceAsStream' @ [50:26] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'path' @ [50:46] ==> value-parameter path: String defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'getSystemResourceAsStream' @ [50:67] ==> public open fun getSystemResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'path' @ [50:93] ==> value-parameter path: String defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'None' @ [60:103] ==> public object None : AdditionalClassPartsProvider defined in org.jetbrains.kotlin.descriptors.deserialization.AdditionalClassPartsProvider[FakeCallableDescriptorForObject]

'packageFqNames' @ [63:32] ==> value-parameter packageFqNames: Set<FqName> defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'map' @ [63:47] ==> public inline fun <T, R> Iterable<FqName>.map(transform: (FqName) -> BuiltInsPackageFragmentImpl): List<BuiltInsPackageFragmentImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> BuiltInsPackageFragmentImpl

'BuiltInSerializerProtocol' @ [64:32] ==> public object BuiltInSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.builtins in file BuiltInSerializerProtocol.kt[FakeCallableDescriptorForObject]

'getBuiltInsFilePath' @ [64:58] ==> public final fun getBuiltInsFilePath(fqName: FqName): String defined in org.jetbrains.kotlin.builtins.BuiltInSerializerProtocol[SimpleFunctionDescriptorImpl]

'fqName' @ [64:78] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [65:31] ==> public abstract operator fun invoke(p1: String): InputStream? defined in kotlin.Function1[FunctionInvokeDescriptor]

'resourcePath' @ [65:44] ==> val resourcePath: String defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [65:67] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'resourcePath' @ [65:124] ==> val resourcePath: String defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider.<anonymous>[LocalVariableDescriptor]

'BuiltInsPackageFragmentImpl' @ [66:13] ==> public constructor BuiltInsPackageFragmentImpl(fqName: FqName, storageManager: StorageManager, module: ModuleDescriptor, inputStream: InputStream) defined in org.jetbrains.kotlin.builtins.BuiltInsPackageFragmentImpl[ClassConstructorDescriptorImpl]

'fqName' @ [66:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [66:49] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'module' @ [66:65] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'inputStream' @ [66:73] ==> val inputStream: InputStream defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider.<anonymous>[LocalVariableDescriptor]

'PackageFragmentProviderImpl' @ [68:24] ==> public constructor PackageFragmentProviderImpl(packageFragments: Collection<PackageFragmentDescriptor>) defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl[DeserializedClassConstructorDescriptor]

'packageFragments' @ [68:52] ==> val packageFragments: List<BuiltInsPackageFragmentImpl> defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'NotFoundClasses' @ [70:31] ==> public constructor NotFoundClasses(storageManager: StorageManager, module: ModuleDescriptor) defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[DeserializedClassConstructorDescriptor]

'storageManager' @ [70:47] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'module' @ [70:63] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'DeserializationComponents' @ [72:26] ==> public constructor DeserializationComponents(storageManager: StorageManager, moduleDescriptor: ModuleDescriptor, configuration: DeserializationConfiguration, classDataFinder: ClassDataFinder, annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget>, packageFragmentProvider: PackageFragmentProvider, localClassifierTypeSettings: LocalClassifierTypeSettings, errorReporter: ErrorReporter, lookupTracker: LookupTracker, flexibleTypeDeserializer: FlexibleTypeDeserializer, fictitiousClassDescriptorFactories: Iterable<ClassDescriptorFactory>, notFoundClasses: NotFoundClasses, additionalClassPartsProvider: AdditionalClassPartsProvider = ..., platformDependentDeclarationFilter: PlatformDependentDeclarationFilter = ...) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[ClassConstructorDescriptorImpl]

'storageManager' @ [73:17] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'module' @ [74:17] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'Default' @ [75:46] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'DeserializedClassDataFinder' @ [76:17] ==> public constructor DeserializedClassDataFinder(packageFragmentProvider: PackageFragmentProvider) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedClassDataFinder[ClassConstructorDescriptorImpl]

'provider' @ [76:45] ==> val provider: PackageFragmentProviderImpl defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'AnnotationAndConstantLoaderImpl' @ [77:17] ==> public constructor AnnotationAndConstantLoaderImpl(module: ModuleDescriptor, notFoundClasses: NotFoundClasses, protocol: SerializerExtensionProtocol) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[ClassConstructorDescriptorImpl]

'module' @ [77:49] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'notFoundClasses' @ [77:57] ==> val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'BuiltInSerializerProtocol' @ [77:74] ==> public object BuiltInSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.builtins in file BuiltInSerializerProtocol.kt[FakeCallableDescriptorForObject]

'provider' @ [78:17] ==> val provider: PackageFragmentProviderImpl defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'Default' @ [79:45] ==> public object Default : LocalClassifierTypeSettings defined in org.jetbrains.kotlin.serialization.deserialization.LocalClassifierTypeSettings[FakeCallableDescriptorForObject]

'DO_NOTHING' @ [80:31] ==> public final val DO_NOTHING: (ErrorReporter..ErrorReporter?) defined in org.jetbrains.kotlin.serialization.deserialization.ErrorReporter[JavaPropertyDescriptor]

'DO_NOTHING' @ [81:31] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'ThrowException' @ [82:42] ==> public object ThrowException : FlexibleTypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.FlexibleTypeDeserializer[FakeCallableDescriptorForObject]

'classDescriptorFactories' @ [83:17] ==> value-parameter classDescriptorFactories: Iterable<ClassDescriptorFactory> defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'notFoundClasses' @ [84:17] ==> val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'additionalClassPartsProvider' @ [85:48] ==> value-parameter additionalClassPartsProvider: AdditionalClassPartsProvider = ... defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'platformDependentDeclarationFilter' @ [86:54] ==> value-parameter platformDependentDeclarationFilter: PlatformDependentDeclarationFilter defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[ValueParameterDescriptorImpl]

'packageFragments' @ [89:33] ==> val packageFragments: List<BuiltInsPackageFragmentImpl> defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'packageFragment' @ [90:13] ==> val packageFragment: BuiltInsPackageFragmentImpl defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'components' @ [90:29] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.builtins.BuiltInsPackageFragmentImpl[PropertyDescriptorImpl]

'components' @ [90:42] ==> val components: DeserializationComponents defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

'provider' @ [93:16] ==> val provider: PackageFragmentProviderImpl defined in org.jetbrains.kotlin.builtins.BuiltInsLoaderImpl.createBuiltInPackageFragmentProvider[LocalVariableDescriptor]

