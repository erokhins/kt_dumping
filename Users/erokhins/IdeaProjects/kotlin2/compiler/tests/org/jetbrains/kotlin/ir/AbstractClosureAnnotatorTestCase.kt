'AbstractIrGeneratorTestCase' @ [31:51] ==> public constructor AbstractIrGeneratorTestCase() defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[ClassConstructorDescriptorImpl]

'wholeFile' @ [33:19] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTest[ValueParameterDescriptorImpl]

'parentFile' @ [33:29] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'shouldIgnoreErrors' @ [34:28] ==> internal final fun shouldIgnoreErrors(wholeFile: File): Boolean defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[SimpleFunctionDescriptorImpl]

'wholeFile' @ [34:47] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTest[ValueParameterDescriptorImpl]

'component1' @ [35:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CodegenTestCase.TestFile, IrFile>.component1(): CodegenTestCase.TestFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestFile
    <V> -> IrFile

'component2' @ [35:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CodegenTestCase.TestFile, IrFile>.component2(): IrFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestFile
    <V> -> IrFile

'generateIrFilesAsSingleModule' @ [35:36] ==> protected final fun generateIrFilesAsSingleModule(testFiles: List<CodegenTestCase.TestFile>, ignoreErrors: Boolean): Map<CodegenTestCase.TestFile, IrFile> defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase[SimpleFunctionDescriptorImpl]

'testFiles' @ [35:66] ==> value-parameter testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTest[ValueParameterDescriptorImpl]

'ignoreErrors' @ [35:77] ==> val ignoreErrors: Boolean defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTest[LocalVariableDescriptor]

'doTestIrFileAgainstExpectations' @ [36:13] ==> private final fun doTestIrFileAgainstExpectations(dir: File, testFile: CodegenTestCase.TestFile, irFile: IrFile): Unit defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase[SimpleFunctionDescriptorImpl]

'dir' @ [36:45] ==> val dir: (File..File?) defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTest[LocalVariableDescriptor]

'testFile' @ [36:50] ==> val testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTest[LocalVariableDescriptor]

'irFile' @ [36:60] ==> val irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTest[LocalVariableDescriptor]

'File' @ [41:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [41:33] ==> value-parameter dir: File defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'testFile' @ [41:38] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'name' @ [41:47] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'replace' @ [41:52] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'renderClosures' @ [42:30] ==> private final fun renderClosures(irFile: IrFile): String defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase[SimpleFunctionDescriptorImpl]

'irFile' @ [42:45] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTestIrFileAgainstExpectations[ValueParameterDescriptorImpl]

'assertEqualsToFile' @ [43:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedFile' @ [43:44] ==> val expectedFile: File defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'actualClosures' @ [43:58] ==> val actualClosures: String defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.doTestIrFileAgainstExpectations[LocalVariableDescriptor]

'StringWriter' @ [47:34] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'PrintWriter' @ [48:25] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'actualStringWriter' @ [48:37] ==> val actualStringWriter: StringWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'irFile' @ [50:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [50:16] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'AbstractClosureAnnotator' @ [50:44] ==> public constructor AbstractClosureAnnotator() defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[DeserializedClassConstructorDescriptor]

'actualOut' @ [52:17] ==> val actualOut: PrintWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'println' @ [52:27] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'classDescriptor' @ [52:56] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.recordClassClosure[ValueParameterDescriptorImpl]

'name' @ [52:72] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'printClosure' @ [53:17] ==> private final fun printClosure(closure: Closure): Unit defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>[SimpleFunctionDescriptorImpl]

'closure' @ [53:30] ==> value-parameter closure: Closure defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.recordClassClosure[ValueParameterDescriptorImpl]

'actualOut' @ [54:17] ==> val actualOut: PrintWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'println' @ [54:27] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'if (functionDescriptor is ConstructorDescriptor) {
                    actualOut.println("Closure for constructor ${functionDescriptor.containingDeclaration.name}:")
                }
                else {
                    actualOut.println("Closure for function ${functionDescriptor.name}:")
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'functionDescriptor' @ [58:21] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.recordFunctionClosure[ValueParameterDescriptorImpl]

'actualOut' @ [59:21] ==> val actualOut: PrintWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'println' @ [59:31] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'functionDescriptor' @ [59:66] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.recordFunctionClosure[ValueParameterDescriptorImpl]

'containingDeclaration' @ [59:85] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'name' @ [59:107] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'actualOut' @ [62:21] ==> val actualOut: PrintWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'println' @ [62:31] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'functionDescriptor' @ [62:63] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.recordFunctionClosure[ValueParameterDescriptorImpl]

'name' @ [62:82] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'printClosure' @ [64:17] ==> private final fun printClosure(closure: Closure): Unit defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>[SimpleFunctionDescriptorImpl]

'closure' @ [64:30] ==> value-parameter closure: Closure defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.recordFunctionClosure[ValueParameterDescriptorImpl]

'actualOut' @ [65:17] ==> val actualOut: PrintWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'println' @ [65:27] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'closure' @ [69:17] ==> value-parameter closure: Closure defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.printClosure[ValueParameterDescriptorImpl]

'capturedValues' @ [69:25] ==> public final val capturedValues: List<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.Closure[DeserializedPropertyDescriptor]

'forEach' @ [69:40] ==> @HidesMembers public inline fun <T> Iterable<ValueDescriptor>.forEach(action: (ValueDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueDescriptor

'actualOut' @ [70:21] ==> val actualOut: PrintWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'println' @ [70:31] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'it' @ [70:53] ==> value-parameter it: ValueDescriptor defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures.<no name provided>.printClosure.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [70:56] ==> public final val ValueDescriptor.name: Name[MyPropertyDescriptor]

'actualStringWriter' @ [75:16] ==> val actualStringWriter: StringWriter defined in org.jetbrains.kotlin.ir.AbstractClosureAnnotatorTestCase.renderClosures[LocalVariableDescriptor]

'toString' @ [75:35] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

