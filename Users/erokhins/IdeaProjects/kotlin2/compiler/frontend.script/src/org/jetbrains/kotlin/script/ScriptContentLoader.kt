'BasicScriptContents' @ [35:15] ==> public constructor BasicScriptContents(virtualFile: VirtualFile, getAnnotations: () -> Iterable<Annotation>) defined in org.jetbrains.kotlin.script.ScriptContentLoader.BasicScriptContents[ClassConstructorDescriptorImpl]

'file' @ [35:35] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.getScriptContents[ValueParameterDescriptorImpl]

'loadAnnotations' @ [35:60] ==> private final fun loadAnnotations(scriptDefinition: KotlinScriptDefinition, file: VirtualFile): List<Annotation> defined in org.jetbrains.kotlin.script.ScriptContentLoader[SimpleFunctionDescriptorImpl]

'scriptDefinition' @ [35:76] ==> value-parameter scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.getScriptContents[ValueParameterDescriptorImpl]

'file' @ [35:94] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.getScriptContents[ValueParameterDescriptorImpl]

'scriptDefinition' @ [38:27] ==> value-parameter scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations[ValueParameterDescriptorImpl]

'template' @ [38:44] ==> public final val template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'java' @ [38:53] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'classLoader' @ [38:58] ==> public final val <T : (Any..Any?)> Class<out Any>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'getAnnotationEntries' @ [40:16] ==> private final fun getAnnotationEntries(file: VirtualFile, project: Project): Iterable<KtAnnotationEntry> defined in org.jetbrains.kotlin.script.ScriptContentLoader[SimpleFunctionDescriptorImpl]

'file' @ [40:37] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations[ValueParameterDescriptorImpl]

'project' @ [40:43] ==> private final val project: Project defined in org.jetbrains.kotlin.script.ScriptContentLoader[PropertyDescriptorImpl]

'mapNotNull' @ [41:18] ==> public inline fun <T, R : Any> Iterable<KtAnnotationEntry>.mapNotNull(transform: (KtAnnotationEntry) -> Annotation?): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R : Any> -> Annotation

'scriptDefinition' @ [43:21] ==> value-parameter scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations[ValueParameterDescriptorImpl]

'acceptedAnnotations' @ [43:38] ==> public open val acceptedAnnotations: List<KClass<out Annotation>> defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'find' @ [43:58] ==> @InlineOnly public inline fun <T> Iterable<KClass<out Annotation>>.find(predicate: (KClass<out Annotation>) -> Boolean): KClass<out Annotation>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<out Annotation>

'psiAnn' @ [44:25] ==> value-parameter psiAnn: KtAnnotationEntry defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'typeName' @ [44:32] ==> internal val KtAnnotationEntry.typeName: String defined in org.jetbrains.kotlin.script in file scriptAnnotationsPreprocessing.kt[PropertyDescriptorImpl]

'let' @ [44:41] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'it' @ [44:47] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ann' @ [44:53] ==> value-parameter ann: KClass<out Annotation> defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [44:57] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'it' @ [44:71] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ann' @ [44:77] ==> value-parameter ann: KClass<out Annotation> defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [44:81] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'let' @ [45:24] ==> @InlineOnly public inline fun <T, R> KClass<out Annotation>.let(block: (KClass<out Annotation>) -> Annotation): Annotation defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<out Annotation>
    <R> -> Annotation

'constructAnnotation' @ [45:30] ==> internal fun constructAnnotation(psi: KtAnnotationEntry, targetClass: KClass<out Annotation>): Annotation defined in org.jetbrains.kotlin.script[SimpleFunctionDescriptorImpl]

'psiAnn' @ [45:50] ==> value-parameter psiAnn: KtAnnotationEntry defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'classLoader' @ [45:58] ==> val classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations[LocalVariableDescriptor]

