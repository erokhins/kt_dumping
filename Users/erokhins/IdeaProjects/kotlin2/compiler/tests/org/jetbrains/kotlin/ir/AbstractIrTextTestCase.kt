'AbstractIrGeneratorTestCase' @ [38:41] ==> public constructor AbstractIrGeneratorTestCase() defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[ClassConstructorDescriptorImpl]

'wholeFile' @ [40:19] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[ValueParameterDescriptorImpl]

'parentFile' @ [40:29] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'shouldIgnoreErrors' @ [41:28] ==> internal final fun shouldIgnoreErrors(wholeFile: File): Boolean defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[SimpleFunctionDescriptorImpl]

'wholeFile' @ [41:47] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[ValueParameterDescriptorImpl]

'generateIrModule' @ [42:24] ==> protected final fun generateIrModule(ignoreErrors: Boolean, shouldGenerate: (KtFile) -> Boolean): IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase[SimpleFunctionDescriptorImpl]

'ignoreErrors' @ [42:41] ==> val ignoreErrors: Boolean defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[LocalVariableDescriptor]

'testFiles' @ [44:23] ==> value-parameter testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[ValueParameterDescriptorImpl]

'filter' @ [44:33] ==> public inline fun <T> Iterable<CodegenTestCase.TestFile>.filter(predicate: (CodegenTestCase.TestFile) -> Boolean): List<CodegenTestCase.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'it' @ [44:42] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [44:45] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'endsWith' @ [44:50] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [45:15] ==> public final operator fun component1(): CodegenTestCase.TestFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [45:25] ==> public final operator fun component2(): IrFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'ktFiles' @ [45:36] ==> val ktFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[LocalVariableDescriptor]

'zip' @ [45:44] ==> public infix fun <T, R> Iterable<CodegenTestCase.TestFile>.zip(other: Iterable<IrFile>): List<Pair<CodegenTestCase.TestFile, IrFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R> -> IrFile

'irModule' @ [45:48] ==> val irModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[LocalVariableDescriptor]

'files' @ [45:57] ==> public abstract val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[DeserializedPropertyDescriptor]

'doTestIrFileAgainstExpectations' @ [46:13] ==> protected final fun doTestIrFileAgainstExpectations(dir: File, testFile: CodegenTestCase.TestFile, irFile: IrFile): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase[SimpleFunctionDescriptorImpl]

'dir' @ [46:45] ==> val dir: (File..File?) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[LocalVariableDescriptor]

'testFile' @ [46:50] ==> val testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[LocalVariableDescriptor]

'irFile' @ [46:60] ==> val irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[LocalVariableDescriptor]

'shouldDumpDependencies' @ [49:13] ==> internal final fun shouldDumpDependencies(wholeFile: File): Boolean defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[SimpleFunctionDescriptorImpl]

'wholeFile' @ [49:36] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[ValueParameterDescriptorImpl]

'doTestIrModuleDependencies' @ [50:13] ==> private final fun doTestIrModuleDependencies(wholeFile: File, irModule: IrModuleFragment): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase[SimpleFunctionDescriptorImpl]

'wholeFile' @ [50:40] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[ValueParameterDescriptorImpl]

'irModule' @ [50:51] ==> val irModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTest[LocalVariableDescriptor]

'irModule' @ [55:9] ==> value-parameter irModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrModuleDependencies[ValueParameterDescriptorImpl]

'dependencyModules' @ [55:18] ==> public abstract val dependencyModules: MutableList<IrModuleFragment> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[DeserializedPropertyDescriptor]

