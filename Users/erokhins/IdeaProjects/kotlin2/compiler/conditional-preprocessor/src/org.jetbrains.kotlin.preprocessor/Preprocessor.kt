'Profile' @ [36:65] ==> public constructor Profile(name: String, evaluator: Evaluator, targetRoot: File) defined in org.jetbrains.kotlin.preprocessor.Profile[ClassConstructorDescriptorImpl]

'version' @ [36:78] ==> value-parameter version: Int defined in org.jetbrains.kotlin.preprocessor.createJvmProfile[ValueParameterDescriptorImpl]

'JvmPlatformEvaluator' @ [36:88] ==> public constructor JvmPlatformEvaluator(version: Int) defined in org.jetbrains.kotlin.preprocessor.JvmPlatformEvaluator[ClassConstructorDescriptorImpl]

'version' @ [36:109] ==> value-parameter version: Int defined in org.jetbrains.kotlin.preprocessor.createJvmProfile[ValueParameterDescriptorImpl]

'File' @ [36:119] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'targetRoot' @ [36:124] ==> value-parameter targetRoot: File defined in org.jetbrains.kotlin.preprocessor.createJvmProfile[ValueParameterDescriptorImpl]

'version' @ [36:141] ==> value-parameter version: Int defined in org.jetbrains.kotlin.preprocessor.createJvmProfile[ValueParameterDescriptorImpl]

'Profile' @ [37:50] ==> public constructor Profile(name: String, evaluator: Evaluator, targetRoot: File) defined in org.jetbrains.kotlin.preprocessor.Profile[ClassConstructorDescriptorImpl]

'JsPlatformEvaluator' @ [37:64] ==> public constructor JsPlatformEvaluator(ecmaScriptVersion: Int = ...) defined in org.jetbrains.kotlin.preprocessor.JsPlatformEvaluator[ClassConstructorDescriptorImpl]

'File' @ [37:87] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'targetRoot' @ [37:92] ==> value-parameter targetRoot: File defined in org.jetbrains.kotlin.preprocessor.createJsProfile[ValueParameterDescriptorImpl]

'listOf' @ [40:9] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'associateBy' @ [40:25] ==> public inline fun <T, K, V> Iterable<Int>.associateBy(keySelector: (Int) -> String, valueTransform: (Int) -> () -> Evaluator): Map<String, () -> Evaluator> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <K> -> String
    <V> -> Function0<Evaluator>

'version' @ [40:55] ==> value-parameter version: Int defined in org.jetbrains.kotlin.preprocessor.profileEvaluators.<anonymous>[ValueParameterDescriptorImpl]

'JvmPlatformEvaluator' @ [40:82] ==> public constructor JvmPlatformEvaluator(version: Int) defined in org.jetbrains.kotlin.preprocessor.JvmPlatformEvaluator[ClassConstructorDescriptorImpl]

'version' @ [40:103] ==> value-parameter version: Int defined in org.jetbrains.kotlin.preprocessor.profileEvaluators.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [40:133] ==> public infix fun <A, B> String.to(that: () -> Evaluator): Pair<String, () -> Evaluator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function0<Evaluator>

'JsPlatformEvaluator' @ [40:143] ==> public constructor JsPlatformEvaluator(ecmaScriptVersion: Int = ...) defined in org.jetbrains.kotlin.preprocessor.JsPlatformEvaluator[ClassConstructorDescriptorImpl]

'component1' @ [43:10] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, () -> Evaluator>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Function0<Evaluator>