'loadClass' @ [45:70] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'it' @ [45:80] ==> value-parameter it: KClass<out Annotation> defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [45:83] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'kotlin' @ [45:98] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'?:' @ [50:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile

'getInstance' @ [50:43] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [50:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.script.ScriptContentLoader.getAnnotationEntries[ValueParameterDescriptorImpl]

'findFile' @ [50:64] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'file' @ [50:73] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.getAnnotationEntries[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [51:41] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'file' @ [51:93] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.getAnnotationEntries[ValueParameterDescriptorImpl]

'canonicalPath' @ [51:98] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'?:' @ [52:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Iterable<KtAnnotationEntry>?, right: Iterable<KtAnnotationEntry>): Iterable<KtAnnotationEntry>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Iterable<KtAnnotationEntry>

'psiFile' @ [52:17] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.getAnnotationEntries[LocalVariableDescriptor]

'annotationEntries' @ [52:38] ==> public final val KtFile.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'IllegalArgumentException' @ [53:25] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'file' @ [53:95] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.getAnnotationEntries[ValueParameterDescriptorImpl]

'name' @ [53:100] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'file' @ [53:109] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.getAnnotationEntries[ValueParameterDescriptorImpl]

'fileType' @ [53:114] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'File' @ [57:35] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'virtualFile' @ [57:40] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.BasicScriptContents.<init>[ValueParameterDescriptorImpl]

'path' @ [57:52] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'lazy' @ [58:59] ==> public fun <T> lazy(initializer: () -> Iterable<Annotation>): Lazy<Iterable<Annotation>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Iterable<Annotation>

'invoke' @ [58:66] ==> public abstract operator fun invoke(): Iterable<Annotation> defined in kotlin.Function0[FunctionInvokeDescriptor]

'lazy' @ [59:45] ==> public fun <T> lazy(initializer: () -> String): Lazy<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'virtualFile' @ [59:52] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.BasicScriptContents.<init>[ValueParameterDescriptorImpl]

'inputStream' @ [59:64] ==> public final val VirtualFile.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'reader' @ [59:76] ==> @InlineOnly public inline fun InputStream.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'virtualFile' @ [59:93] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.BasicScriptContents.<init>[ValueParameterDescriptorImpl]

'charset' @ [59:105] ==> public final var VirtualFile.charset: Charset[MyPropertyDescriptor]

'readText' @ [59:114] ==> public fun Reader.readText(): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getScriptContents' @ [66:30] ==> public final fun getScriptContents(scriptDefinition: KotlinScriptDefinition, file: VirtualFile): ScriptContentLoader.BasicScriptContents defined in org.jetbrains.kotlin.script.ScriptContentLoader[SimpleFunctionDescriptorImpl]

'scriptDef' @ [66:48] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[ValueParameterDescriptorImpl]

'file' @ [66:59] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[ValueParameterDescriptorImpl]

'getEnvironment' @ [67:27] ==> public final fun getEnvironment(scriptDef: KotlinScriptDefinition): Map<String, Any?> defined in org.jetbrains.kotlin.script.ScriptContentLoader[SimpleFunctionDescriptorImpl]

'scriptDef' @ [67:42] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[ValueParameterDescriptorImpl]

'scriptDef' @ [69:13] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[ValueParameterDescriptorImpl]

'dependencyResolver' @ [69:23] ==> public open val dependencyResolver: DependenciesResolver defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'resolve' @ [69:42] ==> public abstract fun resolve(scriptContents: ScriptContents, environment: Environment /* = Map<String, Any?> */): DependenciesResolver.ResolveResult defined in kotlin.script.experimental.dependencies.DependenciesResolver[DeserializedSimpleFunctionDescriptor]

'scriptContents' @ [70:21] ==> val scriptContents: ScriptContentLoader.BasicScriptContents defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[LocalVariableDescriptor]

'environment' @ [71:21] ==> val environment: Map<String, Any?> defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[LocalVariableDescriptor]

'e' @ [75:13] ==> val e: Throwable defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[LocalVariableDescriptor]

'asResolveFailure' @ [75:15] ==> public fun Throwable.asResolveFailure(scriptDef: KotlinScriptDefinition): DependenciesResolver.ResolveResult.Failure defined in org.jetbrains.kotlin.script in file ScriptContentLoader.kt[SimpleFunctionDescriptorImpl]

'scriptDef' @ [75:32] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[ValueParameterDescriptorImpl]

'getService' @ [77:24] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ScriptReportSink..ScriptReportSink?)>): (ScriptReportSink..ScriptReportSink?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptReportSink

'project' @ [77:35] ==> private final val project: Project defined in org.jetbrains.kotlin.script.ScriptContentLoader[PropertyDescriptorImpl]

'java' @ [77:68] ==> public val <T> KClass<ScriptReportSink>.java: Class<ScriptReportSink> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptReportSink

'attachReports' @ [77:75] ==> public abstract fun attachReports(scriptFile: VirtualFile, reports: List<ScriptReport>): Unit defined in org.jetbrains.kotlin.script.ScriptReportSink[SimpleFunctionDescriptorImpl]

'file' @ [77:89] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[ValueParameterDescriptorImpl]

'result' @ [77:95] ==> val result: DependenciesResolver.ResolveResult defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[LocalVariableDescriptor]

'reports' @ [77:102] ==> public abstract val reports: List<ScriptReport> defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult[DeserializedPropertyDescriptor]

'result' @ [78:16] ==> val result: DependenciesResolver.ResolveResult defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[LocalVariableDescriptor]

'dependencies' @ [78:23] ==> public abstract val dependencies: ScriptDependencies? defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult[DeserializedPropertyDescriptor]

'adjustByDefinition' @ [78:37] ==> public fun ScriptDependencies.adjustByDefinition(scriptDef: KotlinScriptDefinition): ScriptDependencies defined in org.jetbrains.kotlin.script in file ScriptContentLoader.kt[SimpleFunctionDescriptorImpl]

'scriptDef' @ [78:56] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.loadContentsAndResolveDependencies[ValueParameterDescriptorImpl]

'scriptDef' @ [82:14] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.ScriptContentLoader.getEnvironment[ValueParameterDescriptorImpl]

'environment' @ [82:74] ==> public final val environment: Map<String, Any?>? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[PropertyDescriptorImpl]

'orEmpty' @ [82:86] ==> @InlineOnly public inline fun <K, V> Map<String, Any?>?.orEmpty(): Map<String, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any?

'?:' @ [88:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<File>?, right: List<File>): List<File>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<File>

'scriptDef' @ [88:32] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.adjustByDefinition[ValueParameterDescriptorImpl]

'templateClasspath' @ [88:92] ==> public final val templateClasspath: List<File> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[PropertyDescriptorImpl]

'this' @ [88:120] ==> <this> defined in org.jetbrains.kotlin.script.adjustByDefinition[ReceiverParameterDescriptorImpl]

'additionalClasspath' @ [89:9] ==> val additionalClasspath: List<File> defined in org.jetbrains.kotlin.script.adjustByDefinition[LocalVariableDescriptor]

'isEmpty' @ [89:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'this' @ [89:47] ==> <this> defined in org.jetbrains.kotlin.script.adjustByDefinition[ReceiverParameterDescriptorImpl]

'copy' @ [90:12] ==> public final fun copy(javaHome: File? = ..., classpath: List<File> = ..., imports: List<String> = ..., sources: List<File> = ..., scripts: List<File> = ...): ScriptDependencies defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedSimpleFunctionDescriptor]

'additionalClasspath' @ [90:29] ==> val additionalClasspath: List<File> defined in org.jetbrains.kotlin.script.adjustByDefinition[LocalVariableDescriptor]

'classpath' @ [90:51] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'scriptDef' @ [94:21] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.asResolveFailure[ValueParameterDescriptorImpl]

'dependencyResolver' @ [94:31] ==> public open val dependencyResolver: DependenciesResolver defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'simpleName' @ [94:57] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'this' @ [94:87] ==> <this> defined in org.jetbrains.kotlin.script.asResolveFailure[ReceiverParameterDescriptorImpl]

'simpleName' @ [94:99] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'Failure' @ [95:12] ==> public constructor Failure(vararg reports: ScriptReport) defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult.Failure[DeserializedClassConstructorDescriptor]

'ScriptReport' @ [95:20] ==> public constructor ScriptReport(message: String, severity: ScriptReport.Severity = ..., position: ScriptReport.Position? = ...) defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedClassConstructorDescriptor]

'prefix' @ [95:33] ==> val prefix: String defined in org.jetbrains.kotlin.script.asResolveFailure[LocalVariableDescriptor]

'message' @ [95:43] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