'forEach' @ [55:36] ==> @HidesMembers public inline fun <T> Iterable<IrModuleFragment>.forEach(action: (IrModuleFragment) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrModuleFragment

'irDependencyModule' @ [56:26] ==> value-parameter irDependencyModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrModuleDependencies.<anonymous>[ValueParameterDescriptorImpl]

'dump' @ [56:45] ==> public fun IrElement.dump(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'sanitizeJavaIdentifier' @ [57:50] ==> @NotNull @Contract public open fun sanitizeJavaIdentifier(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'irDependencyModule' @ [57:73] ==> value-parameter irDependencyModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrModuleDependencies.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [57:92] ==> public abstract val descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[DeserializedPropertyDescriptor]

'name' @ [57:103] ==> public final val ModuleDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [57:108] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'wholeFile' @ [58:36] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrModuleDependencies[ValueParameterDescriptorImpl]

'absolutePath' @ [58:46] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'replace' @ [58:59] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sanitizedModuleName' @ [58:78] ==> val sanitizedModuleName: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrModuleDependencies.<anonymous>[LocalVariableDescriptor]

'assertEqualsToFile' @ [59:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [59:48] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'expectedFileName' @ [59:53] ==> val expectedFileName: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrModuleDependencies.<anonymous>[LocalVariableDescriptor]

'actual' @ [59:72] ==> val actual: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrModuleDependencies.<anonymous>[LocalVariableDescriptor]

'testFile' @ [64:13] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'isExternalFile' @ [64:22] ==> internal final fun CodegenTestCase.TestFile.isExternalFile(): Boolean defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[SimpleFunctionDescriptorImpl]

'parseExpectations' @ [66:28] ==> internal final fun parseExpectations(dir: File, testFile: CodegenTestCase.TestFile): AbstractIrTextTestCase.Expectations defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[SimpleFunctionDescriptorImpl]

'dir' @ [66:46] ==> value-parameter dir: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'testFile' @ [66:51] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'irFile' @ [67:26] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'dump' @ [67:33] ==> public fun IrElement.dump(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [69:24] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'StringBuilder' @ [70:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'expectations' @ [71:29] ==> val expectations: AbstractIrTextTestCase.Expectations defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'regexps' @ [71:42] ==> public final val regexps: List<AbstractIrTextTestCase.RegexpInText> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Expectations[PropertyDescriptorImpl]

'expected' @ [72:13] ==> val expected: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'append' @ [72:22] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expectation' @ [72:29] ==> val expectation: AbstractIrTextTestCase.RegexpInText defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'numberOfOccurrences' @ [72:41] ==> public final val numberOfOccurrences: Int defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText[PropertyDescriptorImpl]

'append' @ [72:62] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [72:74] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expectation' @ [72:81] ==> val expectation: AbstractIrTextTestCase.RegexpInText defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'needle' @ [72:93] ==> public final val needle: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText[PropertyDescriptorImpl]

'append' @ [72:101] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'findMatches' @ [73:42] ==> @NotNull @Contract public open fun findMatches(@NotNull p0: String, @NotNull p1: Pattern): (MutableList<(String..String?)>..List<(String..String?)>) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'irFileDump' @ [73:54] ==> val irFileDump: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'compile' @ [73:74] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'+' @ [73:82] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expectation' @ [73:88] ==> val expectation: AbstractIrTextTestCase.RegexpInText defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'needle' @ [73:100] ==> public final val needle: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText[PropertyDescriptorImpl]

'size' @ [73:115] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'actual' @ [74:13] ==> val actual: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'append' @ [74:20] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'actualCount' @ [74:27] ==> val actualCount: Int defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'append' @ [74:40] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [74:52] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expectation' @ [74:59] ==> val expectation: AbstractIrTextTestCase.RegexpInText defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'needle' @ [74:71] ==> public final val needle: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText[PropertyDescriptorImpl]

'append' @ [74:79] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expectations' @ [77:33] ==> val expectations: AbstractIrTextTestCase.Expectations defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'irTreeFileLabels' @ [77:46] ==> public final val irTreeFileLabels: List<AbstractIrTextTestCase.IrTreeFileLabel> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Expectations[PropertyDescriptorImpl]

'irFile' @ [78:31] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'dumpTreesFromLineNumber' @ [78:38] ==> public fun IrFile.dumpTreesFromLineNumber(lineNumber: Int): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'irTreeFileLabel' @ [78:62] ==> val irTreeFileLabel: AbstractIrTextTestCase.IrTreeFileLabel defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'lineNumber' @ [78:78] ==> public final val lineNumber: Int defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrTreeFileLabel[PropertyDescriptorImpl]

'assertEqualsToFile' @ [79:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'irTreeFileLabel' @ [79:48] ==> val irTreeFileLabel: AbstractIrTextTestCase.IrTreeFileLabel defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'expectedTextFile' @ [79:64] ==> public final val expectedTextFile: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrTreeFileLabel[PropertyDescriptorImpl]

'actualTrees' @ [79:82] ==> val actualTrees: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'verify' @ [80:13] ==> private final fun verify(irFile: IrFile): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase[SimpleFunctionDescriptorImpl]

'irFile' @ [80:20] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'irFile' @ [83:30] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'deepCopyWithSymbols' @ [83:37] ==> public inline fun <reified T : IrElement> IrFile.deepCopyWithSymbols(): IrFile defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : IrElement> -> IrFile

'irFileCopy' @ [84:31] ==> val irFileCopy: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'dumpTreesFromLineNumber' @ [84:42] ==> public fun IrFile.dumpTreesFromLineNumber(lineNumber: Int): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'irTreeFileLabel' @ [84:66] ==> val irTreeFileLabel: AbstractIrTextTestCase.IrTreeFileLabel defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'lineNumber' @ [84:82] ==> public final val lineNumber: Int defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrTreeFileLabel[PropertyDescriptorImpl]

'assertEquals' @ [85:22] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'actualTrees' @ [85:84] ==> val actualTrees: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'copiedTrees' @ [85:97] ==> val copiedTrees: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'verify' @ [86:13] ==> private final fun verify(irFile: IrFile): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase[SimpleFunctionDescriptorImpl]

'irFileCopy' @ [86:20] ==> val irFileCopy: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'irFile' @ [88:33] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'deepCopyOld' @ [88:40] ==> public inline fun <reified T : IrElement> IrFile.deepCopyOld(): IrFile defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : IrElement> -> IrFile

'irFileCopyOld' @ [89:34] ==> val irFileCopyOld: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'dumpTreesFromLineNumber' @ [89:48] ==> public fun IrFile.dumpTreesFromLineNumber(lineNumber: Int): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'irTreeFileLabel' @ [89:72] ==> val irTreeFileLabel: AbstractIrTextTestCase.IrTreeFileLabel defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'lineNumber' @ [89:88] ==> public final val lineNumber: Int defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrTreeFileLabel[PropertyDescriptorImpl]

'assertEquals' @ [90:22] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'actualTrees' @ [90:75] ==> val actualTrees: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'copiedTreesOld' @ [90:88] ==> val copiedTreesOld: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'assertEquals' @ [94:22] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'irFileDump' @ [94:35] ==> val irFileDump: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'expected' @ [94:47] ==> val expected: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'toString' @ [94:56] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'actual' @ [94:68] ==> val actual: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'toString' @ [94:75] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'println' @ [97:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'irFileDump' @ [97:21] ==> val irFileDump: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'rethrow' @ [98:19] ==> public fun rethrow(e: Throwable): RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]

'e' @ [98:27] ==> val e: Throwable defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'IrVerifier' @ [103:9] ==> public constructor IrVerifier() defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[ClassConstructorDescriptorImpl]

'verifyWithAssert' @ [103:22] ==> public final fun verifyWithAssert(irFile: IrFile): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'irFile' @ [103:39] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.verify[ValueParameterDescriptorImpl]

'ArrayList' @ [107:30] ==> public final fun <E> <init>(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'HashMap' @ [109:44] ==> public final fun <K, V> <init>(): HashMap<IrElement, IrSymbol> /* = HashMap<IrElement, IrSymbol> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> IrElement
    <V> -> IrSymbol

'errors' @ [111:31] ==> private final val errors: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[PropertyDescriptorImpl]

'isNotEmpty' @ [111:38] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'errors' @ [113:37] ==> private final val errors: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[PropertyDescriptorImpl]

'joinToString' @ [113:44] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'errors' @ [116:13] ==> private final val errors: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[PropertyDescriptorImpl]

'add' @ [116:20] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'message' @ [116:24] ==> value-parameter message: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.error[ValueParameterDescriptorImpl]

'irFile' @ [120:13] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.verifyWithAssert[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [120:20] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [120:39] ==> <this> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[LazyClassReceiverParameterDescriptor]

'assertFalse' @ [121:22] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'errorsAsMessage' @ [121:34] ==> public final val errorsAsMessage: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[PropertyDescriptorImpl]

'irFile' @ [121:63] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.verifyWithAssert[ValueParameterDescriptorImpl]

'dump' @ [121:70] ==> public fun IrElement.dump(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'hasErrors' @ [121:78] ==> public final val hasErrors: Boolean defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[PropertyDescriptorImpl]

'element' @ [125:13] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [125:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [125:40] ==> <this> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[LazyClassReceiverParameterDescriptor]

'declaration' @ [129:17] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [130:17] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclaration[ValueParameterDescriptorImpl]

'symbol' @ [130:29] ==> public abstract val symbol: IrSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSymbolOwner[DeserializedPropertyDescriptor]

'checkBinding' @ [130:36] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'declaration' @ [130:57] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [132:21] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclaration[ValueParameterDescriptorImpl]

'symbol' @ [132:33] ==> public abstract val symbol: IrSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSymbolOwner[DeserializedPropertyDescriptor]

'owner' @ [132:40] ==> public abstract val owner: IrSymbolOwner defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[DeserializedPropertyDescriptor]

'declaration' @ [132:49] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclaration[ValueParameterDescriptorImpl]

'error' @ [133:21] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'declaration' @ [133:66] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclaration[ValueParameterDescriptorImpl]

'render' @ [133:78] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'visitDeclaration' @ [139:13] ==> public open fun visitDeclaration(declaration: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'declaration' @ [139:30] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[ValueParameterDescriptorImpl]

'declaration' @ [141:38] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [141:50] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'checkTypeParameters' @ [143:13] ==> private final fun checkTypeParameters(descriptor: DeclarationDescriptor, declaration: IrTypeParametersContainer, expectedTypeParameters: List<TypeParameterDescriptor>): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [143:33] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'declaration' @ [143:53] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [143:66] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'typeParameters' @ [143:85] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'functionDescriptor' @ [145:44] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [145:63] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'declaration' @ [146:42] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [146:54] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'descriptor' @ [146:81] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'expectedDispatchReceiver' @ [147:17] ==> val expectedDispatchReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'actualDispatchReceiver' @ [147:45] ==> val actualDispatchReceiver: ParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'error' @ [148:17] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'+' @ [148:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [148:25] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'expectedDispatchReceiver' @ [149:34] ==> val expectedDispatchReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'actualDispatchReceiver' @ [149:68] ==> val actualDispatchReceiver: ParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'functionDescriptor' @ [152:46] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'extensionReceiverParameter' @ [152:65] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'declaration' @ [153:43] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [153:55] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'descriptor' @ [153:83] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'expectedExtensionReceiver' @ [154:17] ==> val expectedExtensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'actualExtensionReceiver' @ [154:46] ==> val actualExtensionReceiver: ParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'error' @ [155:17] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'+' @ [155:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [155:25] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'expectedExtensionReceiver' @ [156:34] ==> val expectedExtensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'actualExtensionReceiver' @ [156:69] ==> val actualExtensionReceiver: ParameterDescriptor? defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'declaration' @ [159:43] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [159:55] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'map' @ [159:71] ==> public inline fun <T, R> Iterable<IrValueParameter>.map(transform: (IrValueParameter) -> ParameterDescriptor): List<ParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter
    <R> -> ParameterDescriptor

'it' @ [159:77] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [159:80] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'functionDescriptor' @ [160:41] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'valueParameters' @ [160:60] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'if (declaredValueParameters.size != actualValueParameters.size) {
                error("$functionDescriptor: Value parameters mismatch: $declaredValueParameters != $actualValueParameters")
            }
            else {
                declaredValueParameters.zip(actualValueParameters).forEach { (declaredValueParameter, actualValueParameter) ->
                    if (declaredValueParameter != actualValueParameter) {
                        error("$functionDescriptor: Value parameters mismatch: $declaredValueParameter != $actualValueParameter")
                    }
                }
            }' @ [161:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaredValueParameters' @ [161:17] ==> val declaredValueParameters: List<ParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'size' @ [161:41] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'actualValueParameters' @ [161:49] ==> val actualValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'size' @ [161:71] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'error' @ [162:17] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [162:25] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'declaredValueParameters' @ [162:73] ==> val declaredValueParameters: List<ParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'actualValueParameters' @ [162:101] ==> val actualValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'declaredValueParameters' @ [165:17] ==> val declaredValueParameters: List<ParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'zip' @ [165:41] ==> public infix fun <T, R> Iterable<ParameterDescriptor>.zip(other: Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>): List<Pair<ParameterDescriptor, (ValueParameterDescriptor..ValueParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterDescriptor
    <R> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'actualValueParameters' @ [165:45] ==> val actualValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'forEach' @ [165:68] ==> @HidesMembers public inline fun <T> Iterable<Pair<ParameterDescriptor, (ValueParameterDescriptor..ValueParameterDescriptor?)>>.forEach(action: (Pair<ParameterDescriptor, (ValueParameterDescriptor..ValueParameterDescriptor?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ParameterDescriptor, (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>

'component1' @ [165:79] ==> public final operator fun component1(): ParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [165:103] ==> public final operator fun component2(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'declaredValueParameter' @ [166:25] ==> val declaredValueParameter: ParameterDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction.<anonymous>[LocalVariableDescriptor]

'actualValueParameter' @ [166:51] ==> val actualValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction.<anonymous>[LocalVariableDescriptor]

'error' @ [167:25] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [167:33] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction[LocalVariableDescriptor]

'declaredValueParameter' @ [167:81] ==> val declaredValueParameter: ParameterDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction.<anonymous>[LocalVariableDescriptor]

'actualValueParameter' @ [167:108] ==> val actualValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunction.<anonymous>[LocalVariableDescriptor]

'expression' @ [174:13] ==> value-parameter expression: IrDeclarationReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclarationReference[ValueParameterDescriptorImpl]

'symbol' @ [174:24] ==> public abstract val symbol: IrSymbol defined in org.jetbrains.kotlin.ir.expressions.IrDeclarationReference[DeserializedPropertyDescriptor]

'checkBinding' @ [174:31] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [174:51] ==> value-parameter expression: IrDeclarationReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitDeclarationReference[ValueParameterDescriptorImpl]

'expression' @ [178:13] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunctionReference[ValueParameterDescriptorImpl]

'symbol' @ [178:24] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'checkBinding' @ [178:31] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [178:51] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitFunctionReference[ValueParameterDescriptorImpl]

'expression' @ [182:13] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitPropertyReference[ValueParameterDescriptorImpl]

'field' @ [182:24] ==> public abstract val field: IrFieldSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[DeserializedPropertyDescriptor]

'checkBinding' @ [182:31] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [182:53] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [183:13] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [183:24] ==> public abstract val getter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[DeserializedPropertyDescriptor]

'checkBinding' @ [183:32] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [183:55] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [184:13] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [184:24] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[DeserializedPropertyDescriptor]

'checkBinding' @ [184:32] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [184:55] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [188:13] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'delegate' @ [188:24] ==> public abstract val delegate: IrVariableSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[DeserializedPropertyDescriptor]

'checkBinding' @ [188:33] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [188:58] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [189:13] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [189:24] ==> public abstract val getter: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[DeserializedPropertyDescriptor]

'checkBinding' @ [189:31] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [189:54] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [190:13] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [190:24] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[DeserializedPropertyDescriptor]

'checkBinding' @ [190:32] ==> private final fun IrSymbol.checkBinding(kind: String, irElement: IrElement): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'expression' @ [190:55] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'!' @ [194:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBound' @ [194:18] ==> public abstract val isBound: Boolean defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[DeserializedPropertyDescriptor]

'error' @ [195:17] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'javaClass' @ [195:26] ==> public val <T : Any> IrSymbol.javaClass: Class<IrSymbol> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> IrSymbol

'simpleName' @ [195:36] ==> public final val <T : (Any..Any?)> Class<IrSymbol>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IrSymbol

'descriptor' @ [195:49] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[DeserializedPropertyDescriptor]

'kind' @ [195:73] ==> value-parameter kind: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkBinding[ValueParameterDescriptorImpl]

'irElement' @ [195:80] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkBinding[ValueParameterDescriptorImpl]

'render' @ [195:90] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'symbolForDeclaration' @ [198:31] ==> private final val symbolForDeclaration: HashMap<IrElement, IrSymbol> /* = HashMap<IrElement, IrSymbol> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[PropertyDescriptorImpl]

'getOrPut' @ [198:52] ==> public inline fun <K, V> MutableMap<IrElement, IrSymbol>.getOrPut(key: IrElement, defaultValue: () -> IrSymbol): IrSymbol defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrElement
    <V> -> IrSymbol

'owner' @ [198:61] ==> public abstract val owner: IrSymbolOwner defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[DeserializedPropertyDescriptor]

'this' @ [198:70] ==> <this> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkBinding[ReceiverParameterDescriptorImpl]

'this' @ [199:17] ==> <this> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkBinding[ReceiverParameterDescriptorImpl]

'otherSymbol' @ [199:25] ==> val otherSymbol: IrSymbol defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkBinding[LocalVariableDescriptor]

'error' @ [200:17] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'descriptor' @ [200:46] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[DeserializedPropertyDescriptor]

'kind' @ [200:59] ==> value-parameter kind: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkBinding[ValueParameterDescriptorImpl]

'irElement' @ [200:66] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkBinding[ValueParameterDescriptorImpl]

'render' @ [200:76] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'visitDeclaration' @ [205:13] ==> public open fun visitDeclaration(declaration: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'declaration' @ [205:30] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitClass[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [207:13] ==> private final fun checkTypeParameters(descriptor: DeclarationDescriptor, declaration: IrTypeParametersContainer, expectedTypeParameters: List<TypeParameterDescriptor>): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'declaration' @ [207:33] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [207:45] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'declaration' @ [207:57] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitClass[ValueParameterDescriptorImpl]

'declaration' @ [207:70] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [207:82] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'declaredTypeParameters' @ [207:93] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'declaration' @ [211:42] ==> value-parameter declaration: IrTypeParametersContainer defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[ValueParameterDescriptorImpl]

'typeParameters' @ [211:54] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer[DeserializedPropertyDescriptor]

'map' @ [211:69] ==> public inline fun <T, R> Iterable<IrTypeParameter>.map(transform: (IrTypeParameter) -> TypeParameterDescriptor): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrTypeParameter
    <R> -> TypeParameterDescriptor

'it' @ [211:75] ==> value-parameter it: IrTypeParameter defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [211:78] ==> public abstract val descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrTypeParameter[DeserializedPropertyDescriptor]

'if (declaredTypeParameters.size != expectedTypeParameters.size) {
                error("$descriptor: Type parameters mismatch: $declaredTypeParameters != $expectedTypeParameters")
            }
            else {
                declaredTypeParameters.zip(expectedTypeParameters).forEach { (declaredTypeParameter, expectedTypeParameter) ->
                    if (declaredTypeParameter != expectedTypeParameter) {
                        error("$descriptor: Type parameters mismatch: $declaredTypeParameter != $expectedTypeParameter")
                    }
                }
            }' @ [213:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaredTypeParameters' @ [213:17] ==> val declaredTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[LocalVariableDescriptor]

'size' @ [213:40] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expectedTypeParameters' @ [213:48] ==> value-parameter expectedTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[ValueParameterDescriptorImpl]

'size' @ [213:71] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'error' @ [214:17] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'descriptor' @ [214:25] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [214:64] ==> val declaredTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[LocalVariableDescriptor]

'expectedTypeParameters' @ [214:91] ==> value-parameter expectedTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [217:17] ==> val declaredTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[LocalVariableDescriptor]

'zip' @ [217:40] ==> public infix fun <T, R> Iterable<TypeParameterDescriptor>.zip(other: Iterable<TypeParameterDescriptor>): List<Pair<TypeParameterDescriptor, TypeParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> TypeParameterDescriptor

'expectedTypeParameters' @ [217:44] ==> value-parameter expectedTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[ValueParameterDescriptorImpl]

'forEach' @ [217:68] ==> @HidesMembers public inline fun <T> Iterable<Pair<TypeParameterDescriptor, TypeParameterDescriptor>>.forEach(action: (Pair<TypeParameterDescriptor, TypeParameterDescriptor>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TypeParameterDescriptor, TypeParameterDescriptor>

'component1' @ [217:79] ==> public final operator fun component1(): TypeParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [217:102] ==> public final operator fun component2(): TypeParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'declaredTypeParameter' @ [218:25] ==> val declaredTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters.<anonymous>[LocalVariableDescriptor]

'expectedTypeParameter' @ [218:50] ==> val expectedTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters.<anonymous>[LocalVariableDescriptor]

'error' @ [219:25] ==> private final fun error(message: String): Unit defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier[SimpleFunctionDescriptorImpl]

'descriptor' @ [219:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters[ValueParameterDescriptorImpl]

'declaredTypeParameter' @ [219:72] ==> val declaredTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters.<anonymous>[LocalVariableDescriptor]

'expectedTypeParameter' @ [219:98] ==> val expectedTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrVerifier.checkTypeParameters.<anonymous>[LocalVariableDescriptor]

'this' @ [229:57] ==> public constructor RegexpInText(numberOfOccurrences: Int, needle: String) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText[ClassConstructorDescriptorImpl]

'valueOf' @ [229:70] ==> public open fun valueOf(p0: (String..String?)): (Int..Int?) defined in java.lang.Integer[JavaMethodDescriptor]

'countStr' @ [229:78] ==> value-parameter countStr: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText.<init>[ValueParameterDescriptorImpl]

'needle' @ [229:89] ==> value-parameter needle: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText.<init>[ValueParameterDescriptorImpl]

'Regex' @ [235:52] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'Regex' @ [236:43] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'Regex' @ [238:49] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'Regex' @ [240:45] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'DUMP_DEPENDENCIES_PATTERN' @ [243:17] ==> private final val DUMP_DEPENDENCIES_PATTERN: Regex defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[PropertyDescriptorImpl]

'containsMatchIn' @ [243:43] ==> public final fun containsMatchIn(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'wholeFile' @ [243:59] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.shouldDumpDependencies[ValueParameterDescriptorImpl]

'readText' @ [243:69] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'EXTERNAL_FILE_PATTERN' @ [246:17] ==> private final val EXTERNAL_FILE_PATTERN: Regex defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[PropertyDescriptorImpl]

'containsMatchIn' @ [246:39] ==> public final fun containsMatchIn(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'content' @ [246:55] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'EXTERNAL_FILE_PATTERN' @ [249:17] ==> private final val EXTERNAL_FILE_PATTERN: Regex defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[PropertyDescriptorImpl]

'containsMatchIn' @ [249:39] ==> public final fun containsMatchIn(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'text' @ [249:55] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'ArrayList' @ [252:27] ==> public final fun <E> <init>(): ArrayList<AbstractIrTextTestCase.RegexpInText> /* = ArrayList<AbstractIrTextTestCase.RegexpInText> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> RegexpInText

'ArrayList' @ [253:29] ==> public final fun <E> <init>(): ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> /* = ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> IrTreeFileLabel

'testFile' @ [255:26] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[ValueParameterDescriptorImpl]

'content' @ [255:35] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'split' @ [255:43] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'EXPECTED_OCCURRENCES_PATTERN' @ [256:17] ==> private final val EXPECTED_OCCURRENCES_PATTERN: Regex defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[PropertyDescriptorImpl]

'matchEntire' @ [256:46] ==> public final fun matchEntire(input: CharSequence): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'line' @ [256:58] ==> val line: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'let' @ [256:65] ==> @InlineOnly public inline fun <T, R> MatchResult.let(block: (MatchResult) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult
    <R> -> Boolean

'regexps' @ [257:21] ==> val regexps: ArrayList<AbstractIrTextTestCase.RegexpInText> /* = ArrayList<AbstractIrTextTestCase.RegexpInText> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'add' @ [257:29] ==> public open fun add(element: AbstractIrTextTestCase.RegexpInText): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'RegexpInText' @ [257:33] ==> public constructor RegexpInText(countStr: String, needle: String) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.RegexpInText[ClassConstructorDescriptorImpl]

'matchResult' @ [257:46] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations.<anonymous>[ValueParameterDescriptorImpl]

'groupValues' @ [257:58] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'matchResult' @ [257:74] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations.<anonymous>[ValueParameterDescriptorImpl]

'groupValues' @ [257:86] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'trim' @ [257:101] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'IR_FILE_TXT_PATTERN' @ [259:20] ==> private final val IR_FILE_TXT_PATTERN: Regex defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion[PropertyDescriptorImpl]

'find' @ [259:40] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'line' @ [259:45] ==> val line: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'let' @ [259:52] ==> @InlineOnly public inline fun <T, R> MatchResult.let(block: (MatchResult) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult
    <R> -> Boolean

'matchResult' @ [260:36] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations.<anonymous>[ValueParameterDescriptorImpl]

'groupValues' @ [260:48] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'trim' @ [260:63] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'createExpectedTextFile' @ [261:32] ==> internal final fun createExpectedTextFile(testFile: CodegenTestCase.TestFile, dir: File, fileName: String): File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[SimpleFunctionDescriptorImpl]

'testFile' @ [261:55] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[ValueParameterDescriptorImpl]

'dir' @ [261:65] ==> value-parameter dir: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[ValueParameterDescriptorImpl]

'fileName' @ [261:70] ==> val fileName: String defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations.<anonymous>[LocalVariableDescriptor]

'treeFiles' @ [262:21] ==> val treeFiles: ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> /* = ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'add' @ [262:31] ==> public open fun add(element: AbstractIrTextTestCase.IrTreeFileLabel): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'IrTreeFileLabel' @ [262:35] ==> public constructor IrTreeFileLabel(expectedTextFile: File, lineNumber: Int) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrTreeFileLabel[ClassConstructorDescriptorImpl]

'file' @ [262:51] ==> val file: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations.<anonymous>[LocalVariableDescriptor]

'treeFiles' @ [266:17] ==> val treeFiles: ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> /* = ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'isEmpty' @ [266:27] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createExpectedTextFile' @ [267:28] ==> internal final fun createExpectedTextFile(testFile: CodegenTestCase.TestFile, dir: File, fileName: String): File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[SimpleFunctionDescriptorImpl]

'testFile' @ [267:51] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[ValueParameterDescriptorImpl]

'dir' @ [267:61] ==> value-parameter dir: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[ValueParameterDescriptorImpl]

'testFile' @ [267:66] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[ValueParameterDescriptorImpl]

'name' @ [267:75] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'replace' @ [267:80] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'treeFiles' @ [268:17] ==> val treeFiles: ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> /* = ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'add' @ [268:27] ==> public open fun add(element: AbstractIrTextTestCase.IrTreeFileLabel): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'IrTreeFileLabel' @ [268:31] ==> public constructor IrTreeFileLabel(expectedTextFile: File, lineNumber: Int) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.IrTreeFileLabel[ClassConstructorDescriptorImpl]

'file' @ [268:47] ==> val file: File defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'Expectations' @ [271:20] ==> public constructor Expectations(regexps: List<AbstractIrTextTestCase.RegexpInText>, irTreeFileLabels: List<AbstractIrTextTestCase.IrTreeFileLabel>) defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Expectations[ClassConstructorDescriptorImpl]

'regexps' @ [271:33] ==> val regexps: ArrayList<AbstractIrTextTestCase.RegexpInText> /* = ArrayList<AbstractIrTextTestCase.RegexpInText> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

'treeFiles' @ [271:42] ==> val treeFiles: ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> /* = ArrayList<AbstractIrTextTestCase.IrTreeFileLabel> */ defined in org.jetbrains.kotlin.ir.AbstractIrTextTestCase.Companion.parseExpectations[LocalVariableDescriptor]

