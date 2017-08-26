'KotlinTestWithEnvironment' @ [74:5] ==> public constructor KotlinTestWithEnvironment() defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaClassConstructorDescriptor]

'mutableListOf' @ [75:43] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'doTest' @ [83:9] ==> public final fun doTest(filePath: String, expectedResult: String, mainCallParameters: MainCallParameters): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'filePath' @ [83:16] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'noCall' @ [83:51] ==> @NotNull public open fun noCall(): MainCallParameters defined in org.jetbrains.kotlin.js.facade.MainCallParameters[JavaMethodDescriptor]

'File' @ [87:20] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filePath' @ [87:25] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'getOutputDir' @ [88:25] ==> protected final fun getOutputDir(file: File): File defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'file' @ [88:38] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'doLoadFile' @ [89:43] ==> public open fun doLoadFile(@NotNull p0: File): (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'file' @ [89:54] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'getOutputPrefixFile' @ [91:32] ==> protected open fun getOutputPrefixFile(testFilePath: String): File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'filePath' @ [91:52] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'getOutputPostfixFile' @ [92:33] ==> protected open fun getOutputPostfixFile(testFilePath: String): File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'filePath' @ [92:54] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'TestFileFactoryImpl' @ [94:9] ==> public constructor TestFileFactoryImpl() defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[ClassConstructorDescriptorImpl]

'use' @ [94:31] ==> @InlineOnly public inline fun <T : Closeable?, R> BasicBoxTest.TestFileFactoryImpl.use(block: (BasicBoxTest.TestFileFactoryImpl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestFileFactoryImpl
    <R> -> Unit

'createTestFiles' @ [95:46] ==> @NotNull public open fun <M : (Any..Any?), F : (Any..Any?)> createTestFiles(p0: (String..String?), p1: (String..String?), p2: (KotlinTestUtils.TestFileFactory<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?), (BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>..KotlinTestUtils.TestFileFactory<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?), (BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>?), p3: Boolean): (MutableList<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>..List<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]
Inferred types:
    <M : (Any..Any?)> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)
    <F : (Any..Any?)> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile..org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile?)

'file' @ [95:62] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'name' @ [95:67] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'fileContent' @ [95:73] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'testFactory' @ [95:86] ==> value-parameter testFactory: BasicBoxTest.TestFileFactoryImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'inputFiles' @ [96:27] ==> val inputFiles: (MutableList<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>..List<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'map' @ [97:22] ==> public inline fun <T, R> Iterable<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>.map(transform: ((BasicBoxTest.TestFile..BasicBoxTest.TestFile?)) -> BasicBoxTest.TestModule): List<BasicBoxTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile..org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile?)
    <R> -> TestModule

