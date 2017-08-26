'MetadataSerializer' @ [44:58] ==> public constructor MetadataSerializer(dependOnOldBuiltIns: Boolean) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[DeserializedClassConstructorDescriptor]

'dependOnOldBuiltIns' @ [44:77] ==> value-parameter dependOnOldBuiltIns: Boolean defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.<init>[ValueParameterDescriptorImpl]

'newDisposable' @ [51:39] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'createMessageCollector' @ [52:32] ==> private final fun createMessageCollector(): <no name provided> defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[SimpleFunctionDescriptorImpl]

'CompilerConfiguration' @ [54:33] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'apply' @ [54:57] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: CompilerConfiguration.() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'put' @ [55:17] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [55:42] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'messageCollector' @ [55:65] ==> val messageCollector: <no name provided> defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[LocalVariableDescriptor]

'addKotlinSourceRoots' @ [57:17] ==> public fun CompilerConfiguration.addKotlinSourceRoots(sources: List<String>): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'srcDirs' @ [57:38] ==> value-parameter srcDirs: List<File> defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[ValueParameterDescriptorImpl]

'map' @ [57:46] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [57:52] ==> value-parameter it: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [57:55] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'addJvmClasspathRoots' @ [58:17] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'extraClassPath' @ [58:38] ==> value-parameter extraClassPath: List<File> defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[ValueParameterDescriptorImpl]

'put' @ [60:17] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'METADATA_DESTINATION_DIRECTORY' @ [60:42] ==> public final val METADATA_DESTINATION_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'destDir' @ [60:74] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[ValueParameterDescriptorImpl]

'put' @ [61:17] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [61:21] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [61:45] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'KotlinCoreEnvironment' @ [64:31] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [64:53] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'rootDisposable' @ [64:68] ==> val rootDisposable: Disposable defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[LocalVariableDescriptor]

'configuration' @ [64:84] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [64:122] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'serialize' @ [66:13] ==> public final fun serialize(environment: KotlinCoreEnvironment): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[DeserializedSimpleFunctionDescriptor]

'environment' @ [66:23] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[LocalVariableDescriptor]

'invoke' @ [68:13] ==> public abstract operator fun invoke(totalSize: @ParameterName Int, totalFiles: @ParameterName Int): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'totalSize' @ [68:24] ==> protected final var totalSize: Int defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[DeserializedPropertyDescriptor]

'totalFiles' @ [68:35] ==> protected final var totalFiles: Int defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[DeserializedPropertyDescriptor]

'messageCollector' @ [71:13] ==> val messageCollector: <no name provided> defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[LocalVariableDescriptor]

'flush' @ [71:30] ==> public open fun flush(): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createMessageCollector.<no name provided>[JavaMethodDescriptor]

'dispose' @ [72:22] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'rootDisposable' @ [72:30] ==> val rootDisposable: Disposable defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.serialize[LocalVariableDescriptor]

'GroupingMessageCollector' @ [76:53] ==> public constructor GroupingMessageCollector(@NotNull p0: MessageCollector) defined in org.jetbrains.kotlin.cli.common.messages.GroupingMessageCollector[JavaClassConstructorDescriptor]

'PrintingMessageCollector' @ [77:13] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'err' @ [77:45] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'PLAIN_RELATIVE_PATHS' @ [77:66] ==> public final val PLAIN_RELATIVE_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'location' @ [82:17] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createMessageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'super' @ [83:17] ==> <this> defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createMessageCollector.<no name provided>[LazyClassReceiverParameterDescriptor]

'report' @ [83:23] ==> public open fun report(@NotNull severity: CompilerMessageSeverity, @NotNull message: String, @Nullable location: CompilerMessageLocation?): Unit defined in org.jetbrains.kotlin.cli.common.messages.GroupingMessageCollector[JavaMethodDescriptor]

'severity' @ [83:30] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createMessageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'message' @ [83:40] ==> value-parameter message: String defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createMessageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'location' @ [83:49] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createMessageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'destDir' @ [89:9] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization[ValueParameterDescriptorImpl]

