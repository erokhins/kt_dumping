'lazy' @ [36:64] ==> public fun <T> lazy(initializer: () -> GradleExecutionSettings?): Lazy<GradleExecutionSettings?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GradleExecutionSettings?

'getExecutionSettings' @ [38:35] ==> public open fun <S : (ExternalSystemExecutionSettings..ExternalSystemExecutionSettings?)> getExecutionSettings(@NotNull p0: Project, @NotNull p1: String, @NotNull p2: ProjectSystemId): (GradleExecutionSettings..GradleExecutionSettings?) defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]
Inferred types:
    <S : (ExternalSystemExecutionSettings..ExternalSystemExecutionSettings?)> -> GradleExecutionSettings

'project' @ [39:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.<init>[ValueParameterDescriptorImpl]

'toCanonicalPath' @ [40:84] ==> @NotNull public open fun toCanonicalPath(@NotNull p0: String): String defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]

'project' @ [40:100] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.<init>[ValueParameterDescriptorImpl]

'basePath' @ [40:108] ==> public final val Project.basePath: String?[MyPropertyDescriptor]

'SYSTEM_ID' @ [41:71] ==> @NotNull @NonNls public final val SYSTEM_ID: ProjectSystemId defined in org.jetbrains.plugins.gradle.util.GradleConstants[JavaPropertyDescriptor]

'getInstance' @ [45:20] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'AbstractGradleScriptTemplatesProvider' @ [45:32] ==> public constructor AbstractGradleScriptTemplatesProvider(project: Project, id: String, templateClass: String, dependencySelector: Regex) defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[ClassConstructorDescriptorImpl]

'java' @ [45:77] ==> public val <T> KClass<AbstractGradleScriptTemplatesProvider>.java: Class<AbstractGradleScriptTemplatesProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractGradleScriptTemplatesProvider

'warn' @ [45:83] ==> public abstract fun warn(@NonNls p0: (String..String?), @Nullable p1: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [45:134] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleExeSettings.<anonymous>[LocalVariableDescriptor]

'lazy' @ [50:51] ==> public fun <T> lazy(initializer: () -> List<String>): Lazy<List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>

'gradleExeSettings' @ [51:9] ==> private final val gradleExeSettings: GradleExecutionSettings? defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'daemonVmOptions' @ [51:28] ==> public final val GradleExecutionSettings.daemonVmOptions: String?[MyPropertyDescriptor]

'let' @ [51:45] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> List<String>): List<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> List<String>

'CommandLineTokenizer' @ [52:13] ==> public constructor CommandLineTokenizer(p0: (String..String?)) defined in com.intellij.execution.configurations.CommandLineTokenizer[JavaClassConstructorDescriptor]

