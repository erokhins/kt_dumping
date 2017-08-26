'Suppress' @ [17:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [30:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ArrayList' @ [38:23] ==> public final fun <E> <init>(): ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> ScriptReport

'legacyResolver' @ [39:26] ==> public final val legacyResolver: ScriptDependenciesResolver defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper[PropertyDescriptorImpl]

'resolve' @ [39:41] ==> public open fun resolve(script: ScriptContents, environment: Map<String, Any?>?, report: (ScriptDependenciesResolver.ReportSeverity, String, ScriptContents.Position?) -> Unit, previousDependencies: KotlinScriptExternalDependencies?): Future<KotlinScriptExternalDependencies?> defined in org.jetbrains.kotlin.script.ScriptDependenciesResolver[SimpleFunctionDescriptorImpl]

'scriptContents' @ [41:54] ==> value-parameter scriptContents: ScriptContents defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[ValueParameterDescriptorImpl]

'file' @ [41:69] ==> public abstract val file: File? defined in kotlin.script.dependencies.ScriptContents[DeserializedPropertyDescriptor]

'scriptContents' @ [42:76] ==> value-parameter scriptContents: ScriptContents defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[ValueParameterDescriptorImpl]

'annotations' @ [42:91] ==> public abstract val annotations: Iterable<Annotation> defined in kotlin.script.dependencies.ScriptContents[DeserializedPropertyDescriptor]

'scriptContents' @ [43:62] ==> value-parameter scriptContents: ScriptContents defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[ValueParameterDescriptorImpl]

'text' @ [43:77] ==> public abstract val text: CharSequence? defined in kotlin.script.dependencies.ScriptContents[DeserializedPropertyDescriptor]

'environment' @ [45:17] ==> value-parameter environment: Environment /* = Map<String, Any?> */ defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[ValueParameterDescriptorImpl]

'reports' @ [47:21] ==> val reports: ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'add' @ [47:29] ==> public open fun add(element: ScriptReport): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ScriptReport' @ [47:33] ==> public constructor ScriptReport(message: String, severity: ScriptReport.Severity = ..., position: ScriptReport.Position? = ...) defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedClassConstructorDescriptor]

'msg' @ [47:46] ==> value-parameter msg: String defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve.<anonymous>[ValueParameterDescriptorImpl]

'sev' @ [47:51] ==> value-parameter sev: ScriptDependenciesResolver.ReportSeverity defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve.<anonymous>[ValueParameterDescriptorImpl]

'convertSeverity' @ [47:55] ==> private final fun ScriptDependenciesResolver.ReportSeverity.convertSeverity(): ScriptReport.Severity defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper[SimpleFunctionDescriptorImpl]

'pos' @ [47:74] ==> value-parameter pos: ScriptContents.Position? defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve.<anonymous>[ValueParameterDescriptorImpl]

'convertPosition' @ [47:79] ==> private final fun ScriptContents.Position.convertPosition(): ScriptReport.Position defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper[SimpleFunctionDescriptorImpl]

'get' @ [49:11] ==> public abstract fun get(): KotlinScriptExternalDependencies? defined in java.util.concurrent.Future[JavaMethodDescriptor]

'Failure' @ [49:62] ==> public constructor Failure(reports: List<ScriptReport>) defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult.Failure[DeserializedClassConstructorDescriptor]

'reports' @ [49:70] ==> val reports: ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'ScriptDependencies' @ [51:28] ==> public constructor ScriptDependencies(javaHome: File? = ..., classpath: List<File> = ..., imports: List<String> = ..., sources: List<File> = ..., scripts: List<File> = ...) defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedClassConstructorDescriptor]

'legacyDeps' @ [52:28] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'javaHome' @ [52:39] ==> public open val javaHome: String? defined in org.jetbrains.kotlin.script.KotlinScriptExternalDependencies[PropertyDescriptorImpl]

'let' @ [52:49] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [52:55] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'legacyDeps' @ [53:29] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'classpath' @ [53:40] ==> public open val classpath: Iterable<File> defined in org.jetbrains.kotlin.script.KotlinScriptExternalDependencies[PropertyDescriptorImpl]

'toList' @ [53:50] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'legacyDeps' @ [54:27] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'imports' @ [54:38] ==> public open val imports: Iterable<String> defined in org.jetbrains.kotlin.script.KotlinScriptExternalDependencies[PropertyDescriptorImpl]

'toList' @ [54:46] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'legacyDeps' @ [55:27] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'sources' @ [55:38] ==> public open val sources: Iterable<File> defined in org.jetbrains.kotlin.script.KotlinScriptExternalDependencies[PropertyDescriptorImpl]

'toList' @ [55:46] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'legacyDeps' @ [56:27] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'scripts' @ [56:38] ==> public open val scripts: Iterable<File> defined in org.jetbrains.kotlin.script.KotlinScriptExternalDependencies[PropertyDescriptorImpl]

'toList' @ [56:46] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'Success' @ [58:51] ==> public constructor Success(dependencies: ScriptDependencies, reports: List<ScriptReport> = ...) defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult.Success[DeserializedClassConstructorDescriptor]

'dependencies' @ [58:59] ==> val dependencies: ScriptDependencies defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'reports' @ [58:73] ==> val reports: ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'when(this) {
        ScriptDependenciesResolver.ReportSeverity.ERROR -> ScriptReport.Severity.ERROR
        ScriptDependenciesResolver.ReportSeverity.WARNING -> ScriptReport.Severity.WARNING
        ScriptDependenciesResolver.ReportSeverity.INFO -> ScriptReport.Severity.INFO
        ScriptDependenciesResolver.ReportSeverity.DEBUG -> ScriptReport.Severity.DEBUG
    }' @ [61:103] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ScriptReport.Severity, entry1: ScriptReport.Severity, entry2: ScriptReport.Severity, entry3: ScriptReport.Severity): ScriptReport.Severity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Severity