'component2' @ [43:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, () -> Evaluator>.component2(): () -> Evaluator defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Function0<Evaluator>

'profileEvaluators' @ [43:36] ==> public val profileEvaluators: Map<String, () -> Evaluator> defined in org.jetbrains.kotlin.preprocessor in file Preprocessor.kt[PropertyDescriptorImpl]

'entries' @ [43:54] ==> public abstract val entries: Set<Map.Entry<String, () -> Evaluator>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'firstOrNull' @ [43:62] ==> public inline fun <T> Iterable<Map.Entry<String, () -> Evaluator>>.firstOrNull(predicate: (Map.Entry<String, () -> Evaluator>) -> Boolean): Map.Entry<String, () -> Evaluator>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, Function0<Evaluator>>

'it' @ [43:76] ==> value-parameter it: Map.Entry<String, () -> Evaluator> defined in org.jetbrains.kotlin.preprocessor.createProfile.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [43:79] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'equals' @ [43:83] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [43:90] ==> value-parameter name: String defined in org.jetbrains.kotlin.preprocessor.createProfile[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [43:126] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'name' @ [43:172] ==> value-parameter name: String defined in org.jetbrains.kotlin.preprocessor.createProfile[ValueParameterDescriptorImpl]

'Profile' @ [44:12] ==> public constructor Profile(name: String, evaluator: Evaluator, targetRoot: File) defined in org.jetbrains.kotlin.preprocessor.Profile[ClassConstructorDescriptorImpl]

'profileName' @ [44:20] ==> val profileName: String defined in org.jetbrains.kotlin.preprocessor.createProfile[LocalVariableDescriptor]

'invoke' @ [44:33] ==> public abstract operator fun invoke(): Evaluator defined in kotlin.Function0[FunctionInvokeDescriptor]

'targetRoot' @ [44:46] ==> value-parameter targetRoot: File defined in org.jetbrains.kotlin.preprocessor.createProfile[ValueParameterDescriptorImpl]

'SystemOutLogger' @ [48:41] ==> public object SystemOutLogger : Logger defined in org.jetbrains.kotlin.preprocessor in file logging.kt[FakeCallableDescriptorForObject]

'INSTANCE' @ [50:35] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'CompilerConfiguration' @ [54:29] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'KotlinCoreEnvironment' @ [55:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForProduction' @ [55:49] ==> @JvmStatic public final fun createForProduction(parentDisposable: Disposable, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'Disposable' @ [55:69] ==> public fun Disposable(function: () -> Unit): Disposable defined in com.intellij.openapi[SimpleFunctionDescriptorImpl]

'configuration' @ [55:86] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.preprocessor.Preprocessor.<init>[LocalVariableDescriptor]

'EMPTY' @ [55:124] ==> enum entry EMPTY defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [57:23] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.preprocessor.Preprocessor.<init>[LocalVariableDescriptor]

'project' @ [57:35] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'jetPsiFactory' @ [58:9] ==> public final val jetPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.preprocessor.Preprocessor[PropertyDescriptorImpl]

'KtPsiFactory' @ [58:25] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [58:38] ==> val project: Project defined in org.jetbrains.kotlin.preprocessor.Preprocessor.<init>[LocalVariableDescriptor]

'FileProcessingResult' @ [62:23] ==> private constructor FileProcessingResult() defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult[ClassConstructorDescriptorImpl]

'FileProcessingResult' @ [63:23] ==> private constructor FileProcessingResult() defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult[ClassConstructorDescriptorImpl]

'FileProcessingResult' @ [65:87] ==> private constructor FileProcessingResult() defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult[ClassConstructorDescriptorImpl]

'modifications' @ [66:45] ==> public final val modifications: List<Modification> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult.Modify[PropertyDescriptorImpl]

'applyTo' @ [66:59] ==> public fun List<Modification>.applyTo(sourceText: String): String defined in org.jetbrains.kotlin.preprocessor[SimpleFunctionDescriptorImpl]

'sourceText' @ [66:67] ==> public final val sourceText: String defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult.Modify[PropertyDescriptorImpl]

'modifications' @ [68:57] ==> public final val modifications: List<Modification> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult.Modify[PropertyDescriptorImpl]

'size' @ [68:71] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'this' @ [71:35] ==> <this> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult[LazyClassReceiverParameterDescriptor]

'java' @ [71:47] ==> public val <T> KClass<out Preprocessor.FileProcessingResult>.java: Class<out Preprocessor.FileProcessingResult> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileProcessingResult

'simpleName' @ [71:52] ==> public final val <T : (Any..Any?)> Class<out Preprocessor.FileProcessingResult>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileProcessingResult

'processDirectorySingleEvaluator' @ [75:9] ==> private final fun processDirectorySingleEvaluator(sourceRoot: File, targetRoot: File, evaluator: Evaluator): Unit defined in org.jetbrains.kotlin.preprocessor.Preprocessor[SimpleFunctionDescriptorImpl]

'sourceRoot' @ [75:41] ==> value-parameter sourceRoot: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processSources[ValueParameterDescriptorImpl]

'profile' @ [75:53] ==> value-parameter profile: Profile defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processSources[ValueParameterDescriptorImpl]

'targetRoot' @ [75:61] ==> public final val targetRoot: File defined in org.jetbrains.kotlin.preprocessor.Profile[PropertyDescriptorImpl]

'profile' @ [75:73] ==> value-parameter profile: Profile defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processSources[ValueParameterDescriptorImpl]

'evaluator' @ [75:81] ==> public final val evaluator: Evaluator defined in org.jetbrains.kotlin.preprocessor.Profile[PropertyDescriptorImpl]

'sourceFile' @ [79:13] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[ValueParameterDescriptorImpl]

'extension' @ [79:24] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'fileType' @ [79:37] ==> public final val fileType: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor[PropertyDescriptorImpl]

'defaultExtension' @ [79:46] ==> public final val KotlinFileType.defaultExtension: String[MyPropertyDescriptor]

'Copy' @ [80:41] ==> public object Copy : Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult[FakeCallableDescriptorForObject]

'sourceFile' @ [82:26] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[ValueParameterDescriptorImpl]

'readText' @ [82:37] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'convertLineSeparators' @ [82:48] ==> public fun String.convertLineSeparators(): String defined in org.jetbrains.kotlin.preprocessor in file Preprocessor.kt[SimpleFunctionDescriptorImpl]

'jetPsiFactory' @ [83:23] ==> public final val jetPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.preprocessor.Preprocessor[PropertyDescriptorImpl]

'createFile' @ [83:37] ==> public final fun createFile(fileName: String, text: String): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'sourceFile' @ [83:48] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[ValueParameterDescriptorImpl]

'name' @ [83:59] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'sourceText' @ [83:65] ==> val sourceText: String defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'psiFile' @ [85:31] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'parseConditionalAnnotations' @ [85:39] ==> public fun KtAnnotated.parseConditionalAnnotations(): List<Conditional> defined in org.jetbrains.kotlin.preprocessor[SimpleFunctionDescriptorImpl]

'!' @ [86:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [86:14] ==> public abstract fun invoke(p1: List<Conditional>): Boolean defined in org.jetbrains.kotlin.preprocessor.Evaluator[FunctionInvokeDescriptor]

'fileAnnotations' @ [86:24] ==> val fileAnnotations: List<Conditional> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'Skip' @ [87:41] ==> public object Skip : Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult[FakeCallableDescriptorForObject]

'CollectModificationsVisitor' @ [90:23] ==> public constructor CollectModificationsVisitor(evaluators: List<Evaluator>) defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor[ClassConstructorDescriptorImpl]

'listOf' @ [90:51] ==> public fun <T> listOf(element: Evaluator): List<Evaluator> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Evaluator

'evaluator' @ [90:58] ==> value-parameter evaluator: Evaluator defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[ValueParameterDescriptorImpl]

'psiFile' @ [91:9] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'accept' @ [91:17] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'visitor' @ [91:24] ==> val visitor: CollectModificationsVisitor defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'visitor' @ [93:20] ==> val visitor: CollectModificationsVisitor defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'elementModifications' @ [93:28] ==> public final val elementModifications: Map<Evaluator, MutableList<Modification>> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor[PropertyDescriptorImpl]

'values' @ [93:49] ==> public abstract val values: Collection<MutableList<Modification>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'single' @ [93:56] ==> public fun <T> Iterable<MutableList<Modification>>.single(): MutableList<Modification> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<Modification>

'if (list.isNotEmpty())
            FileProcessingResult.Modify(sourceText, list)
        else
            FileProcessingResult.Copy' @ [94:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Preprocessor.FileProcessingResult, elseBranch: Preprocessor.FileProcessingResult): Preprocessor.FileProcessingResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FileProcessingResult

'list' @ [94:20] ==> val list: MutableList<Modification> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'isNotEmpty' @ [94:25] ==> @InlineOnly public inline fun <T> Collection<Modification>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modification

'Modify' @ [95:34] ==> public constructor Modify(sourceText: String, modifications: List<Modification>) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult.Modify[ClassConstructorDescriptorImpl]

'sourceText' @ [95:41] ==> val sourceText: String defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'list' @ [95:53] ==> val list: MutableList<Modification> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processFileSingleEvaluator[LocalVariableDescriptor]

'Copy' @ [97:34] ==> public object Copy : Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult[FakeCallableDescriptorForObject]

'component1' @ [101:14] ==> public final operator fun component1(): List<(File..File?)> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [101:27] ==> public final operator fun component2(): List<(File..File?)> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'sourceRoot' @ [101:48] ==> value-parameter sourceRoot: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'listFiles' @ [101:59] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'partition' @ [101:71] ==> public inline fun <T> Array<out (File..File?)>.partition(predicate: ((File..File?)) -> Boolean): Pair<List<(File..File?)>, List<(File..File?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'!' @ [101:83] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [101:84] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [101:87] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'hashSetOf' @ [103:30] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sourceFiles' @ [104:28] ==> val sourceFiles: List<(File..File?)> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'processFileSingleEvaluator' @ [106:26] ==> private final fun processFileSingleEvaluator(sourceFile: File, evaluator: Evaluator): Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor[SimpleFunctionDescriptorImpl]

'sourceFile' @ [106:53] ==> val sourceFile: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'evaluator' @ [106:65] ==> value-parameter evaluator: Evaluator defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'logger' @ [107:13] ==> public final val logger: Logger defined in org.jetbrains.kotlin.preprocessor.Preprocessor[PropertyDescriptorImpl]

'debug' @ [107:20] ==> public abstract fun debug(msg: CharSequence): Unit defined in org.jetbrains.kotlin.preprocessor.Logger[SimpleFunctionDescriptorImpl]

'result' @ [107:28] ==> val result: Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'sourceFile' @ [107:37] ==> val sourceFile: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'result' @ [108:17] ==> val result: Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'sourceFile' @ [112:30] ==> val sourceFile: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'makeRelativeTo' @ [112:41] ==> public fun File.makeRelativeTo(from: File, to: File): File defined in org.jetbrains.kotlin.preprocessor[SimpleFunctionDescriptorImpl]

'sourceRoot' @ [112:56] ==> value-parameter sourceRoot: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'targetRoot' @ [112:68] ==> value-parameter targetRoot: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'processedFiles' @ [113:13] ==> val processedFiles: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetFile' @ [113:31] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetFile' @ [115:17] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'exists' @ [115:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'targetFile' @ [115:40] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'isDirectory' @ [115:51] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'targetFile' @ [116:17] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'deleteRecursively' @ [116:28] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'if (result is FileProcessingResult.Copy) {
                FileUtil.copy(sourceFile, targetFile)
            } else if (result is FileProcessingResult.Modify) {
                val resultText = result.getModifiedText()
                if (targetFile.exists() && targetFile.isTextEqualTo(resultText))
                    continue
                logger.info("Rewriting modified $targetFile")
                targetFile.parentFile!!.mkdirsOrFail()
                targetFile.writeText(resultText)
            }' @ [119:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'result' @ [119:17] ==> val result: Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'copy' @ [120:26] ==> public open fun copy(@NotNull p0: File, @NotNull p1: File): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'sourceFile' @ [120:31] ==> val sourceFile: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetFile' @ [120:43] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'result' @ [121:24] ==> val result: Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'result' @ [122:34] ==> val result: Preprocessor.FileProcessingResult defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'getModifiedText' @ [122:41] ==> public final fun getModifiedText(): String defined in org.jetbrains.kotlin.preprocessor.Preprocessor.FileProcessingResult.Modify[SimpleFunctionDescriptorImpl]

'targetFile' @ [123:21] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'exists' @ [123:32] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'targetFile' @ [123:44] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'isTextEqualTo' @ [123:55] ==> public fun File.isTextEqualTo(content: String): Boolean defined in org.jetbrains.kotlin.preprocessor in file Preprocessor.kt[SimpleFunctionDescriptorImpl]

'resultText' @ [123:69] ==> val resultText: String defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'logger' @ [125:17] ==> public final val logger: Logger defined in org.jetbrains.kotlin.preprocessor.Preprocessor[PropertyDescriptorImpl]

'info' @ [125:24] ==> public abstract fun info(msg: CharSequence): Unit defined in org.jetbrains.kotlin.preprocessor.Logger[SimpleFunctionDescriptorImpl]

'targetFile' @ [125:50] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetFile' @ [126:17] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'parentFile' @ [126:28] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirsOrFail' @ [126:41] ==> public fun File.mkdirsOrFail(): Unit defined in org.jetbrains.kotlin.preprocessor in file Preprocessor.kt[SimpleFunctionDescriptorImpl]

'targetFile' @ [127:17] ==> val targetFile: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'writeText' @ [127:28] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'resultText' @ [127:38] ==> val resultText: String defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'sourceDirectories' @ [131:27] ==> val sourceDirectories: List<(File..File?)> defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'sourceDir' @ [132:29] ==> val sourceDir: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'makeRelativeTo' @ [132:39] ==> public fun File.makeRelativeTo(from: File, to: File): File defined in org.jetbrains.kotlin.preprocessor[SimpleFunctionDescriptorImpl]

'sourceRoot' @ [132:54] ==> value-parameter sourceRoot: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'targetRoot' @ [132:66] ==> value-parameter targetRoot: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'targetDir' @ [133:17] ==> val targetDir: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'exists' @ [133:27] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [133:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetDir' @ [133:40] ==> val targetDir: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'isDirectory' @ [133:50] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'targetDir' @ [134:17] ==> val targetDir: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'delete' @ [134:27] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'targetDir' @ [136:13] ==> val targetDir: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'mkdirsOrFail' @ [136:23] ==> public fun File.mkdirsOrFail(): Unit defined in org.jetbrains.kotlin.preprocessor in file Preprocessor.kt[SimpleFunctionDescriptorImpl]

'processDirectorySingleEvaluator' @ [137:13] ==> private final fun processDirectorySingleEvaluator(sourceRoot: File, targetRoot: File, evaluator: Evaluator): Unit defined in org.jetbrains.kotlin.preprocessor.Preprocessor[SimpleFunctionDescriptorImpl]

'sourceDir' @ [137:45] ==> val sourceDir: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetDir' @ [137:56] ==> val targetDir: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'evaluator' @ [137:67] ==> value-parameter evaluator: Evaluator defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'processedFiles' @ [138:13] ==> val processedFiles: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetDir' @ [138:31] ==> val targetDir: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetRoot' @ [141:28] ==> value-parameter targetRoot: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[ValueParameterDescriptorImpl]

'listFiles' @ [141:39] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'!' @ [142:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processedFiles' @ [142:18] ==> val processedFiles: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'remove' @ [142:33] ==> @InlineOnly public inline fun <@OnlyInputTypes T> MutableCollection<out File?>.remove(element: File?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> File?

'processedFiles' @ [142:40] ==> val processedFiles: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'find' @ [142:55] ==> @InlineOnly public inline fun <T> Iterable<File>.find(predicate: (File) -> Boolean): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'filesEqual' @ [142:71] ==> public open fun filesEqual(@Nullable p0: File?, @Nullable p1: File?): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'it' @ [142:82] ==> value-parameter it: File defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator.<anonymous>[ValueParameterDescriptorImpl]

'targetFile' @ [142:86] ==> val targetFile: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'logger' @ [143:17] ==> public final val logger: Logger defined in org.jetbrains.kotlin.preprocessor.Preprocessor[PropertyDescriptorImpl]

'info' @ [143:24] ==> public abstract fun info(msg: CharSequence): Unit defined in org.jetbrains.kotlin.preprocessor.Logger[SimpleFunctionDescriptorImpl]

'targetFile' @ [143:48] ==> val targetFile: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'targetFile' @ [144:17] ==> val targetFile: (File..File?) defined in org.jetbrains.kotlin.preprocessor.Preprocessor.processDirectorySingleEvaluator[LocalVariableDescriptor]

'deleteRecursively' @ [144:28] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'convertLineSeparators' @ [151:57] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'this' @ [151:79] ==> <this> defined in org.jetbrains.kotlin.preprocessor.convertLineSeparators[ReceiverParameterDescriptorImpl]

'readText' @ [153:52] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'lines' @ [153:63] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'content' @ [153:74] ==> value-parameter content: String defined in org.jetbrains.kotlin.preprocessor.isTextEqualTo[ValueParameterDescriptorImpl]

'lines' @ [153:82] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [155:49] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'to' @ [155:54] ==> value-parameter to: File defined in org.jetbrains.kotlin.preprocessor.makeRelativeTo[ValueParameterDescriptorImpl]

'toRelativeString' @ [155:58] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'from' @ [155:75] ==> value-parameter from: File defined in org.jetbrains.kotlin.preprocessor.makeRelativeTo[ValueParameterDescriptorImpl]

'!' @ [158:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'mkdirs' @ [158:10] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [158:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exists' @ [158:23] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'IOException' @ [159:15] ==> public constructor IOException(p0: (String..String?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'this' @ [159:56] ==> <this> defined in org.jetbrains.kotlin.preprocessor.mkdirsOrFail[ReceiverParameterDescriptorImpl]

