'JvmOverloads' @ [50:23] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'GENERATE_ALL' @ [57:100] ==> @JvmField public final val GENERATE_ALL: GenerationState.GenerateClassFilter defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter.Companion[PropertyDescriptorImpl]

'DefaultCodegenFactory' @ [58:46] ==> public object DefaultCodegenFactory : CodegenFactory defined in org.jetbrains.kotlin.codegen in file CodegenFactory.kt[FakeCallableDescriptorForObject]

'configuration' @ [61:31] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'get' @ [61:45] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [61:49] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [61:73] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'GenerationStateEventCallback' @ [66:85] ==> public companion object defined in org.jetbrains.kotlin.codegen.state.GenerationStateEventCallback[FakeCallableDescriptorForObject]

'DO_NOTHING' @ [66:114] ==> public final val DO_NOTHING: GenerationStateEventCallback defined in org.jetbrains.kotlin.codegen.state.GenerationStateEventCallback.Companion[PropertyDescriptorImpl]

'shouldGenerateClass' @ [74:89] ==> public abstract fun shouldGenerateClass(processingClassOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter[SimpleFunctionDescriptorImpl]

'processingClassOrObject' @ [74:109] ==> value-parameter processingClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter.shouldGenerateClassMembers[ValueParameterDescriptorImpl]

'JvmField' @ [77:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'GenerateClassFilter' @ [77:72] ==> public constructor GenerateClassFilter() defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter[ClassConstructorDescriptorImpl]

'CodegenFileClassesProvider' @ [89:59] ==> public constructor CodegenFileClassesProvider() defined in org.jetbrains.kotlin.codegen.CodegenFileClassesProvider[ClassConstructorDescriptorImpl]

'InlineCache' @ [90:36] ==> public constructor InlineCache() defined in org.jetbrains.kotlin.codegen.inline.InlineCache[ClassConstructorDescriptorImpl]

'CompilerDeserializationConfiguration' @ [96:13] ==> public constructor CompilerDeserializationConfiguration(languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.CompilerDeserializationConfiguration[DeserializedClassConstructorDescriptor]

'configuration' @ [96:50] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'languageVersionSettings' @ [96:64] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'configuration' @ [99:28] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [99:42] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>): IncrementalCompilationComponents? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IncrementalCompilationComponents

'INCREMENTAL_COMPILATION_COMPONENTS' @ [99:67] ==> public final val INCREMENTAL_COMPILATION_COMPONENTS: (CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>..CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'if (icComponents != null) {
            incrementalCacheForThisTarget =
                    icComponents.getIncrementalCache(targetId ?: error("Target ID should be specified for incremental compilation"))
            packagesWithObsoleteParts = incrementalCacheForThisTarget.getObsoletePackageParts().map {
                JvmClassName.byInternalName(it).packageFqName
            }.toSet()
            obsoleteMultifileClasses = incrementalCacheForThisTarget.getObsoleteMultifileClasses().map {
                JvmClassName.byInternalName(it).fqNameForClassNameWithoutDollars
            }
        }
        else {
            incrementalCacheForThisTarget = null
            packagesWithObsoleteParts = emptySet()
            obsoleteMultifileClasses = emptyList()
        }' @ [100:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'icComponents' @ [100:13] ==> val icComponents: IncrementalCompilationComponents? defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[LocalVariableDescriptor]

'incrementalCacheForThisTarget' @ [101:13] ==> public final val incrementalCacheForThisTarget: IncrementalCache? defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'icComponents' @ [102:21] ==> val icComponents: IncrementalCompilationComponents? defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[LocalVariableDescriptor]

'getIncrementalCache' @ [102:34] ==> public abstract fun getIncrementalCache(target: TargetId): IncrementalCache defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCompilationComponents[DeserializedSimpleFunctionDescriptor]

'targetId' @ [102:54] ==> public final val targetId: TargetId? defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'error' @ [102:66] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'packagesWithObsoleteParts' @ [103:13] ==> public final val packagesWithObsoleteParts: Set<FqName> defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'incrementalCacheForThisTarget' @ [103:41] ==> public final val incrementalCacheForThisTarget: IncrementalCache? defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getObsoletePackageParts' @ [103:71] ==> public abstract fun getObsoletePackageParts(): Collection<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCache[DeserializedSimpleFunctionDescriptor]

'map' @ [103:97] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'byInternalName' @ [104:30] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'it' @ [104:45] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [104:49] ==> public final val JvmClassName.packageFqName: FqName[MyPropertyDescriptor]

'toSet' @ [105:15] ==> public fun <T> Iterable<FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'obsoleteMultifileClasses' @ [106:13] ==> public final val obsoleteMultifileClasses: List<FqName> defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'incrementalCacheForThisTarget' @ [106:40] ==> public final val incrementalCacheForThisTarget: IncrementalCache? defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getObsoleteMultifileClasses' @ [106:70] ==> public abstract fun getObsoleteMultifileClasses(): Collection<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCache[DeserializedSimpleFunctionDescriptor]

'map' @ [106:100] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'byInternalName' @ [107:30] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'it' @ [107:45] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [107:49] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'incrementalCacheForThisTarget' @ [111:13] ==> public final val incrementalCacheForThisTarget: IncrementalCache? defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'packagesWithObsoleteParts' @ [112:13] ==> public final val packagesWithObsoleteParts: Set<FqName> defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'emptySet' @ [112:41] ==> public fun <T> emptySet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'obsoleteMultifileClasses' @ [113:13] ==> public final val obsoleteMultifileClasses: List<FqName> defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'emptyList' @ [113:40] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'DelegatingBindingTrace' @ [117:50] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'bindingContext' @ [117:73] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'this' @ [117:117] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'java' @ [117:129] ==> public val <T> KClass<out GenerationState>.java: Class<out GenerationState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenerationState

'extraJvmDiagnosticsTrace' @ [121:45] ==> public final val extraJvmDiagnosticsTrace: BindingTrace defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'LazyJvmDiagnostics' @ [122:53] ==> public constructor LazyJvmDiagnostics(compute: () -> Diagnostics) defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics[ClassConstructorDescriptorImpl]

'duplicateSignatureFactory' @ [123:9] ==> private final lateinit var duplicateSignatureFactory: BuilderFactoryForDuplicateSignatureDiagnostics defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'reportDiagnostics' @ [123:35] ==> public final fun reportDiagnostics(): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'extraJvmDiagnosticsTrace' @ [124:9] ==> public final val extraJvmDiagnosticsTrace: BindingTrace defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'bindingContext' @ [124:34] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'diagnostics' @ [124:49] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'configuration' @ [127:18] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [127:32] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(JvmTarget..JvmTarget?)>): JvmTarget? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmTarget

'JVM_TARGET' @ [127:57] ==> public final val JVM_TARGET: (CompilerConfigurationKey<(JvmTarget..JvmTarget?)>..CompilerConfigurationKey<(JvmTarget..JvmTarget?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmTarget' @ [127:72] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'DEFAULT' @ [127:82] ==> @field:JvmField public final val DEFAULT: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedPropertyDescriptor]

'target' @ [128:33] ==> public final val target: JvmTarget defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'JvmTarget' @ [128:43] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_8' @ [128:53] ==> enum entry JVM_1_8 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'isJvm8Target' @ [129:46] ==> public final val isJvm8Target: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'configuration' @ [129:62] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [129:76] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'JVM8_TARGET_WITH_DEFAULTS' @ [129:108] ==> public final val JVM8_TARGET_WITH_DEFAULTS: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [130:48] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [130:62] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'INTERFACE_COMPATIBILITY' @ [130:94] ==> public final val INTERFACE_COMPATIBILITY: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'moduleName' @ [132:30] ==> value-parameter moduleName: String? = ... defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'getModuleName' @ [132:59] ==> @NotNull public open fun getModuleName(module: (ModuleDescriptor..ModuleDescriptor?)): String defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'module' @ [132:73] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'builderFactory' @ [133:46] ==> value-parameter builderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'classBuilderMode' @ [133:61] ==> public final val ClassBuilderFactory.classBuilderMode: ClassBuilderMode[MyPropertyDescriptor]

'DelegatingBindingTrace' @ [134:38] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'bindingContext' @ [134:61] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'if (wantsDiagnostics) BindingTraceFilter.ACCEPT_ALL else BindingTraceFilter.NO_DIAGNOSTICS' @ [135:70] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BindingTraceFilter, elseBranch: BindingTraceFilter): BindingTraceFilter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BindingTraceFilter

'wantsDiagnostics' @ [135:74] ==> value-parameter wantsDiagnostics: Boolean = ... defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'BindingTraceFilter' @ [135:92] ==> public companion object defined in org.jetbrains.kotlin.resolve.BindingTraceFilter[FakeCallableDescriptorForObject]

'ACCEPT_ALL' @ [135:111] ==> public final val ACCEPT_ALL: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.BindingTraceFilter.Companion[DeserializedPropertyDescriptor]

'BindingTraceFilter' @ [135:127] ==> public companion object defined in org.jetbrains.kotlin.resolve.BindingTraceFilter[FakeCallableDescriptorForObject]

'NO_DIAGNOSTICS' @ [135:146] ==> public final val NO_DIAGNOSTICS: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.BindingTraceFilter.Companion[DeserializedPropertyDescriptor]

'bindingTrace' @ [136:42] ==> public final val bindingTrace: BindingTrace defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'bindingContext' @ [136:55] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'KotlinTypeMapper' @ [137:40] ==> public constructor KotlinTypeMapper(@NotNull bindingContext: BindingContext, @NotNull classBuilderMode: ClassBuilderMode, @NotNull fileClassesProvider: JvmFileClassesProvider, @NotNull incompatibleClassTracker: IncompatibleClassTracker, @NotNull moduleName: String, isJvm8Target: Boolean, isJvm8TargetWithDefaults: Boolean) defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaClassConstructorDescriptor]

'this' @ [138:13] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'bindingContext' @ [138:18] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'classBuilderMode' @ [138:34] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'fileClassesProvider' @ [138:52] ==> public final val fileClassesProvider: CodegenFileClassesProvider defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'IncompatibleClassTrackerImpl' @ [138:73] ==> public constructor IncompatibleClassTrackerImpl(trace: BindingTrace) defined in org.jetbrains.kotlin.codegen.state.IncompatibleClassTrackerImpl[ClassConstructorDescriptorImpl]

'extraJvmDiagnosticsTrace' @ [138:102] ==> public final val extraJvmDiagnosticsTrace: BindingTrace defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'this' @ [139:13] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'moduleName' @ [139:18] ==> public final val moduleName: String defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'isJvm8Target' @ [139:30] ==> public final val isJvm8Target: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'isJvm8TargetWithDefaults' @ [139:44] ==> public final val isJvm8TargetWithDefaults: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'IntrinsicMethods' @ [141:40] ==> public constructor IntrinsicMethods(jvmTarget: (JvmTarget..JvmTarget?)) defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaClassConstructorDescriptor]

