'BaseDiagnosticsTest' @ [76:42] ==> public constructor BaseDiagnosticsTest() defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest[ClassConstructorDescriptorImpl]

'files' @ [78:31] ==> value-parameter files: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'groupBy' @ [78:37] ==> public inline fun <T, K> Iterable<BaseDiagnosticsTest.TestFile>.groupBy(keySelector: (BaseDiagnosticsTest.TestFile) -> BaseDiagnosticsTest.TestModule?): Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <K> -> TestModule?

'TestFile' @ [78:45] ==> public constructor TestFile(module: BaseDiagnosticsTest.TestModule?, fileName: String, textWithMarkers: String, directives: Map<String, String>) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[ClassConstructorDescriptorImpl]

'module' @ [78:55] ==> public final val module: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'ExceptionTracker' @ [82:23] ==> public constructor ExceptionTracker() defined in org.jetbrains.kotlin.storage.ExceptionTracker[DeserializedClassConstructorDescriptor]

'if (files.any(TestFile::checkLazyLog)) {
            lazyOperationsLog = LazyOperationsLog(HASH_SANITIZER)
            storageManager = LoggingStorageManager(
                    LockBasedStorageManager.createWithExceptionHandling(tracker),
                    lazyOperationsLog.addRecordFunction
            )
        }
        else {
            storageManager = LockBasedStorageManager.createWithExceptionHandling(tracker)
        }' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'files' @ [84:13] ==> value-parameter files: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'any' @ [84:19] ==> public inline fun <T> Iterable<BaseDiagnosticsTest.TestFile>.any(predicate: (BaseDiagnosticsTest.TestFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'TestFile' @ [84:23] ==> public constructor TestFile(module: BaseDiagnosticsTest.TestModule?, fileName: String, textWithMarkers: String, directives: Map<String, String>) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[ClassConstructorDescriptorImpl]

'checkLazyLog' @ [84:33] ==> public final val checkLazyLog: Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'lazyOperationsLog' @ [85:13] ==> var lazyOperationsLog: LazyOperationsLog? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'LazyOperationsLog' @ [85:33] ==> public constructor LazyOperationsLog(stringSanitizer: (String) -> String) defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[ClassConstructorDescriptorImpl]

'HASH_SANITIZER' @ [85:51] ==> private final val HASH_SANITIZER: (String) -> String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.Companion[PropertyDescriptorImpl]

'storageManager' @ [86:13] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'LoggingStorageManager' @ [86:30] ==> public constructor LoggingStorageManager(delegate: StorageManager, callHandler: (lambda: Any, call: LoggingStorageManager.CallData) -> Unit) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[ClassConstructorDescriptorImpl]

'createWithExceptionHandling' @ [87:45] ==> @NotNull public open fun createWithExceptionHandling(@NotNull p0: LockBasedStorageManager.ExceptionHandlingStrategy): LockBasedStorageManager defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaMethodDescriptor]

'tracker' @ [87:73] ==> val tracker: ExceptionTracker defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'lazyOperationsLog' @ [88:21] ==> var lazyOperationsLog: LazyOperationsLog? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'addRecordFunction' @ [88:39] ==> public final val addRecordFunction: (lambda: Any, LoggingStorageManager.CallData) -> Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[PropertyDescriptorImpl]

'storageManager' @ [92:13] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'createWithExceptionHandling' @ [92:54] ==> @NotNull public open fun createWithExceptionHandling(@NotNull p0: LockBasedStorageManager.ExceptionHandlingStrategy): LockBasedStorageManager defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaMethodDescriptor]

'tracker' @ [92:82] ==> val tracker: ExceptionTracker defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'SimpleGlobalContext' @ [95:23] ==> public constructor SimpleGlobalContext(storageManager: StorageManager, exceptionTracker: ExceptionTracker) defined in org.jetbrains.kotlin.context.SimpleGlobalContext[DeserializedClassConstructorDescriptor]

'storageManager' @ [95:43] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'tracker' @ [95:59] ==> val tracker: ExceptionTracker defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'createModules' @ [97:23] ==> private final fun createModules(groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>>, storageManager: StorageManager): MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'groupedByModule' @ [97:37] ==> val groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'context' @ [97:54] ==> val context: SimpleGlobalContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'storageManager' @ [97:62] ==> public open val storageManager: StorageManager defined in org.jetbrains.kotlin.context.SimpleGlobalContext[DeserializedPropertyDescriptor]

'HashMap' @ [98:30] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TestModule?
    <V : (Any..Any?)> -> BindingContext

