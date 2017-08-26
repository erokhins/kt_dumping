'create' @ [51:44] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'create' @ [52:44] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'create' @ [53:49] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'create' @ [54:55] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CliOption' @ [61:30] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [62:30] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [63:35] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [64:41] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [68:41] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'ANDROID_COMPILER_PLUGIN_ID' @ [71:37] ==> public final val ANDROID_COMPILER_PLUGIN_ID: String defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'listOf' @ [74:15] ==> public fun <T> listOf(vararg elements: CliOption): List<CliOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOption

'VARIANT_OPTION' @ [74:22] ==> public final val VARIANT_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'PACKAGE_OPTION' @ [74:38] ==> public final val PACKAGE_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'EXPERIMENTAL_OPTION' @ [74:54] ==> public final val EXPERIMENTAL_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'DEFAULT_CACHE_IMPL_OPTION' @ [74:75] ==> public final val DEFAULT_CACHE_IMPL_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'when (option) {
            VARIANT_OPTION -> configuration.appendList(AndroidConfigurationKeys.VARIANT, value)
            PACKAGE_OPTION -> configuration.put(AndroidConfigurationKeys.PACKAGE, value)
            EXPERIMENTAL_OPTION -> configuration.put(AndroidConfigurationKeys.EXPERIMENTAL, value)
            DEFAULT_CACHE_IMPL_OPTION -> configuration.put(AndroidConfigurationKeys.DEFAULT_CACHE_IMPL, value)
            else -> throw CliOptionProcessingException("Unknown option: ${option.name}")
        }' @ [77:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'option' @ [77:15] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'VARIANT_OPTION' @ [78:13] ==> public final val VARIANT_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [78:31] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'appendList' @ [78:45] ==> public open fun <T> CompilerConfiguration.appendList(option: CompilerConfigurationKey<List<String>>, value: String): Unit defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'AndroidConfigurationKeys' @ [78:56] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'VARIANT' @ [78:81] ==> public final val VARIANT: CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'value' @ [78:90] ==> value-parameter value: String defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'PACKAGE_OPTION' @ [79:13] ==> public final val PACKAGE_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [79:31] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [79:45] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'AndroidConfigurationKeys' @ [79:49] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'PACKAGE' @ [79:74] ==> public final val PACKAGE: CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'value' @ [79:83] ==> value-parameter value: String defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'EXPERIMENTAL_OPTION' @ [80:13] ==> public final val EXPERIMENTAL_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [80:36] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [80:50] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'AndroidConfigurationKeys' @ [80:54] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'EXPERIMENTAL' @ [80:79] ==> public final val EXPERIMENTAL: CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'value' @ [80:93] ==> value-parameter value: String defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'DEFAULT_CACHE_IMPL_OPTION' @ [81:13] ==> public final val DEFAULT_CACHE_IMPL_OPTION: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [81:42] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [81:56] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'AndroidConfigurationKeys' @ [81:60] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'DEFAULT_CACHE_IMPL' @ [81:85] ==> public final val DEFAULT_CACHE_IMPL: CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'value' @ [81:105] ==> value-parameter value: String defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'CliOptionProcessingException' @ [82:27] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedClassConstructorDescriptor]

