'configuration' @ [41:5] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[ValueParameterDescriptorImpl]

'put' @ [41:19] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>, @NotNull p1: List<String>): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'VARIANT' @ [41:48] ==> public final val VARIANT: CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[DeserializedPropertyDescriptor]

'resDirectories' @ [41:57] ==> value-parameter resDirectories: List<String> defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[ValueParameterDescriptorImpl]

'configuration' @ [42:5] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[ValueParameterDescriptorImpl]

'put' @ [42:19] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'PACKAGE' @ [42:48] ==> public final val PACKAGE: CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[DeserializedPropertyDescriptor]

'KotlinCoreEnvironment' @ [44:25] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [44:47] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [44:62] ==> public final val KtUsefulTestCase.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [44:82] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[ValueParameterDescriptorImpl]

'JVM_CONFIG_FILES' @ [44:120] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'myEnvironment' @ [45:19] ==> val myEnvironment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'project' @ [45:33] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'listOf' @ [47:20] ==> public fun <T> listOf(element: AndroidVariant): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'createMainVariant' @ [47:42] ==> public final fun createMainVariant(resDirectories: List<String>): AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant.Companion[DeserializedSimpleFunctionDescriptor]

'resDirectories' @ [47:60] ==> value-parameter resDirectories: List<String> defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[ValueParameterDescriptorImpl]

'project' @ [48:5] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'registerServiceInstance' @ [48:13] ==> public fun <T> ComponentManager.registerServiceInstance(interfaceClass: Class<AndroidLayoutXmlFileManager>, instance: AndroidLayoutXmlFileManager): Unit defined in com.intellij.testFramework[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidLayoutXmlFileManager

'AndroidLayoutXmlFileManager' @ [48:37] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[FakeCallableDescriptorForObject]

'java' @ [48:72] ==> public val <T> KClass<AndroidLayoutXmlFileManager>.java: Class<AndroidLayoutXmlFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AndroidLayoutXmlFileManager

'CliAndroidLayoutXmlFileManager' @ [48:78] ==> public constructor CliAndroidLayoutXmlFileManager(project: Project, applicationPackage: String, variants: List<AndroidVariant>) defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager[DeserializedClassConstructorDescriptor]

'project' @ [48:109] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'variants' @ [48:126] ==> val variants: List<AndroidVariant> defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'ExpressionCodegenExtension' @ [50:5] ==> public companion object : ProjectExtensionDescriptor<ExpressionCodegenExtension> defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [50:32] ==> public final fun registerExtension(project: Project, extension: ExpressionCodegenExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [50:50] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'CliAndroidExtensionsExpressionCodegenExtension' @ [50:59] ==> public constructor CliAndroidExtensionsExpressionCodegenExtension(isExperimental: Boolean, globalCacheImpl: CacheImplementation) defined in org.jetbrains.kotlin.android.synthetic.codegen.CliAndroidExtensionsExpressionCodegenExtension[DeserializedClassConstructorDescriptor]

'DEFAULT' @ [50:132] ==> public final val DEFAULT: CacheImplementation defined in kotlinx.android.extensions.CacheImplementation.Companion[DeserializedPropertyDescriptor]

'StorageComponentContainerContributor' @ [51:5] ==> public companion object : ProjectExtensionDescriptor<StorageComponentContainerContributor> defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor[FakeCallableDescriptorForObject]

'registerExtension' @ [51:42] ==> public final fun registerExtension(project: Project, extension: StorageComponentContainerContributor): Unit defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [51:60] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'AndroidExtensionPropertiesComponentContainerContributor' @ [51:69] ==> public constructor AndroidExtensionPropertiesComponentContainerContributor() defined in org.jetbrains.kotlin.android.synthetic.AndroidExtensionPropertiesComponentContainerContributor[DeserializedClassConstructorDescriptor]

'ClassBuilderInterceptorExtension' @ [52:5] ==> public companion object : ProjectExtensionDescriptor<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [52:38] ==> public final fun registerExtension(project: Project, extension: ClassBuilderInterceptorExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [52:56] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'CliAndroidOnDestroyClassBuilderInterceptorExtension' @ [52:65] ==> public constructor CliAndroidOnDestroyClassBuilderInterceptorExtension(globalCacheImpl: CacheImplementation) defined in org.jetbrains.kotlin.android.synthetic.codegen.CliAndroidOnDestroyClassBuilderInterceptorExtension[DeserializedClassConstructorDescriptor]

'DEFAULT' @ [52:137] ==> public final val DEFAULT: CacheImplementation defined in kotlinx.android.extensions.CacheImplementation.Companion[DeserializedPropertyDescriptor]

'PackageFragmentProviderExtension' @ [53:5] ==> public companion object : ProjectExtensionDescriptor<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [53:38] ==> public final fun registerExtension(project: Project, extension: PackageFragmentProviderExtension): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [53:56] ==> val project: Project defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'CliAndroidPackageFragmentProviderExtension' @ [53:65] ==> public constructor CliAndroidPackageFragmentProviderExtension(isExperimental: Boolean) defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidPackageFragmentProviderExtension[DeserializedClassConstructorDescriptor]

'addAndroidExtensionsRuntimeLibrary' @ [55:5] ==> public fun addAndroidExtensionsRuntimeLibrary(environment: KotlinCoreEnvironment): Unit defined in org.jetbrains.kotlin.android.synthetic.test in file CompilerTestUtils.kt[SimpleFunctionDescriptorImpl]

'myEnvironment' @ [55:40] ==> val myEnvironment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'myEnvironment' @ [57:12] ==> val myEnvironment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.synthetic.test.createTestEnvironment[LocalVariableDescriptor]

'environment' @ [61:5] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.synthetic.test.addAndroidExtensionsRuntimeLibrary[ValueParameterDescriptorImpl]

'apply' @ [61:17] ==> @InlineOnly public inline fun <T> KotlinCoreEnvironment.apply(block: KotlinCoreEnvironment.() -> Unit): KotlinCoreEnvironment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCoreEnvironment

'File' @ [62:30] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'updateClasspath' @ [63:9] ==> public final fun updateClasspath(contentRoots: List<ContentRoot>): List<File>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'listOf' @ [63:25] ==> public fun <T> listOf(element: JvmClasspathRoot): List<JvmClasspathRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClasspathRoot

'JvmClasspathRoot' @ [63:32] ==> public constructor JvmClasspathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[DeserializedClassConstructorDescriptor]

'runtimeLibrary' @ [63:49] ==> val runtimeLibrary: File defined in org.jetbrains.kotlin.android.synthetic.test.addAndroidExtensionsRuntimeLibrary.<anonymous>[LocalVariableDescriptor]

'File' @ [68:12] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [68:17] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.synthetic.test.getResPaths[ValueParameterDescriptorImpl]

'listFiles' @ [68:23] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'it' @ [68:41] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.android.synthetic.test.getResPaths.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [68:44] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [68:49] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [68:70] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.android.synthetic.test.getResPaths.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [68:73] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'map' @ [68:89] ==> public inline fun <T, R> Array<out (File..File?)>.map(transform: ((File..File?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> String

'path' @ [68:97] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.synthetic.test.getResPaths[ValueParameterDescriptorImpl]

'it' @ [68:103] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.android.synthetic.test.getResPaths.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [68:106] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

