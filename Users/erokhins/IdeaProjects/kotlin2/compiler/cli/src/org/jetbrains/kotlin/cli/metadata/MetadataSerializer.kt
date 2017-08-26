'environment' @ [55:29] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[ValueParameterDescriptorImpl]

'configuration' @ [55:41] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'configuration' @ [56:32] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'getNotNull' @ [56:46] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [56:78] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'environment' @ [57:21] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[ValueParameterDescriptorImpl]

'getSourceFiles' @ [57:33] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'special' @ [58:31] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'configuration' @ [58:43] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'getNotNull' @ [58:57] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [58:68] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [58:92] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'configuration' @ [60:23] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'get' @ [60:37] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(File..File?)>): File? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'METADATA_DESTINATION_DIRECTORY' @ [60:62] ==> public final val METADATA_DESTINATION_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'run' @ [60:97] ==> @InlineOnly public inline fun <T, R> MetadataSerializer.run(block: MetadataSerializer.() -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MetadataSerializer
    <R> -> File

'messageCollector' @ [61:13] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'report' @ [61:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [61:61] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'AnalyzerWithCompilerReport' @ [65:24] ==> public constructor AnalyzerWithCompilerReport(messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[ClassConstructorDescriptorImpl]

'messageCollector' @ [65:51] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'analyzer' @ [66:9] ==> val analyzer: AnalyzerWithCompilerReport defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'analyzeAndReport' @ [66:18] ==> public final fun analyzeAndReport(files: Collection<KtFile>, analyze: () -> AnalysisResult): Unit defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[SimpleFunctionDescriptorImpl]

'files' @ [66:35] ==> val files: List<KtFile> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'DefaultAnalyzerFacade' @ [67:13] ==> public object DefaultAnalyzerFacade : AnalyzerFacade defined in org.jetbrains.kotlin.analyzer.common[FakeCallableDescriptorForObject]

'analyzeFiles' @ [67:35] ==> public final fun analyzeFiles(files: Collection<KtFile>, moduleName: Name, dependOnBuiltIns: Boolean, languageVersionSettings: LanguageVersionSettings, capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ..., packagePartProviderFactory: (ModuleInfo, ModuleContent) -> PackagePartProvider): AnalysisResult defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade[DeserializedSimpleFunctionDescriptor]

'files' @ [67:48] ==> val files: List<KtFile> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'moduleName' @ [67:55] ==> val moduleName: Name defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'dependOnOldBuiltIns' @ [67:67] ==> private final val dependOnOldBuiltIns: Boolean defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[PropertyDescriptorImpl]

'configuration' @ [67:88] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'languageVersionSettings' @ [67:102] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'environment' @ [68:17] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[ValueParameterDescriptorImpl]

'createPackagePartProvider' @ [68:29] ==> public final fun createPackagePartProvider(scope: GlobalSearchScope): JvmPackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'content' @ [68:55] ==> value-parameter content: ModuleContent defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'moduleContentScope' @ [68:63] ==> public final val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedPropertyDescriptor]

'analyzer' @ [72:13] ==> val analyzer: AnalyzerWithCompilerReport defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'hasErrors' @ [72:22] ==> public final fun hasErrors(): Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[SimpleFunctionDescriptorImpl]

'component1' @ [74:14] ==> public final operator fun component1(): BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [74:30] ==> public final operator fun component2(): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'analyzer' @ [74:50] ==> val analyzer: AnalyzerWithCompilerReport defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'analysisResult' @ [74:59] ==> public final lateinit var analysisResult: AnalysisResult defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[PropertyDescriptorImpl]

'performSerialization' @ [76:9] ==> protected open fun performSerialization(files: Collection<KtFile>, bindingContext: BindingContext, module: ModuleDescriptor, destDir: File): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[SimpleFunctionDescriptorImpl]

'files' @ [76:30] ==> val files: List<KtFile> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'bindingContext' @ [76:37] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'moduleDescriptor' @ [76:53] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'destDir' @ [76:71] ==> val destDir: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.serialize[LocalVariableDescriptor]

'hashMapOf' @ [82:28] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<FqName, PackageParts> /* = HashMap<FqName, PackageParts> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> PackageParts

'files' @ [84:22] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'file' @ [85:33] ==> val file: KtFile defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'packageFqName' @ [85:38] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'arrayListOf' @ [86:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'file' @ [87:33] ==> val file: KtFile defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'declarations' @ [87:38] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'declaration' @ [88:17] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'accept' @ [88:29] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'KtVisitorVoid' @ [88:45] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'members' @ [90:25] ==> val members: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'add' @ [90:33] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [90:37] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'get' @ [90:52] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?), p1: (PsiElement..PsiElement?)): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> SimpleFunctionDescriptor

'FUNCTION' @ [90:71] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'function' @ [90:81] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'error' @ [91:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'function' @ [91:82] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'fqName' @ [91:91] ==> public final val KtNamedFunction.fqName: FqName?[MyPropertyDescriptor]

'members' @ [95:25] ==> val members: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'add' @ [95:33] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [95:37] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'get' @ [95:52] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?), p1: (PsiElement..PsiElement?)): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> VariableDescriptor

'VARIABLE' @ [95:71] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [95:81] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'error' @ [96:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'property' @ [96:82] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'fqName' @ [96:91] ==> public final val KtProperty.fqName: FqName?[MyPropertyDescriptor]

'members' @ [100:25] ==> val members: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'add' @ [100:33] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [100:37] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'get' @ [100:52] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?), p1: (PsiElement..PsiElement?)): TypeAliasDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> TypeAliasDescriptor

'TYPE_ALIAS' @ [100:71] ==> public final val TYPE_ALIAS: (WritableSlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeAlias' @ [100:83] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitTypeAlias[ValueParameterDescriptorImpl]

'error' @ [101:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [101:84] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitTypeAlias[ValueParameterDescriptorImpl]

'fqName' @ [101:94] ==> public final val KtTypeAlias.fqName: FqName?[MyPropertyDescriptor]

'bindingContext' @ [105:47] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'get' @ [105:62] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'CLASS' @ [105:81] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [105:88] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'error' @ [106:50] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [106:89] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'fqName' @ [106:103] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'File' @ [107:40] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destDir' @ [107:45] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'getClassFilePath' @ [107:54] ==> private final fun getClassFilePath(classId: ClassId): String defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[SimpleFunctionDescriptorImpl]

'ClassId' @ [107:71] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'packageFqName' @ [107:79] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'classDescriptor' @ [107:94] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'name' @ [107:110] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'PackageSerializer' @ [108:25] ==> public constructor PackageSerializer(classes: Collection<DeclarationDescriptor>, members: Collection<DeclarationDescriptor>, packageFqName: FqName, destFile: File) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[ClassConstructorDescriptorImpl]

'listOf' @ [108:43] ==> public fun <T> listOf(element: ClassDescriptor): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'classDescriptor' @ [108:50] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'emptyList' @ [108:68] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'packageFqName' @ [108:81] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'destFile' @ [108:96] ==> val destFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'run' @ [108:106] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'members' @ [113:17] ==> val members: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'isNotEmpty' @ [113:25] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'File' @ [114:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destDir' @ [114:37] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'getPackageFilePath' @ [114:46] ==> private final fun getPackageFilePath(packageFqName: FqName, fileName: String): String defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[SimpleFunctionDescriptorImpl]

'packageFqName' @ [114:65] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'file' @ [114:80] ==> val file: KtFile defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'name' @ [114:85] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'PackageSerializer' @ [115:17] ==> public constructor PackageSerializer(classes: Collection<DeclarationDescriptor>, members: Collection<DeclarationDescriptor>, packageFqName: FqName, destFile: File) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[ClassConstructorDescriptorImpl]

'emptyList' @ [115:35] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'members' @ [115:48] ==> val members: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'packageFqName' @ [115:57] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'destFile' @ [115:72] ==> val destFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'run' @ [115:82] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'packageTable' @ [117:17] ==> val packageTable: HashMap<FqName, PackageParts> /* = HashMap<FqName, PackageParts> */ defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'getOrPut' @ [117:30] ==> public inline fun <K, V> MutableMap<FqName, PackageParts>.getOrPut(key: FqName, defaultValue: () -> PackageParts): PackageParts defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> PackageParts

'packageFqName' @ [117:39] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'PackageParts' @ [118:21] ==> public constructor PackageParts(packageFqName: String) defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedClassConstructorDescriptor]

'packageFqName' @ [118:34] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'asString' @ [118:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'addMetadataPart' @ [119:19] ==> public final fun addMetadataPart(shortName: String): Unit defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedSimpleFunctionDescriptor]

'destFile' @ [119:35] ==> val destFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'nameWithoutExtension' @ [119:44] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'File' @ [123:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destDir' @ [123:37] ==> value-parameter destDir: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'getMappingFileName' @ [123:61] ==> @NotNull public open fun getMappingFileName(@NotNull p0: String): String defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'getModuleName' @ [123:95] ==> @NotNull public open fun getModuleName(p0: (ModuleDescriptor..ModuleDescriptor?)): String defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'module' @ [123:109] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[ValueParameterDescriptorImpl]

'newBuilder' @ [124:62] ==> public open fun newBuilder(): (JvmPackageTable.PackageTable.Builder..JvmPackageTable.PackageTable.Builder?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable[JavaMethodDescriptor]

'apply' @ [124:75] ==> @InlineOnly public inline fun <T> (JvmPackageTable.PackageTable.Builder..JvmPackageTable.PackageTable.Builder?).apply(block: (JvmPackageTable.PackageTable.Builder..JvmPackageTable.PackageTable.Builder?).() -> Unit): (JvmPackageTable.PackageTable.Builder..JvmPackageTable.PackageTable.Builder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable.Builder..org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable.Builder?)

'packageTable' @ [125:27] ==> val packageTable: HashMap<FqName, PackageParts> /* = HashMap<FqName, PackageParts> */ defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'values' @ [125:40] ==> public open val values: MutableCollection<PackageParts> defined in java.util.HashMap[JavaPropertyDescriptor]

'table' @ [126:17] ==> val table: PackageParts defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<anonymous>[LocalVariableDescriptor]

'addTo' @ [126:23] ==> public final fun addTo(builder: JvmPackageTable.PackageTable.Builder): Unit defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedSimpleFunctionDescriptor]

'this' @ [126:29] ==> <this> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization.<anonymous>[ReceiverParameterDescriptorImpl]

'serializeToByteArray' @ [128:11] ==> public fun JvmPackageTable.PackageTable.Builder.serializeToByteArray(): ByteArray defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'kotlinModuleFile' @ [130:9] ==> val kotlinModuleFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'parentFile' @ [130:26] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [130:37] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'kotlinModuleFile' @ [131:9] ==> val kotlinModuleFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'writeBytes' @ [131:26] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'packageTableBytes' @ [131:37] ==> val packageTableBytes: ByteArray defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.performSerialization[LocalVariableDescriptor]

'MetadataSerializerExtension' @ [134:85] ==> public constructor MetadataSerializerExtension() defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializerExtension[ClassConstructorDescriptorImpl]

'packageFqName' @ [137:13] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.getPackageFilePath[ValueParameterDescriptorImpl]

'asString' @ [137:27] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'replace' @ [137:38] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'PackagePartClassUtils' @ [138:13] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFilePartShortName' @ [138:35] ==> @JvmStatic public final fun getFilePartShortName(fileName: String): String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'fileName' @ [138:56] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.getPackageFilePath[ValueParameterDescriptorImpl]

'DOT_METADATA_FILE_EXTENSION' @ [138:68] ==> public final val DOT_METADATA_FILE_EXTENSION: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.Companion[PropertyImportedFromObject]

'classId' @ [141:13] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.getClassFilePath[ValueParameterDescriptorImpl]

'asSingleFqName' @ [141:21] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'asString' @ [141:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'replace' @ [141:49] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DOT_METADATA_FILE_EXTENSION' @ [141:69] ==> public final val DOT_METADATA_FILE_EXTENSION: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.Companion[PropertyImportedFromObject]

'newBuilder' @ [149:54] ==> public open fun newBuilder(): (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'createSerializerExtension' @ [150:33] ==> protected open fun createSerializerExtension(): KotlinSerializerExtensionBase defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[SimpleFunctionDescriptorImpl]

'serializeClasses' @ [153:13] ==> private final fun serializeClasses(classes: Collection<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'classes' @ [153:30] ==> private final val classes: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'serializeMembers' @ [154:13] ==> private final fun serializeMembers(members: Collection<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'members' @ [154:30] ==> private final val members: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'serializeStringTable' @ [155:13] ==> private final fun serializeStringTable(): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'serializeBuiltInsFile' @ [156:13] ==> private final fun serializeBuiltInsFile(): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'DescriptorSerializer' @ [160:30] ==> public companion object defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[FakeCallableDescriptorForObject]

'createTopLevel' @ [160:51] ==> @JvmStatic public final fun createTopLevel(extension: SerializerExtension): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[DeserializedSimpleFunctionDescriptor]

'extension' @ [160:66] ==> private final val extension: KotlinSerializerExtensionBase defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'classProto' @ [160:77] ==> public final fun classProto(classDescriptor: ClassDescriptor): ProtoBuf.Class.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [160:88] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeClass[ValueParameterDescriptorImpl]

'build' @ [160:105] ==> public open fun build(): (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'proto' @ [161:13] ==> private final val proto: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'addClass_' @ [161:19] ==> public open fun addClass_(p0: (ProtoBuf.Class..ProtoBuf.Class?)): (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment.Builder[JavaMethodDescriptor]

'classProto' @ [161:29] ==> val classProto: (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeClass[LocalVariableDescriptor]

'serializeClasses' @ [163:13] ==> private final fun serializeClasses(classes: Collection<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [163:30] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeClass[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [163:46] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [163:77] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [163:103] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CLASSIFIERS' @ [163:124] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'DescriptorSerializer' @ [167:32] ==> public companion object defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[FakeCallableDescriptorForObject]

'sort' @ [167:53] ==> public final fun <T : DeclarationDescriptor> sort(descriptors: Collection<DeclarationDescriptor>): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : DeclarationDescriptor> -> DeclarationDescriptor

'classes' @ [167:58] ==> value-parameter classes: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeClasses[ValueParameterDescriptorImpl]

'descriptor' @ [168:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeClasses[LocalVariableDescriptor]

'descriptor' @ [168:54] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeClasses[LocalVariableDescriptor]

'kind' @ [168:65] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_ENTRY' @ [168:83] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'serializeClass' @ [169:21] ==> private final fun serializeClass(classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'descriptor' @ [169:36] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeClasses[LocalVariableDescriptor]

'proto' @ [175:13] ==> private final val proto: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'`package`' @ [175:19] ==> public final var ProtoBuf.PackageFragment.Builder.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'DescriptorSerializer' @ [175:31] ==> public companion object defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[FakeCallableDescriptorForObject]

'createTopLevel' @ [175:52] ==> @JvmStatic public final fun createTopLevel(extension: SerializerExtension): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[DeserializedSimpleFunctionDescriptor]

'extension' @ [175:67] ==> private final val extension: KotlinSerializerExtensionBase defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'packagePartProto' @ [175:78] ==> public final fun packagePartProto(packageFqName: FqName, members: Collection<DeclarationDescriptor>): ProtoBuf.Package.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [175:95] ==> private final val packageFqName: FqName defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'members' @ [175:110] ==> value-parameter members: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeMembers[ValueParameterDescriptorImpl]

'build' @ [175:119] ==> public open fun build(): (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder[JavaMethodDescriptor]

'component1' @ [179:18] ==> public final operator fun component1(): ProtoBuf.StringTable defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [179:27] ==> public final operator fun component2(): ProtoBuf.QualifiedNameTable defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'extension' @ [179:45] ==> private final val extension: KotlinSerializerExtensionBase defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'stringTable' @ [179:55] ==> public open val stringTable: StringTableImpl defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[DeserializedPropertyDescriptor]

'buildProto' @ [179:67] ==> public final fun buildProto(): Pair<ProtoBuf.StringTable, ProtoBuf.QualifiedNameTable> defined in org.jetbrains.kotlin.serialization.StringTableImpl[DeserializedSimpleFunctionDescriptor]

'proto' @ [180:13] ==> private final val proto: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'strings' @ [180:19] ==> public final var ProtoBuf.PackageFragment.Builder.strings: (ProtoBuf.StringTable..ProtoBuf.StringTable?)[MyPropertyDescriptor]

'strings' @ [180:29] ==> val strings: ProtoBuf.StringTable defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeStringTable[LocalVariableDescriptor]

'proto' @ [181:13] ==> private final val proto: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'qualifiedNames' @ [181:19] ==> public final var ProtoBuf.PackageFragment.Builder.qualifiedNames: (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?)[MyPropertyDescriptor]

'qualifiedNames' @ [181:36] ==> val qualifiedNames: ProtoBuf.QualifiedNameTable defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeStringTable[LocalVariableDescriptor]

'ByteArrayOutputStream' @ [185:26] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'with' @ [186:13] ==> @InlineOnly public inline fun <T, R> with(receiver: DataOutputStream, block: DataOutputStream.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataOutputStream
    <R> -> Unit

'DataOutputStream' @ [186:18] ==> public constructor DataOutputStream(p0: (OutputStream..OutputStream?)) defined in java.io.DataOutputStream[JavaClassConstructorDescriptor]

'stream' @ [186:35] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeBuiltInsFile[LocalVariableDescriptor]

'BuiltInsBinaryVersion' @ [187:31] ==> public companion object defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [187:53] ==> @field:JvmField public final val INSTANCE: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion.Companion[DeserializedPropertyDescriptor]

'toArray' @ [187:62] ==> public final fun toArray(): IntArray defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion[DeserializedSimpleFunctionDescriptor]

'writeInt' @ [188:17] ==> public final fun writeInt(p0: Int): Unit defined in java.io.DataOutputStream[JavaMethodDescriptor]

'version' @ [188:26] ==> val version: IntArray defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeBuiltInsFile.<anonymous>[LocalVariableDescriptor]

'size' @ [188:34] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'version' @ [189:17] ==> val version: IntArray defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeBuiltInsFile.<anonymous>[LocalVariableDescriptor]

'forEach' @ [189:25] ==> public inline fun IntArray.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'writeInt' @ [189:35] ==> public final fun writeInt(p0: Int): Unit defined in java.io.DataOutputStream[JavaMethodDescriptor]

'it' @ [189:44] ==> value-parameter it: Int defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeBuiltInsFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [191:13] ==> private final val proto: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'build' @ [191:19] ==> public open fun build(): (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment.Builder[JavaMethodDescriptor]

'writeTo' @ [191:27] ==> public open fun writeTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'stream' @ [191:35] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeBuiltInsFile[LocalVariableDescriptor]

'write' @ [192:13] ==> private final fun write(stream: ByteArrayOutputStream): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[SimpleFunctionDescriptorImpl]

'stream' @ [192:19] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.serializeBuiltInsFile[LocalVariableDescriptor]

'totalSize' @ [196:13] ==> protected final var totalSize: Int defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[PropertyDescriptorImpl]

'stream' @ [196:26] ==> value-parameter stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.write[ValueParameterDescriptorImpl]

'size' @ [196:33] ==> public open fun size(): Int defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'totalFiles' @ [197:13] ==> protected final var totalFiles: Int defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[PropertyDescriptorImpl]

'assert' @ [198:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [198:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'destFile' @ [198:21] ==> private final val destFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'isDirectory' @ [198:30] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'destFile' @ [198:103] ==> private final val destFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'destFile' @ [199:13] ==> private final val destFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'parentFile' @ [199:22] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [199:33] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'destFile' @ [200:13] ==> private final val destFile: File defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer[PropertyDescriptorImpl]

'writeBytes' @ [200:22] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stream' @ [200:33] ==> value-parameter stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer.PackageSerializer.write[ValueParameterDescriptorImpl]

'toByteArray' @ [200:40] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

