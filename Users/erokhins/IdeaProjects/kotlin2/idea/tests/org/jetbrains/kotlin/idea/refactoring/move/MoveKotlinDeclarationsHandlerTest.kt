'KotlinMultiFileTestCase' @ [36:43] ==> public constructor KotlinMultiFileTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[ClassConstructorDescriptorImpl]

'getTestDataPathBase' @ [37:57] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'testDataPath' @ [42:22] ==> protected for synthetic extension final val MoveKotlinDeclarationsHandlerTest.testDataPath: String[MyPropertyDescriptor]

'testRoot' @ [42:35] ==> protected for synthetic extension final val MoveKotlinDeclarationsHandlerTest.testRoot: String[MyPropertyDescriptor]

'getTestName' @ [42:46] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[JavaMethodDescriptor]

'createTestProjectStructure' @ [43:35] ==> public open fun createTestProjectStructure(p0: (Project..Project?), p1: (Module..Module?), p2: (String..String?), p3: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p4: Boolean): (VirtualFile..VirtualFile?) defined in com.intellij.testFramework.PsiTestUtil[JavaMethodDescriptor]

'myProject' @ [43:62] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[JavaPropertyDescriptor]

'myModule' @ [43:73] ==> protected/*protected and package*/ final var myModule: (Module..Module?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[JavaPropertyDescriptor]

'path' @ [43:83] ==> val path: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.doTest[LocalVariableDescriptor]

'myFilesToDelete' @ [43:106] ==> protected/*protected static*/ final val myFilesToDelete: (MutableCollection<(File..File?)>..Collection<(File..File?)>?) defined in com.intellij.testFramework.PlatformTestCase[JavaPropertyDescriptor]

'prepareProject' @ [44:9] ==> protected open fun prepareProject(rootDir: VirtualFile): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [44:24] ==> val rootDir: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.doTest[LocalVariableDescriptor]

'getInstance' @ [45:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'myProject' @ [45:40] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[JavaPropertyDescriptor]

'commitAllDocuments' @ [45:51] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'invoke' @ [46:9] ==> public abstract operator fun invoke(rootDir: @ParameterName VirtualFile, handler: @ParameterName MoveKotlinDeclarationsHandler): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'rootDir' @ [46:16] ==> val rootDir: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.doTest[LocalVariableDescriptor]

'MoveKotlinDeclarationsHandler' @ [46:25] ==> public constructor MoveKotlinDeclarationsHandler() defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedClassConstructorDescriptor]

'rootDir' @ [49:71] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getPsiDirectory[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [49:79] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'path' @ [49:102] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getPsiDirectory[ValueParameterDescriptorImpl]

'toPsiDirectory' @ [49:110] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [49:125] ==> public final val MoveKotlinDeclarationsHandlerTest.project: (Project..Project?)[MyPropertyDescriptor]

'rootDir' @ [51:66] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getPsiFile[ValueParameterDescriptorImpl]

'findFileByRelativePath' @ [51:74] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'path' @ [51:97] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getPsiFile[ValueParameterDescriptorImpl]

'toPsiFile' @ [51:105] ==> public fun VirtualFile.toPsiFile(project: Project): PsiFile? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'project' @ [51:115] ==> public final val MoveKotlinDeclarationsHandlerTest.project: (Project..Project?)[MyPropertyDescriptor]

'getElementsAtCarets' @ [53:73] ==> private final fun getElementsAtCarets(rootDir: VirtualFile, path: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [53:93] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementAtCaret[ValueParameterDescriptorImpl]

'path' @ [53:102] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementAtCaret[ValueParameterDescriptorImpl]

'single' @ [53:108] ==> public fun <T> List<PsiElement>.single(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getPsiFile' @ [56:20] ==> private final fun getPsiFile(rootDir: VirtualFile, path: String): PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [56:31] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementsAtCarets[ValueParameterDescriptorImpl]

'path' @ [56:40] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementsAtCarets[ValueParameterDescriptorImpl]

'!!' @ [57:24] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Document?): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Document

'getInstance' @ [57:44] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'getDocument' @ [57:58] ==> @Nullable public abstract fun getDocument(@NotNull p0: VirtualFile): Document? defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'file' @ [57:70] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementsAtCarets[LocalVariableDescriptor]

'virtualFile' @ [57:75] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'document' @ [58:16] ==> val document: Document defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementsAtCarets[LocalVariableDescriptor]

'extractMultipleMarkerOffsets' @ [58:25] ==> public fun Document.extractMultipleMarkerOffsets(project: Project, caretMarker: String = ...): List<Int> defined in org.jetbrains.kotlin.idea.test[SimpleFunctionDescriptorImpl]

'project' @ [58:54] ==> public final val MoveKotlinDeclarationsHandlerTest.project: (Project..Project?)[MyPropertyDescriptor]

'map' @ [58:63] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> PsiElement

'file' @ [58:69] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementsAtCarets[LocalVariableDescriptor]

'findElementAt' @ [58:74] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'it' @ [58:88] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.getElementsAtCarets.<anonymous>[ValueParameterDescriptorImpl]

'doTest' @ [61:31] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [62:33] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [62:51] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testObjectLiteral.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [62:71] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtObjectDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtObjectDeclaration

'assert' @ [63:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [63:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [63:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testObjectLiteral.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [63:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [63:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'objectDeclaration' @ [63:53] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testObjectLiteral.<anonymous>[LocalVariableDescriptor]

'doTest' @ [66:28] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [67:21] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [67:39] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalClass.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [67:59] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'assert' @ [68:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [68:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [68:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [68:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [68:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'klass' @ [68:53] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalClass.<anonymous>[LocalVariableDescriptor]

'doTest' @ [71:26] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [72:24] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [72:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalFun.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [72:62] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedFunction

'assert' @ [73:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [73:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [73:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalFun.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [73:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [73:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'function' @ [73:53] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalFun.<anonymous>[LocalVariableDescriptor]

'doTest' @ [76:26] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [77:24] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [77:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalVal.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [77:62] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'assert' @ [78:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [78:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [78:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalVal.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [78:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [78:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'property' @ [78:53] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testLocalVal.<anonymous>[LocalVariableDescriptor]

'doTest' @ [81:27] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [82:24] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [82:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMemberFun.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [82:62] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedFunction

'assert' @ [83:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [83:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [83:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMemberFun.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [83:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [83:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'function' @ [83:53] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMemberFun.<anonymous>[LocalVariableDescriptor]

'doTest' @ [86:27] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [87:24] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [87:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMemberVal.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [87:62] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'assert' @ [88:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [88:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [88:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMemberVal.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [88:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [88:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'property' @ [88:53] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMemberVal.<anonymous>[LocalVariableDescriptor]

'doTest' @ [91:29] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [92:21] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [92:39] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClass.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [92:59] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'assert' @ [93:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [93:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [93:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [93:32] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'klass' @ [93:52] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClass.<anonymous>[LocalVariableDescriptor]

'doTest' @ [96:28] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [97:21] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [97:39] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testInnerClass.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [97:59] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'assert' @ [98:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [98:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testInnerClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [98:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [98:32] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'klass' @ [98:52] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testInnerClass.<anonymous>[LocalVariableDescriptor]

'doTest' @ [101:31] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [102:21] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [102:39] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClass.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [102:59] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'assert' @ [103:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [103:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [103:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [103:32] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'klass' @ [103:52] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClass.<anonymous>[LocalVariableDescriptor]

'doTest' @ [106:29] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [107:24] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [107:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelFun.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [107:62] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedFunction

'assert' @ [108:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [108:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelFun.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [108:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [108:32] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'function' @ [108:52] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelFun.<anonymous>[LocalVariableDescriptor]

'doTest' @ [111:29] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementAtCaret' @ [112:24] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [112:42] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelVal.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [112:62] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'assert' @ [113:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [113:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelVal.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [113:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [113:32] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'property' @ [113:52] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelVal.<anonymous>[LocalVariableDescriptor]

'doTest' @ [116:39] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementsAtCarets' @ [117:23] ==> private final fun getElementsAtCarets(rootDir: VirtualFile, path: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [117:43] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleNestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [117:63] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KtClass): List<KtClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtClass

'it' @ [117:69] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleNestedClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [117:72] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'assert' @ [118:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [118:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleNestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [118:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'classes' @ [118:32] ==> val classes: List<KtClass> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleNestedClasses.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [118:40] ==> public inline fun <reified T> Collection<KtClass>.toTypedArray(): Array<KtClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtClass

'doTest' @ [121:40] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementsAtCarets' @ [122:23] ==> private final fun getElementsAtCarets(rootDir: VirtualFile, path: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [122:43] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedAndTopLevelClass.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [122:63] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KtClass): List<KtClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtClass

'it' @ [122:69] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedAndTopLevelClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [122:72] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'assert' @ [123:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [123:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [123:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedAndTopLevelClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [123:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'classes' @ [123:33] ==> val classes: List<KtClass> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedAndTopLevelClass.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [123:41] ==> public inline fun <reified T> Collection<KtClass>.toTypedArray(): Array<KtClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtClass

'doTest' @ [126:46] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementsAtCarets' @ [127:28] ==> private final fun getElementsAtCarets(rootDir: VirtualFile, path: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [127:48] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [127:68] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtNamedDeclaration

'it' @ [127:74] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [127:77] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'assert' @ [128:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [128:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [128:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'declarations' @ [128:32] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarations.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [128:45] ==> public inline fun <reified T> Collection<KtNamedDeclaration>.toTypedArray(): Array<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtNamedDeclaration

'doTest' @ [131:62] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'listOf' @ [132:28] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'flatMap' @ [133:18] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<PsiElement>): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PsiElement

'getElementsAtCarets' @ [133:28] ==> private final fun getElementsAtCarets(rootDir: VirtualFile, path: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [133:48] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [133:57] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [134:18] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtNamedDeclaration

'it' @ [134:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [134:27] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'assert' @ [135:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [135:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [135:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'declarations' @ [135:32] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [135:45] ==> public inline fun <reified T> Collection<KtNamedDeclaration>.toTypedArray(): Array<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtNamedDeclaration

'listOf' @ [137:21] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [137:51] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> PsiFile): List<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PsiFile

'getPsiFile' @ [137:57] ==> private final fun getPsiFile(rootDir: VirtualFile, path: String): PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [137:68] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [137:77] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [138:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [138:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [138:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'files' @ [138:32] ==> val files: List<PsiFile> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentFiles.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [138:38] ==> public inline fun <reified T> Collection<PsiFile>.toTypedArray(): Array<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiFile

'doTest' @ [141:61] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'listOf' @ [142:28] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'flatMap' @ [143:18] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<PsiElement>): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PsiElement

'getElementsAtCarets' @ [143:28] ==> private final fun getElementsAtCarets(rootDir: VirtualFile, path: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [143:48] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [143:57] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [144:18] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtNamedDeclaration

'it' @ [144:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [144:27] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'assert' @ [145:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [145:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [145:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [145:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'declarations' @ [145:33] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [145:46] ==> public inline fun <reified T> Collection<KtNamedDeclaration>.toTypedArray(): Array<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtNamedDeclaration

'listOf' @ [147:21] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [147:63] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> PsiFile): List<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PsiFile

'getPsiFile' @ [147:69] ==> private final fun getPsiFile(rootDir: VirtualFile, path: String): PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [147:80] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [147:89] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [148:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [148:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [148:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [148:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'files' @ [148:33] ==> val files: List<PsiFile> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testMultipleTopLevelDeclarationsInDifferentDirs.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [148:39] ==> public inline fun <reified T> Collection<PsiFile>.toTypedArray(): Array<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiFile

'doTest' @ [151:45] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'getElementsAtCarets' @ [152:24] ==> private final fun getElementsAtCarets(rootDir: VirtualFile, path: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [152:44] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testFileAndTopLevelDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [152:64] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtNamedDeclaration

'it' @ [152:70] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testFileAndTopLevelDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [152:73] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'getPsiFile' @ [153:24] ==> private final fun getPsiFile(rootDir: VirtualFile, path: String): PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [153:35] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testFileAndTopLevelDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [154:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [154:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [154:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testFileAndTopLevelDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [154:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elements' @ [154:33] ==> val elements: List<{NavigatablePsiElement & PsiNamedElement}> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testFileAndTopLevelDeclarations.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [154:42] ==> public inline fun <reified T> Collection<{NavigatablePsiElement & PsiNamedElement}>.toTypedArray(): Array<{NavigatablePsiElement & PsiNamedElement}> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> {NavigatablePsiElement & PsiNamedElement}

'doTest' @ [157:31] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'arrayOf' @ [158:30] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'getElementAtCaret' @ [158:50] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [158:68] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [158:88] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'!!' @ [160:29] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiPackage?): PsiPackage[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiPackage

'getInstance' @ [160:43] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [160:55] ==> public final val MoveKotlinDeclarationsHandlerTest.project: (Project..Project?)[MyPropertyDescriptor]

'findPackage' @ [160:64] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'assert' @ [161:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [161:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [161:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [161:32] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[LocalVariableDescriptor]

'targetPackage' @ [161:48] ==> val targetPackage: PsiPackage defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[LocalVariableDescriptor]

'getPsiDirectory' @ [163:31] ==> private final fun getPsiDirectory(rootDir: VirtualFile, path: String): PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [163:47] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [164:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [164:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [164:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [164:32] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[LocalVariableDescriptor]

'targetDirectory' @ [164:48] ==> val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[LocalVariableDescriptor]

'getPsiFile' @ [166:26] ==> private final fun getPsiFile(rootDir: VirtualFile, path: String): PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [166:37] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [167:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [167:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [167:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [167:32] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[LocalVariableDescriptor]

'targetFile' @ [167:48] ==> val targetFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testCommonTargets.<anonymous>[LocalVariableDescriptor]

'doTest' @ [170:38] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'arrayOf' @ [171:30] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'getElementAtCaret' @ [171:50] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [171:68] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [171:88] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'getPsiFile' @ [172:26] ==> private final fun getPsiFile(rootDir: VirtualFile, path: String): PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [172:37] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'targetFile' @ [174:30] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'declarations' @ [174:41] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'firstIsInstance' @ [174:54] ==> public inline fun <reified T> Iterable<*>.firstIsInstance(): KtClass defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtClass

'assert' @ [175:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'topLevelTarget' @ [175:16] ==> val topLevelTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'name' @ [175:31] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'assert' @ [176:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [176:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [176:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [176:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [176:33] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'topLevelTarget' @ [176:49] ==> val topLevelTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'targetFile' @ [178:32] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'declarations' @ [178:43] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'first' @ [178:56] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.first(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [178:64] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [178:67] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'assert' @ [179:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [179:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [179:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [179:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [179:33] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'annotationTarget' @ [179:49] ==> val annotationTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'topLevelTarget' @ [181:28] ==> val topLevelTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'declarations' @ [181:43] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'firstIsInstance' @ [181:56] ==> public inline fun <reified T> Iterable<*>.firstIsInstance(): KtClass defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtClass

'assert' @ [182:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nestedTarget' @ [182:16] ==> val nestedTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'name' @ [182:29] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'assert' @ [183:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [183:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [183:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [183:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [183:33] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'nestedTarget' @ [183:49] ==> val nestedTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testTopLevelClassToClass.<anonymous>[LocalVariableDescriptor]

'doTest' @ [186:36] ==> private final fun doTest(action: (rootDir: VirtualFile, handler: MoveKotlinDeclarationsHandler) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'arrayOf' @ [187:30] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'getElementAtCaret' @ [187:50] ==> private final fun getElementAtCaret(rootDir: VirtualFile, path: String): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [187:68] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [187:88] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'getPsiFile' @ [188:26] ==> private final fun getPsiFile(rootDir: VirtualFile, path: String): PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest[SimpleFunctionDescriptorImpl]

'rootDir' @ [188:37] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'targetFile' @ [190:30] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'declarations' @ [190:41] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'firstIsInstance' @ [190:54] ==> public inline fun <reified T> Iterable<*>.firstIsInstance(): KtClass defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtClass

'assert' @ [191:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'topLevelTarget' @ [191:16] ==> val topLevelTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'name' @ [191:31] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'assert' @ [192:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [192:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [192:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [192:32] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'topLevelTarget' @ [192:48] ==> val topLevelTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'targetFile' @ [194:32] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'declarations' @ [194:43] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'first' @ [194:56] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.first(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [194:64] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [194:67] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'assert' @ [195:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [195:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'handler' @ [195:17] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [195:25] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [195:33] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'annotationTarget' @ [195:49] ==> val annotationTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'topLevelTarget' @ [197:28] ==> val topLevelTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'declarations' @ [197:43] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'firstIsInstance' @ [197:56] ==> public inline fun <reified T> Iterable<*>.firstIsInstance(): KtClass defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtClass

'assert' @ [198:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nestedTarget' @ [198:16] ==> val nestedTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'name' @ [198:29] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'assert' @ [199:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handler' @ [199:16] ==> value-parameter handler: MoveKotlinDeclarationsHandler defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [199:24] ==> public open fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [199:32] ==> val elementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

'nestedTarget' @ [199:48] ==> val nestedTarget: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.MoveKotlinDeclarationsHandlerTest.testNestedClassToClass.<anonymous>[LocalVariableDescriptor]

