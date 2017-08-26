'KotlinLightCodeInsightFixtureTestCase' @ [29:41] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'loadBeforeAfterText' @ [33:37] ==> public open fun loadBeforeAfterText(p0: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testPath' @ [33:57] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [35:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[JavaPropertyDescriptor]

'configureByText' @ [35:19] ==> public abstract fun configureByText(@NotNull p0: FileType, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'INSTANCE' @ [35:50] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'parts' @ [35:60] ==> val parts: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'getInstance' @ [37:40] ==> public open fun getInstance(): (ActionManager..ActionManager?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'getAction' @ [37:54] ==> public abstract fun getAction(@NonNls @NotNull p0: String): (AnAction..AnAction?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'actionName' @ [37:64] ==> protected abstract val actionName: String defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[PropertyDescriptorImpl]

'gotoAction' @ [38:9] ==> val gotoAction: CodeInsightActionHandler defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'invoke' @ [38:20] ==> public abstract operator fun invoke(@NotNull p0: Project, @NotNull p1: Editor, @NotNull p2: PsiFile): Unit defined in com.intellij.codeInsight.CodeInsightActionHandler[JavaMethodDescriptor]

'project' @ [38:27] ==> public final val AbstractGotoActionTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [38:36] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[JavaPropertyDescriptor]

'editor' @ [38:46] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [38:54] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[JavaPropertyDescriptor]

'file' @ [38:64] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getInstance' @ [40:51] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'myFixture' @ [40:63] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[JavaPropertyDescriptor]

'project' @ [40:73] ==> public final val JavaCodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'fileEditorManager' @ [41:29] ==> val fileEditorManager: FileEditorManagerEx defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'selectedTextEditor' @ [41:47] ==> public final val FileEditorManagerEx.selectedTextEditor: Editor?[MyPropertyDescriptor]

'editor' @ [41:69] ==> public final val AbstractGotoActionTest.editor: Editor[MyPropertyDescriptor]

'if (currentEditor == editor) {
            val text = myFixture.getDocument(myFixture.file).text
            val afterText = StringBuilder(text).insert(editor.caretModel.offset, "<caret>").toString()

            Assert.assertEquals(parts[1], afterText)
        }
        else {
            val fileOffset = currentEditor.caretModel.offset
            val lineNumber = currentEditor.document.getLineNumber(fileOffset)
            val lineStart = currentEditor.document.getLineStartOffset(lineNumber)
            val lineEnd = currentEditor.document.getLineEndOffset(lineNumber)
            val inLineOffset = fileOffset - lineStart

            val line = currentEditor.document.getText(TextRange(lineStart, lineEnd))
            val withCaret = with(StringBuilder()) {
                append(line)
                insert(inLineOffset, "<caret>")
                toString()
            }

            Assert.assertEquals(parts[1], withCaret)
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'currentEditor' @ [43:13] ==> val currentEditor: Editor defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'editor' @ [43:30] ==> public final val AbstractGotoActionTest.editor: Editor[MyPropertyDescriptor]

'myFixture' @ [44:24] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[JavaPropertyDescriptor]

'getDocument' @ [44:34] ==> public abstract fun getDocument(@NotNull p0: PsiFile): (Document..Document?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'myFixture' @ [44:46] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[JavaPropertyDescriptor]

'file' @ [44:56] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [44:62] ==> public final val Document.text: String[MyPropertyDescriptor]

'StringBuilder' @ [45:29] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'text' @ [45:43] ==> val text: String defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'insert' @ [45:49] ==> public open fun insert(p0: Int, p1: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'editor' @ [45:56] ==> public final val AbstractGotoActionTest.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [45:63] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [45:74] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'toString' @ [45:93] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEquals' @ [47:20] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'parts' @ [47:33] ==> val parts: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'afterText' @ [47:43] ==> val afterText: String defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'currentEditor' @ [50:30] ==> val currentEditor: Editor defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'caretModel' @ [50:44] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [50:55] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'currentEditor' @ [51:30] ==> val currentEditor: Editor defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'document' @ [51:44] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'getLineNumber' @ [51:53] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'fileOffset' @ [51:67] ==> val fileOffset: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'currentEditor' @ [52:29] ==> val currentEditor: Editor defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'document' @ [52:43] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'getLineStartOffset' @ [52:52] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'lineNumber' @ [52:71] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'currentEditor' @ [53:27] ==> val currentEditor: Editor defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'document' @ [53:41] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'getLineEndOffset' @ [53:50] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'lineNumber' @ [53:67] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'fileOffset' @ [54:32] ==> val fileOffset: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'lineStart' @ [54:45] ==> val lineStart: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'currentEditor' @ [56:24] ==> val currentEditor: Editor defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'document' @ [56:38] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'getText' @ [56:47] ==> @NotNull @Contract public open fun getText(@NotNull p0: TextRange): String defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'TextRange' @ [56:55] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'lineStart' @ [56:65] ==> val lineStart: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'lineEnd' @ [56:76] ==> val lineEnd: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'with' @ [57:29] ==> @InlineOnly public inline fun <T, R> with(receiver: StringBuilder /* = StringBuilder */, block: StringBuilder /* = StringBuilder */.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder
    <R> -> String

'StringBuilder' @ [57:34] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'append' @ [58:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'line' @ [58:24] ==> val line: String defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'insert' @ [59:17] ==> public open fun insert(p0: Int, p1: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'inLineOffset' @ [59:24] ==> val inLineOffset: Int defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'toString' @ [60:17] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEquals' @ [63:20] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'parts' @ [63:33] ==> val parts: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'withCaret' @ [63:43] ==> val withCaret: String defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest.doTest[LocalVariableDescriptor]

'getProjectDescriptorFromTestName' @ [67:43] ==> protected final fun getProjectDescriptorFromTestName(): LightProjectDescriptor defined in org.jetbrains.kotlin.idea.navigation.AbstractGotoActionTest[SimpleFunctionDescriptorImpl]