'it' @ [97:28] ==> value-parameter it: (BasicBoxTest.TestFile..BasicBoxTest.TestFile?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [97:31] ==> public final val module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'distinct' @ [97:40] ==> public fun <T> Iterable<BasicBoxTest.TestModule>.distinct(): List<BasicBoxTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'map' @ [98:22] ==> public inline fun <T, R> Iterable<BasicBoxTest.TestModule>.map(transform: (BasicBoxTest.TestModule) -> Pair<String, BasicBoxTest.TestModule>): List<Pair<String, BasicBoxTest.TestModule>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule
    <R> -> Pair<String, TestModule>

'it' @ [98:28] ==> value-parameter it: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [98:31] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'it' @ [98:39] ==> value-parameter it: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [98:44] ==> public fun <K, V> Iterable<Pair<String, BasicBoxTest.TestModule>>.toMap(): Map<String, BasicBoxTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> TestModule

'topologicalOrder' @ [100:38] ==> public final fun <N : (Any..Any?)> topologicalOrder(@NotNull p0: (MutableIterable<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>..Iterable<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>), @NotNull p1: ((BasicBoxTest.TestModule..BasicBoxTest.TestModule?)) -> (MutableIterable<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>..Iterable<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>)): (MutableList<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>..List<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)

'modules' @ [100:55] ==> val modules: Map<String, BasicBoxTest.TestModule> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'values' @ [100:63] ==> public abstract val values: Collection<BasicBoxTest.TestModule> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'module' @ [100:83] ==> value-parameter module: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dependencies' @ [100:90] ==> public final val dependencies: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'mapNotNull' @ [100:103] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> BasicBoxTest.TestModule?): List<BasicBoxTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> TestModule

'modules' @ [100:116] ==> val modules: Map<String, BasicBoxTest.TestModule> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'it' @ [100:124] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'orderedModules' @ [102:36] ==> val orderedModules: (MutableList<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>..List<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'asReversed' @ [102:51] ==> @JvmName public fun <T> MutableList<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>.asReversed(): MutableList<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)

'mapNotNull' @ [102:64] ==> public inline fun <T, R : Any> Iterable<(BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>.mapNotNull(transform: ((BasicBoxTest.TestModule..BasicBoxTest.TestModule?)) -> Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>?): List<Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)
    <R : Any> -> Pair<String, (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)>

'module' @ [103:36] ==> value-parameter module: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dependencies' @ [103:43] ==> public final val dependencies: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'map' @ [103:56] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'modules' @ [103:62] ==> val modules: Map<String, BasicBoxTest.TestModule> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'it' @ [103:70] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outputFileName' @ [103:75] ==> private final fun BasicBoxTest.TestModule.outputFileName(directory: File): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'outputDir' @ [103:90] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'module' @ [104:31] ==> value-parameter module: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'friends' @ [104:38] ==> public final val friends: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'map' @ [104:46] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'modules' @ [104:52] ==> val modules: Map<String, BasicBoxTest.TestModule> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'it' @ [104:60] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outputFileName' @ [104:65] ==> private final fun BasicBoxTest.TestModule.outputFileName(directory: File): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'outputDir' @ [104:80] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'module' @ [106:38] ==> value-parameter module: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outputFileName' @ [106:45] ==> private final fun BasicBoxTest.TestModule.outputFileName(directory: File): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'outputDir' @ [106:60] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'generateJavaScriptFile' @ [107:17] ==> private final fun generateJavaScriptFile(directory: String, module: BasicBoxTest.TestModule, outputFileName: String, dependencies: List<String>, friends: List<String>, multiModule: Boolean, outputPrefixFile: File?, outputPostfixFile: File?, mainCallParameters: MainCallParameters): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'file' @ [107:40] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'parent' @ [107:45] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'module' @ [107:53] ==> value-parameter module: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outputFileName' @ [107:61] ==> val outputFileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'dependencies' @ [107:77] ==> val dependencies: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'friends' @ [107:91] ==> val friends: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'modules' @ [107:100] ==> val modules: Map<String, BasicBoxTest.TestModule> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'size' @ [107:108] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'outputPrefixFile' @ [108:40] ==> val outputPrefixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'outputPostfixFile' @ [108:58] ==> val outputPostfixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'mainCallParameters' @ [108:77] ==> value-parameter mainCallParameters: MainCallParameters defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'if (!module.name.endsWith(OLD_MODULE_SUFFIX)) Pair(outputFileName, module) else null' @ [110:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>?, elseBranch: Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>?): Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<String, (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)>?

'!' @ [110:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'module' @ [110:22] ==> value-parameter module: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [110:29] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'endsWith' @ [110:34] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'OLD_MODULE_SUFFIX' @ [110:43] ==> private final val OLD_MODULE_SUFFIX: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'Pair' @ [110:63] ==> public constructor Pair<out A, out B>(first: String, second: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)

'outputFileName' @ [110:68] ==> val outputFileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'module' @ [110:84] ==> value-parameter module: (BasicBoxTest.TestModule..BasicBoxTest.TestModule?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (TEST_MODULE in modules) TEST_MODULE else DEFAULT_MODULE' @ [113:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'TEST_MODULE' @ [113:38] ==> public final val TEST_MODULE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'modules' @ [113:53] ==> val modules: Map<String, BasicBoxTest.TestModule> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'TEST_MODULE' @ [113:62] ==> public final val TEST_MODULE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'DEFAULT_MODULE' @ [113:79] ==> private final val DEFAULT_MODULE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'modules' @ [114:30] ==> val modules: Map<String, BasicBoxTest.TestModule> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'mainModuleName' @ [114:38] ==> val mainModuleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'getFilesInDirectoryByExtension' @ [116:49] ==> @NotNull public open fun getFilesInDirectoryByExtension(@NotNull directory: String, extension: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.js.test.utils.JsTestUtils[JavaMethodDescriptor]

'TEST_DATA_DIR_PATH' @ [117:21] ==> public const final val TEST_DATA_DIR_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'COMMON_FILES_DIR' @ [117:42] ==> private final val COMMON_FILES_DIR: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'EXTENSION' @ [117:71] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.js.JavaScript[DeserializedPropertyDescriptor]

'file' @ [118:35] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'parent' @ [118:40] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'COMMON_FILES_NAME' @ [118:55] ==> private final val COMMON_FILES_NAME: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'DOT_EXTENSION' @ [118:86] ==> public const final val DOT_EXTENSION: String defined in org.jetbrains.kotlin.js.JavaScript[DeserializedPropertyDescriptor]

'if (File(localCommonFile).exists()) listOf(localCommonFile) else emptyList()' @ [119:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'File' @ [119:40] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'localCommonFile' @ [119:45] ==> val localCommonFile: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'exists' @ [119:62] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'listOf' @ [119:72] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'localCommonFile' @ [119:79] ==> val localCommonFile: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [119:101] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'additionalCommonFileDirectories' @ [121:41] ==> public final val additionalCommonFileDirectories: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'flatMap' @ [121:73] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'getFilesInDirectoryByExtension' @ [122:29] ==> @NotNull public open fun getFilesInDirectoryByExtension(@NotNull directory: String, extension: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.js.test.utils.JsTestUtils[JavaMethodDescriptor]

'baseDir' @ [122:60] ==> value-parameter baseDir: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'EXTENSION' @ [122:86] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.js.JavaScript[DeserializedPropertyDescriptor]

'inputFiles' @ [124:32] ==> val inputFiles: (MutableList<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>..List<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'filter' @ [125:22] ==> public inline fun <T> Iterable<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>.filter(predicate: ((BasicBoxTest.TestFile..BasicBoxTest.TestFile?)) -> Boolean): List<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile..org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile?)

'it' @ [125:31] ==> value-parameter it: (BasicBoxTest.TestFile..BasicBoxTest.TestFile?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [125:34] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'endsWith' @ [125:43] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [126:22] ==> public inline fun <T, R> Iterable<(BasicBoxTest.TestFile..BasicBoxTest.TestFile?)>.map(transform: ((BasicBoxTest.TestFile..BasicBoxTest.TestFile?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile..org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile?)
    <R> -> (kotlin.String..kotlin.String?)

'File' @ [127:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'inputJsFile' @ [127:47] ==> value-parameter inputJsFile: (BasicBoxTest.TestFile..BasicBoxTest.TestFile?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [127:59] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'File' @ [128:42] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [128:47] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'inputJsFile' @ [128:58] ==> value-parameter inputJsFile: (BasicBoxTest.TestFile..BasicBoxTest.TestFile?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [128:70] ==> public final val module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'outputFileSimpleName' @ [128:77] ==> private final fun BasicBoxTest.TestModule.outputFileSimpleName(): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'sourceFile' @ [128:111] ==> val sourceFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [128:122] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'copy' @ [129:34] ==> public open fun copy(@NotNull p0: File, @NotNull p1: File): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [129:39] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'inputJsFile' @ [129:44] ==> value-parameter inputJsFile: (BasicBoxTest.TestFile..BasicBoxTest.TestFile?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [129:56] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'targetFile' @ [129:67] ==> val targetFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'targetFile' @ [130:25] ==> val targetFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [130:36] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'mutableListOf' @ [133:35] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'MODULE_KIND_PATTERN' @ [135:37] ==> private final val MODULE_KIND_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [135:57] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'fileContent' @ [135:65] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'if (moduleKindMatcher.find()) ModuleKind.valueOf(moduleKindMatcher.group(1)) else ModuleKind.PLAIN' @ [136:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleKind, elseBranch: ModuleKind): ModuleKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleKind

'moduleKindMatcher' @ [136:34] ==> val moduleKindMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'find' @ [136:52] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'valueOf' @ [136:71] ==> public final fun valueOf(value: String): ModuleKind defined in org.jetbrains.kotlin.serialization.js.ModuleKind[SimpleFunctionDescriptorImpl]

'moduleKindMatcher' @ [136:79] ==> val moduleKindMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'group' @ [136:97] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'PLAIN' @ [136:123] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'moduleKind' @ [138:36] ==> val moduleKind: ModuleKind defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'PLAIN' @ [138:61] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'!' @ [138:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'NO_MODULE_SYSTEM_PATTERN' @ [138:71] ==> private final val NO_MODULE_SYSTEM_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [138:96] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'fileContent' @ [138:104] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'find' @ [138:117] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'withModuleSystem' @ [140:17] ==> val withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'additionalFiles' @ [141:17] ==> val additionalFiles: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'MODULE_EMULATION_FILE' @ [141:36] ==> private final val MODULE_EMULATION_FILE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'filePath' @ [144:36] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'removeSuffix' @ [144:45] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [144:58] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'EXTENSION' @ [144:79] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'DOT_EXTENSION' @ [144:103] ==> public const final val DOT_EXTENSION: String defined in org.jetbrains.kotlin.js.JavaScript[DeserializedPropertyDescriptor]

'File' @ [145:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'additionalJsFile' @ [145:22] ==> val additionalJsFile: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'exists' @ [145:40] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'additionalFiles' @ [146:17] ==> val additionalFiles: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'additionalJsFile' @ [146:36] ==> val additionalJsFile: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'additionalFiles' @ [149:30] ==> val additionalFiles: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'inputJsFiles' @ [149:48] ==> val inputJsFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'generatedJsFiles' @ [149:63] ==> val generatedJsFiles: List<Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'map' @ [149:80] ==> public inline fun <T, R> Iterable<Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>>.map(transform: (Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)>
    <R> -> String

'it' @ [149:86] ==> value-parameter it: Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [149:89] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'globalCommonFiles' @ [149:99] ==> val globalCommonFiles: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'localCommonFiles' @ [149:119] ==> val localCommonFiles: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'additionalCommonFiles' @ [150:30] ==> val additionalCommonFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'generateNodeJsRunner' @ [152:17] ==> private final val generateNodeJsRunner: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'!' @ [152:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'SKIP_NODE_JS' @ [152:42] ==> private final val SKIP_NODE_JS: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [152:55] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'fileContent' @ [152:63] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'find' @ [152:76] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'mainModule' @ [153:38] ==> val mainModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'outputFileName' @ [153:49] ==> private final fun BasicBoxTest.TestModule.outputFileName(directory: File): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'outputDir' @ [153:64] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'isIgnoredTarget' @ [154:53] ==> public open fun isIgnoredTarget(p0: (TargetBackend..TargetBackend?), p1: (File..File?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'JS' @ [154:83] ==> enum entry JS defined in org.jetbrains.kotlin.test.TargetBackend[FakeCallableDescriptorForObject]

'file' @ [154:87] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'generateNodeRunner' @ [155:38] ==> private final fun generateNodeRunner(files: Collection<String>, dir: File, moduleName: String, ignored: Boolean, testPackage: String?): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'allJsFiles' @ [155:57] ==> val allJsFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'outputDir' @ [155:69] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'mainModuleName' @ [155:80] ==> val mainModuleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'ignored' @ [155:96] ==> val ignored: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'testFactory' @ [155:105] ==> value-parameter testFactory: BasicBoxTest.TestFileFactoryImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'testPackage' @ [155:117] ==> public final var testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'writeToFile' @ [156:26] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [156:38] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'nodeRunnerName' @ [156:43] ==> val nodeRunnerName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'nodeRunnerText' @ [156:60] ==> val nodeRunnerText: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'runGeneratedCode' @ [159:13] ==> protected open fun runGeneratedCode(jsFiles: List<String>, testModuleName: String, testPackage: String?, testFunction: String, expectedResult: String, withModuleSystem: Boolean): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'allJsFiles' @ [159:30] ==> val allJsFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'mainModuleName' @ [159:42] ==> val mainModuleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'testFactory' @ [159:58] ==> value-parameter testFactory: BasicBoxTest.TestFileFactoryImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'testPackage' @ [159:70] ==> public final var testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'TEST_FUNCTION' @ [159:83] ==> private final val TEST_FUNCTION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'expectedResult' @ [159:98] ==> value-parameter expectedResult: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'withModuleSystem' @ [159:114] ==> val withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'performAdditionalChecks' @ [161:13] ==> protected open fun performAdditionalChecks(generatedJsFiles: List<String>, outputPrefixFile: File?, outputPostfixFile: File?): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'generatedJsFiles' @ [161:37] ==> val generatedJsFiles: List<Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'map' @ [161:54] ==> public inline fun <T, R> Iterable<Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>>.map(transform: (Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, (org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule..org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule?)>
    <R> -> String

'it' @ [161:60] ==> value-parameter it: Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [161:63] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'outputPrefixFile' @ [161:72] ==> val outputPrefixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'outputPostfixFile' @ [161:90] ==> val outputPostfixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'EXPECTED_REACHABLE_NODES' @ [163:49] ==> private final val EXPECTED_REACHABLE_NODES: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [163:74] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'fileContent' @ [163:82] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'expectedReachableNodesMatcher' @ [164:47] ==> val expectedReachableNodesMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'find' @ [164:77] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'getProperty' @ [165:43] ==> public open fun getProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'toBoolean' @ [165:98] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [166:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipMinification' @ [166:18] ==> val skipMinification: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'runMinifierByDefault' @ [167:18] ==> protected open val runMinifierByDefault: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'expectedReachableNodesFound' @ [167:42] ==> val expectedReachableNodesFound: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'!' @ [168:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'SKIP_MINIFICATION' @ [168:18] ==> private final val SKIP_MINIFICATION: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [168:36] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'fileContent' @ [168:44] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'find' @ [168:57] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'EXPECTED_REACHABLE_NODES_DIRECTIVE' @ [171:44] ==> private final val EXPECTED_REACHABLE_NODES_DIRECTIVE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'reachableNodesCount' @ [171:81] ==> value-parameter reachableNodesCount: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (!expectedReachableNodesFound) {
                        file.writeText("$replacement\n$fileContent")
                        fail("The number of expected reachable nodes was not set. Actual reachable nodes: $reachableNodesCount")
                    }
                    else {
                        val expectedReachableNodes = expectedReachableNodesMatcher.group(1).toInt()
                        val minThreshold = expectedReachableNodes * 9 / 10
                        val maxThreshold = expectedReachableNodes * 11 / 10
                        if (reachableNodesCount < minThreshold || reachableNodesCount > maxThreshold) {

                            val newText = fileContent.substring(0, expectedReachableNodesMatcher.start()) +
                                          replacement +
                                          fileContent.substring(expectedReachableNodesMatcher.end())
                            file.writeText(newText)
                            fail("Number of reachable nodes ($reachableNodesCount) does not fit into expected range " +
                                 "[$minThreshold; $maxThreshold]")
                        }
                    }' @ [172:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [172:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expectedReachableNodesFound' @ [172:26] ==> val expectedReachableNodesFound: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'file' @ [173:25] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'writeText' @ [173:30] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'replacement' @ [173:42] ==> val replacement: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fileContent' @ [173:56] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'fail' @ [174:25] ==> public open fun fail(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaMethodDescriptor]

'reachableNodesCount' @ [174:108] ==> value-parameter reachableNodesCount: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expectedReachableNodesMatcher' @ [177:54] ==> val expectedReachableNodesMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'group' @ [177:84] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'toInt' @ [177:93] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedReachableNodes' @ [178:44] ==> val expectedReachableNodes: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'expectedReachableNodes' @ [179:44] ==> val expectedReachableNodes: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'reachableNodesCount' @ [180:29] ==> value-parameter reachableNodesCount: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'minThreshold' @ [180:51] ==> val minThreshold: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'reachableNodesCount' @ [180:67] ==> value-parameter reachableNodesCount: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'maxThreshold' @ [180:89] ==> val maxThreshold: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fileContent' @ [182:43] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'substring' @ [182:55] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedReachableNodesMatcher' @ [182:68] ==> val expectedReachableNodesMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'start' @ [182:98] ==> public open fun start(): Int defined in java.util.regex.Matcher[JavaMethodDescriptor]

'replacement' @ [183:43] ==> val replacement: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fileContent' @ [184:43] ==> val fileContent: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'substring' @ [184:55] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedReachableNodesMatcher' @ [184:65] ==> val expectedReachableNodesMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'end' @ [184:95] ==> public open fun end(): Int defined in java.util.regex.Matcher[JavaMethodDescriptor]

'file' @ [185:29] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'writeText' @ [185:34] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'newText' @ [185:44] ==> val newText: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fail' @ [186:29] ==> public open fun fail(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaMethodDescriptor]

'+' @ [186:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'reachableNodesCount' @ [186:63] ==> value-parameter reachableNodesCount: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'minThreshold' @ [187:37] ==> val minThreshold: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'maxThreshold' @ [187:52] ==> val maxThreshold: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'minifyAndRun' @ [192:17] ==> private final fun minifyAndRun(workDir: File, allJsFiles: List<String>, generatedJsFiles: List<Pair<String, BasicBoxTest.TestModule>>, expectedResult: String, testModuleName: String, testPackage: String?, testFunction: String, withModuleSystem: Boolean, minificationThresholdChecker: (Int) -> Unit): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'File' @ [193:35] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [193:40] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [193:45] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'file' @ [193:64] ==> val file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[LocalVariableDescriptor]

'nameWithoutExtension' @ [193:69] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'allJsFiles' @ [194:38] ==> val allJsFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'generatedJsFiles' @ [195:44] ==> val generatedJsFiles: List<Pair<String, (BasicBoxTest.TestModule..BasicBoxTest.TestModule?)>> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'expectedResult' @ [196:42] ==> value-parameter expectedResult: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest[ValueParameterDescriptorImpl]

'mainModuleName' @ [197:42] ==> val mainModuleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'testFactory' @ [198:39] ==> value-parameter testFactory: BasicBoxTest.TestFileFactoryImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'testPackage' @ [198:51] ==> public final var testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'TEST_FUNCTION' @ [199:40] ==> private final val TEST_FUNCTION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'withModuleSystem' @ [200:44] ==> val withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'thresholdChecker' @ [201:57] ==> val thresholdChecker: (Int) -> Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest.doTest.<anonymous>[LocalVariableDescriptor]

'NashornJsTestChecker' @ [214:9] ==> public object NashornJsTestChecker defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[FakeCallableDescriptorForObject]

'check' @ [214:30] ==> public final fun check(files: List<String>, testModuleName: String, testPackageName: String?, testFunctionName: String, expectedResult: String, withModuleSystem: Boolean): Unit defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[SimpleFunctionDescriptorImpl]

'jsFiles' @ [214:36] ==> value-parameter jsFiles: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.runGeneratedCode[ValueParameterDescriptorImpl]

'testModuleName' @ [214:45] ==> value-parameter testModuleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.runGeneratedCode[ValueParameterDescriptorImpl]

'testPackage' @ [214:61] ==> value-parameter testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.runGeneratedCode[ValueParameterDescriptorImpl]

'testFunction' @ [214:74] ==> value-parameter testFunction: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.runGeneratedCode[ValueParameterDescriptorImpl]

'expectedResult' @ [214:88] ==> value-parameter expectedResult: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.runGeneratedCode[ValueParameterDescriptorImpl]

'withModuleSystem' @ [214:104] ==> value-parameter withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.runGeneratedCode[ValueParameterDescriptorImpl]

'files' @ [226:27] ==> value-parameter files: Collection<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[ValueParameterDescriptorImpl]

'map' @ [226:33] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'!!' @ [226:39] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'getRelativePath' @ [226:48] ==> @Nullable public open fun getRelativePath(p0: (File..File?), p1: (File..File?)): String? defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'dir' @ [226:64] ==> value-parameter dir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[ValueParameterDescriptorImpl]

'File' @ [226:69] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [226:74] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [226:81] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'separatorChar' @ [226:94] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'map' @ [226:116] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [226:126] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner.<anonymous>[ValueParameterDescriptorImpl]

'testPackage' @ [227:19] ==> value-parameter testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[ValueParameterDescriptorImpl]

'let' @ [227:32] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [227:41] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner.<anonymous>[ValueParameterDescriptorImpl]

'filesToLoad' @ [228:35] ==> val filesToLoad: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'joinToString' @ [228:47] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'moduleName' @ [228:70] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[ValueParameterDescriptorImpl]

'fqn' @ [228:83] ==> val fqn: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'StringBuilder' @ [230:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [231:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [231:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (ignored) {
            sb.append("  try {\n")
            sb.append("    var result = $loadAndRun;\n")
            sb.append("    if (result != 'OK') return 'OK';")
            sb.append("    return 'fail: expected test failure';\n")
            sb.append("  }\n")
            sb.append("  catch (e) {\n")
            sb.append("    return 'OK';\n")
            sb.append("}\n")
        }
        else {
            sb.append("  return $loadAndRun;\n")
        }' @ [232:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'ignored' @ [232:13] ==> value-parameter ignored: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[ValueParameterDescriptorImpl]

'sb' @ [233:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [233:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [234:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [234:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'loadAndRun' @ [234:42] ==> val loadAndRun: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'sb' @ [235:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [235:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [236:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [236:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [237:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [237:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [238:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [238:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [239:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [239:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [240:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [240:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [243:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [243:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'loadAndRun' @ [243:34] ==> val loadAndRun: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'sb' @ [245:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'append' @ [245:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [247:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateNodeRunner[LocalVariableDescriptor]

'toString' @ [247:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'File' @ [251:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'pathToTestDir' @ [251:29] ==> protected final val pathToTestDir: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'generateSequence' @ [252:16] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: File?, nextFunction: (File) -> File?): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> File

'file' @ [252:33] ==> value-parameter file: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.getOutputDir[ValueParameterDescriptorImpl]

'parentFile' @ [252:38] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'it' @ [252:52] ==> value-parameter it: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.getOutputDir.<anonymous>[ValueParameterDescriptorImpl]

'parentFile' @ [252:55] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'takeWhile' @ [253:18] ==> public fun <T> Sequence<File>.takeWhile(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [253:30] ==> value-parameter it: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.getOutputDir.<anonymous>[ValueParameterDescriptorImpl]

'stopFile' @ [253:36] ==> val stopFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.getOutputDir[LocalVariableDescriptor]

'map' @ [254:18] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> (String..String?)): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [254:24] ==> value-parameter it: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.getOutputDir.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [254:27] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'toList' @ [255:18] ==> public fun <T> Sequence<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'asReversed' @ [255:27] ==> public fun <T> List<(String..String?)>.asReversed(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'fold' @ [256:18] ==> public inline fun <T, R> Iterable<(String..String?)>.fold(initial: File, operation: (acc: File, (String..String?)) -> File): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> File

'File' @ [256:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'pathToOutputDir' @ [256:28] ==> private final val pathToOutputDir: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'File' @ [256:48] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'if (this.name == TEST_MODULE) "" else "-$name"' @ [260:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [260:36] ==> <this> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.outputFileSimpleName[ReceiverParameterDescriptorImpl]

'name' @ [260:41] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'TEST_MODULE' @ [260:49] ==> public final val TEST_MODULE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'name' @ [260:73] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'getTestName' @ [261:16] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest[JavaMethodDescriptor]

'outputFileSuffix' @ [261:36] ==> val outputFileSuffix: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.outputFileSimpleName[LocalVariableDescriptor]

'directory' @ [265:16] ==> value-parameter directory: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.outputFileName[ValueParameterDescriptorImpl]

'absolutePath' @ [265:26] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'outputFileSimpleName' @ [265:47] ==> private final fun BasicBoxTest.TestModule.outputFileSimpleName(): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'module' @ [279:28] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'files' @ [279:35] ==> public final val files: MutableList<BasicBoxTest.TestFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'filter' @ [279:41] ==> public inline fun <T> Iterable<BasicBoxTest.TestFile>.filter(predicate: (BasicBoxTest.TestFile) -> Boolean): List<BasicBoxTest.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'it' @ [279:50] ==> value-parameter it: BasicBoxTest.TestFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [279:53] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'endsWith' @ [279:62] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kotlinFiles' @ [280:25] ==> val kotlinFiles: List<BasicBoxTest.TestFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'map' @ [280:37] ==> public inline fun <T, R> Iterable<BasicBoxTest.TestFile>.map(transform: (BasicBoxTest.TestFile) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R> -> String

'it' @ [280:43] ==> value-parameter it: BasicBoxTest.TestFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [280:46] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'getFilesInDirectoryByExtension' @ [281:45] ==> @NotNull public open fun getFilesInDirectoryByExtension(@NotNull directory: String, extension: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.js.test.utils.JsTestUtils[JavaMethodDescriptor]

'TEST_DATA_DIR_PATH' @ [282:17] ==> public const final val TEST_DATA_DIR_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'COMMON_FILES_DIR' @ [282:38] ==> private final val COMMON_FILES_DIR: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'EXTENSION' @ [282:71] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'directory' @ [283:31] ==> value-parameter directory: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'COMMON_FILES_NAME' @ [283:49] ==> private final val COMMON_FILES_NAME: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'EXTENSION' @ [283:90] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'if (File(localCommonFile).exists()) listOf(localCommonFile) else emptyList()' @ [284:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'File' @ [284:36] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'localCommonFile' @ [284:41] ==> val localCommonFile: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'exists' @ [284:58] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'listOf' @ [284:68] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'localCommonFile' @ [284:75] ==> val localCommonFile: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'emptyList' @ [284:97] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'additionalCommonFileDirectories' @ [285:37] ==> public final val additionalCommonFileDirectories: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'flatMap' @ [285:69] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'getFilesInDirectoryByExtension' @ [286:25] ==> @NotNull public open fun getFilesInDirectoryByExtension(@NotNull directory: String, extension: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.js.test.utils.JsTestUtils[JavaMethodDescriptor]

'baseDir' @ [286:56] ==> value-parameter baseDir: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile.<anonymous>[ValueParameterDescriptorImpl]

'EXTENSION' @ [286:86] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'globalCommonFiles' @ [288:31] ==> val globalCommonFiles: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'localCommonFiles' @ [288:51] ==> val localCommonFiles: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'additionalCommonFiles' @ [288:70] ==> val additionalCommonFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'createPsiFiles' @ [289:24] ==> private final fun createPsiFiles(fileNames: List<String>): List<KtFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'testFiles' @ [289:39] ==> val testFiles: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'additionalFiles' @ [289:51] ==> val additionalFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'testFiles' @ [291:27] ==> val testFiles: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'additionalFiles' @ [291:39] ==> val additionalFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'map' @ [291:56] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> (kotlin.String..kotlin.String?)

'File' @ [291:62] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [291:67] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [291:71] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'distinct' @ [291:80] ==> public fun <T> Iterable<(String..String?)>.distinct(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'createConfig' @ [292:22] ==> private final fun createConfig(sourceDirs: List<String>, module: BasicBoxTest.TestModule, dependencies: List<String>, friends: List<String>, multiModule: Boolean, additionalMetadata: Pair<File, List<File>>?): JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'sourceDirs' @ [292:35] ==> val sourceDirs: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'module' @ [292:47] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'dependencies' @ [292:55] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'friends' @ [292:69] ==> value-parameter friends: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'multiModule' @ [292:78] ==> value-parameter multiModule: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'File' @ [293:26] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputFileName' @ [293:31] ==> value-parameter outputFileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'translateFiles' @ [295:9] ==> protected final fun translateFiles(units: List<TranslationUnit>, outputFile: File, config: JsConfig, outputPrefixFile: File?, outputPostfixFile: File?, mainCallParameters: MainCallParameters): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'psiFiles' @ [295:24] ==> val psiFiles: List<KtFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'map' @ [295:33] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> TranslationUnit.SourceFile): List<TranslationUnit.SourceFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> SourceFile

'TranslationUnit' @ [295:37] ==> private constructor TranslationUnit() defined in org.jetbrains.kotlin.js.facade.TranslationUnit[DeserializedClassConstructorDescriptor]

'SourceFile' @ [295:54] ==> public constructor SourceFile(file: KtFile) defined in org.jetbrains.kotlin.js.facade.TranslationUnit.SourceFile[DeserializedClassConstructorDescriptor]

'outputFile' @ [295:67] ==> val outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'config' @ [295:79] ==> val config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'outputPrefixFile' @ [295:87] ==> value-parameter outputPrefixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'outputPostfixFile' @ [295:105] ==> value-parameter outputPostfixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'mainCallParameters' @ [295:124] ==> value-parameter mainCallParameters: MainCallParameters defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'module' @ [297:13] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'hasFilesToRecompile' @ [297:20] ==> public final val hasFilesToRecompile: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'checkIncrementalCompilation' @ [298:13] ==> private final fun checkIncrementalCompilation(sourceDirs: List<String>, module: BasicBoxTest.TestModule, kotlinFiles: List<BasicBoxTest.TestFile>, additionalFiles: List<String>, dependencies: List<String>, friends: List<String>, multiModule: Boolean, outputFile: File, outputPrefixFile: File?, outputPostfixFile: File?, mainCallParameters: MainCallParameters): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'sourceDirs' @ [298:41] ==> val sourceDirs: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'module' @ [298:53] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'kotlinFiles' @ [298:61] ==> val kotlinFiles: List<BasicBoxTest.TestFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'additionalFiles' @ [298:74] ==> val additionalFiles: List<(String..String?)> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'dependencies' @ [298:91] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'friends' @ [298:105] ==> value-parameter friends: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'multiModule' @ [298:114] ==> value-parameter multiModule: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'outputFile' @ [298:127] ==> val outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[LocalVariableDescriptor]

'outputPrefixFile' @ [299:41] ==> value-parameter outputPrefixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'outputPostfixFile' @ [299:59] ==> value-parameter outputPostfixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'mainCallParameters' @ [299:78] ==> value-parameter mainCallParameters: MainCallParameters defined in org.jetbrains.kotlin.js.test.BasicBoxTest.generateJavaScriptFile[ValueParameterDescriptorImpl]

'File' @ [316:30] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputFile' @ [316:35] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'parentFile' @ [316:46] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'+' @ [316:58] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'outputFile' @ [316:75] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [316:86] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'mutableListOf' @ [317:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'kotlinFiles' @ [318:32] ==> value-parameter kotlinFiles: List<BasicBoxTest.TestFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'withIndex' @ [318:44] ==> public fun <T> Iterable<BasicBoxTest.TestFile>.withIndex(): Iterable<IndexedValue<BasicBoxTest.TestFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'map' @ [318:56] ==> public inline fun <T, R> Iterable<IndexedValue<BasicBoxTest.TestFile>>.map(transform: (IndexedValue<BasicBoxTest.TestFile>) -> TranslationUnit): List<TranslationUnit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<TestFile>
    <R> -> TranslationUnit

'component1' @ [318:63] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [318:70] ==> public final operator fun component2(): BasicBoxTest.TestFile defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'if (file.recompile) {
                TranslationUnit.SourceFile(createPsiFile(file.fileName))
            }
            else {
                serializedMetadata += File(incrementalDir, "$index.$METADATA_EXTENSION")
                val astFile = File(incrementalDir, "$index.$AST_EXTENSION")
                TranslationUnit.BinaryAst(FileUtil.loadFileBytes(astFile))
            }' @ [319:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TranslationUnit, elseBranch: TranslationUnit): TranslationUnit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TranslationUnit

'file' @ [319:17] ==> val file: BasicBoxTest.TestFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation.<anonymous>[LocalVariableDescriptor]

'recompile' @ [319:22] ==> public final val recompile: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'SourceFile' @ [320:33] ==> public constructor SourceFile(file: KtFile) defined in org.jetbrains.kotlin.js.facade.TranslationUnit.SourceFile[DeserializedClassConstructorDescriptor]

'createPsiFile' @ [320:44] ==> private final fun createPsiFile(fileName: String): KtFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'file' @ [320:58] ==> val file: BasicBoxTest.TestFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation.<anonymous>[LocalVariableDescriptor]

'fileName' @ [320:63] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'serializedMetadata' @ [323:17] ==> val serializedMetadata: MutableList<File> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'File' @ [323:39] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDir' @ [323:44] ==> val incrementalDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'index' @ [323:62] ==> val index: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation.<anonymous>[LocalVariableDescriptor]

'METADATA_EXTENSION' @ [323:69] ==> private final val METADATA_EXTENSION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'File' @ [324:31] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDir' @ [324:36] ==> val incrementalDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'index' @ [324:54] ==> val index: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation.<anonymous>[LocalVariableDescriptor]

'AST_EXTENSION' @ [324:61] ==> private final val AST_EXTENSION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'BinaryAst' @ [325:33] ==> public constructor BinaryAst(data: ByteArray) defined in org.jetbrains.kotlin.js.facade.TranslationUnit.BinaryAst[DeserializedClassConstructorDescriptor]

'loadFileBytes' @ [325:52] ==> @NotNull public open fun loadFileBytes(@NotNull p0: File): ByteArray defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'astFile' @ [325:66] ==> val astFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation.<anonymous>[LocalVariableDescriptor]

'translationUnits' @ [328:35] ==> val translationUnits: List<TranslationUnit> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'additionalFiles' @ [328:54] ==> value-parameter additionalFiles: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'withIndex' @ [328:70] ==> public fun <T> Iterable<String>.withIndex(): Iterable<IndexedValue<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [328:82] ==> public inline fun <T, R> Iterable<IndexedValue<String>>.map(transform: (IndexedValue<String>) -> TranslationUnit.BinaryAst): List<TranslationUnit.BinaryAst> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<String>
    <R> -> BinaryAst

'component1' @ [328:89] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [328:96] ==> public final operator fun component2(): String defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'File' @ [329:27] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDir' @ [329:32] ==> val incrementalDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'index' @ [329:51] ==> val index: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation.<anonymous>[LocalVariableDescriptor]

'translationUnits' @ [329:59] ==> val translationUnits: List<TranslationUnit> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'size' @ [329:76] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'AST_EXTENSION' @ [329:83] ==> private final val AST_EXTENSION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'BinaryAst' @ [330:29] ==> public constructor BinaryAst(data: ByteArray) defined in org.jetbrains.kotlin.js.facade.TranslationUnit.BinaryAst[DeserializedClassConstructorDescriptor]

'loadFileBytes' @ [330:48] ==> @NotNull public open fun loadFileBytes(@NotNull p0: File): ByteArray defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'astFile' @ [330:62] ==> val astFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation.<anonymous>[LocalVariableDescriptor]

'File' @ [333:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDir' @ [333:31] ==> val incrementalDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'HEADER_FILE' @ [333:47] ==> private final val HEADER_FILE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'createConfig' @ [334:32] ==> private final fun createConfig(sourceDirs: List<String>, module: BasicBoxTest.TestModule, dependencies: List<String>, friends: List<String>, multiModule: Boolean, additionalMetadata: Pair<File, List<File>>?): JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'sourceDirs' @ [334:45] ==> value-parameter sourceDirs: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'module' @ [334:57] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'dependencies' @ [334:65] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'friends' @ [334:79] ==> value-parameter friends: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'multiModule' @ [334:88] ==> value-parameter multiModule: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'Pair' @ [334:101] ==> public constructor Pair<out A, out B>(first: File, second: MutableList<File>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> File
    <out B> -> MutableList<File>

'headerFile' @ [334:106] ==> val headerFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'serializedMetadata' @ [334:117] ==> val serializedMetadata: MutableList<File> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'File' @ [335:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputFile' @ [335:41] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'parentFile' @ [335:52] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'outputFile' @ [335:64] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [335:75] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'translateFiles' @ [337:9] ==> protected final fun translateFiles(units: List<TranslationUnit>, outputFile: File, config: JsConfig, outputPrefixFile: File?, outputPostfixFile: File?, mainCallParameters: MainCallParameters): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'allTranslationUnits' @ [337:24] ==> val allTranslationUnits: List<TranslationUnit> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'recompiledOutputFile' @ [337:45] ==> val recompiledOutputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'recompiledConfig' @ [337:67] ==> val recompiledConfig: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'outputPrefixFile' @ [337:85] ==> value-parameter outputPrefixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'outputPostfixFile' @ [337:103] ==> value-parameter outputPostfixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'mainCallParameters' @ [338:24] ==> value-parameter mainCallParameters: MainCallParameters defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'loadFile' @ [340:39] ==> @NotNull public open fun loadFile(@NotNull p0: File): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outputFile' @ [340:48] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'removeRecompiledSuffix' @ [341:32] ==> private final fun removeRecompiledSuffix(text: String): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'loadFile' @ [341:64] ==> @NotNull public open fun loadFile(@NotNull p0: File): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'recompiledOutputFile' @ [341:73] ==> val recompiledOutputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'assertEquals' @ [342:18] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'originalOutput' @ [342:74] ==> val originalOutput: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'recompiledOutput' @ [342:90] ==> val recompiledOutput: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'loadFile' @ [344:42] ==> @NotNull public open fun loadFile(@NotNull p0: File): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [344:51] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputFile' @ [344:56] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'parentFile' @ [344:67] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'outputFile' @ [344:79] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[ValueParameterDescriptorImpl]

'name' @ [344:90] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'removeRecompiledSuffix' @ [345:35] ==> private final fun removeRecompiledSuffix(text: String): String defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'loadFile' @ [346:26] ==> @NotNull public open fun loadFile(@NotNull p0: File): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [346:35] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'recompiledOutputFile' @ [346:40] ==> val recompiledOutputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'parentFile' @ [346:61] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'recompiledOutputFile' @ [346:73] ==> val recompiledOutputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'name' @ [346:94] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [347:18] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'originalSourceMap' @ [347:78] ==> val originalSourceMap: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'recompiledSourceMap' @ [347:97] ==> val recompiledSourceMap: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkIncrementalCompilation[LocalVariableDescriptor]

'text' @ [350:64] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.removeRecompiledSuffix[ValueParameterDescriptorImpl]

'replace' @ [350:69] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'K2JSTranslator' @ [360:26] ==> public constructor K2JSTranslator(@NotNull p0: JsConfig) defined in org.jetbrains.kotlin.js.facade.K2JSTranslator[JavaClassConstructorDescriptor]

'config' @ [360:41] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'translator' @ [361:33] ==> val translator: K2JSTranslator defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'translateUnits' @ [361:44] ==> @NotNull public open fun translateUnits(@NotNull p0: JsConfig.Reporter, @NotNull p1: (MutableList<(TranslationUnit..TranslationUnit?)>..List<(TranslationUnit..TranslationUnit?)>), @NotNull p2: MainCallParameters): TranslationResult defined in org.jetbrains.kotlin.js.facade.K2JSTranslator[JavaMethodDescriptor]

'ExceptionThrowingReporter' @ [361:59] ==> public object ExceptionThrowingReporter : JsConfig.Reporter defined in org.jetbrains.kotlin.js.test.utils in file ExceptionThrowingReporter.kt[FakeCallableDescriptorForObject]

'units' @ [361:86] ==> value-parameter units: List<TranslationUnit> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'mainCallParameters' @ [361:93] ==> value-parameter mainCallParameters: MainCallParameters defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'translationResult' @ [363:13] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'ByteArrayOutputStream' @ [364:32] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintingMessageCollector' @ [365:29] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'PrintStream' @ [365:54] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outputStream' @ [365:66] ==> val outputStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'PLAIN_FULL_PATHS' @ [365:97] ==> public final val PLAIN_FULL_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'AnalyzerWithCompilerReport' @ [366:13] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[FakeCallableDescriptorForObject]

'reportDiagnostics' @ [366:40] ==> public final fun reportDiagnostics(diagnostics: Diagnostics, messageCollector: MessageCollector): Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[DeserializedSimpleFunctionDescriptor]

'translationResult' @ [366:58] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'diagnostics' @ [366:76] ==> public final val diagnostics: Diagnostics defined in org.jetbrains.kotlin.js.facade.TranslationResult[DeserializedPropertyDescriptor]

'collector' @ [366:89] ==> val collector: PrintingMessageCollector defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'outputStream' @ [367:28] ==> val outputStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'toByteArray' @ [367:41] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'toString' @ [367:55] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'forName' @ [367:72] ==> public open fun forName(p0: (String..String?)): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'AssertionError' @ [368:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [368:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'messages' @ [368:86] ==> val messages: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'translationResult' @ [371:27] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'getOutputFiles' @ [371:45] ==> public final fun getOutputFiles(outputFile: File, outputPrefixFile: File?, outputPostfixFile: File?): OutputFileCollection defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedSimpleFunctionDescriptor]

'outputFile' @ [371:60] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'outputPrefixFile' @ [371:72] ==> value-parameter outputPrefixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'outputPostfixFile' @ [371:90] ==> value-parameter outputPostfixFile: File? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'outputFile' @ [372:25] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'parentFile' @ [372:36] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'error' @ [372:50] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [372:56] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'outputFile' @ [372:125] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'path' @ [372:136] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'outputFiles' @ [373:9] ==> val outputFiles: OutputFileCollection defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'writeAllTo' @ [373:21] ==> public fun OutputFileCollection.writeAllTo(outputDir: File): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils[DeserializedSimpleFunctionDescriptor]

'outputDir' @ [373:32] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'if (config.moduleKind == ModuleKind.COMMON_JS) {
            val content = FileUtil.loadFile(outputFile, true)
            val wrappedContent = "$KOTLIN_TEST_INTERNAL.beginModule();\n" +
                                 "$content\n" +
                                 "$KOTLIN_TEST_INTERNAL.endModule(\"${StringUtil.escapeStringCharacters(config.moduleId)}\");"
            FileUtil.writeToFile(outputFile, wrappedContent)
        }
        else if (config.moduleKind == ModuleKind.AMD || config.moduleKind == ModuleKind.UMD) {
            val content = FileUtil.loadFile(outputFile, true)
            val wrappedContent = "if (typeof $KOTLIN_TEST_INTERNAL !== \"undefined\") { " +
                                 "$KOTLIN_TEST_INTERNAL.setModuleId(\"${StringUtil.escapeStringCharacters(config.moduleId)}\"); }\n" +
                                 "$content\n"
            FileUtil.writeToFile(outputFile, wrappedContent)
        }' @ [375:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'config' @ [375:13] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'moduleKind' @ [375:20] ==> public final val JsConfig.moduleKind: ModuleKind[MyPropertyDescriptor]

'COMMON_JS' @ [375:45] ==> enum entry COMMON_JS defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'loadFile' @ [376:36] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outputFile' @ [376:45] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'+' @ [377:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'KOTLIN_TEST_INTERNAL' @ [377:36] ==> public const final val KOTLIN_TEST_INTERNAL: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'content' @ [378:36] ==> val content: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'KOTLIN_TEST_INTERNAL' @ [379:36] ==> public const final val KOTLIN_TEST_INTERNAL: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'escapeStringCharacters' @ [379:82] ==> @NotNull @Contract public open fun escapeStringCharacters(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'config' @ [379:105] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'moduleId' @ [379:112] ==> public final val JsConfig.moduleId: String[MyPropertyDescriptor]

'writeToFile' @ [380:22] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outputFile' @ [380:34] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'wrappedContent' @ [380:46] ==> val wrappedContent: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'config' @ [382:18] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'moduleKind' @ [382:25] ==> public final val JsConfig.moduleKind: ModuleKind[MyPropertyDescriptor]

'AMD' @ [382:50] ==> enum entry AMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'config' @ [382:57] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'moduleKind' @ [382:64] ==> public final val JsConfig.moduleKind: ModuleKind[MyPropertyDescriptor]

'UMD' @ [382:89] ==> enum entry UMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'loadFile' @ [383:36] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outputFile' @ [383:45] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'+' @ [384:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'KOTLIN_TEST_INTERNAL' @ [384:47] ==> public const final val KOTLIN_TEST_INTERNAL: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'KOTLIN_TEST_INTERNAL' @ [385:36] ==> public const final val KOTLIN_TEST_INTERNAL: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'escapeStringCharacters' @ [385:84] ==> @NotNull @Contract public open fun escapeStringCharacters(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'config' @ [385:107] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'moduleId' @ [385:114] ==> public final val JsConfig.moduleId: String[MyPropertyDescriptor]

'content' @ [386:36] ==> val content: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'writeToFile' @ [387:22] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outputFile' @ [387:34] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'wrappedContent' @ [387:46] ==> val wrappedContent: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'config' @ [390:9] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'configuration' @ [390:16] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'INCREMENTAL_RESULTS_CONSUMER' @ [390:50] ==> public final val INCREMENTAL_RESULTS_CONSUMER: (CompilerConfigurationKey<(IncrementalResultsConsumer..IncrementalResultsConsumer?)>..CompilerConfigurationKey<(IncrementalResultsConsumer..IncrementalResultsConsumer?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'let' @ [390:81] ==> @InlineOnly public inline fun <T, R> IncrementalResultsConsumer.let(block: (IncrementalResultsConsumer) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalResultsConsumer
    <R> -> Unit

'it' @ [391:38] ==> value-parameter it: IncrementalResultsConsumer defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[ValueParameterDescriptorImpl]

'File' @ [393:34] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [393:39] ==> val outputDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'outputFile' @ [393:65] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [393:76] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'component1' @ [395:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [395:22] ==> public final operator fun component2(): IncrementalResultsConsumerImpl.PackagePartData defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'incrementalService' @ [395:38] ==> val incrementalService: IncrementalResultsConsumerImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'packageParts' @ [395:57] ==> public final val packageParts: List<IncrementalResultsConsumerImpl.PackagePartData> defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedPropertyDescriptor]

'withIndex' @ [395:70] ==> public fun <T> Iterable<IncrementalResultsConsumerImpl.PackagePartData>.withIndex(): Iterable<IndexedValue<IncrementalResultsConsumerImpl.PackagePartData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackagePartData

'writeToFile' @ [396:26] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: ByteArray): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [396:38] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDir' @ [396:43] ==> val incrementalDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'i' @ [396:61] ==> val i: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'AST_EXTENSION' @ [396:64] ==> private final val AST_EXTENSION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'packagePart' @ [396:81] ==> val packagePart: IncrementalResultsConsumerImpl.PackagePartData defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'binaryAst' @ [396:93] ==> public final val binaryAst: ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedPropertyDescriptor]

'writeToFile' @ [397:26] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: ByteArray): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [397:38] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDir' @ [397:43] ==> val incrementalDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'i' @ [397:61] ==> val i: Int defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'METADATA_EXTENSION' @ [397:64] ==> private final val METADATA_EXTENSION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'packagePart' @ [397:86] ==> val packagePart: IncrementalResultsConsumerImpl.PackagePartData defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'proto' @ [397:98] ==> public final val proto: ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedPropertyDescriptor]

'writeToFile' @ [400:22] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: ByteArray): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [400:34] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDir' @ [400:39] ==> val incrementalDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'HEADER_FILE' @ [400:55] ==> private final val HEADER_FILE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'incrementalService' @ [400:69] ==> val incrementalService: IncrementalResultsConsumerImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[LocalVariableDescriptor]

'headerMetadata' @ [400:88] ==> public final lateinit var headerMetadata: ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedPropertyDescriptor]

'processJsProgram' @ [403:9] ==> protected final fun processJsProgram(program: JsProgram, psiFiles: List<KtFile>): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'translationResult' @ [403:26] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'program' @ [403:44] ==> public final val program: JsProgram defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedPropertyDescriptor]

'units' @ [403:53] ==> value-parameter units: List<TranslationUnit> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'filterIsInstance' @ [403:59] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<TranslationUnit.SourceFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SourceFile

'map' @ [403:106] ==> public inline fun <T, R> Iterable<TranslationUnit.SourceFile>.map(transform: (TranslationUnit.SourceFile) -> KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceFile
    <R> -> KtFile

'it' @ [403:112] ==> value-parameter it: TranslationUnit.SourceFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [403:115] ==> public final val file: KtFile defined in org.jetbrains.kotlin.js.facade.TranslationUnit.SourceFile[DeserializedPropertyDescriptor]

'checkSourceMap' @ [404:9] ==> private final fun checkSourceMap(outputFile: File, program: JsProgram): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'outputFile' @ [404:24] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[ValueParameterDescriptorImpl]

'translationResult' @ [404:36] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.translateFiles[LocalVariableDescriptor]

'program' @ [404:54] ==> public final val program: JsProgram defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedPropertyDescriptor]

'psiFiles' @ [408:9] ==> value-parameter psiFiles: List<KtFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.processJsProgram[ValueParameterDescriptorImpl]

'asSequence' @ [408:18] ==> public fun <T> Iterable<KtFile>.asSequence(): Sequence<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'map' @ [409:18] ==> public fun <T, R> Sequence<KtFile>.map(transform: (KtFile) -> (String..String?)): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [409:24] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.processJsProgram.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [409:27] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'forEach' @ [410:18] ==> public inline fun <T> Sequence<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'processDirectives' @ [410:47] ==> public open fun processDirectives(@NotNull ast: JsNode, @NotNull sourceCode: String): Unit defined in org.jetbrains.kotlin.js.test.utils.DirectiveTestUtils[JavaMethodDescriptor]

'program' @ [410:65] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.processJsProgram[ValueParameterDescriptorImpl]

'it' @ [410:74] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.processJsProgram.<anonymous>[ValueParameterDescriptorImpl]

'program' @ [411:9] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.processJsProgram[ValueParameterDescriptorImpl]

'verifyAst' @ [411:17] ==> public fun JsProgram.verifyAst(): Unit defined in org.jetbrains.kotlin.js.test.utils in file jsVerification.kt[SimpleFunctionDescriptorImpl]

'JsProgram' @ [415:32] ==> public constructor JsProgram() defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaClassConstructorDescriptor]

'generatedProgram' @ [416:9] ==> val generatedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'globalBlock' @ [416:26] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'statements' @ [416:38] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'program' @ [416:52] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[ValueParameterDescriptorImpl]

'globalBlock' @ [416:60] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'statements' @ [416:72] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'map' @ [416:83] ==> public inline fun <T, R> Iterable<(JsStatement..JsStatement?)>.map(transform: ((JsStatement..JsStatement?)) -> JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)
    <R> -> JsStatement

'it' @ [416:89] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap.<anonymous>[ValueParameterDescriptorImpl]

'deepCopy' @ [416:92] ==> @NotNull public abstract fun deepCopy(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'generatedProgram' @ [417:9] ==> val generatedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'accept' @ [417:26] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [417:42] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'super' @ [419:17] ==> <this> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitObjectLiteral' @ [419:23] ==> public open fun visitObjectLiteral(x: JsObjectLiteral): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [419:42] ==> value-parameter x: JsObjectLiteral defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap.<no name provided>.visitObjectLiteral[ValueParameterDescriptorImpl]

'x' @ [420:17] ==> value-parameter x: JsObjectLiteral defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap.<no name provided>.visitObjectLiteral[ValueParameterDescriptorImpl]

'isMultiline' @ [420:19] ==> public final var JsObjectLiteral.isMultiline: Boolean[MyPropertyDescriptor]

'x' @ [423:17] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap.<no name provided>.visitVars[ValueParameterDescriptorImpl]

'isMultiline' @ [423:19] ==> public final var JsVars.isMultiline: Boolean[MyPropertyDescriptor]

'super' @ [424:17] ==> <this> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitVars' @ [424:23] ==> public open fun visitVars(x: JsVars): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [424:33] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap.<no name provided>.visitVars[ValueParameterDescriptorImpl]

'removeLocationFromBlocks' @ [427:9] ==> private final fun removeLocationFromBlocks(program: JsProgram): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'generatedProgram' @ [427:34] ==> val generatedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'generatedProgram' @ [428:9] ==> val generatedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'accept' @ [428:26] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaMethodDescriptor]

'AmbiguousAstSourcePropagation' @ [428:33] ==> public constructor AmbiguousAstSourcePropagation() defined in org.jetbrains.kotlin.js.test.utils.AmbiguousAstSourcePropagation[ClassConstructorDescriptorImpl]

'TextOutputImpl' @ [430:22] ==> public constructor TextOutputImpl() defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaClassConstructorDescriptor]

'SourceFilePathResolver' @ [431:28] ==> public constructor SourceFilePathResolver(@NotNull p0: (MutableList<(File..File?)>..List<(File..File?)>)) defined in org.jetbrains.kotlin.js.sourceMap.SourceFilePathResolver[JavaClassConstructorDescriptor]

'mutableListOf' @ [431:51] ==> public fun <T> mutableListOf(vararg elements: File): MutableList<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [431:65] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'SourceMap3Builder' @ [432:32] ==> public constructor SourceMap3Builder(p0: (File..File?), p1: (TextOutput..TextOutput?), p2: (String..String?)) defined in org.jetbrains.kotlin.js.sourceMap.SourceMap3Builder[JavaClassConstructorDescriptor]

'outputFile' @ [432:50] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[ValueParameterDescriptorImpl]

'output' @ [432:62] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'generatedProgram' @ [433:9] ==> val generatedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'accept' @ [433:26] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaMethodDescriptor]

'JsToStringGenerationVisitor' @ [433:33] ==> public constructor JsToStringGenerationVisitor(@NotNull p0: TextOutput, @NotNull p1: SourceLocationConsumer) defined in org.jetbrains.kotlin.js.backend.JsToStringGenerationVisitor[JavaClassConstructorDescriptor]

'output' @ [433:61] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'SourceMapBuilderConsumer' @ [433:69] ==> public constructor SourceMapBuilderConsumer(@NotNull p0: SourceMapMappingConsumer, @NotNull p1: SourceFilePathResolver, p2: Boolean, p3: Boolean) defined in org.jetbrains.kotlin.js.facade.SourceMapBuilderConsumer[JavaClassConstructorDescriptor]

'sourceMapBuilder' @ [433:94] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'pathResolver' @ [433:112] ==> val pathResolver: SourceFilePathResolver defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'output' @ [434:20] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'toString' @ [434:27] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaMethodDescriptor]

'sourceMapBuilder' @ [435:34] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'build' @ [435:51] ==> public open fun build(): (String..String?) defined in org.jetbrains.kotlin.js.sourceMap.SourceMap3Builder[JavaMethodDescriptor]

'generatedProgram' @ [437:29] ==> val generatedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'toStringWithLineNumbers' @ [437:46] ==> public fun JsProgram.toStringWithLineNumbers(): String defined in org.jetbrains.kotlin.js.test.utils in file lineNumberUtils.kt[SimpleFunctionDescriptorImpl]

'JsProgram' @ [439:29] ==> public constructor JsProgram() defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaClassConstructorDescriptor]

'parsedProgram' @ [440:9] ==> val parsedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'globalBlock' @ [440:23] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'statements' @ [440:35] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'parse' @ [440:49] ==> public fun parse(code: String, reporter: ErrorReporter, scope: JsScope, fileName: String): List<JsStatement> defined in org.jetbrains.kotlin.js.parser[DeserializedSimpleFunctionDescriptor]

'code' @ [440:55] ==> val code: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'ThrowExceptionOnErrorReporter' @ [440:61] ==> public object ThrowExceptionOnErrorReporter : ErrorReporter defined in com.google.gwt.dev.js[FakeCallableDescriptorForObject]

'parsedProgram' @ [440:92] ==> val parsedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'scope' @ [440:106] ==> public final val JsProgram.scope: (JsObjectScope..JsObjectScope?)[MyPropertyDescriptor]

'outputFile' @ [440:113] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[ValueParameterDescriptorImpl]

'path' @ [440:124] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'removeLocationFromBlocks' @ [441:9] ==> private final fun removeLocationFromBlocks(program: JsProgram): Unit defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'parsedProgram' @ [441:34] ==> val parsedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'SourceMapParser' @ [442:36] ==> public object SourceMapParser defined in org.jetbrains.kotlin.js.parser.sourcemaps[FakeCallableDescriptorForObject]

'parse' @ [442:52] ==> public final fun parse(reader: Reader): SourceMapParseResult defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapParser[DeserializedSimpleFunctionDescriptor]

'StringReader' @ [442:58] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'generatedSourceMap' @ [442:71] ==> val generatedSourceMap: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'when (sourceMapParseResult) {
            is SourceMapSuccess -> sourceMapParseResult.value
            is SourceMapError -> error("Could not parse source map: ${sourceMapParseResult.message}")
        }' @ [443:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SourceMap, entry1: SourceMap): SourceMap[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SourceMap

'sourceMapParseResult' @ [443:31] ==> val sourceMapParseResult: SourceMapParseResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'sourceMapParseResult' @ [444:36] ==> val sourceMapParseResult: SourceMapParseResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'value' @ [444:57] ==> public final val value: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSuccess[DeserializedPropertyDescriptor]

'error' @ [445:34] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sourceMapParseResult' @ [445:71] ==> val sourceMapParseResult: SourceMapParseResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'message' @ [445:92] ==> public final val message: String defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapError[DeserializedPropertyDescriptor]

'SourceMapLocationRemapper' @ [448:24] ==> public constructor SourceMapLocationRemapper(sourceMap: SourceMap) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[DeserializedClassConstructorDescriptor]

'sourceMap' @ [448:50] ==> val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'remapper' @ [449:9] ==> val remapper: SourceMapLocationRemapper defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'remap' @ [449:18] ==> public final fun remap(node: JsNode): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[DeserializedSimpleFunctionDescriptor]

'parsedProgram' @ [449:24] ==> val parsedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'parsedProgram' @ [451:37] ==> val parsedProgram: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'toStringWithLineNumbers' @ [451:51] ==> public fun JsProgram.toStringWithLineNumbers(): String defined in org.jetbrains.kotlin.js.test.utils in file lineNumberUtils.kt[SimpleFunctionDescriptorImpl]

'assertEquals' @ [453:18] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'codeWithLines' @ [453:31] ==> val codeWithLines: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'codeWithRemappedLines' @ [453:46] ==> val codeWithRemappedLines: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.checkSourceMap[LocalVariableDescriptor]

'program' @ [457:9] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.test.BasicBoxTest.removeLocationFromBlocks[ValueParameterDescriptorImpl]

'globalBlock' @ [457:17] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'accept' @ [457:29] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [457:45] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'super' @ [459:17] ==> <this> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.removeLocationFromBlocks.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitBlock' @ [459:23] ==> public open fun visitBlock(x: JsBlock): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [459:34] ==> value-parameter x: JsBlock defined in org.jetbrains.kotlin.js.test.BasicBoxTest.removeLocationFromBlocks.<no name provided>.visitBlock[ValueParameterDescriptorImpl]

'x' @ [460:17] ==> value-parameter x: JsBlock defined in org.jetbrains.kotlin.js.test.BasicBoxTest.removeLocationFromBlocks.<no name provided>.visitBlock[ValueParameterDescriptorImpl]

'source' @ [460:19] ==> public final var JsBlock.source: (Any..Any?)[MyPropertyDescriptor]

'getInstance' @ [466:37] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [466:49] ==> public final val BasicBoxTest.project: Project[MyPropertyDescriptor]

'getInstance' @ [467:45] ==> @NotNull public open fun getInstance(): VirtualFileManager defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'getFileSystem' @ [467:59] ==> public abstract fun getFileSystem(p0: (String..String?)): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'FILE_PROTOCOL' @ [467:93] ==> public const final val FILE_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'psiManager' @ [469:16] ==> val psiManager: PsiManager defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createPsiFile[LocalVariableDescriptor]

'findFile' @ [469:27] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'fileSystem' @ [469:36] ==> val fileSystem: (VirtualFileSystem..VirtualFileSystem?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createPsiFile[LocalVariableDescriptor]

'findFileByPath' @ [469:47] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'fileName' @ [469:62] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createPsiFile[ValueParameterDescriptorImpl]

'fileNames' @ [472:73] ==> value-parameter fileNames: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createPsiFiles[ValueParameterDescriptorImpl]

'map' @ [472:83] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KtFile

'this' @ [472:87] ==> <this> defined in org.jetbrains.kotlin.js.test.BasicBoxTest[LazyClassReceiverParameterDescriptor]

'createPsiFile' @ [472:93] ==> private final fun createPsiFile(fileName: String): KtFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest[SimpleFunctionDescriptorImpl]

'environment' @ [479:29] ==> public final val BasicBoxTest.environment: KotlinCoreEnvironment[MyPropertyDescriptor]

'configuration' @ [479:41] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'copy' @ [479:55] ==> public open fun copy(): (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'configuration' @ [481:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [481:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'DISABLE_INLINE' @ [481:51] ==> @field:JvmField public final val DISABLE_INLINE: CompilerConfigurationKey<Boolean> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'module' @ [481:67] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'inliningDisabled' @ [481:74] ==> public final var inliningDisabled: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'module' @ [482:9] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'languageVersion' @ [482:16] ==> public final var languageVersion: LanguageVersion? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'let' @ [482:33] ==> @InlineOnly public inline fun <T, R> LanguageVersion.let(block: (LanguageVersion) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LanguageVersion
    <R> -> Unit

'configuration' @ [483:13] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'languageVersionSettings' @ [483:27] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'LanguageVersionSettingsImpl' @ [484:21] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'languageVersion' @ [484:49] ==> value-parameter languageVersion: LanguageVersion defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig.<anonymous>[ValueParameterDescriptorImpl]

'DEFAULT' @ [484:94] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'apiVersion' @ [484:102] ==> public open val apiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedPropertyDescriptor]

'configuration' @ [487:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [487:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: (MutableList<(String..String?)>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>?)

'LIBRARIES' @ [487:47] ==> public final val LIBRARIES: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'+' @ [487:58] ==> public operator fun <T> Collection<(String..String?)>.plus(elements: Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'JS_STDLIB' @ [487:67] ==> public final val JS_STDLIB: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'JS_KOTLIN_TEST' @ [487:88] ==> public final val JS_KOTLIN_TEST: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'dependencies' @ [487:105] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'configuration' @ [488:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [488:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: (MutableList<(String..String?)>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>?)

'FRIEND_PATHS' @ [488:47] ==> public final val FRIEND_PATHS: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'friends' @ [488:61] ==> value-parameter friends: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'configuration' @ [490:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [490:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'MODULE_NAME' @ [490:51] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'module' @ [490:64] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'name' @ [490:71] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'removeSuffix' @ [490:76] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'OLD_MODULE_SUFFIX' @ [490:89] ==> private final val OLD_MODULE_SUFFIX: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'configuration' @ [491:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [491:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(ModuleKind..ModuleKind?)>, @NotNull p1: ModuleKind): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.js.ModuleKind..org.jetbrains.kotlin.serialization.js.ModuleKind?)

'MODULE_KIND' @ [491:47] ==> public final val MODULE_KIND: (CompilerConfigurationKey<(ModuleKind..ModuleKind?)>..CompilerConfigurationKey<(ModuleKind..ModuleKind?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'module' @ [491:60] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'moduleKind' @ [491:67] ==> public final var moduleKind: ModuleKind defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'configuration' @ [492:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [492:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(EcmaVersion..EcmaVersion?)>, @NotNull p1: EcmaVersion): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.js.config.EcmaVersion..org.jetbrains.kotlin.js.config.EcmaVersion?)

'TARGET' @ [492:47] ==> public final val TARGET: (CompilerConfigurationKey<(EcmaVersion..EcmaVersion?)>..CompilerConfigurationKey<(EcmaVersion..EcmaVersion?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'v5' @ [492:67] ==> enum entry v5 defined in org.jetbrains.kotlin.js.config.EcmaVersion[FakeCallableDescriptorForObject]

'module' @ [494:35] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'hasFilesToRecompile' @ [494:42] ==> public final val hasFilesToRecompile: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'configuration' @ [495:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [495:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'META_INFO' @ [495:47] ==> public final val META_INFO: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'multiModule' @ [495:58] ==> value-parameter multiModule: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'hasFilesToRecompile' @ [496:13] ==> val hasFilesToRecompile: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'additionalMetadata' @ [497:17] ==> value-parameter additionalMetadata: Pair<File, List<File>>? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'component1' @ [498:22] ==> public final operator fun component1(): File defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [498:34] ==> public final operator fun component2(): List<File> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'additionalMetadata' @ [498:54] ==> value-parameter additionalMetadata: Pair<File, List<File>>? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'configuration' @ [499:17] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [499:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(IncrementalDataProvider..IncrementalDataProvider?)>, @NotNull p1: IncrementalDataProvider): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.incremental.js.IncrementalDataProvider..org.jetbrains.kotlin.incremental.js.IncrementalDataProvider?)

'INCREMENTAL_DATA_PROVIDER' @ [499:55] ==> public final val INCREMENTAL_DATA_PROVIDER: (CompilerConfigurationKey<(IncrementalDataProvider..IncrementalDataProvider?)>..CompilerConfigurationKey<(IncrementalDataProvider..IncrementalDataProvider?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'IncrementalDataProviderImpl' @ [500:35] ==> public constructor IncrementalDataProviderImpl(headerMetadata: ByteArray, packagePartsMetadata: List<ByteArray>, binaryTrees: List<ByteArray>) defined in org.jetbrains.kotlin.incremental.js.IncrementalDataProviderImpl[DeserializedClassConstructorDescriptor]

'headerFile' @ [500:63] ==> val headerFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'readBytes' @ [500:74] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'packagePartFiles' @ [500:87] ==> val packagePartFiles: List<File> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'map' @ [500:104] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> ByteArray): List<ByteArray> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> ByteArray

'it' @ [500:110] ==> value-parameter it: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [500:113] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [500:128] ==> public fun <T> emptyList(): List<ByteArray> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'configuration' @ [503:13] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [503:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(IncrementalResultsConsumer..IncrementalResultsConsumer?)>, @NotNull p1: IncrementalResultsConsumer): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumer..org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumer?)

'INCREMENTAL_RESULTS_CONSUMER' @ [503:51] ==> public final val INCREMENTAL_RESULTS_CONSUMER: (CompilerConfigurationKey<(IncrementalResultsConsumer..IncrementalResultsConsumer?)>..CompilerConfigurationKey<(IncrementalResultsConsumer..IncrementalResultsConsumer?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'IncrementalResultsConsumerImpl' @ [503:81] ==> public constructor IncrementalResultsConsumerImpl() defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedClassConstructorDescriptor]

'configuration' @ [505:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [505:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'SOURCE_MAP' @ [505:47] ==> public final val SOURCE_MAP: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'hasFilesToRecompile' @ [505:59] ==> val hasFilesToRecompile: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'generateSourceMap' @ [505:82] ==> private final val generateSourceMap: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'configuration' @ [506:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [506:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: (MutableList<(String..String?)>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>?)

'SOURCE_MAP_SOURCE_ROOTS' @ [506:47] ==> public final val SOURCE_MAP_SOURCE_ROOTS: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'sourceDirs' @ [506:72] ==> value-parameter sourceDirs: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'configuration' @ [507:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [507:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(SourceMapSourceEmbedding..SourceMapSourceEmbedding?)>, @NotNull p1: SourceMapSourceEmbedding): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.js.config.SourceMapSourceEmbedding..org.jetbrains.kotlin.js.config.SourceMapSourceEmbedding?)

'SOURCE_MAP_EMBED_SOURCES' @ [507:47] ==> public final val SOURCE_MAP_EMBED_SOURCES: (CompilerConfigurationKey<(SourceMapSourceEmbedding..SourceMapSourceEmbedding?)>..CompilerConfigurationKey<(SourceMapSourceEmbedding..SourceMapSourceEmbedding?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'module' @ [507:73] ==> value-parameter module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[ValueParameterDescriptorImpl]

'sourceMapSourceEmbedding' @ [507:80] ==> public final var sourceMapSourceEmbedding: SourceMapSourceEmbedding defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'typedArraysEnabled' @ [509:13] ==> private final val typedArraysEnabled: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest[PropertyDescriptorImpl]

'configuration' @ [510:13] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'put' @ [510:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'TYPED_ARRAYS_ENABLED' @ [510:51] ==> public final val TYPED_ARRAYS_ENABLED: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'JsConfig' @ [513:16] ==> public constructor JsConfig(@NotNull p0: Project, @NotNull p1: CompilerConfiguration, @Nullable p2: (MutableList<(JsModuleDescriptor<(KotlinJavaScriptLibraryParts..KotlinJavaScriptLibraryParts?)>..JsModuleDescriptor<(KotlinJavaScriptLibraryParts..KotlinJavaScriptLibraryParts?)>?)>?..List<(JsModuleDescriptor<(KotlinJavaScriptLibraryParts..KotlinJavaScriptLibraryParts?)>..JsModuleDescriptor<(KotlinJavaScriptLibraryParts..KotlinJavaScriptLibraryParts?)>?)>?), @Nullable p3: (MutableSet<(String..String?)>?..Set<(String..String?)>?)) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaClassConstructorDescriptor]

'project' @ [513:25] ==> public final val BasicBoxTest.project: Project[MyPropertyDescriptor]

'configuration' @ [513:34] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.createConfig[LocalVariableDescriptor]

'METADATA_CACHE' @ [513:49] ==> public final val METADATA_CACHE: List<JsModuleDescriptor<KotlinJavaScriptLibraryParts>> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'+' @ [513:66] ==> public operator fun <T> Collection<(String..String?)>.plus(elements: Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'JS_STDLIB' @ [513:75] ==> public final val JS_STDLIB: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'JS_KOTLIN_TEST' @ [513:96] ==> public final val JS_KOTLIN_TEST: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'toSet' @ [513:112] ==> public fun <T> Iterable<(String..String?)>.toSet(): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'DIST_DIR_JS_PATH' @ [521:27] ==> public const final val DIST_DIR_JS_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'DIST_DIR_JS_PATH' @ [522:31] ==> public const final val DIST_DIR_JS_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'File' @ [523:33] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [523:38] ==> value-parameter workDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'path' @ [523:64] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'File' @ [524:37] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [524:42] ==> value-parameter workDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'path' @ [524:73] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'InputFile' @ [526:33] ==> public constructor InputFile(path: String, outputPath: String, moduleName: String? = ...) defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedClassConstructorDescriptor]

'kotlinJsLib' @ [526:43] ==> val kotlinJsLib: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'kotlinJsLibOutput' @ [526:56] ==> val kotlinJsLibOutput: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'InputFile' @ [527:37] ==> public constructor InputFile(path: String, outputPath: String, moduleName: String? = ...) defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedClassConstructorDescriptor]

'kotlinTestJsLib' @ [527:47] ==> val kotlinTestJsLib: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'kotlinTestJsLibOutput' @ [527:64] ==> val kotlinTestJsLibOutput: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'generatedJsFiles' @ [529:29] ==> value-parameter generatedJsFiles: List<Pair<String, BasicBoxTest.TestModule>> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'associate' @ [529:46] ==> public inline fun <T, K, V> Iterable<Pair<String, BasicBoxTest.TestModule>>.associate(transform: (Pair<String, BasicBoxTest.TestModule>) -> Pair<String, InputFile>): Map<String, InputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, TestModule>
    <K> -> String
    <V> -> InputFile

'component1' @ [529:59] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [529:69] ==> public final operator fun component2(): BasicBoxTest.TestModule defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'File' @ [530:33] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [530:38] ==> val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[LocalVariableDescriptor]

'nameWithoutExtension' @ [530:48] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'fileName' @ [531:13] ==> val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[LocalVariableDescriptor]

'InputFile' @ [531:25] ==> public constructor InputFile(path: String, outputPath: String, moduleName: String? = ...) defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedClassConstructorDescriptor]

'fileName' @ [531:35] ==> val fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[LocalVariableDescriptor]

'File' @ [531:45] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [531:50] ==> value-parameter workDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'inputFileName' @ [531:59] ==> val inputFileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [531:86] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'module' @ [531:100] ==> val module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[LocalVariableDescriptor]

'name' @ [531:107] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'testModuleName' @ [534:31] ==> value-parameter testModuleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'if (testPackage.isNullOrEmpty()) "" else ".$testPackage"' @ [534:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'testPackage' @ [534:53] ==> value-parameter testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'isNullOrEmpty' @ [534:65] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testPackage' @ [534:93] ==> value-parameter testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'testFunction' @ [534:112] ==> value-parameter testFunction: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'setOf' @ [535:40] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'testFunctionFqn' @ [536:17] ==> val testFunctionFqn: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'filesToMinify' @ [539:32] ==> val filesToMinify: Map<String, InputFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'values' @ [539:46] ==> public abstract val values: Collection<InputFile> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'kotlinJsInputFile' @ [539:55] ==> val kotlinJsInputFile: InputFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'kotlinTestJsInputFile' @ [539:75] ==> val kotlinTestJsInputFile: InputFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'DeadCodeElimination' @ [540:25] ==> public companion object defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[FakeCallableDescriptorForObject]

'run' @ [540:45] ==> public final fun run(inputFiles: Collection<InputFile>, rootReachableNames: Set<String>, logConsumer: (String) -> Unit): DeadCodeEliminationResult defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion[DeserializedSimpleFunctionDescriptor]

'allFilesToMinify' @ [540:49] ==> val allFilesToMinify: List<InputFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'additionalReachableNodes' @ [540:67] ==> val additionalReachableNodes: Set<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'dceResult' @ [542:30] ==> val dceResult: DeadCodeEliminationResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'reachableNodes' @ [542:40] ==> public final val reachableNodes: Set<Context.Node> defined in org.jetbrains.kotlin.js.dce.DeadCodeEliminationResult[DeserializedPropertyDescriptor]

'invoke' @ [543:9] ==> public abstract operator fun invoke(p1: Int): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'reachableNodes' @ [543:38] ==> val reachableNodes: Set<Context.Node> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'size' @ [543:53] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'mutableListOf' @ [545:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'runList' @ [546:9] ==> val runList: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'kotlinJsLibOutput' @ [546:20] ==> val kotlinJsLibOutput: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'runList' @ [547:9] ==> val runList: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'kotlinTestJsLibOutput' @ [547:20] ==> val kotlinTestJsLibOutput: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'runList' @ [548:9] ==> val runList: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'TEST_DATA_DIR_PATH' @ [548:20] ==> public const final val TEST_DATA_DIR_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'runList' @ [549:9] ==> val runList: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'allJsFiles' @ [549:20] ==> value-parameter allJsFiles: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'map' @ [549:31] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'filesToMinify' @ [549:37] ==> val filesToMinify: Map<String, InputFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'it' @ [549:51] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[ValueParameterDescriptorImpl]

'outputPath' @ [549:56] ==> public final val outputPath: String defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedPropertyDescriptor]

'it' @ [549:70] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[ValueParameterDescriptorImpl]

'engineForMinifier' @ [551:22] ==> private final val engineForMinifier: ScriptEngine defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'runAndRestoreContext' @ [551:40] ==> public fun ScriptEngine.runAndRestoreContext(f: ScriptEngine.() -> Any?): Any? defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'runList' @ [552:13] ==> val runList: MutableList<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'forEach' @ [552:21] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'this' @ [552:29] ==> <this> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun.<anonymous>[ReceiverParameterDescriptorImpl]

'loadFile' @ [552:35] ==> public fun ScriptEngine.loadFile(path: String): Unit defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'overrideAsserter' @ [553:13] ==> public fun ScriptEngine.overrideAsserter(): Unit defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'eval' @ [554:13] ==> public abstract fun eval(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'SETUP_KOTLIN_OUTPUT' @ [554:39] ==> public final val SETUP_KOTLIN_OUTPUT: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'runTestFunction' @ [555:13] ==> public fun ScriptEngine.runTestFunction(testModuleName: String, testPackageName: String?, testFunctionName: String, withModuleSystem: Boolean): Any? defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'testModuleName' @ [555:29] ==> value-parameter testModuleName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'testPackage' @ [555:45] ==> value-parameter testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'testFunction' @ [555:58] ==> value-parameter testFunction: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'withModuleSystem' @ [555:72] ==> value-parameter withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'assertEquals' @ [557:18] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'expectedResult' @ [557:31] ==> value-parameter expectedResult: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[ValueParameterDescriptorImpl]

'result' @ [557:47] ==> val result: Any? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.minifyAndRun[LocalVariableDescriptor]

'tmpDir' @ [562:38] ==> @NotNull public open fun tmpDir(p0: (String..String?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'TestModule' @ [563:29] ==> public constructor TestModule(name: String, dependencies: List<String>, friends: List<String>) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[ClassConstructorDescriptorImpl]

'TEST_MODULE' @ [563:40] ==> public final val TEST_MODULE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'emptyList' @ [563:53] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptyList' @ [563:66] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'module' @ [566:33] ==> value-parameter module: BasicBoxTest.TestModule? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'defaultModule' @ [566:43] ==> public final val defaultModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'KtPsiFactory' @ [568:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [568:39] ==> public final val BasicBoxTest.project: Project[MyPropertyDescriptor]

'createFile' @ [568:48] ==> public final fun createFile(text: String): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [568:59] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'ktFile' @ [569:31] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'declarations' @ [569:38] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'find' @ [569:51] ==> @InlineOnly public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.find(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [569:58] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [569:83] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [569:86] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'TEST_FUNCTION' @ [569:94] ==> private final val TEST_FUNCTION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'boxFunction' @ [570:17] ==> val boxFunction: KtDeclaration? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'testPackage' @ [571:17] ==> public final var testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'ktFile' @ [571:31] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'packageFqName' @ [571:38] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [571:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'testPackage' @ [572:21] ==> public final var testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'isEmpty' @ [572:34] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testPackage' @ [573:21] ==> public final var testPackage: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'MODULE_KIND_PATTERN' @ [577:37] ==> private final val MODULE_KIND_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [577:57] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'text' @ [577:65] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'moduleKindMatcher' @ [578:17] ==> val moduleKindMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'find' @ [578:35] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'currentModule' @ [579:17] ==> val currentModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'moduleKind' @ [579:31] ==> public final var moduleKind: ModuleKind defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'valueOf' @ [579:55] ==> public final fun valueOf(value: String): ModuleKind defined in org.jetbrains.kotlin.serialization.js.ModuleKind[SimpleFunctionDescriptorImpl]

'moduleKindMatcher' @ [579:63] ==> val moduleKindMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'group' @ [579:81] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'NO_INLINE_PATTERN' @ [582:17] ==> private final val NO_INLINE_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [582:35] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'text' @ [582:43] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'find' @ [582:49] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'currentModule' @ [583:17] ==> val currentModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'inliningDisabled' @ [583:31] ==> public final var inliningDisabled: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'File' @ [586:33] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpDir' @ [586:38] ==> public final val tmpDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'currentModule' @ [586:49] ==> val currentModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'name' @ [586:63] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'fileName' @ [586:70] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'mkdirs' @ [587:29] ==> public open fun mkdirs(@NotNull p0: File): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'temporaryFile' @ [587:36] ==> val temporaryFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'parentFile' @ [587:50] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'temporaryFile' @ [588:13] ==> val temporaryFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'writeText' @ [588:27] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'text' @ [588:37] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'UTF_8' @ [588:52] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'findStringWithPrefixes' @ [590:49] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [590:72] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'version' @ [591:17] ==> val version: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'assert' @ [592:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'currentModule' @ [592:24] ==> val currentModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'languageVersion' @ [592:38] ==> public final var languageVersion: LanguageVersion? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'currentModule' @ [593:17] ==> val currentModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'languageVersion' @ [593:31] ==> public final var languageVersion: LanguageVersion? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'LanguageVersion' @ [593:49] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'fromVersionString' @ [593:65] ==> @JvmStatic public final fun fromVersionString(str: String?): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'version' @ [593:83] ==> val version: String? defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'SOURCE_MAP_SOURCE_EMBEDDING' @ [596:13] ==> private final val SOURCE_MAP_SOURCE_EMBEDDING: Regex defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'find' @ [596:41] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'text' @ [596:46] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'let' @ [596:53] ==> @InlineOnly public inline fun <T, R> MatchResult.let(block: (MatchResult) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult
    <R> -> Unit

'currentModule' @ [597:17] ==> val currentModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'sourceMapSourceEmbedding' @ [597:31] ==> public final var sourceMapSourceEmbedding: SourceMapSourceEmbedding defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'valueOf' @ [597:83] ==> public final fun valueOf(value: String): SourceMapSourceEmbedding defined in org.jetbrains.kotlin.js.config.SourceMapSourceEmbedding[SimpleFunctionDescriptorImpl]

'match' @ [597:91] ==> value-parameter match: MatchResult defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile.<anonymous>[ValueParameterDescriptorImpl]

'groupValues' @ [597:97] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'TestFile' @ [600:20] ==> public constructor TestFile(fileName: String, module: BasicBoxTest.TestModule, recompile: Boolean) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[ClassConstructorDescriptorImpl]

'temporaryFile' @ [600:29] ==> val temporaryFile: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'absolutePath' @ [600:43] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'currentModule' @ [600:57] ==> val currentModule: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'RECOMPILE_PATTERN' @ [600:84] ==> private final val RECOMPILE_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'matcher' @ [600:102] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'text' @ [600:110] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'find' @ [600:116] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'TestModule' @ [604:20] ==> public constructor TestModule(name: String, dependencies: List<String>, friends: List<String>) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[ClassConstructorDescriptorImpl]

'name' @ [604:31] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createModule[ValueParameterDescriptorImpl]

'dependencies' @ [604:37] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createModule[ValueParameterDescriptorImpl]

'friends' @ [604:51] ==> value-parameter friends: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl.createModule[ValueParameterDescriptorImpl]

'delete' @ [608:22] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'tmpDir' @ [608:29] ==> public final val tmpDir: File defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'module' @ [614:13] ==> public final val module: BasicBoxTest.TestModule defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'files' @ [614:20] ==> public final val files: MutableList<BasicBoxTest.TestFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'this' @ [614:29] ==> <this> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[LazyClassReceiverParameterDescriptor]

'dependencies' @ [623:28] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule.<init>[ValueParameterDescriptorImpl]

'toMutableList' @ [623:41] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'friends' @ [624:23] ==> value-parameter friends: List<String> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule.<init>[ValueParameterDescriptorImpl]

'toMutableList' @ [624:31] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'PLAIN' @ [625:37] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'mutableListOf' @ [627:21] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<BasicBoxTest.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'NEVER' @ [629:65] ==> enum entry NEVER defined in org.jetbrains.kotlin.js.config.SourceMapSourceEmbedding[FakeCallableDescriptorForObject]

'files' @ [631:41] ==> public final val files: MutableList<BasicBoxTest.TestFile> defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule[PropertyDescriptorImpl]

'any' @ [631:47] ==> public inline fun <T> Iterable<BasicBoxTest.TestFile>.any(predicate: (BasicBoxTest.TestFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'it' @ [631:53] ==> value-parameter it: BasicBoxTest.TestFile defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestModule.<get-hasFilesToRecompile>.<anonymous>[ValueParameterDescriptorImpl]

'recompile' @ [631:56] ==> public final val recompile: Boolean defined in org.jetbrains.kotlin.js.test.BasicBoxTest.TestFile[PropertyDescriptorImpl]

'KotlinCoreEnvironment' @ [635:16] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [635:38] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [635:53] ==> public final val BasicBoxTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'CompilerConfiguration' @ [635:73] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'JS_CONFIG_FILES' @ [635:121] ==> enum entry JS_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'+' @ [639:31] ==> public operator fun <T> Sequence<(String..String?)>.plus(elements: Iterable<(String..String?)>): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'JS_STDLIB' @ [639:40] ==> public final val JS_STDLIB: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'asSequence' @ [639:50] ==> public fun <T> Iterable<(String..String?)>.asSequence(): Sequence<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'JS_KOTLIN_TEST' @ [639:74] ==> public final val JS_KOTLIN_TEST: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'flatMap' @ [640:18] ==> public fun <T, R> Sequence<(String..String?)>.flatMap(transform: ((String..String?)) -> Sequence<JsModuleDescriptor<KotlinJavaScriptLibraryParts>>): Sequence<JsModuleDescriptor<KotlinJavaScriptLibraryParts>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> JsModuleDescriptor<KotlinJavaScriptLibraryParts>

'KotlinJavascriptMetadataUtils' @ [641:21] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'loadMetadata' @ [642:30] ==> @JvmStatic public final fun loadMetadata(path: String): List<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [642:43] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion.METADATA_CACHE.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [642:47] ==> public fun <T> Iterable<KotlinJavascriptMetadata>.asSequence(): Sequence<KotlinJavascriptMetadata> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJavascriptMetadata

'map' @ [643:30] ==> public fun <T, R> Sequence<KotlinJavascriptMetadata>.map(transform: (KotlinJavascriptMetadata) -> JsModuleDescriptor<KotlinJavaScriptLibraryParts>): Sequence<JsModuleDescriptor<KotlinJavaScriptLibraryParts>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJavascriptMetadata
    <R> -> JsModuleDescriptor<KotlinJavaScriptLibraryParts>

'KotlinJavascriptSerializationUtil' @ [643:36] ==> public object KotlinJavascriptSerializationUtil defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'readModuleAsProto' @ [643:70] ==> @JvmStatic public final fun readModuleAsProto(metadata: ByteArray, name: String): JsModuleDescriptor<KotlinJavaScriptLibraryParts> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [643:88] ==> value-parameter it: KotlinJavascriptMetadata defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion.METADATA_CACHE.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [643:91] ==> public final val body: ByteArray defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadata[DeserializedPropertyDescriptor]

'it' @ [643:97] ==> value-parameter it: KotlinJavascriptMetadata defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion.METADATA_CACHE.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'moduleName' @ [643:100] ==> public final val moduleName: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadata[DeserializedPropertyDescriptor]

'toList' @ [645:18] ==> public fun <T> Sequence<JsModuleDescriptor<KotlinJavaScriptLibraryParts>>.toList(): List<JsModuleDescriptor<KotlinJavaScriptLibraryParts>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsModuleDescriptor<KotlinJavaScriptLibraryParts>

'TEST_DATA_DIR_PATH' @ [652:45] ==> public const final val TEST_DATA_DIR_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'compile' @ [654:51] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'MULTILINE' @ [654:95] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'compile' @ [655:56] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'MULTILINE' @ [655:100] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'compile' @ [656:49] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'MULTILINE' @ [656:86] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'compile' @ [657:44] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'MULTILINE' @ [657:84] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'compile' @ [658:49] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'MULTILINE' @ [658:94] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'compile' @ [660:56] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'EXPECTED_REACHABLE_NODES_DIRECTIVE' @ [660:71] ==> private final val EXPECTED_REACHABLE_NODES_DIRECTIVE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'MULTILINE' @ [660:130] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'compile' @ [661:49] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'MULTILINE' @ [661:86] ==> public const final val MULTILINE: Int defined in java.util.regex.Pattern[JavaPropertyDescriptor]

'Regex' @ [662:51] ==> public constructor Regex(pattern: String, option: RegexOption) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'MULTILINE' @ [662:115] ==> enum entry MULTILINE defined in kotlin.text.RegexOption[FakeCallableDescriptorForObject]

'METADATA_EXTENSION' @ [665:44] ==> private final val METADATA_EXTENSION: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'createScriptEngine' @ [674:41] ==> public fun createScriptEngine(): ScriptEngine defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