'this' @ [61:108] ==> <this> defined in org.jetbrains.kotlin.script.LegacyPackageDependencyResolverWrapper.convertSeverity[ReceiverParameterDescriptorImpl]

'ERROR' @ [62:51] ==> enum entry ERROR defined in org.jetbrains.kotlin.script.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [62:82] ==> enum entry ERROR defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'WARNING' @ [63:51] ==> enum entry WARNING defined in org.jetbrains.kotlin.script.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [63:84] ==> enum entry WARNING defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'INFO' @ [64:51] ==> enum entry INFO defined in org.jetbrains.kotlin.script.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [64:81] ==> enum entry INFO defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'DEBUG' @ [65:51] ==> enum entry DEBUG defined in org.jetbrains.kotlin.script.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [65:82] ==> enum entry DEBUG defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'Position' @ [68:97] ==> public constructor Position(startLine: Int, startColumn: Int, endLine: Int? = ..., endColumn: Int? = ...) defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedClassConstructorDescriptor]

'line' @ [68:106] ==> public final val line: Int defined in org.jetbrains.kotlin.script.ScriptContents.Position[PropertyDescriptorImpl]

'col' @ [68:112] ==> public final val col: Int defined in org.jetbrains.kotlin.script.ScriptContents.Position[PropertyDescriptorImpl]

'ArrayList' @ [80:23] ==> public final fun <E> <init>(): ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> ScriptReport

'delegate' @ [81:26] ==> public open val delegate: ScriptDependenciesResolver defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper[PropertyDescriptorImpl]

'resolve' @ [81:35] ==> public open fun resolve(script: ScriptContents, environment: Environment? /* = Map<String, Any?>? */, report: (ScriptDependenciesResolver.ReportSeverity, String, ScriptContents.Position?) -> Unit, previousDependencies: KotlinScriptExternalDependencies?): Future<KotlinScriptExternalDependencies?> defined in kotlin.script.dependencies.ScriptDependenciesResolver[DeserializedSimpleFunctionDescriptor]

'scriptContents' @ [82:17] ==> value-parameter scriptContents: ScriptContents defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[ValueParameterDescriptorImpl]

'environment' @ [83:17] ==> value-parameter environment: Environment /* = Map<String, Any?> */ defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[ValueParameterDescriptorImpl]

'reports' @ [85:21] ==> val reports: ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'add' @ [85:29] ==> public open fun add(element: ScriptReport): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ScriptReport' @ [85:33] ==> public constructor ScriptReport(message: String, severity: ScriptReport.Severity = ..., position: ScriptReport.Position? = ...) defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedClassConstructorDescriptor]

'msg' @ [85:46] ==> value-parameter msg: String defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve.<anonymous>[ValueParameterDescriptorImpl]

'sev' @ [85:51] ==> value-parameter sev: ScriptDependenciesResolver.ReportSeverity defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve.<anonymous>[ValueParameterDescriptorImpl]

'convertSeverity' @ [85:55] ==> private final fun ScriptDependenciesResolver.ReportSeverity.convertSeverity(): ScriptReport.Severity defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper[SimpleFunctionDescriptorImpl]

