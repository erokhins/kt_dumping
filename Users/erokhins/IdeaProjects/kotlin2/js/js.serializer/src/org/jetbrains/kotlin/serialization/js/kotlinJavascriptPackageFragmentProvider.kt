'packageFragmentProtos' @ [37:28] ==> value-parameter packageFragmentProtos: List<ProtoBuf.PackageFragment> defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'mapNotNull' @ [37:50] ==> public inline fun <T, R : Any> Iterable<ProtoBuf.PackageFragment>.mapNotNull(transform: (ProtoBuf.PackageFragment) -> KotlinJavascriptPackageFragment?): List<KotlinJavascriptPackageFragment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragment
    <R : Any> -> KotlinJavascriptPackageFragment

'proto' @ [38:9] ==> value-parameter proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [38:15] ==> private val ProtoBuf.PackageFragment.fqName: FqName? defined in org.jetbrains.kotlin.serialization.js in file kotlinJavascriptPackageFragmentProvider.kt[PropertyDescriptorImpl]

'let' @ [38:23] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> KotlinJavascriptPackageFragment): KotlinJavascriptPackageFragment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> KotlinJavascriptPackageFragment

'KotlinJavascriptPackageFragment' @ [39:13] ==> public constructor KotlinJavascriptPackageFragment(fqName: FqName, storageManager: StorageManager, module: ModuleDescriptor, proto: ProtoBuf.PackageFragment, header: JsProtoBuf.Header, configuration: DeserializationConfiguration) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[ClassConstructorDescriptorImpl]

'fqName' @ [39:45] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [39:53] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'module' @ [39:69] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'proto' @ [39:77] ==> value-parameter proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'header' @ [39:84] ==> value-parameter header: JsProtoBuf.Header defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'configuration' @ [39:92] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'PackageFragmentProviderImpl' @ [43:20] ==> public constructor PackageFragmentProviderImpl(packageFragments: Collection<PackageFragmentDescriptor>) defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl[DeserializedClassConstructorDescriptor]

'packageFragments' @ [43:48] ==> val packageFragments: List<KotlinJavascriptPackageFragment> defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'NotFoundClasses' @ [45:27] ==> public constructor NotFoundClasses(storageManager: StorageManager, module: ModuleDescriptor) defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[DeserializedClassConstructorDescriptor]

'storageManager' @ [45:43] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'module' @ [45:59] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'DeserializationComponents' @ [47:22] ==> public constructor DeserializationComponents(storageManager: StorageManager, moduleDescriptor: ModuleDescriptor, configuration: DeserializationConfiguration, classDataFinder: ClassDataFinder, annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget>, packageFragmentProvider: PackageFragmentProvider, localClassifierTypeSettings: LocalClassifierTypeSettings, errorReporter: ErrorReporter, lookupTracker: LookupTracker, flexibleTypeDeserializer: FlexibleTypeDeserializer, fictitiousClassDescriptorFactories: Iterable<ClassDescriptorFactory>, notFoundClasses: NotFoundClasses, additionalClassPartsProvider: AdditionalClassPartsProvider = ..., platformDependentDeclarationFilter: PlatformDependentDeclarationFilter = ...) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[DeserializedClassConstructorDescriptor]

'storageManager' @ [48:13] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'module' @ [49:13] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'configuration' @ [50:13] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'DeserializedClassDataFinder' @ [51:13] ==> public constructor DeserializedClassDataFinder(packageFragmentProvider: PackageFragmentProvider) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedClassDataFinder[DeserializedClassConstructorDescriptor]

'provider' @ [51:41] ==> val provider: PackageFragmentProviderImpl defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'AnnotationAndConstantLoaderImpl' @ [52:13] ==> public constructor AnnotationAndConstantLoaderImpl(module: ModuleDescriptor, notFoundClasses: NotFoundClasses, protocol: SerializerExtensionProtocol) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[DeserializedClassConstructorDescriptor]

'module' @ [52:45] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'notFoundClasses' @ [52:53] ==> val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'JsSerializerProtocol' @ [52:70] ==> public object JsSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.js in file KotlinJavascriptSerializerExtension.kt[FakeCallableDescriptorForObject]