'component1' @ [100:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>>.component1(): BaseDiagnosticsTest.TestModule? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestModule?
    <V> -> List<TestFile>

'component2' @ [100:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>>.component2(): List<BaseDiagnosticsTest.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestModule?
    <V> -> List<TestFile>

'groupedByModule' @ [100:49] ==> val groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'getKtFiles' @ [101:27] ==> protected final fun getKtFiles(testFiles: List<BaseDiagnosticsTest.TestFile>, includeExtras: Boolean): List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testFilesInModule' @ [101:38] ==> val testFilesInModule: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'modules' @ [103:29] ==> val modules: MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testModule' @ [103:37] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'loadLanguageVersionSettings' @ [105:43] ==> protected open fun loadLanguageVersionSettings(module: List<BaseDiagnosticsTest.TestFile>): LanguageVersionSettings defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testFilesInModule' @ [105:71] ==> val testFilesInModule: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'context' @ [106:33] ==> val context: SimpleGlobalContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'withProject' @ [106:41] ==> public fun GlobalContext.withProject(project: Project): ProjectContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'project' @ [106:53] ==> protected final val project: Project defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[PropertyDescriptorImpl]

'withModule' @ [106:62] ==> public fun ProjectContext.withModule(module: ModuleDescriptor): ModuleContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'oldModule' @ [106:73] ==> val oldModule: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'groupedByModule' @ [108:35] ==> val groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'size' @ [108:51] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'groupedByModule' @ [108:64] ==> val groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'keys' @ [108:80] ==> public abstract val keys: Set<BaseDiagnosticsTest.TestModule?> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'single' @ [108:85] ==> public fun <T> Iterable<BaseDiagnosticsTest.TestModule?>.single(): BaseDiagnosticsTest.TestModule? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule?

'analyzeModuleContents' @ [109:26] ==> protected open fun analyzeModuleContents(moduleContext: ModuleContext, files: List<KtFile>, moduleTrace: BindingTrace, languageVersionSettings: LanguageVersionSettings, separateModules: Boolean): AnalysisResult defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'moduleContext' @ [110:21] ==> val moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'ktFiles' @ [110:36] ==> val ktFiles: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'NoScopeRecordCliBindingTrace' @ [110:76] ==> public constructor NoScopeRecordCliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace[DeserializedClassConstructorDescriptor]

'languageVersionSettings' @ [111:21] ==> val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'separateModules' @ [111:46] ==> val separateModules: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'oldModule' @ [113:17] ==> val oldModule: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'result' @ [113:30] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'moduleDescriptor' @ [113:37] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'modules' @ [118:17] ==> val modules: MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testModule' @ [118:25] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'result' @ [118:39] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'moduleDescriptor' @ [118:46] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'modules' @ [119:32] ==> val modules: MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'values' @ [119:40] ==> public abstract val values: MutableCollection<ModuleDescriptorImpl> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'Suppress' @ [120:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'module' @ [121:31] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testOnly_AllDependentModules' @ [121:38] ==> @Deprecated public final val testOnly_AllDependentModules: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'listIterator' @ [121:83] ==> public abstract fun listIterator(): MutableListIterator<ModuleDescriptorImpl> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [122:28] ==> val it: MutableListIterator<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'hasNext' @ [122:31] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableListIterator[DeserializedSimpleFunctionDescriptor]

'it' @ [123:29] ==> val it: MutableListIterator<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'next' @ [123:32] ==> public abstract fun next(): ModuleDescriptorImpl defined in kotlin.collections.MutableListIterator[DeserializedSimpleFunctionDescriptor]

'oldModule' @ [123:42] ==> val oldModule: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'it' @ [124:29] ==> val it: MutableListIterator<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'set' @ [124:32] ==> public abstract fun set(element: ModuleDescriptorImpl): Unit defined in kotlin.collections.MutableListIterator[DeserializedSimpleFunctionDescriptor]

'result' @ [124:36] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'moduleDescriptor' @ [124:43] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'moduleBindings' @ [130:13] ==> val moduleBindings: HashMap<BaseDiagnosticsTest.TestModule?, BindingContext> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testModule' @ [130:28] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'result' @ [130:42] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'bindingContext' @ [130:49] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'checkAllResolvedCallsAreCompleted' @ [131:13] ==> private final fun checkAllResolvedCallsAreCompleted(ktFiles: List<KtFile>, bindingContext: BindingContext): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'ktFiles' @ [131:47] ==> val ktFiles: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'result' @ [131:56] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'bindingContext' @ [131:63] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'if (lazyOperationsLog != null) {
            exceptionFromLazyResolveLogValidation = checkLazyResolveLog(lazyOperationsLog, testDataFile)
        }
        else {
            val lazyLogFile = getLazyLogFile(testDataFile)
            assertFalse("No lazy log expected, but found: ${lazyLogFile.absolutePath}", lazyLogFile.exists())
        }' @ [137:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'lazyOperationsLog' @ [137:13] ==> var lazyOperationsLog: LazyOperationsLog? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'exceptionFromLazyResolveLogValidation' @ [138:13] ==> var exceptionFromLazyResolveLogValidation: Throwable? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'checkLazyResolveLog' @ [138:53] ==> private final fun checkLazyResolveLog(lazyOperationsLog: LazyOperationsLog, testDataFile: File): Throwable? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'lazyOperationsLog' @ [138:73] ==> var lazyOperationsLog: LazyOperationsLog? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testDataFile' @ [138:92] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'getLazyLogFile' @ [141:31] ==> private final fun getLazyLogFile(testDataFile: File): File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testDataFile' @ [141:46] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'assertFalse' @ [142:13] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaMethodDescriptor]

'lazyLogFile' @ [142:61] ==> val lazyLogFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'absolutePath' @ [142:73] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'lazyLogFile' @ [142:89] ==> val lazyLogFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'exists' @ [142:101] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'File' @ [147:32] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'+' @ [147:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getNameWithoutExtension' @ [147:46] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'testDataFile' @ [147:70] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'absolutePath' @ [147:83] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'validateAndCompareDescriptorWithFile' @ [148:13] ==> private final fun validateAndCompareDescriptorWithFile(expectedFile: File, testFiles: List<BaseDiagnosticsTest.TestFile>, modules: Map<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'expectedFile' @ [148:50] ==> val expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'files' @ [148:64] ==> value-parameter files: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'modules' @ [148:71] ==> val modules: MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'exceptionFromDescriptorValidation' @ [151:13] ==> var exceptionFromDescriptorValidation: Throwable? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'e' @ [151:49] ==> val e: Throwable defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'StringBuilder' @ [157:26] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'files' @ [158:26] ==> value-parameter files: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'testFile' @ [159:26] ==> val testFile: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'module' @ [159:35] ==> public final val module: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'modules' @ [160:34] ==> val modules: MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'module' @ [160:42] ==> val module: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'getMultiTargetPlatform' @ [160:52] ==> public fun ModuleDescriptor.getMultiTargetPlatform(): MultiTargetPlatform? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'Common' @ [160:100] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'if (!isCommonModule) emptyList()
                    else modules.entries.filter { (testModule) -> module in testModule?.getDependencies().orEmpty() }' @ [162:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>>, elseBranch: List<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>>): List<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<MutableEntry<TestModule?, ModuleDescriptorImpl>>

'!' @ [162:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCommonModule' @ [162:26] ==> val isCommonModule: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'emptyList' @ [162:42] ==> public fun <T> emptyList(): List<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<TestModule?, ModuleDescriptorImpl>

'modules' @ [163:26] ==> val modules: MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'entries' @ [163:34] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'filter' @ [163:42] ==> public inline fun <T> Iterable<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>>.filter(predicate: (MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>) -> Boolean): List<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<TestModule?, ModuleDescriptorImpl>

'component1' @ [163:52] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>.component1(): BaseDiagnosticsTest.TestModule? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestModule?
    <V> -> ModuleDescriptorImpl

'module' @ [163:67] ==> val module: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testModule' @ [163:77] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[LocalVariableDescriptor]

'getDependencies' @ [163:89] ==> public final fun getDependencies(): MutableList<BaseDiagnosticsTest.TestModule> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[SimpleFunctionDescriptorImpl]

'orEmpty' @ [163:107] ==> @InlineOnly public inline fun <T> List<BaseDiagnosticsTest.TestModule>?.orEmpty(): List<BaseDiagnosticsTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'implementingModules' @ [164:47] ==> val implementingModules: List<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'mapNotNull' @ [164:67] ==> public inline fun <T, R : Any> Iterable<MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>>.mapNotNull(transform: (MutableMap.MutableEntry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>) -> Pair<MultiTargetPlatform.Specific, BindingContext>?): List<Pair<MultiTargetPlatform.Specific, BindingContext>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<TestModule?, ModuleDescriptorImpl>
    <R : Any> -> Pair<Specific, BindingContext>

'component1' @ [165:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>.component1(): BaseDiagnosticsTest.TestModule? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestModule?
    <V> -> ModuleDescriptorImpl

'component2' @ [165:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>.component2(): ModuleDescriptorImpl defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestModule?
    <V> -> ModuleDescriptorImpl

'moduleDescriptor' @ [166:32] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[LocalVariableDescriptor]

'getCapability' @ [166:49] ==> public open fun <T> getCapability(capability: ModuleDescriptor.Capability<MultiTargetPlatform>): MultiTargetPlatform? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultiTargetPlatform

'CAPABILITY' @ [166:83] ==> @field:JvmField public final val CAPABILITY: ModuleDescriptor.Capability<MultiTargetPlatform> defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Companion[DeserializedPropertyDescriptor]

'if (platform is MultiTargetPlatform.Specific) platform to moduleBindings[testModule]!!
                else null' @ [167:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<MultiTargetPlatform.Specific, BindingContext>?, elseBranch: Pair<MultiTargetPlatform.Specific, BindingContext>?): Pair<MultiTargetPlatform.Specific, BindingContext>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Specific, BindingContext>?

'platform' @ [167:21] ==> val platform: MultiTargetPlatform? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[LocalVariableDescriptor]

'platform' @ [167:63] ==> val platform: MultiTargetPlatform? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[LocalVariableDescriptor]

'moduleBindings' @ [167:75] ==> val moduleBindings: HashMap<BaseDiagnosticsTest.TestModule?, BindingContext> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testModule' @ [167:90] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[LocalVariableDescriptor]

'ok' @ [170:13] ==> var ok: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'ok' @ [170:18] ==> var ok: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'testFile' @ [170:25] ==> val testFile: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'getActualText' @ [170:34] ==> public final fun getActualText(bindingContext: BindingContext, implementingModulesBindings: List<Pair<MultiTargetPlatform, BindingContext>>, actualText: StringBuilder /* = StringBuilder */, skipJvmSignatureDiagnostics: Boolean): Boolean defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[SimpleFunctionDescriptorImpl]

'moduleBindings' @ [171:21] ==> val moduleBindings: HashMap<BaseDiagnosticsTest.TestModule?, BindingContext> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'module' @ [171:36] ==> val module: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'implementingModulesBindings' @ [171:47] ==> val implementingModulesBindings: List<Pair<MultiTargetPlatform.Specific, BindingContext>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'actualText' @ [171:76] ==> val actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'shouldSkipJvmSignatureDiagnostics' @ [172:21] ==> protected open fun shouldSkipJvmSignatureDiagnostics(groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>>): Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'groupedByModule' @ [172:55] ==> val groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'isCommonModule' @ [172:75] ==> val isCommonModule: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'File' @ [178:32] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'+' @ [178:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getNameWithoutExtension' @ [178:46] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'testDataFile' @ [178:70] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'absolutePath' @ [178:83] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'checkDynamicCallDescriptors' @ [179:13] ==> private final fun checkDynamicCallDescriptors(expectedFile: File, testFiles: List<BaseDiagnosticsTest.TestFile>): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'expectedFile' @ [179:41] ==> val expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'files' @ [179:55] ==> value-parameter files: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'exceptionFromDynamicCallDescriptorsValidation' @ [182:13] ==> var exceptionFromDynamicCallDescriptorsValidation: Throwable? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'e' @ [182:61] ==> val e: Throwable defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'assertEqualsToFile' @ [185:25] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testDataFile' @ [185:44] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'actualText' @ [185:58] ==> val actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'toString' @ [185:69] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertTrue' @ [187:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaMethodDescriptor]

'ok' @ [187:66] ==> var ok: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'exceptionFromDescriptorValidation' @ [190:9] ==> var exceptionFromDescriptorValidation: Throwable? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'let' @ [190:44] ==> @InlineOnly public inline fun <T, R> Throwable.let(block: (Throwable) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Throwable
    <R> -> Nothing

'it' @ [190:56] ==> value-parameter it: Throwable defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[ValueParameterDescriptorImpl]

'exceptionFromLazyResolveLogValidation' @ [191:9] ==> var exceptionFromLazyResolveLogValidation: Throwable? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'let' @ [191:48] ==> @InlineOnly public inline fun <T, R> Throwable.let(block: (Throwable) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Throwable
    <R> -> Nothing

'it' @ [191:60] ==> value-parameter it: Throwable defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[ValueParameterDescriptorImpl]

'exceptionFromDynamicCallDescriptorsValidation' @ [192:9] ==> var exceptionFromDynamicCallDescriptorsValidation: Throwable? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'let' @ [192:56] ==> @InlineOnly public inline fun <T, R> Throwable.let(block: (Throwable) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Throwable
    <R> -> Nothing

'it' @ [192:68] ==> value-parameter it: Throwable defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck.<anonymous>[ValueParameterDescriptorImpl]

'performAdditionalChecksAfterDiagnostics' @ [194:9] ==> protected open fun performAdditionalChecksAfterDiagnostics(testDataFile: File, testFiles: List<BaseDiagnosticsTest.TestFile>, moduleFiles: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>>, moduleDescriptors: Map<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl>, moduleBindings: Map<BaseDiagnosticsTest.TestModule?, BindingContext>): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testDataFile' @ [194:49] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'files' @ [194:63] ==> value-parameter files: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[ValueParameterDescriptorImpl]

'groupedByModule' @ [194:70] ==> val groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'modules' @ [194:87] ==> val modules: MutableMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'moduleBindings' @ [194:96] ==> val moduleBindings: HashMap<BaseDiagnosticsTest.TestModule?, BindingContext> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeAndCheck[LocalVariableDescriptor]

'module' @ [209:22] ==> value-parameter module: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[ValueParameterDescriptorImpl]

'file' @ [210:27] ==> val file: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'customLanguageVersionSettings' @ [210:32] ==> public final val customLanguageVersionSettings: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'current' @ [211:17] ==> val current: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'result' @ [212:21] ==> var result: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'result' @ [212:39] ==> var result: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'current' @ [212:49] ==> val current: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'fail' @ [213:28] ==> public open fun fail(p0: (String..String?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'+' @ [214:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'LANGUAGE_DIRECTIVE' @ [214:68] ==> public final val LANGUAGE_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'API_VERSION_DIRECTIVE' @ [214:91] ==> public final val API_VERSION_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'result' @ [218:17] ==> var result: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'current' @ [218:26] ==> val current: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'result' @ [222:16] ==> var result: LanguageVersionSettings? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'DiagnosticTestLanguageVersionSettings' @ [222:46] ==> public constructor DiagnosticTestLanguageVersionSettings(languageFeatures: Map<LanguageFeature, LanguageFeature.State>, apiVersion: ApiVersion, languageVersion: LanguageVersion) defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.DiagnosticTestLanguageVersionSettings[ClassConstructorDescriptorImpl]

'DEFAULT_DIAGNOSTIC_TESTS_FEATURES' @ [223:37] ==> public final val DEFAULT_DIAGNOSTIC_TESTS_FEATURES: Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.Companion[PropertyDescriptorImpl]

'DEFAULT' @ [224:45] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'apiVersion' @ [224:53] ==> public open val apiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedPropertyDescriptor]

'DEFAULT' @ [225:45] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'languageVersion' @ [225:53] ==> public open val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedPropertyDescriptor]

'RecursiveDescriptorComparator' @ [230:26] ==> public constructor RecursiveDescriptorComparator(@NotNull conf: RecursiveDescriptorComparator.Configuration) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaClassConstructorDescriptor]

'RECURSIVE_ALL' @ [230:56] ==> public final val RECURSIVE_ALL: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaPropertyDescriptor]

'StringBuilder' @ [232:26] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'testFiles' @ [234:26] ==> value-parameter testFiles: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[ValueParameterDescriptorImpl]

'testFile' @ [235:32] ==> val testFile: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[LocalVariableDescriptor]

'dynamicCallDescriptors' @ [235:41] ==> public final val dynamicCallDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'serializer' @ [236:40] ==> val serializer: RecursiveDescriptorComparator defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[LocalVariableDescriptor]

'serializeRecursively' @ [236:51] ==> public open fun serializeRecursively(@NotNull declarationDescriptor: DeclarationDescriptor): (String..String?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'descriptor' @ [236:72] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[LocalVariableDescriptor]

'actualText' @ [237:17] ==> val actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[LocalVariableDescriptor]

'append' @ [237:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'actualSerialized' @ [237:35] ==> val actualSerialized: (String..String?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[LocalVariableDescriptor]

'actualText' @ [241:13] ==> val actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[LocalVariableDescriptor]

'isNotEmpty' @ [241:24] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedFile' @ [241:40] ==> value-parameter expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[ValueParameterDescriptorImpl]

'exists' @ [241:53] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertEqualsToFile' @ [242:29] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedFile' @ [242:48] ==> value-parameter expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[ValueParameterDescriptorImpl]

'actualText' @ [242:62] ==> val actualText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkDynamicCallDescriptors[LocalVariableDescriptor]

'toString' @ [242:73] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'groupedByModule' @ [247:13] ==> value-parameter groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.shouldSkipJvmSignatureDiagnostics[ValueParameterDescriptorImpl]

'size' @ [247:29] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'getLazyLogFile' @ [251:36] ==> private final fun getLazyLogFile(testDataFile: File): File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testDataFile' @ [251:51] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkLazyResolveLog[ValueParameterDescriptorImpl]

'assertEqualsToFile' @ [252:33] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String, @NotNull sanitizer: ((String..String?)) -> (String..String?)): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedFile' @ [252:52] ==> val expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkLazyResolveLog[LocalVariableDescriptor]

'lazyOperationsLog' @ [252:66] ==> value-parameter lazyOperationsLog: LazyOperationsLog defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkLazyResolveLog[ValueParameterDescriptorImpl]

'getText' @ [252:84] ==> public final fun getText(): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'HASH_SANITIZER' @ [252:95] ==> private final val HASH_SANITIZER: (String) -> String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.Companion[PropertyDescriptorImpl]

'e' @ [256:17] ==> val e: Throwable defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkLazyResolveLog[LocalVariableDescriptor]

'File' @ [260:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'+' @ [260:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getNameWithoutExtension' @ [260:27] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'testDataFile' @ [260:51] ==> value-parameter testDataFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getLazyLogFile[ValueParameterDescriptorImpl]

'absolutePath' @ [260:64] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'Suppress' @ [269:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'files' @ [270:21] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'separateModules' @ [279:13] ==> value-parameter separateModules: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'TopDownAnalyzerFacadeForJVM' @ [280:20] ==> public object TopDownAnalyzerFacadeForJVM defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'analyzeFilesWithJavaIntegration' @ [280:48] ==> @JvmStatic @JvmOverloads public final fun analyzeFilesWithJavaIntegration(project: Project, files: Collection<KtFile>, trace: BindingTrace, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider, declarationProviderFactory: (StorageManager, Collection<KtFile>) -> DeclarationProviderFactory = ..., sourceModuleSearchScope: GlobalSearchScope = ...): AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[DeserializedSimpleFunctionDescriptor]

'moduleContext' @ [281:21] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'project' @ [281:35] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'files' @ [282:21] ==> var files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'moduleTrace' @ [283:21] ==> value-parameter moduleTrace: BindingTrace defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'environment' @ [284:21] ==> protected final lateinit var environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[PropertyDescriptorImpl]

'configuration' @ [284:33] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'copy' @ [284:47] ==> public open fun copy(): (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'apply' @ [284:54] ==> @InlineOnly public inline fun <T> (CompilerConfiguration..CompilerConfiguration?).apply(block: (CompilerConfiguration..CompilerConfiguration?).() -> Unit): (CompilerConfiguration..CompilerConfiguration?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.config.CompilerConfiguration..org.jetbrains.kotlin.config.CompilerConfiguration?)

'this' @ [284:62] ==> <this> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents.<anonymous>[ReceiverParameterDescriptorImpl]

'languageVersionSettings' @ [284:67] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'languageVersionSettings' @ [284:93] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'environment' @ [285:21] ==> protected final lateinit var environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[PropertyDescriptorImpl]

'createPackagePartProvider' @ [285:34] ==> public final fun createPackagePartProvider(scope: GlobalSearchScope): JvmPackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'moduleContext' @ [289:32] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'module' @ [289:46] ==> public abstract val module: ModuleDescriptor defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'moduleDescriptor' @ [291:24] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'getMultiTargetPlatform' @ [291:41] ==> public fun ModuleDescriptor.getMultiTargetPlatform(): MultiTargetPlatform? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'if (platform == MultiTargetPlatform.Common) {
            return DefaultAnalyzerFacade.analyzeFiles(
                    files, moduleDescriptor.name, true, languageVersionSettings,
                    mapOf(
                            MultiTargetPlatform.CAPABILITY to MultiTargetPlatform.Common,
                            MODULE_FILES to files
                    )
            ) { _, _ ->
                // TODO
                PackagePartProvider.Empty
            }
        }
        else if (platform != null) {
            // TODO: analyze with the correct platform, not always JVM
            files += getCommonCodeFilesForPlatformSpecificModule(moduleDescriptor)
        }' @ [292:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'platform' @ [292:13] ==> val platform: MultiTargetPlatform? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'Common' @ [292:45] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'DefaultAnalyzerFacade' @ [293:20] ==> public object DefaultAnalyzerFacade : AnalyzerFacade defined in org.jetbrains.kotlin.analyzer.common[FakeCallableDescriptorForObject]

'analyzeFiles' @ [293:42] ==> public final fun analyzeFiles(files: Collection<KtFile>, moduleName: Name, dependOnBuiltIns: Boolean, languageVersionSettings: LanguageVersionSettings, capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ..., packagePartProviderFactory: (ModuleInfo, ModuleContent) -> PackagePartProvider): AnalysisResult defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade[DeserializedSimpleFunctionDescriptor]

'files' @ [294:21] ==> var files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'moduleDescriptor' @ [294:28] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'name' @ [294:45] ==> public final val ModuleDescriptorImpl.name: Name[MyPropertyDescriptor]

'languageVersionSettings' @ [294:57] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'mapOf' @ [295:21] ==> public fun <K, V> mapOf(vararg pairs: Pair<ModuleDescriptor.Capability<*>, Any>): Map<ModuleDescriptor.Capability<*>, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Capability<*>
    <V> -> Any

'MultiTargetPlatform' @ [296:29] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'CAPABILITY' @ [296:49] ==> @field:JvmField public final val CAPABILITY: ModuleDescriptor.Capability<MultiTargetPlatform> defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Companion[DeserializedPropertyDescriptor]

'Common' @ [296:83] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'MODULE_FILES' @ [297:29] ==> private final val MODULE_FILES: ModuleDescriptor.Capability<List<KtFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.Companion[PropertyDescriptorImpl]

'files' @ [297:45] ==> var files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'Empty' @ [301:37] ==> public object Empty : PackagePartProvider defined in org.jetbrains.kotlin.descriptors.PackagePartProvider[FakeCallableDescriptorForObject]

'platform' @ [304:18] ==> val platform: MultiTargetPlatform? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'files' @ [306:13] ==> var files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'getCommonCodeFilesForPlatformSpecificModule' @ [306:22] ==> private final fun getCommonCodeFilesForPlatformSpecificModule(moduleDescriptor: ModuleDescriptorImpl): List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [306:66] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'allScope' @ [309:52] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'moduleContext' @ [309:61] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'project' @ [309:75] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'SingleModuleClassResolver' @ [310:35] ==> public constructor SingleModuleClassResolver() defined in org.jetbrains.kotlin.load.java.lazy.SingleModuleClassResolver[DeserializedClassConstructorDescriptor]

'createContainerForTopDownAnalyzerForJvm' @ [311:25] ==> public fun createContainerForTopDownAnalyzerForJvm(moduleContext: ModuleContext, bindingTrace: BindingTrace, declarationProviderFactory: DeclarationProviderFactory, moduleContentScope: GlobalSearchScope, lookupTracker: LookupTracker, packagePartProvider: PackagePartProvider, moduleClassResolver: ModuleClassResolver, jvmTarget: JvmTarget, languageVersionSettings: LanguageVersionSettings, configureJavaClassFinder: (StorageComponentContainer.() -> Unit)? = ...): ComponentProvider defined in org.jetbrains.kotlin.frontend.java.di[DeserializedSimpleFunctionDescriptor]

'moduleContext' @ [312:17] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'moduleTrace' @ [313:17] ==> value-parameter moduleTrace: BindingTrace defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'FileBasedDeclarationProviderFactory' @ [314:17] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull p0: StorageManager, @NotNull p1: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'moduleContext' @ [314:53] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'storageManager' @ [314:67] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'files' @ [314:83] ==> var files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'moduleContentScope' @ [315:17] ==> val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'DO_NOTHING' @ [316:31] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'environment' @ [317:17] ==> protected final lateinit var environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[PropertyDescriptorImpl]

'createPackagePartProvider' @ [317:29] ==> public final fun createPackagePartProvider(scope: GlobalSearchScope): JvmPackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'moduleContentScope' @ [317:55] ==> val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'moduleClassResolver' @ [318:17] ==> val moduleClassResolver: SingleModuleClassResolver defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'JVM_1_6' @ [319:27] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'languageVersionSettings' @ [320:17] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'container' @ [322:9] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'initJvmBuiltInsForTopDownAnalysis' @ [322:19] ==> public fun ComponentProvider.initJvmBuiltInsForTopDownAnalysis(): Unit defined in org.jetbrains.kotlin.frontend.java.di[DeserializedSimpleFunctionDescriptor]

'moduleClassResolver' @ [323:9] ==> val moduleClassResolver: SingleModuleClassResolver defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'resolver' @ [323:29] ==> public final lateinit var resolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.load.java.lazy.SingleModuleClassResolver[DeserializedPropertyDescriptor]

'container' @ [323:40] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'get' @ [323:50] ==> public inline fun <reified T : Any> ComponentProvider.get(): JavaDescriptorResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaDescriptorResolver

'moduleDescriptor' @ [325:9] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'initialize' @ [325:26] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'CompositePackageFragmentProvider' @ [325:37] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'listOf' @ [325:70] ==> public fun <T> listOf(vararg elements: PackageFragmentProvider): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'container' @ [326:17] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'get' @ [326:27] ==> public inline fun <reified T : Any> ComponentProvider.get(): KotlinCodeAnalyzer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinCodeAnalyzer

'packageFragmentProvider' @ [326:53] ==> public final val KotlinCodeAnalyzer.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'container' @ [327:17] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'get' @ [327:27] ==> public inline fun <reified T : Any> ComponentProvider.get(): JavaDescriptorResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaDescriptorResolver

'packageFragmentProvider' @ [327:57] ==> public final val packageFragmentProvider: LazyJavaPackageFragmentProvider defined in org.jetbrains.kotlin.resolve.jvm.JavaDescriptorResolver[DeserializedPropertyDescriptor]

'container' @ [330:9] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'get' @ [330:19] ==> public inline fun <reified T : Any> ComponentProvider.get(): LazyTopDownAnalyzer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LazyTopDownAnalyzer

'analyzeDeclarations' @ [330:46] ==> public final fun analyzeDeclarations(topDownAnalysisMode: TopDownAnalysisMode, declarations: Collection<PsiElement>, outerDataFlowInfo: DataFlowInfo = ...): TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[DeserializedSimpleFunctionDescriptor]

'TopLevelDeclarations' @ [330:86] ==> enum entry TopLevelDeclarations defined in org.jetbrains.kotlin.resolve.TopDownAnalysisMode[FakeCallableDescriptorForObject]

'files' @ [330:108] ==> var files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'AnalysisResult' @ [332:16] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'success' @ [332:31] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'moduleTrace' @ [332:39] ==> value-parameter moduleTrace: BindingTrace defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[ValueParameterDescriptorImpl]

'bindingContext' @ [332:51] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'moduleDescriptor' @ [332:67] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.analyzeModuleContents[LocalVariableDescriptor]

'Suppress' @ [338:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'moduleDescriptor' @ [339:28] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[ValueParameterDescriptorImpl]

'testOnly_AllDependentModules' @ [339:45] ==> @Deprecated public final val testOnly_AllDependentModules: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'ArrayList' @ [343:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtFile

'dependencies' @ [344:28] ==> val dependencies: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[LocalVariableDescriptor]

'dependency' @ [345:17] ==> val dependency: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[LocalVariableDescriptor]

'getCapability' @ [345:28] ==> public open fun <T> getCapability(capability: ModuleDescriptor.Capability<MultiTargetPlatform>): MultiTargetPlatform? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultiTargetPlatform

'CAPABILITY' @ [345:62] ==> @field:JvmField public final val CAPABILITY: ModuleDescriptor.Capability<MultiTargetPlatform> defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Companion[DeserializedPropertyDescriptor]

'Common' @ [345:97] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'dependency' @ [346:29] ==> val dependency: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[LocalVariableDescriptor]

'getCapability' @ [346:40] ==> public open fun <T> getCapability(capability: ModuleDescriptor.Capability<List<KtFile>>): List<KtFile>? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KtFile>

'MODULE_FILES' @ [346:54] ==> private final val MODULE_FILES: ModuleDescriptor.Capability<List<KtFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.Companion[PropertyDescriptorImpl]

'error' @ [347:32] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dependency' @ [347:97] ==> val dependency: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[LocalVariableDescriptor]

'result' @ [348:17] ==> val result: ArrayList<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[LocalVariableDescriptor]

'addAll' @ [348:24] ==> public open fun addAll(elements: Collection<KtFile>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'files' @ [348:31] ==> val files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[LocalVariableDescriptor]

'result' @ [352:16] ==> val result: ArrayList<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getCommonCodeFilesForPlatformSpecificModule[LocalVariableDescriptor]

'skipDescriptorsValidation' @ [360:13] ==> protected open fun skipDescriptorsValidation(): Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testFiles' @ [361:13] ==> value-parameter testFiles: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'any' @ [361:23] ==> public inline fun <T> Iterable<BaseDiagnosticsTest.TestFile>.any(predicate: (BaseDiagnosticsTest.TestFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'isDirectiveDefined' @ [361:59] ==> public open fun isDirectiveDefined(fileText: (String..String?), directive: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [361:78] ==> value-parameter file: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'expectedText' @ [361:83] ==> public final val expectedText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'assertFalse' @ [362:13] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaMethodDescriptor]

'expectedFile' @ [362:85] ==> value-parameter expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'expectedFile' @ [362:100] ==> value-parameter expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'exists' @ [362:113] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'RecursiveDescriptorComparator' @ [366:26] ==> public constructor RecursiveDescriptorComparator(@NotNull conf: RecursiveDescriptorComparator.Configuration) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaClassConstructorDescriptor]

'createdAffectedPackagesConfiguration' @ [366:56] ==> private final fun createdAffectedPackagesConfiguration(testFiles: List<BaseDiagnosticsTest.TestFile>, modules: Collection<ModuleDescriptor>): RecursiveDescriptorComparator.Configuration defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testFiles' @ [366:93] ==> value-parameter testFiles: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'modules' @ [366:104] ==> value-parameter modules: Map<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'values' @ [366:112] ==> public abstract val values: Collection<ModuleDescriptorImpl> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'modules' @ [368:33] ==> value-parameter modules: Map<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'size' @ [368:41] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'testFiles' @ [371:18] ==> value-parameter testFiles: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'flatMap' @ [371:28] ==> public inline fun <T, R> Iterable<BaseDiagnosticsTest.TestFile>.flatMap(transform: (BaseDiagnosticsTest.TestFile) -> Iterable<FqName>): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R> -> FqName

'findListWithPrefixes' @ [372:43] ==> @NotNull public open fun findListWithPrefixes(@NotNull fileText: String, @NotNull vararg prefixes: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'it' @ [372:64] ==> value-parameter it: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'expectedText' @ [372:67] ==> public final val expectedText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[PropertyDescriptorImpl]

'map' @ [372:103] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> FqName

'FqName' @ [373:25] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'it' @ [373:32] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [373:35] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ROOT' @ [375:28] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'toSet' @ [375:34] ==> public fun <T> Iterable<(FqName..FqName?)>.toSet(): Set<(FqName..FqName?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'packages' @ [377:29] ==> val packages: Set<(FqName..FqName?)> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'keysToMap' @ [377:38] ==> public fun <K, V> Iterable<(FqName..FqName?)>.keysToMap(value: ((FqName..FqName?)) -> StringBuilder /* = StringBuilder */): Map<(FqName..FqName?), StringBuilder /* = StringBuilder */> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V> -> StringBuilder

'StringBuilder' @ [377:50] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'modules' @ [379:29] ==> value-parameter modules: Map<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'keys' @ [379:37] ==> public abstract val keys: Set<BaseDiagnosticsTest.TestModule?> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sortedWith' @ [379:42] ==> public fun <T> Iterable<BaseDiagnosticsTest.TestModule?>.sortedWith(comparator: Comparator<in BaseDiagnosticsTest.TestModule?> /* = Comparator<in BaseDiagnosticsTest.TestModule?> */): List<BaseDiagnosticsTest.TestModule?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule?

'Comparator' @ [379:53] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: (BaseDiagnosticsTest.TestModule?, BaseDiagnosticsTest.TestModule?) -> Int): Comparator<BaseDiagnosticsTest.TestModule?> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> TestModule?

'when {
                x == null && y == null -> 0
                x == null && y != null -> -1
                x != null && y == null -> 1
                x != null && y != null -> x.compareTo(y)
                else -> error("Unreachable")
            }' @ [380:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'x' @ [381:17] ==> value-parameter x: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'y' @ [381:30] ==> value-parameter y: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [382:17] ==> value-parameter x: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'y' @ [382:30] ==> value-parameter y: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [382:43] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'x' @ [383:17] ==> value-parameter x: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'y' @ [383:30] ==> value-parameter y: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [384:17] ==> value-parameter x: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'y' @ [384:30] ==> value-parameter y: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [384:43] ==> value-parameter x: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'compareTo' @ [384:45] ==> public open fun compareTo(other: BaseDiagnosticsTest.TestModule): Int defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[SimpleFunctionDescriptorImpl]

'y' @ [384:55] ==> value-parameter y: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [385:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'component1' @ [389:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(FqName..FqName?), StringBuilder /* = StringBuilder */>.component1(): (FqName..FqName?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V> -> StringBuilder

'component2' @ [389:28] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(FqName..FqName?), StringBuilder /* = StringBuilder */>.component2(): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V> -> StringBuilder

'textByPackage' @ [389:44] ==> val textByPackage: Map<(FqName..FqName?), StringBuilder /* = StringBuilder */> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'entries' @ [389:58] ==> public abstract val entries: Set<Map.Entry<(FqName..FqName?), StringBuilder /* = StringBuilder */>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sortedModules' @ [390:26] ==> val sortedModules: List<BaseDiagnosticsTest.TestModule?> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'iterator' @ [390:40] ==> public abstract fun iterator(): Iterator<BaseDiagnosticsTest.TestModule?> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'module' @ [391:20] ==> val module: Iterator<BaseDiagnosticsTest.TestModule?> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'hasNext' @ [391:27] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'modules' @ [392:40] ==> value-parameter modules: Map<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'module' @ [392:48] ==> val module: Iterator<BaseDiagnosticsTest.TestModule?> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'next' @ [392:55] ==> public abstract operator fun next(): BaseDiagnosticsTest.TestModule? defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [394:32] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'getPackage' @ [394:49] ==> public open fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'packageName' @ [394:60] ==> val packageName: (FqName..FqName?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'assertFalse' @ [395:17] ==> public open fun assertFalse(p0: Boolean): Unit defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaMethodDescriptor]

'aPackage' @ [395:29] ==> val aPackage: PackageViewDescriptor defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'isEmpty' @ [395:38] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedSimpleFunctionDescriptor]

'isMultiModuleTest' @ [397:21] ==> val isMultiModuleTest: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'packageText' @ [398:21] ==> val packageText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'append' @ [398:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'format' @ [398:47] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [398:79] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'name' @ [398:96] ==> public final val ModuleDescriptorImpl.name: Name[MyPropertyDescriptor]

'comparator' @ [401:40] ==> val comparator: RecursiveDescriptorComparator defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'serializeRecursively' @ [401:51] ==> public open fun serializeRecursively(@NotNull declarationDescriptor: DeclarationDescriptor): (String..String?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'aPackage' @ [401:72] ==> val aPackage: PackageViewDescriptor defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'packageText' @ [402:17] ==> val packageText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'append' @ [402:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'actualSerialized' @ [402:36] ==> val actualSerialized: (String..String?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'isMultiModuleTest' @ [404:21] ==> val isMultiModuleTest: Boolean defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'module' @ [404:42] ==> val module: Iterator<BaseDiagnosticsTest.TestModule?> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'hasNext' @ [404:49] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'packageText' @ [405:21] ==> val packageText: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'append' @ [405:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'textByPackage' @ [410:31] ==> val textByPackage: Map<(FqName..FqName?), StringBuilder /* = StringBuilder */> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'values' @ [410:45] ==> public abstract val values: Collection<StringBuilder /* = StringBuilder */> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'joinToString' @ [410:52] ==> public fun <T> Iterable<StringBuilder /* = StringBuilder */>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((StringBuilder /* = StringBuilder */) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder

'getLineBreakCount' @ [412:36] ==> @Contract public open fun getLineBreakCount(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'allPackagesText' @ [412:54] ==> val allPackagesText: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'assert' @ [413:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lineCount' @ [413:16] ==> val lineCount: Int defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'+' @ [414:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'lineCount' @ [414:57] ==> val lineCount: Int defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'assertEqualsToFile' @ [419:25] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedFile' @ [419:44] ==> value-parameter expectedFile: File defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[ValueParameterDescriptorImpl]

'allPackagesText' @ [419:58] ==> val allPackagesText: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.validateAndCompareDescriptorWithFile[LocalVariableDescriptor]

'getTopLevelPackagesFromFileList' @ [428:29] ==> private final fun getTopLevelPackagesFromFileList(files: List<KtFile>): Set<Name> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'getKtFiles' @ [428:61] ==> protected final fun getKtFiles(testFiles: List<BaseDiagnosticsTest.TestFile>, includeExtras: Boolean): List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testFiles' @ [428:72] ==> value-parameter testFiles: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration[ValueParameterDescriptorImpl]

'Predicate' @ [430:30] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (DeclarationDescriptor) -> Boolean): Predicate<DeclarationDescriptor> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> DeclarationDescriptor

'getContainingModuleOrNull' @ [431:42] ==> @Nullable public open fun getContainingModuleOrNull(@NotNull p0: DeclarationDescriptor): ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [431:68] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [432:17] ==> val module: ModuleDescriptor? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration.<anonymous>[LocalVariableDescriptor]

'modules' @ [432:28] ==> value-parameter modules: Collection<ModuleDescriptor> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration[ValueParameterDescriptorImpl]

'descriptor' @ [434:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [435:30] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [435:41] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'fqName' @ [436:34] ==> val fqName: FqName defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration.<anonymous>[LocalVariableDescriptor]

'isRoot' @ [436:41] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'fqName' @ [436:51] ==> val fqName: FqName defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration.<anonymous>[LocalVariableDescriptor]

'pathSegments' @ [436:58] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'first' @ [436:73] ==> public fun <T> List<(Name..Name?)>.first(): (Name..Name?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'packagesNames' @ [436:84] ==> val packagesNames: Set<Name> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration[LocalVariableDescriptor]

'RECURSIVE' @ [442:16] ==> public final val RECURSIVE: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaPropertyDescriptor]

'filterRecursion' @ [442:26] ==> public open fun filterRecursion(@NotNull stepIntoFilter: Predicate<(DeclarationDescriptor..DeclarationDescriptor?)>): (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator.Configuration[JavaMethodDescriptor]

'stepIntoFilter' @ [442:42] ==> val stepIntoFilter: Predicate<DeclarationDescriptor> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createdAffectedPackagesConfiguration[LocalVariableDescriptor]

'withValidationStrategy' @ [442:58] ==> public open fun withValidationStrategy(@NotNull validationStrategy: DescriptorValidator.ValidationVisitor): (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator.Configuration[JavaMethodDescriptor]

'errorTypesAllowed' @ [442:119] ==> public open fun errorTypesAllowed(): (DescriptorValidator.ValidationVisitor..DescriptorValidator.ValidationVisitor?) defined in org.jetbrains.kotlin.test.util.DescriptorValidator.ValidationVisitor[JavaMethodDescriptor]

'files' @ [446:13] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getTopLevelPackagesFromFileList[ValueParameterDescriptorImpl]

'mapTo' @ [446:19] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<KtFile>.mapTo(destination: LinkedHashSet<Name>, transform: (KtFile) -> Name): LinkedHashSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> Name
    <C : MutableCollection<in R>> -> LinkedHashSet<Name>

'LinkedHashSet' @ [446:25] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Name

'file' @ [447:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.getTopLevelPackagesFromFileList.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [447:22] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'pathSegments' @ [447:36] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'firstOrNull' @ [447:51] ==> public fun <T> List<(Name..Name?)>.firstOrNull(): Name? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'ROOT_PACKAGE' @ [447:81] ==> public final val ROOT_PACKAGE: (Name..Name?) defined in org.jetbrains.kotlin.name.SpecialNames[JavaPropertyDescriptor]

'HashMap' @ [454:23] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TestModule?
    <V : (Any..Any?)> -> ModuleDescriptorImpl

'groupedByModule' @ [456:28] ==> value-parameter groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[ValueParameterDescriptorImpl]

'keys' @ [456:44] ==> public abstract val keys: Set<BaseDiagnosticsTest.TestModule?> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'if (testModule == null)
                createSealedModule(storageManager)
            else
                createModule(testModule.name, storageManager)' @ [457:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleDescriptorImpl, elseBranch: ModuleDescriptorImpl): ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleDescriptorImpl

'testModule' @ [457:30] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'createSealedModule' @ [458:17] ==> protected open fun createSealedModule(storageManager: StorageManager): ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'storageManager' @ [458:36] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[ValueParameterDescriptorImpl]

'createModule' @ [460:17] ==> protected open fun createModule(moduleName: String, storageManager: StorageManager): ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'testModule' @ [460:30] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'name' @ [460:41] ==> public final val name: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[PropertyDescriptorImpl]

'storageManager' @ [460:47] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[ValueParameterDescriptorImpl]

'modules' @ [462:13] ==> val modules: HashMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'put' @ [462:21] ==> public open fun put(key: BaseDiagnosticsTest.TestModule?, value: ModuleDescriptorImpl): ModuleDescriptorImpl? defined in java.util.HashMap[JavaMethodDescriptor]

'testModule' @ [462:25] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'module' @ [462:37] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'groupedByModule' @ [465:28] ==> value-parameter groupedByModule: Map<BaseDiagnosticsTest.TestModule?, List<BaseDiagnosticsTest.TestFile>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[ValueParameterDescriptorImpl]

'keys' @ [465:44] ==> public abstract val keys: Set<BaseDiagnosticsTest.TestModule?> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'testModule' @ [466:17] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'modules' @ [468:26] ==> val modules: HashMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'testModule' @ [468:34] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'ArrayList' @ [469:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ModuleDescriptorImpl

'dependencies' @ [470:13] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'add' @ [470:26] ==> public open fun add(element: ModuleDescriptorImpl): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'module' @ [470:30] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'testModule' @ [471:32] ==> val testModule: BaseDiagnosticsTest.TestModule? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'getDependencies' @ [471:43] ==> public final fun getDependencies(): MutableList<BaseDiagnosticsTest.TestModule> defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestModule[SimpleFunctionDescriptorImpl]

'dependencies' @ [472:17] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'add' @ [472:30] ==> public open fun add(element: ModuleDescriptorImpl): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'modules' @ [472:34] ==> val modules: HashMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'dependency' @ [472:42] ==> val dependency: BaseDiagnosticsTest.TestModule defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'dependencies' @ [475:13] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'add' @ [475:26] ==> public open fun add(element: ModuleDescriptorImpl): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'module' @ [475:30] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'builtIns' @ [475:37] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [475:46] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'dependencies' @ [476:13] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'addAll' @ [476:26] ==> public open fun addAll(elements: Collection<ModuleDescriptorImpl>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getAdditionalDependencies' @ [476:33] ==> protected open fun getAdditionalDependencies(module: ModuleDescriptorImpl): List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'module' @ [476:59] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'module' @ [477:13] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'setDependencies' @ [477:20] ==> public final fun setDependencies(descriptors: List<ModuleDescriptorImpl>): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'dependencies' @ [477:36] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'modules' @ [480:16] ==> val modules: HashMap<BaseDiagnosticsTest.TestModule?, ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModules[LocalVariableDescriptor]

'emptyList' @ [484:13] ==> public fun <T> emptyList(): List<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'moduleName' @ [487:26] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[ValueParameterDescriptorImpl]

'substringAfterLast' @ [487:37] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (nameSuffix.isEmpty()) null
                else if (nameSuffix == "common") MultiTargetPlatform.Common else MultiTargetPlatform.Specific(nameSuffix.toUpperCase())' @ [489:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MultiTargetPlatform?, elseBranch: MultiTargetPlatform?): MultiTargetPlatform?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MultiTargetPlatform?

'nameSuffix' @ [489:21] ==> val nameSuffix: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[LocalVariableDescriptor]

'isEmpty' @ [489:32] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (nameSuffix == "common") MultiTargetPlatform.Common else MultiTargetPlatform.Specific(nameSuffix.toUpperCase())' @ [490:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MultiTargetPlatform, elseBranch: MultiTargetPlatform): MultiTargetPlatform[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MultiTargetPlatform

'nameSuffix' @ [490:26] ==> val nameSuffix: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[LocalVariableDescriptor]

'Common' @ [490:70] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Specific' @ [490:102] ==> public constructor Specific(platform: String) defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedClassConstructorDescriptor]

'nameSuffix' @ [490:111] ==> val nameSuffix: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[LocalVariableDescriptor]

'toUpperCase' @ [490:122] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ModuleDescriptorImpl' @ [491:16] ==> @JvmOverloads public constructor ModuleDescriptorImpl(moduleName: Name, storageManager: StorageManager, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform? = ..., capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ...) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedClassConstructorDescriptor]

'special' @ [491:42] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'moduleName' @ [491:53] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[ValueParameterDescriptorImpl]

'storageManager' @ [491:68] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[ValueParameterDescriptorImpl]

'JvmBuiltIns' @ [491:84] ==> @JvmOverloads public constructor JvmBuiltIns(storageManager: StorageManager, loadBuiltInsFromCurrentClassLoader: Boolean = ...) defined in org.jetbrains.kotlin.platform.JvmBuiltIns[DeserializedClassConstructorDescriptor]

'storageManager' @ [491:96] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[ValueParameterDescriptorImpl]

'platform' @ [491:113] ==> val platform: MultiTargetPlatform? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createModule[LocalVariableDescriptor]

'createModule' @ [495:13] ==> protected open fun createModule(moduleName: String, storageManager: StorageManager): ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'storageManager' @ [495:41] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createSealedModule[ValueParameterDescriptorImpl]

'apply' @ [495:57] ==> @InlineOnly public inline fun <T> ModuleDescriptorImpl.apply(block: ModuleDescriptorImpl.() -> Unit): ModuleDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'setDependencies' @ [496:17] ==> public final fun setDependencies(vararg descriptors: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'this' @ [496:33] ==> <this> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.createSealedModule.<anonymous>[ReceiverParameterDescriptorImpl]

'builtIns' @ [496:39] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [496:48] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'ktFiles' @ [500:13] ==> value-parameter ktFiles: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[ValueParameterDescriptorImpl]

'any' @ [500:21] ==> public inline fun <T> Iterable<KtFile>.any(predicate: (KtFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'getSyntaxErrorRanges' @ [500:50] ==> public open fun getSyntaxErrorRanges(@NotNull p0: PsiElement): (MutableList<(PsiErrorElement..PsiErrorElement?)>..List<(PsiErrorElement..PsiErrorElement?)>?) defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'file' @ [500:71] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [500:77] ==> @InlineOnly public inline fun <T> Collection<(PsiErrorElement..PsiErrorElement?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiErrorElement..com.intellij.psi.PsiErrorElement?)

'bindingContext' @ [502:36] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[ValueParameterDescriptorImpl]

'getSliceContents' @ [502:51] ==> @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getSliceContents(@NotNull p0: ReadOnlySlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>): ImmutableMap<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)

'RESOLVED_CALL' @ [502:83] ==> public final val RESOLVED_CALL: (WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>..WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'component1' @ [503:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>.component1(): (Call..Call?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)

'component2' @ [503:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>.component2(): (ResolvedCall<*>..ResolvedCall<*>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)

'resolvedCallsEntries' @ [503:38] ==> val resolvedCallsEntries: ImmutableMap<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[LocalVariableDescriptor]

'call' @ [504:27] ==> val call: (Call..Call?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[LocalVariableDescriptor]

'callElement' @ [504:32] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'getLineAndColumnInPsiFile' @ [506:49] ==> @NotNull public open fun getLineAndColumnInPsiFile(p0: (PsiFile..PsiFile?), p1: (TextRange..TextRange?)): DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'element' @ [506:75] ==> val element: KtElement defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[LocalVariableDescriptor]

'containingFile' @ [506:83] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'element' @ [506:99] ==> val element: KtElement defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[LocalVariableDescriptor]

'textRange' @ [506:107] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'!' @ [508:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'USE_NEW_INFERENCE' @ [508:18] ==> public val USE_NEW_INFERENCE: Boolean defined in org.jetbrains.kotlin.resolve.calls[DeserializedPropertyDescriptor]

'assertTrue' @ [509:17] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaMethodDescriptor]

'element' @ [509:50] ==> val element: KtElement defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[LocalVariableDescriptor]

'text' @ [509:58] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'lineAndColumn' @ [509:65] ==> val lineAndColumn: DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[LocalVariableDescriptor]

'resolvedCall' @ [510:29] ==> val resolvedCall: (ResolvedCall<*>..ResolvedCall<*>?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[LocalVariableDescriptor]

'isCompleted' @ [510:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.isCompleted: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'checkResolvedCallsInDiagnostics' @ [514:9] ==> private final fun checkResolvedCallsInDiagnostics(bindingContext: BindingContext): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'bindingContext' @ [514:41] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkAllResolvedCallsAreCompleted[ValueParameterDescriptorImpl]

'setOf' @ [518:48] ==> public fun <T> setOf(vararg elements: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)): Set<(DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>?)>?)

'OVERLOAD_RESOLUTION_AMBIGUITY' @ [519:17] ==> public final val OVERLOAD_RESOLUTION_AMBIGUITY: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NONE_APPLICABLE' @ [519:48] ==> public final val NONE_APPLICABLE: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'CANNOT_COMPLETE_RESOLVE' @ [519:65] ==> public final val CANNOT_COMPLETE_RESOLVE: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'UNRESOLVED_REFERENCE_WRONG_RECEIVER' @ [519:90] ==> public final val UNRESOLVED_REFERENCE_WRONG_RECEIVER: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'ASSIGN_OPERATOR_AMBIGUITY' @ [520:17] ==> public final val ASSIGN_OPERATOR_AMBIGUITY: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'ITERATOR_AMBIGUITY' @ [520:44] ==> public final val ITERATOR_AMBIGUITY: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'setOf' @ [522:48] ==> public fun <T> setOf(vararg elements: (DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)): Set<(DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory2<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), out (kotlin.Comparable<*>..kotlin.Comparable<*>?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory2<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), out (kotlin.Comparable<*>..kotlin.Comparable<*>?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>?)>?)

'COMPONENT_FUNCTION_AMBIGUITY' @ [523:17] ==> public final val COMPONENT_FUNCTION_AMBIGUITY: (DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'DELEGATE_SPECIAL_FUNCTION_AMBIGUITY' @ [523:47] ==> public final val DELEGATE_SPECIAL_FUNCTION_AMBIGUITY: (DiagnosticFactory2<(KtExpression..KtExpression?), (String..String?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (String..String?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'DELEGATE_SPECIAL_FUNCTION_NONE_APPLICABLE' @ [523:84] ==> public final val DELEGATE_SPECIAL_FUNCTION_NONE_APPLICABLE: (DiagnosticFactory2<(KtExpression..KtExpression?), (String..String?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (String..String?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'bindingContext' @ [526:28] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[ValueParameterDescriptorImpl]

'diagnostics' @ [526:43] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'when (diagnostic.factory) {
                in diagnosticsStoringResolvedCalls1 -> assertResolvedCallsAreCompleted(
                        diagnostic, DiagnosticFactory.cast(diagnostic, diagnosticsStoringResolvedCalls1).a
                )
                in diagnosticsStoringResolvedCalls2 -> assertResolvedCallsAreCompleted(
                        diagnostic, DiagnosticFactory.cast(diagnostic, diagnosticsStoringResolvedCalls2).b
                )
            }' @ [527:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [527:19] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'factory' @ [527:30] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'in' @ [528:17] ==> public operator fun <@OnlyInputTypes T> Iterable<(DiagnosticFactory<out (Diagnostic..Diagnostic?)>..DiagnosticFactory<out (Diagnostic..Diagnostic?)>?)>.contains(element: (DiagnosticFactory<out (Diagnostic..Diagnostic?)>..DiagnosticFactory<out (Diagnostic..Diagnostic?)>?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<out (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<out (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)>?)

'diagnosticsStoringResolvedCalls1' @ [528:20] ==> val diagnosticsStoringResolvedCalls1: Set<(DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'assertResolvedCallsAreCompleted' @ [528:56] ==> private final fun assertResolvedCallsAreCompleted(diagnostic: Diagnostic, resolvedCalls: Collection<ResolvedCall<*>>): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'diagnostic' @ [529:25] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'cast' @ [529:55] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull p1: (MutableCollection<out (DiagnosticFactory<out (DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)>?)>..Collection<(DiagnosticFactory<out (DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)>?)>)): DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>?)>?)

'diagnostic' @ [529:60] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'diagnosticsStoringResolvedCalls1' @ [529:72] ==> val diagnosticsStoringResolvedCalls1: Set<(DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'a' @ [529:106] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>.a: (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)>?)

'in' @ [531:17] ==> public operator fun <@OnlyInputTypes T> Iterable<(DiagnosticFactory<out (Diagnostic..Diagnostic?)>..DiagnosticFactory<out (Diagnostic..Diagnostic?)>?)>.contains(element: (DiagnosticFactory<out (Diagnostic..Diagnostic?)>..DiagnosticFactory<out (Diagnostic..Diagnostic?)>?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<out (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<out (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)>?)

'diagnosticsStoringResolvedCalls2' @ [531:20] ==> val diagnosticsStoringResolvedCalls2: Set<(DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'assertResolvedCallsAreCompleted' @ [531:56] ==> private final fun assertResolvedCallsAreCompleted(diagnostic: Diagnostic, resolvedCalls: Collection<ResolvedCall<*>>): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[SimpleFunctionDescriptorImpl]

'diagnostic' @ [532:25] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'cast' @ [532:55] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull p1: (MutableCollection<out (DiagnosticFactory<out (DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>..DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>..DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>?)>?)>..Collection<(DiagnosticFactory<out (DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>..DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>..DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>?)>?)>)): DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters2<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), out (kotlin.Comparable<*>..kotlin.Comparable<*>?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)>?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters2<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), out (kotlin.Comparable<*>..kotlin.Comparable<*>?), (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)>?)>?)

'diagnostic' @ [532:60] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'diagnosticsStoringResolvedCalls2' @ [532:72] ==> val diagnosticsStoringResolvedCalls2: Set<(DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?)> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.checkResolvedCallsInDiagnostics[LocalVariableDescriptor]

'b' @ [532:106] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), out (Comparable<*>..Comparable<*>?), (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>?)>.b: (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> Captured(out (kotlin.Comparable<*>..kotlin.Comparable<*>?))
    <B : (Any..Any?)> -> (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)>?)

'diagnostic' @ [539:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted[ValueParameterDescriptorImpl]

'psiElement' @ [539:34] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getLineAndColumnInPsiFile' @ [540:45] ==> @NotNull public open fun getLineAndColumnInPsiFile(p0: (PsiFile..PsiFile?), p1: (TextRange..TextRange?)): DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'element' @ [540:71] ==> val element: PsiElement defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted[LocalVariableDescriptor]

'containingFile' @ [540:79] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'element' @ [540:95] ==> val element: PsiElement defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted[LocalVariableDescriptor]

'textRange' @ [540:103] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'USE_NEW_INFERENCE' @ [541:13] ==> public val USE_NEW_INFERENCE: Boolean defined in org.jetbrains.kotlin.resolve.calls[DeserializedPropertyDescriptor]

'assertTrue' @ [543:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.checkers.KotlinMultiFileTestWithJava[JavaMethodDescriptor]

'diagnostic' @ [543:48] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted[ValueParameterDescriptorImpl]

'factory' @ [543:59] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [543:67] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'element' @ [543:81] ==> val element: PsiElement defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted[LocalVariableDescriptor]

'text' @ [543:89] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'lineAndColumn' @ [543:96] ==> val lineAndColumn: DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted[LocalVariableDescriptor]

'resolvedCalls' @ [544:20] ==> value-parameter resolvedCalls: Collection<ResolvedCall<*>> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted[ValueParameterDescriptorImpl]

'all' @ [544:34] ==> public inline fun <T> Iterable<ResolvedCall<*>>.all(predicate: (ResolvedCall<*>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<*>

'it' @ [544:41] ==> value-parameter it: ResolvedCall<*> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.assertResolvedCallsAreCompleted.<anonymous>[ValueParameterDescriptorImpl]

'isCompleted' @ [544:71] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.isCompleted: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

's' @ [548:63] ==> value-parameter s: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest.Companion.HASH_SANITIZER.<no name provided>[ValueParameterDescriptorImpl]

'replace' @ [548:65] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [548:83] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Capability' @ [550:53] ==> public constructor Capability<T>(name: String) defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor.Capability[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> List<KtFile>