'pos' @ [85:74] ==> value-parameter pos: ScriptContents.Position? defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve.<anonymous>[ValueParameterDescriptorImpl]

'convertPosition' @ [85:79] ==> private final fun ScriptContents.Position.convertPosition(): ScriptReport.Position defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper[SimpleFunctionDescriptorImpl]

'get' @ [87:11] ==> public abstract fun get(): KotlinScriptExternalDependencies? defined in java.util.concurrent.Future[JavaMethodDescriptor]

'Failure' @ [87:62] ==> public constructor Failure(reports: List<ScriptReport>) defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult.Failure[DeserializedClassConstructorDescriptor]

'reports' @ [87:70] ==> val reports: ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'ScriptDependencies' @ [89:28] ==> public constructor ScriptDependencies(javaHome: File? = ..., classpath: List<File> = ..., imports: List<String> = ..., sources: List<File> = ..., scripts: List<File> = ...) defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedClassConstructorDescriptor]

'legacyDeps' @ [90:28] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'javaHome' @ [90:39] ==> public open val javaHome: String? defined in kotlin.script.dependencies.KotlinScriptExternalDependencies[DeserializedPropertyDescriptor]

'let' @ [90:49] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [90:55] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'legacyDeps' @ [91:29] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'classpath' @ [91:40] ==> public open val classpath: Iterable<File> defined in kotlin.script.dependencies.KotlinScriptExternalDependencies[DeserializedPropertyDescriptor]

'toList' @ [91:50] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'legacyDeps' @ [92:27] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'imports' @ [92:38] ==> public open val imports: Iterable<String> defined in kotlin.script.dependencies.KotlinScriptExternalDependencies[DeserializedPropertyDescriptor]

'toList' @ [92:46] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'legacyDeps' @ [93:27] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'sources' @ [93:38] ==> public open val sources: Iterable<File> defined in kotlin.script.dependencies.KotlinScriptExternalDependencies[DeserializedPropertyDescriptor]

'toList' @ [93:46] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'legacyDeps' @ [94:27] ==> val legacyDeps: KotlinScriptExternalDependencies defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'scripts' @ [94:38] ==> public open val scripts: Iterable<File> defined in kotlin.script.dependencies.KotlinScriptExternalDependencies[DeserializedPropertyDescriptor]

'toList' @ [94:46] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'Success' @ [96:51] ==> public constructor Success(dependencies: ScriptDependencies, reports: List<ScriptReport> = ...) defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult.Success[DeserializedClassConstructorDescriptor]

'dependencies' @ [96:59] ==> val dependencies: ScriptDependencies defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'reports' @ [96:73] ==> val reports: ArrayList<ScriptReport> /* = ArrayList<ScriptReport> */ defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.resolve[LocalVariableDescriptor]

'when (this) {
        kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity.ERROR -> ScriptReport.Severity.ERROR
        kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity.WARNING -> ScriptReport.Severity.WARNING
        kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity.INFO -> ScriptReport.Severity.INFO
        kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity.DEBUG -> ScriptReport.Severity.DEBUG
    }' @ [99:129] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ScriptReport.Severity, entry1: ScriptReport.Severity, entry2: ScriptReport.Severity, entry3: ScriptReport.Severity): ScriptReport.Severity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Severity

'this' @ [99:135] ==> <this> defined in org.jetbrains.kotlin.script.ApiChangeDependencyResolverWrapper.convertSeverity[ReceiverParameterDescriptorImpl]

'ERROR' @ [100:78] ==> enum entry ERROR defined in kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [100:109] ==> enum entry ERROR defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'WARNING' @ [101:78] ==> enum entry WARNING defined in kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [101:111] ==> enum entry WARNING defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'INFO' @ [102:78] ==> enum entry INFO defined in kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [102:108] ==> enum entry INFO defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'DEBUG' @ [103:78] ==> enum entry DEBUG defined in kotlin.script.dependencies.ScriptDependenciesResolver.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [103:109] ==> enum entry DEBUG defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'Position' @ [106:124] ==> public constructor Position(startLine: Int, startColumn: Int, endLine: Int? = ..., endColumn: Int? = ...) defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedClassConstructorDescriptor]

'line' @ [106:133] ==> public final val line: Int defined in kotlin.script.dependencies.ScriptContents.Position[DeserializedPropertyDescriptor]

'col' @ [106:139] ==> public final val col: Int defined in kotlin.script.dependencies.ScriptContents.Position[DeserializedPropertyDescriptor]