'target' @ [141:57] ==> public final val target: JvmTarget defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'SamWrapperClasses' @ [142:48] ==> public constructor SamWrapperClasses(state: GenerationState) defined in org.jetbrains.kotlin.codegen.SamWrapperClasses[ClassConstructorDescriptorImpl]

'this' @ [142:66] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'InlineCycleReporter' @ [143:52] ==> public constructor InlineCycleReporter(diagnostics: DiagnosticSink) defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[ClassConstructorDescriptorImpl]

'diagnostics' @ [143:72] ==> public final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'MappingsClassesForWhenByEnum' @ [144:70] ==> public constructor MappingsClassesForWhenByEnum(@NotNull state: GenerationState) defined in org.jetbrains.kotlin.codegen.`when`.MappingsClassesForWhenByEnum[JavaClassConstructorDescriptor]

'this' @ [144:99] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'JvmRuntimeTypes' @ [145:44] ==> public constructor JvmRuntimeTypes(module: ModuleDescriptor) defined in org.jetbrains.kotlin.codegen.JvmRuntimeTypes[ClassConstructorDescriptorImpl]

'module' @ [145:60] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'ForRepl' @ [149:24] ==> public constructor ForRepl() defined in org.jetbrains.kotlin.codegen.state.GenerationState.ForRepl[ClassConstructorDescriptorImpl]

