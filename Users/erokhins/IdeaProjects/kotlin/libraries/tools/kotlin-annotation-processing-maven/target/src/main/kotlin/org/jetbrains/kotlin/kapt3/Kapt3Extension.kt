'AbstractKapt3Extension' @ [67:5] ==> public constructor AbstractKapt3Extension(compileClasspath: List<File>, annotationProcessingClasspath: List<File>, javaSourceRoots: List<File>, sourcesOutputDir: File, classFilesOutputDir: File, stubsOutputDir: File, incrementalDataOutputDir: File?, options: Map<String, String>, javacOptions: Map<String, String>, annotationProcessors: String, aptMode: AptMode, pluginInitializedTime: Long, logger: KaptLogger, correctErrorTypes: Boolean, compilerConfiguration: CompilerConfiguration) defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[ClassConstructorDescriptorImpl]

'compileClasspath' @ [67:28] ==> value-parameter compileClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'annotationProcessingClasspath' @ [67:46] ==> value-parameter annotationProcessingClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'javaSourceRoots' @ [67:77] ==> value-parameter javaSourceRoots: List<File> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'sourcesOutputDir' @ [67:94] ==> value-parameter sourcesOutputDir: File defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'classFilesOutputDir' @ [68:28] ==> value-parameter classFilesOutputDir: File defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'stubsOutputDir' @ [68:49] ==> value-parameter stubsOutputDir: File defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'incrementalDataOutputDir' @ [68:65] ==> value-parameter incrementalDataOutputDir: File? defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'options' @ [68:91] ==> value-parameter options: Map<String, String> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'javacOptions' @ [68:100] ==> value-parameter javacOptions: Map<String, String> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'annotationProcessors' @ [68:114] ==> value-parameter annotationProcessors: String defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'aptMode' @ [69:28] ==> value-parameter aptMode: AptMode defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'pluginInitializedTime' @ [69:37] ==> value-parameter pluginInitializedTime: Long defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'logger' @ [69:60] ==> value-parameter logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'correctErrorTypes' @ [69:68] ==> value-parameter correctErrorTypes: Boolean defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'compilerConfiguration' @ [69:87] ==> value-parameter compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.<init>[ValueParameterDescriptorImpl]

'useLightAnalysis' @ [71:17] ==> public final val useLightAnalysis: Boolean defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[PropertyDescriptorImpl]

'super' @ [82:20] ==> <this> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[LazyClassReceiverParameterDescriptor]

