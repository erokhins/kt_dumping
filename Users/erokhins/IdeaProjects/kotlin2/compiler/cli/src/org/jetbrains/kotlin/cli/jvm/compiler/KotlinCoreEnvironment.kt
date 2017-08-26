'KotlinCoreProjectEnvironment' @ [118:75] ==> public constructor KotlinCoreProjectEnvironment(disposable: Disposable, applicationEnvironment: JavaCoreApplicationEnvironment) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreProjectEnvironment[ClassConstructorDescriptorImpl]

'parentDisposable' @ [118:104] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'applicationEnvironment' @ [118:122] ==> value-parameter applicationEnvironment: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'registerProjectExtensionPoints' @ [120:13] ==> private final fun registerProjectExtensionPoints(area: ExtensionsArea): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'getArea' @ [120:55] ==> @NotNull public open fun getArea(@Nullable p0: AreaInstance?): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'project' @ [120:63] ==> public final val <no name provided>.project: MockProject[MyPropertyDescriptor]

'with' @ [124:13] ==> @InlineOnly public inline fun <T, R> with(receiver: MockProject, block: (MockProject).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockProject
    <R> -> Unit

'project' @ [124:19] ==> public final val <no name provided>.project: MockProject[MyPropertyDescriptor]

'registerService' @ [125:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(CoreJavaFileManager..CoreJavaFileManager?)>, @NotNull p1: CoreJavaFileManager): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CoreJavaFileManager

'CoreJavaFileManager' @ [125:33] ==> public constructor CoreJavaFileManager(p0: (PsiManager..PsiManager?)) defined in com.intellij.core.CoreJavaFileManager[JavaClassConstructorDescriptor]

'java' @ [125:60] ==> public val <T> KClass<CoreJavaFileManager>.java: Class<CoreJavaFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CoreJavaFileManager

'getService' @ [125:81] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(JavaFileManager..JavaFileManager?)>): (JavaFileManager..JavaFileManager?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaFileManager

'this' @ [125:92] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[ReceiverParameterDescriptorImpl]

'java' @ [125:121] ==> public val <T> KClass<JavaFileManager>.java: Class<JavaFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaFileManager

'CliLightClassGenerationSupport' @ [127:54] ==> public constructor CliLightClassGenerationSupport(project: Project) defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[ClassConstructorDescriptorImpl]

'this' @ [127:85] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[ReceiverParameterDescriptorImpl]

'registerService' @ [128:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(LightClassGenerationSupport..LightClassGenerationSupport?)>, @NotNull p1: LightClassGenerationSupport): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LightClassGenerationSupport

'LightClassGenerationSupport' @ [128:33] ==> public companion object defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[FakeCallableDescriptorForObject]

'java' @ [128:68] ==> public val <T> KClass<LightClassGenerationSupport>.java: Class<LightClassGenerationSupport> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LightClassGenerationSupport

'cliLightClassGenerationSupport' @ [128:74] ==> val cliLightClassGenerationSupport: CliLightClassGenerationSupport defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[LocalVariableDescriptor]

'registerService' @ [129:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(CliLightClassGenerationSupport..CliLightClassGenerationSupport?)>, @NotNull p1: CliLightClassGenerationSupport): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CliLightClassGenerationSupport

'CliLightClassGenerationSupport' @ [129:33] ==> public constructor CliLightClassGenerationSupport(project: Project) defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[ClassConstructorDescriptorImpl]

'java' @ [129:71] ==> public val <T> KClass<CliLightClassGenerationSupport>.java: Class<CliLightClassGenerationSupport> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CliLightClassGenerationSupport

'cliLightClassGenerationSupport' @ [129:77] ==> val cliLightClassGenerationSupport: CliLightClassGenerationSupport defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[LocalVariableDescriptor]

'registerService' @ [130:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(CodeAnalyzerInitializer..CodeAnalyzerInitializer?)>, @NotNull p1: CodeAnalyzerInitializer): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CodeAnalyzerInitializer

'CodeAnalyzerInitializer' @ [130:33] ==> public companion object defined in org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer[FakeCallableDescriptorForObject]

'java' @ [130:64] ==> public val <T> KClass<CodeAnalyzerInitializer>.java: Class<CodeAnalyzerInitializer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CodeAnalyzerInitializer

'cliLightClassGenerationSupport' @ [130:70] ==> val cliLightClassGenerationSupport: CliLightClassGenerationSupport defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[LocalVariableDescriptor]

'registerService' @ [132:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(ExternalAnnotationsManager..ExternalAnnotationsManager?)>, @NotNull p1: ExternalAnnotationsManager): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExternalAnnotationsManager

'ExternalAnnotationsManager' @ [132:33] ==> public constructor ExternalAnnotationsManager() defined in com.intellij.codeInsight.ExternalAnnotationsManager[JavaClassConstructorDescriptor]

'java' @ [132:67] ==> public val <T> KClass<ExternalAnnotationsManager>.java: Class<ExternalAnnotationsManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExternalAnnotationsManager

'MockExternalAnnotationsManager' @ [132:73] ==> public constructor MockExternalAnnotationsManager() defined in org.jetbrains.kotlin.cli.jvm.compiler.MockExternalAnnotationsManager[ClassConstructorDescriptorImpl]

'registerService' @ [133:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(InferredAnnotationsManager..InferredAnnotationsManager?)>, @NotNull p1: InferredAnnotationsManager): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InferredAnnotationsManager

'InferredAnnotationsManager' @ [133:33] ==> public constructor InferredAnnotationsManager() defined in com.intellij.codeInsight.InferredAnnotationsManager[JavaClassConstructorDescriptor]

'java' @ [133:67] ==> public val <T> KClass<InferredAnnotationsManager>.java: Class<InferredAnnotationsManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InferredAnnotationsManager

'MockInferredAnnotationsManager' @ [133:73] ==> public constructor MockInferredAnnotationsManager() defined in org.jetbrains.kotlin.cli.jvm.compiler.MockInferredAnnotationsManager[ClassConstructorDescriptorImpl]

'getArea' @ [135:39] ==> @NotNull public open fun getArea(@Nullable p0: AreaInstance?): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'this' @ [135:47] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[ReceiverParameterDescriptorImpl]

'area' @ [137:17] ==> val area: ExtensionsArea defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[LocalVariableDescriptor]

'getExtensionPoint' @ [137:22] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensionPoint(@NotNull p0: ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>): ExtensionPoint<(PsiElementFinder..PsiElementFinder?)> defined in com.intellij.openapi.extensions.ExtensionsArea[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElementFinder

'EP_NAME' @ [137:57] ==> public final val EP_NAME: (ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>..ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>?) defined in com.intellij.psi.PsiElementFinder[JavaPropertyDescriptor]

'registerExtension' @ [137:66] ==> public abstract fun registerExtension(@NotNull p0: PsiElementFinder): Unit defined in com.intellij.openapi.extensions.ExtensionPoint[JavaMethodDescriptor]

'JavaElementFinder' @ [137:84] ==> public constructor JavaElementFinder(@NotNull p0: Project, @NotNull p1: LightClassGenerationSupport) defined in org.jetbrains.kotlin.asJava.finder.JavaElementFinder[JavaClassConstructorDescriptor]

'this' @ [137:102] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[ReceiverParameterDescriptorImpl]

'cliLightClassGenerationSupport' @ [137:108] ==> val cliLightClassGenerationSupport: CliLightClassGenerationSupport defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[LocalVariableDescriptor]

'area' @ [138:17] ==> val area: ExtensionsArea defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[LocalVariableDescriptor]

'getExtensionPoint' @ [138:22] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensionPoint(@NotNull p0: ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>): ExtensionPoint<(PsiElementFinder..PsiElementFinder?)> defined in com.intellij.openapi.extensions.ExtensionsArea[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElementFinder

'EP_NAME' @ [138:57] ==> public final val EP_NAME: (ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>..ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>?) defined in com.intellij.psi.PsiElementFinder[JavaPropertyDescriptor]

'registerExtension' @ [138:66] ==> public abstract fun registerExtension(@NotNull p0: PsiElementFinder): Unit defined in com.intellij.openapi.extensions.ExtensionPoint[JavaMethodDescriptor]

'PsiElementFinderImpl' @ [139:25] ==> public constructor PsiElementFinderImpl(p0: (Project..Project?), p1: (JavaFileManager..JavaFileManager?)) defined in com.intellij.psi.impl.PsiElementFinderImpl[JavaClassConstructorDescriptor]

'this' @ [139:46] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[ReceiverParameterDescriptorImpl]

'getService' @ [139:67] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(JavaFileManager..JavaFileManager?)>): (JavaFileManager..JavaFileManager?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaFileManager

'this' @ [139:78] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>.registerJavaPsiFacade.<anonymous>[ReceiverParameterDescriptorImpl]

'java' @ [139:107] ==> public val <T> KClass<JavaFileManager>.java: Class<JavaFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaFileManager

'super' @ [142:13] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.projectEnvironment.<no name provided>[LazyClassReceiverParameterDescriptor]

'registerJavaPsiFacade' @ [142:19] ==> protected/*protected and package*/ open fun registerJavaPsiFacade(): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreProjectEnvironment[JavaMethodDescriptor]

'mutableListOf' @ [146:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'mutableListOf' @ [148:40] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JvmPackagePartProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPackagePartProvider

'configuration' @ [153:48] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'copy' @ [153:62] ==> public open fun copy(): (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'setMaxIntellisenseFileSize' @ [156:31] ==> public open fun setMaxIntellisenseFileSize(p0: Int): Unit defined in com.intellij.openapi.vfs.PersistentFSConstants[JavaMethodDescriptor]

'LARGE_FOR_CONTENT_LOADING' @ [156:69] ==> public const final val LARGE_FOR_CONTENT_LOADING: Int defined in com.intellij.openapi.util.io.FileUtilRt[JavaPropertyDescriptor]

'projectEnvironment' @ [158:23] ==> private final val projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'project' @ [158:42] ==> public final val JavaCoreProjectEnvironment.project: MockProject[MyPropertyDescriptor]

'ExpressionCodegenExtension' @ [160:9] ==> public companion object : ProjectExtensionDescriptor<ExpressionCodegenExtension> defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [160:36] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [160:59] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'SyntheticResolveExtension' @ [161:9] ==> public companion object : ProjectExtensionDescriptor<SyntheticResolveExtension> defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [161:35] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [161:58] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'ClassBuilderInterceptorExtension' @ [162:9] ==> public companion object : ProjectExtensionDescriptor<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [162:42] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [162:65] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'AnalysisHandlerExtension' @ [163:9] ==> public companion object : ProjectExtensionDescriptor<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [163:34] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [163:57] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'PackageFragmentProviderExtension' @ [164:9] ==> public companion object : ProjectExtensionDescriptor<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [164:42] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [164:65] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'StorageComponentContainerContributor' @ [165:9] ==> public companion object : ProjectExtensionDescriptor<StorageComponentContainerContributor> defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [165:46] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [165:69] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'DeclarationAttributeAltererExtension' @ [166:9] ==> public companion object : ProjectExtensionDescriptor<DeclarationAttributeAltererExtension> defined in org.jetbrains.kotlin.extensions.DeclarationAttributeAltererExtension[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [166:46] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.extensions.DeclarationAttributeAltererExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [166:69] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'PreprocessedVirtualFileFactoryExtension' @ [167:9] ==> public companion object : ProjectExtensionDescriptor<PreprocessedVirtualFileFactoryExtension> defined in org.jetbrains.kotlin.extensions.PreprocessedVirtualFileFactoryExtension[FakeCallableDescriptorForObject]

'registerExtensionPoint' @ [167:49] ==> public final fun registerExtensionPoint(project: Project): Unit defined in org.jetbrains.kotlin.extensions.PreprocessedVirtualFileFactoryExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [167:72] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'configuration' @ [169:27] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'getList' @ [169:41] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(ComponentRegistrar..ComponentRegistrar?)>..List<(ComponentRegistrar..ComponentRegistrar?)>?)>): (MutableList<(ComponentRegistrar..ComponentRegistrar?)>..List<(ComponentRegistrar..ComponentRegistrar?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ComponentRegistrar

'ComponentRegistrar' @ [169:49] ==> public companion object defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar[FakeCallableDescriptorForObject]

'PLUGIN_COMPONENT_REGISTRARS' @ [169:68] ==> public final val PLUGIN_COMPONENT_REGISTRARS: CompilerConfigurationKey<MutableList<ComponentRegistrar>> defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar.Companion[DeserializedPropertyDescriptor]

'registrar' @ [170:13] ==> val registrar: (ComponentRegistrar..ComponentRegistrar?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'registerProjectComponents' @ [170:23] ==> public abstract fun registerProjectComponents(project: MockProject, configuration: CompilerConfiguration): Unit defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar[DeserializedSimpleFunctionDescriptor]

'project' @ [170:49] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'configuration' @ [170:58] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'project' @ [173:9] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'registerService' @ [173:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(DeclarationProviderFactoryService..DeclarationProviderFactoryService?)>, @NotNull p1: DeclarationProviderFactoryService): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DeclarationProviderFactoryService

'DeclarationProviderFactoryService' @ [173:33] ==> public companion object defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService[FakeCallableDescriptorForObject]

'java' @ [173:74] ==> public val <T> KClass<DeclarationProviderFactoryService>.java: Class<DeclarationProviderFactoryService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeclarationProviderFactoryService

'CliDeclarationProviderFactoryService' @ [173:80] ==> public constructor CliDeclarationProviderFactoryService(sourceFiles: Collection<KtFile>) defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService[DeserializedClassConstructorDescriptor]

'sourceFiles' @ [173:117] ==> private final val sourceFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'project' @ [174:9] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'registerService' @ [174:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(ModuleVisibilityManager..ModuleVisibilityManager?)>, @NotNull p1: ModuleVisibilityManager): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleVisibilityManager

'java' @ [174:64] ==> public val <T> KClass<ModuleVisibilityManager>.java: Class<ModuleVisibilityManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ModuleVisibilityManager

'CliModuleVisibilityManagerImpl' @ [174:70] ==> public constructor CliModuleVisibilityManagerImpl(enabled: Boolean) defined in org.jetbrains.kotlin.cli.common.CliModuleVisibilityManagerImpl[ClassConstructorDescriptorImpl]

'configFiles' @ [174:101] ==> value-parameter configFiles: EnvironmentConfigFiles defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'JVM_CONFIG_FILES' @ [174:139] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'registerProjectServicesForCLI' @ [176:9] ==> private final fun registerProjectServicesForCLI(@Suppress projectEnvironment: JavaCoreProjectEnvironment): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'projectEnvironment' @ [176:39] ==> private final val projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'configuration' @ [177:32] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'get' @ [177:46] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [177:71] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'registerProjectServices' @ [178:9] ==> @JvmStatic public final fun registerProjectServices(projectEnvironment: JavaCoreProjectEnvironment, messageCollector: MessageCollector?): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'projectEnvironment' @ [178:33] ==> private final val projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'messageCollector' @ [178:53] ==> val messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'sourceFiles' @ [180:9] ==> private final val sourceFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getKtFiles' @ [180:47] ==> @NotNull public open fun getKtFiles(@NotNull project: Project, @NotNull sourceRoots: (MutableCollection<(String..String?)>..Collection<(String..String?)>), @NotNull configuration: CompilerConfiguration, @NotNull reportError: ((String..String?)) -> (Unit..Unit?)): (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.CompileEnvironmentUtil[JavaMethodDescriptor]

'project' @ [180:58] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'getSourceRootsCheckingForDuplicates' @ [180:67] ==> private final fun getSourceRootsCheckingForDuplicates(): Collection<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'this' @ [180:106] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[LazyClassReceiverParameterDescriptor]

'configuration' @ [180:111] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'report' @ [182:13] ==> private final fun report(severity: CompilerMessageSeverity, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'ERROR' @ [182:20] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [182:27] ==> value-parameter message: (String..String?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [184:9] ==> private final val sourceFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'sortBy' @ [184:21] ==> public inline fun <T, R : Comparable<String>> MutableList<KtFile>.sortBy(crossinline selector: (KtFile) -> String?): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R : Comparable<R>> -> String

'it' @ [184:30] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [184:33] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [184:45] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'KotlinScriptDefinitionProvider' @ [186:9] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[FakeCallableDescriptorForObject]

'getInstance' @ [186:40] ==> @JvmStatic public final fun getInstance(project: Project): KotlinScriptDefinitionProvider? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [186:52] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'let' @ [186:62] ==> @InlineOnly public inline fun <T, R> KotlinScriptDefinitionProvider.let(block: (KotlinScriptDefinitionProvider) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinitionProvider
    <R> -> Unit

'scriptDefinitionProvider' @ [187:13] ==> value-parameter scriptDefinitionProvider: KotlinScriptDefinitionProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[ValueParameterDescriptorImpl]

'setScriptDefinitions' @ [187:38] ==> public final fun setScriptDefinitions(newDefinitions: List<KotlinScriptDefinition>): Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'configuration' @ [188:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'getList' @ [188:35] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>): (MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinScriptDefinition

'SCRIPT_DEFINITIONS' @ [188:64] ==> public final val SCRIPT_DEFINITIONS: (CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>..CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'ScriptDependenciesProvider' @ [190:13] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[FakeCallableDescriptorForObject]

'getInstance' @ [190:40] ==> public final fun getInstance(project: Project): ScriptDependenciesProvider defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [190:52] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'let' @ [190:61] ==> @InlineOnly public inline fun <T, R> ScriptDependenciesProvider.let(block: (ScriptDependenciesProvider) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependenciesProvider
    <R> -> Unit

'configuration' @ [191:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'addJvmClasspathRoots' @ [191:31] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[SimpleFunctionDescriptorImpl]

'sourceFiles' @ [192:25] ==> private final val sourceFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'mapNotNull' @ [192:37] ==> public inline fun <T, R : Any> Iterable<KtFile>.mapNotNull(transform: (KtFile) -> ScriptDependencies?): List<ScriptDependencies> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R : Any> -> ScriptDependencies

'importsProvider' @ [192:48] ==> value-parameter importsProvider: ScriptDependenciesProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [193:34] ==> public inline fun <T, R> Iterable<ScriptDependencies>.flatMap(transform: (ScriptDependencies) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> File

'it' @ [193:44] ==> value-parameter it: ScriptDependencies defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'classpath' @ [193:47] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'distinctBy' @ [194:34] ==> public inline fun <T, K> Iterable<File>.distinctBy(selector: (File) -> (String..String?)): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <K> -> (kotlin.String..kotlin.String?)

'it' @ [194:47] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [194:50] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'configuration' @ [198:23] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'get' @ [198:37] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(File..File?)>): File? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'JDK_HOME' @ [198:62] ==> public final val JDK_HOME: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'getInstance' @ [199:48] ==> @NotNull public open fun getInstance(): VirtualFileManager defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'getFileSystem' @ [199:62] ==> public abstract fun getFileSystem(p0: (String..String?)): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'JRT_PROTOCOL' @ [199:96] ==> public const final val JRT_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'CliJavaModuleFinder' @ [200:32] ==> public constructor CliJavaModuleFinder(jrtFileSystemRoot: VirtualFile?) defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[ClassConstructorDescriptorImpl]

'jdkHome' @ [200:52] ==> val jdkHome: File? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'path' @ [200:61] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'let' @ [200:67] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> VirtualFile?): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> VirtualFile?

'jrtFileSystem' @ [201:13] ==> val jrtFileSystem: (VirtualFileSystem..VirtualFileSystem?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'findFileByPath' @ [201:28] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'path' @ [201:43] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[ValueParameterDescriptorImpl]

'JAR_SEPARATOR' @ [201:58] ==> public const final val JAR_SEPARATOR: String defined in com.intellij.util.io.URLUtil[JavaPropertyDescriptor]

'classpathRootsResolver' @ [203:9] ==> private final val classpathRootsResolver: ClasspathRootsResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'ClasspathRootsResolver' @ [203:34] ==> public constructor ClasspathRootsResolver(psiManager: PsiManager, messageCollector: MessageCollector?, additionalModules: List<String>, contentRootToVirtualFile: (JvmContentRoot) -> VirtualFile?, javaModuleFinder: CliJavaModuleFinder) defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[ClassConstructorDescriptorImpl]

'getInstance' @ [204:28] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [204:40] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'messageCollector' @ [205:17] ==> val messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'configuration' @ [206:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'getList' @ [206:31] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'ADDITIONAL_JAVA_MODULES' @ [206:60] ==> public final val ADDITIONAL_JAVA_MODULES: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'this' @ [207:17] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[LazyClassReceiverParameterDescriptor]

'javaModuleFinder' @ [208:17] ==> val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'component1' @ [211:14] ==> public final operator fun component1(): List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.RootsAndModules[SimpleFunctionDescriptorImpl]

'component2' @ [211:28] ==> public final operator fun component2(): List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.RootsAndModules[SimpleFunctionDescriptorImpl]

'classpathRootsResolver' @ [212:17] ==> private final val classpathRootsResolver: ClasspathRootsResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'convertClasspathRoots' @ [212:40] ==> public final fun convertClasspathRoots(contentRoots: List<ContentRoot>): ClasspathRootsResolver.RootsAndModules defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'configuration' @ [212:62] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'getList' @ [212:76] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>): (MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [212:105] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'this' @ [213:9] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[LazyClassReceiverParameterDescriptor]

'initialRoots' @ [213:14] ==> private final val initialRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'initialRoots' @ [213:29] ==> val initialRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'!' @ [215:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [215:14] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'getBoolean' @ [215:28] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'SKIP_RUNTIME_VERSION_CHECK' @ [215:60] ==> public final val SKIP_RUNTIME_VERSION_CHECK: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'messageCollector' @ [215:91] ==> val messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'JvmRuntimeVersionsConsistencyChecker' @ [216:13] ==> public object JvmRuntimeVersionsConsistencyChecker defined in org.jetbrains.kotlin.cli.jvm in file JvmRuntimeVersionsConsistencyChecker.kt[FakeCallableDescriptorForObject]

'checkCompilerClasspathConsistency' @ [216:50] ==> public final fun checkCompilerClasspathConsistency(messageCollector: MessageCollector, configuration: CompilerConfiguration, classpathJarRoots: List<VirtualFile>): Unit defined in org.jetbrains.kotlin.cli.jvm.JvmRuntimeVersionsConsistencyChecker[SimpleFunctionDescriptorImpl]

'messageCollector' @ [217:21] ==> val messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'configuration' @ [218:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'initialRoots' @ [219:21] ==> val initialRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'mapNotNull' @ [219:34] ==> public inline fun <T, R : Any> Iterable<JavaRoot>.mapNotNull(transform: (JavaRoot) -> VirtualFile?): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot
    <R : Any> -> VirtualFile

'component1' @ [219:48] ==> public final operator fun component1(): VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[SimpleFunctionDescriptorImpl]

'component2' @ [219:54] ==> public final operator fun component2(): JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[SimpleFunctionDescriptorImpl]

'if (type == JavaRoot.RootType.BINARY) file else null' @ [219:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VirtualFile?, elseBranch: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VirtualFile?

'type' @ [219:67] ==> val type: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[LocalVariableDescriptor]

'JavaRoot' @ [219:75] ==> public companion object RootTypes defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[FakeCallableDescriptorForObject]

'BINARY' @ [219:93] ==> enum entry BINARY defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'file' @ [219:101] ==> val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[LocalVariableDescriptor]

'component1' @ [223:14] ==> public final operator fun component1(): List<JavaRoot> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [223:21] ==> public final operator fun component2(): List<JavaRoot> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'initialRoots' @ [224:17] ==> val initialRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'partition' @ [224:30] ==> public inline fun <T> Iterable<JavaRoot>.partition(predicate: (JavaRoot) -> Boolean): Pair<List<JavaRoot>, List<JavaRoot>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot

'component1' @ [224:43] ==> public final operator fun component1(): VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[SimpleFunctionDescriptorImpl]

'file' @ [224:52] ==> val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[LocalVariableDescriptor]

'isDirectory' @ [224:57] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [224:72] ==> val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[LocalVariableDescriptor]

'extension' @ [224:77] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'DEFAULT_EXTENSION' @ [224:103] ==> @NonNls public const final val DEFAULT_EXTENSION: String defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'rootsIndex' @ [227:9] ==> private final val rootsIndex: JvmDependenciesDynamicCompoundIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'JvmDependenciesDynamicCompoundIndex' @ [227:22] ==> public constructor JvmDependenciesDynamicCompoundIndex() defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[ClassConstructorDescriptorImpl]

'apply' @ [227:60] ==> @InlineOnly public inline fun <T> JvmDependenciesDynamicCompoundIndex.apply(block: JvmDependenciesDynamicCompoundIndex.() -> Unit): JvmDependenciesDynamicCompoundIndex defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesDynamicCompoundIndex

'addIndex' @ [228:13] ==> public final fun addIndex(index: JvmDependenciesIndex): Unit defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[SimpleFunctionDescriptorImpl]

'JvmDependenciesIndexImpl' @ [228:22] ==> public constructor JvmDependenciesIndexImpl(_roots: List<JavaRoot>) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[ClassConstructorDescriptorImpl]

'roots' @ [228:47] ==> val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'updateClasspathFromRootsIndex' @ [229:13] ==> private final fun updateClasspathFromRootsIndex(index: JvmDependenciesIndex): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'this' @ [229:43] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<anonymous>[ReceiverParameterDescriptorImpl]

'getService' @ [232:25] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(CoreJavaFileManager..CoreJavaFileManager?)>): (CoreJavaFileManager..CoreJavaFileManager?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CoreJavaFileManager

'project' @ [232:36] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'CoreJavaFileManager' @ [232:45] ==> public constructor CoreJavaFileManager(p0: (PsiManager..PsiManager?)) defined in com.intellij.core.CoreJavaFileManager[JavaClassConstructorDescriptor]

'java' @ [232:72] ==> public val <T> KClass<CoreJavaFileManager>.java: Class<CoreJavaFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CoreJavaFileManager

'initialize' @ [232:111] ==> public final fun initialize(index: JvmDependenciesIndex, singleJavaFileRootsIndex: SingleJavaFileRootsIndex, useFastClassFilesReading: Boolean): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'rootsIndex' @ [233:17] ==> private final val rootsIndex: JvmDependenciesDynamicCompoundIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'SingleJavaFileRootsIndex' @ [234:17] ==> public constructor SingleJavaFileRootsIndex(roots: List<JavaRoot>) defined in org.jetbrains.kotlin.cli.jvm.index.SingleJavaFileRootsIndex[ClassConstructorDescriptorImpl]

'singleJavaFileRoots' @ [234:42] ==> val singleJavaFileRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'configuration' @ [235:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[ValueParameterDescriptorImpl]

'getBoolean' @ [235:31] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'USE_FAST_CLASS_FILES_READING' @ [235:63] ==> public final val USE_FAST_CLASS_FILES_READING: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'project' @ [238:9] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'registerService' @ [238:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(JavaModuleResolver..JavaModuleResolver?)>, @NotNull p1: JavaModuleResolver): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaModuleResolver

'JavaModuleResolver' @ [239:17] ==> public companion object SERVICE defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[FakeCallableDescriptorForObject]

'java' @ [239:43] ==> public val <T> KClass<JavaModuleResolver>.java: Class<JavaModuleResolver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaModuleResolver

'CliJavaModuleResolver' @ [240:17] ==> public constructor CliJavaModuleResolver(moduleGraph: JavaModuleGraph, userModules: List<JavaModule>, systemModules: List<JavaModule.Explicit>) defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[ClassConstructorDescriptorImpl]

'classpathRootsResolver' @ [240:39] ==> private final val classpathRootsResolver: ClasspathRootsResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'javaModuleGraph' @ [240:62] ==> public final val javaModuleGraph: JavaModuleGraph defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'javaModules' @ [240:79] ==> val javaModules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'javaModuleFinder' @ [240:92] ==> val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'systemModules' @ [240:109] ==> public final val systemModules: Sequence<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'toList' @ [240:123] ==> public fun <T> Sequence<JavaModule.Explicit>.toList(): List<JavaModule.Explicit> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Explicit

'CliVirtualFileFinderFactory' @ [243:29] ==> public constructor CliVirtualFileFinderFactory(index: JvmDependenciesIndex) defined in org.jetbrains.kotlin.cli.jvm.compiler.CliVirtualFileFinderFactory[ClassConstructorDescriptorImpl]

'rootsIndex' @ [243:57] ==> private final val rootsIndex: JvmDependenciesDynamicCompoundIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'project' @ [244:9] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'registerService' @ [244:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(MetadataFinderFactory..MetadataFinderFactory?)>, @NotNull p1: MetadataFinderFactory): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MetadataFinderFactory

'java' @ [244:62] ==> public val <T> KClass<MetadataFinderFactory>.java: Class<MetadataFinderFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MetadataFinderFactory

'finderFactory' @ [244:68] ==> val finderFactory: CliVirtualFileFinderFactory defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'project' @ [245:9] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'registerService' @ [245:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(VirtualFileFinderFactory..VirtualFileFinderFactory?)>, @NotNull p1: VirtualFileFinderFactory): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VirtualFileFinderFactory

'VirtualFileFinderFactory' @ [245:33] ==> public companion object SERVICE defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinderFactory[FakeCallableDescriptorForObject]

'java' @ [245:65] ==> public val <T> KClass<VirtualFileFinderFactory>.java: Class<VirtualFileFinderFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VirtualFileFinderFactory

'finderFactory' @ [245:71] ==> val finderFactory: CliVirtualFileFinderFactory defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'project' @ [247:9] ==> val project: MockProject defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>[LocalVariableDescriptor]

'putUserData' @ [247:17] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<((List<File>) -> Unit..((List<File>) -> Unit)?)>, @Nullable p1: ((List<File>) -> Unit)?): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Function1<List<File>, Unit>

'APPEND_JAVA_SOURCE_ROOTS_HANDLER_KEY' @ [247:29] ==> public val APPEND_JAVA_SOURCE_ROOTS_HANDLER_KEY: Key<(List<File>) -> Unit> defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'updateClasspath' @ [248:13] ==> public final fun updateClasspath(contentRoots: List<ContentRoot>): List<File>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'roots' @ [248:29] ==> value-parameter roots: List<File> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<no name provided>[ValueParameterDescriptorImpl]

'map' @ [248:35] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> JavaSourceRoot): List<JavaSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> JavaSourceRoot

'JavaSourceRoot' @ [248:41] ==> public constructor JavaSourceRoot(file: File, packagePrefix: String?) defined in org.jetbrains.kotlin.cli.jvm.config.JavaSourceRoot[ClassConstructorDescriptorImpl]

'it' @ [248:56] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>.<no name provided>.<anonymous>[ValueParameterDescriptorImpl]

'JvmPackagePartProvider' @ [253:16] ==> public constructor JvmPackagePartProvider(languageVersionSettings: LanguageVersionSettings, scope: GlobalSearchScope) defined in org.jetbrains.kotlin.cli.jvm.compiler.JvmPackagePartProvider[ClassConstructorDescriptorImpl]

'configuration' @ [253:39] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'languageVersionSettings' @ [253:53] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'scope' @ [253:78] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.createPackagePartProvider[ValueParameterDescriptorImpl]

'apply' @ [253:85] ==> @InlineOnly public inline fun <T> JvmPackagePartProvider.apply(block: JvmPackagePartProvider.() -> Unit): JvmPackagePartProvider defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPackagePartProvider

'addRoots' @ [254:13] ==> public final fun addRoots(roots: List<JavaRoot>): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.JvmPackagePartProvider[SimpleFunctionDescriptorImpl]

'initialRoots' @ [254:22] ==> private final val initialRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'packagePartProviders' @ [255:13] ==> private final val packagePartProviders: MutableList<JvmPackagePartProvider> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'this' @ [255:37] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.createPackagePartProvider.<anonymous>[ReceiverParameterDescriptorImpl]

'mutableListOf' @ [260:17] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'apply' @ [260:46] ==> @InlineOnly public inline fun <T> MutableList<VirtualFile>.apply(block: MutableList<VirtualFile>.() -> Unit): MutableList<VirtualFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<VirtualFile>

'processFilesRecursively' @ [261:25] ==> public final fun processFilesRecursively(@NotNull p0: VirtualFile, @NotNull p1: ((VirtualFile..VirtualFile?)) -> Boolean): Boolean defined in com.intellij.openapi.vfs.VfsUtilCore[SamAdapterFunctionDescriptor]

'this@javaFiles' @ [261:49] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.javaFiles[ReceiverParameterDescriptorImpl]

'file' @ [262:21] ==> value-parameter file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<get-javaFiles>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [262:26] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [262:51] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'add' @ [263:21] ==> public abstract fun add(element: VirtualFile): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'file' @ [263:25] ==> value-parameter file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<get-javaFiles>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'configuration' @ [270:17] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'javaSourceRoots' @ [270:31] ==> public val CompilerConfiguration.javaSourceRoots: Set<String> defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[PropertyDescriptorImpl]

'mapNotNull' @ [271:18] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> VirtualFile?): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> VirtualFile

'this' @ [271:29] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[LazyClassReceiverParameterDescriptor]

'flatMap' @ [272:18] ==> public inline fun <T, R> Iterable<VirtualFile>.flatMap(transform: (VirtualFile) -> Iterable<VirtualFile>): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> VirtualFile

'it' @ [272:28] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<get-allJavaFiles>.<anonymous>[ValueParameterDescriptorImpl]

'javaFiles' @ [272:31] ==> private final val VirtualFile.javaFiles: List<VirtualFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'map' @ [273:18] ==> public inline fun <T, R> Iterable<VirtualFile>.map(transform: (VirtualFile) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> File

'File' @ [273:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [273:29] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<get-allJavaFiles>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [273:32] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'allJavaFiles' @ [276:37] ==> private final val allJavaFiles: List<File> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'sourceFiles' @ [277:41] ==> private final val sourceFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'JavacWrapperRegistrar' @ [280:16] ==> public object JavacWrapperRegistrar defined in org.jetbrains.kotlin.cli.jvm.javac in file JavacWrapperRegistrar.kt[FakeCallableDescriptorForObject]

'registerJavac' @ [280:38] ==> public final fun registerJavac(project: MockProject, configuration: CompilerConfiguration, javaFiles: List<File>, kotlinFiles: List<KtFile>, arguments: Array<String>?): Boolean defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar[SimpleFunctionDescriptorImpl]

'projectEnvironment' @ [280:52] ==> private final val projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'project' @ [280:71] ==> public final val JavaCoreProjectEnvironment.project: MockProject[MyPropertyDescriptor]

'configuration' @ [280:80] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'javaFiles' @ [280:95] ==> value-parameter javaFiles: List<File> = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.registerJavac[ValueParameterDescriptorImpl]

'kotlinFiles' @ [280:106] ==> value-parameter kotlinFiles: List<KtFile> = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.registerJavac[ValueParameterDescriptorImpl]

'arguments' @ [280:119] ==> value-parameter arguments: Array<String>? = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.registerJavac[ValueParameterDescriptorImpl]

'projectEnvironment' @ [284:17] ==> private final val projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'environment' @ [284:36] ==> public final val JavaCoreProjectEnvironment.environment: CoreApplicationEnvironment[MyPropertyDescriptor]

'projectEnvironment' @ [287:17] ==> private final val projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'project' @ [287:36] ==> public final val JavaCoreProjectEnvironment.project: MockProject[MyPropertyDescriptor]

'sourceFiles' @ [290:13] ==> value-parameter sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.countLinesOfCode[ValueParameterDescriptorImpl]

'sumBy' @ [290:25] ==> public inline fun <T> Iterable<KtFile>.sumBy(selector: (KtFile) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'sourceFile' @ [291:28] ==> value-parameter sourceFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.countLinesOfCode.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [291:39] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'+' @ [292:17] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getLineBreakCount' @ [292:28] ==> @Contract public open fun getLineBreakCount(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [292:46] ==> val text: (String..String?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.countLinesOfCode.<anonymous>[LocalVariableDescriptor]

'if (StringUtil.endsWithLineBreak(text)) 0 else 1' @ [292:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'endsWithLineBreak' @ [292:70] ==> @Contract public open fun endsWithLineBreak(@NotNull p0: CharSequence): Boolean defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [292:88] ==> val text: (String..String?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.countLinesOfCode.<anonymous>[LocalVariableDescriptor]

'index' @ [296:9] ==> value-parameter index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspathFromRootsIndex[ValueParameterDescriptorImpl]

'indexedRoots' @ [296:15] ==> public abstract val indexedRoots: Sequence<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[PropertyDescriptorImpl]

'forEach' @ [296:28] ==> public inline fun <T> Sequence<JavaRoot>.forEach(action: (JavaRoot) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot

'projectEnvironment' @ [297:13] ==> private final val projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'addSourcesToClasspath' @ [297:32] ==> public open fun addSourcesToClasspath(@NotNull p0: VirtualFile): Unit defined in com.intellij.core.JavaCoreProjectEnvironment[JavaMethodDescriptor]

'it' @ [297:54] ==> value-parameter it: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspathFromRootsIndex.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [297:57] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[PropertyDescriptorImpl]

'classpathRootsResolver' @ [303:24] ==> private final val classpathRootsResolver: ClasspathRootsResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'convertClasspathRoots' @ [303:47] ==> public final fun convertClasspathRoots(contentRoots: List<ContentRoot>): ClasspathRootsResolver.RootsAndModules defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'contentRoots' @ [303:69] ==> value-parameter contentRoots: List<ContentRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath[ValueParameterDescriptorImpl]

'roots' @ [303:83] ==> public final val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.RootsAndModules[PropertyDescriptorImpl]

'packagePartProviders' @ [305:37] ==> private final val packagePartProviders: MutableList<JvmPackagePartProvider> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'packagePartProvider' @ [306:13] ==> val packagePartProvider: JvmPackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath[LocalVariableDescriptor]

'addRoots' @ [306:33] ==> public final fun addRoots(roots: List<JavaRoot>): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.JvmPackagePartProvider[SimpleFunctionDescriptorImpl]

'newRoots' @ [306:42] ==> val newRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath[LocalVariableDescriptor]

'rootsIndex' @ [309:16] ==> private final val rootsIndex: JvmDependenciesDynamicCompoundIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'addNewIndexForRoots' @ [309:27] ==> public final fun addNewIndexForRoots(roots: Iterable<JavaRoot>): JvmDependenciesIndex? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[SimpleFunctionDescriptorImpl]

'newRoots' @ [309:47] ==> val newRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath[LocalVariableDescriptor]

'let' @ [309:58] ==> @InlineOnly public inline fun <T, R> JvmDependenciesIndex.let(block: (JvmDependenciesIndex) -> List<File>): List<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndex
    <R> -> List<File>

'updateClasspathFromRootsIndex' @ [310:13] ==> private final fun updateClasspathFromRootsIndex(index: JvmDependenciesIndex): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'newIndex' @ [310:43] ==> value-parameter newIndex: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath.<anonymous>[ValueParameterDescriptorImpl]

'newIndex' @ [311:13] ==> value-parameter newIndex: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath.<anonymous>[ValueParameterDescriptorImpl]

'indexedRoots' @ [311:22] ==> public abstract val indexedRoots: Sequence<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[PropertyDescriptorImpl]

'mapNotNull' @ [311:35] ==> public fun <T, R : Any> Sequence<JavaRoot>.mapNotNull(transform: (JavaRoot) -> File?): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot
    <R : Any> -> File

'component1' @ [311:49] ==> public final operator fun component1(): VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[SimpleFunctionDescriptorImpl]

'virtualToIoFile' @ [312:29] ==> @NotNull public open fun virtualToIoFile(@NotNull p0: VirtualFile): File defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'?:' @ [312:45] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VirtualFile?, right: VirtualFile): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VirtualFile

'getVirtualFileForJar' @ [312:57] ==> @Nullable public open fun getVirtualFileForJar(@Nullable p0: VirtualFile?): VirtualFile? defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'file' @ [312:78] ==> val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath.<anonymous>.<anonymous>[LocalVariableDescriptor]

'file' @ [312:87] ==> val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.updateClasspath.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toList' @ [313:15] ==> public fun <T> Sequence<File>.toList(): List<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'orEmpty' @ [314:11] ==> @InlineOnly public inline fun <T> List<File>?.orEmpty(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'when (root) {
            is JvmClasspathRoot -> if (root.file.isFile) findJarRoot(root.file) else findLocalFile(root)
            is JvmModulePathRoot -> if (root.file.isFile) findJarRoot(root.file) else findLocalFile(root)
            is JavaSourceRoot -> findLocalFile(root)
            else -> throw IllegalStateException("Unexpected root: $root")
        }' @ [318:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VirtualFile?, entry1: VirtualFile?, entry2: VirtualFile?, entry3: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VirtualFile?

'root' @ [318:22] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'if (root.file.isFile) findJarRoot(root.file) else findLocalFile(root)' @ [319:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VirtualFile?, elseBranch: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VirtualFile?

'root' @ [319:40] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'file' @ [319:45] ==> public abstract val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmContentRoot[PropertyDescriptorImpl]

'isFile' @ [319:50] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'findJarRoot' @ [319:58] ==> private final fun findJarRoot(file: File): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'root' @ [319:70] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'file' @ [319:75] ==> public abstract val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmContentRoot[PropertyDescriptorImpl]

'findLocalFile' @ [319:86] ==> private final fun findLocalFile(root: JvmContentRoot): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'root' @ [319:100] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'if (root.file.isFile) findJarRoot(root.file) else findLocalFile(root)' @ [320:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VirtualFile?, elseBranch: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VirtualFile?

'root' @ [320:41] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'file' @ [320:46] ==> public abstract val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmContentRoot[PropertyDescriptorImpl]

'isFile' @ [320:51] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'findJarRoot' @ [320:59] ==> private final fun findJarRoot(file: File): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'root' @ [320:71] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'file' @ [320:76] ==> public abstract val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmContentRoot[PropertyDescriptorImpl]

'findLocalFile' @ [320:87] ==> private final fun findLocalFile(root: JvmContentRoot): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'root' @ [320:101] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'findLocalFile' @ [321:34] ==> private final fun findLocalFile(root: JvmContentRoot): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'root' @ [321:48] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'IllegalStateException' @ [322:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'root' @ [322:68] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile[ValueParameterDescriptorImpl]

'applicationEnvironment' @ [326:48] ==> private final val applicationEnvironment: CoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'localFileSystem' @ [326:71] ==> public final val CoreApplicationEnvironment.localFileSystem: CoreLocalFileSystem[MyPropertyDescriptor]

'findFileByPath' @ [326:87] ==> public open fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.local.CoreLocalFileSystem[JavaMethodDescriptor]

'path' @ [326:102] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.findLocalFile[ValueParameterDescriptorImpl]

'findLocalFile' @ [329:16] ==> internal final fun findLocalFile(path: String): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'root' @ [329:30] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.findLocalFile[ValueParameterDescriptorImpl]

'file' @ [329:35] ==> public abstract val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmContentRoot[PropertyDescriptorImpl]

'absolutePath' @ [329:40] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'also' @ [329:54] ==> @InlineOnly @SinceKotlin public inline fun <T> VirtualFile?.also(block: (VirtualFile?) -> Unit): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile?

'it' @ [330:17] ==> value-parameter it: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.findLocalFile.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [331:17] ==> private final fun report(severity: CompilerMessageSeverity, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'STRONG_WARNING' @ [331:24] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'root' @ [331:94] ==> value-parameter root: JvmContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.findLocalFile[ValueParameterDescriptorImpl]

'file' @ [331:99] ==> public abstract val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmContentRoot[PropertyDescriptorImpl]

'applicationEnvironment' @ [337:13] ==> private final val applicationEnvironment: CoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'jarFileSystem' @ [337:36] ==> public final val CoreApplicationEnvironment.jarFileSystem: VirtualFileSystem[MyPropertyDescriptor]

'findFileByPath' @ [337:50] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'file' @ [337:67] ==> value-parameter file: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.findJarRoot[ValueParameterDescriptorImpl]

'JAR_SEPARATOR' @ [337:81] ==> public const final val JAR_SEPARATOR: String defined in com.intellij.util.io.URLUtil[JavaPropertyDescriptor]

'linkedSetOf' @ [340:33] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [342:9] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'kotlinSourceRoots' @ [342:23] ==> public val CompilerConfiguration.kotlinSourceRoots: List<String> defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'forEach' @ [342:41] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!' @ [343:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'uniqueSourceRoots' @ [343:18] ==> val uniqueSourceRoots: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.getSourceRootsCheckingForDuplicates[LocalVariableDescriptor]

'add' @ [343:36] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'path' @ [343:40] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.getSourceRootsCheckingForDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [344:17] ==> private final fun report(severity: CompilerMessageSeverity, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'STRONG_WARNING' @ [344:24] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'path' @ [344:65] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.getSourceRootsCheckingForDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'uniqueSourceRoots' @ [348:16] ==> val uniqueSourceRoots: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.getSourceRootsCheckingForDuplicates[LocalVariableDescriptor]

'sourceFiles' @ [351:42] ==> private final val sourceFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'configuration' @ [354:9] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getNotNull' @ [354:23] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [354:55] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'report' @ [354:78] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'severity' @ [354:85] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.report[ValueParameterDescriptorImpl]

'message' @ [354:95] ==> value-parameter message: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.report[ValueParameterDescriptorImpl]

'setCompatibleBuild' @ [361:13] ==> @JvmStatic private final fun setCompatibleBuild(): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'Object' @ [364:40] ==> public constructor Object() defined in java.lang.Object[JavaClassConstructorDescriptor]

'JvmStatic' @ [368:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'setCompatibleBuild' @ [371:13] ==> @JvmStatic private final fun setCompatibleBuild(): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'getOrCreateApplicationEnvironmentForProduction' @ [372:26] ==> private final fun getOrCreateApplicationEnvironmentForProduction(configuration: CompilerConfiguration, configFilePaths: List<String>): JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [372:73] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[ValueParameterDescriptorImpl]

'configFiles' @ [372:88] ==> value-parameter configFiles: EnvironmentConfigFiles defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[ValueParameterDescriptorImpl]

'files' @ [372:100] ==> public final val EnvironmentConfigFiles.files: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'!' @ [375:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'?:' @ [375:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'getProperty' @ [375:26] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_COMPILER_ENVIRONMENT_KEEPALIVE_PROPERTY' @ [375:38] ==> public val KOTLIN_COMPILER_ENVIRONMENT_KEEPALIVE_PROPERTY: String defined in org.jetbrains.kotlin.cli.common[DeserializedPropertyDescriptor]

'toBooleanLenient' @ [375:86] ==> public fun String?.toBooleanLenient(): Boolean? defined in org.jetbrains.kotlin.cli.common[DeserializedSimpleFunctionDescriptor]

'register' @ [378:26] ==> public open fun register(@NotNull p0: Disposable, @NotNull p1: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'parentDisposable' @ [378:35] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[ValueParameterDescriptorImpl]

'Disposable' @ [378:53] ==> public fun Disposable(function: () -> Unit): Disposable defined in com.intellij.openapi[SimpleFunctionDescriptorImpl]

'synchronized' @ [379:21] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'APPLICATION_LOCK' @ [379:35] ==> private final val APPLICATION_LOCK: Object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'--' @ [380:29] ==> public final operator fun dec(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ourProjectCount' @ [380:31] ==> private final var ourProjectCount: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'disposeApplicationEnvironment' @ [381:29] ==> private final fun disposeApplicationEnvironment(): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'KotlinCoreEnvironment' @ [386:31] ==> private constructor KotlinCoreEnvironment(parentDisposable: Disposable, applicationEnvironment: JavaCoreApplicationEnvironment, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[ClassConstructorDescriptorImpl]

'parentDisposable' @ [386:53] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[ValueParameterDescriptorImpl]

'appEnv' @ [386:71] ==> val appEnv: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[LocalVariableDescriptor]

'configuration' @ [386:79] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[ValueParameterDescriptorImpl]

'configFiles' @ [386:94] ==> value-parameter configFiles: EnvironmentConfigFiles defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[ValueParameterDescriptorImpl]

'synchronized' @ [388:13] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'APPLICATION_LOCK' @ [388:27] ==> private final val APPLICATION_LOCK: Object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'ourProjectCount' @ [389:17] ==> private final var ourProjectCount: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'environment' @ [391:20] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForProduction[LocalVariableDescriptor]

'JvmStatic' @ [394:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'BUILD_NUMBER' @ [396:31] ==> public final var BUILD_NUMBER: (String..String?) defined in com.intellij.ide.plugins.PluginManagerCore[JavaPropertyDescriptor]

'ideaCompatibleBuildNumber' @ [396:46] ==> private final val ideaCompatibleBuildNumber: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'getProperties' @ [397:20] ==> public open fun getProperties(): (Properties..Properties?) defined in java.lang.System[JavaMethodDescriptor]

'setProperty' @ [397:36] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Any..Any?) defined in java.util.Properties[JavaMethodDescriptor]

'ideaCompatibleBuildNumber' @ [397:81] ==> private final val ideaCompatibleBuildNumber: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'TestOnly' @ [400:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'JvmStatic' @ [401:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'KotlinCoreEnvironment' @ [405:20] ==> private constructor KotlinCoreEnvironment(parentDisposable: Disposable, applicationEnvironment: JavaCoreApplicationEnvironment, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[ClassConstructorDescriptorImpl]

'parentDisposable' @ [405:42] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForTests[ValueParameterDescriptorImpl]

'createApplicationEnvironment' @ [406:42] ==> private final fun createApplicationEnvironment(parentDisposable: Disposable, configuration: CompilerConfiguration, configFilePaths: List<String>): JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'parentDisposable' @ [406:71] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForTests[ValueParameterDescriptorImpl]

'configuration' @ [406:89] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForTests[ValueParameterDescriptorImpl]

'extensionConfigs' @ [406:104] ==> value-parameter extensionConfigs: EnvironmentConfigFiles defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForTests[ValueParameterDescriptorImpl]

'files' @ [406:121] ==> public final val EnvironmentConfigFiles.files: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'configuration' @ [407:42] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForTests[ValueParameterDescriptorImpl]

'extensionConfigs' @ [408:42] ==> value-parameter extensionConfigs: EnvironmentConfigFiles defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createForTests[ValueParameterDescriptorImpl]

'ourApplicationEnvironment' @ [412:77] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'synchronized' @ [417:13] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Nothing

'APPLICATION_LOCK' @ [417:27] ==> private final val APPLICATION_LOCK: Object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'ourApplicationEnvironment' @ [418:21] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'ourApplicationEnvironment' @ [419:28] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'newDisposable' @ [421:49] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'ourApplicationEnvironment' @ [422:17] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'createApplicationEnvironment' @ [422:45] ==> private final fun createApplicationEnvironment(parentDisposable: Disposable, configuration: CompilerConfiguration, configFilePaths: List<String>): JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'parentDisposable' @ [422:74] ==> val parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.getOrCreateApplicationEnvironmentForProduction.<anonymous>[LocalVariableDescriptor]

'configuration' @ [422:92] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.getOrCreateApplicationEnvironmentForProduction[ValueParameterDescriptorImpl]

'configFilePaths' @ [422:107] ==> value-parameter configFilePaths: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.getOrCreateApplicationEnvironmentForProduction[ValueParameterDescriptorImpl]

'ourProjectCount' @ [423:17] ==> private final var ourProjectCount: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'register' @ [424:26] ==> public open fun register(@NotNull p0: Disposable, @NotNull p1: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'parentDisposable' @ [424:35] ==> val parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.getOrCreateApplicationEnvironmentForProduction.<anonymous>[LocalVariableDescriptor]

'Disposable' @ [424:53] ==> public fun Disposable(function: () -> Unit): Disposable defined in com.intellij.openapi[SimpleFunctionDescriptorImpl]

'synchronized' @ [425:21] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'APPLICATION_LOCK' @ [425:35] ==> private final val APPLICATION_LOCK: Object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'ourApplicationEnvironment' @ [426:25] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'ourApplicationEnvironment' @ [429:24] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'synchronized' @ [434:13] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'APPLICATION_LOCK' @ [434:27] ==> private final val APPLICATION_LOCK: Object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'ourApplicationEnvironment' @ [435:35] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'ourApplicationEnvironment' @ [436:17] ==> private final var ourApplicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[PropertyDescriptorImpl]

'dispose' @ [437:26] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'environment' @ [437:34] ==> val environment: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.disposeApplicationEnvironment.<anonymous>[LocalVariableDescriptor]

'parentDisposable' @ [437:46] ==> public final val JavaCoreApplicationEnvironment.parentDisposable: Disposable[MyPropertyDescriptor]

'clearFileAccessorCache' @ [438:28] ==> public open fun clearFileAccessorCache(): Unit defined in com.intellij.openapi.vfs.impl.ZipHandler[JavaMethodDescriptor]

'cleanRootArea' @ [445:24] ==> public open fun cleanRootArea(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'parentDisposable' @ [445:38] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[ValueParameterDescriptorImpl]

'registerAppExtensionPoints' @ [446:13] ==> private final fun registerAppExtensionPoints(): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'JavaCoreApplicationEnvironment' @ [447:51] ==> public constructor JavaCoreApplicationEnvironment(@NotNull p0: Disposable) defined in com.intellij.core.JavaCoreApplicationEnvironment[JavaClassConstructorDescriptor]

'parentDisposable' @ [447:82] ==> value-parameter parentDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[ValueParameterDescriptorImpl]

'CoreJrtFileSystem' @ [448:74] ==> public constructor CoreJrtFileSystem() defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem[ClassConstructorDescriptorImpl]

'configFilePaths' @ [451:32] ==> value-parameter configFilePaths: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[ValueParameterDescriptorImpl]

'registerApplicationExtensionPointsAndExtensionsFrom' @ [452:17] ==> private final fun registerApplicationExtensionPointsAndExtensionsFrom(configuration: CompilerConfiguration, configFilePath: String): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [452:69] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[ValueParameterDescriptorImpl]

'configPath' @ [452:84] ==> val configPath: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[LocalVariableDescriptor]

'registerApplicationServicesForCLI' @ [455:13] ==> private final fun registerApplicationServicesForCLI(applicationEnvironment: JavaCoreApplicationEnvironment): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'applicationEnvironment' @ [455:47] ==> val applicationEnvironment: <no name provided> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[LocalVariableDescriptor]

'registerApplicationServices' @ [456:13] ==> @Suppress @JvmStatic public final fun registerApplicationServices(applicationEnvironment: JavaCoreApplicationEnvironment): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'applicationEnvironment' @ [456:41] ==> val applicationEnvironment: <no name provided> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[LocalVariableDescriptor]

'applicationEnvironment' @ [458:20] ==> val applicationEnvironment: <no name provided> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.createApplicationEnvironment[LocalVariableDescriptor]

'registerExtensionPoint' @ [462:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: String, @NotNull p2: Class<out (FileTypeExtensionPoint<*>..FileTypeExtensionPoint<*>?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileTypeExtensionPoint<*>

'getRootArea' @ [462:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [462:112] ==> public const final val EP_NAME: String defined in com.intellij.psi.stubs.BinaryFileStubBuilders[JavaPropertyDescriptor]

'FileTypeExtensionPoint' @ [462:121] ==> public constructor FileTypeExtensionPoint<T : (Any..Any?)>() defined in com.intellij.openapi.fileTypes.FileTypeExtensionPoint[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'java' @ [462:151] ==> public val <T> KClass<FileTypeExtensionPoint<*>>.java: Class<FileTypeExtensionPoint<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileTypeExtensionPoint<*>

'registerExtensionPoint' @ [463:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(FileContextProvider..FileContextProvider?)>, @NotNull p2: Class<out (FileContextProvider..FileContextProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileContextProvider

'getRootArea' @ [463:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [463:109] ==> public final val EP_NAME: (ExtensionPointName<(FileContextProvider..FileContextProvider?)>..ExtensionPointName<(FileContextProvider..FileContextProvider?)>?) defined in com.intellij.psi.FileContextProvider[JavaPropertyDescriptor]

'FileContextProvider' @ [463:118] ==> public constructor FileContextProvider() defined in com.intellij.psi.FileContextProvider[JavaClassConstructorDescriptor]

'java' @ [463:145] ==> public val <T> KClass<FileContextProvider>.java: Class<FileContextProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileContextProvider

'registerExtensionPoint' @ [465:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(MetaDataContributor..MetaDataContributor?)>, @NotNull p2: Class<out (MetaDataContributor..MetaDataContributor?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MetaDataContributor

'getRootArea' @ [465:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [465:109] ==> public final val EP_NAME: (ExtensionPointName<(MetaDataContributor..MetaDataContributor?)>..ExtensionPointName<(MetaDataContributor..MetaDataContributor?)>?) defined in com.intellij.psi.meta.MetaDataContributor[JavaPropertyDescriptor]

'MetaDataContributor' @ [465:118] ==> public fun MetaDataContributor(function: ((MetaDataRegistrar..MetaDataRegistrar?)) -> Unit): MetaDataContributor defined in com.intellij.psi.meta[SimpleFunctionDescriptorImpl]

'java' @ [465:145] ==> public val <T> KClass<MetaDataContributor>.java: Class<MetaDataContributor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MetaDataContributor

'registerExtensionPoint' @ [466:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(PsiAugmentProvider..PsiAugmentProvider?)>, @NotNull p2: Class<out (PsiAugmentProvider..PsiAugmentProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiAugmentProvider

'getRootArea' @ [466:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [466:108] ==> public final val EP_NAME: (ExtensionPointName<(PsiAugmentProvider..PsiAugmentProvider?)>..ExtensionPointName<(PsiAugmentProvider..PsiAugmentProvider?)>?) defined in com.intellij.psi.augment.PsiAugmentProvider[JavaPropertyDescriptor]

'PsiAugmentProvider' @ [466:117] ==> public constructor PsiAugmentProvider() defined in com.intellij.psi.augment.PsiAugmentProvider[JavaClassConstructorDescriptor]

'java' @ [466:143] ==> public val <T> KClass<PsiAugmentProvider>.java: Class<PsiAugmentProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiAugmentProvider

'registerExtensionPoint' @ [467:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(JavaMainMethodProvider..JavaMainMethodProvider?)>, @NotNull p2: Class<out (JavaMainMethodProvider..JavaMainMethodProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaMainMethodProvider

'getRootArea' @ [467:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [467:112] ==> public final val EP_NAME: (ExtensionPointName<(JavaMainMethodProvider..JavaMainMethodProvider?)>..ExtensionPointName<(JavaMainMethodProvider..JavaMainMethodProvider?)>?) defined in com.intellij.codeInsight.runner.JavaMainMethodProvider[JavaPropertyDescriptor]

'java' @ [467:151] ==> public val <T> KClass<JavaMainMethodProvider>.java: Class<JavaMainMethodProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaMainMethodProvider

'registerExtensionPoint' @ [469:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(ContainerProvider..ContainerProvider?)>, @NotNull p2: Class<out (ContainerProvider..ContainerProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContainerProvider

'getRootArea' @ [469:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [469:107] ==> public final val EP_NAME: (ExtensionPointName<(ContainerProvider..ContainerProvider?)>..ExtensionPointName<(ContainerProvider..ContainerProvider?)>?) defined in com.intellij.codeInsight.ContainerProvider[JavaPropertyDescriptor]

'ContainerProvider' @ [469:116] ==> public fun ContainerProvider(function: (PsiElement) -> PsiElement?): ContainerProvider defined in com.intellij.codeInsight[SimpleFunctionDescriptorImpl]

'java' @ [469:141] ==> public val <T> KClass<ContainerProvider>.java: Class<ContainerProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ContainerProvider

'registerExtensionPoint' @ [470:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>, @NotNull p2: Class<out (ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClsCustomNavigationPolicy

'getRootArea' @ [470:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [470:115] ==> public final val EP_NAME: (ExtensionPointName<(ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>..ExtensionPointName<(ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>?) defined in com.intellij.psi.impl.compiled.ClsCustomNavigationPolicy[JavaPropertyDescriptor]

'java' @ [470:157] ==> public val <T> KClass<ClsCustomNavigationPolicy>.java: Class<ClsCustomNavigationPolicy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClsCustomNavigationPolicy

'registerExtensionPoint' @ [471:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>, @NotNull p2: Class<out (ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Decompiler

'getRootArea' @ [471:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [471:110] ==> public final val EP_NAME: (ExtensionPointName<(ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>..ExtensionPointName<(ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>?) defined in com.intellij.psi.compiled.ClassFileDecompilers[JavaPropertyDescriptor]

'Decompiler' @ [471:140] ==> public final fun Decompiler(function: (VirtualFile) -> Boolean): ClassFileDecompilers.Decompiler defined in com.intellij.psi.compiled.ClassFileDecompilers[SimpleFunctionDescriptorImpl]

'java' @ [471:158] ==> public val <T> KClass<ClassFileDecompilers.Decompiler>.java: Class<ClassFileDecompilers.Decompiler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Decompiler

'registerExtensionPoint' @ [473:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(TypeAnnotationModifier..TypeAnnotationModifier?)>, @NotNull p2: Class<out (TypeAnnotationModifier..TypeAnnotationModifier?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeAnnotationModifier

'getRootArea' @ [473:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [473:112] ==> public final val EP_NAME: (ExtensionPointName<(TypeAnnotationModifier..TypeAnnotationModifier?)>..ExtensionPointName<(TypeAnnotationModifier..TypeAnnotationModifier?)>?) defined in com.intellij.psi.augment.TypeAnnotationModifier[JavaPropertyDescriptor]

'TypeAnnotationModifier' @ [473:121] ==> public constructor TypeAnnotationModifier() defined in com.intellij.psi.augment.TypeAnnotationModifier[JavaClassConstructorDescriptor]

'java' @ [473:151] ==> public val <T> KClass<TypeAnnotationModifier>.java: Class<TypeAnnotationModifier> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TypeAnnotationModifier

'registerExtensionPoint' @ [474:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(MetaLanguage..MetaLanguage?)>, @NotNull p2: Class<out (MetaLanguage..MetaLanguage?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MetaLanguage

'getRootArea' @ [474:74] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'EP_NAME' @ [474:102] ==> public final val EP_NAME: (ExtensionPointName<(MetaLanguage..MetaLanguage?)>..ExtensionPointName<(MetaLanguage..MetaLanguage?)>?) defined in com.intellij.lang.MetaLanguage[JavaPropertyDescriptor]

'MetaLanguage' @ [474:111] ==> protected/*protected and package*/ constructor MetaLanguage(@NotNull p0: String) defined in com.intellij.lang.MetaLanguage[JavaClassConstructorDescriptor]

'java' @ [474:131] ==> public val <T> KClass<MetaLanguage>.java: Class<MetaLanguage> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MetaLanguage

'configuration' @ [479:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[ValueParameterDescriptorImpl]

'get' @ [479:35] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'INTELLIJ_PLUGIN_ROOT' @ [479:60] ==> public final val INTELLIJ_PLUGIN_ROOT: (CompilerConfigurationKey<(String..String?)>..CompilerConfigurationKey<(String..String?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'let' @ [479:83] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'configuration' @ [480:24] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[ValueParameterDescriptorImpl]

'get' @ [480:38] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(CompilerJarLocator..CompilerJarLocator?)>): CompilerJarLocator? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompilerJarLocator

'COMPILER_JAR_LOCATOR' @ [480:63] ==> @SuppressWarnings public final val COMPILER_JAR_LOCATOR: (CompilerConfigurationKey<(CompilerJarLocator..CompilerJarLocator?)>..CompilerConfigurationKey<(CompilerJarLocator..CompilerJarLocator?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'compilerJar' @ [480:86] ==> public final val CompilerJarLocator.compilerJar: File[MyPropertyDescriptor]

'PathUtil' @ [481:24] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'pathUtilJar' @ [481:33] ==> public final val pathUtilJar: File defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'getApplication' @ [483:42] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'pluginRoot' @ [484:30] ==> var pluginRoot: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'parentFile' @ [484:41] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'pluginRoot' @ [486:17] ==> var pluginRoot: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'isDirectory' @ [486:28] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'app' @ [486:43] ==> val app: (Application..Application?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'app' @ [486:58] ==> val app: (Application..Application?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'isUnitTestMode' @ [486:62] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'toCanonicalPath' @ [487:29] ==> @Contract public open fun toCanonicalPath(@Nullable p0: String?): (String..String?) defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'parentFile' @ [487:45] ==> val parentFile: (File..File?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'path' @ [487:56] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [487:62] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parentFile' @ [489:30] ==> val parentFile: (File..File?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'parentFile' @ [489:41] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'parentFile' @ [489:52] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'pluginRoot' @ [490:17] ==> var pluginRoot: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'File' @ [490:30] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'srcDir' @ [490:35] ==> val srcDir: (File..File?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'registerExtensionPointAndExtensions' @ [493:40] ==> public open fun registerExtensionPointAndExtensions(@NotNull p0: File, @NotNull p1: String, @NotNull p2: ExtensionsArea): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]

'pluginRoot' @ [493:76] ==> var pluginRoot: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[LocalVariableDescriptor]

'configFilePath' @ [493:88] ==> value-parameter configFilePath: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationExtensionPointsAndExtensionsFrom[ValueParameterDescriptorImpl]

'getRootArea' @ [493:115] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'applicationEnvironment' @ [498:13] ==> value-parameter applicationEnvironment: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationServicesForCLI[ValueParameterDescriptorImpl]

'registerFileType' @ [498:36] ==> public open fun registerFileType(@NotNull p0: FileType, @NotNull p1: String): Unit defined in com.intellij.core.JavaCoreApplicationEnvironment[JavaMethodDescriptor]

'INSTANCE' @ [498:71] ==> public final val INSTANCE: (PlainTextFileType..PlainTextFileType?) defined in com.intellij.openapi.fileTypes.PlainTextFileType[JavaPropertyDescriptor]

'applicationEnvironment' @ [499:13] ==> value-parameter applicationEnvironment: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationServicesForCLI[ValueParameterDescriptorImpl]

'registerParserDefinition' @ [499:36] ==> public open fun registerParserDefinition(@NotNull p0: ParserDefinition): Unit defined in com.intellij.core.JavaCoreApplicationEnvironment[JavaMethodDescriptor]

'JavaParserDefinition' @ [499:61] ==> public constructor JavaParserDefinition() defined in com.intellij.lang.java.JavaParserDefinition[JavaClassConstructorDescriptor]

'Suppress' @ [503:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [504:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'with' @ [506:13] ==> @InlineOnly public inline fun <T, R> with(receiver: JavaCoreApplicationEnvironment, block: JavaCoreApplicationEnvironment.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaCoreApplicationEnvironment
    <R> -> Unit

'applicationEnvironment' @ [506:18] ==> value-parameter applicationEnvironment: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerApplicationServices[ValueParameterDescriptorImpl]

'registerFileType' @ [507:17] ==> public open fun registerFileType(@NotNull p0: FileType, @NotNull p1: String): Unit defined in com.intellij.core.JavaCoreApplicationEnvironment[JavaMethodDescriptor]

'INSTANCE' @ [507:49] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'registerFileType' @ [508:17] ==> public open fun registerFileType(@NotNull p0: FileType, @NotNull p1: String): Unit defined in com.intellij.core.JavaCoreApplicationEnvironment[JavaMethodDescriptor]

'INSTANCE' @ [508:49] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'KotlinParserDefinition' @ [508:59] ==> public companion object defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition[FakeCallableDescriptorForObject]

'STD_SCRIPT_SUFFIX' @ [508:82] ==> @field:JvmField public final val STD_SCRIPT_SUFFIX: String defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.Companion[DeserializedPropertyDescriptor]

'registerParserDefinition' @ [509:17] ==> public open fun registerParserDefinition(@NotNull p0: ParserDefinition): Unit defined in com.intellij.core.JavaCoreApplicationEnvironment[JavaMethodDescriptor]

'KotlinParserDefinition' @ [509:42] ==> public constructor KotlinParserDefinition() defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition[DeserializedClassConstructorDescriptor]

'application' @ [510:17] ==> public final val JavaCoreApplicationEnvironment.application: MockApplication[MyPropertyDescriptor]

'registerService' @ [510:29] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(KotlinBinaryClassCache..KotlinBinaryClassCache?)>, @NotNull p1: KotlinBinaryClassCache): Unit defined in com.intellij.mock.MockApplication[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinBinaryClassCache

'KotlinBinaryClassCache' @ [510:45] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.KotlinBinaryClassCache[FakeCallableDescriptorForObject]

'java' @ [510:75] ==> public val <T> KClass<KotlinBinaryClassCache>.java: Class<KotlinBinaryClassCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinBinaryClassCache

'KotlinBinaryClassCache' @ [510:81] ==> public constructor KotlinBinaryClassCache() defined in org.jetbrains.kotlin.load.kotlin.KotlinBinaryClassCache[DeserializedClassConstructorDescriptor]

'application' @ [511:17] ==> public final val JavaCoreApplicationEnvironment.application: MockApplication[MyPropertyDescriptor]

'registerService' @ [511:29] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(JavaClassSupers..JavaClassSupers?)>, @NotNull p1: Class<out (JavaClassSupers..JavaClassSupers?)>): Unit defined in com.intellij.mock.MockApplication[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaClassSupers

'JavaClassSupers' @ [511:45] ==> public constructor JavaClassSupers() defined in com.intellij.psi.util.JavaClassSupers[JavaClassConstructorDescriptor]

'java' @ [511:68] ==> public val <T> KClass<JavaClassSupers>.java: Class<JavaClassSupers> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaClassSupers

'JavaClassSupersImpl' @ [511:74] ==> public constructor JavaClassSupersImpl() defined in com.intellij.psi.impl.JavaClassSupersImpl[JavaClassConstructorDescriptor]

'java' @ [511:101] ==> public val <T> KClass<JavaClassSupersImpl>.java: Class<JavaClassSupersImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaClassSupersImpl

'application' @ [512:17] ==> public final val JavaCoreApplicationEnvironment.application: MockApplication[MyPropertyDescriptor]

'registerService' @ [512:29] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(TransactionGuard..TransactionGuard?)>, @NotNull p1: Class<out (TransactionGuard..TransactionGuard?)>): Unit defined in com.intellij.mock.MockApplication[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TransactionGuard

'TransactionGuard' @ [512:45] ==> public constructor TransactionGuard() defined in com.intellij.openapi.application.TransactionGuard[JavaClassConstructorDescriptor]

'java' @ [512:69] ==> public val <T> KClass<TransactionGuard>.java: Class<TransactionGuard> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TransactionGuard

'TransactionGuardImpl' @ [512:75] ==> public constructor TransactionGuardImpl() defined in com.intellij.openapi.application.TransactionGuardImpl[JavaClassConstructorDescriptor]

'java' @ [512:103] ==> public val <T> KClass<TransactionGuardImpl>.java: Class<TransactionGuardImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TransactionGuardImpl

'registerExtensionPoint' @ [517:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>, @NotNull p2: Class<out (PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiTreeChangePreprocessor

'area' @ [517:63] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [517:95] ==> public final val EP_NAME: (ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>..ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>?) defined in com.intellij.psi.impl.PsiTreeChangePreprocessor[JavaPropertyDescriptor]

'PsiTreeChangePreprocessor' @ [517:104] ==> public fun PsiTreeChangePreprocessor(function: (PsiTreeChangeEventImpl) -> Unit): PsiTreeChangePreprocessor defined in com.intellij.psi.impl[SimpleFunctionDescriptorImpl]

'java' @ [517:137] ==> public val <T> KClass<PsiTreeChangePreprocessor>.java: Class<PsiTreeChangePreprocessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiTreeChangePreprocessor

'registerExtensionPoint' @ [518:40] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>, @NotNull p2: Class<out (PsiElementFinder..PsiElementFinder?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElementFinder

'area' @ [518:63] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [518:86] ==> public final val EP_NAME: (ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>..ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>?) defined in com.intellij.psi.PsiElementFinder[JavaPropertyDescriptor]

'PsiElementFinder' @ [518:95] ==> public constructor PsiElementFinder() defined in com.intellij.psi.PsiElementFinder[JavaClassConstructorDescriptor]

'java' @ [518:119] ==> public val <T> KClass<PsiElementFinder>.java: Class<PsiElementFinder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiElementFinder

'JvmStatic' @ [522:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'with' @ [524:13] ==> @InlineOnly public inline fun <T, R> with(receiver: MockProject, block: (MockProject).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockProject
    <R> -> Unit

'projectEnvironment' @ [524:19] ==> value-parameter projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices[ValueParameterDescriptorImpl]

'project' @ [524:38] ==> public final val JavaCoreProjectEnvironment.project: MockProject[MyPropertyDescriptor]

'KotlinScriptDefinitionProvider' @ [525:54] ==> public constructor KotlinScriptDefinitionProvider() defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedClassConstructorDescriptor]

'registerService' @ [526:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(KotlinScriptDefinitionProvider..KotlinScriptDefinitionProvider?)>, @NotNull p1: KotlinScriptDefinitionProvider): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinScriptDefinitionProvider

'KotlinScriptDefinitionProvider' @ [526:33] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[FakeCallableDescriptorForObject]

'java' @ [526:71] ==> public val <T> KClass<KotlinScriptDefinitionProvider>.java: Class<KotlinScriptDefinitionProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinitionProvider

'kotlinScriptDefinitionProvider' @ [526:77] ==> val kotlinScriptDefinitionProvider: KotlinScriptDefinitionProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices.<anonymous>[LocalVariableDescriptor]

'registerService' @ [527:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(ScriptDependenciesProvider..ScriptDependenciesProvider?)>, @NotNull p1: ScriptDependenciesProvider): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptDependenciesProvider

'ScriptDependenciesProvider' @ [527:33] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[FakeCallableDescriptorForObject]

'java' @ [527:67] ==> public val <T> KClass<ScriptDependenciesProvider>.java: Class<ScriptDependenciesProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptDependenciesProvider

'CliScriptDependenciesProvider' @ [527:73] ==> public constructor CliScriptDependenciesProvider(project: Project, scriptDefinitionProvider: KotlinScriptDefinitionProvider) defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[ClassConstructorDescriptorImpl]

'projectEnvironment' @ [527:103] ==> value-parameter projectEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices[ValueParameterDescriptorImpl]

'project' @ [527:122] ==> public final val JavaCoreProjectEnvironment.project: MockProject[MyPropertyDescriptor]

'kotlinScriptDefinitionProvider' @ [527:131] ==> val kotlinScriptDefinitionProvider: KotlinScriptDefinitionProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices.<anonymous>[LocalVariableDescriptor]

'registerService' @ [528:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(KotlinJavaPsiFacade..KotlinJavaPsiFacade?)>, @NotNull p1: KotlinJavaPsiFacade): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinJavaPsiFacade

'KotlinJavaPsiFacade' @ [528:33] ==> public constructor KotlinJavaPsiFacade(@NotNull p0: Project) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaClassConstructorDescriptor]

'java' @ [528:60] ==> public val <T> KClass<KotlinJavaPsiFacade>.java: Class<KotlinJavaPsiFacade> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinJavaPsiFacade

'KotlinJavaPsiFacade' @ [528:66] ==> public constructor KotlinJavaPsiFacade(@NotNull p0: Project) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaClassConstructorDescriptor]

'this' @ [528:86] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices.<anonymous>[ReceiverParameterDescriptorImpl]

'registerService' @ [529:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(KtLightClassForFacade.FacadeStubCache..KtLightClassForFacade.FacadeStubCache?)>, @NotNull p1: KtLightClassForFacade.FacadeStubCache): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FacadeStubCache

'KtLightClassForFacade' @ [529:33] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[FakeCallableDescriptorForObject]

'FacadeStubCache' @ [529:55] ==> public companion object defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[FakeCallableDescriptorForObject]

'java' @ [529:78] ==> public val <T> KClass<KtLightClassForFacade.FacadeStubCache>.java: Class<KtLightClassForFacade.FacadeStubCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FacadeStubCache

'KtLightClassForFacade' @ [529:84] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[FakeCallableDescriptorForObject]

'FacadeStubCache' @ [529:106] ==> public constructor FacadeStubCache(project: Project) defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[DeserializedClassConstructorDescriptor]

'this' @ [529:122] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices.<anonymous>[ReceiverParameterDescriptorImpl]

'messageCollector' @ [530:21] ==> value-parameter messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices[ValueParameterDescriptorImpl]

'registerService' @ [531:21] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(ScriptReportSink..ScriptReportSink?)>, @NotNull p1: ScriptReportSink): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptReportSink

'java' @ [531:61] ==> public val <T> KClass<ScriptReportSink>.java: Class<ScriptReportSink> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptReportSink

'CliScriptReportSink' @ [531:67] ==> public constructor CliScriptReportSink(messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink[ClassConstructorDescriptorImpl]

'messageCollector' @ [531:87] ==> value-parameter messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion.registerProjectServices[ValueParameterDescriptorImpl]

'Suppress' @ [536:51] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

