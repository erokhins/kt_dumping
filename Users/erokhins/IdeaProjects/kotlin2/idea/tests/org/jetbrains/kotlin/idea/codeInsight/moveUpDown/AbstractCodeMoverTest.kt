'AbstractCodeMoverTest' @ [41:44] ==> public constructor AbstractCodeMoverTest() defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest[ClassConstructorDescriptorImpl]

'doTest' @ [43:9] ==> private final fun doTest(path: String, defaultMoverClass: Class<out StatementUpDownMover>): Unit defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest[SimpleFunctionDescriptorImpl]

'path' @ [43:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTestClassBodyDeclaration[ValueParameterDescriptorImpl]

'KotlinDeclarationMover' @ [43:22] ==> public constructor KotlinDeclarationMover() defined in org.jetbrains.kotlin.idea.codeInsight.upDownMover.KotlinDeclarationMover[JavaClassConstructorDescriptor]

'java' @ [43:52] ==> public val <T> KClass<KotlinDeclarationMover>.java: Class<KotlinDeclarationMover> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinDeclarationMover

'doTest' @ [47:9] ==> private final fun doTest(path: String, defaultMoverClass: Class<out StatementUpDownMover>): Unit defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest[SimpleFunctionDescriptorImpl]

'path' @ [47:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTestExpression[ValueParameterDescriptorImpl]

'KotlinExpressionMover' @ [47:22] ==> public constructor KotlinExpressionMover() defined in org.jetbrains.kotlin.idea.codeInsight.upDownMover.KotlinExpressionMover[JavaClassConstructorDescriptor]

'java' @ [47:51] ==> public val <T> KClass<KotlinExpressionMover>.java: Class<KotlinExpressionMover> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinExpressionMover

'doTest' @ [51:9] ==> protected final fun doTest(path: String, isApplicableChecker: (isApplicableExpected: Boolean, direction: String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest[SimpleFunctionDescriptorImpl]

'path' @ [51:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest[ValueParameterDescriptorImpl]

'getExtensions' @ [52:37] ==> @NotNull public open fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(StatementUpDownMover..StatementUpDownMover?)>): (Array<(StatementUpDownMover..StatementUpDownMover?)>..Array<out (StatementUpDownMover..StatementUpDownMover?)>) defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StatementUpDownMover

'STATEMENT_UP_DOWN_MOVER_EP' @ [52:72] ==> public final val STATEMENT_UP_DOWN_MOVER_EP: (ExtensionPointName<(StatementUpDownMover..StatementUpDownMover?)>..ExtensionPointName<(StatementUpDownMover..StatementUpDownMover?)>?) defined in com.intellij.codeInsight.editorActions.moveUpDown.StatementUpDownMover[JavaPropertyDescriptor]

'MoveInfo' @ [53:45] ==> public constructor MoveInfo() defined in com.intellij.codeInsight.editorActions.moveUpDown.StatementUpDownMover.MoveInfo[JavaClassConstructorDescriptor]

'movers' @ [54:31] ==> val movers: (Array<(StatementUpDownMover..StatementUpDownMover?)>..Array<out (StatementUpDownMover..StatementUpDownMover?)>) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [54:38] ==> public inline fun <T> Array<out (StatementUpDownMover..StatementUpDownMover?)>.firstOrNull(predicate: ((StatementUpDownMover..StatementUpDownMover?)) -> Boolean): StatementUpDownMover? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.editorActions.moveUpDown.StatementUpDownMover..com.intellij.codeInsight.editorActions.moveUpDown.StatementUpDownMover?)

'it' @ [55:17] ==> value-parameter it: (StatementUpDownMover..StatementUpDownMover?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'checkAvailable' @ [55:20] ==> public abstract fun checkAvailable(@NotNull p0: Editor, @NotNull p1: PsiFile, @NotNull p2: StatementUpDownMover.MoveInfo, p3: Boolean): Boolean defined in com.intellij.codeInsight.editorActions.moveUpDown.StatementUpDownMover[JavaMethodDescriptor]

'getEditor' @ [55:68] ==> protected/*protected static*/ open fun getEditor(): (Editor..Editor?) defined in com.intellij.testFramework.LightPlatformCodeInsightTestCase[JavaMethodDescriptor]

'getFile' @ [55:114] ==> protected/*protected static*/ open fun getFile(): (PsiFile..PsiFile?) defined in com.intellij.testFramework.LightPlatformCodeInsightTestCase[JavaMethodDescriptor]

'info' @ [55:125] ==> val info: StatementUpDownMover.MoveInfo defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest.<anonymous>[LocalVariableDescriptor]

'direction' @ [55:131] ==> value-parameter direction: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [56:18] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [58:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in com.intellij.testFramework.LightCodeInsightTestCase[JavaMethodDescriptor]

'defaultMoverClass' @ [58:46] ==> value-parameter defaultMoverClass: Class<out StatementUpDownMover> defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest[ValueParameterDescriptorImpl]

'name' @ [58:64] ==> public final val <T : (Any..Any?)> Class<out StatementUpDownMover>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StatementUpDownMover

'actualMover' @ [58:70] ==> val actualMover: StatementUpDownMover defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest.<anonymous>[LocalVariableDescriptor]

'java' @ [58:89] ==> public val <T> KClass<out StatementUpDownMover>.java: Class<out StatementUpDownMover> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> StatementUpDownMover

'name' @ [58:94] ==> public final val <T : (Any..Any?)> Class<out StatementUpDownMover>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StatementUpDownMover

'assertEquals' @ [59:13] ==> public open fun assertEquals(p0: (String..String?), p1: Boolean, p2: Boolean): Unit defined in com.intellij.testFramework.LightCodeInsightTestCase[JavaMethodDescriptor]

'isApplicableExpected' @ [59:51] ==> value-parameter isApplicableExpected: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [59:73] ==> val info: StatementUpDownMover.MoveInfo defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveStatementTest.doTest.<anonymous>[LocalVariableDescriptor]

'toMove2' @ [59:78] ==> public final var toMove2: (LineRange..LineRange?) defined in com.intellij.codeInsight.editorActions.moveUpDown.StatementUpDownMover.MoveInfo[JavaPropertyDescriptor]

'AbstractCodeMoverTest' @ [64:44] ==> public constructor AbstractCodeMoverTest() defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest[ClassConstructorDescriptorImpl]

'doTest' @ [66:9] ==> protected final fun doTest(path: String, isApplicableChecker: (isApplicableExpected: Boolean, direction: String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveLeftRightTest[SimpleFunctionDescriptorImpl]

'path' @ [66:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractMoveLeftRightTest.doTest[ValueParameterDescriptorImpl]

'LightCodeInsightTestCase' @ [70:40] ==> public constructor LightCodeInsightTestCase() defined in com.intellij.testFramework.LightCodeInsightTestCase[JavaClassConstructorDescriptor]

'super' @ [72:9] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [72:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in com.intellij.testFramework.LightCodeInsightTestCase[JavaMethodDescriptor]

'getApplication' @ [73:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isScriptDependenciesUpdaterDisabled' @ [73:45] ==> public var Application.isScriptDependenciesUpdaterDisabled: Boolean defined in org.jetbrains.kotlin.idea.core.script[DeserializedPropertyDescriptor]

'getApplication' @ [77:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isScriptDependenciesUpdaterDisabled' @ [77:45] ==> public var Application.isScriptDependenciesUpdaterDisabled: Boolean defined in org.jetbrains.kotlin.idea.core.script[DeserializedPropertyDescriptor]

'super' @ [78:9] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [78:15] ==> protected/*protected and package*/ open fun tearDown(): Unit defined in com.intellij.testFramework.LightCodeInsightTestCase[JavaMethodDescriptor]

'configureByFile' @ [82:9] ==> protected/*protected and package*/ open fun configureByFile(@NonNls @NotNull p0: String): Unit defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest[JavaMethodDescriptor]

'path' @ [82:25] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[ValueParameterDescriptorImpl]

'loadFile' @ [84:33] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [84:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [84:47] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[ValueParameterDescriptorImpl]

'?:' @ [85:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'findStringWithPrefixes' @ [85:47] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [85:70] ==> val fileText: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'error' @ [86:28] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'when (direction) {
            "up" -> MoveStatementUpAction()
            "down" -> MoveStatementDownAction()
            "left" -> MoveElementLeftAction()
            "right" -> MoveElementRightAction()
            else -> error("Unknown direction: $direction")
        }' @ [88:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EditorAction, entry1: EditorAction, entry2: EditorAction, entry3: EditorAction, entry4: EditorAction): EditorAction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EditorAction

'direction' @ [88:28] ==> val direction: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'MoveStatementUpAction' @ [89:21] ==> public constructor MoveStatementUpAction() defined in com.intellij.codeInsight.editorActions.moveUpDown.MoveStatementUpAction[JavaClassConstructorDescriptor]

'MoveStatementDownAction' @ [90:23] ==> public constructor MoveStatementDownAction() defined in com.intellij.codeInsight.editorActions.moveUpDown.MoveStatementDownAction[JavaClassConstructorDescriptor]

'MoveElementLeftAction' @ [91:23] ==> public constructor MoveElementLeftAction() defined in com.intellij.codeInsight.editorActions.moveLeftRight.MoveElementLeftAction[JavaClassConstructorDescriptor]

'MoveElementRightAction' @ [92:24] ==> public constructor MoveElementRightAction() defined in com.intellij.codeInsight.editorActions.moveLeftRight.MoveElementRightAction[JavaClassConstructorDescriptor]

'error' @ [93:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'direction' @ [93:48] ==> val direction: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'findStringWithPrefixes' @ [96:56] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [96:79] ==> val fileText: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'isApplicableString' @ [97:36] ==> val isApplicableString: String? defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'isApplicableString' @ [97:66] ==> val isApplicableString: String? defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'invoke' @ [99:9] ==> public abstract operator fun invoke(isApplicableExpected: @ParameterName Boolean, direction: @ParameterName String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'isApplicableExpected' @ [99:29] ==> val isApplicableExpected: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'direction' @ [99:51] ==> val direction: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'invokeAndCheck' @ [101:9] ==> private final fun invokeAndCheck(fileText: String, path: String, action: EditorAction, isApplicableExpected: Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest[SimpleFunctionDescriptorImpl]

'fileText' @ [101:24] ==> val fileText: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'path' @ [101:34] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[ValueParameterDescriptorImpl]

'action' @ [101:40] ==> val action: EditorAction defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'isApplicableExpected' @ [101:48] ==> val isApplicableExpected: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.doTest[LocalVariableDescriptor]

'getSettings' @ [105:52] ==> public open fun getSettings(): (CodeStyleSettings..CodeStyleSettings?) defined in org.jetbrains.kotlin.formatter.FormatSettingsUtil[JavaMethodDescriptor]

'createConfigurator' @ [106:47] ==> public open fun createConfigurator(fileText: (String..String?), settings: (CodeStyleSettings..CodeStyleSettings?)): (SettingsConfigurator..SettingsConfigurator?) defined in org.jetbrains.kotlin.formatter.FormatSettingsUtil[JavaMethodDescriptor]

'fileText' @ [106:66] ==> value-parameter fileText: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[ValueParameterDescriptorImpl]

'codeStyleSettings' @ [106:76] ==> val codeStyleSettings: (CodeStyleSettings..CodeStyleSettings?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'configurator' @ [107:9] ==> val configurator: (SettingsConfigurator..SettingsConfigurator?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'configureSettings' @ [107:22] ==> public open fun configureSettings(): Unit defined in org.jetbrains.kotlin.test.SettingsConfigurator[JavaMethodDescriptor]

'getEditor' @ [110:59] ==> protected/*protected static*/ open fun getEditor(): (Editor..Editor?) defined in com.intellij.testFramework.LightPlatformCodeInsightTestCase[JavaMethodDescriptor]

'getCurrentEditorDataContext' @ [111:64] ==> @NotNull protected/*protected static*/ open fun getCurrentEditorDataContext(): DataContext defined in com.intellij.testFramework.LightPlatformCodeInsightTestCase[JavaMethodDescriptor]

'editor' @ [113:26] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'document' @ [113:33] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'text' @ [113:42] ==> public final val Document.text: String[MyPropertyDescriptor]

'runWriteAction' @ [114:13] ==> public inline fun <T> runWriteAction(crossinline runnable: () -> Unit): Unit defined in com.intellij.openapi.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'action' @ [114:30] ==> value-parameter action: EditorAction defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[ValueParameterDescriptorImpl]

'actionPerformed' @ [114:37] ==> public final fun actionPerformed(p0: (Editor..Editor?), @NotNull p1: DataContext): Unit defined in com.intellij.openapi.editor.actionSystem.EditorAction[JavaMethodDescriptor]

'editor' @ [114:53] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'dataContext' @ [114:61] ==> val dataContext: DataContext defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'editor' @ [116:25] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'document' @ [116:32] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'text' @ [116:41] ==> public final val Document.text: String[MyPropertyDescriptor]

'after' @ [117:37] ==> val after: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'before' @ [117:46] ==> val before: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'assertEquals' @ [119:22] ==> public open fun assertEquals(p0: Boolean, p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'isApplicableExpected' @ [119:35] ==> value-parameter isApplicableExpected: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[ValueParameterDescriptorImpl]

'!' @ [119:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'actionDoesNothing' @ [119:58] ==> val actionDoesNothing: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'isApplicableExpected' @ [121:17] ==> value-parameter isApplicableExpected: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[ValueParameterDescriptorImpl]

'path' @ [122:37] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[ValueParameterDescriptorImpl]

'checkResultByFile' @ [124:21] ==> protected/*protected and package*/ open fun checkResultByFile(@NonNls @NotNull p0: String): Unit defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest[JavaMethodDescriptor]

'afterFilePath' @ [124:39] ==> val afterFilePath: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'assertEqualsToFile' @ [127:37] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: Editor): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [127:56] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'afterFilePath' @ [127:61] ==> val afterFilePath: String defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'editor' @ [127:77] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'codeStyleSettings' @ [132:13] ==> val codeStyleSettings: (CodeStyleSettings..CodeStyleSettings?) defined in org.jetbrains.kotlin.idea.codeInsight.moveUpDown.AbstractCodeMoverTest.invokeAndCheck[LocalVariableDescriptor]

'clearCodeStyleSettings' @ [132:31] ==> public open fun clearCodeStyleSettings(): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettings[JavaMethodDescriptor]

