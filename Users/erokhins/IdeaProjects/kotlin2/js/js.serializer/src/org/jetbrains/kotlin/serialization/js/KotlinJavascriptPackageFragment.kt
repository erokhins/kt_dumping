'DeserializedPackageFragmentImpl' @ [46:5] ==> public constructor DeserializedPackageFragmentImpl(fqName: FqName, storageManager: StorageManager, module: ModuleDescriptor, proto: ProtoBuf.PackageFragment, containerSource: DeserializedContainerSource?) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragmentImpl[DeserializedClassConstructorDescriptor]

'fqName' @ [46:37] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [46:45] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'module' @ [46:61] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'proto' @ [46:69] ==> value-parameter proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'JsContainerSource' @ [46:76] ==> public constructor JsContainerSource(fqName: FqName, header: JsProtoBuf.Header, configuration: DeserializationConfiguration) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.JsContainerSource[ClassConstructorDescriptorImpl]

'fqName' @ [46:94] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'header' @ [46:102] ==> value-parameter header: JsProtoBuf.Header defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'configuration' @ [46:110] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [47:50] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [47:65] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Int, KotlinJavascriptPackageFragment.FileHolder>): NotNullLazyValue<Map<Int, KotlinJavascriptPackageFragment.FileHolder>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Map<Int, FileHolder>

'this' @ [48:9] ==> <this> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[LazyClassReceiverParameterDescriptor]

'proto' @ [48:14] ==> protected final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[DeserializedPropertyDescriptor]