'vmOptions' @ [52:34] ==> value-parameter vmOptions: String defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleJvmOptions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [52:45] ==> @InlineOnly public inline fun <T> Enumeration<(Any..Any?)>.toList(): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'mapNotNull' @ [53:22] ==> public inline fun <T, R : Any> Iterable<(Any..Any?)>.mapNotNull(transform: ((Any..Any?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)
    <R : Any> -> String

'it' @ [53:35] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleJvmOptions.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [53:39] ==> @InlineOnly public inline fun <T, R> Any.let(block: (Any) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> String?

'it' @ [53:45] ==> value-parameter it: Any defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleJvmOptions.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filterNot' @ [54:22] ==> public inline fun <T> Iterable<String>.filterNot(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [54:32] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'distinct' @ [55:22] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptyList' @ [56:14] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lazy' @ [59:40] ==> public fun <T> lazy(initializer: () -> File): Lazy<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'gradleExeSettings' @ [60:26] ==> private final val gradleExeSettings: GradleExecutionSettings? defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'gradleHome' @ [60:45] ==> public final val GradleExecutionSettings.gradleHome: String?[MyPropertyDescriptor]

'error' @ [60:59] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'File' @ [62:9] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'gradleHome' @ [62:14] ==> val gradleHome: String defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleLibDir.<anonymous>[LocalVariableDescriptor]

'let' @ [62:33] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'it' @ [63:13] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleLibDir.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [63:16] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [63:25] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleLibDir.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [63:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'it' @ [63:40] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleLibDir.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [63:43] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'error' @ [63:60] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [63:103] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.gradleLibDir.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [69:45] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'templateClass' @ [69:52] ==> private final val templateClass: String defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'gradleLibDir' @ [72:16] ==> internal final val gradleLibDir: File defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'listFiles' @ [72:29] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'dependencySelector' @ [74:13] ==> private final val dependencySelector: Regex defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'matches' @ [74:32] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'it' @ [74:40] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.<get-templateClasspath>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [74:43] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'takeIf' @ [75:11] ==> @InlineOnly @SinceKotlin public inline fun <T> (Array<(File..File?)>..Array<out (File..File?)>?).takeIf(predicate: ((Array<(File..File?)>..Array<out (File..File?)>?)) -> Boolean): (Array<(File..File?)>?..Array<out (File..File?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Array<(java.io.File..java.io.File?)>..kotlin.Array<out (java.io.File..java.io.File?)>?)

'it' @ [75:20] ==> value-parameter it: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.<get-templateClasspath>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [75:23] ==> @InlineOnly public inline fun <T> Array<out (File..File?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'asList' @ [75:39] ==> public fun <T> Array<out (File..File?)>.asList(): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'error' @ [75:51] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lazy' @ [78:53] ==> public fun <T> lazy(initializer: () -> Map<String, Any?>): Lazy<Map<String, Any?>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<String, Any?>

'mapOf' @ [79:9] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any?>): Map<String, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any?

'to' @ [80:17] ==> public infix fun <A, B> String.to(that: File?): Pair<String, File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> File?

'gradleExeSettings' @ [80:33] ==> private final val gradleExeSettings: GradleExecutionSettings? defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'gradleHome' @ [80:52] ==> public final val GradleExecutionSettings.gradleHome: String?[MyPropertyDescriptor]

'let' @ [80:64] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'to' @ [81:17] ==> public infix fun <A, B> String.to(that: File?): Pair<String, File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> File?

'project' @ [81:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.<init>[ValueParameterDescriptorImpl]

'basePath' @ [81:43] ==> public final val Project.basePath: String?[MyPropertyDescriptor]

'project' @ [81:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.<init>[ValueParameterDescriptorImpl]

'baseDir' @ [81:63] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'canonicalPath' @ [81:71] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'let' @ [81:87] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'to' @ [82:17] ==> public infix fun <A, B> String.to(that: ((ProjectConnection) -> Unit) -> Unit): Pair<String, ((ProjectConnection) -> Unit) -> Unit> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function1<Function1<ProjectConnection, Unit>, Unit>

'GradleExecutionHelper' @ [83:17] ==> public constructor GradleExecutionHelper() defined in org.jetbrains.plugins.gradle.service.execution.GradleExecutionHelper[JavaClassConstructorDescriptor]

'execute' @ [83:41] ==> public final fun <T : (Any..Any?)> execute(@NotNull p0: String, @Nullable p1: GradleExecutionSettings?, @NotNull p2: ((ProjectConnection..ProjectConnection?)) -> (Unit..Unit?)): (Unit..Unit?) defined in org.jetbrains.plugins.gradle.service.execution.GradleExecutionHelper[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'project' @ [83:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.<init>[ValueParameterDescriptorImpl]

'basePath' @ [83:57] ==> public final val Project.basePath: String?[MyPropertyDescriptor]

'invoke' @ [83:77] ==> public abstract operator fun invoke(p1: ProjectConnection): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [83:84] ==> value-parameter it: (ProjectConnection..ProjectConnection?) defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider.environment.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [84:17] ==> public infix fun <A, B> String.to(that: String?): Pair<String, String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String?

'gradleExeSettings' @ [84:37] ==> private final val gradleExeSettings: GradleExecutionSettings? defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'javaHome' @ [84:56] ==> public final var GradleExecutionSettings.javaHome: String?[MyPropertyDescriptor]

'to' @ [85:17] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'gradleJvmOptions' @ [85:39] ==> private final val gradleJvmOptions: List<String> defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[PropertyDescriptorImpl]

'to' @ [86:17] ==> public infix fun <A, B> String.to(that: KFunction2<CharSequence, String, Sequence<CharSequence>>): Pair<String, KFunction2<CharSequence, String, Sequence<CharSequence>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KFunction2<CharSequence, String, Sequence<CharSequence>>

'AbstractGradleScriptTemplatesProvider' @ [91:59] ==> public constructor AbstractGradleScriptTemplatesProvider(project: Project, id: String, templateClass: String, dependencySelector: Regex) defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[ClassConstructorDescriptorImpl]

'project' @ [92:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.GradleKotlinDSLTemplateProvider.<init>[ValueParameterDescriptorImpl]

'Regex' @ [95:9] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'gradleLibDir' @ [100:13] ==> internal final val gradleLibDir: File defined in org.jetbrains.kotlin.idea.core.script.GradleKotlinDSLTemplateProvider[PropertyDescriptorImpl]

'listFiles' @ [100:26] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'file' @ [100:46] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.idea.core.script.GradleKotlinDSLTemplateProvider.<get-additionalResolverClasspath>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [100:51] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [100:56] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [101:22] ==> public fun <T> Array<out (File..File?)>.firstOrNull(): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'let' @ [101:37] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> List<File>): List<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> List<File>

'orEmpty' @ [101:51] ==> @InlineOnly public inline fun <T> List<File>?.orEmpty(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'AbstractGradleScriptTemplatesProvider' @ [104:68] ==> public constructor AbstractGradleScriptTemplatesProvider(project: Project, id: String, templateClass: String, dependencySelector: Regex) defined in org.jetbrains.kotlin.idea.core.script.AbstractGradleScriptTemplatesProvider[ClassConstructorDescriptorImpl]

'project' @ [105:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.LegacyGradleScriptKotlinTemplateProvider.<init>[ValueParameterDescriptorImpl]

'Regex' @ [108:9] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'KotlinLexer' @ [113:25] ==> public constructor KotlinLexer() defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaClassConstructorDescriptor]

'apply' @ [113:39] ==> @InlineOnly public inline fun <T> KotlinLexer.apply(block: KotlinLexer.() -> Unit): KotlinLexer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer

'start' @ [114:9] ==> public final fun start(@NotNull p0: CharSequence): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'script' @ [114:15] ==> value-parameter script: CharSequence defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator.<init>[ValueParameterDescriptorImpl]

'replace' @ [114:22] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Regex' @ [114:30] ==> public companion object defined in kotlin.text.Regex[FakeCallableDescriptorForObject]

'fromLiteral' @ [114:36] ==> public final fun fromLiteral(literal: String): Regex defined in kotlin.text.Regex.Companion[DeserializedSimpleFunctionDescriptor]

'tokenType' @ [117:22] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'when (tokenType) {
                KtTokens.IDENTIFIER -> if (depth == 0 && tokenText == identifier) {
                    advance()
                    skipWhiteSpaceAndComments()
                    if (tokenType == KtTokens.LBRACE)
                        break@loop
                }
                KtTokens.LBRACE -> depth += 1
                KtTokens.RBRACE -> depth -= 1
            }' @ [118:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'tokenType' @ [118:19] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'IDENTIFIER' @ [119:26] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'depth' @ [119:44] ==> var depth: Int defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator.lexer.<anonymous>[LocalVariableDescriptor]

'tokenText' @ [119:58] ==> public final val KotlinLexer.tokenText: String[MyPropertyDescriptor]

'identifier' @ [119:71] ==> value-parameter identifier: String defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator.<init>[ValueParameterDescriptorImpl]

'advance' @ [120:21] ==> public open fun advance(): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'skipWhiteSpaceAndComments' @ [121:21] ==> private final fun KotlinLexer.skipWhiteSpaceAndComments(): Unit defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[SimpleFunctionDescriptorImpl]

'tokenType' @ [122:25] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'LBRACE' @ [122:47] ==> public final val LBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LBRACE' @ [125:26] ==> public final val LBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'depth' @ [125:36] ==> var depth: Int defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator.lexer.<anonymous>[LocalVariableDescriptor]

'RBRACE' @ [126:26] ==> public final val RBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'depth' @ [126:36] ==> var depth: Int defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator.lexer.<anonymous>[LocalVariableDescriptor]

'advance' @ [128:13] ==> public open fun advance(): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'!' @ [135:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'finished' @ [135:48] ==> private final var finished: Boolean defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[PropertyDescriptorImpl]

'lexer' @ [135:60] ==> private final val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[PropertyDescriptorImpl]

'tokenType' @ [135:66] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'lexer' @ [137:47] ==> private final val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[PropertyDescriptorImpl]

'apply' @ [137:53] ==> @InlineOnly public inline fun <T> KotlinLexer.apply(block: KotlinLexer.() -> Unit): KotlinLexer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer

'advance' @ [138:9] ==> public open fun advance(): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'when (tokenType) {
            KtTokens.LBRACE -> depth += 1
            KtTokens.RBRACE -> {
                if (depth == 1) {
                    finished = true
                }
                depth -= 1
            }
        }' @ [139:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'tokenType' @ [139:15] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'LBRACE' @ [140:22] ==> public final val LBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'depth' @ [140:32] ==> private final var depth: Int defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[PropertyDescriptorImpl]

'RBRACE' @ [141:22] ==> public final val RBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'depth' @ [142:21] ==> private final var depth: Int defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[PropertyDescriptorImpl]

'finished' @ [143:21] ==> private final var finished: Boolean defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[PropertyDescriptorImpl]

'depth' @ [145:17] ==> private final var depth: Int defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[PropertyDescriptorImpl]

'tokenType' @ [151:16] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'WHITE_SPACE_OR_COMMENT_BIT_SET' @ [151:38] ==> public final val WHITE_SPACE_OR_COMMENT_BIT_SET: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'advance' @ [152:13] ==> public open fun advance(): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'TopLevelSectionTokensEnumerator' @ [158:9] ==> public constructor TopLevelSectionTokensEnumerator(script: CharSequence, identifier: String) defined in org.jetbrains.kotlin.idea.core.script.TopLevelSectionTokensEnumerator[ClassConstructorDescriptorImpl]

'script' @ [158:41] ==> value-parameter script: CharSequence defined in org.jetbrains.kotlin.idea.core.script.topLevelSectionCodeTextTokens[ValueParameterDescriptorImpl]

'sectionIdentifier' @ [158:49] ==> value-parameter sectionIdentifier: String defined in org.jetbrains.kotlin.idea.core.script.topLevelSectionCodeTextTokens[ValueParameterDescriptorImpl]

'asSequence' @ [158:68] ==> @InlineOnly public inline fun <T> Enumeration<KotlinLexer>.asSequence(): Sequence<KotlinLexer> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer

'filter' @ [159:18] ==> public fun <T> Sequence<KotlinLexer>.filter(predicate: (KotlinLexer) -> Boolean): Sequence<KotlinLexer> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer

'it' @ [159:27] ==> value-parameter it: KotlinLexer defined in org.jetbrains.kotlin.idea.core.script.topLevelSectionCodeTextTokens.<anonymous>[ValueParameterDescriptorImpl]

'tokenType' @ [159:30] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'WHITE_SPACE_OR_COMMENT_BIT_SET' @ [159:53] ==> public final val WHITE_SPACE_OR_COMMENT_BIT_SET: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'map' @ [160:18] ==> public fun <T, R> Sequence<KotlinLexer>.map(transform: (KotlinLexer) -> CharSequence): Sequence<CharSequence> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer
    <R> -> CharSequence

'it' @ [160:24] ==> value-parameter it: KotlinLexer defined in org.jetbrains.kotlin.idea.core.script.topLevelSectionCodeTextTokens.<anonymous>[ValueParameterDescriptorImpl]

'tokenSequence' @ [160:27] ==> public final val KotlinLexer.tokenSequence: CharSequence[MyPropertyDescriptor]