'deleteRecursively' @ [89:17] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'!' @ [90:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'destDir' @ [90:14] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization[ValueParameterDescriptorImpl]

'mkdirs' @ [90:22] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'AssertionError' @ [91:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [91:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'destDir' @ [91:67] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization[ValueParameterDescriptorImpl]

'files' @ [94:9] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization[ValueParameterDescriptorImpl]

'map' @ [94:15] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> FqName

'it' @ [94:21] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [94:24] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'toSet' @ [94:40] ==> public fun <T> Iterable<FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'forEach' @ [94:48] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'module' @ [96:31] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization[ValueParameterDescriptorImpl]

'getPackage' @ [96:38] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'fqName' @ [96:49] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization.<anonymous>[ValueParameterDescriptorImpl]

'PackageSerializer' @ [97:13] ==> public constructor PackageSerializer(classes: Collection<DeclarationDescriptor>, members: Collection<DeclarationDescriptor>, packageFqName: FqName, destFile: File) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[DeserializedClassConstructorDescriptor]

'packageView' @ [98:21] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization.<anonymous>[LocalVariableDescriptor]

'memberScope' @ [98:33] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [98:45] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [98:71] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CLASSIFIERS' @ [98:92] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'createCloneable' @ [98:107] ==> private final fun createCloneable(module: ModuleDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[SimpleFunctionDescriptorImpl]

'module' @ [98:123] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization[ValueParameterDescriptorImpl]

'packageView' @ [99:21] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization.<anonymous>[LocalVariableDescriptor]

'fragments' @ [99:33] ==> public abstract val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'flatMap' @ [99:43] ==> public inline fun <T, R> Iterable<PackageFragmentDescriptor>.flatMap(transform: (PackageFragmentDescriptor) -> Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor
    <R> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'getAllDescriptors' @ [99:81] ==> @NotNull public open fun getAllDescriptors(@NotNull p0: MemberScope): (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'fragment' @ [99:99] ==> value-parameter fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getMemberScope' @ [99:108] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'packageView' @ [100:21] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization.<anonymous>[LocalVariableDescriptor]

'fqName' @ [100:33] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'File' @ [101:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destDir' @ [101:26] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization[ValueParameterDescriptorImpl]

'BuiltInSerializerProtocol' @ [101:35] ==> public object BuiltInSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.builtins[FakeCallableDescriptorForObject]

'getBuiltInsFilePath' @ [101:61] ==> public final fun getBuiltInsFilePath(fqName: FqName): String defined in org.jetbrains.kotlin.builtins.BuiltInSerializerProtocol[DeserializedSimpleFunctionDescriptor]

'packageView' @ [101:81] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.performSerialization.<anonymous>[LocalVariableDescriptor]

'fqName' @ [101:93] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'run' @ [102:15] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[DeserializedSimpleFunctionDescriptor]

'BuiltInsSerializerExtension' @ [106:79] ==> public constructor BuiltInsSerializerExtension() defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializerExtension[ClassConstructorDescriptorImpl]

'JvmBuiltInClassDescriptorFactory' @ [111:23] ==> public constructor JvmBuiltInClassDescriptorFactory(storageManager: StorageManager, moduleDescriptor: ModuleDescriptor, computeContainingDeclaration: (ModuleDescriptor) -> DeclarationDescriptor = ...) defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory[DeserializedClassConstructorDescriptor]

'NO_LOCKS' @ [111:80] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'module' @ [111:90] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createCloneable[ValueParameterDescriptorImpl]

'EmptyPackageFragmentDescriptor' @ [112:13] ==> public constructor EmptyPackageFragmentDescriptor(module: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.EmptyPackageFragmentDescriptor[DeserializedClassConstructorDescriptor]

'module' @ [112:44] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createCloneable[ValueParameterDescriptorImpl]

'BUILT_INS_PACKAGE_FQ_NAME' @ [112:67] ==> public final val BUILT_INS_PACKAGE_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'factory' @ [114:16] ==> val factory: JvmBuiltInClassDescriptorFactory defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createCloneable[LocalVariableDescriptor]

'createClass' @ [114:24] ==> public open fun createClass(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory[DeserializedSimpleFunctionDescriptor]

'topLevel' @ [114:44] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FQ_NAMES' @ [114:68] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'cloneable' @ [114:77] ==> public final val cloneable: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'toSafe' @ [114:87] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'error' @ [115:19] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'module' @ [115:64] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer.createCloneable[ValueParameterDescriptorImpl]