'analysisCompleted' @ [82:26] ==> public open fun analysisCompleted(project: Project, module: ModuleDescriptor, bindingTrace: BindingTrace, files: Collection<KtFile>): AnalysisResult? defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'project' @ [82:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'module' @ [82:53] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingTrace' @ [82:61] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'files' @ [82:75] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'annotationProcessingClassLoader' @ [84:13] ==> private final var annotationProcessingClassLoader: URLClassLoader? defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[PropertyDescriptorImpl]

'close' @ [84:46] ==> public open fun close(): Unit defined in java.net.URLClassLoader[JavaMethodDescriptor]

'annotationProcessingClasspath' @ [89:25] ==> public final val annotationProcessingClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[PropertyDescriptorImpl]

'compileClasspath' @ [89:57] ==> public final val compileClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[PropertyDescriptorImpl]

'URLClassLoader' @ [90:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'classpath' @ [90:42] ==> val classpath: List<File> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors[LocalVariableDescriptor]

'map' @ [90:52] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [90:58] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [90:61] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [90:69] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [90:79] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'this' @ [91:9] ==> <this> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[LazyClassReceiverParameterDescriptor]

'annotationProcessingClassLoader' @ [91:14] ==> private final var annotationProcessingClassLoader: URLClassLoader? defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[PropertyDescriptorImpl]

'classLoader' @ [91:48] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors[LocalVariableDescriptor]

'load' @ [92:40] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(Processor..Processor?)>..Class<(Processor..Processor?)>?), p1: (ClassLoader..ClassLoader?)): (ServiceLoader<(Processor..Processor?)>..ServiceLoader<(Processor..Processor?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (javax.annotation.processing.Processor..javax.annotation.processing.Processor?)

'java' @ [92:62] ==> public val <T> KClass<Processor>.java: Class<Processor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Processor

'classLoader' @ [92:68] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors[LocalVariableDescriptor]

'toList' @ [92:81] ==> public fun <T> Iterable<(Processor..Processor?)>.toList(): List<(Processor..Processor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.annotation.processing.Processor..javax.annotation.processing.Processor?)

'if (processors.isEmpty()) {
            logger.info("No annotation processors available, aborting")
        } else {
            logger.info { "Annotation processors: " + processors.joinToString { it::class.java.canonicalName } }
        }' @ [94:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'processors' @ [94:13] ==> val processors: List<(Processor..Processor?)> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors[LocalVariableDescriptor]

'isEmpty' @ [94:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'logger' @ [95:13] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[PropertyDescriptorImpl]

'info' @ [95:20] ==> public final fun info(message: String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'logger' @ [97:13] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension[PropertyDescriptorImpl]

'info' @ [97:20] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'+' @ [97:27] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'processors' @ [97:55] ==> val processors: List<(Processor..Processor?)> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors[LocalVariableDescriptor]

'joinToString' @ [97:66] ==> public fun <T> Iterable<(Processor..Processor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((Processor..Processor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.annotation.processing.Processor..javax.annotation.processing.Processor?)

'it' @ [97:81] ==> value-parameter it: (Processor..Processor?) defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [97:91] ==> public val <T> KClass<out (Processor..Processor?)>.java: Class<out (Processor..Processor?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out (javax.annotation.processing.Processor..javax.annotation.processing.Processor?))

'canonicalName' @ [97:96] ==> public final val <T : (Any..Any?)> Class<out (Processor..Processor?)>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out (javax.annotation.processing.Processor..javax.annotation.processing.Processor?))

'processors' @ [100:16] ==> val processors: List<(Processor..Processor?)> defined in org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.loadProcessors[LocalVariableDescriptor]

'PartialAnalysisHandlerExtension' @ [120:5] ==> public constructor PartialAnalysisHandlerExtension() defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[DeserializedClassConstructorDescriptor]

'compileClasspath' @ [121:28] ==> value-parameter compileClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.<init>[ValueParameterDescriptorImpl]

'distinct' @ [121:45] ==> public fun <T> Iterable<File>.distinct(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'annotationProcessingClasspath' @ [122:41] ==> value-parameter annotationProcessingClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.<init>[ValueParameterDescriptorImpl]

'distinct' @ [122:71] ==> public fun <T> Iterable<File>.distinct(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'annotationProcessingComplete' @ [127:13] ==> private final var annotationProcessingComplete: Boolean defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'annotationProcessingComplete' @ [129:9] ==> private final var annotationProcessingComplete: Boolean defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'aptMode' @ [141:13] ==> public final val aptMode: AptMode defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'APT_ONLY' @ [141:24] ==> enum entry APT_ONLY defined in org.jetbrains.kotlin.kapt3.AptMode[FakeCallableDescriptorForObject]

'AnalysisResult' @ [142:20] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'EMPTY' @ [142:35] ==> public final val EMPTY: AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedPropertyDescriptor]

'super' @ [145:16] ==> <this> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[LazyClassReceiverParameterDescriptor]

'doAnalysis' @ [145:22] ==> public open fun doAnalysis(project: Project, module: ModuleDescriptor, projectContext: ProjectContext, files: Collection<KtFile>, bindingTrace: BindingTrace, componentProvider: ComponentProvider): AnalysisResult? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[DeserializedSimpleFunctionDescriptor]

'project' @ [145:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.doAnalysis[ValueParameterDescriptorImpl]

'module' @ [145:42] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.doAnalysis[ValueParameterDescriptorImpl]

'projectContext' @ [145:50] ==> value-parameter projectContext: ProjectContext defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.doAnalysis[ValueParameterDescriptorImpl]

'files' @ [145:66] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.doAnalysis[ValueParameterDescriptorImpl]

'bindingTrace' @ [145:73] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.doAnalysis[ValueParameterDescriptorImpl]

'componentProvider' @ [145:87] ==> value-parameter componentProvider: ComponentProvider defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.doAnalysis[ValueParameterDescriptorImpl]

'setAnnotationProcessingComplete' @ [154:13] ==> private final fun setAnnotationProcessingComplete(): Boolean defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'AnalysisResult' @ [156:35] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'success' @ [156:60] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor, shouldGenerateCode: Boolean): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [156:83] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'module' @ [156:90] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'logger' @ [158:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [158:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'-' @ [158:48] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'currentTimeMillis' @ [158:55] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'pluginInitializedTime' @ [158:77] ==> public final val pluginInitializedTime: Long defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'loadProcessors' @ [160:26] ==> protected abstract fun loadProcessors(): List<Processor> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'processors' @ [161:13] ==> val processors: List<Processor> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'isEmpty' @ [161:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (aptMode != WITH_COMPILATION) doNotGenerateCode() else null' @ [161:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnalysisResult?, elseBranch: AnalysisResult?): AnalysisResult?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnalysisResult?

'aptMode' @ [161:46] ==> public final val aptMode: AptMode defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'WITH_COMPILATION' @ [161:57] ==> enum entry WITH_COMPILATION defined in org.jetbrains.kotlin.kapt3.AptMode[FakeCallableDescriptorForObject]

'doNotGenerateCode' @ [161:75] ==> local final fun doNotGenerateCode(): AnalysisResult defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[SimpleFunctionDescriptorImpl]

'generateStubs' @ [163:27] ==> private final fun generateStubs(project: Project, module: ModuleDescriptor, context: BindingContext, files: Collection<KtFile>): KaptContext<*> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'project' @ [163:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'module' @ [163:50] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingTrace' @ [163:58] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingContext' @ [163:71] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'files' @ [163:87] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'runAnnotationProcessing' @ [166:13] ==> private final fun runAnnotationProcessing(kaptContext: KaptContext<*>, processors: List<Processor>): Unit defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'kaptContext' @ [166:37] ==> val kaptContext: KaptContext<*> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'processors' @ [166:50] ==> val processors: List<Processor> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'error' @ [168:37] ==> val error: KaptError defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'cause' @ [168:43] ==> public open val cause: Throwable? defined in org.jetbrains.kotlin.kapt3.diagnostic.KaptError[DeserializedPropertyDescriptor]

'error' @ [168:52] ==> val error: KaptError defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'AnalysisResult' @ [169:20] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'error' @ [169:35] ==> @JvmStatic public final fun error(bindingContext: BindingContext, error: Throwable): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'bindingTrace' @ [169:41] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingContext' @ [169:54] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'originalException' @ [169:70] ==> val originalException: Throwable defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'AnalysisResult' @ [171:20] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'error' @ [171:35] ==> @JvmStatic public final fun error(bindingContext: BindingContext, error: Throwable): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'bindingTrace' @ [171:41] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingContext' @ [171:54] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'thr' @ [171:70] ==> val thr: Throwable defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'kaptContext' @ [173:13] ==> val kaptContext: KaptContext<*> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[LocalVariableDescriptor]

'close' @ [173:25] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.kapt3.KaptContext[SimpleFunctionDescriptorImpl]

'if (aptMode != WITH_COMPILATION) {
            doNotGenerateCode()
        } else {
            AnalysisResult.RetryWithAdditionalJavaRoots(
                    bindingTrace.bindingContext,
                    module,
                    listOf(sourcesOutputDir),
                    addToEnvironment = true)
        }' @ [176:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnalysisResult?, elseBranch: AnalysisResult?): AnalysisResult?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnalysisResult?

'aptMode' @ [176:20] ==> public final val aptMode: AptMode defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'WITH_COMPILATION' @ [176:31] ==> enum entry WITH_COMPILATION defined in org.jetbrains.kotlin.kapt3.AptMode[FakeCallableDescriptorForObject]

'doNotGenerateCode' @ [177:13] ==> local final fun doNotGenerateCode(): AnalysisResult defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[SimpleFunctionDescriptorImpl]

'RetryWithAdditionalJavaRoots' @ [179:28] ==> public constructor RetryWithAdditionalJavaRoots(bindingContext: BindingContext, moduleDescriptor: ModuleDescriptor, additionalJavaRoots: List<File>, addToEnvironment: Boolean = ...) defined in org.jetbrains.kotlin.analyzer.AnalysisResult.RetryWithAdditionalJavaRoots[DeserializedClassConstructorDescriptor]

'bindingTrace' @ [180:21] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingContext' @ [180:34] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'module' @ [181:21] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted[ValueParameterDescriptorImpl]

'listOf' @ [182:21] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sourcesOutputDir' @ [182:28] ==> public final val sourcesOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'!' @ [188:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'aptMode' @ [188:14] ==> public final val aptMode: AptMode defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'generateStubs' @ [188:22] ==> public final val generateStubs: Boolean defined in org.jetbrains.kotlin.kapt3.AptMode[PropertyDescriptorImpl]

'KaptContext' @ [189:20] ==> public constructor KaptContext<out GState : GenerationState?>(logger: KaptLogger, project: Project, bindingContext: BindingContext, compiledClasses: List<ClassNode>, origins: Map<Any, JvmDeclarationOrigin>, generationState: Nothing?, processorOptions: Map<String, String>, javacOptions: Map<String, String> = ...) defined in org.jetbrains.kotlin.kapt3.KaptContext[ClassConstructorDescriptorImpl]
Inferred types:
    <out GState : GenerationState?> -> Nothing?

'logger' @ [189:32] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'project' @ [189:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs[ValueParameterDescriptorImpl]

'EMPTY' @ [189:64] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'emptyList' @ [189:71] ==> public fun <T> emptyList(): List<ClassNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'emptyMap' @ [189:84] ==> public fun <K, V> emptyMap(): Map<Any, JvmDeclarationOrigin> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any
    <V> -> JvmDeclarationOrigin

'options' @ [189:102] ==> public final val options: Map<String, String> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'javacOptions' @ [189:111] ==> public final val javacOptions: Map<String, String> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'logger' @ [192:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [192:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'+' @ [192:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'files' @ [192:53] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs[ValueParameterDescriptorImpl]

'map' @ [192:59] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> String

'it' @ [192:65] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [192:68] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'name' @ [192:81] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'it' @ [192:103] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hashCode' @ [192:106] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.psi.KtFile[DeserializedSimpleFunctionDescriptor]

'compileStubs' @ [194:16] ==> private final fun compileStubs(project: Project, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>): KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'project' @ [194:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs[ValueParameterDescriptorImpl]

'module' @ [194:38] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs[ValueParameterDescriptorImpl]

'context' @ [194:46] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs[ValueParameterDescriptorImpl]

'files' @ [194:55] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs[ValueParameterDescriptorImpl]

'toList' @ [194:61] ==> public fun <T> Iterable<KtFile>.toList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'apply' @ [194:71] ==> @InlineOnly public inline fun <T> KaptContext<GenerationState>.apply(block: KaptContext<GenerationState>.() -> Unit): KaptContext<GenerationState> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KaptContext<GenerationState>

'generateKotlinSourceStubs' @ [195:13] ==> private final fun generateKotlinSourceStubs(kaptContext: KaptContext<GenerationState>): Unit defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'this' @ [195:39] ==> <this> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateStubs.<anonymous>[ReceiverParameterDescriptorImpl]

'!' @ [200:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'aptMode' @ [200:14] ==> public final val aptMode: AptMode defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'runAnnotationProcessing' @ [200:22] ==> public final val runAnnotationProcessing: Boolean defined in org.jetbrains.kotlin.kapt3.AptMode[PropertyDescriptorImpl]

'collectJavaSourceFiles' @ [202:31] ==> private final fun collectJavaSourceFiles(): List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'component1' @ [204:14] ==> public final operator fun component1(): Long defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'measureTimeMillis' @ [204:42] ==> private inline fun <T> measureTimeMillis(block: () -> Unit): Pair<Long, Unit> defined in org.jetbrains.kotlin.kapt3[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'kaptContext' @ [205:13] ==> value-parameter kaptContext: KaptContext<*> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.runAnnotationProcessing[ValueParameterDescriptorImpl]

'doAnnotationProcessing' @ [205:25] ==> public fun KaptContext<*>.doAnnotationProcessing(javaSourceFiles: List<File>, processors: List<Processor>, compileClasspath: List<File>, annotationProcessingClasspath: List<File>, annotationProcessors: String, sourcesOutputDir: File, classesOutputDir: File, additionalSources: List<JCTree.JCCompilationUnit> = ..., withJdk: Boolean = ...): Unit defined in org.jetbrains.kotlin.kapt3 in file annotationProcessing.kt[SimpleFunctionDescriptorImpl]

'javaSourceFiles' @ [206:21] ==> val javaSourceFiles: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.runAnnotationProcessing[LocalVariableDescriptor]

'processors' @ [206:38] ==> value-parameter processors: List<Processor> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.runAnnotationProcessing[ValueParameterDescriptorImpl]

'compileClasspath' @ [206:50] ==> public final val compileClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'annotationProcessingClasspath' @ [206:68] ==> public final val annotationProcessingClasspath: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'annotationProcessors' @ [207:21] ==> public final val annotationProcessors: String defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'sourcesOutputDir' @ [207:43] ==> public final val sourcesOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'classFilesOutputDir' @ [207:61] ==> public final val classFilesOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'logger' @ [210:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [210:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'annotationProcessingTime' @ [210:52] ==> val annotationProcessingTime: Long defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.runAnnotationProcessing[LocalVariableDescriptor]

'Kapt3BuilderFactory' @ [219:30] ==> public constructor Kapt3BuilderFactory() defined in org.jetbrains.kotlin.kapt3.Kapt3BuilderFactory[ClassConstructorDescriptorImpl]

'TargetId' @ [221:24] ==> public constructor TargetId(name: String, type: String) defined in org.jetbrains.kotlin.modules.TargetId[DeserializedClassConstructorDescriptor]

'compilerConfiguration' @ [222:24] ==> public final val compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'MODULE_NAME' @ [222:70] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'module' @ [222:86] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[ValueParameterDescriptorImpl]

'name' @ [222:93] ==> public final val ModuleDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [222:98] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'GenerationState' @ [225:31] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'project' @ [226:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[ValueParameterDescriptorImpl]

'builderFactory' @ [227:17] ==> val builderFactory: Kapt3BuilderFactory defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'module' @ [228:17] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[ValueParameterDescriptorImpl]

'bindingContext' @ [229:17] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[ValueParameterDescriptorImpl]

'files' @ [230:17] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[ValueParameterDescriptorImpl]

'compilerConfiguration' @ [231:17] ==> public final val compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'targetId' @ [232:28] ==> val targetId: TargetId defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'component1' @ [234:14] ==> public final operator fun component1(): Long defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'measureTimeMillis' @ [234:43] ==> private inline fun <T> measureTimeMillis(block: () -> Unit): Pair<Long, Unit> defined in org.jetbrains.kotlin.kapt3[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'compileCorrectFiles' @ [235:33] ==> public open fun compileCorrectFiles(@NotNull p0: GenerationState, @NotNull p1: CompilationErrorHandler): Unit defined in org.jetbrains.kotlin.codegen.KotlinCodegenFacade[JavaMethodDescriptor]

'generationState' @ [235:53] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'THROW_EXCEPTION' @ [235:94] ==> public final val THROW_EXCEPTION: (CompilationErrorHandler..CompilationErrorHandler?) defined in org.jetbrains.kotlin.codegen.CompilationErrorHandler[JavaPropertyDescriptor]

'builderFactory' @ [238:31] ==> val builderFactory: Kapt3BuilderFactory defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'compiledClasses' @ [238:46] ==> internal final val compiledClasses: MutableList<ClassNode> defined in org.jetbrains.kotlin.kapt3.Kapt3BuilderFactory[PropertyDescriptorImpl]

'builderFactory' @ [239:23] ==> val builderFactory: Kapt3BuilderFactory defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'origins' @ [239:38] ==> internal final val origins: MutableMap<Any, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.kapt3.Kapt3BuilderFactory[PropertyDescriptorImpl]

'logger' @ [241:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [241:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'classFilesCompilationTime' @ [241:48] ==> val classFilesCompilationTime: Long defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'logger' @ [242:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [242:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'+' @ [242:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'compiledClasses' @ [242:46] ==> val compiledClasses: MutableList<ClassNode> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'joinToString' @ [242:62] ==> public fun <T> Iterable<ClassNode>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((ClassNode) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'it' @ [242:77] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [242:80] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'KaptContext' @ [244:16] ==> public constructor KaptContext<out GState : GenerationState?>(logger: KaptLogger, project: Project, bindingContext: BindingContext, compiledClasses: List<ClassNode>, origins: Map<Any, JvmDeclarationOrigin>, generationState: GenerationState, processorOptions: Map<String, String>, javacOptions: Map<String, String> = ...) defined in org.jetbrains.kotlin.kapt3.KaptContext[ClassConstructorDescriptorImpl]
Inferred types:
    <out GState : GenerationState?> -> GenerationState

'logger' @ [244:28] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'project' @ [244:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[ValueParameterDescriptorImpl]

'bindingContext' @ [244:45] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[ValueParameterDescriptorImpl]

'compiledClasses' @ [244:61] ==> val compiledClasses: MutableList<ClassNode> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'origins' @ [244:78] ==> val origins: MutableMap<Any, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'generationState' @ [244:87] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.compileStubs[LocalVariableDescriptor]

'options' @ [244:104] ==> public final val options: Map<String, String> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'javacOptions' @ [244:113] ==> public final val javacOptions: Map<String, String> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'ClassFileToSourceStubConverter' @ [248:25] ==> public constructor ClassFileToSourceStubConverter(kaptContext: KaptContext<GenerationState>, generateNonExistentClass: Boolean, correctErrorTypes: Boolean) defined in org.jetbrains.kotlin.kapt3.stubs.ClassFileToSourceStubConverter[ClassConstructorDescriptorImpl]

'kaptContext' @ [248:56] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs[ValueParameterDescriptorImpl]

'correctErrorTypes' @ [248:122] ==> public final val correctErrorTypes: Boolean defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'component1' @ [250:14] ==> public final operator fun component1(): Long defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [250:34] ==> public final operator fun component2(): List<JCTree.JCCompilationUnit> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'measureTimeMillis' @ [250:55] ==> private inline fun <T> measureTimeMillis(block: () -> List<JCTree.JCCompilationUnit>): Pair<Long, List<JCTree.JCCompilationUnit>> defined in org.jetbrains.kotlin.kapt3[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<JCCompilationUnit>

'converter' @ [251:13] ==> val converter: ClassFileToSourceStubConverter defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs[LocalVariableDescriptor]

'convert' @ [251:23] ==> public final fun convert(): List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.stubs.ClassFileToSourceStubConverter[SimpleFunctionDescriptorImpl]

'logger' @ [254:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [254:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'stubGenerationTime' @ [254:51] ==> val stubGenerationTime: Long defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs[LocalVariableDescriptor]

'logger' @ [255:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [255:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'+' @ [255:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'kotlinSourceStubs' @ [255:54] ==> val kotlinSourceStubs: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs[LocalVariableDescriptor]

'joinToString' @ [255:72] ==> public fun <T> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)

'it' @ [255:87] ==> value-parameter it: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sourcefile' @ [255:90] ==> public final var sourcefile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.tree.JCTree.JCCompilationUnit[JavaPropertyDescriptor]

'name' @ [255:101] ==> public final val JavaFileObject.name: (String..String?)[MyPropertyDescriptor]

'saveStubs' @ [257:9] ==> protected open fun saveStubs(stubs: List<JCTree.JCCompilationUnit>): Unit defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'kotlinSourceStubs' @ [257:19] ==> val kotlinSourceStubs: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs[LocalVariableDescriptor]

'saveIncrementalData' @ [258:9] ==> protected open fun saveIncrementalData(kaptContext: KaptContext<GenerationState>, messageCollector: MessageCollector, converter: ClassFileToSourceStubConverter): Unit defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[SimpleFunctionDescriptorImpl]

'kaptContext' @ [258:29] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs[ValueParameterDescriptorImpl]

'logger' @ [258:42] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'messageCollector' @ [258:49] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[PropertyDescriptorImpl]

'converter' @ [258:67] ==> val converter: ClassFileToSourceStubConverter defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.generateKotlinSourceStubs[LocalVariableDescriptor]

'javaSourceRoots' @ [262:45] ==> public final val javaSourceRoots: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'stubsOutputDir' @ [262:63] ==> public final val stubsOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'flatMap' @ [262:79] ==> public inline fun <T, R> Iterable<File>.flatMap(transform: (File) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'root' @ [263:21] ==> value-parameter root: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.collectJavaSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'walk' @ [263:26] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [263:33] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [263:42] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.collectJavaSourceFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [263:45] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'it' @ [263:55] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.collectJavaSourceFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [263:58] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toList' @ [263:80] ==> public fun <T> Sequence<File>.toList(): List<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'logger' @ [265:9] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'info' @ [265:16] ==> public final inline fun info(message: () -> String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'+' @ [265:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'javaFilesFromJavaSourceRoots' @ [265:47] ==> val javaFilesFromJavaSourceRoots: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.collectJavaSourceFiles[LocalVariableDescriptor]

'joinToString' @ [265:76] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [265:91] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.collectJavaSourceFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [265:94] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'javaFilesFromJavaSourceRoots' @ [267:16] ==> val javaFilesFromJavaSourceRoots: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.collectJavaSourceFiles[LocalVariableDescriptor]

'stubs' @ [271:22] ==> value-parameter stubs: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[ValueParameterDescriptorImpl]

'stub' @ [272:30] ==> val stub: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'defs' @ [272:35] ==> public final var defs: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?) defined in com.sun.tools.javac.tree.JCTree.JCCompilationUnit[JavaPropertyDescriptor]

'first' @ [272:40] ==> public inline fun <T> Iterable<(JCTree..JCTree?)>.first(predicate: ((JCTree..JCTree?)) -> Boolean): (JCTree..JCTree?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)

'it' @ [272:48] ==> value-parameter it: (JCTree..JCTree?) defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [272:98] ==> public final val JCTree.JCClassDecl.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [272:109] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'stub' @ [274:31] ==> val stub: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'packageName' @ [274:36] ==> public final val JCTree.JCCompilationUnit.packageName: (JCTree.JCExpression..JCTree.JCExpression?)[MyPropertyDescriptor]

'toString' @ [274:49] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCExpression[JavaMethodDescriptor]

'if (packageName.isEmpty()) stubsOutputDir else File(stubsOutputDir, packageName.replace('.', '/'))' @ [275:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'packageName' @ [275:34] ==> val packageName: String defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'isEmpty' @ [275:46] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'stubsOutputDir' @ [275:57] ==> public final val stubsOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'File' @ [275:77] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'stubsOutputDir' @ [275:82] ==> public final val stubsOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'packageName' @ [275:98] ==> val packageName: String defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'replace' @ [275:110] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packageDir' @ [276:13] ==> val packageDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'mkdirs' @ [276:24] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'File' @ [277:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'packageDir' @ [277:18] ==> val packageDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'className' @ [277:30] ==> val className: String defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'writeText' @ [277:51] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stub' @ [277:61] ==> val stub: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveStubs[LocalVariableDescriptor]

'toString' @ [277:66] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCCompilationUnit[JavaMethodDescriptor]

'this' @ [285:40] ==> <this> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[LazyClassReceiverParameterDescriptor]

'incrementalDataOutputDir' @ [285:45] ==> public final val incrementalDataOutputDir: File? defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'kaptContext' @ [287:33] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData[ValueParameterDescriptorImpl]

'generationState' @ [287:45] ==> public final val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'configuration' @ [287:61] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'getBoolean' @ [287:75] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'REPORT_OUTPUT_FILES' @ [287:110] ==> @field:JvmField public final val REPORT_OUTPUT_FILES: CompilerConfigurationKey<Boolean> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'kaptContext' @ [288:9] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData[ValueParameterDescriptorImpl]

'generationState' @ [288:21] ==> public final val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'factory' @ [288:37] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'writeAll' @ [288:45] ==> public fun OutputFileCollection.writeAll(outputDir: File, report: ((file: OutputFile, sources: List<File>, output: File) -> Unit)?): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils[DeserializedSimpleFunctionDescriptor]

'incrementalDataOutputDir' @ [289:17] ==> val incrementalDataOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData[LocalVariableDescriptor]

'if (!reportOutputFiles) null else fun(file: OutputFile, sources: List<File>, output: File) {
                    val stubFileObject = converter.bindings[file.relativePath.substringBeforeLast(".class", missingDelimiterValue = "")]
                    if (stubFileObject != null) {
                        val stubFile = File(stubsOutputDir, stubFileObject.name)
                        if (stubFile.exists()) {
                            messageCollector.report(OUTPUT, OutputMessageUtil.formatOutputMessage(sources, stubFile))
                        }
                    }

                    messageCollector.report(OUTPUT, OutputMessageUtil.formatOutputMessage(sources, output))
                }' @ [290:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ((OutputFile, List<File>, File) -> Unit)?, elseBranch: ((OutputFile, List<File>, File) -> Unit)?): ((OutputFile, List<File>, File) -> Unit)?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function3<OutputFile, List<File>, File, Unit>?

'!' @ [290:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'reportOutputFiles' @ [290:22] ==> val reportOutputFiles: Boolean defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData[LocalVariableDescriptor]

'converter' @ [291:42] ==> value-parameter converter: ClassFileToSourceStubConverter defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData[ValueParameterDescriptorImpl]

'bindings' @ [291:52] ==> public final val bindings: Map<String, KaptJavaFileObject> defined in org.jetbrains.kotlin.kapt3.stubs.ClassFileToSourceStubConverter[PropertyDescriptorImpl]

'file' @ [291:61] ==> value-parameter file: OutputFile defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[ValueParameterDescriptorImpl]

'relativePath' @ [291:66] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'substringBeforeLast' @ [291:79] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'stubFileObject' @ [292:25] ==> val stubFileObject: KaptJavaFileObject? defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[LocalVariableDescriptor]

'File' @ [293:40] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'stubsOutputDir' @ [293:45] ==> public final val stubsOutputDir: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension[PropertyDescriptorImpl]

'stubFileObject' @ [293:61] ==> val stubFileObject: KaptJavaFileObject? defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[LocalVariableDescriptor]

'name' @ [293:76] ==> public final val KaptJavaFileObject.name: String[MyPropertyDescriptor]

'stubFile' @ [294:29] ==> val stubFile: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[LocalVariableDescriptor]

'exists' @ [294:38] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'messageCollector' @ [295:29] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData[ValueParameterDescriptorImpl]

'report' @ [295:46] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'OUTPUT' @ [295:53] ==> enum entry OUTPUT defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'formatOutputMessage' @ [295:79] ==> @NotNull public open fun formatOutputMessage(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: (File..File?)): String defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'sources' @ [295:99] ==> value-parameter sources: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[ValueParameterDescriptorImpl]

'stubFile' @ [295:108] ==> val stubFile: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[LocalVariableDescriptor]

'messageCollector' @ [299:21] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData[ValueParameterDescriptorImpl]

'report' @ [299:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'OUTPUT' @ [299:45] ==> enum entry OUTPUT defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'formatOutputMessage' @ [299:71] ==> @NotNull public open fun formatOutputMessage(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: (File..File?)): String defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'sources' @ [299:91] ==> value-parameter sources: List<File> defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[ValueParameterDescriptorImpl]

'output' @ [299:100] ==> value-parameter output: File defined in org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.saveIncrementalData.<no name provided>[ValueParameterDescriptorImpl]

'currentTimeMillis' @ [308:24] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'invoke' @ [309:18] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'Pair' @ [310:12] ==> public constructor Pair<out A, out B>(first: Long, second: T) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Long
    <out B> -> T

'-' @ [310:17] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'currentTimeMillis' @ [310:24] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'start' @ [310:46] ==> val start: Long defined in org.jetbrains.kotlin.kapt3.measureTimeMillis[LocalVariableDescriptor]

'result' @ [310:53] ==> val result: T defined in org.jetbrains.kotlin.kapt3.measureTimeMillis[LocalVariableDescriptor]