'scriptResultFieldName' @ [155:62] ==> public final var scriptResultFieldName: String? defined in org.jetbrains.kotlin.codegen.state.GenerationState.ForRepl[PropertyDescriptorImpl]

'configuration' @ [159:45] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [159:59] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'DISABLE_CALL_ASSERTIONS' @ [159:91] ==> public final val DISABLE_CALL_ASSERTIONS: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [160:46] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [160:60] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'DISABLE_PARAM_ASSERTIONS' @ [160:92] ==> public final val DISABLE_PARAM_ASSERTIONS: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [161:37] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [161:51] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'CommonConfigurationKeys' @ [161:62] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'DISABLE_INLINE' @ [161:86] ==> @field:JvmField public final val DISABLE_INLINE: CompilerConfigurationKey<Boolean> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'configuration' @ [162:45] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [162:59] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'USE_TYPE_TABLE' @ [162:91] ==> public final val USE_TYPE_TABLE: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [163:42] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [163:56] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'INHERIT_MULTIFILE_PARTS' @ [163:88] ==> public final val INHERIT_MULTIFILE_PARTS: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'RootContext' @ [165:42] ==> public constructor RootContext(@NotNull state: GenerationState) defined in org.jetbrains.kotlin.codegen.context.RootContext[JavaClassConstructorDescriptor]