'getExtension' @ [48:20] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>?)): (JsProtoBuf.Files..JsProtoBuf.Files?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Files

'packageFragmentFiles' @ [48:44] ==> public final val packageFragmentFiles: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'fileList' @ [48:66] ==> public final val JsProtoBuf.Files.fileList: (MutableList<(JsProtoBuf.File..JsProtoBuf.File?)>..List<(JsProtoBuf.File..JsProtoBuf.File?)>?)[MyPropertyDescriptor]

'withIndex' @ [48:75] ==> public fun <T> Iterable<(JsProtoBuf.File..JsProtoBuf.File?)>.withIndex(): Iterable<IndexedValue<(JsProtoBuf.File..JsProtoBuf.File?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.JsProtoBuf.File..org.jetbrains.kotlin.serialization.js.JsProtoBuf.File?)

'associate' @ [48:87] ==> public inline fun <T, K, V> Iterable<IndexedValue<(JsProtoBuf.File..JsProtoBuf.File?)>>.associate(transform: (IndexedValue<(JsProtoBuf.File..JsProtoBuf.File?)>) -> Pair<Int, KotlinJavascriptPackageFragment.FileHolder>): Map<Int, KotlinJavascriptPackageFragment.FileHolder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<(org.jetbrains.kotlin.serialization.js.JsProtoBuf.File..org.jetbrains.kotlin.serialization.js.JsProtoBuf.File?)>
    <K> -> Int
    <V> -> FileHolder

'component1' @ [48:100] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [48:107] ==> public final operator fun component2(): (JsProtoBuf.File..JsProtoBuf.File?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'to' @ [49:13] ==> public infix fun <A, B> Int.to(that: KotlinJavascriptPackageFragment.FileHolder): Pair<Int, KotlinJavascriptPackageFragment.FileHolder> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> FileHolder

'if (file.hasId()) file.id else index' @ [49:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'file' @ [49:18] ==> val file: (JsProtoBuf.File..JsProtoBuf.File?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.fileMap.<anonymous>.<anonymous>[LocalVariableDescriptor]

'hasId' @ [49:23] ==> public open fun hasId(): Boolean defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.File[JavaMethodDescriptor]

'file' @ [49:32] ==> val file: (JsProtoBuf.File..JsProtoBuf.File?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.fileMap.<anonymous>.<anonymous>[LocalVariableDescriptor]

'id' @ [49:37] ==> public final val JsProtoBuf.File.id: Int[MyPropertyDescriptor]

'index' @ [49:45] ==> val index: Int defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.fileMap.<anonymous>.<anonymous>[LocalVariableDescriptor]

'FileHolder' @ [49:55] ==> public constructor FileHolder(annotationsProto: List<ProtoBuf.Annotation>) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.FileHolder[ClassConstructorDescriptorImpl]

'file' @ [49:66] ==> val file: (JsProtoBuf.File..JsProtoBuf.File?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.fileMap.<anonymous>.<anonymous>[LocalVariableDescriptor]

'annotationList' @ [49:71] ==> public final val JsProtoBuf.File.annotationList: (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)[MyPropertyDescriptor]

'storageManager' @ [53:67] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [53:82] ==> public abstract fun <T : Any> createLazyValue(computable: () -> AnnotationDeserializer): NotNullLazyValue<AnnotationDeserializer> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> AnnotationDeserializer

'AnnotationDeserializer' @ [54:9] ==> public constructor AnnotationDeserializer(module: ModuleDescriptor, notFoundClasses: NotFoundClasses) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[DeserializedClassConstructorDescriptor]

'module' @ [54:32] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.<init>[ValueParameterDescriptorImpl]

'components' @ [54:40] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[DeserializedPropertyDescriptor]

'notFoundClasses' @ [54:51] ==> public final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[DeserializedPropertyDescriptor]

'!=' @ [58:13] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [58:29] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(PackageFragmentDescriptor..PackageFragmentDescriptor?)>): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> PackageFragmentDescriptor

'descriptor' @ [58:45] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations[ValueParameterDescriptorImpl]

'java' @ [58:90] ==> public val <T> KClass<PackageFragmentDescriptor>.java: Class<PackageFragmentDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'this' @ [58:99] ==> <this> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[LazyClassReceiverParameterDescriptor]

'IllegalArgumentException' @ [59:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [59:66] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations[ValueParameterDescriptorImpl]

'this' @ [59:110] ==> <this> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[LazyClassReceiverParameterDescriptor]

'when (descriptor) {
            is DeserializedClassDescriptor -> descriptor.classProto.getExtension(JsProtoBuf.classContainingFileId)
            is DeserializedSimpleFunctionDescriptor -> descriptor.proto.getExtension(JsProtoBuf.functionContainingFileId)
            is DeserializedPropertyDescriptor -> descriptor.proto.getExtension(JsProtoBuf.propertyContainingFileId)
            else -> null
        }' @ [61:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int?, entry1: Int?, entry2: Int?, entry3: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int?

'descriptor' @ [61:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations[ValueParameterDescriptorImpl]

'descriptor' @ [62:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations[ValueParameterDescriptorImpl]

'classProto' @ [62:58] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[DeserializedPropertyDescriptor]

'getExtension' @ [62:69] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (Int..Int?)>?)): (Int..Int?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Int

'classContainingFileId' @ [62:93] ==> public final val classContainingFileId: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'descriptor' @ [63:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations[ValueParameterDescriptorImpl]

'proto' @ [63:67] ==> public open val proto: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor[DeserializedPropertyDescriptor]

'getExtension' @ [63:73] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (Int..Int?)>?)): (Int..Int?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Int

'functionContainingFileId' @ [63:97] ==> public final val functionContainingFileId: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'descriptor' @ [64:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations[ValueParameterDescriptorImpl]

'proto' @ [64:61] ==> public open val proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor[DeserializedPropertyDescriptor]

'getExtension' @ [64:67] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (Int..Int?)>?)): (Int..Int?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Int

'propertyContainingFileId' @ [64:91] ==> public final val propertyContainingFileId: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'fileId' @ [68:16] ==> val fileId: Int? defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations[LocalVariableDescriptor]

'let' @ [68:24] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> KotlinJavascriptPackageFragment.FileHolder?): KotlinJavascriptPackageFragment.FileHolder? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> FileHolder?

'fileMap' @ [68:30] ==> private final val fileMap: Map<Int, KotlinJavascriptPackageFragment.FileHolder> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[PropertyDescriptorImpl]

'it' @ [68:38] ==> value-parameter it: Int defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.getContainingFileAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [68:45] ==> public final val annotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.FileHolder[PropertyDescriptorImpl]

'orEmpty' @ [68:57] ==> @InlineOnly public inline fun <T> List<AnnotationDescriptor>?.orEmpty(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'storageManager' @ [72:56] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[DeserializedPropertyDescriptor]

'createLazyValue' @ [72:71] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<AnnotationDescriptor>): NotNullLazyValue<List<AnnotationDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<AnnotationDescriptor>

'annotationsProto' @ [73:13] ==> public final val annotationsProto: List<ProtoBuf.Annotation> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.FileHolder[PropertyDescriptorImpl]

'map' @ [73:30] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> AnnotationDescriptor

'annotationDeserializer' @ [73:36] ==> private final val annotationDeserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[PropertyDescriptorImpl]

'deserializeAnnotation' @ [73:59] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[DeserializedSimpleFunctionDescriptor]

'it' @ [73:81] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.FileHolder.annotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [73:85] ==> protected final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment[DeserializedPropertyDescriptor]

'NO_SOURCE_FILE' @ [83:67] ==> public final val NO_SOURCE_FILE: (SourceFile..SourceFile?) defined in org.jetbrains.kotlin.descriptors.SourceFile[JavaPropertyDescriptor]

'!' @ [91:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [91:18] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.JsContainerSource.<init>[ValueParameterDescriptorImpl]

'skipMetadataVersionCheck' @ [91:32] ==> public open val skipMetadataVersionCheck: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[DeserializedPropertyDescriptor]

'!=' @ [91:60] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'header' @ [91:61] ==> value-parameter header: JsProtoBuf.Header defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.JsContainerSource.<init>[ValueParameterDescriptorImpl]

'flags' @ [91:68] ==> public final val JsProtoBuf.Header.flags: Int[MyPropertyDescriptor]

'!' @ [91:89] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPreRelease' @ [91:112] ==> public open fun isPreRelease(): Boolean defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaMethodDescriptor]

'fqName' @ [94:32] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptPackageFragment.JsContainerSource[PropertyDescriptorImpl]

