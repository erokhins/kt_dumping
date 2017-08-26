'AbstractIrGeneratorTestCase' @ [27:49] ==> public constructor AbstractIrGeneratorTestCase() defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[ClassConstructorDescriptorImpl]

'wholeFile' @ [29:19] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[ValueParameterDescriptorImpl]

'parentFile' @ [29:29] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'generateIrFilesAsSingleModule' @ [30:32] ==> protected final fun generateIrFilesAsSingleModule(testFiles: List<CodegenTestCase.TestFile>, ignoreErrors: Boolean): Map<CodegenTestCase.TestFile, IrFile> defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase[SimpleFunctionDescriptorImpl]

'testFiles' @ [30:62] ==> value-parameter testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[ValueParameterDescriptorImpl]

'component1' @ [31:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CodegenTestCase.TestFile, IrFile>.component1(): CodegenTestCase.TestFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestFile
    <V> -> IrFile

'component2' @ [31:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CodegenTestCase.TestFile, IrFile>.component2(): IrFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestFile
    <V> -> IrFile

'testFileToIrFile' @ [31:36] ==> val testFileToIrFile: Map<CodegenTestCase.TestFile, IrFile> defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[LocalVariableDescriptor]

'irFile' @ [32:30] ==> val irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[LocalVariableDescriptor]

'dumpWithSourceLocations' @ [32:37] ==> private final fun IrElement.dumpWithSourceLocations(fileEntry: SourceManager.FileEntry): String defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase[SimpleFunctionDescriptorImpl]

'irFile' @ [32:61] ==> val irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[LocalVariableDescriptor]

'fileEntry' @ [32:68] ==> public abstract val fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'File' @ [33:43] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [33:48] ==> val dir: (File..File?) defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[LocalVariableDescriptor]

'testFile' @ [33:53] ==> val testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[LocalVariableDescriptor]

'name' @ [33:62] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'replace' @ [33:67] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEqualsToFile' @ [34:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedSourceLocations' @ [34:48] ==> val expectedSourceLocations: File defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[LocalVariableDescriptor]

'irFileDump' @ [34:73] ==> val irFileDump: String defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.doTest[LocalVariableDescriptor]

'StringBuilder' @ [39:13] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'also' @ [39:29] ==> @InlineOnly @SinceKotlin public inline fun <T> StringBuilder /* = StringBuilder */.also(block: (StringBuilder /* = StringBuilder */) -> Unit): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder

'acceptVoid' @ [40:17] ==> public fun IrElement.acceptVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'DumpSourceLocations' @ [40:28] ==> public constructor DumpSourceLocations(out: Appendable /* = Appendable */, fileEntry: SourceManager.FileEntry) defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[ClassConstructorDescriptorImpl]

'it' @ [40:48] ==> value-parameter it: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.dumpWithSourceLocations.<anonymous>[ValueParameterDescriptorImpl]

'fileEntry' @ [40:52] ==> value-parameter fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.dumpWithSourceLocations[ValueParameterDescriptorImpl]

'toString' @ [41:15] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Printer' @ [47:23] ==> public constructor Printer(@NotNull p0: Appendable, @NotNull p1: String) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'out' @ [47:31] ==> value-parameter out: Appendable /* = Appendable */ defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations.<init>[ValueParameterDescriptorImpl]

'RenderIrElementVisitor' @ [48:31] ==> public constructor RenderIrElementVisitor() defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[DeserializedClassConstructorDescriptor]

'fileEntry' @ [51:35] ==> public final val fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[PropertyDescriptorImpl]

'getSourceRangeInfo' @ [51:45] ==> public abstract fun getSourceRangeInfo(beginOffset: Int, endOffset: Int): SourceRangeInfo defined in org.jetbrains.kotlin.ir.SourceManager.FileEntry[DeserializedSimpleFunctionDescriptor]

'element' @ [51:64] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations.visitElement[ValueParameterDescriptorImpl]

'startOffset' @ [51:72] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'element' @ [51:85] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations.visitElement[ValueParameterDescriptorImpl]

'endOffset' @ [51:93] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'printer' @ [52:13] ==> public final val printer: Printer defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[PropertyDescriptorImpl]

'println' @ [52:21] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'sourceRangeInfo' @ [52:33] ==> val sourceRangeInfo: SourceRangeInfo defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations.visitElement[LocalVariableDescriptor]

'render' @ [52:49] ==> private final fun SourceRangeInfo.render(): String defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[SimpleFunctionDescriptorImpl]

'element' @ [52:61] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations.visitElement[ValueParameterDescriptorImpl]

'accept' @ [52:69] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<String, Nothing?>, data: Nothing?): String defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> String
    <D> -> Nothing?

'elementRenderer' @ [52:76] ==> public final val elementRenderer: RenderIrElementVisitor defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[PropertyDescriptorImpl]

'printer' @ [53:13] ==> public final val printer: Printer defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[PropertyDescriptorImpl]

'pushIndent' @ [53:21] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'element' @ [54:13] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [54:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [54:40] ==> <this> defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[LazyClassReceiverParameterDescriptor]

'printer' @ [55:13] ==> public final val printer: Printer defined in org.jetbrains.kotlin.ir.AbstractIrSourceRangesTestCase.DumpSourceLocations[PropertyDescriptorImpl]

'popIndent' @ [55:21] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'if (startLineNumber == endLineNumber)
                    "$startLineNumber:$startColumnNumber..$endColumnNumber"
                else
                    "$startLineNumber:$startColumnNumber..$endLineNumber:$endColumnNumber"' @ [59:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'startLineNumber' @ [59:21] ==> public final val startLineNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'endLineNumber' @ [59:40] ==> public final val endLineNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'startLineNumber' @ [60:23] ==> public final val startLineNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'startColumnNumber' @ [60:40] ==> public final val startColumnNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'endColumnNumber' @ [60:60] ==> public final val endColumnNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'startLineNumber' @ [62:23] ==> public final val startLineNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'startColumnNumber' @ [62:40] ==> public final val startColumnNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'endLineNumber' @ [62:60] ==> public final val endLineNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

'endColumnNumber' @ [62:75] ==> public final val endColumnNumber: Int defined in org.jetbrains.kotlin.ir.SourceRangeInfo[DeserializedPropertyDescriptor]

