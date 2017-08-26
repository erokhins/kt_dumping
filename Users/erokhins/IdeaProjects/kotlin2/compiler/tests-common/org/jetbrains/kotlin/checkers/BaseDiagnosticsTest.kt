'KotlinMultiFileTestWithJava<TestModule, TestFile>' @ [47:38] ==> public constructor KotlinMultiFileTestWithJava<M : (Any..Any?), F : (Any..Any?)>() defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaClassConstructorDescriptor]
Inferred types:
    <M : (Any..Any?)> -> TestModule
    <F : (Any..Any?)> -> TestFile

'environment' @ [51:17] ==> protected final lateinit var environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[PropertyDescriptorImpl]

'project' @ [51:29] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'this' @ [54:9] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[LazyClassReceiverParameterDescriptor]

'environment' @ [54:15] ==> protected final lateinit var environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[PropertyDescriptorImpl]

'javaField' @ [54:27] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'this' @ [54:39] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[LazyClassReceiverParameterDescriptor]

'super' @ [55:9] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [55:15] ==> @Override protected/*protected and package*/ open fun tearDown(): Unit defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaMethodDescriptor]

'TestModule' @ [59:13] ==> public constructor TestModule(name: String) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[ClassConstructorDescriptorImpl]

'name' @ [59:24] ==> value-parameter name: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.createTestModule[ValueParameterDescriptorImpl]

'TestFile' @ [62:13] ==> public constructor TestFile(module: BaseDiagnosticsTest.TestModule?, fileName: String, textWithMarkers: String, directives: Map<String, String>) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[ClassConstructorDescriptorImpl]

'module' @ [62:22] ==> value-parameter module: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.createTestFile[ValueParameterDescriptorImpl]

'fileName' @ [62:30] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.createTestFile[ValueParameterDescriptorImpl]

'text' @ [62:40] ==> value-parameter text: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.createTestFile[ValueParameterDescriptorImpl]

'directives' @ [62:46] ==> value-parameter directives: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.createTestFile[ValueParameterDescriptorImpl]

'JvmSuppressWildcards' @ [66:22] ==> public constructor JvmSuppressWildcards(suppress: Boolean = ...) defined in kotlin.jvm.JvmSuppressWildcards[DeserializedClassConstructorDescriptor]

'modules' @ [69:39] ==> value-parameter modules: @JvmSuppressWildcards Map<String, KotlinMultiFileTestWithJava<BaseDiagnosticsTest.TestModule, BaseDiagnosticsTest.TestFile>.ModuleAndDependencies> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[ValueParameterDescriptorImpl]

'values' @ [69:47] ==> public abstract val values: Collection<KotlinMultiFileTestWithJava<BaseDiagnosticsTest.TestModule, BaseDiagnosticsTest.TestFile>.ModuleAndDependencies> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'moduleAndDependencies' @ [70:13] ==> val moduleAndDependencies: KotlinMultiFileTestWithJava<BaseDiagnosticsTest.TestModule, BaseDiagnosticsTest.TestFile>.ModuleAndDependencies defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[LocalVariableDescriptor]

'module' @ [70:35] ==> public/*package*/ final val module: (BaseDiagnosticsTest.TestModule..BaseDiagnosticsTest.TestModule?) defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava.ModuleAndDependencies[JavaPropertyDescriptor]

'getDependencies' @ [70:42] ==> public final fun getDependencies(): MutableList<BaseDiagnosticsTest.TestModule> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[SimpleFunctionDescriptorImpl]

'addAll' @ [70:60] ==> public abstract fun addAll(elements: Collection<BaseDiagnosticsTest.TestModule>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'moduleAndDependencies' @ [70:67] ==> val moduleAndDependencies: KotlinMultiFileTestWithJava<BaseDiagnosticsTest.TestModule, BaseDiagnosticsTest.TestFile>.ModuleAndDependencies defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[LocalVariableDescriptor]

'dependencies' @ [70:89] ==> public/*package*/ final val dependencies: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava.ModuleAndDependencies[JavaPropertyDescriptor]

'map' @ [70:102] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> BaseDiagnosticsTest.TestModule): List<BaseDiagnosticsTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> TestModule

'modules' @ [71:17] ==> value-parameter modules: @JvmSuppressWildcards Map<String, KotlinMultiFileTestWithJava<BaseDiagnosticsTest.TestModule, BaseDiagnosticsTest.TestFile>.ModuleAndDependencies> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[ValueParameterDescriptorImpl]

'name' @ [71:25] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [71:32] ==> public/*package*/ final val module: (BaseDiagnosticsTest.TestModule..BaseDiagnosticsTest.TestModule?) defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava.ModuleAndDependencies[JavaPropertyDescriptor]

'error' @ [71:42] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'name' @ [71:72] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'moduleAndDependencies' @ [71:90] ==> val moduleAndDependencies: KotlinMultiFileTestWithJava<BaseDiagnosticsTest.TestModule, BaseDiagnosticsTest.TestFile>.ModuleAndDependencies defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[LocalVariableDescriptor]

'module' @ [71:112] ==> public/*package*/ final val module: (BaseDiagnosticsTest.TestModule..BaseDiagnosticsTest.TestModule?) defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava.ModuleAndDependencies[JavaPropertyDescriptor]

'name' @ [71:119] ==> public final val name: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[PropertyDescriptorImpl]

'environment' @ [75:9] ==> protected final lateinit var environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[PropertyDescriptorImpl]

'createEnvironment' @ [75:23] ==> @NotNull protected/*protected and package*/ open fun createEnvironment(@NotNull file: File): KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[JavaMethodDescriptor]

'file' @ [75:41] ==> value-parameter file: File defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[ValueParameterDescriptorImpl]

'analyzeAndCheck' @ [77:9] ==> protected abstract fun analyzeAndCheck(testDataFile: File, files: List<BaseDiagnosticsTest.TestFile>): Unit defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[SimpleFunctionDescriptorImpl]

'file' @ [77:25] ==> value-parameter file: File defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[ValueParameterDescriptorImpl]

'testFiles' @ [77:31] ==> value-parameter testFiles: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.doMultiFileTest[ValueParameterDescriptorImpl]