'this' @ [165:54] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'target' @ [167:33] ==> public final val target: JvmTarget defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'bytecodeVersion' @ [167:40] ==> public final val bytecodeVersion: Int defined in org.jetbrains.kotlin.config.JvmTarget[DeserializedPropertyDescriptor]

'configuration' @ [169:47] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getBoolean' @ [169:61] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'PARAMETERS_METADATA' @ [169:93] ==> public final val PARAMETERS_METADATA: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [171:35] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'languageVersionSettings' @ [171:49] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'languageVersionSettings' @ [172:33] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'supportsFeature' @ [172:57] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [172:73] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'InlineConstVals' @ [172:89] ==> enum entry InlineConstVals defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'this' @ [175:9] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'interceptedBuilderFactory' @ [175:14] ==> private final val interceptedBuilderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'builderFactory' @ [175:42] ==> value-parameter builderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'wrapWith' @ [176:18] ==> private fun ClassBuilderFactory.wrapWith(vararg wrappers: (ClassBuilderFactory) -> ClassBuilderFactory): ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'OptimizationClassBuilderFactory' @ [177:23] ==> public constructor OptimizationClassBuilderFactory(delegate: (ClassBuilderFactory..ClassBuilderFactory?), disableOptimization: Boolean) defined in org.jetbrains.kotlin.codegen.optimization.OptimizationClassBuilderFactory[JavaClassConstructorDescriptor]

'it' @ [177:55] ==> value-parameter it: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'configuration' @ [177:59] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [177:73] ==> @NotNull public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'DISABLE_OPTIMIZATION' @ [177:98] ==> public final val DISABLE_OPTIMIZATION: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'BuilderFactoryForDuplicateSignatureDiagnostics' @ [178:23] ==> public constructor BuilderFactoryForDuplicateSignatureDiagnostics(builderFactory: ClassBuilderFactory, bindingContext: BindingContext, diagnostics: DiagnosticSink, fileClassesProvider: JvmFileClassesProvider, moduleName: String, shouldGenerate: (JvmDeclarationOrigin) -> Boolean) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[ClassConstructorDescriptorImpl]

