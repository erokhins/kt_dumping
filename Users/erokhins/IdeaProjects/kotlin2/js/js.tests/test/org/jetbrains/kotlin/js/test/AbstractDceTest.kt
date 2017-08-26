'TestCase' @ [24:34] ==> public constructor TestCase() defined in junit.framework.TestCase[JavaClassConstructorDescriptor]

'File' @ [26:20] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filePath' @ [26:25] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[ValueParameterDescriptorImpl]

'file' @ [27:28] ==> val file: File defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'readText' @ [27:33] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'InputFile' @ [28:25] ==> public constructor InputFile(path: String, outputPath: String, moduleName: String? = ...) defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedClassConstructorDescriptor]

'filePath' @ [28:35] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[ValueParameterDescriptorImpl]

'File' @ [28:45] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'pathToOutputDir' @ [28:50] ==> private final val pathToOutputDir: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.Companion[PropertyDescriptorImpl]

'file' @ [28:67] ==> val file: File defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'relativeTo' @ [28:72] ==> public fun File.relativeTo(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [28:83] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'pathToTestDir' @ [28:88] ==> private final val pathToTestDir: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.Companion[PropertyDescriptorImpl]

'path' @ [28:104] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'path' @ [28:110] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'DeadCodeElimination' @ [29:25] ==> public companion object defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[FakeCallableDescriptorForObject]

'run' @ [29:45] ==> public final fun run(inputFiles: Collection<InputFile>, rootReachableNames: Set<String>, logConsumer: (String) -> Unit): DeadCodeEliminationResult defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion[DeserializedSimpleFunctionDescriptor]

'setOf' @ [29:49] ==> public fun <T> setOf(element: InputFile): Set<InputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InputFile

'inputFile' @ [29:55] ==> val inputFile: InputFile defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'extractDeclarations' @ [29:67] ==> private final fun extractDeclarations(regex: Regex, fileContents: String): Set<String> defined in org.jetbrains.kotlin.js.test.AbstractDceTest[SimpleFunctionDescriptorImpl]

'REQUEST_REACHABLE_PATTERN' @ [29:87] ==> private final val REQUEST_REACHABLE_PATTERN: Regex defined in org.jetbrains.kotlin.js.test.AbstractDceTest.Companion[PropertyDescriptorImpl]

'fileContents' @ [29:114] ==> val fileContents: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'dceResult' @ [30:36] ==> val dceResult: DeadCodeEliminationResult defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'reachableNodes' @ [30:46] ==> public final val reachableNodes: Set<Context.Node> defined in org.jetbrains.kotlin.js.dce.DeadCodeEliminationResult[DeserializedPropertyDescriptor]

'map' @ [30:61] ==> public inline fun <T, R> Iterable<Context.Node>.map(transform: (Context.Node) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node
    <R> -> String

'it' @ [30:67] ==> value-parameter it: Context.Node defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [30:70] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.dce.Context.Node[DeserializedSimpleFunctionDescriptor]

'removePrefix' @ [30:81] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toSet' @ [30:110] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'extractDeclarations' @ [32:37] ==> private final fun extractDeclarations(regex: Regex, fileContents: String): Set<String> defined in org.jetbrains.kotlin.js.test.AbstractDceTest[SimpleFunctionDescriptorImpl]

'ASSERT_REACHABLE_PATTERN' @ [32:57] ==> private final val ASSERT_REACHABLE_PATTERN: Regex defined in org.jetbrains.kotlin.js.test.AbstractDceTest.Companion[PropertyDescriptorImpl]

'fileContents' @ [32:83] ==> val fileContents: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'assertTrue' @ [33:22] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'assertedDeclaration' @ [33:47] ==> val assertedDeclaration: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'assertedDeclaration' @ [33:81] ==> val assertedDeclaration: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'reachableNodeStrings' @ [33:104] ==> val reachableNodeStrings: Set<String> defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'extractDeclarations' @ [35:37] ==> private final fun extractDeclarations(regex: Regex, fileContents: String): Set<String> defined in org.jetbrains.kotlin.js.test.AbstractDceTest[SimpleFunctionDescriptorImpl]

'ASSERT_UNREACHABLE_PATTERN' @ [35:57] ==> private final val ASSERT_UNREACHABLE_PATTERN: Regex defined in org.jetbrains.kotlin.js.test.AbstractDceTest.Companion[PropertyDescriptorImpl]

'fileContents' @ [35:85] ==> val fileContents: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'assertTrue' @ [36:22] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'assertedDeclaration' @ [36:47] ==> val assertedDeclaration: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'assertedDeclaration' @ [36:77] ==> val assertedDeclaration: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'reachableNodeStrings' @ [36:101] ==> val reachableNodeStrings: Set<String> defined in org.jetbrains.kotlin.js.test.AbstractDceTest.doTest[LocalVariableDescriptor]

'regex' @ [41:13] ==> value-parameter regex: Regex defined in org.jetbrains.kotlin.js.test.AbstractDceTest.extractDeclarations[ValueParameterDescriptorImpl]

'findAll' @ [41:19] ==> public final fun findAll(input: CharSequence, startIndex: Int = ...): Sequence<MatchResult> defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'fileContents' @ [41:27] ==> value-parameter fileContents: String defined in org.jetbrains.kotlin.js.test.AbstractDceTest.extractDeclarations[ValueParameterDescriptorImpl]

'map' @ [41:41] ==> public fun <T, R> Sequence<MatchResult>.map(transform: (MatchResult) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult
    <R> -> String

'it' @ [41:47] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.js.test.AbstractDceTest.extractDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'groupValues' @ [41:50] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'toSet' @ [41:67] ==> public fun <T> Sequence<String>.toSet(): Set<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Regex' @ [44:48] ==> public constructor Regex(pattern: String, option: RegexOption) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'MULTILINE' @ [44:102] ==> enum entry MULTILINE defined in kotlin.text.RegexOption[FakeCallableDescriptorForObject]

'Regex' @ [45:50] ==> public constructor Regex(pattern: String, option: RegexOption) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'MULTILINE' @ [45:106] ==> enum entry MULTILINE defined in kotlin.text.RegexOption[FakeCallableDescriptorForObject]

'Regex' @ [46:49] ==> public constructor Regex(pattern: String, option: RegexOption) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'MULTILINE' @ [46:104] ==> enum entry MULTILINE defined in kotlin.text.RegexOption[FakeCallableDescriptorForObject]