'arrayListOf' @ [85:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KtFile> /* = ArrayList<KtFile> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'testFiles' @ [86:26] ==> value-parameter testFiles: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[ValueParameterDescriptorImpl]

'ktFiles' @ [87:13] ==> val ktFiles: ArrayList<KtFile> /* = ArrayList<KtFile> */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'addIfNotNull' @ [87:21] ==> public fun <T : Any> MutableCollection<KtFile>.addIfNotNull(t: KtFile?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtFile

'testFile' @ [87:34] ==> val testFile: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'ktFile' @ [87:43] ==> public final val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'declareFlexibleType' @ [88:13] ==> var declareFlexibleType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'declareFlexibleType' @ [88:35] ==> var declareFlexibleType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'testFile' @ [88:58] ==> val testFile: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'declareFlexibleType' @ [88:67] ==> public final val declareFlexibleType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'declareCheckType' @ [89:13] ==> var declareCheckType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'declareCheckType' @ [89:32] ==> var declareCheckType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'testFile' @ [89:52] ==> val testFile: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'declareCheckType' @ [89:61] ==> public final val declareCheckType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'includeExtras' @ [92:13] ==> value-parameter includeExtras: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[ValueParameterDescriptorImpl]

'declareFlexibleType' @ [93:17] ==> var declareFlexibleType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'ktFiles' @ [94:17] ==> val ktFiles: ArrayList<KtFile> /* = ArrayList<KtFile> */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'add' @ [94:25] ==> public open fun add(element: KtFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createFile' @ [94:45] ==> @NotNull public open fun createFile(@NotNull @NonNls name: String, @NotNull text: String, @NotNull project: Project): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'EXPLICIT_FLEXIBLE_TYPES_DECLARATIONS' @ [94:86] ==> private final val EXPLICIT_FLEXIBLE_TYPES_DECLARATIONS: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'project' @ [94:124] ==> protected final val project: Project defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[PropertyDescriptorImpl]

'declareCheckType' @ [96:17] ==> var declareCheckType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'ktFiles' @ [97:17] ==> val ktFiles: ArrayList<KtFile> /* = ArrayList<KtFile> */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'add' @ [97:25] ==> public open fun add(element: KtFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createFile' @ [97:45] ==> @NotNull public open fun createFile(@NotNull @NonNls name: String, @NotNull text: String, @NotNull project: Project): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'CHECK_TYPE_DECLARATIONS' @ [97:73] ==> private final val CHECK_TYPE_DECLARATIONS: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'project' @ [97:98] ==> protected final val project: Project defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[PropertyDescriptorImpl]

'ktFiles' @ [101:16] ==> val ktFiles: ArrayList<KtFile> /* = ArrayList<KtFile> */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.getKtFiles[LocalVariableDescriptor]

'ArrayList' @ [105:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TestModule

'dependencies' @ [107:58] ==> private final val dependencies: ArrayList<BaseDiagnosticsTest.TestModule> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[PropertyDescriptorImpl]

'name' @ [109:58] ==> public final val name: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[PropertyDescriptorImpl]

'compareTo' @ [109:63] ==> public open fun compareTo(other: String): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'other' @ [109:73] ==> value-parameter other: BaseDiagnosticsTest.TestModule defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule.compareTo[ValueParameterDescriptorImpl]

'name' @ [109:79] ==> public final val name: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[PropertyDescriptorImpl]

'name' @ [111:43] ==> public final val name: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[PropertyDescriptorImpl]

'LanguageVersionSettingsImpl' @ [119:32] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'languageVersion' @ [119:60] ==> public open val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings[PropertyDescriptorImpl]

'apiVersion' @ [119:77] ==> public open val apiVersion: ApiVersion defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings[PropertyDescriptorImpl]

'languageFeatures' @ [122:17] ==> private final val languageFeatures: Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings[PropertyDescriptorImpl]

'feature' @ [122:34] ==> value-parameter feature: LanguageFeature defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings.getFeatureSupport[ValueParameterDescriptorImpl]

'delegate' @ [122:46] ==> private final val delegate: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings[PropertyDescriptorImpl]

'getFeatureSupport' @ [122:55] ==> public open fun getFeatureSupport(feature: LanguageFeature): LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedSimpleFunctionDescriptor]

'feature' @ [122:73] ==> value-parameter feature: LanguageFeature defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings.getFeatureSupport[ValueParameterDescriptorImpl]

'flag' @ [124:62] ==> value-parameter flag: AnalysisFlag<T> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings.getFlag[ValueParameterDescriptorImpl]

'defaultValue' @ [124:67] ==> public final val defaultValue: T defined in org.jetbrains.kotlin.config.AnalysisFlag[DeserializedPropertyDescriptor]

'ArrayList' @ [133:77] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DiagnosedRange

'ArrayList' @ [143:67] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'this' @ [146:13] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'declareCheckType' @ [146:18] ==> public final val declareCheckType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'CHECK_TYPE_DIRECTIVE' @ [146:37] ==> public final val CHECK_TYPE_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directives' @ [146:61] ==> value-parameter directives: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'this' @ [147:13] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'whatDiagnosticsToConsider' @ [147:18] ==> private final val whatDiagnosticsToConsider: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'parseDiagnosticFilterDirective' @ [147:46] ==> private final fun parseDiagnosticFilterDirective(directiveMap: Map<String, String>, allowUnderscoreUsage: Boolean): Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[SimpleFunctionDescriptorImpl]

'directives' @ [147:77] ==> value-parameter directives: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'declareCheckType' @ [147:89] ==> public final val declareCheckType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'this' @ [148:13] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'customLanguageVersionSettings' @ [148:18] ==> public final val customLanguageVersionSettings: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'parseLanguageVersionSettings' @ [148:50] ==> private final fun parseLanguageVersionSettings(directiveMap: Map<String, String>): LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[SimpleFunctionDescriptorImpl]

'directives' @ [148:79] ==> value-parameter directives: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'this' @ [149:13] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'checkLazyLog' @ [149:18] ==> public final val checkLazyLog: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'CHECK_LAZY_LOG_DIRECTIVE' @ [149:33] ==> public final val CHECK_LAZY_LOG_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directives' @ [149:61] ==> value-parameter directives: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'CHECK_LAZY_LOG_DEFAULT' @ [149:75] ==> public final val CHECK_LAZY_LOG_DEFAULT: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'this' @ [150:13] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'declareFlexibleType' @ [150:18] ==> public final val declareFlexibleType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'EXPLICIT_FLEXIBLE_TYPES_DIRECTIVE' @ [150:40] ==> public final val EXPLICIT_FLEXIBLE_TYPES_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directives' @ [150:77] ==> value-parameter directives: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'this' @ [151:13] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'markDynamicCalls' @ [151:18] ==> private final val markDynamicCalls: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'MARK_DYNAMIC_CALLS_DIRECTIVE' @ [151:37] ==> public final val MARK_DYNAMIC_CALLS_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directives' @ [151:69] ==> value-parameter directives: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'if (fileName.endsWith(".java")) {
                // TODO: check there are no syntax errors in .java sources
                this.createKtFile = lazyOf(null)
                this.clearText = textWithMarkers
                this.expectedText = this.clearText
            }
            else {
                this.expectedText = textWithMarkers
                this.clearText = CheckerTestUtil.parseDiagnosedRanges(addExtras(expectedText), diagnosedRanges)
                this.createKtFile = lazy { TestCheckerUtil.createCheckAndReturnPsiFile(fileName, clearText, project) }
            }' @ [152:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'fileName' @ [152:17] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'endsWith' @ [152:26] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [154:17] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'createKtFile' @ [154:22] ==> private final val createKtFile: Lazy<KtFile?> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'lazyOf' @ [154:37] ==> public fun <T> lazyOf(value: Nothing?): Lazy<Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing?

'this' @ [155:17] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'clearText' @ [155:22] ==> private final val clearText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'textWithMarkers' @ [155:34] ==> value-parameter textWithMarkers: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'this' @ [156:17] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'expectedText' @ [156:22] ==> public final val expectedText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'this' @ [156:37] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'clearText' @ [156:42] ==> private final val clearText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'this' @ [159:17] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'expectedText' @ [159:22] ==> public final val expectedText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'textWithMarkers' @ [159:37] ==> value-parameter textWithMarkers: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'this' @ [160:17] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'clearText' @ [160:22] ==> private final val clearText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'parseDiagnosedRanges' @ [160:50] ==> public open fun parseDiagnosedRanges(p0: (String..String?), p1: (MutableList<(CheckerTestUtil.DiagnosedRange..CheckerTestUtil.DiagnosedRange?)>..List<(CheckerTestUtil.DiagnosedRange..CheckerTestUtil.DiagnosedRange?)>?)): (String..String?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil[JavaMethodDescriptor]

'addExtras' @ [160:71] ==> private final fun addExtras(text: String): String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[SimpleFunctionDescriptorImpl]

'expectedText' @ [160:81] ==> public final val expectedText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'diagnosedRanges' @ [160:96] ==> private final val diagnosedRanges: List<CheckerTestUtil.DiagnosedRange> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'this' @ [161:17] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'createKtFile' @ [161:22] ==> private final val createKtFile: Lazy<KtFile?> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'lazy' @ [161:37] ==> public fun <T> lazy(initializer: () -> KtFile): Lazy<KtFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'createCheckAndReturnPsiFile' @ [161:60] ==> @NotNull public open fun createCheckAndReturnPsiFile(@NotNull fileName: String, @NotNull text: String, @NotNull project: Project): KtFile defined in org.jetbrains.kotlin.checkers.TestCheckerUtil[JavaMethodDescriptor]

'fileName' @ [161:88] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.<init>[ValueParameterDescriptorImpl]

'clearText' @ [161:98] ==> private final val clearText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'project' @ [161:109] ==> protected final val project: Project defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[PropertyDescriptorImpl]

'createKtFile' @ [165:32] ==> private final val createKtFile: Lazy<KtFile?> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'buildString' @ [168:21] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'declareCheckType' @ [170:21] ==> public final val declareCheckType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'append' @ [171:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'CHECK_TYPE_IMPORT' @ [171:28] ==> public final val CHECK_TYPE_IMPORT: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'declareFlexibleType' @ [173:21] ==> public final val declareFlexibleType: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'append' @ [174:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'EXPLICIT_FLEXIBLE_TYPES_IMPORT' @ [174:28] ==> private final val EXPLICIT_FLEXIBLE_TYPES_IMPORT: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'imports' @ [179:35] ==> private final val imports: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'addImports' @ [182:17] ==> private final fun addImports(text: String, imports: String): String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[SimpleFunctionDescriptorImpl]

'text' @ [182:28] ==> value-parameter text: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addExtras[ValueParameterDescriptorImpl]

'extras' @ [182:34] ==> private final val extras: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'extras' @ [185:26] ==> private final val extras: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'actualText' @ [186:25] ==> value-parameter actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.stripExtras[ValueParameterDescriptorImpl]

'indexOf' @ [186:36] ==> public open fun indexOf(p0: (String..String?)): Int defined in java.lang.StringBuilder[JavaMethodDescriptor]

'extras' @ [186:44] ==> val extras: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.stripExtras[LocalVariableDescriptor]

'start' @ [187:17] ==> val start: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.stripExtras[LocalVariableDescriptor]

'actualText' @ [188:17] ==> value-parameter actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.stripExtras[ValueParameterDescriptorImpl]

'delete' @ [188:28] ==> public open fun delete(p0: Int, p1: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'start' @ [188:35] ==> val start: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.stripExtras[LocalVariableDescriptor]

'start' @ [188:42] ==> val start: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.stripExtras[LocalVariableDescriptor]

'extras' @ [188:50] ==> val extras: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.stripExtras[LocalVariableDescriptor]

'length' @ [188:57] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'text' @ [193:26] ==> value-parameter text: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[ValueParameterDescriptorImpl]

'compile' @ [194:35] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'MULTILINE' @ [194:78] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'pattern' @ [195:27] ==> val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'matcher' @ [195:35] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'result' @ [195:43] ==> var result: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'if (matcher.find()) {
                // add imports after the package directive
                result = result.substring(0, matcher.end()) + imports + result.substring(matcher.end())
            }
            else {
                // add imports at the beginning
                result = imports + result
            }' @ [196:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'matcher' @ [196:17] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'find' @ [196:25] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'result' @ [198:17] ==> var result: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'result' @ [198:26] ==> var result: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'substring' @ [198:33] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'matcher' @ [198:46] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'end' @ [198:54] ==> public open fun end(): Int defined in java.util.regex.Matcher[JavaMethodDescriptor]

'imports' @ [198:63] ==> value-parameter imports: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[ValueParameterDescriptorImpl]

'result' @ [198:73] ==> var result: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'substring' @ [198:80] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'matcher' @ [198:90] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'end' @ [198:98] ==> public open fun end(): Int defined in java.util.regex.Matcher[JavaMethodDescriptor]

'result' @ [202:17] ==> var result: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'imports' @ [202:26] ==> value-parameter imports: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[ValueParameterDescriptorImpl]

'result' @ [202:36] ==> var result: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'result' @ [204:20] ==> var result: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.addImports[LocalVariableDescriptor]

'this' @ [213:26] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'ktFile' @ [213:31] ==> public final val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'ktFile' @ [214:17] ==> val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'actualText' @ [216:17] ==> value-parameter actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[ValueParameterDescriptorImpl]

'append' @ [216:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [216:35] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[LazyClassReceiverParameterDescriptor]

'clearText' @ [216:40] ==> private final val clearText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'if (skipJvmSignatureDiagnostics)
                emptySet<ActualDiagnostic>()
            else
                computeJvmSignatureDiagnostics(bindingContext)' @ [221:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<CheckerTestUtil.ActualDiagnostic>, elseBranch: Set<CheckerTestUtil.ActualDiagnostic>): Set<CheckerTestUtil.ActualDiagnostic>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<ActualDiagnostic>

'skipJvmSignatureDiagnostics' @ [221:47] ==> value-parameter skipJvmSignatureDiagnostics: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[ValueParameterDescriptorImpl]

'emptySet' @ [222:17] ==> public fun <T> emptySet(): Set<CheckerTestUtil.ActualDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ActualDiagnostic

'computeJvmSignatureDiagnostics' @ [224:17] ==> private final fun computeJvmSignatureDiagnostics(bindingContext: BindingContext): Set<CheckerTestUtil.ActualDiagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[SimpleFunctionDescriptorImpl]

'bindingContext' @ [224:48] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[ValueParameterDescriptorImpl]

'booleanArrayOf' @ [226:22] ==> public fun booleanArrayOf(vararg elements: Boolean): BooleanArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'filter' @ [227:45] ==> @NotNull @Contract public final fun <T : (Any..Any?)> filter(@NotNull p0: (MutableCollection<out (CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>..Collection<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>), @NotNull p1: ((CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)) -> Boolean): (MutableList<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>..List<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>) defined in com.intellij.util.containers.ContainerUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.checkers.CheckerTestUtil.ActualDiagnostic..org.jetbrains.kotlin.checkers.CheckerTestUtil.ActualDiagnostic?)

'+' @ [228:21] ==> public operator fun <T> Collection<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>.plus(elements: Iterable<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>): List<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.checkers.CheckerTestUtil.ActualDiagnostic..org.jetbrains.kotlin.checkers.CheckerTestUtil.ActualDiagnostic?)

'getDiagnosticsIncludingSyntaxErrors' @ [228:37] ==> @NotNull public open fun getDiagnosticsIncludingSyntaxErrors(@NotNull p0: BindingContext, @NotNull p1: (MutableList<(Pair<(MultiTargetPlatform..MultiTargetPlatform?), (BindingContext..BindingContext?)>..Pair<(MultiTargetPlatform..MultiTargetPlatform?), (BindingContext..BindingContext?)>?)>..List<(Pair<(MultiTargetPlatform..MultiTargetPlatform?), (BindingContext..BindingContext?)>..Pair<(MultiTargetPlatform..MultiTargetPlatform?), (BindingContext..BindingContext?)>?)>), @NotNull p2: PsiElement, p3: Boolean, @Nullable p4: (MutableList<(DeclarationDescriptor..DeclarationDescriptor?)>?..List<(DeclarationDescriptor..DeclarationDescriptor?)>?)): (MutableList<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>..List<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil[JavaMethodDescriptor]

'bindingContext' @ [229:29] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[ValueParameterDescriptorImpl]

'implementingModulesBindings' @ [229:45] ==> value-parameter implementingModulesBindings: List<Pair<MultiTargetPlatform, BindingContext>> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[ValueParameterDescriptorImpl]

'ktFile' @ [229:74] ==> val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'markDynamicCalls' @ [229:82] ==> private final val markDynamicCalls: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'dynamicCallDescriptors' @ [229:100] ==> public final val dynamicCallDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'jvmSignatureDiagnostics' @ [230:25] ==> val jvmSignatureDiagnostics: Set<CheckerTestUtil.ActualDiagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'whatDiagnosticsToConsider' @ [231:23] ==> private final val whatDiagnosticsToConsider: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'value' @ [231:49] ==> public abstract fun value(p0: (Diagnostic..Diagnostic?)): Boolean defined in com.intellij.openapi.util.Condition[JavaMethodDescriptor]

'it' @ [231:55] ==> value-parameter it: (CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<anonymous>[ValueParameterDescriptorImpl]

'diagnostic' @ [231:58] ==> public final val diagnostic: (Diagnostic..Diagnostic?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil.ActualDiagnostic[JavaPropertyDescriptor]

'diagnosticsDiff' @ [234:66] ==> public open fun diagnosticsDiff(p0: (MutableList<(CheckerTestUtil.DiagnosedRange..CheckerTestUtil.DiagnosedRange?)>..List<(CheckerTestUtil.DiagnosedRange..CheckerTestUtil.DiagnosedRange?)>?), p1: (MutableCollection<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>..Collection<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>?), p2: (CheckerTestUtil.DiagnosticDiffCallbacks..CheckerTestUtil.DiagnosticDiffCallbacks?)): (MutableMap<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?), (CheckerTestUtil.TextDiagnostic..CheckerTestUtil.TextDiagnostic?)>..Map<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?), (CheckerTestUtil.TextDiagnostic..CheckerTestUtil.TextDiagnostic?)>?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil[JavaMethodDescriptor]

'diagnosedRanges' @ [234:82] ==> private final val diagnosedRanges: List<CheckerTestUtil.DiagnosedRange> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'diagnostics' @ [234:99] ==> val diagnostics: (MutableList<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>..List<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'+' @ [236:35] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [236:48] ==> value-parameter diagnostic: CheckerTestUtil.TextDiagnostic defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.missingDiagnostic[ValueParameterDescriptorImpl]

'description' @ [236:59] ==> public final val CheckerTestUtil.TextDiagnostic.description: String[MyPropertyDescriptor]

'atLocation' @ [236:89] ==> @NotNull public open fun atLocation(@NotNull p0: PsiFile, @NotNull p1: TextRange): String defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'ktFile' @ [236:100] ==> val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'TextRange' @ [236:108] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'expectedStart' @ [236:118] ==> value-parameter expectedStart: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.missingDiagnostic[ValueParameterDescriptorImpl]

'expectedEnd' @ [236:133] ==> value-parameter expectedEnd: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.missingDiagnostic[ValueParameterDescriptorImpl]

'err' @ [237:28] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [237:32] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'message' @ [237:40] ==> val message: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.missingDiagnostic[LocalVariableDescriptor]

'ok' @ [238:21] ==> val ok: BooleanArray defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'+' @ [247:35] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'atLocation' @ [248:51] ==> @NotNull public open fun atLocation(@NotNull p0: PsiFile, @NotNull p1: TextRange): String defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'ktFile' @ [248:62] ==> val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'TextRange' @ [248:70] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'start' @ [248:80] ==> value-parameter start: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.wrongParametersDiagnostic[ValueParameterDescriptorImpl]

'end' @ [248:87] ==> value-parameter end: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.wrongParametersDiagnostic[ValueParameterDescriptorImpl]

'expectedDiagnostic' @ [249:50] ==> value-parameter expectedDiagnostic: CheckerTestUtil.TextDiagnostic defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.wrongParametersDiagnostic[ValueParameterDescriptorImpl]

'asString' @ [249:69] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.checkers.CheckerTestUtil.TextDiagnostic[JavaMethodDescriptor]

'actualDiagnostic' @ [249:91] ==> value-parameter actualDiagnostic: CheckerTestUtil.TextDiagnostic defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.wrongParametersDiagnostic[ValueParameterDescriptorImpl]

'err' @ [250:28] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [250:32] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'message' @ [250:40] ==> val message: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.wrongParametersDiagnostic[LocalVariableDescriptor]

'ok' @ [251:21] ==> val ok: BooleanArray defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'diagnostic' @ [255:49] ==> value-parameter diagnostic: CheckerTestUtil.TextDiagnostic defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.unexpectedDiagnostic[ValueParameterDescriptorImpl]

'description' @ [255:60] ==> public final val CheckerTestUtil.TextDiagnostic.description: String[MyPropertyDescriptor]

'atLocation' @ [255:90] ==> @NotNull public open fun atLocation(@NotNull p0: PsiFile, @NotNull p1: TextRange): String defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'ktFile' @ [255:101] ==> val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'TextRange' @ [255:109] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'actualStart' @ [255:119] ==> value-parameter actualStart: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.unexpectedDiagnostic[ValueParameterDescriptorImpl]

'actualEnd' @ [255:132] ==> value-parameter actualEnd: Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.unexpectedDiagnostic[ValueParameterDescriptorImpl]

'err' @ [256:28] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [256:32] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'message' @ [256:40] ==> val message: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<no name provided>.unexpectedDiagnostic[LocalVariableDescriptor]

'ok' @ [257:21] ==> val ok: BooleanArray defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'actualText' @ [261:13] ==> value-parameter actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[ValueParameterDescriptorImpl]

'append' @ [261:24] ==> public open fun append(p0: (StringBuffer..StringBuffer?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'addDiagnosticMarkersToText' @ [262:37] ==> public final fun addDiagnosticMarkersToText(@NotNull p0: PsiFile, @NotNull p1: (MutableCollection<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>..Collection<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>), @NotNull p2: (MutableMap<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?), (CheckerTestUtil.TextDiagnostic..CheckerTestUtil.TextDiagnostic?)>..Map<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?), (CheckerTestUtil.TextDiagnostic..CheckerTestUtil.TextDiagnostic?)>), @NotNull p3: ((PsiFile..PsiFile?)) -> (String..String?)): (StringBuffer..StringBuffer?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil[SamAdapterFunctionDescriptor]

'ktFile' @ [262:64] ==> val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'diagnostics' @ [262:72] ==> val diagnostics: (MutableList<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>..List<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?)>) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'diagnosticToExpectedDiagnostic' @ [262:85] ==> val diagnosticToExpectedDiagnostic: (MutableMap<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?), (CheckerTestUtil.TextDiagnostic..CheckerTestUtil.TextDiagnostic?)>..Map<(CheckerTestUtil.ActualDiagnostic..CheckerTestUtil.ActualDiagnostic?), (CheckerTestUtil.TextDiagnostic..CheckerTestUtil.TextDiagnostic?)>?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'file' @ [262:127] ==> value-parameter file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [262:132] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'stripExtras' @ [265:13] ==> private final fun stripExtras(actualText: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[SimpleFunctionDescriptorImpl]

'actualText' @ [265:25] ==> value-parameter actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[ValueParameterDescriptorImpl]

'ok' @ [267:20] ==> val ok: BooleanArray defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.getActualText[LocalVariableDescriptor]

'HashSet' @ [271:43] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ActualDiagnostic

'findChildrenOfType' @ [272:44] ==> @NotNull public open fun <T : (PsiElement..PsiElement?)> findChildrenOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<out (KtDeclaration..KtDeclaration?)>): (MutableCollection<(KtDeclaration..KtDeclaration?)>..Collection<(KtDeclaration..KtDeclaration?)>) defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'ktFile' @ [272:63] ==> public final val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'java' @ [272:92] ==> public val <T> KClass<KtDeclaration>.java: Class<KtDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclaration

'declarations' @ [273:33] ==> val declarations: (MutableCollection<(KtDeclaration..KtDeclaration?)>..Collection<(KtDeclaration..KtDeclaration?)>) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics[LocalVariableDescriptor]

'getJvmSignatureDiagnostics' @ [274:35] ==> public fun getJvmSignatureDiagnostics(element: PsiElement, otherDiagnostics: Diagnostics, moduleScope: GlobalSearchScope): Diagnostics? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'declaration' @ [274:62] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics[LocalVariableDescriptor]

'bindingContext' @ [274:75] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics[ValueParameterDescriptorImpl]

'diagnostics' @ [274:90] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'allScope' @ [275:80] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [275:89] ==> protected final val project: Project defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[PropertyDescriptorImpl]

'jvmSignatureDiagnostics' @ [276:17] ==> val jvmSignatureDiagnostics: HashSet<CheckerTestUtil.ActualDiagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics[LocalVariableDescriptor]

'addAll' @ [276:41] ==> public open fun addAll(elements: Collection<CheckerTestUtil.ActualDiagnostic>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'diagnostics' @ [276:48] ==> val diagnostics: Diagnostics defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics[LocalVariableDescriptor]

'forElement' @ [276:60] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'declaration' @ [276:71] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics[LocalVariableDescriptor]

'map' @ [276:84] ==> public inline fun <T, R> Iterable<Diagnostic>.map(transform: (Diagnostic) -> CheckerTestUtil.ActualDiagnostic): List<CheckerTestUtil.ActualDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> ActualDiagnostic

'ActualDiagnostic' @ [276:90] ==> public/*package*/ constructor ActualDiagnostic(@NotNull p0: Diagnostic, @Nullable p1: String?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil.ActualDiagnostic[JavaClassConstructorDescriptor]

'it' @ [276:107] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics.<anonymous>[ValueParameterDescriptorImpl]

'jvmSignatureDiagnostics' @ [278:20] ==> val jvmSignatureDiagnostics: HashSet<CheckerTestUtil.ActualDiagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile.computeJvmSignatureDiagnostics[LocalVariableDescriptor]

'ktFile' @ [281:43] ==> public final val ktFile: KtFile? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'name' @ [281:52] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'compile' @ [286:52] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'setOf' @ [287:72] ==> public fun <T> setOf(vararg elements: (DiagnosticFactory<out (Diagnostic..Diagnostic?)>..DiagnosticFactory<out (Diagnostic..Diagnostic?)>?)): Set<(DiagnosticFactory<out (Diagnostic..Diagnostic?)>..DiagnosticFactory<out (Diagnostic..Diagnostic?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<out (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<out (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)>?)

'UNRESOLVED_REFERENCE' @ [288:24] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'UNRESOLVED_REFERENCE_WRONG_RECEIVER' @ [289:24] ==> public final val UNRESOLVED_REFERENCE_WRONG_RECEIVER: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'INSTANCE' @ [290:62] ==> public final val INSTANCE: (CheckerTestUtil.SyntaxErrorDiagnosticFactory..CheckerTestUtil.SyntaxErrorDiagnosticFactory?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil.SyntaxErrorDiagnosticFactory[JavaPropertyDescriptor]

'ELEMENT_WITH_ERROR_TYPE' @ [291:60] ==> public final val ELEMENT_WITH_ERROR_TYPE: (CheckerTestUtil.DebugInfoDiagnosticFactory..CheckerTestUtil.DebugInfoDiagnosticFactory?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil.DebugInfoDiagnosticFactory[JavaPropertyDescriptor]

'MISSING_UNRESOLVED' @ [292:60] ==> public final val MISSING_UNRESOLVED: (CheckerTestUtil.DebugInfoDiagnosticFactory..CheckerTestUtil.DebugInfoDiagnosticFactory?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil.DebugInfoDiagnosticFactory[JavaPropertyDescriptor]

'UNRESOLVED_WITH_TARGET' @ [293:60] ==> public final val UNRESOLVED_WITH_TARGET: (CheckerTestUtil.DebugInfoDiagnosticFactory..CheckerTestUtil.DebugInfoDiagnosticFactory?) defined in org.jetbrains.kotlin.checkers.CheckerTestUtil.DebugInfoDiagnosticFactory[JavaPropertyDescriptor]

'compile' @ [297:48] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'mapOf' @ [299:49] ==> public fun <K, V> mapOf(pair: Pair<LanguageFeature, LanguageFeature.State>): Map<LanguageFeature, LanguageFeature.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LanguageFeature
    <V> -> State

'LanguageFeature' @ [300:17] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'Coroutines' @ [300:33] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [300:69] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'+' @ [307:47] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'CHECK_TYPE_PACKAGE' @ [307:62] ==> public final val CHECK_TYPE_PACKAGE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'CHECK_TYPE_PACKAGE' @ [312:42] ==> public final val CHECK_TYPE_PACKAGE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'InternalFlexibleTypeTransformer' @ [315:41] ==> public object InternalFlexibleTypeTransformer : TypeResolver.TypeTransformerForTests defined in org.jetbrains.kotlin.load.java[FakeCallableDescriptorForObject]

'FLEXIBLE_TYPE_CLASSIFIER' @ [315:73] ==> @field:JvmField public final val FLEXIBLE_TYPE_CLASSIFIER: ClassId defined in org.jetbrains.kotlin.load.java.InternalFlexibleTypeTransformer[DeserializedPropertyDescriptor]

'packageFqName' @ [315:98] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [315:112] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'InternalFlexibleTypeTransformer' @ [316:44] ==> public object InternalFlexibleTypeTransformer : TypeResolver.TypeTransformerForTests defined in org.jetbrains.kotlin.load.java[FakeCallableDescriptorForObject]

'FLEXIBLE_TYPE_CLASSIFIER' @ [316:76] ==> @field:JvmField public final val FLEXIBLE_TYPE_CLASSIFIER: ClassId defined in org.jetbrains.kotlin.load.java.InternalFlexibleTypeTransformer[DeserializedPropertyDescriptor]

'relativeClassName' @ [316:101] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [316:119] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'+' @ [317:60] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'EXPLICIT_FLEXIBLE_PACKAGE' @ [317:75] ==> public final val EXPLICIT_FLEXIBLE_PACKAGE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'EXPLICIT_FLEXIBLE_CLASS_NAME' @ [318:80] ==> public final val EXPLICIT_FLEXIBLE_CLASS_NAME: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'EXPLICIT_FLEXIBLE_PACKAGE' @ [319:63] ==> public final val EXPLICIT_FLEXIBLE_PACKAGE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'EXPLICIT_FLEXIBLE_CLASS_NAME' @ [319:90] ==> public final val EXPLICIT_FLEXIBLE_CLASS_NAME: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'==' @ [321:38] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [321:55] ==> public open fun getProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'directiveMap' @ [326:36] ==> value-parameter directiveMap: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[ValueParameterDescriptorImpl]

'API_VERSION_DIRECTIVE' @ [326:49] ==> public final val API_VERSION_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directiveMap' @ [327:30] ==> value-parameter directiveMap: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[ValueParameterDescriptorImpl]

'LANGUAGE_DIRECTIVE' @ [327:43] ==> public final val LANGUAGE_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'apiVersionString' @ [328:17] ==> val apiVersionString: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'directives' @ [328:45] ==> val directives: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'?:' @ [330:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ApiVersion?, right: ApiVersion): ApiVersion[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ApiVersion

'if (apiVersionString != null) ApiVersion.parse(apiVersionString) else ApiVersion.LATEST_STABLE' @ [330:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ApiVersion?, elseBranch: ApiVersion?): ApiVersion?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ApiVersion?

'apiVersionString' @ [330:35] ==> val apiVersionString: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'parse' @ [330:72] ==> public final fun parse(versionString: String): ApiVersion? defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'apiVersionString' @ [330:78] ==> val apiVersionString: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'LATEST_STABLE' @ [330:112] ==> @field:JvmField public final val LATEST_STABLE: ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedPropertyDescriptor]

'error' @ [331:33] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'apiVersionString' @ [331:62] ==> val apiVersionString: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'directives' @ [333:36] ==> val directives: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'let' @ [333:48] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Map<LanguageFeature, LanguageFeature.State>): Map<LanguageFeature, LanguageFeature.State> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Map<LanguageFeature, State>

'this' @ [333:52] ==> <this> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[LazyClassReceiverParameterDescriptor]

'collectLanguageFeatureMap' @ [333:58] ==> private final fun collectLanguageFeatureMap(directives: String): Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[SimpleFunctionDescriptorImpl]

'orEmpty' @ [333:85] ==> @InlineOnly public inline fun <K, V> Map<LanguageFeature, LanguageFeature.State>?.orEmpty(): Map<LanguageFeature, LanguageFeature.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LanguageFeature
    <V> -> State

'DiagnosticTestLanguageVersionSettings' @ [335:20] ==> public constructor DiagnosticTestLanguageVersionSettings(languageFeatures: Map<LanguageFeature, LanguageFeature.State>, apiVersion: ApiVersion, languageVersion: LanguageVersion) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings[ClassConstructorDescriptorImpl]

'languageFeatures' @ [335:58] ==> val languageFeatures: Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'apiVersion' @ [335:76] ==> val apiVersion: ApiVersion defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseLanguageVersionSettings[LocalVariableDescriptor]

'LATEST_STABLE' @ [335:104] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'LANGUAGE_PATTERN' @ [339:27] ==> private final val LANGUAGE_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'matcher' @ [339:44] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'directives' @ [339:52] ==> value-parameter directives: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[ValueParameterDescriptorImpl]

'!' @ [340:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matcher' @ [340:18] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'find' @ [340:26] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'fail' @ [341:24] ==> public open fun fail(p0: (String..String?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'+' @ [342:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'LANGUAGE_DIRECTIVE' @ [342:52] ==> public final val LANGUAGE_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directives' @ [343:35] ==> value-parameter directives: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[ValueParameterDescriptorImpl]

'HashMap' @ [350:26] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> LanguageFeature
    <V : (Any..Any?)> -> State

'when (matcher.group(1)) {
                    "+" -> LanguageFeature.State.ENABLED
                    "-" -> LanguageFeature.State.DISABLED
                    "warn:" -> LanguageFeature.State.ENABLED_WITH_WARNING
                    else -> error("Unknown mode for language feature: ${matcher.group(1)}")
                }' @ [352:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LanguageFeature.State, entry1: LanguageFeature.State, entry2: LanguageFeature.State, entry3: LanguageFeature.State): LanguageFeature.State[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> State

'matcher' @ [352:34] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'group' @ [352:42] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'ENABLED' @ [353:50] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'DISABLED' @ [354:50] ==> enum entry DISABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'ENABLED_WITH_WARNING' @ [355:54] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'error' @ [356:29] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'matcher' @ [356:73] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'group' @ [356:81] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [358:28] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'group' @ [358:36] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'?:' @ [359:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: LanguageFeature?, right: LanguageFeature): LanguageFeature[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> LanguageFeature

'fromString' @ [359:47] ==> @JvmStatic public final fun fromString(str: String): LanguageFeature? defined in org.jetbrains.kotlin.config.LanguageFeature.Companion[DeserializedSimpleFunctionDescriptor]

'name' @ [359:58] ==> val name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'AssertionError' @ [359:73] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [360:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [360:78] ==> val name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'LanguageFeature' @ [361:49] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'values' @ [361:65] ==> public final fun values(): Array<LanguageFeature> defined in org.jetbrains.kotlin.config.LanguageFeature[SimpleFunctionDescriptorImpl]

'joinToString' @ [361:74] ==> public fun <T> Array<out LanguageFeature>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((LanguageFeature) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LanguageFeature

'values' @ [363:21] ==> val values: HashMap<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'put' @ [363:28] ==> public open fun put(key: LanguageFeature, value: LanguageFeature.State): LanguageFeature.State? defined in java.util.HashMap[JavaMethodDescriptor]

'feature' @ [363:32] ==> val feature: LanguageFeature defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'mode' @ [363:41] ==> val mode: LanguageFeature.State defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'fail' @ [364:28] ==> public open fun fail(p0: (String..String?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'name' @ [364:77] ==> val name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'matcher' @ [367:20] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'find' @ [367:28] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'values' @ [369:20] ==> val values: HashMap<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.collectLanguageFeatureMap[LocalVariableDescriptor]

'directiveMap' @ [373:30] ==> value-parameter directiveMap: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[ValueParameterDescriptorImpl]

'DIAGNOSTICS_DIRECTIVE' @ [373:43] ==> public final val DIAGNOSTICS_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'if (allowUnderscoreUsage)
                        Condition<Diagnostic> { it.factory.name != "UNDERSCORE_USAGE_WITHOUT_BACKTICKS" }
                    else
                        Conditions.alwaysTrue()' @ [375:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Condition<Diagnostic>, elseBranch: Condition<Diagnostic>): Condition<Diagnostic>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Condition<Diagnostic>

'allowUnderscoreUsage' @ [375:25] ==> value-parameter allowUnderscoreUsage: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[ValueParameterDescriptorImpl]

'Condition' @ [376:25] ==> public fun <T : (Any..Any?)> Condition(function: ((Diagnostic..Diagnostic?)) -> Boolean): Condition<Diagnostic> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Diagnostic

'it' @ [376:49] ==> value-parameter it: (Diagnostic..Diagnostic?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [376:52] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [376:60] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'alwaysTrue' @ [378:36] ==> public open fun <T : (Any..Any?)> alwaysTrue(): (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?) defined in com.intellij.openapi.util.Conditions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'directives' @ [380:17] ==> val directives: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'API_VERSION_DIRECTIVE' @ [383:21] ==> public final val API_VERSION_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directiveMap' @ [383:46] ==> value-parameter directiveMap: Map<String, String> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[ValueParameterDescriptorImpl]

'and' @ [384:39] ==> public open fun <T : (Any..Any?)> and(p0: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?), p1: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?)): (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?) defined in com.intellij.openapi.util.Conditions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'initialCondition' @ [384:43] ==> val initialCondition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'Condition' @ [384:61] ==> public fun <T : (Any..Any?)> Condition(function: ((Diagnostic..Diagnostic?)) -> Boolean): Condition<(Diagnostic..Diagnostic?)> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'diagnostic' @ [385:39] ==> value-parameter diagnostic: (Diagnostic..Diagnostic?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [385:50] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'NEWER_VERSION_IN_SINCE_KOTLIN' @ [385:69] ==> public final val NEWER_VERSION_IN_SINCE_KOTLIN: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'initialCondition' @ [388:24] ==> val initialCondition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'initialCondition' @ [391:29] ==> val initialCondition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'DIAGNOSTICS_PATTERN' @ [392:27] ==> public final val DIAGNOSTICS_PATTERN: Pattern defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'matcher' @ [392:47] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'directives' @ [392:55] ==> val directives: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'!' @ [393:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matcher' @ [393:18] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'find' @ [393:26] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'fail' @ [394:24] ==> public open fun fail(p0: (String..String?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'+' @ [394:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'DIAGNOSTICS_DIRECTIVE' @ [394:56] ==> public final val DIAGNOSTICS_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'directives' @ [395:39] ==> val directives: String? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'matcher' @ [405:33] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'group' @ [405:41] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [406:28] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'group' @ [406:36] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'if (name in setOf("ERROR", "WARNING", "INFO")) {
                            Condition { diagnostic -> diagnostic.severity == Severity.valueOf(name) }
                        }
                        else {
                            Condition { diagnostic -> name == diagnostic.factory.name }
                        }' @ [409:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Condition<Diagnostic>, elseBranch: Condition<Diagnostic>): Condition<Diagnostic>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Condition<Diagnostic>

'name' @ [409:29] ==> val name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'setOf' @ [409:37] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Condition' @ [410:29] ==> public fun <T : (Any..Any?)> Condition(function: ((Diagnostic..Diagnostic?)) -> Boolean): Condition<Diagnostic> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Diagnostic

'diagnostic' @ [410:55] ==> value-parameter diagnostic: (Diagnostic..Diagnostic?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [410:66] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'valueOf' @ [410:87] ==> public final fun valueOf(value: String): Severity defined in org.jetbrains.kotlin.diagnostics.Severity[SimpleFunctionDescriptorImpl]

'name' @ [410:95] ==> val name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'Condition' @ [413:29] ==> public fun <T : (Any..Any?)> Condition(function: ((Diagnostic..Diagnostic?)) -> Boolean): Condition<Diagnostic> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Diagnostic

'name' @ [413:55] ==> val name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'diagnostic' @ [413:63] ==> value-parameter diagnostic: (Diagnostic..Diagnostic?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [413:74] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [413:82] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'when (operation) {
                    "!" -> {
                        if (!first) {
                            Assert.fail("'$operation$name' appears in a position rather than the first one, " +
                                        "which effectively cancels all the previous filters in this directive")
                        }
                        condition = newCondition
                    }
                    "+" -> condition = Conditions.or(condition, newCondition)
                    "-" -> condition = Conditions.and(condition, Conditions.not(newCondition))
                }' @ [416:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'operation' @ [416:23] ==> val operation: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'!' @ [418:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'first' @ [418:30] ==> var first: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'fail' @ [419:36] ==> public open fun fail(p0: (String..String?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'+' @ [419:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'operation' @ [419:44] ==> val operation: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'name' @ [419:54] ==> val name: (String..String?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'condition' @ [422:25] ==> var condition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'newCondition' @ [422:37] ==> val newCondition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'condition' @ [424:28] ==> var condition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'or' @ [424:51] ==> public open fun <T : (Any..Any?)> or(p0: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?), p1: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?)): (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?) defined in com.intellij.openapi.util.Conditions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'condition' @ [424:54] ==> var condition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'newCondition' @ [424:65] ==> val newCondition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'condition' @ [425:28] ==> var condition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'and' @ [425:51] ==> public open fun <T : (Any..Any?)> and(p0: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?), p1: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?)): (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?) defined in com.intellij.openapi.util.Conditions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'condition' @ [425:55] ==> var condition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'not' @ [425:77] ==> public open fun <T : (Any..Any?)> not(p0: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?)): (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?) defined in com.intellij.openapi.util.Conditions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'newCondition' @ [425:81] ==> val newCondition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'first' @ [427:17] ==> var first: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'matcher' @ [429:20] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'find' @ [429:28] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'or' @ [432:31] ==> public open fun <T : (Any..Any?)> or(p0: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?), p1: (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?)): (Condition<(Diagnostic..Diagnostic?)>..Condition<(Diagnostic..Diagnostic?)>?) defined in com.intellij.openapi.util.Conditions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'condition' @ [433:21] ==> var condition: Condition<Diagnostic> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective[LocalVariableDescriptor]

'Condition' @ [434:21] ==> public fun <T : (Any..Any?)> Condition(function: ((Diagnostic..Diagnostic?)) -> Boolean): Condition<(Diagnostic..Diagnostic?)> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'diagnostic' @ [434:47] ==> value-parameter diagnostic: (Diagnostic..Diagnostic?) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion.parseDiagnosticFilterDirective.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [434:58] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'DIAGNOSTICS_TO_INCLUDE_ANYWAY' @ [434:69] ==> public final val DIAGNOSTICS_TO_INCLUDE_ANYWAY: Set<DiagnosticFactory<*>> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