'it' @ [179:29] ==> value-parameter it: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [179:33] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'bindingContext' @ [179:38] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'diagnostics' @ [179:54] ==> public final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'fileClassesProvider' @ [180:29] ==> public final val fileClassesProvider: CodegenFileClassesProvider defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'this' @ [180:50] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'moduleName' @ [180:55] ==> public final val moduleName: String defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'!' @ [181:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldOnlyCollectSignatures' @ [181:49] ==> private final fun shouldOnlyCollectSignatures(origin: JvmDeclarationOrigin): Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[SimpleFunctionDescriptorImpl]

'it' @ [181:77] ==> value-parameter it: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [182:23] ==> @InlineOnly public inline fun <T> BuilderFactoryForDuplicateSignatureDiagnostics.apply(block: BuilderFactoryForDuplicateSignatureDiagnostics.() -> Unit): BuilderFactoryForDuplicateSignatureDiagnostics defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BuilderFactoryForDuplicateSignatureDiagnostics

'duplicateSignatureFactory' @ [182:31] ==> private final lateinit var duplicateSignatureFactory: BuilderFactoryForDuplicateSignatureDiagnostics defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'this' @ [182:59] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'BuilderFactoryForDuplicateClassNameDiagnostics' @ [183:23] ==> public constructor BuilderFactoryForDuplicateClassNameDiagnostics(builderFactory: ClassBuilderFactory, diagnostics: DiagnosticSink) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics[ClassConstructorDescriptorImpl]

'it' @ [183:70] ==> value-parameter it: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'diagnostics' @ [183:74] ==> public final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'configuration' @ [184:23] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [184:37] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'DECLARATIONS_JSON_PATH' @ [184:62] ==> public final val DECLARATIONS_JSON_PATH: (CompilerConfigurationKey<(String..String?)>..CompilerConfigurationKey<(String..String?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'let' @ [185:33] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> SignatureDumpingBuilderFactory): SignatureDumpingBuilderFactory defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> SignatureDumpingBuilderFactory

'SignatureDumpingBuilderFactory' @ [185:54] ==> public constructor SignatureDumpingBuilderFactory(builderFactory: ClassBuilderFactory, destination: File) defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[ClassConstructorDescriptorImpl]

'it' @ [185:85] ==> value-parameter it: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'File' @ [185:89] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destination' @ [185:94] ==> value-parameter destination: String defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [185:113] ==> value-parameter it: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wrapWith' @ [187:18] ==> private inline fun <T> ClassBuilderFactory.wrapWith(elements: Iterable<ClassBuilderInterceptorExtension>, wrapper: (ClassBuilderFactory, ClassBuilderInterceptorExtension) -> ClassBuilderFactory): ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassBuilderInterceptorExtension

'ClassBuilderInterceptorExtension' @ [187:27] ==> public companion object : ProjectExtensionDescriptor<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[FakeCallableDescriptorForObject]

'getInstances' @ [187:60] ==> public final fun getInstances(project: Project): List<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [187:73] ==> public final val project: Project defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'extension' @ [188:21] ==> value-parameter extension: ClassBuilderInterceptorExtension defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'interceptClassBuilderFactory' @ [188:31] ==> public abstract fun interceptClassBuilderFactory(interceptedFactory: ClassBuilderFactory, bindingContext: BindingContext, diagnostics: DiagnosticSink): ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[SimpleFunctionDescriptorImpl]

'builderFactory' @ [188:60] ==> value-parameter builderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [188:76] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState.<init>[ValueParameterDescriptorImpl]

'diagnostics' @ [188:92] ==> public final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'this' @ [191:9] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'factory' @ [191:14] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'ClassFileFactory' @ [191:24] ==> public constructor ClassFileFactory(@NotNull state: GenerationState, @NotNull builderFactory: ClassBuilderFactory) defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaClassConstructorDescriptor]

'this' @ [191:41] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'interceptedBuilderFactory' @ [191:47] ==> private final val interceptedBuilderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'markUsed' @ [195:9] ==> private final fun markUsed(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[SimpleFunctionDescriptorImpl]

'initTrace' @ [197:24] ==> public open fun initTrace(@NotNull state: GenerationState): Unit defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaMethodDescriptor]

'this' @ [197:34] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'invoke' @ [201:9] ==> public abstract fun invoke(p1: GenerationState): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationStateEventCallback[FunctionInvokeDescriptor]

'this' @ [201:41] ==> <this> defined in org.jetbrains.kotlin.codegen.state.GenerationState[LazyClassReceiverParameterDescriptor]

'used' @ [205:13] ==> private final var used: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'IllegalStateException' @ [205:25] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'GenerationState' @ [205:50] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[ClassConstructorDescriptorImpl]

'java' @ [205:73] ==> public val <T> KClass<GenerationState>.java: Class<GenerationState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenerationState

'used' @ [207:9] ==> private final var used: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'interceptedBuilderFactory' @ [211:9] ==> private final val interceptedBuilderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'close' @ [211:35] ==> public abstract fun close(): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilderFactory[JavaMethodDescriptor]

'classBuilderMode' @ [215:15] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'LIGHT_CLASSES' @ [215:52] ==> public final val LIGHT_CLASSES: (ClassBuilderMode..ClassBuilderMode?) defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'origin' @ [215:69] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.GenerationState.shouldOnlyCollectSignatures[ValueParameterDescriptorImpl]

'originKind' @ [215:76] ==> public final val originKind: JvmDeclarationOriginKind defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'doNotGenerateInLightClassMode' @ [215:90] ==> private val doNotGenerateInLightClassMode: Set<JvmDeclarationOriginKind> defined in org.jetbrains.kotlin.codegen.state in file GenerationState.kt[PropertyDescriptorImpl]

'setOf' @ [218:45] ==> public fun <T> setOf(vararg elements: JvmDeclarationOriginKind): Set<JvmDeclarationOriginKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDeclarationOriginKind

'CLASS_MEMBER_DELEGATION_TO_DEFAULT_IMPL' @ [218:51] ==> enum entry CLASS_MEMBER_DELEGATION_TO_DEFAULT_IMPL defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'BRIDGE' @ [218:92] ==> enum entry BRIDGE defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'COLLECTION_STUB' @ [218:100] ==> enum entry COLLECTION_STUB defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'AUGMENTED_BUILTIN_API' @ [218:117] ==> enum entry AUGMENTED_BUILTIN_API defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'lazy' @ [221:29] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Diagnostics): Lazy<Diagnostics> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics

'SYNCHRONIZED' @ [221:55] ==> enum entry SYNCHRONIZED defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'compute' @ [221:69] ==> value-parameter compute: () -> Diagnostics defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics.<init>[ValueParameterDescriptorImpl]

'delegate' @ [224:17] ==> private final val delegate: Diagnostics defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics[PropertyDescriptorImpl]

'modificationTracker' @ [224:26] ==> public open val modificationTracker: ModificationTracker defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedPropertyDescriptor]

'delegate' @ [226:50] ==> private final val delegate: Diagnostics defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics[PropertyDescriptorImpl]

'all' @ [226:59] ==> public abstract fun all(): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'delegate' @ [228:56] ==> private final val delegate: Diagnostics defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics[PropertyDescriptorImpl]

'forElement' @ [228:65] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [228:76] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics.forElement[ValueParameterDescriptorImpl]

'delegate' @ [230:30] ==> private final val delegate: Diagnostics defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics[PropertyDescriptorImpl]

'isEmpty' @ [230:39] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'delegate' @ [232:36] ==> private final val delegate: Diagnostics defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics[PropertyDescriptorImpl]

'noSuppression' @ [232:45] ==> public abstract fun noSuppression(): Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'delegate' @ [234:31] ==> private final val delegate: Diagnostics defined in org.jetbrains.kotlin.codegen.state.LazyJvmDiagnostics[PropertyDescriptorImpl]

'iterator' @ [234:40] ==> public open fun iterator(): Iterator<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'GenerationStateEventCallback' @ [239:26] ==> public fun GenerationStateEventCallback(block: (GenerationState) -> Unit): GenerationStateEventCallback defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'invoke' @ [245:55] ==> public abstract operator fun invoke(p1: GenerationState): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

's' @ [245:61] ==> value-parameter s: GenerationState defined in org.jetbrains.kotlin.codegen.state.GenerationStateEventCallback.<no name provided>.invoke[ValueParameterDescriptorImpl]

'wrappers' @ [249:9] ==> value-parameter vararg wrappers: (ClassBuilderFactory) -> ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.wrapWith[ValueParameterDescriptorImpl]

'fold' @ [249:18] ==> public inline fun <T, R> Array<out (ClassBuilderFactory) -> ClassBuilderFactory>.fold(initial: ClassBuilderFactory, operation: (ClassBuilderFactory, (ClassBuilderFactory) -> ClassBuilderFactory) -> ClassBuilderFactory): ClassBuilderFactory defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<ClassBuilderFactory, ClassBuilderFactory>
    <R> -> ClassBuilderFactory

'this' @ [249:23] ==> <this> defined in org.jetbrains.kotlin.codegen.state.wrapWith[ReceiverParameterDescriptorImpl]

'invoke' @ [249:58] ==> public abstract operator fun invoke(p1: ClassBuilderFactory): ClassBuilderFactory defined in kotlin.Function1[FunctionInvokeDescriptor]

'builderFactory' @ [249:66] ==> value-parameter builderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.wrapWith.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [252:9] ==> value-parameter elements: Iterable<T> defined in org.jetbrains.kotlin.codegen.state.wrapWith[ValueParameterDescriptorImpl]

'fold' @ [252:18] ==> public inline fun <T, R> Iterable<T>.fold(initial: ClassBuilderFactory, operation: (ClassBuilderFactory, T) -> ClassBuilderFactory): ClassBuilderFactory defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> ClassBuilderFactory

'this' @ [252:23] ==> <this> defined in org.jetbrains.kotlin.codegen.state.wrapWith[ReceiverParameterDescriptorImpl]

'wrapper' @ [252:29] ==> value-parameter wrapper: (ClassBuilderFactory, T) -> ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.wrapWith[ValueParameterDescriptorImpl]