'provider' @ [53:13] ==> val provider: PackageFragmentProviderImpl defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'Default' @ [54:41] ==> public object Default : LocalClassifierTypeSettings defined in org.jetbrains.kotlin.serialization.deserialization.LocalClassifierTypeSettings[FakeCallableDescriptorForObject]

'DO_NOTHING' @ [55:27] ==> public final val DO_NOTHING: (ErrorReporter..ErrorReporter?) defined in org.jetbrains.kotlin.serialization.deserialization.ErrorReporter[JavaPropertyDescriptor]

'lookupTracker' @ [56:13] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[ValueParameterDescriptorImpl]

'DynamicTypeDeserializer' @ [57:13] ==> public object DynamicTypeDeserializer : FlexibleTypeDeserializer defined in org.jetbrains.kotlin.serialization.js in file DynamicTypeDeserializer.kt[FakeCallableDescriptorForObject]

'emptyList' @ [58:13] ==> public fun <T> emptyList(): List<ClassDescriptorFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorFactory

'notFoundClasses' @ [59:13] ==> val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'packageFragments' @ [62:29] ==> val packageFragments: List<KotlinJavascriptPackageFragment> defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'packageFragment' @ [63:9] ==> val packageFragment: KotlinJavascriptPackageFragment defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'components' @ [63:25] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[DeserializedPropertyDescriptor]

'components' @ [63:38] ==> val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'provider' @ [66:12] ==> val provider: PackageFragmentProviderImpl defined in org.jetbrains.kotlin.serialization.js.createKotlinJavascriptPackageFragmentProvider[LocalVariableDescriptor]

'NameResolverImpl' @ [71:28] ==> public constructor NameResolverImpl(strings: ProtoBuf.StringTable, qualifiedNames: ProtoBuf.QualifiedNameTable) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedClassConstructorDescriptor]

'strings' @ [71:45] ==> public final val ProtoBuf.PackageFragment.strings: (ProtoBuf.StringTable..ProtoBuf.StringTable?)[MyPropertyDescriptor]

'qualifiedNames' @ [71:54] ==> public final val ProtoBuf.PackageFragment.qualifiedNames: (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?)[MyPropertyDescriptor]

'when {
            hasPackage() -> nameResolver.getPackageFqName(`package`.getExtension(JsProtoBuf.packageFqName))
            class_Count > 0 -> nameResolver.getClassId(class_OrBuilderList.first().fqName).packageFqName
            else -> null
        }' @ [72:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FqName?, entry1: FqName?, entry2: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FqName?

'hasPackage' @ [73:13] ==> public open fun hasPackage(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'nameResolver' @ [73:29] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.js.<get-fqName>[LocalVariableDescriptor]

'getPackageFqName' @ [73:42] ==> public final fun getPackageFqName(index: Int): FqName defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'`package`' @ [73:59] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'getExtension' @ [73:69] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?)): (Int..Int?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'packageFqName' @ [73:93] ==> public final val packageFqName: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'class_Count' @ [74:13] ==> public final val ProtoBuf.PackageFragment.class_Count: Int[MyPropertyDescriptor]

'nameResolver' @ [74:32] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.js.<get-fqName>[LocalVariableDescriptor]

'getClassId' @ [74:45] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'class_OrBuilderList' @ [74:56] ==> public final val ProtoBuf.PackageFragment.class_OrBuilderList: (MutableList<out (ProtoBuf.ClassOrBuilder..ProtoBuf.ClassOrBuilder?)>..List<(ProtoBuf.ClassOrBuilder..ProtoBuf.ClassOrBuilder?)>?)[MyPropertyDescriptor]

'first' @ [74:76] ==> public fun <T> List<(ProtoBuf.ClassOrBuilder..ProtoBuf.ClassOrBuilder?)>.first(): (ProtoBuf.ClassOrBuilder..ProtoBuf.ClassOrBuilder?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.ClassOrBuilder..org.jetbrains.kotlin.serialization.ProtoBuf.ClassOrBuilder?)

'fqName' @ [74:84] ==> public final val ProtoBuf.ClassOrBuilder.fqName: Int[MyPropertyDescriptor]

'packageFqName' @ [74:92] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