'option' @ [82:75] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.android.synthetic.AndroidCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'name' @ [82:82] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'ExpressionCodegenExtension' @ [90:13] ==> public companion object : ProjectExtensionDescriptor<ExpressionCodegenExtension> defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [90:40] ==> public final fun registerExtension(project: Project, extension: ExpressionCodegenExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [90:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.Companion.registerParcelExtensions[ValueParameterDescriptorImpl]

'ParcelableCodegenExtension' @ [90:67] ==> public constructor ParcelableCodegenExtension() defined in org.jetbrains.kotlin.android.parcel.ParcelableCodegenExtension[ClassConstructorDescriptorImpl]

'SyntheticResolveExtension' @ [91:13] ==> public companion object : ProjectExtensionDescriptor<SyntheticResolveExtension> defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [91:39] ==> public final fun registerExtension(project: Project, extension: SyntheticResolveExtension): Unit defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [91:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.Companion.registerParcelExtensions[ValueParameterDescriptorImpl]

'ParcelableResolveExtension' @ [91:66] ==> public constructor ParcelableResolveExtension() defined in org.jetbrains.kotlin.android.parcel.ParcelableResolveExtension[ClassConstructorDescriptorImpl]

'ClassBuilderInterceptorExtension' @ [92:13] ==> public companion object : ProjectExtensionDescriptor<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [92:46] ==> public final fun registerExtension(project: Project, extension: ClassBuilderInterceptorExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [92:64] ==> value-parameter project: Project defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.Companion.registerParcelExtensions[ValueParameterDescriptorImpl]

'ParcelableClinitClassBuilderInterceptorExtension' @ [92:73] ==> public constructor ParcelableClinitClassBuilderInterceptorExtension() defined in org.jetbrains.kotlin.android.synthetic.codegen.ParcelableClinitClassBuilderInterceptorExtension[ClassConstructorDescriptorImpl]

'when (s) {
            "sparseArray" -> CacheImplementation.SPARSE_ARRAY
            "none" -> CacheImplementation.NO_CACHE
            else -> CacheImplementation.DEFAULT
        }' @ [95:77] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CacheImplementation, entry1: CacheImplementation, entry2: CacheImplementation): CacheImplementation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CacheImplementation

's' @ [95:83] ==> value-parameter s: String? defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.Companion.parseCacheImplementationType[ValueParameterDescriptorImpl]

'CacheImplementation' @ [96:30] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'SPARSE_ARRAY' @ [96:50] ==> enum entry SPARSE_ARRAY defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'CacheImplementation' @ [97:23] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'NO_CACHE' @ [97:43] ==> enum entry NO_CACHE defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'CacheImplementation' @ [98:21] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'DEFAULT' @ [98:41] ==> public final val DEFAULT: CacheImplementation defined in kotlinx.android.extensions.CacheImplementation.Companion[DeserializedPropertyDescriptor]

'configuration' @ [103:34] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [103:48] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'AndroidConfigurationKeys' @ [103:52] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'PACKAGE' @ [103:77] ==> public final val PACKAGE: CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'configuration' @ [104:24] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [104:38] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>): List<String>? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'AndroidConfigurationKeys' @ [104:42] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'VARIANT' @ [104:67] ==> public final val VARIANT: CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'mapNotNull' @ [104:77] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> AndroidVariant?): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> AndroidVariant

'parseVariant' @ [104:90] ==> private final fun parseVariant(s: String): AndroidVariant? defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar[SimpleFunctionDescriptorImpl]

'it' @ [104:103] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [104:112] ==> public fun <T> emptyList(): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'configuration' @ [105:30] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [105:44] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'AndroidConfigurationKeys' @ [105:48] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'EXPERIMENTAL' @ [105:73] ==> public final val EXPERIMENTAL: CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'parseCacheImplementationType' @ [106:31] ==> public final fun parseCacheImplementationType(s: String?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [106:60] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [106:74] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'AndroidConfigurationKeys' @ [106:78] ==> public object AndroidConfigurationKeys defined in org.jetbrains.kotlin.android.synthetic in file AndroidComponentRegistrar.kt[FakeCallableDescriptorForObject]

'DEFAULT_CACHE_IMPL' @ [106:103] ==> public final val DEFAULT_CACHE_IMPL: CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.AndroidConfigurationKeys[PropertyDescriptorImpl]

'isExperimental' @ [108:13] ==> val isExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'registerParcelExtensions' @ [109:13] ==> public final fun registerParcelExtensions(project: Project): Unit defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.Companion[SimpleFunctionDescriptorImpl]

'project' @ [109:38] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'variants' @ [112:13] ==> val variants: List<AndroidVariant> defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'isNotEmpty' @ [112:22] ==> @InlineOnly public inline fun <T> Collection<AndroidVariant>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'!' @ [112:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'applicationPackage' @ [112:39] ==> val applicationPackage: String? defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'isNullOrBlank' @ [112:58] ==> @InlineOnly public inline fun CharSequence?.isNullOrBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CliAndroidLayoutXmlFileManager' @ [113:40] ==> public constructor CliAndroidLayoutXmlFileManager(project: Project, applicationPackage: String, variants: List<AndroidVariant>) defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager[ClassConstructorDescriptorImpl]

'project' @ [113:71] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'applicationPackage' @ [113:80] ==> val applicationPackage: String? defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'variants' @ [113:102] ==> val variants: List<AndroidVariant> defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'project' @ [114:13] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'registerService' @ [114:21] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(AndroidLayoutXmlFileManager..AndroidLayoutXmlFileManager?)>, @NotNull p1: AndroidLayoutXmlFileManager): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AndroidLayoutXmlFileManager

'AndroidLayoutXmlFileManager' @ [114:37] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[FakeCallableDescriptorForObject]

'java' @ [114:72] ==> public val <T> KClass<AndroidLayoutXmlFileManager>.java: Class<AndroidLayoutXmlFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AndroidLayoutXmlFileManager

'layoutXmlFileManager' @ [114:78] ==> val layoutXmlFileManager: CliAndroidLayoutXmlFileManager defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'ExpressionCodegenExtension' @ [116:13] ==> public companion object : ProjectExtensionDescriptor<ExpressionCodegenExtension> defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [116:40] ==> public final fun registerExtension(project: Project, extension: ExpressionCodegenExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [116:58] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'CliAndroidExtensionsExpressionCodegenExtension' @ [116:67] ==> public constructor CliAndroidExtensionsExpressionCodegenExtension(isExperimental: Boolean, globalCacheImpl: CacheImplementation) defined in org.jetbrains.kotlin.android.synthetic.codegen.CliAndroidExtensionsExpressionCodegenExtension[ClassConstructorDescriptorImpl]

'isExperimental' @ [116:114] ==> val isExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'globalCacheImpl' @ [116:130] ==> val globalCacheImpl: CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'StorageComponentContainerContributor' @ [117:13] ==> public companion object : ProjectExtensionDescriptor<StorageComponentContainerContributor> defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor[FakeCallableDescriptorForObject]

'registerExtension' @ [117:50] ==> public final fun registerExtension(project: Project, extension: StorageComponentContainerContributor): Unit defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [117:68] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'AndroidExtensionPropertiesComponentContainerContributor' @ [117:77] ==> public constructor AndroidExtensionPropertiesComponentContainerContributor() defined in org.jetbrains.kotlin.android.synthetic.AndroidExtensionPropertiesComponentContainerContributor[ClassConstructorDescriptorImpl]

'ClassBuilderInterceptorExtension' @ [118:13] ==> public companion object : ProjectExtensionDescriptor<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [118:46] ==> public final fun registerExtension(project: Project, extension: ClassBuilderInterceptorExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [118:64] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'CliAndroidOnDestroyClassBuilderInterceptorExtension' @ [118:73] ==> public constructor CliAndroidOnDestroyClassBuilderInterceptorExtension(globalCacheImpl: CacheImplementation) defined in org.jetbrains.kotlin.android.synthetic.codegen.CliAndroidOnDestroyClassBuilderInterceptorExtension[ClassConstructorDescriptorImpl]

'globalCacheImpl' @ [118:125] ==> val globalCacheImpl: CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'PackageFragmentProviderExtension' @ [119:13] ==> public companion object : ProjectExtensionDescriptor<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [119:46] ==> public final fun registerExtension(project: Project, extension: PackageFragmentProviderExtension): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [119:64] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'CliAndroidPackageFragmentProviderExtension' @ [119:73] ==> public constructor CliAndroidPackageFragmentProviderExtension(isExperimental: Boolean) defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidPackageFragmentProviderExtension[ClassConstructorDescriptorImpl]

'isExperimental' @ [119:116] ==> val isExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

's' @ [124:21] ==> value-parameter s: String defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.parseVariant[ValueParameterDescriptorImpl]

'split' @ [124:23] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parts' @ [125:13] ==> val parts: List<String> defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.parseVariant[LocalVariableDescriptor]

'size' @ [125:19] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'AndroidVariant' @ [126:16] ==> public constructor AndroidVariant(name: String, resDirectories: List<String>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[ClassConstructorDescriptorImpl]

'parts' @ [126:31] ==> val parts: List<String> defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.parseVariant[LocalVariableDescriptor]

'parts' @ [126:41] ==> val parts: List<String> defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.parseVariant[LocalVariableDescriptor]

'drop' @ [126:47] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'platform' @ [134:13] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.android.synthetic.AndroidExtensionPropertiesComponentContainerContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'JvmPlatform' @ [134:25] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'container' @ [136:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.android.synthetic.AndroidExtensionPropertiesComponentContainerContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [136:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'AndroidExtensionPropertiesCallChecker' @ [136:31] ==> public constructor AndroidExtensionPropertiesCallChecker() defined in org.jetbrains.kotlin.android.synthetic.diagnostic.AndroidExtensionPropertiesCallChecker[ClassConstructorDescriptorImpl]

'container' @ [137:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.android.synthetic.AndroidExtensionPropertiesComponentContainerContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [137:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'ParcelableDeclarationChecker' @ [137:31] ==> public constructor ParcelableDeclarationChecker() defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker[ClassConstructorDescriptorImpl]

